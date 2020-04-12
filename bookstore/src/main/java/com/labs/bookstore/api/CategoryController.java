package com.labs.bookstore.api;


import com.labs.bookstore.model.Category;
import com.labs.bookstore.services.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    protected final CategoryService categoryService;


    public CategoryController(CategoryService categoryService) {

        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category> findAll() {

        return categoryService.findAll();
    }

    @PostMapping
    public Category save(@RequestBody Category category) {

        return categoryService.save(category);
    }

    @DeleteMapping
    public Category delete(@RequestBody Category category) {

        return categoryService.delete(category);
    }

    @PutMapping("/{id}")
    public Category updateName(@PathVariable Long id, @RequestBody String name) {

        return categoryService.updateName(id, name);
    }

    @GetMapping("/{id}")
    public Category findById(@PathVariable Long id) {

        return categoryService.findById(id);
    }

}
