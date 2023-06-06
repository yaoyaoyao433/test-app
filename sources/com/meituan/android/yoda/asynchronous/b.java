package com.meituan.android.yoda.asynchronous;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements Runnable {
    public static ChangeQuickRedirect a;
    private WeakReference<a> b;

    public b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b314243bab41f7fb97d66e6524ff75b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b314243bab41f7fb97d66e6524ff75b9");
            return;
        }
        this.b = new WeakReference<>(aVar);
        com.meituan.android.yoda.monitor.log.a.a("SafeRunnable", "Constructor, task = " + this.b.get(), true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85dd2d3edc1ae94bcb6dd6c5a463f9b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85dd2d3edc1ae94bcb6dd6c5a463f9b0");
        } else if (this.b != null) {
            a aVar = this.b.get();
            if (aVar != null) {
                aVar.a();
            }
            com.meituan.android.yoda.monitor.log.a.a("SafeRunnable", "run, task = " + aVar, true);
        }
    }
}
