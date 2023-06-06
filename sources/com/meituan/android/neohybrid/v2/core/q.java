package com.meituan.android.neohybrid.v2.core;

import android.webkit.ValueCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class q implements ValueCallback {
    public static ChangeQuickRedirect a;
    private static final q b = new q();

    public static ValueCallback a() {
        return b;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e30e345ac868a3fe62a61e0e60675ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e30e345ac868a3fe62a61e0e60675ef");
            return;
        }
        Object[] objArr2 = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = n.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0461a098a93fba8282208743a8c93009", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0461a098a93fba8282208743a8c93009");
        }
    }
}
