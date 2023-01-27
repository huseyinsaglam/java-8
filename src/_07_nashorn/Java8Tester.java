package _07_nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Java8Tester {

    public static void main(String[] args) {

        ScriptEngineManager engineManager = new ScriptEngineManager();
        ScriptEngine nashorn = engineManager.getEngineByName("nashorn");


        String name = "TestDeneme";
        Integer result = null;

        try {
            nashorn.eval("print('" + name + "')");
            result = (Integer) nashorn.eval("10 + 2");
        } catch (ScriptException ex){
            System.out.println("Error executing script: "+ ex.getMessage());
        }

        System.out.println(result.toString());
    }
}
