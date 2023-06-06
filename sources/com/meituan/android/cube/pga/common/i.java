package com.meituan.android.cube.pga.common;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class i {
    public static ChangeQuickRedirect a;

    public static <A, B> c<A, B> a(A a2, B b2) {
        Object[] objArr = {a2, b2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c59a56fdaa14270e9080cbc9cd797e33", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c59a56fdaa14270e9080cbc9cd797e33") : new c<>(a2, b2);
    }

    public static <A, B, C, D> a<A, B, C, D> a(A a2, B b2, C c2, D d) {
        Object[] objArr = {a2, b2, c2, d};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d8e4f48f139596e877f3b5f4dacc9cb7", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d8e4f48f139596e877f3b5f4dacc9cb7") : new a<>(a2, b2, c2, d);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class c<A, B> {
        public final A c;
        public final B d;

        public c(A a, B b) {
            this.c = a;
            this.d = b;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b<A, B, C> extends c<A, B> {
        public final C b;

        public b(A a, B b, C c) {
            super(a, b);
            this.b = c;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a<A, B, C, D> extends b<A, B, C> {
        public final D a;

        public a(A a, B b, C c, D d) {
            super(a, b, c);
            this.a = d;
        }
    }
}
