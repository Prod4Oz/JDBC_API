package ru.netilogy.jdbc_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.netilogy.jdbc_api.service.Service;

import java.util.List;
@RestController
public class Controller {
    Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/products/fetch-product")
    @ResponseBody
    public List<String> getProduct(@RequestParam("name") String name) {
        return service.getProducts(name);
    }
}
