package com.dianping.sharkpush;

import com.dianping.nvnetwork.util.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final AtomicInteger b = new AtomicInteger(new Random(System.nanoTime()).nextInt());

    public static int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8af8078e6e0fd4562cd69cd66a9ac1e9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8af8078e6e0fd4562cd69cd66a9ac1e9")).intValue() : b.getAndIncrement();
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7343b19f20dc19e1de4040b05da03b40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7343b19f20dc19e1de4040b05da03b40");
            return;
        }
        if (b.b) {
            g.a(str + CommonConstant.Symbol.COLON + str2);
        }
        com.dianping.networklog.c.a(str + CommonConstant.Symbol.COLON + str2, 11);
    }
}
