package ru.teliontech.paginatedproductlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.teliontech.paginatedproductlist.entity.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

//    @Query("select p.id, p.name, p.price from Product p")
//    List<Product> findAllMy();

}
