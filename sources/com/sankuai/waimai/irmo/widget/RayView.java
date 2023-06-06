package com.sankuai.waimai.irmo.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.irmo.render.a;
import com.sankuai.waimai.irmo.render.bean.layers.IrmoLayerInfo;
import com.sankuai.waimai.irmo.render.bean.layers.RayEffectParams;
import com.sankuai.waimai.irmo.render.i;
import com.sankuai.waimai.irmo.render.monitor.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RayView extends View {
    public static ChangeQuickRedirect a;
    public boolean b;
    public ValueAnimator c;
    public boolean d;
    public Runnable e;
    public boolean f;
    private LinearGradient g;
    private Matrix h;
    private Paint i;
    private Rect j;
    private RayEffectParams k;
    private boolean l;
    private boolean m;
    private IrmoLayerInfo n;
    private i o;
    private com.sankuai.waimai.irmo.render.a p;

    public static /* synthetic */ Runnable a(RayView rayView, Runnable runnable) {
        rayView.e = null;
        return null;
    }

    public static /* synthetic */ void a(RayView rayView, int i) {
        Object[] objArr = {1001};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, rayView, changeQuickRedirect, false, "948aa680928721186e1c5c7aebffb048", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, rayView, changeQuickRedirect, false, "948aa680928721186e1c5c7aebffb048");
            return;
        }
        if (rayView.o != null) {
            rayView.o.a(false, 1003, 1001);
        }
        rayView.a(a.EnumC0973a.effect_failed);
    }

    public static /* synthetic */ boolean a(RayView rayView, boolean z) {
        rayView.d = true;
        return true;
    }

    public static /* synthetic */ boolean c(RayView rayView, boolean z) {
        rayView.f = false;
        return false;
    }

    public static /* synthetic */ boolean d(RayView rayView, boolean z) {
        rayView.m = true;
        return true;
    }

    public RayView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ade863d26fba286d0e0c13d586cdc322", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ade863d26fba286d0e0c13d586cdc322");
        }
    }

    public RayView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50d0f48aad7858a8fb720dfba953c95e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50d0f48aad7858a8fb720dfba953c95e");
        }
    }

    public RayView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cbe8d574d78c19e6d1cc0ce11b54156", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cbe8d574d78c19e6d1cc0ce11b54156");
            return;
        }
        this.b = false;
        this.i = new Paint();
        this.h = new Matrix();
        this.j = new Rect();
        this.l = false;
        this.d = false;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "488f3594137a6503d02b370d3d09baf4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "488f3594137a6503d02b370d3d09baf4");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0 || this.k == null || !this.m) {
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("RayView", "size changed", new Object[0]);
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e157e3938e5090b2ff27bb78a9ad1e49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e157e3938e5090b2ff27bb78a9ad1e49");
            return;
        }
        float a2 = g.a(getContext(), this.k.rayWidth);
        this.g = new LinearGradient(0.0f, 0.0f, a2, 0.0f, this.k.colors, this.k.colorPositions, Shader.TileMode.CLAMP);
        this.h.setTranslate(a2 * (-1.0f), 0.0f);
        this.g.setLocalMatrix(this.h);
        this.i.setAntiAlias(true);
        this.i.setShader(this.g);
        this.j.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        c();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c4539a5b8630fc36e2846f71e813e04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c4539a5b8630fc36e2846f71e813e04");
            return;
        }
        super.onDraw(canvas);
        if (!this.b || this.h == null) {
            return;
        }
        canvas.drawRect(this.j, this.i);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cec4969f59719c0abe8bbb0372c29ee8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cec4969f59719c0abe8bbb0372c29ee8");
            return;
        }
        super.onDetachedFromWindow();
        if (this.c == null || !this.c.isRunning()) {
            return;
        }
        this.f = true;
        this.c.end();
    }

    @Deprecated
    public final void a(final com.sankuai.waimai.irmo.render.engine.g gVar, com.sankuai.waimai.irmo.render.a aVar) {
        Object[] objArr = {gVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79a4e229b8cd72a1597433b84c970315", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79a4e229b8cd72a1597433b84c970315");
            return;
        }
        this.e = new Runnable() { // from class: com.sankuai.waimai.irmo.widget.RayView.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c6f4612831aeb806f1859afcf32697e3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c6f4612831aeb806f1859afcf32697e3");
                    return;
                }
                if (RayView.this.o != null) {
                    RayView.this.o.a("InfiniteEngineWillPlay", 1003);
                }
                if (RayView.this.n != null && RayView.this.k != null && RayView.this.k.playCount != 0) {
                    if (RayView.this.l) {
                        if (RayView.this.c != null) {
                            RayView.this.b = true;
                            RayView.this.c.start();
                            if (RayView.this.o != null) {
                                RayView.this.o.a(true, 1003, 1003);
                            }
                        } else if (RayView.this.o != null) {
                            RayView.this.o.a(true, 1003, 1002);
                        }
                        if (gVar != null) {
                            gVar.a(RayView.this.n, RayView.this.c != null);
                        }
                        RayView.a(RayView.this, (Runnable) null);
                        return;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.b("RayView", "view not ready, waiting", new Object[0]);
                    RayView.a(RayView.this, true);
                    if (gVar != null) {
                        gVar.a(RayView.this.n, true);
                    }
                    RayView.a(RayView.this, (Runnable) null);
                    return;
                }
                RayView.a(RayView.this, 1001);
                if (gVar != null) {
                    gVar.a(RayView.this.n, false);
                }
            }
        };
        ad.a(this.e, (long) (this.n.startTime * 1000.0d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a.EnumC0973a enumC0973a) {
        Object[] objArr = {enumC0973a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4aafd5144f8524a7b470e580f948201a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4aafd5144f8524a7b470e580f948201a");
        } else if (this.p == null || enumC0973a == null) {
        } else {
            this.p.a(enumC0973a, null);
        }
    }

    public final boolean a(IrmoLayerInfo irmoLayerInfo) {
        Object[] objArr = {irmoLayerInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0646f36647472a2cba363a10281fa75a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0646f36647472a2cba363a10281fa75a")).booleanValue();
        }
        this.n = irmoLayerInfo;
        if (irmoLayerInfo != null && (irmoLayerInfo.effectParams instanceof RayEffectParams) && ((RayEffectParams) irmoLayerInfo.effectParams).playCount != 0) {
            this.k = (RayEffectParams) irmoLayerInfo.effectParams;
            return true;
        }
        a(a.EnumC0973a.effect_failed);
        a("layer info invalid", true);
        return false;
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "def2a1ae6b53cff64481e63acfd365c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "def2a1ae6b53cff64481e63acfd365c3");
        } else if (this.k == null || this.k.playCount == 0) {
        } else {
            if (this.c != null) {
                this.c.removeAllUpdateListeners();
                this.c.removeAllListeners();
                if (this.c.isRunning()) {
                    this.c.end();
                }
                this.c = null;
                this.b = false;
            }
            this.c = ValueAnimator.ofFloat(g.a(getContext(), this.k.rayWidth) * (-1), getWidth());
            this.c.setDuration(this.k.duration);
            this.c.setStartDelay(this.k.delay);
            this.c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.irmo.widget.RayView.2
                public static ChangeQuickRedirect a;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Object[] objArr2 = {valueAnimator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c8ca7beabad03a0a1c0cab48f044abb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c8ca7beabad03a0a1c0cab48f044abb");
                        return;
                    }
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (RayView.this.h != null) {
                        RayView.this.h.setTranslate(floatValue, 0.0f);
                    }
                    if (RayView.this.g != null) {
                        RayView.this.g.setLocalMatrix(RayView.this.h);
                    }
                    RayView.this.invalidate();
                }
            });
            this.c.addListener(new AnimatorListenerAdapter() { // from class: com.sankuai.waimai.irmo.widget.RayView.3
                public static ChangeQuickRedirect a;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6af71630a50f20e7d0620b9ad55e7cfd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6af71630a50f20e7d0620b9ad55e7cfd");
                        return;
                    }
                    super.onAnimationStart(animator);
                    RayView.this.b = true;
                    if (RayView.this.p != null) {
                        RayView.this.p.a(a.EnumC0973a.effect_start, null);
                    }
                    RayView.this.a(a.EnumC0973a.effect_start);
                    RayView.c(RayView.this, false);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c0c589be290853366beb7c336bb3c856", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c0c589be290853366beb7c336bb3c856");
                        return;
                    }
                    super.onAnimationEnd(animator);
                    RayView.this.b = false;
                    RayView.this.a(RayView.this.f ? a.EnumC0973a.effect_cancel : a.EnumC0973a.effect_finished);
                    RayView.c(RayView.this, false);
                }
            });
            this.c.setRepeatCount(this.k.playCount >= 0 ? this.k.playCount - 1 : -1);
            this.l = true;
            if (this.d) {
                com.sankuai.waimai.foundation.utils.log.a.b("RayView", "has waiting task, execute", new Object[0]);
                this.b = true;
                this.d = false;
                this.c.start();
                if (this.o != null) {
                    this.o.a(true, 1003, 1004);
                }
            }
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10b45e9624308e3cb15d9c01237b25f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10b45e9624308e3cb15d9c01237b25f6");
        } else if (this.k == null) {
        } else {
            this.l = false;
            getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.irmo.widget.RayView.4
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "142fbdc6b740715cb91918059405821e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "142fbdc6b740715cb91918059405821e");
                    } else if (RayView.this.k == null || RayView.this == null) {
                    } else {
                        RayView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        ViewGroup viewGroup = (ViewGroup) RayView.this.getParent();
                        int measuredWidth = RayView.this.getMeasuredWidth();
                        int measuredHeight = RayView.this.getMeasuredHeight();
                        if (viewGroup != null) {
                            viewGroup.setClipBounds(new Rect(0, 0, viewGroup.getMeasuredWidth(), viewGroup.getMeasuredHeight()));
                            measuredWidth = viewGroup.getMeasuredWidth();
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        double d = RayView.this.k.rotationZ * 0.017453292519943295d;
                        double abs = Math.abs(Math.sin(d));
                        double abs2 = Math.abs(Math.cos(d));
                        double d2 = measuredHeight;
                        double d3 = measuredWidth;
                        int i = (int) ((abs * d2) + (abs2 * d3));
                        int i2 = (int) ((abs * d3) + (abs2 * d2));
                        if (i == RayView.this.getMeasuredWidth() && i2 == RayView.this.getMeasuredHeight()) {
                            RayView.this.b();
                        } else {
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
                            layoutParams.gravity = 17;
                            RayView.d(RayView.this, true);
                            RayView.this.setLayoutParams(layoutParams);
                        }
                        RayView.this.setRotation(RayView.this.k.rotationZ);
                    }
                }
            });
        }
    }

    public void setReporter(i iVar) {
        this.o = iVar;
    }

    private void a(String str, boolean z) {
        Object[] objArr = {str, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4932dc83f080aa7ec0c2e194eb34213a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4932dc83f080aa7ec0c2e194eb34213a");
        } else if (this.o == null || TextUtils.isEmpty(str)) {
        } else {
            this.o.a(new a.C0976a().a(1003).a(str).a(), true);
            com.sankuai.waimai.foundation.utils.log.a.e("RayView", str, new Object[0]);
        }
    }

    public void setEventCallback(com.sankuai.waimai.irmo.render.a aVar) {
        this.p = aVar;
    }

    public void setCanceled(boolean z) {
        this.f = z;
    }
}
