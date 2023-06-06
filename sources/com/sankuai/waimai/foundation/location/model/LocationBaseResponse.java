package com.sankuai.waimai.foundation.location.model;

import android.annotation.SuppressLint;
import android.support.annotation.Keep;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.e;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
@Keep
@SuppressLint({"SerializableCheck"})
/* loaded from: classes4.dex */
public class LocationBaseResponse<D> implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int code;
    public D data;
    public String msg;

    public LocationBaseResponse() {
    }

    public LocationBaseResponse(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "745c4ede358146a696946718d0381775", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "745c4ede358146a696946718d0381775");
            return;
        }
        this.code = i;
        this.msg = str;
    }

    public boolean isSuccess() {
        return this.data != null && this.code == 0;
    }

    public boolean isForbiddenLimited() {
        return this.data != null && this.code == 100;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class LocationBaseResponseDeserializer implements JsonDeserializer<LocationBaseResponse> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public LocationBaseResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a17b0adbe3b00380ad21ffce00cdeb9", RobustBitConfig.DEFAULT_VALUE)) {
                return (LocationBaseResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a17b0adbe3b00380ad21ffce00cdeb9");
            }
            try {
                if (jsonElement.isJsonObject()) {
                    LocationBaseResponse locationBaseResponse = new LocationBaseResponse();
                    JsonObject jsonObject = (JsonObject) jsonElement;
                    if (jsonObject.has("code") && jsonObject.get("code").isJsonPrimitive()) {
                        locationBaseResponse.code = jsonObject.get("code").getAsInt();
                    }
                    if (jsonObject.has("msg") && jsonObject.get("msg").isJsonPrimitive()) {
                        locationBaseResponse.msg = jsonObject.get("msg").getAsString();
                    }
                    if (jsonObject.has("data")) {
                        JsonElement jsonElement2 = jsonObject.get("data");
                        if (type instanceof ParameterizedType) {
                            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                            if (type2.equals(String.class)) {
                                locationBaseResponse.data = (D) jsonElement2.toString();
                            } else if (!jsonElement2.isJsonNull() && (jsonElement2.isJsonObject() || jsonElement2.isJsonArray())) {
                                locationBaseResponse.data = (D) jsonDeserializationContext.deserialize(jsonElement2, type2);
                            }
                        }
                    }
                    return locationBaseResponse;
                }
                return null;
            } catch (Exception e) {
                Object[] objArr2 = {e};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0c31e66ddcc877dbcc91d3e76f8f1036", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0c31e66ddcc877dbcc91d3e76f8f1036");
                } else {
                    e.c().a(e);
                }
                throw e;
            }
        }
    }
}
