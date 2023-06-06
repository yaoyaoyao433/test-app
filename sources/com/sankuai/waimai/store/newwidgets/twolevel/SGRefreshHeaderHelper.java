package com.sankuai.waimai.store.newwidgets.twolevel;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.support.v4.widget.NestedScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class SGRefreshHeaderHelper {
    private static final int D;
    public static ChangeQuickRedirect a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static int m;
    public static int n;
    public static int o;
    public a A;
    public d B;
    public ValueAnimator.AnimatorUpdateListener C;
    private ValueAnimator E;
    private List<b> F;
    private boolean G;
    private int H;
    private boolean I;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    int p;
    int q;
    public int r;
    ValueAnimator s;
    ValueAnimator t;
    public AnimatorSet u;
    public NestedScrollView v;
    public int w;
    boolean x;
    float y;
    float z;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface ScrollType {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void b();

        void c();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a();

        void a(int i);

        void a(int i, float f, int i2, int i3, boolean z);

        void b();

        void c();

        void d();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
        void a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface d {

        /* compiled from: ProGuard */
        /* loaded from: classes5.dex */
        public interface a {
            void a();
        }

        void a(a aVar);
    }

    public static /* synthetic */ void d(SGRefreshHeaderHelper sGRefreshHeaderHelper) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, sGRefreshHeaderHelper, changeQuickRedirect, false, "6e331f0d7886034bebf71419fdd413f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sGRefreshHeaderHelper, changeQuickRedirect, false, "6e331f0d7886034bebf71419fdd413f4");
        } else if (!com.sankuai.waimai.foundation.utils.d.a(sGRefreshHeaderHelper.F)) {
            for (b bVar : sGRefreshHeaderHelper.F) {
                if (bVar != null) {
                    bVar.d();
                }
            }
        }
    }

    public static /* synthetic */ void g(SGRefreshHeaderHelper sGRefreshHeaderHelper) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, sGRefreshHeaderHelper, changeQuickRedirect, false, "198ea03ffee785d1fdb403dea55fc152", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sGRefreshHeaderHelper, changeQuickRedirect, false, "198ea03ffee785d1fdb403dea55fc152");
        } else if (!com.sankuai.waimai.foundation.utils.d.a(sGRefreshHeaderHelper.F)) {
            for (b bVar : sGRefreshHeaderHelper.F) {
                if (bVar != null) {
                    bVar.c();
                }
            }
        }
    }

    public SGRefreshHeaderHelper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a0456024749f2237068a5b1a540a600", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a0456024749f2237068a5b1a540a600");
            return;
        }
        this.f = b;
        this.g = c;
        this.h = c;
        this.i = 0;
        this.r = 0;
        this.G = false;
        this.I = false;
        this.x = true;
        this.C = new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.7
            public static ChangeQuickRedirect a;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object[] objArr2 = {valueAnimator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8917c8a95e306aed06b125d5d4376d21", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8917c8a95e306aed06b125d5d4376d21");
                    return;
                }
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                float f = intValue / SGRefreshHeaderHelper.this.k;
                SGRefreshHeaderHelper.this.a(intValue, f > 1.0f ? 1.0f : f, SGRefreshHeaderHelper.this.r, SGRefreshHeaderHelper.this.I ? 3 : 4, false);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "547416eebcb4287a3044fa180f9f61d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "547416eebcb4287a3044fa180f9f61d9");
        } else if (this.q <= 0) {
            b();
        } else {
            if (this.E != null) {
                this.E.cancel();
            }
            this.E = ValueAnimator.ofInt(this.q, 0).setDuration(m);
            this.E.setInterpolator(null);
            this.E.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.1
                public static ChangeQuickRedirect a;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Object[] objArr2 = {valueAnimator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dfc54c1ab2763fe9281fee42dfcaa78e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dfc54c1ab2763fe9281fee42dfcaa78e");
                        return;
                    }
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    float f = intValue / SGRefreshHeaderHelper.this.k;
                    SGRefreshHeaderHelper.this.a(intValue, f > 1.0f ? 1.0f : f, SGRefreshHeaderHelper.this.r, 2, false);
                }
            });
            this.E.addListener(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.store.newwidgets.twolevel.SGRefreshHeaderHelper.2
                public static ChangeQuickRedirect a;

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "16f8498d4e42e9515532652f9d734460", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "16f8498d4e42e9515532652f9d734460");
                    } else {
                        SGRefreshHeaderHelper.this.d();
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c3391e6622082944ae3eb02755860336", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c3391e6622082944ae3eb02755860336");
                    } else {
                        SGRefreshHeaderHelper.this.d();
                    }
                }
            });
            this.E.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b4e4fab5092284d65f8a9bfa1b8d7e1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b4e4fab5092284d65f8a9bfa1b8d7e1")).booleanValue();
        }
        this.G = i > this.H;
        this.H = i;
        return this.G;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "688ee60a3ede15265c0bb9c95c766da2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "688ee60a3ede15265c0bb9c95c766da2");
            return;
        }
        d();
        a(0, 0.0f, this.r, -1, false);
        this.I = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0654dc61138a83e3e8d50ee85c0512e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0654dc61138a83e3e8d50ee85c0512e0");
        } else if (this.x && this.q > 0 && z && !com.sankuai.waimai.foundation.utils.d.a(this.F)) {
            for (b bVar : this.F) {
                if (bVar != null) {
                    bVar.a();
                }
            }
            this.x = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38409cc9aeb7ca2bf4e5fa2baf68ee31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38409cc9aeb7ca2bf4e5fa2baf68ee31");
            return;
        }
        this.r = 0;
        b(this.r);
        if (!com.sankuai.waimai.foundation.utils.d.a(this.F)) {
            for (b bVar : this.F) {
                if (bVar != null) {
                    bVar.b();
                }
            }
        }
        this.x = true;
        this.q = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46eabba7bf29685e12a43f43f10557f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46eabba7bf29685e12a43f43f10557f6");
        } else if (!com.sankuai.waimai.foundation.utils.d.a(this.F)) {
            for (b bVar : this.F) {
                if (bVar != null) {
                    bVar.a(i);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, float f, int i2, int i3, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44fedaa41cff2e5d9ba2eacef74e7dc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44fedaa41cff2e5d9ba2eacef74e7dc4");
            return;
        }
        this.q = i;
        if (com.sankuai.waimai.foundation.utils.d.a(this.F)) {
            return;
        }
        float f2 = f > 1.0f ? 1.0f : f < 0.0f ? 0.0f : f;
        for (b bVar : this.F) {
            if (bVar != null) {
                bVar.a(i, f2, i2, i3, z);
            }
        }
    }

    public boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4489e9e61719891e82c5073e4260b182", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4489e9e61719891e82c5073e4260b182")).booleanValue() : (this.v == null || this.v.canScrollVertically(-1)) ? false : true;
    }

    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a44c4ffd24996ed99445bd1b7f89e29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a44c4ffd24996ed99445bd1b7f89e29");
            return;
        }
        if (this.F == null) {
            this.F = new ArrayList();
        }
        if (this.F.contains(bVar)) {
            return;
        }
        this.F.add(bVar);
    }

    static {
        int b2 = h.b(com.meituan.android.singleton.b.a);
        D = b2;
        b = b2 / 6;
        c = (D * 11) / 50;
        d = (D * 5) / 3;
        e = D / 4;
        m = 100;
        n = 400;
        o = 400;
    }
}
