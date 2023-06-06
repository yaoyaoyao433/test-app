package com.sankuai.eh.component.service.tools;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class EHCommonTypeAdapterFactory implements TypeAdapterFactory {
    public static ChangeQuickRedirect a;

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Object[] objArr = {gson, typeToken};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af3e1f3fe1ff7fe1d163780674b47c75", RobustBitConfig.DEFAULT_VALUE)) {
            return (TypeAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af3e1f3fe1ff7fe1d163780674b47c75");
        }
        final TypeAdapter<T> delegateAdapter = gson.getDelegateAdapter(this, typeToken);
        return new TypeAdapter<T>() { // from class: com.sankuai.eh.component.service.tools.EHCommonTypeAdapterFactory.1
            public static ChangeQuickRedirect a;

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, T t) throws IOException {
                Object[] objArr2 = {jsonWriter, t};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "53bdd05062a4a3bb20191ef0a88ba617", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "53bdd05062a4a3bb20191ef0a88ba617");
                } else {
                    delegateAdapter.write(jsonWriter, t);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public T read(JsonReader jsonReader) throws IOException {
                Object[] objArr2 = {jsonReader};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ffde42c5f43d604b1785e2e9ed4f9404", RobustBitConfig.DEFAULT_VALUE)) {
                    return (T) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ffde42c5f43d604b1785e2e9ed4f9404");
                }
                try {
                    return (T) delegateAdapter.read(jsonReader);
                } catch (Exception e) {
                    d.a(e);
                    if (jsonReader.hasNext()) {
                        if (jsonReader.peek() == JsonToken.NAME) {
                            jsonReader.nextName();
                            return null;
                        }
                        jsonReader.skipValue();
                        return null;
                    }
                    return null;
                }
            }
        };
    }
}
