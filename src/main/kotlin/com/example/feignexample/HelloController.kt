package com.example.feignexample

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(private val client: HelloClient) {
    @GetMapping("/api/hello")
    fun getHello(): HelloMessage {
        return client.getMessage()
    }
}

@FeignClient(value = "hello", url = "https://sandbox.api.service.nhs.uk/hello-world")
interface HelloClient {
    @RequestMapping(method = [RequestMethod.GET], value = ["/hello/world"])
    fun getMessage(): HelloMessage
}

data class HelloMessage(val message: String)
