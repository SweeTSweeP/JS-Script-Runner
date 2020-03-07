package com.morhenbigot.js_script_runner.configuration;

import delight.nashornsandbox.NashornSandbox;
import delight.nashornsandbox.NashornSandboxes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

@Configuration
public class ScriptEngineConfigurator {

    private final NashornSandbox scriptEngine;

    public ScriptEngineConfigurator() {

        scriptEngine = NashornSandboxes.create();
    }

    @Bean(name = "scriptEngine")
    public NashornSandbox getScriptEngine() {

        return scriptEngine;
    }
}
