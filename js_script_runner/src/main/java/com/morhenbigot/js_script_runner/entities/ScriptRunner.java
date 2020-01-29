package com.morhenbigot.js_script_runner.entities;

import org.springframework.beans.factory.annotation.Autowired;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ScriptRunner extends Thread {

    @Autowired
    private ScriptEngine scriptEngine;

    synchronized public void run(String script) {

        try {

            scriptEngine.eval(script);
        } catch (ScriptException e) {

            e.printStackTrace();
        }
    }
}
