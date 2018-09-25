package com.atomist.springrestseed

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringRestSeedApplication

fun main(args: Array<String>) {
    runApplication<SpringRestSeedApplication>(*args)
}
