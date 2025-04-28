package com.serie.spring_ci_cd

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringCiCdApplication

fun main(args: Array<String>) {
	runApplication<SpringCiCdApplication>(*args)
}
