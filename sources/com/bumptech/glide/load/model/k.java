package com.bumptech.glide.load.model;

import com.dianping.picasso.view.scroller.CustomizedScrollView;
import java.util.Queue;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class k<A, B> {
    public final com.bumptech.glide.util.e<a<A>, B> a;

    public k() {
        this(CustomizedScrollView.ANIMATED_SCROLL_GAP);
    }

    public k(int i) {
        this.a = new com.bumptech.glide.util.e<a<A>, B>(i) { // from class: com.bumptech.glide.load.model.k.1
            @Override // com.bumptech.glide.util.e
            public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
                ((a) obj).a();
            }
        };
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class a<A> {
        private static final Queue<a<?>> a = com.bumptech.glide.util.h.a(0);
        private int b;
        private int c;
        private A d;

        public static <A> a<A> a(A a2, int i, int i2) {
            a<A> aVar = (a<A>) a.poll();
            if (aVar == null) {
                aVar = new a<>();
            }
            ((a) aVar).d = a2;
            ((a) aVar).c = i;
            ((a) aVar).b = i2;
            return aVar;
        }

        private a() {
        }

        public final void a() {
            a.offer(this);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.c == aVar.c && this.b == aVar.b && this.d.equals(aVar.d);
            }
            return false;
        }

        public final int hashCode() {
            return (((this.b * 31) + this.c) * 31) + this.d.hashCode();
        }
    }
}
