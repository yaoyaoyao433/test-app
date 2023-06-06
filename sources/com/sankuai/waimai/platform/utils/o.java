package com.sankuai.waimai.platform.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class o {
    public static ChangeQuickRedirect a;
    private static volatile Executor b;

    public static Executor a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b4079a3024efdffbde17b8524fe02fdc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Executor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b4079a3024efdffbde17b8524fe02fdc");
        }
        if (b == null) {
            synchronized (o.class) {
                if (b == null) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    b = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e8a7032c7d646d2efc6390c4f9e9dc74", RobustBitConfig.DEFAULT_VALUE) ? (Executor) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e8a7032c7d646d2efc6390c4f9e9dc74") : com.sankuai.android.jarvis.c.a();
                }
            }
        }
        return b;
    }
}
