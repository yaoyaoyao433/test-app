package com.sankuai.waimai.business.page.home.widget.twolevel;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class RefreshHeaderHelper {
    public static ChangeQuickRedirect a;
    public static int b;
    public static int c;
    public static int d;
    public static int e;
    public static int f;
    public static int o;
    public static int p;
    public static int q;
    int A;
    int B;
    int C;
    int D;
    d E;
    public boolean F;
    public float G;
    public float H;
    com.sankuai.waimai.business.page.home.widget.twolevel.a I;
    public b J;
    public ValueAnimator K;
    public ValueAnimator L;
    public com.sankuai.waimai.business.page.home.widget.twolevel.report.a M;
    public final GestureDetector N;
    public boolean O;
    public ValueAnimator.AnimatorUpdateListener P;
    private List<c> Q;
    private int R;
    private boolean S;
    private boolean T;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    int l;
    public int m;
    public int n;
    public int r;
    public int s;
    public int t;
    public ValueAnimator u;
    public ValueAnimator v;
    public ValueAnimator w;
    public AnimatorSet x;
    public RecyclerView y;
    public int z;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface ScrollType {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements c {
        @Override // com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.c
        public void a() {
        }

        @Override // com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.c
        public void a(int i) {
        }

        @Override // com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.c
        public void a(int i, float f, int i2, int i3, boolean z) {
        }

        @Override // com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.c
        public void b() {
        }

        @Override // com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.c
        public void c() {
        }

        @Override // com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.c
        public void d() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface c {
        void a();

        void a(int i);

        void a(int i, float f, int i2, int i3, boolean z);

        void b();

        void c();

        void d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface d {

        /* compiled from: ProGuard */
        /* loaded from: classes4.dex */
        public interface a {
            void a();
        }

        void a(a aVar);
    }

    public static /* synthetic */ void b(RefreshHeaderHelper refreshHeaderHelper) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, refreshHeaderHelper, changeQuickRedirect, false, "87516c47d95dbd36ae5e1bdaba435384", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, refreshHeaderHelper, changeQuickRedirect, false, "87516c47d95dbd36ae5e1bdaba435384");
        } else if (refreshHeaderHelper.M != null) {
            com.sankuai.waimai.business.page.home.widget.twolevel.report.a aVar = refreshHeaderHelper.M;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.home.widget.twolevel.report.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "b229b0a43f2cb169110007bfde0fa371", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "b229b0a43f2cb169110007bfde0fa371");
            } else {
                JudasManualManager.a("b_waimai_15eib4gl_mc", "c_m84bv26", aVar.c).a();
            }
        }
    }

    public static /* synthetic */ void f(RefreshHeaderHelper refreshHeaderHelper) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, refreshHeaderHelper, changeQuickRedirect, false, "937ef15d76c9120b23720de9b2507c47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, refreshHeaderHelper, changeQuickRedirect, false, "937ef15d76c9120b23720de9b2507c47");
        } else if (!com.sankuai.waimai.foundation.utils.d.a(refreshHeaderHelper.Q)) {
            for (c cVar : refreshHeaderHelper.Q) {
                if (cVar != null) {
                    cVar.b();
                }
            }
        }
    }

    public static /* synthetic */ void i(RefreshHeaderHelper refreshHeaderHelper) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, refreshHeaderHelper, changeQuickRedirect, false, "786958550444eb0f1433c9d2a8d099f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, refreshHeaderHelper, changeQuickRedirect, false, "786958550444eb0f1433c9d2a8d099f0");
        } else if (!com.sankuai.waimai.foundation.utils.d.a(refreshHeaderHelper.Q)) {
            for (c cVar : refreshHeaderHelper.Q) {
                if (cVar != null) {
                    cVar.d();
                }
            }
        }
    }

    public RefreshHeaderHelper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e03628a75fc6dd9e21e67a56fbe7e104", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e03628a75fc6dd9e21e67a56fbe7e104");
            return;
        }
        this.g = c;
        this.h = d;
        this.i = d;
        this.j = 0;
        this.t = 0;
        this.S = false;
        this.F = true;
        this.N = new GestureDetector(com.meituan.android.singleton.b.a, new GestureDetector.OnGestureListener() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.1
            public static ChangeQuickRedirect a;

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0a9221dc92cd39ca083c589e8c73e8fb", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0a9221dc92cd39ca083c589e8c73e8fb")).booleanValue();
                }
                RefreshHeaderHelper.this.g();
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                Object[] objArr2 = {motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "259b807e053ceaaed8b082464f208f80", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "259b807e053ceaaed8b082464f208f80")).booleanValue();
                }
                if (RefreshHeaderHelper.this.O) {
                    if (f3 > 0.0f) {
                        RefreshHeaderHelper.this.f();
                    } else {
                        RefreshHeaderHelper.this.g();
                        RefreshHeaderHelper.b(RefreshHeaderHelper.this);
                    }
                }
                return false;
            }
        });
        this.T = false;
        this.O = false;
        this.P = new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.3
            public static ChangeQuickRedirect a;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object[] objArr2 = {valueAnimator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1fd60941bd88280f8b31e45830a13a4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1fd60941bd88280f8b31e45830a13a4");
                    return;
                }
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                float f2 = intValue / RefreshHeaderHelper.this.z;
                RefreshHeaderHelper.this.a(intValue, f2 > 1.0f ? 1.0f : f2, RefreshHeaderHelper.this.t, RefreshHeaderHelper.this.T ? 3 : 4, false);
            }
        };
    }

    public boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15960b947ede2e6391751be621c1b3fb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15960b947ede2e6391751be621c1b3fb")).booleanValue();
        }
        this.S = i > this.R;
        this.R = i;
        return this.S;
    }

    public boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f692ec4f403a700e247df4b0d10933d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f692ec4f403a700e247df4b0d10933d")).booleanValue() : (this.y == null || this.y.canScrollVertically(-1)) ? false : true;
    }

    public final void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63917583f845fab70fb7968ea974686e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63917583f845fab70fb7968ea974686e");
            return;
        }
        if (this.Q == null) {
            this.Q = new ArrayList();
        }
        if (this.Q.contains(cVar)) {
            return;
        }
        this.Q.add(cVar);
    }

    public void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6d11799b37e1ac86721c96d65ae163b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6d11799b37e1ac86721c96d65ae163b");
        } else if (!com.sankuai.waimai.foundation.utils.d.a(this.Q)) {
            for (c cVar : this.Q) {
                if (cVar != null) {
                    cVar.a(i);
                }
            }
        }
    }

    public void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3feaaae10d74b3963064df41a7b18fd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3feaaae10d74b3963064df41a7b18fd7");
        } else if (this.F && this.s > 0 && z && !com.sankuai.waimai.foundation.utils.d.a(this.Q)) {
            for (c cVar : this.Q) {
                if (cVar != null) {
                    cVar.a();
                }
            }
            this.F = false;
        }
    }

    public void a(int i, float f2, int i2, int i3, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3707fd2fd9b647f2c9b4c592897c17a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3707fd2fd9b647f2c9b4c592897c17a");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("notifyScroll11111", "scrollDown: " + i3 + "  ,isManual: " + z, new Object[0]);
        this.s = i;
        if (com.sankuai.waimai.foundation.utils.d.a(this.Q)) {
            return;
        }
        float f3 = 0.0f;
        if (f2 > 1.0f) {
            f3 = 1.0f;
        } else if (f2 >= 0.0f) {
            f3 = f2;
        }
        for (c cVar : this.Q) {
            if (cVar != null) {
                cVar.a(i, f3, i2, i3, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "612752aaf64cbc5c3b6cf7e959108db7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "612752aaf64cbc5c3b6cf7e959108db7");
            return;
        }
        this.t = 0;
        b(this.t);
        if (!com.sankuai.waimai.foundation.utils.d.a(this.Q)) {
            for (c cVar : this.Q) {
                if (cVar != null) {
                    cVar.c();
                }
            }
        }
        this.F = true;
        this.s = 0;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34680439d4d6b6db9c2eae8a8d0d11fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34680439d4d6b6db9c2eae8a8d0d11fa");
            return;
        }
        i();
        a(0, 0.0f, this.t, -1, false);
        this.T = false;
        this.O = false;
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c9f1f91b8ecf94b6cbeadc5ccbe7172", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c9f1f91b8ecf94b6cbeadc5ccbe7172");
        } else if (this.s <= 0) {
            b();
        } else {
            if (this.u != null) {
                this.u.cancel();
            }
            this.u = ValueAnimator.ofInt(this.s, 0).setDuration(o);
            this.u.setInterpolator(null);
            this.u.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.5
                public static ChangeQuickRedirect a;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Object[] objArr2 = {valueAnimator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3211ab716405d70501161d05b9bb6bcc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3211ab716405d70501161d05b9bb6bcc");
                        return;
                    }
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    float f2 = intValue / RefreshHeaderHelper.this.z;
                    RefreshHeaderHelper.this.a(intValue, f2 > 1.0f ? 1.0f : f2, RefreshHeaderHelper.this.t, 2, false);
                }
            });
            this.u.addListener(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.6
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
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e4000da6fc0b9af7ddf3fea891b0107d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e4000da6fc0b9af7ddf3fea891b0107d");
                    } else {
                        RefreshHeaderHelper.this.i();
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b8e8d7ad81263ff58c28da7c2dc81cce", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b8e8d7ad81263ff58c28da7c2dc81cce");
                    } else {
                        RefreshHeaderHelper.this.i();
                    }
                }
            });
            this.u.start();
        }
    }

    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cadd1b10db4d27e299736a0adabad4f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cadd1b10db4d27e299736a0adabad4f0");
        } else if (this.s <= 0 || this.j != 1) {
            b();
        } else {
            if (this.v != null) {
                this.v.cancel();
            }
            this.v = ValueAnimator.ofInt(this.s, this.l).setDuration(p);
            this.v.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.9
                public static ChangeQuickRedirect a;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Object[] objArr2 = {valueAnimator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aae12e48061172654c6379ff1f5e5e00", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aae12e48061172654c6379ff1f5e5e00");
                        return;
                    }
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    float f2 = intValue / RefreshHeaderHelper.this.z;
                    RefreshHeaderHelper.this.a(intValue, f2 > 1.0f ? 1.0f : f2, RefreshHeaderHelper.this.t, 1, false);
                }
            });
            this.v.addListener(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.10
                public static ChangeQuickRedirect a;

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c7ef856110bc25ed7efdfe4336697021", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c7ef856110bc25ed7efdfe4336697021");
                    } else if (RefreshHeaderHelper.this.I != null) {
                        RefreshHeaderHelper.this.I.d();
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "18d75d4cd4df8b4ff7049944774e7778", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "18d75d4cd4df8b4ff7049944774e7778");
                        return;
                    }
                    RefreshHeaderHelper.this.t = 5;
                    RefreshHeaderHelper.this.b(RefreshHeaderHelper.this.t);
                    if (RefreshHeaderHelper.this.E != null) {
                        RefreshHeaderHelper.this.E.a(new d.a() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.10.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.d.a
                            public final void a() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7cd6c18fd554981c709cb8b74354d3ac", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7cd6c18fd554981c709cb8b74354d3ac");
                                } else {
                                    RefreshHeaderHelper.i(RefreshHeaderHelper.this);
                                }
                            }
                        });
                    } else {
                        RefreshHeaderHelper.i(RefreshHeaderHelper.this);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "049ed6374e88c2decb698c0f35537a15", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "049ed6374e88c2decb698c0f35537a15");
                    } else {
                        RefreshHeaderHelper.this.i();
                    }
                }
            });
            this.v.start();
        }
    }

    public void a(ValueAnimator valueAnimator) {
        Object[] objArr = {valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edc25501d05fd8a2a80953fe6ec34dc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edc25501d05fd8a2a80953fe6ec34dc8");
        } else if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
        }
    }

    public final boolean e() {
        return this.t == 0;
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0df20961652d05cf571a1ec65d30b49f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0df20961652d05cf571a1ec65d30b49f");
            return;
        }
        h();
        this.T = false;
        this.O = false;
        this.t = 4;
        d();
        b(this.t);
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3234edb36204736d34d231fb1ab871ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3234edb36204736d34d231fb1ab871ba");
            return;
        }
        h();
        if (this.O) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e1c47472e8d28c9d57f1c689194369f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e1c47472e8d28c9d57f1c689194369f");
            } else if (this.t == 9) {
                a(this.K);
                this.K = ValueAnimator.ofInt(this.n, 0).setDuration(q);
                this.K.addUpdateListener(this.P);
                this.K.addListener(new e() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.4
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.page.home.widget.twolevel.e, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        Object[] objArr3 = {animator};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "20326d4ff6e1143ead011a806d464d3a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "20326d4ff6e1143ead011a806d464d3a");
                            return;
                        }
                        RefreshHeaderHelper.this.T = false;
                        RefreshHeaderHelper.this.O = false;
                    }

                    @Override // com.sankuai.waimai.business.page.home.widget.twolevel.e, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        Object[] objArr3 = {animator};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8fa387575fbaa1a38e621e0042334122", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8fa387575fbaa1a38e621e0042334122");
                            return;
                        }
                        if (RefreshHeaderHelper.this.I != null) {
                            RefreshHeaderHelper.this.I.c();
                        }
                        RefreshHeaderHelper.this.i();
                    }

                    @Override // com.sankuai.waimai.business.page.home.widget.twolevel.e, android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                        Object[] objArr3 = {animator};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1856209d2efca66e547d76c704eb73bb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1856209d2efca66e547d76c704eb73bb");
                        } else {
                            RefreshHeaderHelper.this.i();
                        }
                    }
                });
                this.K.start();
            }
        }
    }

    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea54b14b428af1d972c8744ed542aa49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea54b14b428af1d972c8744ed542aa49");
        } else if (this.J != null) {
            this.J.removeCallbacksAndMessages(null);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b extends Handler {
        public static ChangeQuickRedirect a;
        public final WeakReference<RefreshHeaderHelper> b;

        public b(RefreshHeaderHelper refreshHeaderHelper) {
            Object[] objArr = {refreshHeaderHelper};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f06e1c2d4a585463f6b88a3a0e3a97d3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f06e1c2d4a585463f6b88a3a0e3a97d3");
            } else {
                this.b = new WeakReference<>(refreshHeaderHelper);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            RefreshHeaderHelper refreshHeaderHelper;
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fcd9e9befab0f47d845029924630ae0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fcd9e9befab0f47d845029924630ae0");
            } else if (message.what != 1 || (refreshHeaderHelper = this.b.get()) == null) {
            } else {
                refreshHeaderHelper.f();
            }
        }
    }

    static {
        int a2 = g.a(com.meituan.android.singleton.b.a);
        b = a2;
        c = (a2 * 9) / 20;
        d = (b * 13) / 20;
        e = (b * 3) / 2;
        f = b / 2;
        o = 100;
        p = 300;
        q = 400;
    }
}
