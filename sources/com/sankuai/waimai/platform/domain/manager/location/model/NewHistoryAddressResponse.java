package com.sankuai.waimai.platform.domain.manager.location.model;

import android.text.TextUtils;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class NewHistoryAddressResponse implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("code")
    public int b;
    @SerializedName("msg")
    public String c;
    @Deprecated
    public String d;
    public a e;
    public List<AddressItem> f;
    public c g;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements Serializable {
        public String a;
        public b b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b implements Serializable {
        public int a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c implements Serializable {
        public boolean a;
        public String b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class Deserializer implements JsonDeserializer<NewHistoryAddressResponse> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public NewHistoryAddressResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee579e17ac9b570e5cfe9b63938bb253", RobustBitConfig.DEFAULT_VALUE)) {
                return (NewHistoryAddressResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee579e17ac9b570e5cfe9b63938bb253");
            }
            if (jsonElement.isJsonObject()) {
                try {
                    return NewHistoryAddressResponse.a(new JSONObject(jsonElement.toString()));
                } catch (JSONException e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                    return null;
                }
            }
            return null;
        }
    }

    public static NewHistoryAddressResponse a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bcebc91b025ed969d8836be114f1aa5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (NewHistoryAddressResponse) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bcebc91b025ed969d8836be114f1aa5a");
        }
        try {
            NewHistoryAddressResponse newHistoryAddressResponse = new NewHistoryAddressResponse();
            newHistoryAddressResponse.b = jSONObject.optInt("code", -1);
            newHistoryAddressResponse.c = jSONObject.optString("msg", "");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                newHistoryAddressResponse.d = optJSONObject.optString("tips");
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("top_tip_info");
                if (optJSONObject2 != null) {
                    a aVar = new a();
                    aVar.a = optJSONObject2.optString("tip");
                    JSONObject optJSONObject3 = optJSONObject2.optJSONObject("button");
                    if (optJSONObject3 != null) {
                        b bVar = new b();
                        bVar.a = optJSONObject3.optInt("type");
                        aVar.b = bVar;
                    }
                    newHistoryAddressResponse.e = aVar;
                }
                JSONArray optJSONArray = optJSONObject.optJSONArray("user_addresses");
                if (optJSONArray != null) {
                    ArrayList arrayList = new ArrayList(optJSONArray.length());
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        arrayList.add(new AddressItem(optJSONArray.optJSONObject(i)));
                    }
                    newHistoryAddressResponse.f = arrayList;
                }
                c cVar = new c();
                String optString = optJSONObject.optString("extra");
                if (!TextUtils.isEmpty(optString)) {
                    JSONObject jSONObject2 = new JSONObject(optString);
                    cVar.a = jSONObject2.optBoolean("hasBadWords");
                    cVar.b = jSONObject2.optString("hasBadWordsMsg");
                    newHistoryAddressResponse.g = cVar;
                }
            }
            return newHistoryAddressResponse;
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return null;
        }
    }

    public final int a() {
        if (this.e == null || this.e.b == null) {
            return 0;
        }
        return this.e.b.a;
    }
}
