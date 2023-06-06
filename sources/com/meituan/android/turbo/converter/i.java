package com.meituan.android.turbo.converter;

import com.google.gson.JsonElement;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i extends f {
    public static ChangeQuickRedirect a;
    public static final f b = new i();

    @Override // com.meituan.android.turbo.converter.f
    public final <T> void a(T t, JsonWriter jsonWriter) throws IOException {
        Object[] objArr = {t, jsonWriter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cee843b4e142e63b42dfd6643b08ec4a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cee843b4e142e63b42dfd6643b08ec4a");
        } else {
            jsonWriter.value((Float) t);
        }
    }

    @Override // com.meituan.android.turbo.converter.f
    public final <T> T a(Type type, JsonReader jsonReader) throws IOException {
        Object[] objArr = {type, jsonReader};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2114b4a9b345b1b92e355e62bba31fd6", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2114b4a9b345b1b92e355e62bba31fd6");
        }
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return (T) Float.valueOf((float) jsonReader.nextDouble());
    }

    @Override // com.meituan.android.turbo.converter.f
    public final <T> T a(Type type, JsonElement jsonElement) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {type, jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8378a0b2608ba7ebcf9045b2b9ef8c37", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8378a0b2608ba7ebcf9045b2b9ef8c37");
        }
        if (jsonElement.isJsonNull()) {
            return null;
        }
        return (T) Float.valueOf(jsonElement.getAsFloat());
    }
}
