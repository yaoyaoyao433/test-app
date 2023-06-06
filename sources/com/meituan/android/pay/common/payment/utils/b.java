package com.meituan.android.pay.common.payment.utils;

import android.app.Activity;
import android.text.TextUtils;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.ak;
import com.meituan.android.paybase.utils.i;
import com.meituan.android.paybase.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    @MTPaySuppressFBWarnings({"LI_LAZY_INIT_STATIC"})
    private static ConcurrentHashMap<String, String> h;
    @MTPaySuppressFBWarnings({"MS_CANNOT_BE_FINAL"})
    private static String i;
    @MTPaySuppressFBWarnings({"MS_CANNOT_BE_FINAL"})
    private static int j;
    private static Boolean k;
    @MTPaySuppressFBWarnings({"LI_LAZY_INIT_STATIC"})
    private static final WeakHashMap<Activity, ConcurrentHashMap<String, String>> f = new WeakHashMap<>();
    @MTPaySuppressFBWarnings({"LI_LAZY_INIT_STATIC"})
    private static final LinkedHashMap<String, ConcurrentHashMap<String, String>> g = new LinkedHashMap<>();
    @MTPaySuppressFBWarnings({"MS_CANNOT_BE_FINAL"})
    public static final WeakHashMap<Activity, String> b = new WeakHashMap<>();
    @MTPaySuppressFBWarnings({"MS_CANNOT_BE_FINAL", "MS_MUTABLE_COLLECTION_PKGPROTECT"})
    public static final LinkedHashMap<String, String> c = new LinkedHashMap<>();
    @MTPaySuppressFBWarnings({"MS_CANNOT_BE_FINAL"})
    public static final WeakHashMap<Activity, Integer> d = new WeakHashMap<>();
    @MTPaySuppressFBWarnings({"MS_CANNOT_BE_FINAL", "MS_MUTABLE_COLLECTION_PKGPROTECT"})
    public static final LinkedHashMap<String, Integer> e = new LinkedHashMap<>();

    private static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ece89a1e04fe87a5b4ad996ab1946ee1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ece89a1e04fe87a5b4ad996ab1946ee1")).booleanValue();
        }
        if (k == null) {
            com.meituan.android.paybase.downgrading.c cVar = com.meituan.android.paybase.downgrading.d.a().b;
            if (cVar != null) {
                k = Boolean.valueOf(cVar.n);
            } else {
                k = Boolean.FALSE;
            }
        }
        return k.booleanValue();
    }

    public static String a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b1c8fbf9e091da71227ebacca72c236e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b1c8fbf9e091da71227ebacca72c236e");
        }
        if (b()) {
            WeakReference<Activity> b2 = com.meituan.android.pay.common.util.a.a().b(activity);
            if (b2 == null || b2.get() == null) {
                if (c.size() != 0) {
                    if (activity instanceof PayBaseActivity) {
                        return c.get(((PayBaseActivity) activity).p());
                    }
                    Iterator<Map.Entry<String, String>> it = c.entrySet().iterator();
                    Map.Entry<String, String> entry = null;
                    while (it.hasNext()) {
                        entry = it.next();
                    }
                    if (entry != null) {
                        return entry.getValue();
                    }
                }
                com.meituan.android.pay.common.analyse.b.a("payrequestutils_getnbsource_error", (Map<String, Object>) null, (List<Float>) null, ak.a(activity));
                com.meituan.android.paybase.common.analyse.a.d("payrequestutils_getnbsource_error", "PayRequestUtils_getNbSource", x.b("com.meituan.android.paybase.utils.StatisticsUtils"));
                return i;
            }
            return b.get(b2.get());
        }
        return i;
    }

    public static void a(String str, Activity activity) {
        Object[] objArr = {str, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b5397a535c67d4b07437daac91e422ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b5397a535c67d4b07437daac91e422ec");
            return;
        }
        g.put(str, f.get(activity));
        e.put(str, d.get(activity));
        c.put(str, b.get(activity));
    }

    public static void b(String str, Activity activity) {
        Object[] objArr = {str, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e69c1491f3d5640d99327d6be67d3ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e69c1491f3d5640d99327d6be67d3ef");
            return;
        }
        if (g.get(str) != null) {
            f.put(activity, g.remove(str));
        }
        if (e.get(str) != null) {
            d.put(activity, e.remove(str));
        }
        if (c.get(str) != null) {
            b.put(activity, c.remove(str));
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "afb300dfab14be78f95f6b6c09dce7a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "afb300dfab14be78f95f6b6c09dce7a0");
            return;
        }
        g.remove(str);
        e.remove(str);
        c.remove(str);
    }

    public static void a(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0f065f45e572b651a478ab8338c1969d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0f065f45e572b651a478ab8338c1969d");
        } else if (b()) {
            WeakReference<Activity> b2 = com.meituan.android.pay.common.util.a.a().b(activity);
            if (b2 == null || b2.get() == null) {
                if (activity instanceof PayBaseActivity) {
                    c.put(((PayBaseActivity) activity).p(), str);
                    return;
                }
                com.meituan.android.pay.common.analyse.b.a("payrequestutils_setnbsource_error", (Map<String, Object>) null, (List<Float>) null, ak.a(activity));
                com.meituan.android.paybase.common.analyse.a.d("payrequestutils_setnbsource_error", "PayRequestUtils_setNbSource", x.b("com.meituan.android.paybase.utils.StatisticsUtils"));
                i = str;
                return;
            }
            b.put(b2.get(), str);
        } else {
            i = str;
        }
    }

    public static int b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c9d4ea256136e9df776565d42a4d5ef0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c9d4ea256136e9df776565d42a4d5ef0")).intValue();
        }
        if (b()) {
            WeakReference<Activity> b2 = com.meituan.android.pay.common.util.a.a().b(activity);
            if (b2 == null || b2.get() == null) {
                if (e.size() != 0) {
                    if (activity instanceof PayBaseActivity) {
                        Integer num = e.get(((PayBaseActivity) activity).p());
                        if (num != null) {
                            return num.intValue();
                        }
                        return 0;
                    }
                    Iterator<Map.Entry<String, Integer>> it = e.entrySet().iterator();
                    Map.Entry<String, Integer> entry = null;
                    while (it.hasNext()) {
                        entry = it.next();
                    }
                    if (entry != null) {
                        return entry.getValue().intValue();
                    }
                }
                com.meituan.android.pay.common.analyse.b.a("payrequestutils_getverifytype_error", (Map<String, Object>) null, (List<Float>) null, ak.a(activity));
                com.meituan.android.paybase.common.analyse.a.d("payrequestutils_getverifytype_error", "PayRequestUtils_getVerifyType", x.b("com.meituan.android.paybase.utils.StatisticsUtils"));
                return j;
            }
            Integer num2 = d.get(b2.get());
            if (num2 == null) {
                return 0;
            }
            return num2.intValue();
        }
        return j;
    }

    public static ConcurrentHashMap<String, String> a() {
        return h;
    }

    public static void a(Activity activity, int i2) {
        Object[] objArr = {activity, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b69d2a5325d05c1cab7cc733b2a4dbc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b69d2a5325d05c1cab7cc733b2a4dbc0");
        } else if (b()) {
            WeakReference<Activity> b2 = com.meituan.android.pay.common.util.a.a().b(activity);
            if (b2 == null || b2.get() == null) {
                if (activity instanceof PayBaseActivity) {
                    e.put(((PayBaseActivity) activity).p(), Integer.valueOf(i2));
                    return;
                }
                com.meituan.android.pay.common.analyse.b.a("payrequestutils_setverifytype_error", (Map<String, Object>) null, (List<Float>) null, ak.a(activity));
                com.meituan.android.paybase.common.analyse.a.d("payrequestutils_setverifytype_error", "PayRequestUtils_setVerifyType", x.b("com.meituan.android.paybase.utils.StatisticsUtils"));
                j = i2;
                return;
            }
            d.put(b2.get(), Integer.valueOf(i2));
        } else {
            j = i2;
        }
    }

    public static ConcurrentHashMap<String, String> c(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c4c5e8a92df1946af0475e844f4367e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (ConcurrentHashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c4c5e8a92df1946af0475e844f4367e4");
        }
        if (b()) {
            WeakReference<Activity> b2 = com.meituan.android.pay.common.util.a.a().b(activity);
            if (b2 == null || b2.get() == null) {
                if (g.size() != 0) {
                    if (activity instanceof PayBaseActivity) {
                        PayBaseActivity payBaseActivity = (PayBaseActivity) activity;
                        if (g.get(payBaseActivity.p()) == null) {
                            if (h != null) {
                                return h;
                            }
                            g.put(payBaseActivity.p(), new ConcurrentHashMap<>());
                        }
                        return g.get(payBaseActivity.p());
                    }
                    Iterator<Map.Entry<String, ConcurrentHashMap<String, String>>> it = g.entrySet().iterator();
                    Map.Entry<String, ConcurrentHashMap<String, String>> entry = null;
                    while (it.hasNext()) {
                        entry = it.next();
                    }
                    if (entry != null) {
                        return entry.getValue();
                    }
                }
                if (activity instanceof PayBaseActivity) {
                    if (!TextUtils.equals("MTCashierActivity", ((PayBaseActivity) activity).l())) {
                        com.meituan.android.pay.common.analyse.b.a("payrequestutils_getpassthroughparams_error", (Map<String, Object>) null, (List<Float>) null, ak.a(activity));
                        com.meituan.android.paybase.common.analyse.a.d("payrequestutils_getpassthroughparams_error " + c(), "PayRequestUtils_getPassThroughParams", x.b("com.meituan.android.paybase.utils.StatisticsUtils"));
                    }
                } else {
                    com.meituan.android.pay.common.analyse.b.a("payrequestutils_getpassthroughparams_error", (Map<String, Object>) null, (List<Float>) null, ak.a(activity));
                    com.meituan.android.paybase.common.analyse.a.d("payrequestutils_getpassthroughparams_error " + c(), "PayRequestUtils_getPassThroughParams", x.b("com.meituan.android.paybase.utils.StatisticsUtils"));
                }
                if (h == null) {
                    h = new ConcurrentHashMap<>();
                }
                return h;
            }
            Activity activity2 = b2.get();
            if (f.get(activity2) == null) {
                f.put(activity2, new ConcurrentHashMap<>());
                h = f.get(activity2);
            }
            return f.get(activity2);
        }
        if (h == null) {
            h = new ConcurrentHashMap<>();
        }
        return h;
    }

    private static String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9d4571c392fd2600cf81501016e675db", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9d4571c392fd2600cf81501016e675db");
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < stackTrace.length; i2++) {
            sb.append(stackTrace[i2].getClassName());
            sb.append(CommonConstant.Symbol.DOT);
            sb.append(stackTrace[i2].getMethodName());
            sb.append("---");
        }
        return sb.toString();
    }

    public static void a(Activity activity, Map<String, String> map) {
        Object[] objArr = {activity, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58fd0da96d0971adf17ab9046ffe9ec3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58fd0da96d0971adf17ab9046ffe9ec3");
            return;
        }
        ConcurrentHashMap<String, String> c2 = c(activity);
        if (i.a(map)) {
            return;
        }
        try {
            c2.putAll(map);
        } catch (Exception e2) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry != null) {
                    if (entry.getKey() != null && entry.getValue() != null) {
                        c2.put(entry.getKey(), entry.getValue());
                    } else if (entry.getKey() != null && entry.getValue() == null) {
                        c2.put(entry.getKey(), "");
                    }
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            }
            com.meituan.android.paybase.common.analyse.a.a(e2, "PayRequestUtils_putPassThroughParams0", hashMap);
        }
    }

    public static void a(Activity activity, String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e6b9f9abc67691bc3d900dbe60db918", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e6b9f9abc67691bc3d900dbe60db918");
            return;
        }
        ConcurrentHashMap<String, String> c2 = c(activity);
        try {
            c2.put(str, str2);
        } catch (Exception e2) {
            HashMap hashMap = new HashMap();
            if (str2 != null) {
                c2.put(str, str2);
            } else if (str2 == null) {
                c2.put(str, "");
            }
            hashMap.put(str, str2);
            com.meituan.android.paybase.common.analyse.a.a(e2, "PayRequestUtils_putPassThroughParams", hashMap);
        }
    }

    public static String b(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b42eb22cc43d3e38cd6b470247c58ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b42eb22cc43d3e38cd6b470247c58ef");
        }
        ConcurrentHashMap<String, String> c2 = c(activity);
        if (i.a(c2) || !c2.containsKey(str)) {
            return null;
        }
        return c2.get(str);
    }

    public static void d(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "18a4087c033153cb6e6e4929f99760ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "18a4087c033153cb6e6e4929f99760ee");
        } else {
            c(activity).clear();
        }
    }

    public static void c(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e48bb0965ac539aa3372d0cc8f11812", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e48bb0965ac539aa3372d0cc8f11812");
            return;
        }
        ConcurrentHashMap<String, String> c2 = c(activity);
        if (c2 != null) {
            c2.remove(str);
        }
    }

    public static HashMap<String, String> e(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6164cdc9f0387ae9b2947f9cfff9cc3", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6164cdc9f0387ae9b2947f9cfff9cc3");
        }
        HashMap<String, String> hashMap = new HashMap<>();
        ConcurrentHashMap<String, String> c2 = c(activity);
        if (!i.a(c2) && !TextUtils.isEmpty(c2.get("cif"))) {
            hashMap.put("cif", c2.get("cif"));
        }
        return hashMap;
    }
}
