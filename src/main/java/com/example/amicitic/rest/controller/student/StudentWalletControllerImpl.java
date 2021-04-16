package com.example.amicitic.rest.controller.student;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student/{id}/wallet")
public record StudentWalletControllerImpl() implements StudentWalletController {

    @Override
    @GetMapping
    public double get(@PathVariable long id) {
        return 0;
    }

    @Override
    @PostMapping
    public double send(@PathVariable long id, @RequestBody double coins) {
        return 0;
    }
}
