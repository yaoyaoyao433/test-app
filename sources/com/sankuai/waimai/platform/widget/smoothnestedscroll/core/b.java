package com.sankuai.waimai.platform.widget.smoothnestedscroll.core;

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
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    a b;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.widget.smoothnestedscroll.core.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC1102b {
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
    public static class d extends AbstractC1102b {
        public static ChangeQuickRedirect a;
        @NonNull
        protected final View b;
        @Nullable
        private final c c;

        public d(@NonNull View view) {
            this(view, null);
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7c4571945d12173a88b73c7c93e653b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7c4571945d12173a88b73c7c93e653b");
            }
        }

        private d(@NonNull View view, @Nullable c cVar) {
            Object[] objArr = {view, null};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b8dc5e83001c8bfe3b67749ad3f36a7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b8dc5e83001c8bfe3b67749ad3f36a7");
                return;
            }
            this.b = view;
            this.c = null;
        }

        @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.b.AbstractC1102b
        public final int a(@NonNull b bVar, int i) {
            int b;
            Integer a2;
            Object[] objArr = {bVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4484f4f5032f55e9b36bfbf4bb31241c", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4484f4f5032f55e9b36bfbf4bb31241c")).intValue();
            }
            if (this.c != null && (a2 = this.c.a(this.b, i)) != null) {
                return a2.intValue();
            }
            if (this.b instanceof NestedScrollView) {
                ScrollingView scrollingView = (ScrollingView) this.b;
                Object[] objArr2 = {scrollingView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = b.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8d2bcbde42d35b5419b2ed487f83de1f", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8d2bcbde42d35b5419b2ed487f83de1f")).intValue();
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
            if (ViewCompat.canScrollVertically(this.b, i <= 0 ? -1 : 1)) {
                this.b.scrollBy(0, i);
                return i;
            }
            return 0;
        }

        @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.b.AbstractC1102b
        public final void a(Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "685e9cd0d73249f39ed32646a7194a85", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "685e9cd0d73249f39ed32646a7194a85");
            } else {
                ViewCompat.postOnAnimation(this.b, runnable);
            }
        }

        @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.b.AbstractC1102b
        public final void b(Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ec33a8bcb015fc0e2e30b0154b0b1bb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ec33a8bcb015fc0e2e30b0154b0b1bb");
            } else {
                this.b.removeCallbacks(runnable);
            }
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "312b7ad39ba610b25248e45b4f4af3e3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "312b7ad39ba610b25248e45b4f4af3e3") : new com.sankuai.waimai.foundation.utils.log.b().a(this.b).toString();
        }
    }

    public final boolean a(@NonNull Context context, @NonNull AbstractC1102b abstractC1102b, int i, int i2) {
        Object[] objArr = {context, abstractC1102b, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f7b06f1af34d2f4ef1475ec89423e54", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f7b06f1af34d2f4ef1475ec89423e54")).booleanValue();
        }
        if (context == null || (i == 0 && i2 == 0)) {
            return false;
        }
        cancel();
        com.sankuai.waimai.foundation.utils.log.a.b("Flinger", "fling start: remainedPixels = %d, v = %d, scroller = %s", Integer.valueOf(i), Integer.valueOf(i2), abstractC1102b);
        this.b = new a(context, this, abstractC1102b, i, i2);
        return true;
    }

    public final boolean a() {
        return this.b != null;
    }

    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "377f500a7ac44ec293f8038cf8fc130d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "377f500a7ac44ec293f8038cf8fc130d");
        } else if (a()) {
            this.b.cancel();
            this.b = null;
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
        private final AbstractC1102b h;
        private final b i;

        static {
            float log = (float) (Math.log(0.78d) / Math.log(0.9d));
            b = log;
            c = log - 1.0f;
        }

        public a(Context context, @NonNull b bVar, @NonNull AbstractC1102b abstractC1102b, int i, int i2) {
            Object[] objArr = {context, bVar, abstractC1102b, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c2f47d55a90d746df364a462fd65e8e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c2f47d55a90d746df364a462fd65e8e");
                return;
            }
            this.f = AnimationUtils.currentAnimationTimeMillis();
            this.d = ViewConfiguration.getScrollFriction() * context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
            this.e = i2;
            this.g = b(i2);
            this.h = abstractC1102b;
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36376ab3c95e04d1ba3dfe7cb1cde48d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36376ab3c95e04d1ba3dfe7cb1cde48d");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91f02b1661d70bfbe450fdfe210e3491", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91f02b1661d70bfbe450fdfe210e3491")).intValue();
            }
            com.sankuai.waimai.foundation.utils.log.a.b("Flinger_Scroll", "scroll by %d, scroller = %s", Integer.valueOf(i), this.h);
            return this.h.a(this.i, i);
        }

        private void a(int i, int i2, String str) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cd83138c5734a8f203189f895117b74", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cd83138c5734a8f203189f895117b74");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "774939824a154d686ed74f108ee62126", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "774939824a154d686ed74f108ee62126");
                return;
            }
            this.i.b = null;
            this.h.b(this);
        }

        private void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98bbd4b9ad7b4cacadd3d7941f65628e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98bbd4b9ad7b4cacadd3d7941f65628e");
            } else {
                this.h.a(this);
            }
        }

        private int b(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcaf0ca4e0a00b17a52428bcfb2d3130", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcaf0ca4e0a00b17a52428bcfb2d3130")).intValue();
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc3536c9142d0838740ac6bc7ab8fd0a", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc3536c9142d0838740ac6bc7ab8fd0a")).intValue();
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
