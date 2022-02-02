package com.nadiahamid.cursomc.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nadiahamid.cursomc.domain.Category;
import com.nadiahamid.cursomc.repository.CategoryRepository;
import com.nadiahamid.cursomc.service.exceptions.ObjectNotFoundException;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repo;

//	public Category find(Integer id) {
//		Optional<Category> obj = repo.findById(id);
//		return obj.orElse(null);
//	}

	public Category find(Integer id) {
		Optional<Category> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Object not found! Id: " + id + ", Type: " + Category.class.getName()));
	}
}
