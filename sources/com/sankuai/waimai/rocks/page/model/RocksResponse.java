package com.sankuai.waimai.rocks.page.model;

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
import com.unionpay.tsmservice.data.Constant;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
@Keep
@SuppressLint({"SerializableCheck"})
/* loaded from: classes5.dex */
public class RocksResponse<D> implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int code;
    public D data;
    public String msg;
    public D responseData;

    public RocksResponse() {
    }

    public RocksResponse(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9562ed4079b7324ed554d5f466d3777", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9562ed4079b7324ed554d5f466d3777");
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
    public static class BaseResponseDeserializer implements JsonDeserializer<RocksResponse> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public RocksResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c959d36b966e6384c5cb6a1f1378ebbb", RobustBitConfig.DEFAULT_VALUE)) {
                return (RocksResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c959d36b966e6384c5cb6a1f1378ebbb");
            }
            try {
                if (jsonElement.isJsonObject()) {
                    RocksResponse rocksResponse = new RocksResponse();
                    JsonObject jsonObject = (JsonObject) jsonElement;
                    if (jsonObject.has("code") && jsonObject.get("code").isJsonPrimitive()) {
                        rocksResponse.code = jsonObject.get("code").getAsInt();
                    }
                    if (jsonObject.has("msg") && jsonObject.get("msg").isJsonPrimitive()) {
                        rocksResponse.msg = jsonObject.get("msg").getAsString();
                    }
                    if (jsonObject.has("data")) {
                        JsonElement jsonElement2 = jsonObject.get("data");
                        if (type instanceof ParameterizedType) {
                            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                            if (type2.equals(String.class)) {
                                if ((jsonElement2 instanceof JsonPrimitive) && ((JsonPrimitive) jsonElement2).isString()) {
                                    rocksResponse.data = (D) jsonElement2.getAsString();
                                } else {
                                    rocksResponse.data = (D) jsonElement2.toString();
                                }
                            } else if (!jsonElement2.isJsonNull() && (jsonElement2.isJsonObject() || jsonElement2.isJsonArray())) {
                                rocksResponse.data = (D) jsonDeserializationContext.deserialize(jsonElement2, type2);
                            }
                        }
                    }
                    if (jsonObject.has(Constant.KEY_RESPONSE_DATA)) {
                        JsonElement jsonElement3 = jsonObject.get(Constant.KEY_RESPONSE_DATA);
                        if (type instanceof ParameterizedType) {
                            Type type3 = ((ParameterizedType) type).getActualTypeArguments()[0];
                            if (type3.equals(String.class)) {
                                if ((jsonElement3 instanceof JsonPrimitive) && ((JsonPrimitive) jsonElement3).isString()) {
                                    rocksResponse.responseData = (D) jsonElement3.getAsString();
                                } else {
                                    rocksResponse.responseData = (D) jsonElement3.toString();
                                }
                            } else if (!jsonElement3.isJsonNull() && (jsonElement3.isJsonObject() || jsonElement3.isJsonArray())) {
                                rocksResponse.responseData = (D) jsonDeserializationContext.deserialize(jsonElement3, type3);
                            }
                        }
                    }
                    return rocksResponse;
                }
                return null;
            } catch (Exception e) {
                Object[] objArr2 = {e};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "98f01dd076b95199f5da2e1d141fa0ea", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "98f01dd076b95199f5da2e1d141fa0ea");
                } else {
                    com.sankuai.waimai.foundation.utils.log.a.b(e);
                }
                throw e;
            }
        }
    }
}
