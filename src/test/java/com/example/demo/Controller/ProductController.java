package com.example.demo.Controller;


import com.example.demo.Model.Product;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductController {
    @GetMapping("/getProduct")
    public Product getProductOne() {
        Product product = new Product("1", "Tom", 12);


        return product;
    }
    @GetMapping("/getProduct/{id}")
    public Product getProduct(@PathVariable("id") String id) {
        Product product = new Product(id, "Tom", 12);


        return product;
    }

}
