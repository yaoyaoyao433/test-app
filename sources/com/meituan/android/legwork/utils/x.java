package com.meituan.android.legwork.utils;

import android.text.TextUtils;
import android.util.Log;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.android.legwork.bean.monitor.FuncConfigBean;
import com.meituan.metrics.lifecycle.MetricsActivityLifecycleManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class x {
    public static ChangeQuickRedirect a;
    private static ThreadLocal<StringBuilder> b = new ThreadLocal<StringBuilder>() { // from class: com.meituan.android.legwork.utils.x.1
        public static ChangeQuickRedirect a;

        @Override // java.lang.ThreadLocal
        public final /* synthetic */ StringBuilder initialValue() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2d6dac9734333634d9eb3e8f83e503f", RobustBitConfig.DEFAULT_VALUE) ? (StringBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2d6dac9734333634d9eb3e8f83e503f") : new StringBuilder(256);
        }
    };
    private static long c = 0;
    private static long d = 0;
    private static boolean e = false;

    public static void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "5477b1db7d8f05ca21225cc78bbaa108", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "5477b1db7d8f05ca21225cc78bbaa108");
        } else {
            a(3, str, false, objArr);
        }
    }

    @Deprecated
    public static void b(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "4f8d8e1c9d82dbf79ce17e9eedd9b54d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "4f8d8e1c9d82dbf79ce17e9eedd9b54d");
        } else {
            a(4, str, false, objArr);
        }
    }

    public static void c(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "a34ccfabae8db60649fec0d5fb53b1b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "a34ccfabae8db60649fec0d5fb53b1b4");
        } else {
            a(4, str, false, objArr);
        }
    }

    public static void d(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "9ac2e24b4ab6175b5f5dde28a79a241a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "9ac2e24b4ab6175b5f5dde28a79a241a");
        } else {
            a(4, str, true, objArr);
        }
    }

    public static void e(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "62b90d35e9942a07adb504953649ac1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "62b90d35e9942a07adb504953649ac1b");
        } else {
            a(6, str, true, objArr);
        }
    }

    private static void a(int i, String str, boolean z, Object... objArr) {
        Object[] objArr2 = {Integer.valueOf(i), str, Byte.valueOf(z ? (byte) 1 : (byte) 0), objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "90468d77f9e6ba5db85ef8de24abe8f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "90468d77f9e6ba5db85ef8de24abe8f5");
            return;
        }
        String f = f(str, objArr);
        if (TextUtils.isEmpty(f)) {
            return;
        }
        if (com.meituan.android.legwork.a.b) {
            Log.println(i, str, f);
        }
        if (i == 4 || i == 6) {
            com.dianping.networklog.c.a(f, 3, new String[]{"LegworkLog"});
        }
        if (i == 6 || z) {
            HashMap hashMap = new HashMap(4);
            hashMap.put("time", Long.valueOf(com.meituan.android.time.c.b()));
            hashMap.put("logMessage", f);
            q.a("LegworkLog", 2048, hashMap);
        }
    }

    private static String f(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "a285144b462d32e555520a9be9ae1ca6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "a285144b462d32e555520a9be9ae1ca6");
        }
        if (TextUtils.isEmpty(str) || objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuilder sb = b.get();
        sb.setLength(0);
        sb.append("[");
        sb.append(str);
        sb.append("][");
        for (Object obj : objArr) {
            if (obj instanceof Throwable) {
                String stackTraceString = Log.getStackTraceString((Throwable) obj);
                if (TextUtils.isEmpty(stackTraceString)) {
                    stackTraceString = obj.toString();
                }
                sb.append(stackTraceString);
            } else {
                sb.append(obj);
            }
        }
        sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        return sb.toString();
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d959c71785fecfd7bb92ad47594a2bf3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d959c71785fecfd7bb92ad47594a2bf3");
            return;
        }
        b(str);
        long b2 = com.meituan.android.time.c.b();
        if (b2 - d < 1000) {
            return;
        }
        String b3 = com.meituan.android.legwork.a.b();
        d = b2;
        HashMap hashMap = new HashMap(4);
        hashMap.put("from", str);
        hashMap.put("pageName", b3);
        q.a("legwork_take_screenshot", 128, hashMap);
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7beb999033635ff834f64e4204bfd507", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7beb999033635ff834f64e4204bfd507");
            return;
        }
        long b2 = com.meituan.android.time.c.b();
        if (b2 - c < LocationStrategy.LOCATION_TIMEOUT) {
            return;
        }
        d("PtLog.reportLogan()", TextUtils.equals("clickService", str) ? "用户点击联系客服，上传日志" : "跑腿页面在前台时，用户截屏，上传日志");
        c = b2;
        com.dianping.networklog.c.a(new String[]{g.a("yyyy-MM-dd", b2)}, com.meituan.android.legwork.common.hostInfo.b.e().d(), "legwork");
    }

    public static void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5381d440c8c27a0666514c7afd1a7993", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5381d440c8c27a0666514c7afd1a7993");
        } else if (e) {
            com.meituan.crashreporter.c.a(th, 1, MetricsActivityLifecycleManager.currentActivity, false);
        }
    }

    public static void a(FuncConfigBean funcConfigBean) {
        Object[] objArr = {funcConfigBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aa2ba3d5c37d5ef87ce75ec4da943b5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aa2ba3d5c37d5ef87ce75ec4da943b5f");
        } else if (funcConfigBean == null) {
        } else {
            e = !funcConfigBean.support;
        }
    }
}
