package com.sankuai.waimai.store.widgets.smoothnestedscroll.core;

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
import com.sankuai.shangou.stone.util.n;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    a b;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.widgets.smoothnestedscroll.core.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC1345b {
        public abstract int a(@NonNull b bVar, int i);

        public void a(@NonNull b bVar, int i, int i2) {
        }

        public abstract void a(Runnable runnable);

        public abstract void b(Runnable runnable);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
        Integer a(@NonNull View view, int i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class d extends AbstractC1345b {
        public static ChangeQuickRedirect a;
        @NonNull
        protected final View b;
        @Nullable
        private final c c;

        public d(@NonNull View view) {
            this(view, null);
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02decf846e1729f9cb17baabd404a184", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02decf846e1729f9cb17baabd404a184");
            }
        }

        private d(@NonNull View view, @Nullable c cVar) {
            Object[] objArr = {view, null};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40bf4119dd4408aa9e86f7b8c7a85c10", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40bf4119dd4408aa9e86f7b8c7a85c10");
                return;
            }
            this.b = view;
            this.c = null;
        }

        @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.core.b.AbstractC1345b
        public final int a(@NonNull b bVar, int i) {
            int b;
            Integer a2;
            Object[] objArr = {bVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d221f4cb70a02c70ef5bb513317d489", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d221f4cb70a02c70ef5bb513317d489")).intValue();
            }
            if (this.c != null && (a2 = this.c.a(this.b, i)) != null) {
                return a2.intValue();
            }
            if (this.b instanceof NestedScrollView) {
                ScrollingView scrollingView = (ScrollingView) this.b;
                Object[] objArr2 = {scrollingView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = b.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1ea456623b3ff8b39b6dbdb8fdad8ca2", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1ea456623b3ff8b39b6dbdb8fdad8ca2")).intValue();
                }
                if (i == 0 || !(scrollingView instanceof View)) {
                    return 0;
                }
                int computeVerticalScrollOffset = scrollingView.computeVerticalScrollOffset();
                int computeVerticalScrollRange = scrollingView.computeVerticalScrollRange() - scrollingView.computeVerticalScrollExtent();
                if (computeVerticalScrollRange == 0 || (b = n.b(i + computeVerticalScrollOffset, 0, computeVerticalScrollRange)) == computeVerticalScrollOffset) {
                    return 0;
                }
                ((View) scrollingView).scrollTo(0, b);
                return b - computeVerticalScrollOffset;
            }
            if (ViewCompat.canScrollVertically(this.b, i <= 0 ? -1 : 1)) {
                this.b.scrollBy(0, i);
                return i;
            }
            return 0;
        }

        @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.core.b.AbstractC1345b
        public final void a(Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ef44bf988d263e271cd2c05f06fd0bb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ef44bf988d263e271cd2c05f06fd0bb");
            } else {
                ViewCompat.postOnAnimation(this.b, runnable);
            }
        }

        @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.core.b.AbstractC1345b
        public final void b(Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cfe54364a2da957745344e114be8851", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cfe54364a2da957745344e114be8851");
            } else {
                this.b.removeCallbacks(runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements Runnable {
        public static ChangeQuickRedirect a;
        private static float b;
        private static final float c;
        private final float d;
        private final int e;
        private final long f;
        private final int g;
        @NonNull
        private final AbstractC1345b h;
        private final b i;

        static {
            float log = (float) (Math.log(0.78d) / Math.log(0.9d));
            b = log;
            c = log - 1.0f;
        }

        public a(Context context, @NonNull b bVar, @NonNull AbstractC1345b abstractC1345b, int i, int i2) {
            Object[] objArr = {context, bVar, abstractC1345b, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fc991459ffb254fcc653c7e216bc238", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fc991459ffb254fcc653c7e216bc238");
                return;
            }
            this.f = AnimationUtils.currentAnimationTimeMillis();
            this.d = ViewConfiguration.getScrollFriction() * context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
            this.e = i2;
            this.g = b(i2);
            this.h = abstractC1345b;
            this.i = bVar;
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57859b931a934c1a4571b343dd4d1b59", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57859b931a934c1a4571b343dd4d1b59");
                return;
            }
            int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.f);
            int i = this.g - currentAnimationTimeMillis;
            if (i <= 0) {
                a(0, 0, "timeout passed " + currentAnimationTimeMillis);
                return;
            }
            int c2 = c(i) * n.a(this.e);
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d6aaff24fffc29a7d83039e2bb6676a", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d6aaff24fffc29a7d83039e2bb6676a")).intValue();
            }
            com.sankuai.shangou.stone.util.log.a.a("Flinger_Scroll", "scroll by %d, scroller = %s", Integer.valueOf(i), this.h);
            return this.h.a(this.i, i);
        }

        private void a(int i, int i2, String str) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3cb2d5516887e4d532146a83ac3bd3f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3cb2d5516887e4d532146a83ac3bd3f");
                return;
            }
            this.i.b = null;
            this.h.a(this.i, i, i2);
            com.sankuai.shangou.stone.util.log.a.a("Flinger", "onComplete, remain px = %d, v = %d, cause = %s, scroller = %s", Integer.valueOf(i), Integer.valueOf(i2), str, this.h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void cancel() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eddea41acaa9c82edd569cb1bfd61932", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eddea41acaa9c82edd569cb1bfd61932");
                return;
            }
            this.i.b = null;
            this.h.b(this);
        }

        private void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a592829c143c0a889886514b7358a128", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a592829c143c0a889886514b7358a128");
            } else {
                this.h.a(this);
            }
        }

        private int b(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "760756a3a497e6c6307b0a02950c1be1", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "760756a3a497e6c6307b0a02950c1be1")).intValue();
            }
            if (i == 0) {
                return 0;
            }
            try {
                return (int) (Math.exp(Math.log((Math.abs(i) * 0.35f) / this.d) / c) * 1000.0d);
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
                return 0;
            }
        }

        private int c(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1a72e78f71188a959fe8965ca92880a", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1a72e78f71188a959fe8965ca92880a")).intValue();
            }
            if (i <= 0) {
                return 0;
            }
            try {
                return (int) ((Math.exp(Math.log(i / 1000.0f) * c) * this.d) / 0.3499999940395355d);
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
                return 0;
            }
        }
    }

    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29dbcccfd6aebec746cb636a2a4b068d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29dbcccfd6aebec746cb636a2a4b068d");
            return;
        }
        if (this.b != null) {
            this.b.cancel();
            this.b = null;
        }
    }
}
