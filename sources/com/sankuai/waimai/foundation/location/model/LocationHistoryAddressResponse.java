package com.sankuai.waimai.foundation.location.model;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.WmHistoryAddressList;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class LocationHistoryAddressResponse implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("code")
    public int b;
    @SerializedName("msg")
    public String c;
    public String d;
    public List<String> e;
    public List<WmHistoryAddressList.SimpleAddressItem> f;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Deserializer implements JsonDeserializer<LocationHistoryAddressResponse> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public LocationHistoryAddressResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29a9fe25edfa483f86a3f616af972a42", RobustBitConfig.DEFAULT_VALUE)) {
                return (LocationHistoryAddressResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29a9fe25edfa483f86a3f616af972a42");
            }
            if (jsonElement.isJsonObject()) {
                try {
                    return LocationHistoryAddressResponse.a(new JSONObject(jsonElement.toString()));
                } catch (JSONException e) {
                    com.sankuai.waimai.foundation.location.utils.b.a(e);
                    return null;
                }
            }
            return null;
        }
    }

    public static LocationHistoryAddressResponse a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2aefeae21b56d181b3d6542a1725473", RobustBitConfig.DEFAULT_VALUE)) {
            return (LocationHistoryAddressResponse) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2aefeae21b56d181b3d6542a1725473");
        }
        try {
            LocationHistoryAddressResponse locationHistoryAddressResponse = new LocationHistoryAddressResponse();
            locationHistoryAddressResponse.b = jSONObject.optInt("code", -1);
            locationHistoryAddressResponse.c = jSONObject.optString("msg", "");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                locationHistoryAddressResponse.d = optJSONObject.optString("tips");
                JSONArray optJSONArray = optJSONObject.optJSONArray("user_addresses");
                if (optJSONArray != null) {
                    ArrayList arrayList = new ArrayList(optJSONArray.length());
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                        String jSONObject2 = optJSONObject2.toString();
                        WmHistoryAddressList.SimpleAddressItem fromJson = WmHistoryAddressList.SimpleAddressItem.fromJson(optJSONObject2);
                        arrayList.add(jSONObject2);
                        arrayList2.add(fromJson);
                    }
                    locationHistoryAddressResponse.e = arrayList;
                    locationHistoryAddressResponse.f = arrayList2;
                }
            }
            return locationHistoryAddressResponse;
        } catch (Exception e) {
            com.sankuai.waimai.foundation.location.utils.b.a(e);
            return null;
        }
    }
}
