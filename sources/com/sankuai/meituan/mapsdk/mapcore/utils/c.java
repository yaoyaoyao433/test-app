package com.sankuai.meituan.mapsdk.mapcore.utils;

import android.text.TextUtils;
import android.util.Log;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a = null;
    private static String b = "MTMapSDK_mt_map_exception:";
    private static String c = "yyyy-MM-dd";
    private static final String d = "MTMapSDK" + "release".toUpperCase();
    private static boolean e = false;

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd0accd593a980d0dbb0dc7bb63e5790", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd0accd593a980d0dbb0dc7bb63e5790");
        } else {
            a(2, str);
        }
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "153b495c53fc4802e998900b8f8e4a5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "153b495c53fc4802e998900b8f8e4a5f");
        } else {
            a(3, str);
        }
    }

    public static void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9046fe666c56eb8720da8438fc03327", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9046fe666c56eb8720da8438fc03327");
        } else {
            a(4, str);
        }
    }

    public static void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4857cd933e953dac5b17ce7bf698c64f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4857cd933e953dac5b17ce7bf698c64f");
        } else {
            a(5, str);
        }
    }

    public static void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3cb61cd841ee47a2922c2092956dd0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3cb61cd841ee47a2922c2092956dd0e");
        } else {
            a(6, str);
        }
    }

    private static void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8719943ce7f222395eddcc60180353dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8719943ce7f222395eddcc60180353dc");
        } else if ((e || i > 3) && !TextUtils.isEmpty(str)) {
            String str2 = Thread.currentThread().toString() + "\t" + str;
            switch (i) {
                case 2:
                    return;
                case 3:
                    return;
                case 4:
                    return;
                case 5:
                    return;
                case 6:
                    Log.e(d, str2);
                    return;
                default:
                    return;
            }
        }
    }

    public static void f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5bcd8ee6fde6019fd6453a821913f857", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5bcd8ee6fde6019fd6453a821913f857");
            return;
        }
        e(str);
        try {
            com.sankuai.meituan.mapfoundation.logcenter.a.b(str);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "83d115968a62d1a7c78f609052522116", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "83d115968a62d1a7c78f609052522116");
        } else {
            a(b, exc);
        }
    }

    public static void a(String str, Exception exc) {
        Object[] objArr = {str, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e339529ced2fb1fa4fd687d16333b48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e339529ced2fb1fa4fd687d16333b48");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        f(str + Log.getStackTraceString(exc));
    }

    public static void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99f8f4f049b4691f9f6acd498655ab94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99f8f4f049b4691f9f6acd498655ab94");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            b(b(str, map));
        }
    }

    private static String b(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f795d7b98c27a6c3a2c7745aba2324ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f795d7b98c27a6c3a2c7745aba2324ab");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
            }
            jSONObject2.put(DeviceInfo.TM, System.currentTimeMillis());
            jSONObject.put(str, jSONObject2);
            String jSONObject3 = jSONObject.toString();
            g(jSONObject3);
            return jSONObject3;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static void g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f8a4a3479af94241327c1c6e9e532a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f8a4a3479af94241327c1c6e9e532a7");
            return;
        }
        b(str);
        f(str);
    }
}
