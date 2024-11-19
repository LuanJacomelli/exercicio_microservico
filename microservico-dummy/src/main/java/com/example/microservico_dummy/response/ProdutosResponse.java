package com.example.microservico_dummy.response;

import com.example.microservico_dummy.model.ProdutosModel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProdutosResponse {
    private List<ProdutosModel> products;

    public ProdutosResponse() {

    }

    public ProdutosResponse(List<ProdutosModel> products) {
        this.products = products;
    }
}
