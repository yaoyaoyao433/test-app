package com.meituan.android.turbo.converter;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class m extends f {
    public static ChangeQuickRedirect a;
    public static final f b = new m();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.meituan.android.turbo.converter.f
    public final <T> void a(T t, JsonWriter jsonWriter) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {t, jsonWriter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24c9178ccbfb28a2838cb2ccbb71120f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24c9178ccbfb28a2838cb2ccbb71120f");
        } else if (t == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) t).entrySet()) {
                jsonWriter.name(String.valueOf(entry.getKey()));
                if (entry.getValue() == null) {
                    jsonWriter.nullValue();
                } else {
                    com.meituan.android.turbo.a.a((Class) entry.getValue().getClass()).a((f) entry.getValue(), jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.util.Map] */
    @Override // com.meituan.android.turbo.converter.f
    public final <T> T a(Type type, JsonReader jsonReader) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {type, jsonReader};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7dac953d1092f0a5a77076665fc2966", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7dac953d1092f0a5a77076665fc2966");
        }
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        Class a2 = com.meituan.android.turbo.b.a(type);
        Type[] b2 = com.meituan.android.turbo.b.b(type);
        f a3 = com.meituan.android.turbo.a.a(b2[0]);
        f a4 = com.meituan.android.turbo.a.a(b2[1]);
        ?? r0 = (T) a(a2);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            JsonReaderInternalAccess.INSTANCE.promoteNameToValue(jsonReader);
            r0.put(a3.a(b2[0], jsonReader), a4.a(b2[1], jsonReader));
        }
        jsonReader.endObject();
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.util.Map] */
    @Override // com.meituan.android.turbo.converter.f
    public final <T> T a(Type type, JsonElement jsonElement) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {type, jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78652308b34e8ea8f01454b4f50e7f83", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78652308b34e8ea8f01454b4f50e7f83");
        }
        if (jsonElement.isJsonNull()) {
            return null;
        }
        Class a2 = com.meituan.android.turbo.b.a(type);
        Type[] b2 = com.meituan.android.turbo.b.b(type);
        f a3 = com.meituan.android.turbo.a.a(b2[0]);
        f a4 = com.meituan.android.turbo.a.a(b2[1]);
        ?? r0 = (T) a(a2);
        if (jsonElement.isJsonObject()) {
            for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
                r0.put(a3.a(b2[0], new Gson().toJsonTree(entry.getKey())), a4.a(b2[1], entry.getValue()));
            }
        }
        return r0;
    }

    private Map a(Class cls) throws com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "115243edeb3402417c4366012cba7432", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "115243edeb3402417c4366012cba7432");
        }
        if (cls == Map.class || cls == HashMap.class) {
            return new HashMap();
        }
        if (cls == LinkedHashMap.class) {
            return new LinkedHashMap();
        }
        if (cls.isInterface()) {
            throw new com.meituan.android.turbo.exceptions.a("Can't create instance for: " + cls.getSimpleName());
        }
        try {
            return (Map) cls.newInstance();
        } catch (Exception e) {
            throw new com.meituan.android.turbo.exceptions.a(e);
        }
    }
}
