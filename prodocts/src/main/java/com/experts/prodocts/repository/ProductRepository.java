package com.experts.prodocts.repository;

import com.experts.prodocts.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
