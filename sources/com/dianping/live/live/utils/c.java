package com.dianping.live.live.utils;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a = null;
    private static String b = "mlive_metrics_config_android";
    private static String c = "MLive_HORN";
    private static Map<String, Object> d;
    private static Map<String, ArrayList<e>> e = new HashMap();
    private static ArrayList<d> f = new ArrayList<>();

    public static void a(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ddfe11d863f802431ec1d16fa97b67d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ddfe11d863f802431ec1d16fa97b67d");
            return;
        }
        String accessCache = Horn.accessCache(b);
        if (!TextUtils.isEmpty(accessCache)) {
            b(accessCache, context);
        } else {
            Horn.register(b, new HornCallback() { // from class: com.dianping.live.live.utils.c.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.common.horn.HornCallback
                public final void onChanged(boolean z, String str) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af7dcc17b8a2c14dabb33241c78a3372", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af7dcc17b8a2c14dabb33241c78a3372");
                        return;
                    }
                    String unused = c.c;
                    StringBuilder sb = new StringBuilder();
                    sb.append(z);
                    sb.append(str);
                    if (!z || str == null || str.isEmpty()) {
                        return;
                    }
                    c.b(str, context);
                }
            });
        }
    }

    public static void a(String str, e eVar) {
        Object[] objArr = {str, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "266db6d646ada9b9cb33cfa3c6c3158f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "266db6d646ada9b9cb33cfa3c6c3158f");
        } else if (d != null) {
            if (d.containsKey(str)) {
                eVar.a(str, d.get(str), ((Boolean) d.get("isOpen")).booleanValue());
            } else {
                new StringBuilder("未找到").append(str);
            }
        } else {
            ArrayList<e> arrayList = new ArrayList<>();
            if (e != null && e.containsKey(str)) {
                arrayList = e.get(str);
            }
            arrayList.add(eVar);
            e.put(str, arrayList);
        }
    }

    public static void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4bcf54e7e2472267a1c523bf5ef6d0b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4bcf54e7e2472267a1c523bf5ef6d0b7");
        } else if (d != null) {
            dVar.a(d);
        } else {
            f.add(dVar);
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be544ea70d1fd2cb37347ac142de82f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be544ea70d1fd2cb37347ac142de82f1");
            return;
        }
        d = null;
        e.clear();
        f.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, Context context) {
        Object[] objArr = {str, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "25e237bacff7c188999be09c3720e5f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "25e237bacff7c188999be09c3720e5f8");
            return;
        }
        if (d == null) {
            d = new HashMap();
        }
        d.put("isOpen", a("isOpen", str, context));
        d.put("fft", a("fft", str, context));
        d.put("js_fps", a("js_fps", str, context));
        d.put("pike_connect", a("pike_connect", str, context));
        d.put("play_success", a("play_success", str, context));
        d.put("play_fail_code", a("play_fail_code", str, context));
        d.put("exit_wait_time", a("exit_wait_time", str, context));
        d.put("js_fps_period", a("js_fps_period", str, context));
        Iterator<d> it = f.iterator();
        while (it.hasNext()) {
            it.next().a(d);
        }
        f.clear();
    }

    private static Object a(String str, String str2, Context context) {
        if (!TextUtils.isEmpty(str2) && context != null && context.getApplicationInfo() != null) {
            try {
                Object obj = new JSONObject(str2).get(str);
                if (obj != null) {
                    if (e.get(str) != null && !e.get(str).isEmpty()) {
                        e.get(str);
                        Iterator<e> it = e.get(str).iterator();
                        while (it.hasNext()) {
                            it.next().a(str, obj, ((Boolean) d.get("isOpen")).booleanValue());
                        }
                        e.remove(str);
                    }
                    return obj;
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
                j.a("MLive_LogangetHorn " + str + ": Exception");
                j.a(context);
                return null;
            }
        }
        return null;
    }
}
