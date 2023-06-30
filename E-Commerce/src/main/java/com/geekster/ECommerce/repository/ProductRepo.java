package com.geekster.ECommerce.repository;

import com.geekster.ECommerce.model.Product;
import com.geekster.ECommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.parsing.Problem;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Map;

@Repository
public class ProductRepo {

    @Autowired
    Map<Integer, Product> products;

    public Map<Integer, Product> getProductList(){
        return products;
    }
}
