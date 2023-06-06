package com.meituan.mtwebkit.internal.mode;

import com.meituan.mtwebkit.internal.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class e extends m {
    public static ChangeQuickRedirect h;

    @Override // com.meituan.mtwebkit.internal.m
    public void d() {
    }

    @Override // com.meituan.mtwebkit.internal.m
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e7adda945ce9287dbfdd7c9b22fe629", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e7adda945ce9287dbfdd7c9b22fe629");
            return;
        }
        synchronized (c) {
            if (b == null) {
                d();
            }
            this.f = true;
        }
    }
}
