package com.serie.spring_ci_cd.controller

import com.serie.spring_ci_cd.service.ProductService
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController(private val productService: ProductService){

    @GetMapping("/")
    fun welcome(): String {
        return "PROJECT RUNNINGG SUCCESSFUL"
    }


    @GetMapping("/products")
    fun getAll():ResponseEntity<Any>{
        return productService.getAll()
    }

}