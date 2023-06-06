package com.sankuai.meituan.retrofit2.adapter.rxjava;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.Response;
import rx.d;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d<T> implements d.a<c<T>> {
    public static ChangeQuickRedirect a;
    private final d.a<Response<T>> b;

    @Override // rx.functions.b
    public final /* synthetic */ void call(Object obj) {
        j jVar = (j) obj;
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c32ea7dd397e46c5bb19ef461565c2b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c32ea7dd397e46c5bb19ef461565c2b");
        } else {
            this.b.call(new a(jVar));
        }
    }

    public d(d.a<Response<T>> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7de61909f2dc1827a4ec6fd795735fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7de61909f2dc1827a4ec6fd795735fd");
        } else {
            this.b = aVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a<R> extends j<Response<R>> {
        public static ChangeQuickRedirect a;
        private final j<? super c<R>> b;

        @Override // rx.e
        public final /* synthetic */ void onNext(Object obj) {
            Response response = (Response) obj;
            Object[] objArr = {response};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4204a9ab19f48d536dcbf100f394c9e9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4204a9ab19f48d536dcbf100f394c9e9");
            } else {
                this.b.onNext(c.a(response));
            }
        }

        public a(j<? super c<R>> jVar) {
            super(jVar);
            Object[] objArr = {jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcb0afa62ade6d94daba31893548f418", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcb0afa62ade6d94daba31893548f418");
            } else {
                this.b = jVar;
            }
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            Object[] objArr = {th};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9980f4a6b9558d5a2726ac5418fcedba", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9980f4a6b9558d5a2726ac5418fcedba");
                return;
            }
            try {
                this.b.onNext(c.a(th));
                this.b.onCompleted();
            } catch (Throwable th2) {
                this.b.onError(th2);
            }
        }

        @Override // rx.e
        public final void onCompleted() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6aca181edfba119b8afb85d6c050efc0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6aca181edfba119b8afb85d6c050efc0");
            } else {
                this.b.onCompleted();
            }
        }
    }
}
