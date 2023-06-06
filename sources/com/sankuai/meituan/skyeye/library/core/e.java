package com.sankuai.meituan.skyeye.library.core;

import android.app.Application;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    private static ISkyeyeMonitor c;
    private static Application d;
    private static c e;
    private static a f;
    private static String g;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        String a;
    }

    public static ISkyeyeMonitor a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f1a7a5660dee3f83563dac9464394f1b", RobustBitConfig.DEFAULT_VALUE)) {
            return (ISkyeyeMonitor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f1a7a5660dee3f83563dac9464394f1b");
        }
        if (c == null) {
            synchronized (e.class) {
                if (c == null) {
                    c = new SkyeyeMonitorImpl();
                }
            }
        }
        return c;
    }

    public static c b() {
        return e;
    }

    public static void a(String str, String str2, String str3, Map map) {
        Object[] objArr = {str, str2, str3, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6cbed74a6a21180cea1fe061f9af557f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6cbed74a6a21180cea1fe061f9af557f");
        } else {
            a().a(str, str2, str3, map);
        }
    }

    public static void a(String str, String str2, String str3, String str4, Map map) {
        Object[] objArr = {str, str2, str3, str4, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2406e18502be7a2f690093514931cd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2406e18502be7a2f690093514931cd2");
        } else {
            a().a(str, str2, str3, str4, map);
        }
    }

    public static String c() {
        return g;
    }

    public static Context d() {
        return d;
    }

    public static synchronized String e() {
        synchronized (e.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "70f0f9d8dbfd6fc734a7bed65d647cb6", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "70f0f9d8dbfd6fc734a7bed65d647cb6");
            } else if (f == null || f.a == null) {
                return "NONE";
            } else {
                return f.a;
            }
        }
    }
}
