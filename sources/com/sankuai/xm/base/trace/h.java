package com.sankuai.xm.base.trace;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class h implements Runnable {
    public static ChangeQuickRedirect a;
    private Runnable b;
    private g c;

    public h(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dfb2f0f16d4f648501e423588252c8c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dfb2f0f16d4f648501e423588252c8c");
            return;
        }
        this.c = j.a();
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b55ba25ce7e78a28e6fd7871ca5fed37", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b55ba25ce7e78a28e6fd7871ca5fed37");
            return;
        }
        try {
            j.a(this.c);
            this.b.run();
            j.c(this.c);
        } catch (Throwable th) {
            j.a(this.c, th);
            throw th;
        }
    }

    public final Runnable a() {
        return this.b;
    }
}
