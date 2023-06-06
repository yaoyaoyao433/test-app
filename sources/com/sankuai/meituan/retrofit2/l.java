package com.sankuai.meituan.retrofit2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.d;
import com.sankuai.meituan.retrofit2.e;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class l extends e.a {
    public static ChangeQuickRedirect b;
    public final Executor c;

    public l(Executor executor) {
        Object[] objArr = {executor};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07135f93de7799d3648d24826dabea2b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07135f93de7799d3648d24826dabea2b");
        } else {
            this.c = executor;
        }
    }

    @Override // com.sankuai.meituan.retrofit2.e.a
    public final e<Call<?>> a(Type type, Annotation[] annotationArr, ar arVar) {
        Object[] objArr = {type, annotationArr, arVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "169b033d152d940b1efd3a0f0ecb0463", 6917529027641081856L)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "169b033d152d940b1efd3a0f0ecb0463");
        }
        if (a(type) != Call.class) {
            return null;
        }
        final Type e = av.e(type);
        return new e<Call<?>>() { // from class: com.sankuai.meituan.retrofit2.l.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.retrofit2.e
            public final /* synthetic */ Call<?> a(Call call) {
                Object[] objArr2 = {call};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ec605ad135c0db3785925ca51160dfec", 6917529027641081856L) ? (Call) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ec605ad135c0db3785925ca51160dfec") : new a(l.this.c, call);
            }

            @Override // com.sankuai.meituan.retrofit2.e
            public final Type a() {
                return e;
            }
        };
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static final class a<T> implements Call<T> {
        public static ChangeQuickRedirect a;
        public final Executor b;
        public final Call<T> c;

        public a(Executor executor, Call<T> call) {
            Object[] objArr = {executor, call};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "521935cbbecf58d333a380d88ec80b39", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "521935cbbecf58d333a380d88ec80b39");
                return;
            }
            this.b = executor;
            this.c = call;
        }

        @Override // com.sankuai.meituan.retrofit2.Call
        public final void a(final f<T> fVar) {
            Object[] objArr = {fVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e435ec129e705aca7a77fda9a581a56", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e435ec129e705aca7a77fda9a581a56");
            } else if (fVar == null) {
                throw new NullPointerException("callback == null");
            } else {
                if ((fVar instanceof x) && this.c.e().i != null) {
                    Call<T> d = this.c.d();
                    d.e().i.e = d.b.LOCAL;
                    d.a(new f<T>() { // from class: com.sankuai.meituan.retrofit2.l.a.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.retrofit2.f
                        public final void onResponse(Call<T> call, final Response<T> response) {
                            Object[] objArr2 = {call, response};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "21f6b419b7ba20814f152f364088e636", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "21f6b419b7ba20814f152f364088e636");
                            } else {
                                com.sankuai.waimai.launcher.util.aop.b.a(a.this.b, new Runnable() { // from class: com.sankuai.meituan.retrofit2.l.a.1.1
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr3 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect3 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "43b142d25bf0b43c2187659bbf5f35e3", 6917529027641081856L)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "43b142d25bf0b43c2187659bbf5f35e3");
                                        } else if (a.this.c.c()) {
                                            new IOException("Canceled");
                                        }
                                    }
                                });
                            }
                        }

                        @Override // com.sankuai.meituan.retrofit2.f
                        public final void onFailure(Call<T> call, final Throwable th) {
                            Object[] objArr2 = {call, th};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "39635ecd01df13e9ef1c7780fb6be7e7", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "39635ecd01df13e9ef1c7780fb6be7e7");
                            } else {
                                com.sankuai.waimai.launcher.util.aop.b.a(a.this.b, new Runnable() { // from class: com.sankuai.meituan.retrofit2.l.a.1.2
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr3 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect3 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bef0c87c35754ddbd2699c8d5240c737", 6917529027641081856L)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bef0c87c35754ddbd2699c8d5240c737");
                                        }
                                    }
                                });
                            }
                        }
                    });
                }
                this.c.a(new f<T>() { // from class: com.sankuai.meituan.retrofit2.l.a.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.retrofit2.f
                    public final void onResponse(Call<T> call, final Response<T> response) {
                        Object[] objArr2 = {call, response};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1e99c345e97603dfeaefdef84ffdad1e", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1e99c345e97603dfeaefdef84ffdad1e");
                        } else {
                            com.sankuai.waimai.launcher.util.aop.b.a(a.this.b, new Runnable() { // from class: com.sankuai.meituan.retrofit2.l.a.2.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "db8c77235be7ea31f82dc43d7478fe92", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "db8c77235be7ea31f82dc43d7478fe92");
                                    } else if (a.this.c.c()) {
                                        fVar.onFailure(a.this, new IOException("Canceled"));
                                    } else {
                                        fVar.onResponse(a.this, response);
                                    }
                                }
                            });
                        }
                    }

                    @Override // com.sankuai.meituan.retrofit2.f
                    public final void onFailure(Call<T> call, final Throwable th) {
                        Object[] objArr2 = {call, th};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ed5884db4e7508a81cb3e57eab18edb7", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ed5884db4e7508a81cb3e57eab18edb7");
                        } else {
                            com.sankuai.waimai.launcher.util.aop.b.a(a.this.b, new Runnable() { // from class: com.sankuai.meituan.retrofit2.l.a.2.2
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "23cc5804a22af94e5e05939a06e8e4c7", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "23cc5804a22af94e5e05939a06e8e4c7");
                                    } else {
                                        fVar.onFailure(a.this, th);
                                    }
                                }
                            });
                        }
                    }
                });
            }
        }

        @Override // com.sankuai.meituan.retrofit2.Call
        public final boolean b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bb1edf8f55dbaa296a08083807899a2", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bb1edf8f55dbaa296a08083807899a2")).booleanValue() : this.c.b();
        }

        @Override // com.sankuai.meituan.retrofit2.Call
        public final Response<T> a() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23498938364c9f662b0538a51b1c033e", 6917529027641081856L) ? (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23498938364c9f662b0538a51b1c033e") : this.c.a();
        }

        @Override // com.sankuai.meituan.retrofit2.Call
        public final void cancel() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99ebe6d29fcfd55dd6dfd93c9fea8ddd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99ebe6d29fcfd55dd6dfd93c9fea8ddd");
            } else {
                this.c.cancel();
            }
        }

        @Override // com.sankuai.meituan.retrofit2.Call
        public final boolean c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e77f931171be636049bdc6b540c36104", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e77f931171be636049bdc6b540c36104")).booleanValue() : this.c.c();
        }

        @Override // com.sankuai.meituan.retrofit2.Call
        /* renamed from: d */
        public final Call<T> clone() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de6f1e31f60f6229ee59b9811e3ee9aa", 6917529027641081856L) ? (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de6f1e31f60f6229ee59b9811e3ee9aa") : new a(this.b, this.c.d());
        }

        @Override // com.sankuai.meituan.retrofit2.Call
        public final aj e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72e866eb5f2f954a4df076aa12478b10", 6917529027641081856L) ? (aj) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72e866eb5f2f954a4df076aa12478b10") : this.c.e();
        }
    }
}
