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
public final class l extends f {
    public static ChangeQuickRedirect a;
    public static final f b = new l();

    @Override // com.meituan.android.turbo.converter.f
    public final <T> void a(T t, JsonWriter jsonWriter) throws IOException {
        Object[] objArr = {t, jsonWriter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "430d9bd54550d20edd152be9f9f06961", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "430d9bd54550d20edd152be9f9f06961");
        } else {
            jsonWriter.value((Long) t);
        }
    }

    @Override // com.meituan.android.turbo.converter.f
    public final <T> T a(Type type, JsonReader jsonReader) throws IOException {
        Object[] objArr = {type, jsonReader};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08b2f772843502e432c3ca936cf989c9", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08b2f772843502e432c3ca936cf989c9");
        }
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return (T) Long.valueOf(jsonReader.nextLong());
    }

    @Override // com.meituan.android.turbo.converter.f
    public final <T> T a(Type type, JsonElement jsonElement) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {type, jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "970ddec59f5b208d22032f022b066468", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "970ddec59f5b208d22032f022b066468");
        }
        if (jsonElement.isJsonNull()) {
            return null;
        }
        return (T) Long.valueOf(jsonElement.getAsLong());
    }
}
