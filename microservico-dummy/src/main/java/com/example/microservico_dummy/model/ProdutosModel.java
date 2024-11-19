package com.example.microservico_dummy.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProdutosModel {

    private int id;
    private String title;
    private String description;
    private double price;
    private int stock;
    private List<String> tags;

}
