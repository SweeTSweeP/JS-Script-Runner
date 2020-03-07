package com.morhenbigot.js_script_runner;

import com.morhenbigot.js_script_runner.entities.ScriptRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.script.Invocable;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Arrays;

@SpringBootApplication
public class JsScriptRunnerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(JsScriptRunnerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Arrays.stream(args).forEach(System.out::println);
    }
}
