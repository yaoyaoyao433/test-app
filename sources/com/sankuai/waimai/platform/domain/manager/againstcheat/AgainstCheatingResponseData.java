package com.sankuai.waimai.platform.domain.manager.againstcheat;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.log.a;
import java.lang.reflect.Type;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class AgainstCheatingResponseData {
    public String a;
    public String b;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class Deserializer implements JsonDeserializer<AgainstCheatingResponseData> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public AgainstCheatingResponseData deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02192e7afe4df81d6c846027c057b671", RobustBitConfig.DEFAULT_VALUE)) {
                return (AgainstCheatingResponseData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02192e7afe4df81d6c846027c057b671");
            }
            if (jsonElement.isJsonObject()) {
                try {
                    JSONObject jSONObject = new JSONObject(jsonElement.toString());
                    AgainstCheatingResponseData againstCheatingResponseData = new AgainstCheatingResponseData();
                    againstCheatingResponseData.b = jSONObject.optString("Message");
                    againstCheatingResponseData.a = jSONObject.optString("ResultCode");
                    return againstCheatingResponseData;
                } catch (JSONException e) {
                    a.a(e);
                    return null;
                }
            }
            return null;
        }
    }
}
