package com.meituan.android.recce.reporter;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a;
    public static final /* synthetic */ boolean b = !a.class.desiredAssertionStatus();
    private static String c = "-1";

    public static long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "00596a1c7a5020b1c7ccde894ef656a6", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "00596a1c7a5020b1c7ccde894ef656a6")).longValue() : System.currentTimeMillis();
    }

    public static long a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c7996882111db5d647f4f6c6bf81be37", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c7996882111db5d647f4f6c6bf81be37")).longValue() : System.currentTimeMillis() - j;
    }

    public static void a(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cce1c47834a4efc9dbab505b30a66da7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cce1c47834a4efc9dbab505b30a66da7");
        } else {
            a((Object) null, str, f);
        }
    }

    public static void a(Object obj, String str, float f) {
        Object[] objArr = {obj, str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e990800d5483b1b19288edb9894523f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e990800d5483b1b19288edb9894523f0");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Float.valueOf(f));
        b(obj, str, hashMap);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(f));
        a(obj, str, (HashMap<String, Object>) null, arrayList);
    }

    public static void a(Object obj, String str, String str2) {
        Object[] objArr = {obj, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "51b9893d5197e1b0c3ffbb259e23f075", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "51b9893d5197e1b0c3ffbb259e23f075");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("error_name", str);
        hashMap.put("error_level", str2);
        a(obj, "recce_wasm_error", hashMap);
    }

    public static void b(Object obj, String str, String str2) {
        Object[] objArr = {obj, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3bfb0bd0cd410574007b2b5a3934d06e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3bfb0bd0cd410574007b2b5a3934d06e");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("error_name", str);
        hashMap.put("error_level", str2);
        a(obj, "recce_host_error", hashMap);
    }

    public static void a(String str, @Nullable String str2, HashMap<String, Object> hashMap) {
        Object[] objArr = {str, str2, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9328ad9b624fa6d8f646ba9706c89d7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9328ad9b624fa6d8f646ba9706c89d7d");
        } else {
            a((Object) null, str, str2, hashMap);
        }
    }

    public static void a(Object obj, String str, @Nullable String str2, HashMap<String, Object> hashMap) {
        Object[] objArr = {obj, str, str2, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "55a3abafb8603466b6a2640de202bdd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "55a3abafb8603466b6a2640de202bdd9");
            return;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("error_name", str);
        if (str2 != null) {
            hashMap2.put("error_message", str2);
        }
        if (hashMap != null && hashMap.size() > 0) {
            hashMap2.putAll(hashMap);
        }
        a(obj, "recce_platform_error", hashMap2);
    }

    public static void a(String str, HashMap<String, Object> hashMap) {
        Object[] objArr = {str, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9ce807b2502e394e27b8949be6fdefc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9ce807b2502e394e27b8949be6fdefc9");
        } else {
            a((Object) null, str, hashMap);
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "73bf34a5aecc75f6cd9453572805daa3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "73bf34a5aecc75f6cd9453572805daa3");
        } else {
            a((Object) null, str, (HashMap<String, Object>) null);
        }
    }

    public static void a(Object obj, String str, HashMap<String, Object> hashMap) {
        Object[] objArr = {obj, str, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1868df66c75f1bd12919e6c0b8375df0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1868df66c75f1bd12919e6c0b8375df0");
            return;
        }
        b(obj, str, hashMap);
        a(obj, str, hashMap, (List<Float>) null);
    }

    private static void b(Object obj, String str, HashMap<String, Object> hashMap) {
        Object[] objArr = {obj, str, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3aece626db04b8c269a92f7c0591c15f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3aece626db04b8c269a92f7c0591c15f");
            return;
        }
        String str2 = "b_pay_" + str + "_sc";
        b a2 = com.meituan.android.recce.a.a();
        if (!b && a2 == null) {
            throw new AssertionError("ReporterProvider not set");
        }
        if (a2 != null) {
            a2.a(obj, "c_pay_neo", str2, hashMap);
        }
    }

    private static void a(Object obj, String str, HashMap<String, Object> hashMap, List<Float> list) {
        Object[] objArr = {obj, str, hashMap, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a97fb6da43e561039fe277bb2f29cb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a97fb6da43e561039fe277bb2f29cb5");
            return;
        }
        b a2 = com.meituan.android.recce.a.a();
        if (!b && a2 == null) {
            throw new AssertionError("ReporterProvider not set");
        }
        if (a2 != null) {
            a2.a(obj, str, hashMap, list);
        }
    }
}
