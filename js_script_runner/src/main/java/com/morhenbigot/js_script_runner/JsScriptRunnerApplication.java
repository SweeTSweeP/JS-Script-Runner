package com.morhenbigot.js_script_runner;

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

        var jsEngine = (Invocable) new ScriptEngineManager().getEngineByName("nashorn");

        try {

            String script = "var list = [1, 2, 3, 4, 5];" +
                    "var result = '';" +
                    "for each (var i in list) {" +
                    "result+=i+'-';" +
                    "};" +
                    "print(result);";

            var result = jsEngine.invokeFunction(script);

            var i = 0;
        } catch (final ScriptException se) {

            se.printStackTrace();
        }
    }
}
