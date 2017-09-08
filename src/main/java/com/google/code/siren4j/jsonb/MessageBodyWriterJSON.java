package com.google.code.siren4j.jsonb;

import com.google.code.siren4j.Siren4J;
import com.google.code.siren4j.component.impl.EntityImpl;

import javax.json.bind.Jsonb;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

@Provider
@Produces(Siren4J.JSON_MEDIATYPE)
public class MessageBodyWriterJSON implements MessageBodyWriter<EntityImpl> {

    public boolean isWriteable(Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
        return true;
    }

    public long getSize(EntityImpl entity, Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
        return -1;
    }

    public void writeTo(EntityImpl entity, Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, Object> multivaluedMap, OutputStream outputStream) throws IOException, WebApplicationException {
        Jsonb jsonb = JsonUtility.getJsonbBuilder();
        jsonb.toJson(entity, outputStream);
    }
}
