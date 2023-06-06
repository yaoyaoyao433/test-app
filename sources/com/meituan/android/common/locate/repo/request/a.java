package com.meituan.android.common.locate.repo.request;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.api.BlurLocationManager;
import com.meituan.android.common.locate.model.b;
import com.meituan.android.common.locate.provider.g;
import com.meituan.android.common.locate.provider.h;
import com.meituan.android.common.locate.reporter.l;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.common.locate.util.e;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class a {
    public static int a;
    private static h b;
    public static ChangeQuickRedirect changeQuickRedirect;

    private static String a() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "64bcbb856f7c60ee1f97de5fbcbb44cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "64bcbb856f7c60ee1f97de5fbcbb44cf");
        }
        if (b == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String b2 = b.b(0);
        if (TextUtils.isEmpty(b2)) {
            b2 = "";
        }
        sb.append(b2);
        if (b.a()) {
            String b3 = b.b(1);
            if (TextUtils.isEmpty(b3)) {
                str = "";
            } else {
                str = CommonConstant.Symbol.COMMA + b3;
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static void a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8e8be1ec0eedb1a1c44e5e11791d09b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8e8be1ec0eedb1a1c44e5e11791d09b9");
        } else {
            b = h.a(context);
        }
    }

    public static void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6a6b6c8d518bbbfc1e500c1f82bc9a1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6a6b6c8d518bbbfc1e500c1f82bc9a1b");
            return;
        }
        try {
            if (!l.a().e) {
                jSONObject.put(Constants.Environment.KEY_IMSI, a());
                jSONObject.put(AppUtil.CacheKey.DEVICEID, "");
            }
            jSONObject.put("autoloc", a);
            jSONObject.put("vague", BlurLocationManager.a(g.a()).b());
        } catch (Throwable th) {
            LogUtils.a(th);
        }
    }

    public static void a(JSONObject jSONObject, int i) {
        Object[] objArr = {jSONObject, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "29c0c3cc6e67cedf15d220b80127bbd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "29c0c3cc6e67cedf15d220b80127bbd2");
            return;
        }
        try {
            jSONObject.put("address_language", "cn");
            jSONObject.put("need_openCity", 3);
            jSONObject.put("need_address", true);
            jSONObject.put("coord_type", JsBridgeResult.LOCATION_TYPE_WGS84);
            jSONObject.put("need_poi", 2);
            jSONObject.put("need_aoi", 1);
        } catch (Exception e) {
            LogUtils.a("append json exception: " + e.getMessage());
            com.meituan.android.common.locate.platform.sniffer.a.a("no request", 4);
        }
    }

    public static synchronized void a(JSONObject jSONObject, MtLocation mtLocation) {
        synchronized (a.class) {
            Object[] objArr = {jSONObject, mtLocation};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f3ad692e1c4ee51eb9a788f2d492c3a7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f3ad692e1c4ee51eb9a788f2d492c3a7");
                return;
            }
            if (jSONObject != null && LocationUtils.isValidLatLon(mtLocation)) {
                Bundle extras = mtLocation.getExtras();
                b.C0216b c0216b = new b.C0216b(mtLocation.getTime(), extras.getDouble("gpslat"), extras.getDouble("gpslng"), (int) mtLocation.getAccuracy());
                JSONObject jSONObject2 = new JSONObject();
                try {
                    e.a(c0216b, jSONObject2);
                    jSONObject.put("location", jSONObject2);
                    return;
                } catch (Exception e) {
                    LogUtils.a(e);
                    return;
                }
            }
            LogUtils.a("GearsRequestBody holder or location illegal return");
        }
    }
}
