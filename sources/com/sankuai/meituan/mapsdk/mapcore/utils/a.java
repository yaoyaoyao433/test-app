package com.sankuai.meituan.mapsdk.mapcore.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.mapcore.outline.Geometry;
import com.tencent.mapsdk.internal.rj;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static volatile String b;

    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9becfe4357614b8874c5e7682a9d3b80", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9becfe4357614b8874c5e7682a9d3b80");
        }
        if (context == null) {
            return b;
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    try {
                        b = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("MeituanMapSDK");
                    } catch (PackageManager.NameNotFoundException e) {
                        c.a(e);
                    } catch (Exception e2) {
                        c.a(e2);
                    }
                    if (b == null) {
                        b = "";
                    }
                }
            }
        }
        return b;
    }

    public static Geometry a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc8d75eb219c1b26cb57a97f8893203b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Geometry) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc8d75eb219c1b26cb57a97f8893203b");
        }
        Geometry geometry = new Geometry();
        if (TextUtils.isEmpty(str)) {
            return geometry;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            geometry.setVersion(jSONObject.getString("version"));
            ArrayList<ArrayList<ArrayList<Double>>> arrayList = new ArrayList<>();
            geometry.setMainlands(arrayList);
            JSONArray jSONArray = jSONObject.getJSONArray("dalu");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                ArrayList<ArrayList<Double>> arrayList2 = new ArrayList<>();
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONArray jSONArray3 = jSONArray2.getJSONArray(i2);
                    ArrayList<Double> arrayList3 = new ArrayList<>();
                    int length3 = jSONArray3.length();
                    for (int i3 = 0; i3 < length3; i3++) {
                        arrayList3.add(Double.valueOf(jSONArray3.getDouble(i3)));
                    }
                    arrayList2.add(arrayList3);
                }
                arrayList.add(arrayList2);
            }
            ArrayList<ArrayList<ArrayList<Double>>> arrayList4 = new ArrayList<>();
            geometry.setTaiwans(arrayList4);
            JSONArray jSONArray4 = jSONObject.getJSONArray(rj.h);
            int length4 = jSONArray4.length();
            for (int i4 = 0; i4 < length4; i4++) {
                JSONArray jSONArray5 = jSONArray4.getJSONArray(i4);
                ArrayList<ArrayList<Double>> arrayList5 = new ArrayList<>();
                int length5 = jSONArray5.length();
                for (int i5 = 0; i5 < length5; i5++) {
                    JSONArray jSONArray6 = jSONArray5.getJSONArray(i5);
                    ArrayList<Double> arrayList6 = new ArrayList<>();
                    int length6 = jSONArray6.length();
                    for (int i6 = 0; i6 < length6; i6++) {
                        arrayList6.add(Double.valueOf(jSONArray6.getDouble(i6)));
                    }
                    arrayList5.add(arrayList6);
                }
                arrayList4.add(arrayList5);
            }
        } catch (JSONException unused) {
        }
        return geometry;
    }
}
