package com.sankuai.waimai.business.page.homepage.model;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class LastOrderStatus {
    public boolean a;
    public String b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public long g;
    public short h;
    public int i;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Deserializer implements JsonDeserializer<LastOrderStatus> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public LastOrderStatus deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f9c7d3196baf9ecd533cd1f8cf42077", RobustBitConfig.DEFAULT_VALUE)) {
                return (LastOrderStatus) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f9c7d3196baf9ecd533cd1f8cf42077");
            }
            if (jsonElement.isJsonObject()) {
                try {
                    JSONObject jSONObject = new JSONObject(jsonElement.toString());
                    LastOrderStatus lastOrderStatus = new LastOrderStatus();
                    lastOrderStatus.a = jSONObject.optInt("visible") == 1;
                    lastOrderStatus.b = jSONObject.optString(RemoteMessageConst.Notification.ICON);
                    lastOrderStatus.c = jSONObject.optString("status_description");
                    lastOrderStatus.d = jSONObject.optString("status_description_secd");
                    lastOrderStatus.e = jSONObject.optString("target_url");
                    lastOrderStatus.f = jSONObject.optInt("im_switch") == 1;
                    lastOrderStatus.g = jSONObject.optLong("rider_dx_id");
                    lastOrderStatus.h = (short) jSONObject.optInt("app_id");
                    lastOrderStatus.i = jSONObject.optInt("delivery_type");
                    return lastOrderStatus;
                } catch (JSONException e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                    return null;
                }
            }
            return null;
        }
    }
}
