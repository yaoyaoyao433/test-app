package com.meituan.android.mrn.utils;

import android.text.TextUtils;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66d75f63371ba8dd00ca4b7539fcde6d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66d75f63371ba8dd00ca4b7539fcde6d");
        }
        try {
            return com.meituan.android.mrn.engine.n.a().b.i.f;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "01260665c317b73a1f6463e1583b47de", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "01260665c317b73a1f6463e1583b47de");
        }
        try {
            return com.meituan.android.mrn.engine.n.a().b.l;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5325ce1186838804a5180884a85aa8a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5325ce1186838804a5180884a85aa8a8");
        }
        try {
            return com.meituan.android.mrn.engine.n.a().b.k;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "03196b51cdff8e1cd3666342e827ca97", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "03196b51cdff8e1cd3666342e827ca97");
        }
        try {
            String c = c();
            return (TextUtils.isEmpty(c) || !c.contains(CommonConstant.Symbol.UNDERLINE)) ? "undefine" : c.split(CommonConstant.Symbol.UNDERLINE)[1];
        } catch (Exception unused) {
            return "";
        }
    }

    public static ReactContext e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf1c78d9825cb7d0b2d444050be1ec45", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactContext) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf1c78d9825cb7d0b2d444050be1ec45");
        }
        try {
            return com.meituan.android.mrn.engine.n.a().b.b.getCurrentReactContext();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7aa4e54f0da3f3154956ed99e09dbb65", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7aa4e54f0da3f3154956ed99e09dbb65");
        }
        ReactContext e = e();
        if (e == null) {
            return "";
        }
        try {
            return e().getPackageManager().getPackageInfo(e.getPackageName(), 16384).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be444f102df54909a65a3525d79f9bfb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be444f102df54909a65a3525d79f9bfb");
        }
        ReactContext e = e();
        if (e == null) {
            return "";
        }
        try {
            com.meituan.android.mrn.config.city.a a2 = com.meituan.android.mrn.config.d.a(e.getApplicationContext());
            if (a2 != null) {
                a2.a();
                return "unknown";
            }
            return "unknown";
        } catch (Exception unused) {
            return "unknown";
        }
    }
}
