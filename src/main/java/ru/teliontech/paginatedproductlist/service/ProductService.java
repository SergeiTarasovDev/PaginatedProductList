package ru.teliontech.paginatedproductlist.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.teliontech.paginatedproductlist.entity.Product;
import ru.teliontech.paginatedproductlist.exception.IllegalAttributeException;
import ru.teliontech.paginatedproductlist.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
//    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
//        this.productRepository = productRepository;
    }


    public Product getProduct(Integer id) {
        System.out.println("id = " + id);
//        return productRepository.findById(id).orElseThrow();
//        throw new IllegalAttributeException("id not found");
        return null;
    }

    public List<Product> getProducts() {
//        return productRepository.findAll();
        return null;
    }
}
