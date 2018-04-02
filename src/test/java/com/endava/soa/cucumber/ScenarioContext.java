package com.endava.soa.cucumber;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {

    private static ScenarioContext instance;

    public synchronized static ScenarioContext getInstance(){
        if (instance==null)
            instance=new ScenarioContext();
        return instance;
    }

    private ScenarioContext(){
        dictionary=new HashMap<String, Object>();
    }

    private int iValue;
    private Map<String,Object> dictionary;

    public int getiValue() {
        return iValue;
    }

    public void setiValue(int iValue) {
        this.iValue = iValue;
    }

    public void add(String key, Object value){
        dictionary.put(key,value);
    }

    public <T> T get(String key){

        return (T)dictionary.get(key);
    }
 }
