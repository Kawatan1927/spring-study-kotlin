package com.example.springstudykotlin.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloController {
    @GetMapping("/", "/hello")
    fun hello(): String {
        return "hello"
    }
}
