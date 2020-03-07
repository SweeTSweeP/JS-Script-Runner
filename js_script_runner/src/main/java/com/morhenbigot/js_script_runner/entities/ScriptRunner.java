package com.morhenbigot.js_script_runner.entities;

import delight.nashornsandbox.NashornSandbox;

import javax.script.*;

public class ScriptRunner extends Thread {

    synchronized public Object run(NashornSandbox scriptEngine, String script) {
        try {
            return scriptEngine.eval(script);
        } catch (ScriptException e) {
            return e;
        }
    }
}
