package com.morhenbigot.js_script_runner.configuration;

import delight.nashornsandbox.NashornSandbox;
import delight.nashornsandbox.NashornSandboxes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.Executors;

@Configuration
public class ScriptEngineConfigurator {

    private final NashornSandbox scriptEngine;

    public ScriptEngineConfigurator() {

        scriptEngine = NashornSandboxes.create();
    }

    @Bean(name = "scriptEngine")
    public NashornSandbox getScriptEngine() {

        scriptEngine.setMaxCPUTime(15000);
        //scriptEngine.setMaxMemory(50*1024);
        scriptEngine.allowNoBraces(false);
        scriptEngine.setMaxPreparedStatements(30);
        scriptEngine.setExecutor(Executors.newSingleThreadExecutor());

        return scriptEngine;
    }
}
