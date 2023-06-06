package com.sankuai.waimai.mach.manager_new.common;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class f {
    public static ChangeQuickRedirect a;
    private static volatile Executor b;

    public static Executor a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aafb27f0bba82c588305373b6c99110e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Executor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aafb27f0bba82c588305373b6c99110e");
        }
        if (b == null) {
            synchronized (f.class) {
                if (b == null) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    b = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5c5feba8433126f6e92e0fe11f1317eb", RobustBitConfig.DEFAULT_VALUE) ? (Executor) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5c5feba8433126f6e92e0fe11f1317eb") : com.sankuai.android.jarvis.c.a();
                }
            }
        }
        return b;
    }
}
