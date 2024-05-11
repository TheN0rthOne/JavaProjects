package com.example.learningspringboot.controller;

import com.example.learningspringboot.dto.SearchProductRequestBody;
import com.example.learningspringboot.dto.SearchProductResponseBody;
import com.example.learningspringboot.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
@Tag(name = "контроллер товаров", description = "просмотр каталога и поиск товара и тд")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    @Operation(summary = "поиск в каталоге")
    public SearchProductResponseBody search(@RequestBody SearchProductRequestBody body){
        return productService.searchProduct(body);
    }
}
