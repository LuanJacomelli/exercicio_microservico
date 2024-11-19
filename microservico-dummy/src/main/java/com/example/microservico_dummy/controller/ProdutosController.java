package com.example.microservico_dummy.controller;

import com.example.microservico_dummy.business.ProdutosBusiness;
import com.example.microservico_dummy.model.ProdutosModel;
import com.example.microservico_dummy.response.ProdutosResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutosController {

    private ProdutosBusiness produtosBusiness = new ProdutosBusiness();

    @Value("${URL_API}")
    private String apiUrl;

    @GetMapping("/teste")
    public String testeServico() {
        return "Servico de Pe";
    }

    @GetMapping("/consulta")
    public List<ProdutosModel> consultaProdutos() {

        RestTemplate restTemplate = new RestTemplate();
        ProdutosResponse response = restTemplate.getForObject(apiUrl, ProdutosResponse.class);

        if (response != null) {
            produtosBusiness.testandoBuiness();
            return response.getProducts();
        } else {
            throw new RuntimeException("Falha ao consultar produtos.");
        }
    }

}
