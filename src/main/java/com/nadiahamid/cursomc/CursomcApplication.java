package com.nadiahamid.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nadiahamid.cursomc.domain.Category;
import com.nadiahamid.cursomc.domain.Product;
import com.nadiahamid.cursomc.repository.CategoryRepository;
import com.nadiahamid.cursomc.repository.ProductRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepo;

	@Autowired
	private ProductRepository productRepo;;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Category c1 = new Category(null, "Data");
		Category c2 = new Category(null, "Office");
		Category c3 = new Category(null, "School");

		Product p1 = new Product(null, "Computer", 3200.00);
		Product p2 = new Product(null, "Chair", 1000.00);
		Product p3 = new Product(null, "notebook", 50.00);

		c1.getProducts().addAll(Arrays.asList(p1, p2));
		c2.getProducts().addAll(Arrays.asList(p2));
		c3.getProducts().addAll(Arrays.asList(p3));

		p1.getCategories().addAll(Arrays.asList(c1));
		p2.getCategories().addAll(Arrays.asList(c1, c2));
		p3.getCategories().addAll(Arrays.asList(c3));

		categoryRepo.saveAll(Arrays.asList(c1, c2, c3));
		productRepo.saveAll(Arrays.asList(p1, p2, p3));
	}
}
