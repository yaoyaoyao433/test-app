package com.sankuai.waimai.addrsdk.mvp.bean;

import android.support.annotation.Keep;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.lang.reflect.Type;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class AddressSearchResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("msg")
    public String msg;
    @SerializedName(alternate = {"data"}, value = "result")
    public AddressSearchResult result;
    @SerializedName("source")
    public String source;
    @SerializedName(alternate = {"code"}, value = "status")
    public int status;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Deserializer implements JsonDeserializer<AddressSearchResponse> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public AddressSearchResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dda77a35a640179b9b270b5fb3843abd", RobustBitConfig.DEFAULT_VALUE)) {
                return (AddressSearchResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dda77a35a640179b9b270b5fb3843abd");
            }
            if (jsonElement.isJsonObject()) {
                try {
                    return fromJson(new JSONObject(jsonElement.toString()));
                } catch (Exception unused) {
                    return null;
                }
            }
            return null;
        }

        private AddressSearchResponse fromJson(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "144635702e3c481b0868ebfcf0de789d", RobustBitConfig.DEFAULT_VALUE)) {
                return (AddressSearchResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "144635702e3c481b0868ebfcf0de789d");
            }
            if (jSONObject == null) {
                return null;
            }
            return new AddressSearchResponse();
        }
    }
}
