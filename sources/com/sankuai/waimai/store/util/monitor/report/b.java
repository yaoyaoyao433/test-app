package com.sankuai.waimai.store.util.monitor.report;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b implements c {
    public static ChangeQuickRedirect a;

    private static String a(Thread thread) {
        Object[] objArr = {thread};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b22fe47e1e4e471dbca5ce6f50e20b67", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b22fe47e1e4e471dbca5ce6f50e20b67");
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("ThreadName=%s", thread.getName()));
            sb.append('\n');
            sb.append(String.format("Time=%s", Long.valueOf(SystemClock.currentThreadTimeMillis())));
            sb.append('\n');
            for (StackTraceElement stackTraceElement : thread.getStackTrace()) {
                sb.append(stackTraceElement);
                sb.append('\n');
            }
            return sb.toString();
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("dumpStacktrace with Exception:[");
            Object[] objArr2 = {th};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            sb2.append(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5b73367e79a56eb3856b91a5a90c70a0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5b73367e79a56eb3856b91a5a90c70a0") : Log.getStackTraceString(th));
            sb2.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            return sb2.toString();
        }
    }

    public static String a(@NonNull IMonitor iMonitor) {
        Object[] objArr = {iMonitor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dce6b901fd8200b7ecbf74a49a828e25", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dce6b901fd8200b7ecbf74a49a828e25");
        }
        com.sankuai.waimai.store.util.monitor.monitor.c b = iMonitor.b();
        String a2 = b != null ? b.a() : "";
        return TextUtils.isEmpty(a2) ? iMonitor.getClass().getSimpleName() : a2;
    }

    public static String b(@NonNull IMonitor iMonitor) {
        Object[] objArr = {iMonitor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "71166c9037d7aeab07698321e8275cc0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "71166c9037d7aeab07698321e8275cc0");
        }
        com.sankuai.waimai.store.util.monitor.monitor.c b = iMonitor.b();
        String c = b != null ? b.c() : "";
        return TextUtils.isEmpty(c) ? iMonitor.name() : c;
    }

    public static boolean c(@NonNull IMonitor iMonitor) {
        Object[] objArr = {iMonitor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aa8fc539bbc6b8450afe910b6489ca74", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aa8fc539bbc6b8450afe910b6489ca74")).booleanValue();
        }
        com.sankuai.waimai.store.util.monitor.monitor.c b = iMonitor.b();
        if (b != null) {
            return b.d();
        }
        return false;
    }

    public static boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8cdf69049d80d3a111f8e5d70d0cb6a9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8cdf69049d80d3a111f8e5d70d0cb6a9")).booleanValue();
        }
        com.sankuai.waimai.store.config.i h = com.sankuai.waimai.store.config.i.h();
        return h.a("sniffer_log_stacktrace_key/" + str + CommonConstant.Symbol.UNDERLINE + str2, false);
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c4ac612f4be2cb1d37f83a21532b1eed", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c4ac612f4be2cb1d37f83a21532b1eed") : a(Thread.currentThread());
    }
}
