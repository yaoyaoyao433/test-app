package com.meituan.android.cashier.oneclick.util;

import android.content.Context;
import com.dianping.monitor.impl.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static int b;
    private static String c;

    public static void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b8c1a46d8f697625f7e5b62aa08b9ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b8c1a46d8f697625f7e5b62aa08b9ff");
            return;
        }
        a("paybiz_oneclickpay_verify", i);
        b("paymonitor_oneclickpay_verify", i);
    }

    public static void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a29fa75b9638a534f7dca9e6fffe8a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a29fa75b9638a534f7dca9e6fffe8a7");
            return;
        }
        a("paybiz_open_oneclickpay", i);
        b("paymonitor_open_oneclickpay", i);
    }

    public static void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f13724d6bb0503f735fe84b372c3ff2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f13724d6bb0503f735fe84b372c3ff2c");
            return;
        }
        b = i;
        a("paybiz_degrade_oneclickpay", i);
        b("paymonitor_degrade_oneclickpay", i);
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7446d5c553ee50b7c1241fd0bb0d07f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7446d5c553ee50b7c1241fd0bb0d07f6");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        return sb.toString();
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "19f460b72bfb922514622c2beda6aeb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "19f460b72bfb922514622c2beda6aeb4");
            return;
        }
        a("paybiz_oneclickpay_verify_url_error", -9753);
        b("paymonitor_oneclickpay_verify_url_error", -9753);
    }

    public static void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93d29bc77748092415f3284eb49a1c1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93d29bc77748092415f3284eb49a1c1a");
            return;
        }
        a("paybiz_oneclickpay_callback_fail", -9753);
        b("paymonitor_oneclickpay_callback_fail", -9753);
    }

    public static void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c1f9abc9642babef9172a9b194038120", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c1f9abc9642babef9172a9b194038120");
            return;
        }
        a("paybiz_pay_oneclickpay", i);
        b("paymonitor_pay_oneclickpay", i);
    }

    private static void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "398b8ba7d3902268b99f24f1da1ef111", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "398b8ba7d3902268b99f24f1da1ef111");
        } else {
            com.meituan.android.paybase.common.analyse.cat.a.a(str, i);
        }
    }

    private static void b(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8407b982b5f01e8561b9cb3b596b8962", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8407b982b5f01e8561b9cb3b596b8962");
        } else {
            c(str, i);
        }
    }

    private static void c(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f5c9bdbbbacb7f84782bac12a78f8c05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f5c9bdbbbacb7f84782bac12a78f8c05");
            return;
        }
        Context a2 = com.meituan.android.paybase.config.a.d().a();
        if (a2 != null) {
            m mVar = new m(26, a2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(Float.valueOf(1.0f));
            mVar.a(str, arrayList);
            mVar.a("app_name", com.meituan.android.paybase.config.a.d().k());
            mVar.a(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, com.meituan.android.paybase.config.a.d().l());
            mVar.a("nb_platform", "Android");
            mVar.a("os_version", com.meituan.android.paybase.config.a.d().e());
            mVar.a("nb_version", com.meituan.android.paybase.config.a.d().q());
            mVar.a("merchant_no", c);
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            mVar.a("code", sb.toString());
            mVar.a();
        }
    }

    public static void e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb46618fbdebc5b066d278ed69ba4787", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb46618fbdebc5b066d278ed69ba4787");
            return;
        }
        a("paybiz_dispatch_oneclickpay", i);
        b("paymonitor_dispatch_oneclickpay", i);
    }

    public static void a(String str) {
        c = str;
    }
}
