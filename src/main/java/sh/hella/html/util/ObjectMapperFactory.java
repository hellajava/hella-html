package sh.hella.html.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.atteo.classindex.ClassIndex;

public interface ObjectMapperFactory {

    static ObjectMapper get() {
        ObjectMapper objectMapper = new ObjectMapper();
        Iterable<Class<?>> modelTypes = ClassIndex.getAnnotated(SerializableModel.class);
        for (Class<?> modelType : modelTypes) {
            objectMapper.registerSubtypes(modelType);
        }

        SimpleModule module = new SimpleModule();
        module.addSerializer(String.class, new JavaScriptSerializer());
        objectMapper.registerModule(module);
        return objectMapper;
    }

}
