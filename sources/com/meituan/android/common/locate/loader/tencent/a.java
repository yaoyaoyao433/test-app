package com.meituan.android.common.locate.loader.tencent;

import android.os.Bundle;
import android.os.Parcelable;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.locate.model.POI;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static MtLocation a(com.meituan.android.common.locate.loader.tencent.bean.a aVar, int i, String str) {
        Object[] objArr = {aVar, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "aa2642f2c01d456736dd7567802b41f5", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtLocation) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "aa2642f2c01d456736dd7567802b41f5");
        }
        if (aVar == null) {
            return null;
        }
        MtLocation mtLocation = new MtLocation(b.a);
        mtLocation.setLatitude(aVar.b());
        mtLocation.setLongitude(aVar.c());
        mtLocation.setAccuracy(aVar.d());
        mtLocation.setBearing(aVar.n());
        mtLocation.setSpeed(aVar.o());
        mtLocation.setTime(aVar.p());
        Bundle bundle = new Bundle();
        bundle.putString("from", aVar.a());
        bundle.putLong(GearsLocator.TIME_GOT_LOCATION, aVar.p());
        if (aVar.s() == 0 && "gps".equals(aVar.a())) {
            bundle.putDouble("gpslat", aVar.b());
            bundle.putDouble("gpslng", aVar.c());
        }
        bundle.putString(GearsLocator.ADDRESS, aVar.f());
        bundle.putString(GearsLocator.COUNTRY, aVar.g());
        bundle.putString("province", aVar.h());
        bundle.putString("city", aVar.i());
        bundle.putString(GearsLocator.DISTRICT, aVar.j());
        bundle.putString(GearsLocator.DETAIL, a(aVar.k()) + a(aVar.l()) + a(aVar.e()));
        bundle.putString(GearsLocator.AD_CODE, aVar.r());
        try {
            a(bundle, a(aVar.m(), bundle));
        } catch (Exception e) {
            com.meituan.android.common.locate.platform.logs.c.a(a.class.getSimpleName() + CommonConstant.Symbol.COLON + e.getMessage(), 3);
        }
        bundle.putInt("gpsQuality", aVar.q());
        mtLocation.setStatusCode(i);
        Bundle t = aVar.t();
        if (t != null) {
            bundle.putFloat("heading", (float) t.getDouble("direction"));
        }
        mtLocation.setExtras(bundle);
        LogUtils.a("收到定位结果：" + mtLocation.getLatitude() + CommonConstant.Symbol.COMMA + mtLocation.getLongitude() + CommonConstant.Symbol.COMMA + mtLocation.getProvider() + ",from:" + mtLocation.getExtras().getString("from") + ",extra:" + mtLocation.getExtras().getSerializable("pois"));
        return mtLocation;
    }

    private static String a(String str) {
        return str == null ? "" : str;
    }

    private static JSONArray a(List<com.meituan.android.common.locate.loader.tencent.bean.c> list, Bundle bundle) {
        Object[] objArr = {list, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        com.meituan.android.common.locate.loader.tencent.bean.c cVar = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "48a889a7d9ede1f30f6e627e3bb9e606", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "48a889a7d9ede1f30f6e627e3bb9e606");
        }
        JSONArray jSONArray = new JSONArray();
        if (list == null) {
            return jSONArray;
        }
        double d = -1.0d;
        for (com.meituan.android.common.locate.loader.tencent.bean.c cVar2 : list) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("id", Long.valueOf(NumberUtils.parseLong(cVar2.e(), -1L)));
                jSONObject.putOpt("name", cVar2.a());
                jSONObject.putOpt(GearsLocator.MALL_WEIGHT, Double.valueOf(0.0d));
                jSONObject.putOpt("location", cVar2.c() + CommonConstant.Symbol.COMMA + cVar2.d());
                jSONObject.putOpt("distance", Double.valueOf(cVar2.b()));
            } catch (JSONException e) {
                e = e;
            }
            if (d != -1.0d) {
                try {
                } catch (JSONException e2) {
                    e = e2;
                    com.meituan.android.common.locate.platform.logs.c.a(a.class.getSimpleName() + CommonConstant.Symbol.COLON + e.getMessage(), 3);
                    jSONArray.put(jSONObject);
                }
                if (d <= cVar2.b()) {
                    cVar2 = cVar;
                    cVar = cVar2;
                    jSONArray.put(jSONObject);
                }
            }
            d = cVar2.b();
            cVar = cVar2;
            jSONArray.put(jSONObject);
        }
        if (cVar != null) {
            bundle.putString("id", cVar.e());
            bundle.putString("name", cVar.a());
            bundle.putDouble(GearsLocator.MALL_WEIGHT, 0.0d);
            bundle.putString(GearsLocator.MALL_ID_TYPE, "main");
            bundle.putInt("type", 1);
            bundle.putInt(GearsLocator.MALL_FLOOR, -1);
        }
        return jSONArray;
    }

    private static void a(Bundle bundle, JSONArray jSONArray) throws Exception {
        Object[] objArr = {bundle, jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f6bdf359450f8371e9a624ee2571ef5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f6bdf359450f8371e9a624ee2571ef5f");
            return;
        }
        int length = jSONArray.length();
        if (length <= 0) {
            return;
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                arrayList.add(new POI(jSONObject.optLong("id", -1L), jSONObject.optString("name", ""), jSONObject.optDouble(GearsLocator.MALL_WEIGHT, 0.0d)));
            } catch (Exception unused) {
                throw new Exception("parse pois exception");
            }
        }
        bundle.putParcelableArrayList("pois", arrayList);
        try {
            String[] strArr = new String[length];
            for (int i2 = 0; i2 < length; i2++) {
                strArr[i2] = String.valueOf(jSONArray.getJSONObject(i2).optLong("id", -1L));
            }
            bundle.putString(GearsLocator.INDOOR, Arrays.toString(strArr));
        } catch (Exception unused2) {
            throw new Exception("parse indoors exception");
        }
    }
}
