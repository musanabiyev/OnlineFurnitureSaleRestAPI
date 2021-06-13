package com.company.controller;

import com.company.dto.ProductDTO;
import com.company.dto.ResponseDTO;
import com.company.entity.Product;
import com.company.service.inter.ProductServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductRestController {

    @Autowired
    private ProductServiceInter proService;

    @GetMapping("/products")
    public ResponseEntity<ResponseDTO> getUsers(
            @RequestParam(name = "name", required = false) String name) {

        List<Product> pr = proService.getAll(name);

        List<ProductDTO> prDTOS = new ArrayList<>();

        for (int i = 0; i < pr.size(); i++) {
            Product u = pr.get(i);
            prDTOS.add(new ProductDTO(u));
        }

        return ResponseEntity.ok(ResponseDTO.of(prDTOS));
    }


    @GetMapping("/product/{id}")
    public ResponseEntity<ResponseDTO> getProduct(@PathVariable("id") int id) {
        Product product = proService.getById(id);

        return ResponseEntity.ok(ResponseDTO.of(new ProductDTO(product)));
    }

    @DeleteMapping("/product/{id}")
    public ResponseEntity<ResponseDTO> deleteProduct(@PathVariable("id") int id) {
        Product produ = proService.getById(id);
        proService.removeProduct(id);

        return ResponseEntity.ok(ResponseDTO.of(new ProductDTO(produ), "Successfully deleted"));
    }

    @PostMapping("/addproduct")
    public ResponseEntity<ResponseDTO> addProduct(@RequestBody ProductDTO productDto) {
        Product produ = new Product();
        produ.setName(productDto.getName());
        produ.setDescription(productDto.getDescription());
        proService.addProduct(produ);


        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(productDto.getId());
        productDTO.setName(productDto.getName());
        productDTO.setDescription(productDto.getDescription());
        return ResponseEntity.ok(ResponseDTO.of(productDTO, "Successfully added"));
    }


}
