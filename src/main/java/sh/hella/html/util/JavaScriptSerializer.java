package sh.hella.html.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

/**
 * The type Java script serializer.
 */
public class JavaScriptSerializer extends StdSerializer<String> {
    /**
     * The constant JS_INJECT_PREFIX.
     */
    public static final String JS_INJECT_PREFIX = "_hella_js_inject:";

    /**
     * Instantiates a new Java script serializer.
     */
    public JavaScriptSerializer() {
        this(null);
    }

    /**
     * Instantiates a new Java script serializer.
     *
     * @param t the t
     */
    protected JavaScriptSerializer(Class<String> t) {
        super(t);
    }

    @Override
    public void serialize(String s, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
            throws IOException {
        if (s.startsWith(JS_INJECT_PREFIX)) {
            jsonGenerator.writeRawValue(s.substring(JS_INJECT_PREFIX.length()));
        } else {
            jsonGenerator.writeString(s);
        }
    }
}
