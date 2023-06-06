package com.sankuai.waimai.platform.domain.manager.location.model;

import android.text.TextUtils;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.waimai.foundation.utils.r;
import java.lang.reflect.Type;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SelfDeliveryRouteResponse {
    public static ChangeQuickRedirect a;
    public int b;
    public a c;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class Deserializer implements JsonDeserializer<SelfDeliveryRouteResponse> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public SelfDeliveryRouteResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "302493015fe1b06a60c98d904e4a3ef5", RobustBitConfig.DEFAULT_VALUE)) {
                return (SelfDeliveryRouteResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "302493015fe1b06a60c98d904e4a3ef5");
            }
            if (jsonElement.isJsonObject()) {
                try {
                    return SelfDeliveryRouteResponse.a(new JSONObject(jsonElement.toString()));
                } catch (JSONException e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                    return null;
                }
            }
            return null;
        }
    }

    public static SelfDeliveryRouteResponse a(JSONObject jSONObject) throws JSONException {
        String[] split;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af2a188c778409d77e54c86f9dde6039", RobustBitConfig.DEFAULT_VALUE)) {
            return (SelfDeliveryRouteResponse) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af2a188c778409d77e54c86f9dde6039");
        }
        SelfDeliveryRouteResponse selfDeliveryRouteResponse = new SelfDeliveryRouteResponse();
        selfDeliveryRouteResponse.b = jSONObject.optInt("status", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject("result");
        if (optJSONObject != null) {
            a aVar = new a();
            aVar.a = optJSONObject.optInt("distance");
            aVar.b = optJSONObject.optInt("duration");
            String optString = optJSONObject.optString("polyline");
            if (!TextUtils.isEmpty(optString) && (split = optString.split(";")) != null && split.length > 0) {
                ArrayList arrayList = new ArrayList();
                for (String str : split) {
                    String[] split2 = str.split(CommonConstant.Symbol.COMMA);
                    if (split2 != null && split2.length == 2) {
                        arrayList.add(new LatLng(r.a(split2[1], 0.0d), r.a(split2[0], 0.0d)));
                    }
                }
                aVar.c = arrayList;
            }
            selfDeliveryRouteResponse.c = aVar;
        }
        return selfDeliveryRouteResponse;
    }
}
