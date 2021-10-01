package sh.hella.html.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;
import org.atteo.classindex.ClassIndex;
import sh.hella.html.document.Model;

public interface GsonFactory {

    @SuppressWarnings({"unchecked", "rawtypes"})
    static Gson get() {
        Iterable<Class<?>> modelTypes = ClassIndex.getAnnotated(SerializableModel.class);
        RuntimeTypeAdapterFactory<Model> runtimeTypeAdapterFactory = RuntimeTypeAdapterFactory.of(Model.class);
        for (Class<?> modelType : modelTypes) {
            runtimeTypeAdapterFactory.registerSubtype((Class<? extends Model<?>>) modelType, modelType.getSimpleName());
        }

        return new GsonBuilder()
                .registerTypeAdapter(String.class, new JavaScriptTypeAdapter())
                .registerTypeAdapterFactory(runtimeTypeAdapterFactory)
                .create();
    }

}
