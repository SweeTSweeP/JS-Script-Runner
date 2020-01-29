package com.morhenbigot.js_script_runner.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScriptController {

    @GetMapping("/hello")
    public String sayHi() {

        return "Hello";
    }
}
