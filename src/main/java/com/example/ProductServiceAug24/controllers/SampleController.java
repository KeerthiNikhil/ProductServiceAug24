package com.example.ProductServiceAug24.controllers;

import com.example.ProductServiceAug24.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    //Endpoint name: GET /hello
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello,World";
    }
    //Endpoint name: GET /hello/{name}
    @GetMapping("/hello/{name}")
    public String helloWithName(@PathVariable ("name")String name) throws ProductNotFoundException {
        if(name.equals("Keerthi")){
            throw new ProductNotFoundException("Keerthi is not a product");
        }
        return "Hello:"+name;
    }
    //Endpoint name: GET /show/{showId}/seat/{seatId}
    @GetMapping("/show/{showId}/seat/{seatId}")
    public String bmsExample(@PathVariable("showId") String showId, @PathVariable("seatId") String seatId) {
        return "Hello:"+showId+" "+seatId;
    }

}


