package com.meituan.android.yoda.util;

import android.os.Handler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class m {
    public static ChangeQuickRedirect a;
    public Handler b;
    public ExecutorService c;

    public m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dee46a0e2539926b5311dc2dbd9d527f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dee46a0e2539926b5311dc2dbd9d527f");
        } else {
            this.c = com.sankuai.android.jarvis.c.b("yoda-async-factory");
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5533fc4aa80f4b3297ce1edae532e2a4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5533fc4aa80f4b3297ce1edae532e2a4")).booleanValue() : this.c == null || this.c.isShutdown() || this.c.isTerminated();
    }
}
