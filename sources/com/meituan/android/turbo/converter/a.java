package com.meituan.android.turbo.converter;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends f {
    public static ChangeQuickRedirect a;
    public static final f b = new a();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.meituan.android.turbo.converter.f
    public final <T> void a(T t, JsonWriter jsonWriter) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {t, jsonWriter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c041876d628ac6a5209a2351862acf44", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c041876d628ac6a5209a2351862acf44");
        } else if (t == null) {
            jsonWriter.nullValue();
        } else {
            f a2 = com.meituan.android.turbo.a.a((Class) t.getClass().getComponentType());
            jsonWriter.beginArray();
            int length = Array.getLength(t);
            for (int i = 0; i < length; i++) {
                Object obj = Array.get(t, i);
                if (obj == null) {
                    jsonWriter.nullValue();
                } else {
                    a2.a((f) obj, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
    }

    @Override // com.meituan.android.turbo.converter.f
    public final <T> T a(Type type, JsonReader jsonReader) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {type, jsonReader};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "052b17b78e32278c6ad2366d86a289d7", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "052b17b78e32278c6ad2366d86a289d7");
        }
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        Type c = com.meituan.android.turbo.b.c(type);
        f a2 = com.meituan.android.turbo.a.a(c);
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(a2.a(c, jsonReader));
        }
        jsonReader.endArray();
        int size = arrayList.size();
        T t = (T) Array.newInstance(com.meituan.android.turbo.b.a(c), size);
        for (int i = 0; i < size; i++) {
            Array.set(t, i, arrayList.get(i));
        }
        return t;
    }

    @Override // com.meituan.android.turbo.converter.f
    public final <T> T a(Type type, JsonElement jsonElement) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {type, jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e634d1807e2c1833e64264b9162aebe6", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e634d1807e2c1833e64264b9162aebe6");
        }
        if (jsonElement.isJsonNull()) {
            return null;
        }
        Type c = com.meituan.android.turbo.b.c(type);
        f a2 = com.meituan.android.turbo.a.a(c);
        JsonArray asJsonArray = jsonElement.getAsJsonArray();
        T t = (T) Array.newInstance(com.meituan.android.turbo.b.a(c), asJsonArray.size());
        for (int i = 0; i < asJsonArray.size(); i++) {
            Array.set(t, i, a2.a(c, asJsonArray.get(i)));
        }
        return t;
    }
}
