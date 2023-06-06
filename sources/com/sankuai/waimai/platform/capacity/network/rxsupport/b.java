package com.sankuai.waimai.platform.capacity.network.rxsupport;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b<T> extends j<T> {
    public static ChangeQuickRedirect d;

    public abstract void a(com.sankuai.waimai.platform.modular.network.error.a aVar);

    public abstract void a(T t);

    @Override // rx.e
    public void onCompleted() {
    }

    @Override // rx.e
    public void onError(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42cef5b6bc3eed26b7e95d844043b0e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42cef5b6bc3eed26b7e95d844043b0e6");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.a("RxSubscriber", th);
        if (th instanceof com.sankuai.waimai.platform.modular.network.error.a) {
            a((com.sankuai.waimai.platform.modular.network.error.a) th);
        } else {
            a(new com.sankuai.waimai.platform.modular.network.error.a(th));
        }
    }

    @Override // rx.e
    public void onNext(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f38f704311917accae0ca51231a979e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f38f704311917accae0ca51231a979e");
        } else {
            a((b<T>) t);
        }
    }
}
