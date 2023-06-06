package com.meituan.passport.converter;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.meituan.passport.exception.ApiException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
import java.io.IOException;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f<T> extends g<T> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.passport.converter.g
    public final /* bridge */ /* synthetic */ Object a(ap apVar) throws IOException {
        return super.a(apVar);
    }

    public f(Gson gson, TypeAdapter typeAdapter, Type type) {
        super(gson, typeAdapter, type);
        Object[] objArr = {gson, typeAdapter, type};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2240c3075e35c1f244bfdaa16547183", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2240c3075e35c1f244bfdaa16547183");
        }
    }

    @Override // com.meituan.passport.converter.g
    public final T a(JsonElement jsonElement) throws IOException {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48c462f6c6741a1d938ca1f63db0cfd7", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48c462f6c6741a1d938ca1f63db0cfd7");
        }
        if (!jsonElement.isJsonObject()) {
            throw new IOException("Parse exception converting JSON to object", new JsonParseException("Root is not JsonObject"));
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        if (asJsonObject.has("status") && asJsonObject.get("status").getAsInt() == 1) {
            return (T) this.c.fromJson(asJsonObject, this.e);
        }
        b(asJsonObject.get("error"));
        throw new IOException("Fail to get data");
    }

    @Override // com.meituan.passport.converter.g
    public final void b(JsonElement jsonElement) throws ApiException {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b48abb7e95df4aeabed21946ffac13d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b48abb7e95df4aeabed21946ffac13d");
        } else if (jsonElement.isJsonObject()) {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            if (asJsonObject.has("data")) {
                throw new ApiException(asJsonObject.get("message").getAsString(), asJsonObject.get("code").getAsInt(), asJsonObject.has("type") ? asJsonObject.get("type").getAsString() : "", asJsonObject.get("data").toString());
            } else if (asJsonObject.has("verifyUrl")) {
                throw new ApiException(asJsonObject.get("message").getAsString(), asJsonObject.get("code").getAsInt(), "", asJsonObject.get("verifyUrl").getAsString());
            } else {
                throw new ApiException(asJsonObject.get("message").getAsString(), asJsonObject.get("code").getAsInt(), asJsonObject.has("type") ? asJsonObject.get("type").getAsString() : "");
            }
        }
    }
}
