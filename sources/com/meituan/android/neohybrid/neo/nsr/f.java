package com.meituan.android.neohybrid.neo.nsr;

import android.content.Context;
import android.os.Bundle;
import com.meituan.android.neohybrid.core.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {
    public static ChangeQuickRedirect a;
    private final d b;
    private final Context c;
    private final Bundle d;

    private f(d dVar, Context context, Bundle bundle) {
        this.b = dVar;
        this.c = context;
        this.d = bundle;
    }

    public static Runnable a(d dVar, Context context, Bundle bundle) {
        Object[] objArr = {dVar, context, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a753d85a456f2934e7786dae9cc073a", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a753d85a456f2934e7786dae9cc073a") : new f(dVar, context, bundle);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "927d0fe988e81f2e60e5d0c7283d1209", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "927d0fe988e81f2e60e5d0c7283d1209");
            return;
        }
        d dVar = this.b;
        Context context = this.c;
        Bundle bundle = this.d;
        Object[] objArr2 = {dVar, context, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "94f5fa04b552e8002bec0298bc6d11fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "94f5fa04b552e8002bec0298bc6d11fa");
        } else {
            dVar.b.a(w.a(context, dVar.b), bundle);
        }
    }
}
