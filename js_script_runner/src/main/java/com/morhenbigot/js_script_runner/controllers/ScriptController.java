package com.morhenbigot.js_script_runner.controllers;

import com.morhenbigot.js_script_runner.services.ScriptService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScriptController {

    private ScriptService scriptService;

    ScriptController(ScriptService scriptService) {
        this.scriptService = scriptService;
    }

    @PostMapping("api/script")
    public String runScript(@RequestBody final String script) {

        var result = scriptService.runScript(script);

        if (result == null) {
            return "Script completed successfully but returned null";
        } else {
            return result.toString();
        }
    }
}
