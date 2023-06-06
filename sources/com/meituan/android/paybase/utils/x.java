package com.meituan.android.paybase.utils;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class x {
    public static ChangeQuickRedirect a = null;
    public static final String b = "0";
    public static final String c = "1";
    private static HashMap<String, HashMap<String, Object>> d = new HashMap<>();
    private static HashMap<String, HashMap<String, Object>> e = new HashMap<>();
    private static HashMap<String, Object> f;
    private static HashMap<String, Object> g;
    private static HashMap<String, Object> h;
    private static volatile boolean i;

    static {
        HashMap<String, Object> hashMap;
        HashMap<String, Object> hashMap2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6cab8fbd61a2b280fd83278eebd4341d", RobustBitConfig.DEFAULT_VALUE)) {
            hashMap = (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6cab8fbd61a2b280fd83278eebd4341d");
        } else {
            hashMap = new HashMap<>();
            hashMap.put("nb_version", com.meituan.android.paybase.config.a.d().q());
            hashMap.put("nb_platform", "android");
            hashMap.put("is_debug", b.b() ? c : b);
            hashMap.put("an_sdk_version", com.meituan.android.paybase.config.a.d().q());
            hashMap.put("nb_container", "native");
            hashMap.put("utm_source", -999);
        }
        f = hashMap;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "282a2b6dd329e991feab41f71af92b05", RobustBitConfig.DEFAULT_VALUE)) {
            hashMap2 = (HashMap) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "282a2b6dd329e991feab41f71af92b05");
        } else {
            hashMap2 = new HashMap<>();
            hashMap2.put("app_name", com.meituan.android.paybase.config.a.d().k());
            hashMap2.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, com.meituan.android.paybase.config.a.d().l());
            hashMap2.put("nb_version", com.meituan.android.paybase.config.a.d().q());
            hashMap2.put("nb_platform", "android");
            hashMap2.put("is_debug", b.b() ? c : b);
            hashMap2.put("nb_container", "native");
        }
        g = hashMap2;
        h = a();
        i = false;
    }

    public static void a(String str, HashMap<String, Object> hashMap) {
        Object[] objArr = {str, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a38ee7f1369f1d904bdc04bcf21c204", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a38ee7f1369f1d904bdc04bcf21c204");
            return;
        }
        a(str);
        if (i.a(hashMap)) {
            hashMap = new HashMap<>();
        }
        d.put(str, hashMap);
        e.put(str, hashMap);
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e87fb761bddadfabdd212d4722d93d44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e87fb761bddadfabdd212d4722d93d44");
            return;
        }
        d.remove(str);
        e.remove(str);
    }

    public static HashMap<String, Object> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b5bb747e777bfebc2ec385ca145a061", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b5bb747e777bfebc2ec385ca145a061");
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("technology_log_version", com.meituan.android.paybase.config.a.d().q());
        hashMap.put("priority", a.NORMAL.toString());
        hashMap.put("is_rooted", Boolean.valueOf(i));
        return hashMap;
    }

    public static void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c14db00df696f88dcc66f1df573ac29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c14db00df696f88dcc66f1df573ac29");
        } else {
            f.put(str, obj);
        }
    }

    public static void b(String str, @NonNull HashMap<String, Object> hashMap) {
        Object[] objArr = {str, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1abeb7e74f96dd2d76d00050797529af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1abeb7e74f96dd2d76d00050797529af");
        } else if (d.containsKey(str)) {
            HashMap<String, Object> hashMap2 = d.get(str);
            if (!i.a(hashMap2)) {
                hashMap2.putAll(hashMap);
            } else {
                d.put(str, hashMap);
            }
        } else {
            d.put(str, hashMap);
        }
    }

    public static void c(String str, @NonNull HashMap<String, Object> hashMap) {
        Object[] objArr = {str, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "815b6ef34761fc09fc9b0b50b96a1967", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "815b6ef34761fc09fc9b0b50b96a1967");
            return;
        }
        b(str, hashMap);
        Object[] objArr2 = {str, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f17ea1c4348b9ec47a6ceaa03a22f358", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f17ea1c4348b9ec47a6ceaa03a22f358");
        } else if (e.containsKey(str)) {
            HashMap<String, Object> hashMap2 = e.get(str);
            if (!i.a(hashMap2)) {
                hashMap2.putAll(hashMap);
            } else {
                e.put(str, hashMap);
            }
        } else {
            e.put(str, hashMap);
        }
    }

    public static Map<String, Object> b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf0a8398d09010b40317f383ce2eedab", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf0a8398d09010b40317f383ce2eedab");
        }
        HashMap hashMap = (HashMap) f.clone();
        HashMap<String, Object> hashMap2 = d.get(str);
        hashMap.putAll(h);
        if (!i.a(hashMap2)) {
            hashMap.putAll(hashMap2);
        }
        return hashMap;
    }

    public static Map<String, Object> c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5114b1a4350a1f3af5128f7bccf9ca1d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5114b1a4350a1f3af5128f7bccf9ca1d");
        }
        HashMap hashMap = (HashMap) f.clone();
        HashMap<String, Object> hashMap2 = d.get(str);
        if (!i.a(hashMap2)) {
            hashMap.putAll(hashMap2);
        }
        return hashMap;
    }

    public static Map<String, Object> d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "78aa01d08699873b5b53177d733beff0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "78aa01d08699873b5b53177d733beff0");
        }
        HashMap hashMap = (HashMap) g.clone();
        HashMap<String, Object> hashMap2 = e.get(str);
        if (!i.a(hashMap2)) {
            hashMap.putAll(hashMap2);
        }
        return hashMap;
    }

    public static void a(boolean z) {
        i = z;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum a {
        IMMEDIATE(0),
        URGENT(1),
        HIGH(2),
        NORMAL(3);
        
        public static ChangeQuickRedirect a;
        private int f;

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b310738b3c3ef4c8851f6c0afaf92a2b", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b310738b3c3ef4c8851f6c0afaf92a2b") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3306fd501838752089b7de9705aca4e", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3306fd501838752089b7de9705aca4e") : (a[]) values().clone();
        }

        a(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d85937c30cc83ffc04e4bff9941fba2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d85937c30cc83ffc04e4bff9941fba2");
            } else {
                this.f = i;
            }
        }

        @Override // java.lang.Enum
        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e679ac9d82719c8ae59212dcf70e1254", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e679ac9d82719c8ae59212dcf70e1254") : String.valueOf(this.f);
        }
    }
}
