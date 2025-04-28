package com.serie.spring_ci_cd.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.*

@Entity
@Table(name="products")
data class Product(
    @Id
    var id: UUID? = null,
    var name: String = "",
    var price:Double = 0.0
)
