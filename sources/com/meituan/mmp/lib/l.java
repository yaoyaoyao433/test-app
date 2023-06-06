package com.meituan.mmp.lib;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {
    public static ChangeQuickRedirect a;
    private final a b;

    private l(a aVar) {
        this.b = aVar;
    }

    public static Runnable a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f124af95774253df6bd8c6495921292b", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f124af95774253df6bd8c6495921292b") : new l(aVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45e3a61696bd39d18acc2d5601deb03f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45e3a61696bd39d18acc2d5601deb03f");
        } else {
            a.b(this.b);
        }
    }
}
