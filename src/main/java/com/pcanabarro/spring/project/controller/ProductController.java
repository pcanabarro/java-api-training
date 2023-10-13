package com.pcanabarro.spring.project.controller;

import com.pcanabarro.spring.project.entities.Product;
import com.pcanabarro.spring.project.repos.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductRepository repository;
    @GetMapping("/")
    public List<Product> getProducts() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProduct(@PathVariable int id) {
        return repository.findById(id);
    }

    @PostMapping("/create")
    public String createProduct(@RequestBody Product p) {
        repository.save(p);
        return "Created " + p.toString();
    }

    @PutMapping("/{id}")
    public Product updateProduct(@RequestBody Product p) {
        return repository.save(p);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id) {
        repository.deleteById(id);
        return "Id deleted: " + id;
    }
}
