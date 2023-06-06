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
public final class c extends f {
    public static ChangeQuickRedirect a;
    public static final f b = new c();

    @Override // com.meituan.android.turbo.converter.f
    public final <T> void a(T t, JsonWriter jsonWriter) throws IOException {
        Object[] objArr = {t, jsonWriter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb186e0975ab4418210bfe7fd2731951", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb186e0975ab4418210bfe7fd2731951");
        } else {
            jsonWriter.value((Byte) t);
        }
    }

    @Override // com.meituan.android.turbo.converter.f
    public final <T> T a(Type type, JsonReader jsonReader) throws IOException {
        Object[] objArr = {type, jsonReader};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adacb47c1c6db61917a201307dae4fd4", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adacb47c1c6db61917a201307dae4fd4");
        }
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return (T) Byte.valueOf((byte) jsonReader.nextInt());
    }

    @Override // com.meituan.android.turbo.converter.f
    public final <T> T a(Type type, JsonElement jsonElement) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {type, jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "133afeaac7fd07178021ae1efa9c4e12", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "133afeaac7fd07178021ae1efa9c4e12");
        }
        if (jsonElement.isJsonNull()) {
            return null;
        }
        return (T) Byte.valueOf(jsonElement.getAsByte());
    }
}
