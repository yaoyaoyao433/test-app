package com.meituan.android.ptcommonim.video.record.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public static ChangeQuickRedirect a;
    private final c b;
    private final Object c;

    public e(c cVar, Object obj) {
        this.b = cVar;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7c817a538e88467c15e7c202bdc77cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7c817a538e88467c15e7c202bdc77cc");
            return;
        }
        c cVar = this.b;
        Object obj = this.c;
        Object[] objArr2 = {cVar, obj};
        ChangeQuickRedirect changeQuickRedirect2 = c.d;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4398602487d61391c6c91759ca3455f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4398602487d61391c6c91759ca3455f5");
        } else if (cVar.b()) {
        } else {
            cVar.a(obj);
        }
    }
}
