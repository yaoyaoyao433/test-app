package com.sankuai.waimai.launcher.init.mainly;

import android.app.Application;
import com.meituan.android.common.mtguard.MTGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.router.method.Func0;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class o extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "MTGuardInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0027eca37898e0e7bff5f34b4064d8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0027eca37898e0e7bff5f34b4064d8b");
        } else if (!com.sankuai.meituan.takeoutnew.a.i) {
            com.sankuai.waimai.router.a.a();
            ((Func0) com.sankuai.waimai.router.a.a(Func0.class, "mtguard_lazy_init")).call();
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.android.jarvis.c.a(), new Runnable() { // from class: com.sankuai.waimai.launcher.init.mainly.o.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f70f48ce3765c43ea0004d39a0259f7a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f70f48ce3765c43ea0004d39a0259f7a");
                    } else {
                        MTGuard.verify();
                    }
                }
            });
        }
    }
}
