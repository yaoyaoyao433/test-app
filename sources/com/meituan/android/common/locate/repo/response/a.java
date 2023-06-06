package com.meituan.android.common.locate.repo.response;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import com.dianping.titans.js.JsBridgeResult;
import com.dianping.titans.js.jshandler.GetAppInfoJsHandler;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.locate.model.AOI;
import com.meituan.android.common.locate.model.MTAddress;
import com.meituan.android.common.locate.model.OpenCity;
import com.meituan.android.common.locate.model.POI;
import com.meituan.android.common.locate.reporter.f;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private com.meituan.android.common.locate.track.a a;
    private SharedPreferences b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa4757641eaf4fb5f3abdcbaf4dd5fed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa4757641eaf4fb5f3abdcbaf4dd5fed");
            return;
        }
        this.a = com.meituan.android.common.locate.track.a.a();
        this.b = f.b();
    }

    private static AOI a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4594bae4a0a44a95660271664ec00fa2", RobustBitConfig.DEFAULT_VALUE)) {
            return (AOI) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4594bae4a0a44a95660271664ec00fa2");
        }
        if (jSONObject == null) {
            return null;
        }
        return new AOI(jSONObject.optLong("id", -1L), jSONObject.optString("name", "-1"), jSONObject.optString("location", "-1"), jSONObject.optString("type", "-1"), jSONObject.optDouble("distance", -1.0d));
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "995a6577647f5c5d8276ba97a37c816b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "995a6577647f5c5d8276ba97a37c816b");
            return;
        }
        try {
            if (str.equals(this.b.getString(GearsLocator.AD_CODE, ""))) {
                return;
            }
            this.b.edit().putString(GearsLocator.AD_CODE, str).apply();
            this.b.getString("ad_code", "").contains(str);
        } catch (Exception e) {
            LogUtils.a(e);
        }
    }

    private void b(MtLocation mtLocation, JSONArray jSONArray) throws Exception {
        Object[] objArr = {mtLocation, jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1812cdcc247cec01ee9c352e842f7e74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1812cdcc247cec01ee9c352e842f7e74");
            return;
        }
        Bundle extras = mtLocation.getExtras();
        int length = jSONArray.length();
        if (length <= 0) {
            LogUtils.a("GearsResponseBody pois is empty");
            return;
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        try {
            JSONObject jSONObject = jSONArray.getJSONObject(0);
            if (jSONObject.optDouble(GearsLocator.MALL_WEIGHT, 0.0d) > 0.5d) {
                long optLong = jSONObject.optLong("id", -1L);
                String optString = jSONObject.optString("name", "");
                double optDouble = jSONObject.optDouble(GearsLocator.MALL_WEIGHT, 0.0d);
                extras.putString("id", String.valueOf(optLong));
                extras.putString("name", optString);
                extras.putDouble(GearsLocator.MALL_WEIGHT, optDouble);
                extras.putString(GearsLocator.MALL_ID_TYPE, "main");
                extras.putInt("type", jSONObject.optInt("type", 1));
                extras.putInt(GearsLocator.MALL_FLOOR, -1);
            }
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                arrayList.add(new POI(jSONObject2.optLong("id", -1L), jSONObject2.optString("name", ""), jSONObject2.optDouble(GearsLocator.MALL_WEIGHT, 0.0d)));
            }
            extras.putParcelableArrayList("pois", arrayList);
            try {
                String[] strArr = new String[length];
                for (int i2 = 0; i2 < length; i2++) {
                    strArr[i2] = String.valueOf(jSONArray.getJSONObject(i2).optLong("id", -1L));
                }
                extras.putString(GearsLocator.INDOOR, Arrays.toString(strArr));
            } catch (Exception unused) {
                throw new Exception("parse indoors exception");
            }
        } catch (Exception unused2) {
            throw new Exception("parse pois exception");
        }
    }

    private void d(MtLocation mtLocation, JSONObject jSONObject) throws Exception {
        Object[] objArr = {mtLocation, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e363d3d188352f8715df4306f7f2ee80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e363d3d188352f8715df4306f7f2ee80");
            return;
        }
        Bundle extras = mtLocation.getExtras();
        extras.putInt(GearsLocator.INDOOR_TYPE, jSONObject.optInt("indoorType", -1));
        extras.putInt(GearsLocator.REQ_TYPE, jSONObject.optInt("reqType", 0));
        extras.putInt("poiSource", jSONObject.optInt("poiSource", 0));
        extras.putInt(GearsLocator.LOC_TYPE, 0);
    }

    private void e(MtLocation mtLocation, JSONObject jSONObject) throws Exception {
        Object[] objArr = {mtLocation, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03d5b3a93023147dacbca066420a99b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03d5b3a93023147dacbca066420a99b1");
            return;
        }
        Bundle extras = mtLocation.getExtras();
        String optString = jSONObject.optString(GearsLocator.COUNTRY, "");
        String optString2 = jSONObject.optString("province", "");
        String optString3 = jSONObject.optString("city", "");
        String optString4 = jSONObject.optString(GearsLocator.DISTRICT, "");
        String optString5 = jSONObject.optString(GearsLocator.AD_CODE, "");
        String optString6 = jSONObject.optString(GearsLocator.TOWN_SHIP, "");
        String optString7 = jSONObject.optString(GearsLocator.TOWN_CODE, "");
        String optString8 = jSONObject.optString(GearsLocator.DETAIL, "");
        LogUtils.a("GearsResponseBody parse address info : " + optString + optString2 + optString3 + optString4 + optString5 + optString7 + optString6 + optString8);
        extras.putString(GearsLocator.ADDRESS, "country: " + optString + " province: " + optString2 + " district: " + optString4 + " city: " + optString3 + " detail: " + optString8 + " towncode: " + optString7 + " township: " + optString6);
        extras.putString(GearsLocator.COUNTRY, optString);
        extras.putString("province", optString2);
        extras.putString(GearsLocator.DISTRICT, optString4);
        extras.putString("city", optString3);
        extras.putString(GearsLocator.DETAIL, optString8);
        extras.putString(GearsLocator.AD_CODE, optString5);
        extras.putString(GearsLocator.TOWN_CODE, optString7);
        extras.putString(GearsLocator.TOWN_SHIP, optString6);
        a(optString5);
        extras.putParcelable("mtaddress", new MTAddress(optString, optString2, optString3, optString4, optString8, optString5, optString7, optString6));
    }

    private void f(MtLocation mtLocation, JSONObject jSONObject) throws Exception {
        Object[] objArr = {mtLocation, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dcb937541c398e194e0302d127542ce3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dcb937541c398e194e0302d127542ce3");
            return;
        }
        Bundle extras = mtLocation.getExtras();
        long optLong = jSONObject.optLong("mtId", -1L);
        long optLong2 = jSONObject.optLong("dpId", -1L);
        int optInt = jSONObject.optInt(GearsLocator.ORIGIN_CITY_ID, -1);
        String optString = jSONObject.optString("name", "");
        int optInt2 = jSONObject.optInt("frontAreaId", -1);
        String optString2 = jSONObject.optString("frontAreaName", "");
        String optString3 = jSONObject.optString("pinyin", "");
        int optInt3 = jSONObject.optInt("districtId", -1);
        extras.putLong(GearsLocator.MT_CITY_ID, optLong);
        extras.putLong(GearsLocator.DP_CITY_ID, optLong2);
        extras.putString(GearsLocator.DP_NAME, jSONObject.optString(GearsLocator.DP_NAME, ""));
        extras.putParcelable("openCity", new OpenCity(optLong, optLong2, optInt, optString, optInt2, optString2, optString3, optInt3));
        extras.putString("openCityStr", jSONObject.toString());
        LocationUtils.a(jSONObject.toString(), extras);
    }

    public void a(MtLocation mtLocation, JSONArray jSONArray) throws Exception {
        Object[] objArr = {mtLocation, jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7acbb01d6379b0ef38fa80e16a09fde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7acbb01d6379b0ef38fa80e16a09fde");
            return;
        }
        Bundle extras = mtLocation.getExtras();
        int length = jSONArray.length();
        if (length <= 0) {
            LogUtils.a("GearsResponseBody pois is empty");
            return;
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            arrayList.add(a(jSONArray.getJSONObject(i)));
        }
        extras.putParcelableArrayList("aois", arrayList);
    }

    public void a(@NonNull MtLocation mtLocation, @NonNull JSONObject jSONObject) throws Exception {
        Object[] objArr = {mtLocation, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2cc547384d41f7ecb5bf4653a5695f0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2cc547384d41f7ecb5bf4653a5695f0c");
            return;
        }
        Bundle extras = mtLocation.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        double d = jSONObject.getDouble(Constants.PRIVACY.KEY_LATITUDE);
        double d2 = jSONObject.getDouble(Constants.PRIVACY.KEY_LONGITUDE);
        double[] a = LocationUtils.a(new double[]{d, d2});
        mtLocation.setLatitude(a[0]);
        mtLocation.setLongitude(a[1]);
        mtLocation.setAccuracy(jSONObject.getInt(JsBridgeResult.PROPERTY_LOCATION_ACCURACY));
        extras.putDouble("gpslat", d);
        extras.putDouble("gpslng", d2);
        mtLocation.setTime(System.currentTimeMillis());
        extras.putString(GearsLocator.FROM_WHERE, jSONObject.has("source") ? jSONObject.getString("source") : "");
        mtLocation.setExtras(extras);
    }

    public void b(@NonNull MtLocation mtLocation, @NonNull JSONObject jSONObject) throws Exception {
        Object[] objArr = {mtLocation, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e87b8f503270299a9dc2293117392fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e87b8f503270299a9dc2293117392fa");
            return;
        }
        try {
            if (jSONObject.has(GearsLocator.ADDRESS)) {
                e(mtLocation, jSONObject.getJSONObject(GearsLocator.ADDRESS));
                LogUtils.a("GearsResponseBody parse address success");
            }
        } catch (JSONException e) {
            LogUtils.a(e);
        }
        try {
            if (jSONObject.has("pois")) {
                JSONArray jSONArray = jSONObject.getJSONArray("pois");
                b(mtLocation, jSONArray);
                LogUtils.a("GearsResponseBody parse pois success : " + jSONArray);
            }
        } catch (Exception e2) {
            LogUtils.a(e2);
        }
        try {
            if (jSONObject.has("aois")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("aois");
                a(mtLocation, jSONArray2);
                LogUtils.a("GearsResponseBody parse aois success : " + jSONArray2);
            }
        } catch (Exception e3) {
            LogUtils.a(e3);
        }
        try {
            if (jSONObject.has("openCity")) {
                f(mtLocation, jSONObject.getJSONObject("openCity"));
                LogUtils.a("GearsResponseBody parse city id success");
            }
        } catch (Exception e4) {
            LogUtils.a(e4);
        }
        try {
            if (jSONObject.has(GetAppInfoJsHandler.EXTRA_EXTRAS)) {
                d(mtLocation, jSONObject.getJSONObject(GetAppInfoJsHandler.EXTRA_EXTRAS));
                LogUtils.a("GearsResponseBody parse extras success");
            }
        } catch (Exception e5) {
            LogUtils.a(e5);
        }
    }

    public void c(@NonNull MtLocation mtLocation, @NonNull JSONObject jSONObject) {
        Object[] objArr = {mtLocation, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7fcacf38d40ab8e41e09a8c4fa7080f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7fcacf38d40ab8e41e09a8c4fa7080f6");
            return;
        }
        try {
            mtLocation.getExtras().putLong(GearsLocator.TIME_GOT_LOCATION, jSONObject.optLong("id", System.currentTimeMillis()));
        } catch (Exception e) {
            LogUtils.a(e);
        }
    }
}
