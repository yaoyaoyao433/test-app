package com.sankuai.meituan.takeoutnew.net.response;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.model.WelcomeAd;
import com.sankuai.waimai.business.page.homepage.model.a;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class StartPictureResponse {
    public List<WelcomeAd> a;
    public List<a> b;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Deserializer implements JsonDeserializer {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public StartPictureResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec917716452fe764522356a1a696ec22", RobustBitConfig.DEFAULT_VALUE)) {
                return (StartPictureResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec917716452fe764522356a1a696ec22");
            }
            if (jsonElement.isJsonObject()) {
                try {
                    return a(new JSONObject(jsonElement.toString()));
                } catch (JSONException e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                    return null;
                }
            }
            return null;
        }

        private StartPictureResponse a(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a7093855e3d939009bc1436651ec691", RobustBitConfig.DEFAULT_VALUE)) {
                return (StartPictureResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a7093855e3d939009bc1436651ec691");
            }
            StartPictureResponse startPictureResponse = new StartPictureResponse();
            String optString = jSONObject.optString("start_picture");
            startPictureResponse.a = new ArrayList();
            startPictureResponse.b = new ArrayList();
            JSONObject jSONObject2 = null;
            try {
                jSONObject2 = new JSONObject(optString);
            } catch (JSONException unused) {
            }
            if (jSONObject2 != null) {
                JSONArray optJSONArray = jSONObject2.optJSONArray("ad");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            startPictureResponse.a.add(new WelcomeAd(optJSONObject));
                        }
                    }
                }
                JSONArray optJSONArray2 = jSONObject2.optJSONArray("mk");
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    int length2 = optJSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                        if (optJSONObject2 != null) {
                            a aVar = new a();
                            aVar.a(optJSONObject2);
                            startPictureResponse.b.add(aVar);
                        }
                    }
                }
            }
            return startPictureResponse;
        }
    }
}
