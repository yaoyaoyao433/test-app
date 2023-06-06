package com.meituan.android.pay.desk.component.data;

import android.app.Activity;
import android.text.TextUtils;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static JSONObject a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf9f4329681d3c67e2a33037b63e85d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf9f4329681d3c67e2a33037b63e85d4");
        }
        String b = com.meituan.android.pay.common.payment.utils.b.b(activity, "transmission_param");
        try {
            if (!TextUtils.isEmpty(b)) {
                return new JSONObject(b).optJSONObject("mtp_hybrid_info");
            }
        } catch (JSONException e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "HybridProcess_getCashierPayToken", (Map<String, Object>) null);
        }
        return new JSONObject();
    }

    public static void b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a75ac1f2479d6c27aa91e80e0ffd5d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a75ac1f2479d6c27aa91e80e0ffd5d2");
            return;
        }
        JSONObject a2 = a(activity);
        if (a2 != null) {
            try {
                a2.put("load_already", false);
                String b = com.meituan.android.pay.common.payment.utils.b.b(activity, "transmission_param");
                if (TextUtils.isEmpty(b)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(b);
                jSONObject.put("mtp_hybrid_info", a2);
                com.meituan.android.pay.common.payment.utils.b.a(activity, "transmission_param", jSONObject.toString());
            } catch (JSONException e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "HalfPageHybridDeskDataUtils_putHybridHalfPageAlreadyLoadFlag", (Map<String, Object>) null);
            }
        }
    }

    public static void c(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8987242a0134d995e1f5133201b3af75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8987242a0134d995e1f5133201b3af75");
            return;
        }
        JSONObject a2 = a(activity);
        if (a2 != null) {
            try {
                a2.put("load_already", true);
                String b = com.meituan.android.pay.common.payment.utils.b.b(activity, "transmission_param");
                if (TextUtils.isEmpty(b)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(b);
                jSONObject.put("mtp_hybrid_info", a2);
                com.meituan.android.pay.common.payment.utils.b.a(activity, "transmission_param", jSONObject.toString());
            } catch (JSONException e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "HalfPageHybridDeskDataUtils_putHybridHalfPageAlreadyLoadFlag", (Map<String, Object>) null);
            }
        }
    }

    public static boolean d(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b436b5bc44ed9ef2699f2a493428039f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b436b5bc44ed9ef2699f2a493428039f")).booleanValue();
        }
        JSONObject a2 = a(activity);
        if (a2 != null) {
            try {
                return a2.getBoolean("load_already");
            } catch (JSONException e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "HalfPageHybridDeskDataUtils_getHybridHalfPageAlreadyLoadFlag", (Map<String, Object>) null);
            }
        }
        return false;
    }

    public static boolean e(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5345cc78adfe12867964b932b3036e88", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5345cc78adfe12867964b932b3036e88")).booleanValue();
        }
        JSONObject a2 = a(activity);
        return (!f(activity) || a2 == null || TextUtils.isEmpty(a2.optString("mtp_cashier_url"))) ? false : true;
    }

    public static boolean f(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec4c412a18820508ba07ce935c4a46f3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec4c412a18820508ba07ce935c4a46f3")).booleanValue() : TextUtils.equals("preposed-mtcashier", com.meituan.android.pay.common.payment.utils.b.b(activity, "cashier_type"));
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c220492524bef571261f6961d61fe404", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c220492524bef571261f6961d61fe404")).booleanValue() : str.startsWith(AbsApiFactory.HTTP) || str.startsWith(AbsApiFactory.HTTPS) || str.startsWith("meituanpayment://");
    }

    public static HashMap<String, String> a(Activity activity, JSONObject jSONObject) {
        String str;
        Object[] objArr = {activity, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "54039699277d490780c728ea3ccfd343", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "54039699277d490780c728ea3ccfd343");
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    str = jSONObject.getString(next);
                } catch (JSONException e) {
                    com.meituan.android.paybase.common.analyse.a.a(e, "HybridMeituanPayJsHandler_refreshPayParams", (Map<String, Object>) null);
                    str = null;
                }
                hashMap.put(next, str);
            }
            com.meituan.android.pay.common.payment.utils.b.a(activity, hashMap);
        }
        return hashMap;
    }
}
