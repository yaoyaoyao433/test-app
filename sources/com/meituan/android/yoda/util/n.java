package com.meituan.android.yoda.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public static ChangeQuickRedirect a;
    private final m b;
    private final Runnable c;

    private n(m mVar, Runnable runnable) {
        this.b = mVar;
        this.c = runnable;
    }

    public static Runnable a(m mVar, Runnable runnable) {
        Object[] objArr = {mVar, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f58daa6883ba0a57519bd400d1d096e2", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f58daa6883ba0a57519bd400d1d096e2") : new n(mVar, runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85c0f433b0af4452faa67f322b105b70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85c0f433b0af4452faa67f322b105b70");
            return;
        }
        m mVar = this.b;
        Runnable runnable = this.c;
        Object[] objArr2 = {mVar, runnable};
        ChangeQuickRedirect changeQuickRedirect2 = m.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d2bfd1fea3cb4439087e77ffd6cb2c11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d2bfd1fea3cb4439087e77ffd6cb2c11");
        } else if (mVar.a()) {
        } else {
            mVar.c.execute(runnable);
        }
    }
}
