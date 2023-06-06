package com.sankuai.meituan.retrofit2.adapter.rxjava;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.d;
import rx.j;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b<T> implements d.a<Response<T>> {
    public static ChangeQuickRedirect a;
    private final Call<T> b;

    @Override // rx.functions.b
    public final /* synthetic */ void call(Object obj) {
        j jVar = (j) obj;
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1f4e5ac8ed87a6326222c0cbc884f8d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1f4e5ac8ed87a6326222c0cbc884f8d");
            return;
        }
        a aVar = new a(this.b.d(), jVar);
        jVar.add(aVar);
        jVar.setProducer(aVar);
    }

    public b(Call<T> call) {
        Object[] objArr = {call};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb6921e6bf132fd6f6eeceb0ed07e125", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb6921e6bf132fd6f6eeceb0ed07e125");
        } else {
            this.b = call;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static final class a<T> extends AtomicBoolean implements rx.f, k {
        public static ChangeQuickRedirect a;
        private final Call<T> b;
        private final j<? super Response<T>> c;

        public a(Call<T> call, j<? super Response<T>> jVar) {
            Object[] objArr = {call, jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca413ea2fb8cf91fe4a39a67cd9bbbec", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca413ea2fb8cf91fe4a39a67cd9bbbec");
                return;
            }
            this.b = call;
            this.c = jVar;
        }

        @Override // rx.k
        public final void unsubscribe() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38d8fb4b92447125974ecca2743c1b7e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38d8fb4b92447125974ecca2743c1b7e");
            } else {
                this.b.cancel();
            }
        }

        @Override // rx.k
        public final boolean isUnsubscribed() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1aa33de432c8da311c00cb717213214", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1aa33de432c8da311c00cb717213214")).booleanValue() : this.b.c();
        }

        @Override // rx.f
        public final void a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3032c808c3f225bf7303be2c1e0e0183", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3032c808c3f225bf7303be2c1e0e0183");
            } else if (j == 0 || !compareAndSet(false, true)) {
            } else {
                try {
                    Response<T> a2 = this.b.a();
                    if (!this.b.c()) {
                        this.c.onNext(a2);
                    }
                    if (this.b.c()) {
                        return;
                    }
                    this.c.onCompleted();
                } catch (Throwable th) {
                    rx.exceptions.b.b(th);
                    if (this.b.c()) {
                        return;
                    }
                    this.c.onError(th);
                }
            }
        }
    }
}
