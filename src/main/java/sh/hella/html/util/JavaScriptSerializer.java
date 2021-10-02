package sh.hella.html.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class JavaScriptSerializer extends StdSerializer<String> {
    public static final String JS_INJECT_PREFIX = "_hella_js_inject:";

    public JavaScriptSerializer() {
        this(null);
    }

    protected JavaScriptSerializer(Class<String> t) {
        super(t);
    }

    @Override
    public void serialize(String s, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (s.startsWith(JS_INJECT_PREFIX)) {
            jsonGenerator.writeRawValue(s.substring(JS_INJECT_PREFIX.length()));
        } else {
            jsonGenerator.writeString(s);
        }
    }
}
