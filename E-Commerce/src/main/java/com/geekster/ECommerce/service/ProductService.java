package com.geekster.ECommerce.service;


import com.geekster.ECommerce.model.Category;
import com.geekster.ECommerce.model.Product;
import com.geekster.ECommerce.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    public Map<Integer, Product> getProducts(){
        return productRepo.getProductList();
    }
    //adding products
    public String addProducts(List<Product> products){
        Map<Integer,Product> productList = getProducts();

        for(Product product : products){
            productList.put(product.getProductId(),product);
        }

        return "products are added !!!";
    }

    //geting product by applying filter

    public List<Product> getAllProductsBelowPrice(Double price){
        List<Product> priceFilteredProducts = new ArrayList<>();
        Map<Integer,Product> productList = getProducts();
        for(Integer id : productList.keySet()){
            if(productList.get(id).getProductPrice() <= price){
                priceFilteredProducts.add(productList.get(id));
            }
        }

        return priceFilteredProducts;
    }

    public List<Product> getProductsByCategory(Category category){

        List<Product> categoryFilteredProducts = new ArrayList<>();
        Map<Integer , Product> productList = getProducts();

        for(Integer id : productList.keySet()){
            if(productList.get(id).getProductCategory().equals(category)){
                categoryFilteredProducts.add(productList.get(id));
            }
        }

        return categoryFilteredProducts;
    }

    public String removeProduct(Integer pId){
        Map<Integer , Product> productList = getProducts();
        Product product = productList.get(pId);
        if(product != null){
            productList.remove(pId);
            return pId + " removed!!!";
        }
        else{
            return pId + " not found!!!";
        }
    }

    public String updateProductByDiscount(Double discount){
        Map<Integer , Product> productList = getProducts();
        for(Integer id : productList.keySet()){
            Double actualPrice = productList.get(id).getProductPrice();
            Double discountedPrice = actualPrice*(1-(discount/(100.0)));
            productList.get(id).setProductPrice(discountedPrice);
        }

        return "Price updated with discount!!!";
    }
}
