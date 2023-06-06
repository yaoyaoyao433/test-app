package com.sankuai.waimai.irmo.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class i {
    public static ChangeQuickRedirect a;
    private static volatile Executor b;

    public static Executor a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca0988585802569e4641241fc1608540", RobustBitConfig.DEFAULT_VALUE)) {
            return (Executor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca0988585802569e4641241fc1608540");
        }
        if (b == null) {
            synchronized (i.class) {
                if (b == null) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    b = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6b72bf5836c4534fe4ba70156bde6cdc", RobustBitConfig.DEFAULT_VALUE) ? (Executor) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6b72bf5836c4534fe4ba70156bde6cdc") : com.sankuai.android.jarvis.c.a();
                }
            }
        }
        return b;
    }
}
