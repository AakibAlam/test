package com.test.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.products.entity.Product;
import com.test.products.entity.User;
import com.test.products.service.ProductService;
import com.test.products.service.UserService;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String getHome(Model model) {
        List<Product> products = productService.getProducts();
        model.addAttribute("products", products);
        return "home";
    }

    @GetMapping("/addUser")
    public String getProduct(Model model) {
        model.addAttribute("products", new Product());
        return "add";
    }

    @GetMapping("/addProduct")
    public String getUser(Model model) {
        model.addAttribute("products", new User());
        return "add";
    }

    @PostMapping("/user")
    public String addProduct(@ModelAttribute("Product") Product product) {
        productService.addProduct(product);
        return "redirect:/";
    }

    @PostMapping("/product")
    public String addUser(@ModelAttribute("User") User user) {
        userService.addUser(user);
        return "redirect:/";
    }
 
}