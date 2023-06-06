package com.sankuai.waimai.platform.capacity.network.retrofit;

import android.annotation.SuppressLint;
import android.support.annotation.Keep;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
@Keep
@SuppressLint({"SerializableCheck"})
/* loaded from: classes5.dex */
public class BaseResponse<D> implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int code;
    public D data;
    public String msg;

    public BaseResponse() {
    }

    public BaseResponse(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2102d344b6c87046dfdc0482e0fccf99", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2102d344b6c87046dfdc0482e0fccf99");
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
    /* loaded from: classes5.dex */
    public static class BaseResponseDeserializer implements JsonDeserializer<BaseResponse> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public BaseResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aba0272671a6313fd979fe948099c8e3", RobustBitConfig.DEFAULT_VALUE)) {
                return (BaseResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aba0272671a6313fd979fe948099c8e3");
            }
            try {
                if (jsonElement.isJsonObject()) {
                    BaseResponse baseResponse = new BaseResponse();
                    JsonObject jsonObject = (JsonObject) jsonElement;
                    if (jsonObject.has("code") && jsonObject.get("code").isJsonPrimitive()) {
                        baseResponse.code = jsonObject.get("code").getAsInt();
                    }
                    if (jsonObject.has("msg") && jsonObject.get("msg").isJsonPrimitive()) {
                        baseResponse.msg = jsonObject.get("msg").getAsString();
                    }
                    if (jsonObject.has("data")) {
                        JsonElement jsonElement2 = jsonObject.get("data");
                        if (type instanceof ParameterizedType) {
                            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                            if (type2.equals(String.class)) {
                                if ((jsonElement2 instanceof JsonPrimitive) && ((JsonPrimitive) jsonElement2).isString()) {
                                    baseResponse.data = (D) jsonElement2.getAsString();
                                } else {
                                    baseResponse.data = (D) jsonElement2.toString();
                                }
                            } else if (!jsonElement2.isJsonNull() && (jsonElement2.isJsonObject() || jsonElement2.isJsonArray())) {
                                baseResponse.data = (D) jsonDeserializationContext.deserialize(jsonElement2, type2);
                            }
                        }
                    }
                    return baseResponse;
                }
                return null;
            } catch (Exception e) {
                Object[] objArr2 = {e};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e40b4b91cde2405925f2dc12e46e174", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e40b4b91cde2405925f2dc12e46e174");
                } else {
                    com.sankuai.waimai.foundation.utils.log.a.b(e);
                }
                throw e;
            }
        }
    }
}
