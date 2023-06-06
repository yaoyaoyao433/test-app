package com.sankuai.waimai.platform.domain.manager.location.model;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.g;
import com.sankuai.waimai.foundation.location.model.AdminInfo;
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
public class MtAddressSearchResponse implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName(alternate = {"code"}, value = "status")
    public int b;
    @SerializedName("msg")
    public String c;
    @SerializedName("source")
    public String d;
    @SerializedName(alternate = {"data"}, value = "result")
    public List<AddressItem> e;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class Deserializer implements JsonDeserializer<MtAddressSearchResponse> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public MtAddressSearchResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2b5e41450f21d77b699e77edd7e206d", RobustBitConfig.DEFAULT_VALUE)) {
                return (MtAddressSearchResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2b5e41450f21d77b699e77edd7e206d");
            }
            if (jsonElement.isJsonObject()) {
                try {
                    return MtAddressSearchResponse.a(new JSONObject(jsonElement.toString()));
                } catch (JSONException e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                    return null;
                }
            }
            return null;
        }
    }

    public static MtAddressSearchResponse a(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "59a051510d7fce6500b3f334bbc3c9de", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtAddressSearchResponse) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "59a051510d7fce6500b3f334bbc3c9de");
        }
        MtAddressSearchResponse mtAddressSearchResponse = new MtAddressSearchResponse();
        if (jSONObject.has("code")) {
            int optInt = jSONObject.optInt("code", -1);
            if (optInt == 0) {
                mtAddressSearchResponse.b = 200;
            } else {
                mtAddressSearchResponse.b = optInt;
            }
        } else {
            mtAddressSearchResponse.b = jSONObject.optInt("status", -1);
        }
        mtAddressSearchResponse.d = jSONObject.optString("source");
        if (jSONObject.has("data")) {
            optJSONObject = jSONObject.optJSONObject("data");
        } else {
            optJSONObject = jSONObject.optJSONObject("result");
        }
        ArrayList arrayList = new ArrayList();
        if (optJSONObject != null) {
            JSONArray optJSONArray = optJSONObject.optJSONArray("pois");
            AdminInfo adminInfo = new AdminInfo();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                AddressItem addressItem = new AddressItem();
                arrayList.add(addressItem);
                double[] f = g.f(jSONObject2.getString("location"));
                addressItem.lng = (int) (f[0] * 1000000.0d);
                addressItem.lat = (int) (f[1] * 1000000.0d);
                addressItem.source = mtAddressSearchResponse.d;
                addressItem.mapSearchPoiId = jSONObject2.optString("id");
                addressItem.addrBrief = jSONObject2.getString("name");
                addressItem.userName = jSONObject2.getString("name");
                addressItem.addrDesc = jSONObject2.getString(GearsLocator.ADDRESS);
                if (jSONObject2.has("type")) {
                    addressItem.type = jSONObject2.getString("type");
                }
                JSONArray jSONArray = jSONObject2.getJSONArray("addr_info");
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    adminInfo.parseJson(jSONArray.getJSONObject(i2));
                    if (adminInfo.adminLevel == 5) {
                        addressItem.cityName = adminInfo.name;
                        addressItem.cityCode = adminInfo.adminCode;
                    } else if (adminInfo.adminLevel == 4) {
                        addressItem.province = adminInfo.name;
                    } else if (adminInfo.adminLevel == 6) {
                        addressItem.district = adminInfo.name;
                    }
                }
            }
        }
        mtAddressSearchResponse.e = arrayList;
        return mtAddressSearchResponse;
    }
}
