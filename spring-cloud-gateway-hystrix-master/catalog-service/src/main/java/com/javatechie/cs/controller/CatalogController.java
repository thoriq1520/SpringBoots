package com.javatechie.cs.controller;


import com.javatechie.cs.enitity.Catalog;
import com.javatechie.cs.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class CatalogController {
    @Autowired
    private CatalogService service;

    @PostMapping("/doCatalog")
    public Catalog doCatalog(@RequestBody Catalog catalog){
        return service.doCatalog(catalog);
    }
}
