package com.google.code.siren4j.component.impl;

import com.google.code.siren4j.jsonb.JsonUtility;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.annotation.JsonbProperty;

public abstract class Siren4JBaseComponent {

    @JsonbProperty(value = "class")
    protected String[] componentClass;

    public String[] getComponentClass() {
        return componentClass;
    }

    public void setComponentClass(String[] componentClass) {
        this.componentClass = componentClass;
    }

    @Override
    public String toString() {
        Jsonb jsonb = JsonUtility.getJsonbBuilder();
        return jsonb.toJson(this);
    }
}
