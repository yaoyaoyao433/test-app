package com.meituan.mtwebkit.internal.mode;

import com.meituan.mtwebkit.internal.system.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends e {
    public static ChangeQuickRedirect g;

    @Override // com.meituan.mtwebkit.internal.mode.e, com.meituan.mtwebkit.internal.m
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6757c65c9694b76fce037d71301c42c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6757c65c9694b76fce037d71301c42c");
        } else {
            b = new y();
        }
    }
}
