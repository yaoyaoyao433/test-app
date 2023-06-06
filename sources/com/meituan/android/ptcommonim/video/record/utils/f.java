package com.meituan.android.ptcommonim.video.record.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public static ChangeQuickRedirect a;
    private final c b;
    private final Throwable c;

    public f(c cVar, Throwable th) {
        this.b = cVar;
        this.c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d14f2fa3882ad2c2bf63d622f7f7f480", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d14f2fa3882ad2c2bf63d622f7f7f480");
            return;
        }
        c cVar = this.b;
        Object[] objArr2 = {cVar, this.c};
        ChangeQuickRedirect changeQuickRedirect2 = c.d;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5b731102c4e5aae538d02453576fd2a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5b731102c4e5aae538d02453576fd2a8");
        } else {
            cVar.b();
        }
    }
}
