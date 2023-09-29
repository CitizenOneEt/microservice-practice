package com.microservicepractice.productservice.service;

import com.microservicepractice.productservice.dto.ProductRequest;
import com.microservicepractice.productservice.dto.ProductResponse;
import com.microservicepractice.productservice.model.Product;
import com.microservicepractice.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class ProductService {


    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
   public void createProduct(ProductRequest productRequest){
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();
        productRepository.save(product);
        log.info("Product {} is saved", product.getId());
    }

    public List<ProductResponse> getAllProducts() {
      List<Product> products = productRepository.findAll();
        return products.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(Product p) {
       return ProductResponse.builder()
               .name(p.getName())
               .description(p.getDescription())
               .price(p.getPrice())
               .id(p.getId())
               .build();
    }
}
