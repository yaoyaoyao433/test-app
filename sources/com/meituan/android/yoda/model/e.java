package com.meituan.android.yoda.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public static ChangeQuickRedirect a;
    private final b b;
    private final String c;
    private final String d;

    private e(b bVar, String str, String str2) {
        this.b = bVar;
        this.c = str;
        this.d = str2;
    }

    public static Runnable a(b bVar, String str, String str2) {
        Object[] objArr = {bVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9c2d0223215b0df0dcc63bc50aaf607", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9c2d0223215b0df0dcc63bc50aaf607") : new e(bVar, str, str2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcefcf1db21e440268c66e87e21954ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcefcf1db21e440268c66e87e21954ae");
        } else {
            b.b(this.b, this.c, this.d);
        }
    }
}
