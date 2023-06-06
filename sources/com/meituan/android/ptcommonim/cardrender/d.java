package com.meituan.android.ptcommonim.cardrender;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public static ChangeQuickRedirect a;
    private final c b;
    private final String c;
    private final String d;

    private d(c cVar, String str, String str2) {
        this.b = cVar;
        this.c = str;
        this.d = str2;
    }

    public static Runnable a(c cVar, String str, String str2) {
        Object[] objArr = {cVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e80415443ac900193373dffbe9b2b717", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e80415443ac900193373dffbe9b2b717") : new d(cVar, str, str2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d47d0e8973199291b92bf1cd520eaf2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d47d0e8973199291b92bf1cd520eaf2b");
        } else {
            c.a(this.b, this.c, this.d);
        }
    }
}
