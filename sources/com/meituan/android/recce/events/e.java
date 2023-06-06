package com.meituan.android.recce.events;

import android.util.Log;
import com.meituan.android.recce.exception.RecceException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public static ChangeQuickRedirect a;
    private final d b;

    private e(d dVar) {
        this.b = dVar;
    }

    public static Runnable a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7832a2e6edb06e3f63d3bb33f3158144", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7832a2e6edb06e3f63d3bb33f3158144") : new e(dVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b03d032b3e7b23635d0019be12d7d4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b03d032b3e7b23635d0019be12d7d4b");
            return;
        }
        d dVar = this.b;
        Object[] objArr2 = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fd33c40f3de629ca0cb270c1be6ebdd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fd33c40f3de629ca0cb270c1be6ebdd0");
            return;
        }
        try {
            dVar.b.b.onBatchComplete();
        } catch (Throwable th) {
            Log.e("RecceEventDispatcher", "createOnBatchRunnable", th);
            dVar.b.a(RecceException.BATCH_COMPLETE_FAILED, th);
        }
    }
}
