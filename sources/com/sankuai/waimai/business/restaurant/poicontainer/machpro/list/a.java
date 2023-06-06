package com.sankuai.waimai.business.restaurant.poicontainer.machpro.list;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ScrollingView;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.o;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    RunnableC0844a b;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static abstract class b {
        public abstract int a(@NonNull a aVar, int i);

        public void a(@NonNull a aVar, int i, int i2) {
        }

        public abstract void a(Runnable runnable);

        public abstract void b(Runnable runnable);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface c {
        Integer a(@NonNull View view, int i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class d extends b {
        public static ChangeQuickRedirect a;
        @NonNull
        protected final View b;
        @Nullable
        private final c c;

        public d(@NonNull View view) {
            this(view, null);
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fdd688f31b64ef4df145aab3d273ae4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fdd688f31b64ef4df145aab3d273ae4");
            }
        }

        private d(@NonNull View view, @Nullable c cVar) {
            Object[] objArr = {view, null};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bd587fd301dfd4005a2193042b326f8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bd587fd301dfd4005a2193042b326f8");
                return;
            }
            this.b = view;
            this.c = null;
        }

        @Override // com.sankuai.waimai.business.restaurant.poicontainer.machpro.list.a.b
        public final int a(@NonNull a aVar, int i) {
            int b;
            Integer a2;
            Object[] objArr = {aVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf3ad4840d75af4a55f192d4a9a8ed87", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf3ad4840d75af4a55f192d4a9a8ed87")).intValue();
            }
            if (this.c != null && (a2 = this.c.a(this.b, i)) != null) {
                return a2.intValue();
            }
            if (this.b instanceof NestedScrollView) {
                ScrollingView scrollingView = (ScrollingView) this.b;
                Object[] objArr2 = {scrollingView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ea82e459c2840af66da027cc8e12cb79", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ea82e459c2840af66da027cc8e12cb79")).intValue();
                }
                if (i == 0 || !(scrollingView instanceof View)) {
                    return 0;
                }
                int computeVerticalScrollOffset = scrollingView.computeVerticalScrollOffset();
                int computeVerticalScrollRange = scrollingView.computeVerticalScrollRange() - scrollingView.computeVerticalScrollExtent();
                if (computeVerticalScrollRange == 0 || (b = o.b(i + computeVerticalScrollOffset, 0, computeVerticalScrollRange)) == computeVerticalScrollOffset) {
                    return 0;
                }
                ((View) scrollingView).scrollTo(0, b);
                return b - computeVerticalScrollOffset;
            }
            if ((i > 0 ? (char) 1 : (char) 65535) == 1 || this.b.canScrollVertically(-1)) {
                this.b.scrollBy(0, i);
                return i;
            }
            return 0;
        }

        @Override // com.sankuai.waimai.business.restaurant.poicontainer.machpro.list.a.b
        public final void a(Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3be05e0669bd424c773ab3f61370f987", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3be05e0669bd424c773ab3f61370f987");
            } else {
                ViewCompat.postOnAnimation(this.b, runnable);
            }
        }

        @Override // com.sankuai.waimai.business.restaurant.poicontainer.machpro.list.a.b
        public final void b(Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2c7c2d9666c888adca573bc5370d1ab", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2c7c2d9666c888adca573bc5370d1ab");
            } else {
                this.b.removeCallbacks(runnable);
            }
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f40fda60c12d8aedced5553ce5ce1415", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f40fda60c12d8aedced5553ce5ce1415") : new com.sankuai.waimai.foundation.utils.log.b().a(this.b).toString();
        }
    }

    public final boolean a() {
        return this.b != null;
    }

    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d54599019c804582e357bed4a37aaf5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d54599019c804582e357bed4a37aaf5");
        } else if (a()) {
            this.b.cancel();
            this.b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.restaurant.poicontainer.machpro.list.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class RunnableC0844a implements Runnable {
        public static ChangeQuickRedirect a;
        private static float b;
        private static final float c;
        private final float d;
        private final int e;
        private final long f;
        private final int g;
        @NonNull
        private final b h;
        private final a i;

        static {
            float log = (float) (Math.log(0.78d) / Math.log(0.9d));
            b = log;
            c = log - 1.0f;
        }

        public RunnableC0844a(Context context, @NonNull a aVar, @NonNull b bVar, int i, int i2) {
            Object[] objArr = {context, aVar, bVar, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e4e7abd6b37500bfacb17425b91d1d8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e4e7abd6b37500bfacb17425b91d1d8");
                return;
            }
            this.f = AnimationUtils.currentAnimationTimeMillis();
            this.d = ViewConfiguration.getScrollFriction() * context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
            this.e = i2;
            this.g = b(i2);
            this.h = bVar;
            this.i = aVar;
            if (this.g <= 0) {
                a(i, i2, "duration " + this.g);
            } else if (Math.abs(i) <= 0) {
                if (i2 != 0) {
                    a();
                } else {
                    a(i, i2, "startVelocity");
                }
            } else {
                int a2 = i - a(i);
                if (a2 == 0) {
                    a();
                } else {
                    a(a2, i2, "fling view");
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa43d91846d4456db8154371cae9ca27", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa43d91846d4456db8154371cae9ca27");
                return;
            }
            int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f);
            int i = this.g - currentAnimationTimeMillis;
            if (i <= 0) {
                a(0, 0, "timeout passed " + currentAnimationTimeMillis);
                return;
            }
            int c2 = c(i) * o.a(this.e);
            int i2 = c2 / 60;
            if (Math.abs(i2) <= 0) {
                a(i2, c2, "offset");
                return;
            }
            int a2 = i2 - a(i2);
            if (a2 == 0) {
                a();
            } else {
                a(a2, c2, "fling view");
            }
        }

        private int a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b0d30b3a0d6ec2408e4b347d2aab23e", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b0d30b3a0d6ec2408e4b347d2aab23e")).intValue();
            }
            com.sankuai.waimai.foundation.utils.log.a.b("Flinger_Scroll", "scroll by %d, scroller = %s", Integer.valueOf(i), this.h);
            return this.h.a(this.i, i);
        }

        private void a(int i, int i2, String str) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45995dec7fc9e2ddbc1c744d61f612ce", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45995dec7fc9e2ddbc1c744d61f612ce");
                return;
            }
            this.i.b = null;
            this.h.a(this.i, i, i2);
            com.sankuai.waimai.foundation.utils.log.a.b("Flinger", "onComplete, remain px = %d, v = %d, cause = %s, scroller = %s", Integer.valueOf(i), Integer.valueOf(i2), str, this.h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void cancel() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "806f74992185460ebb38c00181083f8c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "806f74992185460ebb38c00181083f8c");
                return;
            }
            this.i.b = null;
            this.h.b(this);
        }

        private void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "436ec8aaa36e1cac12ac5441edc4e224", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "436ec8aaa36e1cac12ac5441edc4e224");
            } else {
                this.h.a(this);
            }
        }

        private int b(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ef10f82b7710e1e4508da8682d1d6a1", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ef10f82b7710e1e4508da8682d1d6a1")).intValue();
            }
            if (i == 0) {
                return 0;
            }
            try {
                return (int) (Math.exp(Math.log((Math.abs(i) * 0.35f) / this.d) / c) * 1000.0d);
            } catch (Exception unused) {
                return 0;
            }
        }

        private int c(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "751273da07b591946203c24362a2e941", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "751273da07b591946203c24362a2e941")).intValue();
            }
            if (i <= 0) {
                return 0;
            }
            try {
                return (int) ((Math.exp(Math.log(i / 1000.0f) * c) * this.d) / 0.3499999940395355d);
            } catch (Exception unused) {
                return 0;
            }
        }
    }
}
