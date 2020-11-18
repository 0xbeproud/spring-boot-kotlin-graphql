package com.nnobs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootKotlinGraphqlApplication

fun main(args: Array<String>) {
    runApplication<SpringBootKotlinGraphqlApplication>(*args)
}
