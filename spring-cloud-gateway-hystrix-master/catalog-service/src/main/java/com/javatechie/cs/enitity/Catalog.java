package com.javatechie.cs.enitity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Catalog_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Catalog {
    @Id
    @GeneratedValue
    private int catalogId;
    private String namaBarang;
    private int stock;
    private float price;
    private  String uidCatalog;
}
