package com.sankuai.waimai.store.network.rxsupport;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.repository.net.b;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a<T> extends j<T> {
    public static ChangeQuickRedirect d;

    public abstract void a(b bVar);

    public abstract void a(T t);

    @Override // rx.e
    public void onCompleted() {
    }

    @Override // rx.e
    public void onError(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8455a7c6f9903f0ab4634d41f6ea8884", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8455a7c6f9903f0ab4634d41f6ea8884");
            return;
        }
        com.sankuai.shangou.stone.util.log.a.a("RxSubscriber", th);
        if (th instanceof b) {
            a((b) th);
        } else {
            a(new b(th));
        }
    }

    @Override // rx.e
    public void onNext(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08c0fc21731f6571539685223ea0d234", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08c0fc21731f6571539685223ea0d234");
        } else {
            a((a<T>) t);
        }
    }
}
