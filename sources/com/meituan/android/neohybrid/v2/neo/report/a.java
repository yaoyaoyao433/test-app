package com.meituan.android.neohybrid.v2.neo.report;

import android.support.annotation.NonNull;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.android.neohybrid.neo.report.b;
import com.meituan.android.neohybrid.neo.report.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(com.meituan.android.neohybrid.v2.core.a aVar, Map<String, ?> map) {
        Object[] objArr = {aVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a943222c6a998c90cd7206c73a394d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a943222c6a998c90cd7206c73a394d8");
        } else if (aVar != null) {
            aVar.c().a(map);
        }
    }

    public static void a(com.meituan.android.neohybrid.v2.core.a aVar, String str, Object obj) {
        Object[] objArr = {aVar, str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c111c8623680be96bc5087f85ae180ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c111c8623680be96bc5087f85ae180ce");
        } else if (aVar != null) {
            aVar.c().a(str, obj);
        }
    }

    public static void a(com.meituan.android.neohybrid.v2.core.a aVar, @NonNull String str, @NonNull String str2, Map<String, Object> map) {
        Object[] objArr = {aVar, str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b8d486cf4951742107be1e87bdc62f9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b8d486cf4951742107be1e87bdc62f9a");
        } else if (aVar != null) {
            aVar.c().a(str, str2, map);
        } else {
            b.a(str, str2, map);
        }
    }

    public static void a(com.meituan.android.neohybrid.v2.core.a aVar, @NonNull String str, Map<String, Object> map) {
        Object[] objArr = {aVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e2c296b58cf779138f41978f3286bf2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e2c296b58cf779138f41978f3286bf2b");
        } else {
            a(aVar, str, "c_pay_neo_js_sdk", map);
        }
    }

    public static void a(com.meituan.android.neohybrid.v2.core.a aVar, @NonNull String str, @NonNull String str2, String str3, Map<String, Object> map) {
        Object[] objArr = {aVar, str, str2, str3, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df2be2b17d86bf03297b920224cb544d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df2be2b17d86bf03297b920224cb544d");
        } else if (aVar != null) {
            aVar.c().a(str, str2, str3, map);
        } else {
            b.a(str, str2, str3, map);
        }
    }

    public static void b(com.meituan.android.neohybrid.v2.core.a aVar, @NonNull String str, String str2, Map<String, Object> map) {
        Object[] objArr = {aVar, str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5988bcbed36f36e5169bffebc5afbda4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5988bcbed36f36e5169bffebc5afbda4");
        } else {
            a(aVar, str, "c_pay_neo_js_sdk", str2, map);
        }
    }

    public static void b(com.meituan.android.neohybrid.v2.core.a aVar, @NonNull String str, Map<String, Object> map) {
        Object[] objArr = {aVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d5b4d1db69bcd885a50addeb5509d993", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d5b4d1db69bcd885a50addeb5509d993");
        } else {
            b(aVar, str, KernelConfig.CONTAINER_TYPE_NEO, map);
        }
    }

    public static void a(com.meituan.android.neohybrid.v2.core.a aVar, String str, Map<String, Object> map, List<Float> list) {
        Object[] objArr = {aVar, str, map, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b911ccd219b35110da9bd11baa8f6029", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b911ccd219b35110da9bd11baa8f6029");
        } else if (aVar != null) {
            aVar.c().a(str, map, list);
        } else {
            c.a(str, map, list);
        }
    }

    public static void c(com.meituan.android.neohybrid.v2.core.a aVar, String str, Map<String, Object> map) {
        Object[] objArr = {aVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "92a4c85ec636bb2c46cade2d47550371", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "92a4c85ec636bb2c46cade2d47550371");
        } else {
            a(aVar, str, map, (List<Float>) null);
        }
    }

    public static void a(com.meituan.android.neohybrid.v2.core.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c486d76a4d158f64281120f244415718", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c486d76a4d158f64281120f244415718");
        } else {
            c(aVar, str, null);
        }
    }
}
