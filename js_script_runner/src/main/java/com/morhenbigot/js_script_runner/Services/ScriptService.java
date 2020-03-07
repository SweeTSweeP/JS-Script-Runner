package com.morhenbigot.js_script_runner.services;

import com.morhenbigot.js_script_runner.entities.ScriptRunner;
import delight.nashornsandbox.NashornSandbox;
import org.springframework.stereotype.Service;

import javax.script.ScriptEngine;

@Service
public class ScriptService {

    private NashornSandbox scriptEngine;

    public ScriptService(NashornSandbox scriptEngine) {
        this.scriptEngine = scriptEngine;
    }

    public Object runScript(String script) {

            try {
                return new ScriptRunner().run(scriptEngine, script);
            } catch (Exception e) {
                return e;
            }
    }
}
