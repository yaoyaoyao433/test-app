package com.meituan.android.mrn.component.map.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MapUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4f16686ce890d2305d904b29dee0a80", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4f16686ce890d2305d904b29dee0a80") : MapUtils.getMapSDKVersionName();
    }

    private static String a(Context context) {
        boolean z = true;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef9474bf0b8a76a0dfa37e8f388aa9dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef9474bf0b8a76a0dfa37e8f388aa9dd");
        }
        return (context.getApplicationInfo() == null || (context.getApplicationInfo().flags & 2) == 0) ? false : false ? "test" : "prod";
    }

    private static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0b22c2b81399249e5d54ff2abfcc5457", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0b22c2b81399249e5d54ff2abfcc5457") : a();
    }

    private static String b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d68062881125ce04663029fdd3b5007d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d68062881125ce04663029fdd3b5007d");
        }
        PackageInfo d = d(context);
        return d == null ? "" : d.versionName;
    }

    private static String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e57883f4f62f92c4972f3d17e575258", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e57883f4f62f92c4972f3d17e575258") : a();
    }

    private static String c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61b2ac1a66f518ba006e17c74c5caa2b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61b2ac1a66f518ba006e17c74c5caa2b");
        }
        PackageInfo d = d(context);
        return (d == null || d.applicationInfo == null) ? "" : d.applicationInfo.packageName;
    }

    private static PackageInfo d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "140c58e2ca3e15d6c18da916298fb454", RobustBitConfig.DEFAULT_VALUE)) {
            return (PackageInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "140c58e2ca3e15d6c18da916298fb454");
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "237c56a062b8487b7bfc60f05ffb270b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "237c56a062b8487b7bfc60f05ffb270b") : a();
    }

    public static Map<String, Object> a(ReactApplicationContext reactApplicationContext) {
        JSONObject optJSONObject;
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bec9f8c4338be4296c9b1003dc21d633", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bec9f8c4338be4296c9b1003dc21d633");
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty("android")) {
            hashMap.put("OS_TYPE", "android");
        }
        if (!TextUtils.isEmpty(Build.VERSION.RELEASE)) {
            hashMap.put("OS_VERSION", Build.VERSION.RELEASE);
        }
        if (!TextUtils.isEmpty(Build.MODEL)) {
            hashMap.put("PHONE_MODEL", Build.MODEL);
        }
        if (!TextUtils.isEmpty(a((Context) reactApplicationContext))) {
            hashMap.put("APP_ENV", a((Context) reactApplicationContext));
        }
        if (!TextUtils.isEmpty(b(reactApplicationContext))) {
            hashMap.put("APP_VERSION", b(reactApplicationContext));
        }
        if (!TextUtils.isEmpty(c(reactApplicationContext))) {
            hashMap.put("PACKAGE_NAME", c(reactApplicationContext));
        }
        if (!TextUtils.isEmpty("4.1207.1")) {
            hashMap.put("MRNMAP_VERSION", "4.1207.1");
        }
        if (!TextUtils.isEmpty(a())) {
            hashMap.put("UNIFYMAP_VERSION", a());
        }
        if (!TextUtils.isEmpty(b())) {
            hashMap.put("MTMAP_VERSION", b());
        }
        if (!TextUtils.isEmpty(c())) {
            hashMap.put("QMAP_VERSION", c());
        }
        if (!TextUtils.isEmpty(d())) {
            hashMap.put("AMAP_VERSION", d());
        }
        try {
            JSONObject jSONObject = (JSONObject) Class.forName("com.meituan.android.mrn.module.utils.b").getMethod("getMRNInfo", ReactApplicationContext.class).invoke(null, reactApplicationContext);
            if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                WritableMap a2 = com.meituan.android.mrn.utils.g.a(optJSONObject);
                if (a.a(a2, "meta")) {
                    ReadableMap map = a2.getMap("meta");
                    hashMap.put("BUNDLE_NAME", map.getString("name"));
                    hashMap.put("BUNDLE_VERSION", map.getString("version"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hashMap;
    }
}
