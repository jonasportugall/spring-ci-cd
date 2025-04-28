package com.serie.spring_ci_cd.service

import com.serie.spring_ci_cd.entity.Product
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductService {

    fun getAll(): ResponseEntity<Any> {
        val products = listOf(
            Product(UUID.randomUUID(), "Produto A", 10.99),
            Product(UUID.randomUUID(), "Produto B", 20.49),
            Product(UUID.randomUUID(), "Produto C", 5.75)
        )
        return ResponseEntity.ok(products)
    }
}