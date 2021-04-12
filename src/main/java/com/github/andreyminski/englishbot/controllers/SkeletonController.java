package com.github.andreyminski.englishbot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkeletonController {
    @RequestMapping("")
    public String hello() {
        return "Hello, wordl!";
    }
}
