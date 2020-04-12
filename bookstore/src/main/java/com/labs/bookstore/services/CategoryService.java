package com.labs.bookstore.services;


import com.labs.bookstore.model.Category;
import com.labs.bookstore.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository repository;


    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public List<Category> findAll() {
        //lista site
        return repository.findAll();
    }

    public Category save(Category category) {
        //zacuvuva
        return repository.save(category);
    }

    public Category delete(Category category) {
        //bri6e
        repository.delete(category);
        return category;
    }

    public Category updateName(Long id, String name) {

        Category category = repository.findById(id).get();
        category.setName(name);

        return repository.save(category);

    }

    public Category findById(Long id){

        return repository.findById(id).get();
    }
}
