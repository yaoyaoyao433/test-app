package com.sankuai.waimai.business.restaurant.poicontainer.pga;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class d<A, B> {
        public final A d;
        public final B e;

        public d(A a, B b) {
            this.d = a;
            this.e = b;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c<A, B, C> extends d<A, B> {
        public final C c;

        public c(A a, B b, C c) {
            super(a, b);
            this.c = c;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b<A, B, C, D> extends c<A, B, C> {
        public final D b;

        public b(A a, B b, C c, D d) {
            super(a, b, c);
            this.b = d;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.restaurant.poicontainer.pga.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0846a<A, B, C, D, E> extends b<A, B, C, D> {
        public final E a;

        public C0846a(A a, B b, C c, D d, E e) {
            super(a, b, c, d);
            this.a = e;
        }
    }
}
