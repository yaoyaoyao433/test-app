package com.dianping.monitor.impl;

import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import java.util.Random;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a = null;
    private static String b = "https://catdot.51ping.com/broker-service/api/config?";
    private static String c = "https://catdot.51ping.com/broker-service/crashlog";
    private static String d = "https://catdot.51ping.com/broker-service/commandbatch?";
    private static String e = "https://catdot.51ping.com/broker-service/api/speed?";
    private static String f = "https://catdot.51ping.com/broker-service/hijack?";
    private static String g = "https://catdot.51ping.com/broker-service/metrictag";
    private static volatile int h = 0;
    private static boolean i = false;
    private static boolean j = false;
    private static boolean k = false;
    private static Random l = new Random();

    public static int a() {
        return h;
    }

    public static String b() {
        return i ? c : "https://catdot.dianping.com/broker-service/crashlog";
    }

    public static String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48a63b9b4df7ca74af073dfdb780dccb", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48a63b9b4df7ca74af073dfdb780dccb");
        }
        if (i) {
            return d;
        }
        return j() + "/broker-service/commandbatch?";
    }

    public static String d() {
        return i ? e : "https://catdot.dianping.com/broker-service/api/speed?";
    }

    public static String e() {
        return i ? f : "https://catdot.dianping.com/broker-service/hijack?";
    }

    private static String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96185cf755d547194381a0fad78727c6", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96185cf755d547194381a0fad78727c6");
        }
        List<String> p = com.dianping.monitor.b.p();
        if (p == null || p.isEmpty()) {
            return "https://catdot.dianping.com";
        }
        int size = p.size();
        return AbsApiFactory.HTTPS + p.get(l.nextInt(size)).trim();
    }

    public static String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1dd672f5f0a3796bbbb9df1da9af9a64", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1dd672f5f0a3796bbbb9df1da9af9a64");
        }
        if (i) {
            return g;
        }
        return j() + "/broker-service/metrictag";
    }

    public static String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "25fe9abe98eb7e3f554756a005ac6ec2", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "25fe9abe98eb7e3f554756a005ac6ec2");
        }
        if (i || j) {
            return "https://catdot.51ping.com/broker-service/metrictagmrn";
        }
        return j() + "/broker-service/metrictagmrn";
    }

    public static void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52129577d514a71b1cf7582393d0d1e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52129577d514a71b1cf7582393d0d1e0");
            return;
        }
        i = z;
        com.dianping.logreportswitcher.utils.c.a(z);
    }

    public static boolean h() {
        return i;
    }

    public static boolean i() {
        return k;
    }
}
