package com.sankuai.waimai.business.page.home.upload;

import android.support.annotation.Keep;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.log.a;
import java.lang.reflect.Type;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class LocationUploadResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int code;
    private JSONObject location;
    private String msg;

    public LocationUploadResponse() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4dc0866243a3a2b7561a7100b36b2722", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4dc0866243a3a2b7561a7100b36b2722");
        } else {
            this.code = -1;
        }
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public JSONObject getLocation() {
        return this.location;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class LocationUploadDeserializer implements JsonDeserializer<LocationUploadResponse> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public LocationUploadResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56fd63fa7328de0961745a616bc61b4d", RobustBitConfig.DEFAULT_VALUE)) {
                return (LocationUploadResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56fd63fa7328de0961745a616bc61b4d");
            }
            if (jsonElement.isJsonObject()) {
                LocationUploadResponse locationUploadResponse = new LocationUploadResponse();
                JsonObject jsonObject = (JsonObject) jsonElement;
                if (jsonObject.has("code") && jsonObject.get("code").isJsonPrimitive()) {
                    locationUploadResponse.code = jsonObject.get("code").getAsInt();
                }
                if (jsonObject.has("msg") && jsonObject.get("msg").isJsonPrimitive()) {
                    locationUploadResponse.msg = jsonObject.get("msg").getAsString();
                }
                if (jsonObject.has("data") && jsonObject.get("data").isJsonObject()) {
                    try {
                        locationUploadResponse.location = new JSONObject(jsonObject.get("data").toString()).getJSONObject("location");
                    } catch (JSONException e) {
                        a.a(e);
                    }
                }
                return locationUploadResponse;
            }
            return null;
        }
    }
}
