package com.dianping.nvtunnelkit.core;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class j<T> extends rx.j<T> {
    public static ChangeQuickRedirect c;

    @Override // rx.e
    public void onCompleted() {
    }

    @Override // rx.e
    public void onNext(T t) {
    }

    @Override // rx.e
    public void onError(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b49397db6a75aff20e1b581a4ae79e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b49397db6a75aff20e1b581a4ae79e1");
        } else {
            com.dianping.nvtunnelkit.logger.b.a(th);
        }
    }
}
