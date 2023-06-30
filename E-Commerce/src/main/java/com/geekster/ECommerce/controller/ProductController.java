package com.geekster.ECommerce.controller;

import com.geekster.ECommerce.model.Category;
import com.geekster.ECommerce.model.Product;
import com.geekster.ECommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Map;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    //get all products
    @GetMapping("products")
    public Map<Integer, Product> getProducts(){
        return productService.getProducts();
    }

    //get all products below a perticular range
    @GetMapping("products/price/{price}")
    public List<Product> getProductsBelowPrice(@PathVariable Double price){
        return productService.getAllProductsBelowPrice(price);
    }

    //get all products belonging to a particular category
    @GetMapping("products/category/{category}")
    public <category> List<Product> getProductByCategory(@PathVariable Category category){
        return productService.getProductsByCategory(category);
    }

    //create

    //add a multiple products at the same time

    @PostMapping("products")
    public String addProducts(@RequestBody List<Product> products){
        return productService.addProducts(products);
    }

    //remove a particular product based on product Id
    @DeleteMapping("products/{pId}")
    public String removeProduct(@PathVariable Integer pId){
        return productService.removeProduct(pId);
    }

    //update price of products based on discount
    @PutMapping("products/discount/{discount}")
    public String updateProductByDiscount(@PathVariable Double discount){
        return productService.updateProductByDiscount(discount);
    }


}
