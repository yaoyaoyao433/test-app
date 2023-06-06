package com.sankuai.waimai.store.repository.deserializer;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.BaseResponse;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class BaseResponseDeserializer implements JsonDeserializer<BaseResponse> {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Type inference failed for: r12v3, types: [D, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4, types: [D, java.lang.String] */
    @Override // com.google.gson.JsonDeserializer
    public /* synthetic */ BaseResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Object[] objArr = {jsonElement, type, jsonDeserializationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9356fe92f5cefdfd23328613152ebbbf", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9356fe92f5cefdfd23328613152ebbbf");
        }
        if (jsonElement.isJsonObject()) {
            BaseResponse baseResponse = new BaseResponse();
            JsonObject jsonObject = (JsonObject) jsonElement;
            if (jsonObject.has("code") && jsonObject.get("code").isJsonPrimitive()) {
                baseResponse.code = jsonObject.get("code").getAsInt();
            }
            if (jsonObject.has("msg") && jsonObject.get("msg").isJsonPrimitive()) {
                baseResponse.msg = jsonObject.get("msg").getAsString();
            }
            if (jsonObject.has("subCodeString") && jsonObject.get("subCodeString").isJsonPrimitive()) {
                baseResponse.subCodeString = jsonObject.get("subCodeString").getAsString();
            }
            if (jsonObject.has("data")) {
                JsonElement jsonElement2 = jsonObject.get("data");
                if (type instanceof ParameterizedType) {
                    Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                    if (type2.equals(String.class)) {
                        baseResponse.data = jsonElement2.toString();
                    } else if (!jsonElement2.isJsonNull() && (jsonElement2.isJsonObject() || jsonElement2.isJsonArray())) {
                        baseResponse.data = jsonDeserializationContext.deserialize(jsonElement2, type2);
                    }
                }
            }
            return baseResponse;
        }
        return null;
    }
}
