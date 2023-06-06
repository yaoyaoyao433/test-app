package com.meituan.mmp.lib;

import com.meituan.mmp.lib.update.MMPAppProp;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public static ChangeQuickRedirect a;
    private final a b;
    private final MMPAppProp c;

    private g(a aVar, MMPAppProp mMPAppProp) {
        this.b = aVar;
        this.c = mMPAppProp;
    }

    public static Runnable a(a aVar, MMPAppProp mMPAppProp) {
        Object[] objArr = {aVar, mMPAppProp};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e86018d43c4373834f6b609fe657c9c", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e86018d43c4373834f6b609fe657c9c") : new g(aVar, mMPAppProp);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43573d72197df0fe7112888c9a3b7fbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43573d72197df0fe7112888c9a3b7fbb");
        } else {
            a.a(this.b, this.c);
        }
    }
}
