package com.javatechie.cs.repository;

import com.javatechie.cs.enitity.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogRepository extends JpaRepository<Catalog,Integer> {
}
