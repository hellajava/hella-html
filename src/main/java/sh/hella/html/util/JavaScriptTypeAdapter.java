package sh.hella.html.util;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class JavaScriptTypeAdapter extends TypeAdapter<String> {
    public static final String JS_INJECT_PREFIX = "_hella_js_inject:";

    @Override
    public void write(JsonWriter jsonWriter, String str) throws IOException {
        if (str.startsWith(JS_INJECT_PREFIX)) {
            jsonWriter.jsonValue(str.substring(JS_INJECT_PREFIX.length()));
        } else {
            jsonWriter.value(str);
        }
    }

    @Override
    public String read(JsonReader jsonReader) throws IOException {
        return jsonReader.nextString();
    }
}
