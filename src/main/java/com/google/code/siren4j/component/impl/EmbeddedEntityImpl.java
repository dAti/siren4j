package com.google.code.siren4j.component.impl;

import com.google.code.siren4j.component.Action;
import com.google.code.siren4j.component.Entity;
import com.google.code.siren4j.component.Link;

import javax.json.bind.annotation.JsonbTransient;
import java.util.List;
import java.util.Map;

/**
 * Entity impl class to mark embedded entity and to allow suppressing of
 * properties on Jackson serialization.
 *
 */
public class EmbeddedEntityImpl extends EntityImpl {

    @Override
    @JsonbTransient
    public Map<String, Object> getProperties() {
        return super.getProperties();
    }

    @Override
    @JsonbTransient
    public List<Entity> getEntities() {
        return super.getEntities();
    }

    @Override
    @JsonbTransient
    public List<Link> getLinks() {
        return super.getLinks();
    }

    @Override
    @JsonbTransient
    public List<Action> getActions() {
        return super.getActions();
    }

    

}
