package com.dianping.nvnetwork.failover.fetcher;

import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.failover.fetcher.b;
import com.dianping.nvnetwork.l;
import com.dianping.nvnetwork.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class e extends a {
    public static ChangeQuickRedirect l;
    private k e;

    public abstract rx.d<q> a(Request request);

    @Override // com.dianping.nvnetwork.failover.fetcher.b
    public void b(final Request request, final b.a aVar) {
        Object[] objArr = {request, aVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22a4364bbe89dcb08b5b5c41e817b1f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22a4364bbe89dcb08b5b5c41e817b1f7");
            return;
        }
        a(request, aVar);
        this.e = rx.d.a(new l<q>() { // from class: com.dianping.nvnetwork.failover.fetcher.e.1
            public static ChangeQuickRedirect b;

            @Override // com.dianping.nvnetwork.l, rx.e
            public final /* synthetic */ void onNext(Object obj) {
                q qVar = (q) obj;
                Object[] objArr2 = {qVar};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6a72fbec1dfaf16cf7ce404a8852c386", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6a72fbec1dfaf16cf7ce404a8852c386");
                } else {
                    e.this.a(request, qVar, aVar);
                }
            }

            @Override // com.dianping.nvnetwork.l, rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b0da0ec009f88c55876d2aaadc011907", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b0da0ec009f88c55876d2aaadc011907");
                    return;
                }
                super.onError(th);
                e.this.a(request, e.this.b, th, aVar);
            }
        }, a(request));
    }

    @Override // com.dianping.nvnetwork.failover.fetcher.a, com.dianping.nvnetwork.failover.fetcher.b
    public void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3daf629903ab01a2fca3dca30dfff6ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3daf629903ab01a2fca3dca30dfff6ee");
            return;
        }
        super.cancel();
        if (this.e == null || this.e.isUnsubscribed()) {
            return;
        }
        this.e.unsubscribe();
    }
}
