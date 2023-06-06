package com.meituan.android.ptcommonim.video.record.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public static ChangeQuickRedirect a;
    private final c b;

    public d(c cVar) {
        this.b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5af597ff6b4b5c1086a846d4a5414ed4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5af597ff6b4b5c1086a846d4a5414ed4");
            return;
        }
        c cVar = this.b;
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = c.d;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d878956b147274dbbe3f8e663c3c113a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d878956b147274dbbe3f8e663c3c113a");
        } else if (cVar.b()) {
        } else {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = c.d;
            if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "b2eabc82c2ec823310904d98917e3c59", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "b2eabc82c2ec823310904d98917e3c59");
            }
        }
    }
}
