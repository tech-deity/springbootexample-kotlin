package com.techdeity.springexample.springbootexample

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


//to tell the Spring boot to make this rest Controller
@RestController
//Path for Rest End Point Annotation
@RequestMapping("api/hello")
class HelloWorldControllerExp {
    //to tell this is GET end Point

    @GetMapping("/test")
    fun hello():String{
        return  "This is a Rest EndPoint Test!"
    }
}