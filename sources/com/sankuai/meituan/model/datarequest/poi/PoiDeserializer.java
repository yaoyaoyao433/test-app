package com.sankuai.meituan.model.datarequest.poi;

import android.text.TextUtils;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.model.dao.Deal;
import com.sankuai.meituan.model.dao.Poi;
import com.sankuai.meituan.model.datarequest.a;
import java.lang.reflect.Type;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PoiDeserializer implements JsonDeserializer<Poi> {
    public static ChangeQuickRedirect a;

    @Override // com.google.gson.JsonDeserializer
    public /* synthetic */ Poi deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Object[] objArr = {jsonElement, type, jsonDeserializationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90b753b9a93bdd0daa2a149b58481ef6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Poi) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90b753b9a93bdd0daa2a149b58481ef6");
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        double doubleValue = a(asJsonObject, "lat").doubleValue();
        double doubleValue2 = a(asJsonObject, "lng").doubleValue();
        String str = "";
        if (asJsonObject.has("tour")) {
            JsonElement jsonElement2 = asJsonObject.get("tour");
            str = jsonElement2.isJsonPrimitive() ? jsonElement2.getAsString() : jsonElement2.toString();
            asJsonObject.remove("tour");
        }
        String str2 = "";
        if (asJsonObject.has("fodderInfo")) {
            JsonElement jsonElement3 = asJsonObject.get("fodderInfo");
            str2 = jsonElement3.isJsonPrimitive() ? jsonElement3.getAsString() : jsonElement3.toString();
            asJsonObject.remove("fodderInfo");
        }
        String str3 = "";
        if (asJsonObject.has("vipInfo")) {
            JsonElement jsonElement4 = asJsonObject.get("vipInfo");
            str3 = jsonElement4.isJsonPrimitive() ? jsonElement4.getAsString() : jsonElement4.toString();
            asJsonObject.remove("vipInfo");
        }
        String str4 = "";
        if (asJsonObject.has("poiAttrTagList")) {
            JsonElement jsonElement5 = asJsonObject.get("poiAttrTagList");
            str4 = jsonElement5.isJsonPrimitive() ? jsonElement5.getAsString() : jsonElement5.toString();
            asJsonObject.remove("poiAttrTagList");
        }
        String str5 = "";
        if (asJsonObject.has("poiThirdCallNumber")) {
            JsonElement jsonElement6 = asJsonObject.get("poiThirdCallNumber");
            str5 = jsonElement6.isJsonPrimitive() ? jsonElement6.getAsString() : jsonElement6.toString();
            asJsonObject.remove("poiThirdCallNumber");
        }
        List<Deal> list = null;
        if (asJsonObject.has("collectionDeals")) {
            list = (List) jsonDeserializationContext.deserialize(asJsonObject.get("collectionDeals"), new TypeToken<List<Deal>>() { // from class: com.sankuai.meituan.model.datarequest.poi.PoiDeserializer.1
            }.getType());
            asJsonObject.remove("collectionDeals");
        }
        Poi poi = (Poi) a.a.fromJson(jsonElement, type);
        poi.b(doubleValue);
        poi.a(doubleValue2);
        poi.tour = str;
        poi.fodderInfo = str2;
        poi.vipInfo = str3;
        poi.poiAttrTagList = str4;
        poi.poiThirdCallNumber = str5;
        poi.collectionDeals = list;
        return poi;
    }

    private Double a(JsonObject jsonObject, String str) {
        Object[] objArr = {jsonObject, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74de6cfe5aa88a64c775109c80cb670e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74de6cfe5aa88a64c775109c80cb670e");
        }
        if (jsonObject.has(str)) {
            String asString = jsonObject.get(str).getAsString();
            r1 = TextUtils.isEmpty(asString) ? -1.0d : a(asString, -1.0d);
            jsonObject.remove(str);
        }
        return Double.valueOf(r1);
    }

    private static double a(String str, double d) {
        Object[] objArr = {str, Double.valueOf(-1.0d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a0bdaea9e6a36490421635046ab6435c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a0bdaea9e6a36490421635046ab6435c")).doubleValue();
        }
        if (!TextUtils.isEmpty(str)) {
            String trim = str.trim();
            try {
                if (TextUtils.isEmpty(trim)) {
                    return -1.0d;
                }
                return Double.parseDouble(trim);
            } catch (Exception unused) {
            }
        }
        return -1.0d;
    }
}
