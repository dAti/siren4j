package com.google.code.siren4j.jsonb;

import com.google.code.siren4j.Siren4J;
import com.google.code.siren4j.component.EntityDeserializer;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import javax.json.bind.config.PropertyOrderStrategy;
import java.util.Locale;

public class JsonUtility {

    public static Jsonb getJsonbBuilder() {
        Locale locale = Locale.getDefault();

        EntityDeserializer entityDeserializer = new EntityDeserializer();

        JsonbConfig config = new JsonbConfig()
                .withFormatting(true)
                .withPropertyOrderStrategy(PropertyOrderStrategy.ANY)
                .withDeserializers(entityDeserializer)
                .withDateFormat(Siren4J.ISO8601_DATE_FORMAT, locale);

        return JsonbBuilder.create(config);
    }
}
