package com.meituan.android.paybase.wasmtest;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {
    public static ChangeQuickRedirect a;
    private final Context b;

    private a(Context context) {
        this.b = context;
    }

    public static Runnable a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "07adcae43840a2acccf488b6d1e307b3", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "07adcae43840a2acccf488b6d1e307b3") : new a(context);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "872c3f68d52adf93ca38612dcabcbfe4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "872c3f68d52adf93ca38612dcabcbfe4");
        } else {
            Wasm3Simple.b(this.b);
        }
    }
}
