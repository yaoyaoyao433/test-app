package com.sankuai.waimai.store.util;

import android.os.SystemClock;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.monitor.StoreError;
import com.sankuai.waimai.store.util.monitor.monitor.StoreException;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class ah {
    public static ChangeQuickRedirect a;

    public static void a(StoreError storeError, String str) {
        Object[] objArr = {storeError, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "67bef789bcb165d021db01baec1ffdb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "67bef789bcb165d021db01baec1ffdb5");
        } else {
            com.sankuai.waimai.store.util.monitor.c.a(storeError, a(), str);
        }
    }

    public static void a(StoreException storeException, String str) {
        Object[] objArr = {storeException, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "355ebb06848b06041257a84d63eed968", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "355ebb06848b06041257a84d63eed968");
        } else {
            com.sankuai.waimai.store.util.monitor.c.a(storeException, a(), str);
        }
    }

    private static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2dd7d57d59c9c3fe5c6f9f433958dae0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2dd7d57d59c9c3fe5c6f9f433958dae0") : a(Thread.currentThread());
    }

    private static String a(Thread thread) {
        Object[] objArr = {thread};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3c78b91f16f2d0409c57fda36508e43", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3c78b91f16f2d0409c57fda36508e43");
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
            sb2.append(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "825567974bc4f1986049ec2fe71f58e2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "825567974bc4f1986049ec2fe71f58e2") : Log.getStackTraceString(th));
            sb2.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            return sb2.toString();
        }
    }
}
