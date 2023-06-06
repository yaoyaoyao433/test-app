package com.meituan.android.turbo.converter;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k extends f {
    public static ChangeQuickRedirect a;
    public static final f b = new k();

    @Override // com.meituan.android.turbo.converter.f
    public final <T> void a(T t, JsonWriter jsonWriter) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {t, jsonWriter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ab6b68d67449789b8c97badf14cae1b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ab6b68d67449789b8c97badf14cae1b");
        } else {
            TypeAdapters.JSON_ELEMENT.write(jsonWriter, (JsonElement) t);
        }
    }

    @Override // com.meituan.android.turbo.converter.f
    public final <T> T a(Type type, JsonReader jsonReader) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {type, jsonReader};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c94f41878b15310c72a51b7359fe611e", 6917529027641081856L) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c94f41878b15310c72a51b7359fe611e") : (T) a(type, TypeAdapters.JSON_ELEMENT.read(jsonReader));
    }

    @Override // com.meituan.android.turbo.converter.f
    public final <T> T a(Type type, JsonElement jsonElement) throws IOException, com.meituan.android.turbo.exceptions.a {
        Object[] objArr = {type, jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56761b60653ab32bbbe23338bec3cd38", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56761b60653ab32bbbe23338bec3cd38");
        }
        if (jsonElement.isJsonNull()) {
            return null;
        }
        if (JsonObject.class == type) {
            return (T) jsonElement.getAsJsonObject();
        }
        if (JsonArray.class == type) {
            return (T) jsonElement.getAsJsonArray();
        }
        return JsonPrimitive.class == type ? (T) jsonElement.getAsJsonPrimitive() : jsonElement;
    }
}
