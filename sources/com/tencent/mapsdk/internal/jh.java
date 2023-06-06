package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.internal.jg;
import com.tencent.mapsdk.internal.jj;
import com.tencent.mapsdk.internal.jy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class jh<D extends jj> extends jq<D> implements jg<D> {
    @Override // com.tencent.mapsdk.internal.jg
    public final jg<D> a() {
        return this;
    }

    @Override // com.tencent.mapsdk.internal.jg
    public final void a(final String str, final D d, jg.a<Boolean> aVar) {
        jy.a((jy.g) new jy.g<Boolean>() { // from class: com.tencent.mapsdk.internal.jh.1
            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public Boolean call() {
                jh.this.b(str, (String) d);
                return Boolean.TRUE;
            }
        }).a((jy.d) new jy.e(Boolean.FALSE)).b(aVar);
    }

    @Override // com.tencent.mapsdk.internal.jg
    public final void a(final String str, final Class<D> cls, jg.a<D> aVar) {
        try {
            jy.a((jy.g) new jy.g<D>() { // from class: com.tencent.mapsdk.internal.jh.2
                private D a() {
                    return (D) jh.this.b(str, cls);
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() throws Exception {
                    return jh.this.b(str, cls);
                }
            }).a((jy.d) new jy.e(cls.newInstance())).b(aVar);
        } catch (IllegalAccessException e) {
            throw new Error("The " + cls.getSimpleName() + " must have a empty construct. #" + e.getMessage(), e);
        } catch (InstantiationException e2) {
            throw new Error("The " + cls.getSimpleName() + " must have a empty construct. #" + e2.getMessage(), e2);
        }
    }

    @Override // com.tencent.mapsdk.internal.jg
    public final void a(final String str, jg.a<Boolean> aVar) {
        jy.a((jy.g) new jy.g<Boolean>() { // from class: com.tencent.mapsdk.internal.jh.3
            private Boolean a() {
                return Boolean.valueOf(jh.this.b(str));
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() throws Exception {
                return Boolean.valueOf(jh.this.b(str));
            }
        }).a((jy.d) new jy.e(Boolean.FALSE)).b(aVar);
    }

    @Override // com.tencent.mapsdk.internal.jg
    public final void a(jg.a<Boolean> aVar) {
        jy.a((jy.g) new jy.g<Boolean>() { // from class: com.tencent.mapsdk.internal.jh.4
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public Boolean call() {
                jh.this.j();
                return Boolean.TRUE;
            }
        }).a((jy.d) new jy.e(Boolean.FALSE)).b(aVar);
    }

    @Override // com.tencent.mapsdk.internal.jg
    public final void b(jg.a<Long> aVar) {
        jy.a((jy.g) new jy.g<Long>() { // from class: com.tencent.mapsdk.internal.jh.5
            private Long a() {
                return Long.valueOf(jh.this.k());
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() throws Exception {
                return Long.valueOf(jh.this.k());
            }
        }).a((jy.d) new jy.e(0L)).b(aVar);
    }

    @Override // com.tencent.mapsdk.internal.jg
    public final void c(jg.a<Long> aVar) {
        jy.a((jy.g) new jy.g<Long>() { // from class: com.tencent.mapsdk.internal.jh.6
            private Long a() {
                return Long.valueOf(jh.this.l());
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() throws Exception {
                return Long.valueOf(jh.this.l());
            }
        }).a((jy.d) new jy.e(0L)).b(aVar);
    }

    @Override // com.tencent.mapsdk.internal.jg
    public final void d(jg.a<Long> aVar) {
        jy.a((jy.g) new jy.g<Long>() { // from class: com.tencent.mapsdk.internal.jh.7
            private Long a() {
                return Long.valueOf(jh.this.e());
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() throws Exception {
                return Long.valueOf(jh.this.e());
            }
        }).a((jy.d) new jy.e(0L)).b(aVar);
    }
}
