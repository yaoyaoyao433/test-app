package com.meituan.android.neohybrid.neo.report;

import android.support.annotation.NonNull;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static void a(com.meituan.android.neohybrid.core.a aVar, Map<String, ?> map) {
        Object[] objArr = {aVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1fcd347b40a5e6d5408090666099bf3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1fcd347b40a5e6d5408090666099bf3d");
        } else if (aVar != null) {
            aVar.h().a(map);
        }
    }

    public static void a(com.meituan.android.neohybrid.core.a aVar, String str, Object obj) {
        Object[] objArr = {aVar, str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff06fda7535dacb0d32edef5313af42b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff06fda7535dacb0d32edef5313af42b");
        } else if (aVar != null) {
            aVar.h().a(str, obj);
        }
    }

    public static void a(com.meituan.android.neohybrid.core.a aVar, @NonNull String str, @NonNull String str2, Map<String, Object> map) {
        Object[] objArr = {aVar, str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "298d68731a8e9354975836c7a1155031", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "298d68731a8e9354975836c7a1155031");
        } else if (aVar != null) {
            aVar.h().a(str, str2, map);
        } else {
            b.a(str, str2, map);
        }
    }

    public static void a(com.meituan.android.neohybrid.core.a aVar, @NonNull String str, Map<String, Object> map) {
        Object[] objArr = {aVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "117e1550f9cdef944ee5a25f6325d30f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "117e1550f9cdef944ee5a25f6325d30f");
        } else {
            a(aVar, str, "c_pay_neo_js_sdk", map);
        }
    }

    public static void a(com.meituan.android.neohybrid.core.a aVar, @NonNull String str, @NonNull String str2, String str3, Map<String, Object> map) {
        Object[] objArr = {aVar, str, str2, str3, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e35ca760891803ca0ac2f935acce2e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e35ca760891803ca0ac2f935acce2e1");
        } else if (aVar != null) {
            aVar.h().a(str, str2, str3, map);
        } else {
            b.a(str, str2, str3, map);
        }
    }

    public static void b(com.meituan.android.neohybrid.core.a aVar, @NonNull String str, String str2, Map<String, Object> map) {
        Object[] objArr = {aVar, str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd44fba4a8aaaa586e3bd31fb8687190", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd44fba4a8aaaa586e3bd31fb8687190");
        } else {
            a(aVar, str, "c_pay_neo_js_sdk", str2, map);
        }
    }

    public static void b(com.meituan.android.neohybrid.core.a aVar, @NonNull String str, Map<String, Object> map) {
        Object[] objArr = {aVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8998dae93371296eee2298b1fce281b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8998dae93371296eee2298b1fce281b");
        } else {
            b(aVar, str, KernelConfig.CONTAINER_TYPE_NEO, map);
        }
    }

    public static void a(com.meituan.android.neohybrid.core.a aVar, String str, Map<String, Object> map, List<Float> list) {
        Object[] objArr = {aVar, str, map, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62e55bdbda18c0a6330fb1d371b49981", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62e55bdbda18c0a6330fb1d371b49981");
        } else if (aVar != null) {
            aVar.h().a(str, map, list);
        } else {
            c.a(str, map, list);
        }
    }

    public static void c(com.meituan.android.neohybrid.core.a aVar, String str, Map<String, Object> map) {
        Object[] objArr = {aVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6785bd7f89e1ad4ce88e50d350a3ee90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6785bd7f89e1ad4ce88e50d350a3ee90");
        } else {
            a(aVar, str, map, (List<Float>) null);
        }
    }

    public static void a(com.meituan.android.neohybrid.core.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d8d73cce524466f25207419661c150b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d8d73cce524466f25207419661c150b2");
        } else {
            c(aVar, str, null);
        }
    }
}
