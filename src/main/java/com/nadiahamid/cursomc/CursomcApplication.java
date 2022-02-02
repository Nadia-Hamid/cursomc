package com.nadiahamid.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nadiahamid.cursomc.domain.Category;
import com.nadiahamid.cursomc.repository.CategoryRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepo;;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Category c1 = new Category(1, "Informática");
		Category c2 = new Category(2, "Escritório");
		Category c3 = new Category(3, "Escola");

		categoryRepo.saveAll(Arrays.asList(c1, c2, c3));
	}
}
