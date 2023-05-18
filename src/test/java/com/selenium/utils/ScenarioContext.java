package com.selenium.utils;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {

    Map<String, Object> scenariocontext;

    public ScenarioContext(){
        scenariocontext = new HashMap<>();
    }

    public Object getScenariocontext(String key) {
       Object object =scenariocontext.get(key);
       return object;
    }

    public void setScenariocontext(String key, Object object) {
        scenariocontext.put(key, object);
    }





}
