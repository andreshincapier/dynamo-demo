package com.example.dynamodemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DynamoDBApplication

fun main(args: Array<String>) {
    runApplication<DynamoDBApplication>(*args)
}
