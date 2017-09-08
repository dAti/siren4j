package com.google.code.siren4j.component;

import com.google.code.siren4j.component.impl.EntityImpl;

import javax.json.bind.serializer.DeserializationContext;
import javax.json.bind.serializer.JsonbDeserializer;
import javax.json.stream.JsonParser;
import java.lang.reflect.Type;

public class EntityDeserializer implements JsonbDeserializer<Entity> {

    @Override
    public Entity deserialize(JsonParser parser, DeserializationContext deserializationContext, Type runtimeType) {
        return deserializationContext.deserialize(EntityImpl.class, parser);
    }
}
