package com.sankuai.waimai.platform.domain.manager.location.model;

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
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SaveCategoryResponse implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("code")
    public int b;
    @SerializedName("msg")
    public String c;
    public String d;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class Deserializer implements JsonDeserializer<SaveCategoryResponse> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public SaveCategoryResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70dfb67dd8cc995ca4ecf4c270a60eff", RobustBitConfig.DEFAULT_VALUE)) {
                return (SaveCategoryResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70dfb67dd8cc995ca4ecf4c270a60eff");
            }
            if (jsonElement.isJsonObject()) {
                try {
                    return SaveCategoryResponse.a(new JSONObject(jsonElement.toString()));
                } catch (JSONException e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                    return null;
                }
            }
            return null;
        }
    }

    public static SaveCategoryResponse a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a9d7f81c693ad7ced1f305d36bea50a", RobustBitConfig.DEFAULT_VALUE)) {
            return (SaveCategoryResponse) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a9d7f81c693ad7ced1f305d36bea50a");
        }
        try {
            SaveCategoryResponse saveCategoryResponse = new SaveCategoryResponse();
            saveCategoryResponse.b = jSONObject.optInt("code", -1);
            saveCategoryResponse.c = jSONObject.optString("msg", "");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                saveCategoryResponse.d = optJSONObject.optString("category_icon");
            }
            return saveCategoryResponse;
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return null;
        }
    }
}
