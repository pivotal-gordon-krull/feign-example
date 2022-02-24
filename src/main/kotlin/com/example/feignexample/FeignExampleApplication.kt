package com.example.feignexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class FeignExampleApplication

fun main(args: Array<String>) {
	runApplication<FeignExampleApplication>(*args)
}
