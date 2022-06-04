package com.javatechie.cs.service;

import com.javatechie.cs.enitity.Catalog;
import com.javatechie.cs.repository.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CatalogService {
    @Autowired
    private CatalogRepository repository;

    public Catalog doCatalog(Catalog catalog){
        catalog.setUidCatalog(UUID.randomUUID().toString());
        return repository.save(catalog);
    }
}
