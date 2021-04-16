package com.example.amicitic.rest.controller.tutor;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tutor/{id}/wallet")
public record TutorWalletControllerImpl() implements TutorWalletController {

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
