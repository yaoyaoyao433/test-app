package com.meituan.android.legwork.ui.jump;

import com.meituan.android.legwork.ui.jump.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements Runnable {
    public static ChangeQuickRedirect a;
    private final g.AnonymousClass3 b;

    private i(g.AnonymousClass3 anonymousClass3) {
        this.b = anonymousClass3;
    }

    public static Runnable a(g.AnonymousClass3 anonymousClass3) {
        Object[] objArr = {anonymousClass3};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "228558f73ee3a54c8f8e44b07f16d803", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "228558f73ee3a54c8f8e44b07f16d803") : new i(anonymousClass3);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10f75ab35676594af6f1826b9a624509", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10f75ab35676594af6f1826b9a624509");
            return;
        }
        g.AnonymousClass3 anonymousClass3 = this.b;
        Object[] objArr2 = {anonymousClass3};
        ChangeQuickRedirect changeQuickRedirect2 = g.AnonymousClass3.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "61186e8392bf57f7a16273c7213cbd68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "61186e8392bf57f7a16273c7213cbd68");
        } else {
            g.this.e();
        }
    }
}
