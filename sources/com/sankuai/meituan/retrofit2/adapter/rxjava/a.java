package com.sankuai.meituan.retrofit2.adapter.rxjava;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.Response;
import rx.d;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a<T> implements d.a<T> {
    public static ChangeQuickRedirect a;
    private final d.a<Response<T>> b;

    @Override // rx.functions.b
    public final /* synthetic */ void call(Object obj) {
        j jVar = (j) obj;
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b40e09f592fdc9487f4df6b65c27658", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b40e09f592fdc9487f4df6b65c27658");
        } else {
            this.b.call(new C0624a(jVar));
        }
    }

    public a(d.a<Response<T>> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1556752ff3c1cbb111b499e457230c4b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1556752ff3c1cbb111b499e457230c4b");
        } else {
            this.b = aVar;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.retrofit2.adapter.rxjava.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0624a<R> extends j<Response<R>> {
        public static ChangeQuickRedirect a;
        private final j<? super R> b;
        private boolean c;

        @Override // rx.e
        public final /* synthetic */ void onNext(Object obj) {
            Response response = (Response) obj;
            Object[] objArr = {response};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62ecb3bf3030ff56afeff9ce8612e76d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62ecb3bf3030ff56afeff9ce8612e76d");
            } else if (response.f()) {
                this.b.onNext((Object) response.e());
            } else {
                this.c = true;
                this.b.onError(new com.sankuai.meituan.retrofit2.exception.c(response));
            }
        }

        public C0624a(j<? super R> jVar) {
            super(jVar);
            Object[] objArr = {jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9e53b858ed4fca33191b77e406767ed", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9e53b858ed4fca33191b77e406767ed");
            } else {
                this.b = jVar;
            }
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            Object[] objArr = {th};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e7ae187561a674e1cf0f21cef6b032b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e7ae187561a674e1cf0f21cef6b032b");
            } else if (this.c) {
            } else {
                this.b.onError(th);
            }
        }

        @Override // rx.e
        public final void onCompleted() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a58f3ed5597ae908993a75aeffa43798", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a58f3ed5597ae908993a75aeffa43798");
            } else if (this.c) {
            } else {
                this.b.onCompleted();
            }
        }
    }
}
