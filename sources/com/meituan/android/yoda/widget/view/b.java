package com.meituan.android.yoda.widget.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.SweepGradient;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends a {
    public static ChangeQuickRedirect g;
    ValueAnimator h;
    float i;
    AtomicBoolean j;
    private Paint k;
    private RectF l;
    private Path m;
    private RectF n;
    private SweepGradient o;
    private float p;
    private final float q;
    private final float r;
    private final float s;
    private final float t;
    private int u;
    private float v;
    private String w;
    private int[] x;
    private int y;
    private int z;

    @Override // com.meituan.android.yoda.widget.view.a
    public final float a() {
        return 0.18f;
    }

    @Override // com.meituan.android.yoda.widget.view.a
    public final float b() {
        return 0.878f;
    }

    @Override // com.meituan.android.yoda.widget.view.a
    public final float c() {
        return 0.494f;
    }

    @Override // com.meituan.android.yoda.widget.view.a
    public final float d() {
        return 120.0f;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:38|39|(3:84|85|(15:87|42|43|(3:75|76|(11:78|46|47|(3:65|66|(7:68|50|51|(3:56|57|(3:59|54|55))|53|54|55))|49|50|51|(0)|53|54|55))|45|46|47|(0)|49|50|51|(0)|53|54|55))|41|42|43|(0)|45|46|47|(0)|49|50|51|(0)|53|54|55) */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0257, code lost:
        r14 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0259, code lost:
        r14 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x025b, code lost:
        r14 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0211 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0237 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.view.ViewGroup r14, com.meituan.android.yoda.widget.view.d r15) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.yoda.widget.view.b.<init>(android.view.ViewGroup, com.meituan.android.yoda.widget.view.d):void");
    }

    @Override // com.meituan.android.yoda.widget.view.a
    public final void a(SurfaceHolder surfaceHolder) {
        Object[] objArr = {surfaceHolder};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de1ff50474eabfec2ce6d6d82ef89438", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de1ff50474eabfec2ce6d6d82ef89438");
            return;
        }
        this.l = new RectF(0.0f, 0.0f, this.c.getWidth(), this.c.getHeight());
        this.m = new Path();
        this.m.addCircle(this.c.getWidth() / 2.0f, (this.c.getHeight() * 0.18f) + (this.c.getWidth() * 0.439f), this.c.getWidth() * 0.439f, Path.Direction.CW);
    }

    @Override // com.meituan.android.yoda.widget.view.a
    public final void a(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25ad05badd7c25ba603f6a4d375d6d3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25ad05badd7c25ba603f6a4d375d6d3d");
            return;
        }
        canvas.save();
        canvas.clipRect(this.l);
        canvas.clipPath(this.m, Region.Op.DIFFERENCE);
        this.k.setColor(this.y);
        this.k.setStyle(Paint.Style.FILL);
        canvas.drawRect(0.0f, 0.0f, this.c.getWidth(), this.c.getHeight(), this.k);
        if (this.o == null) {
            this.o = new SweepGradient(this.c.getWidth() / 2.0f, (this.c.getHeight() * 0.18f) + (this.c.getWidth() * 0.439f), this.x, (float[]) null);
        }
        if (this.n == null) {
            float width = (this.c.getWidth() / 2.0f) - (this.c.getWidth() * 0.439f);
            float height = this.c.getHeight() * 0.18f;
            this.n = new RectF(width - 20.0f, height - 20.0f, (this.c.getWidth() * 0.439f * 2.0f) + width + 20.0f, (this.c.getWidth() * 0.439f * 2.0f) + height + 20.0f);
        }
        this.k.setStyle(Paint.Style.STROKE);
        this.k.setStrokeWidth(20.0f);
        this.k.setStrokeCap(Paint.Cap.ROUND);
        this.k.setShader(null);
        canvas.save();
        canvas.rotate(90.0f, this.c.getWidth() / 2.0f, (this.c.getHeight() * 0.18f) + (this.c.getWidth() * 0.439f));
        this.k.setColor(ReactBaseTextShadowNode.DEFAULT_TEXT_SHADOW_COLOR);
        this.k.setShader(null);
        canvas.drawArc(this.n, 0.0f, 330.0f, false, this.k);
        this.k.setColor(-16777216);
        this.k.setShader(this.o);
        canvas.drawArc(this.n, 0.0f, this.i, false, this.k);
        canvas.restore();
        this.k.setShader(null);
    }

    @Override // com.meituan.android.yoda.widget.view.a
    public final void a(final float f, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        Object[] objArr = {Float.valueOf(f), animatorUpdateListener};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98c42ab15bba1c41c22207150529eeae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98c42ab15bba1c41c22207150529eeae");
        } else if (this.h == null || !this.h.isRunning()) {
            this.p = f;
            this.h = ValueAnimator.ofFloat(this.i, f);
            this.h.setInterpolator(new LinearInterpolator());
            this.h.setDuration(200L);
            this.h.addListener(new Animator.AnimatorListener() { // from class: com.meituan.android.yoda.widget.view.b.1
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
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "403786c986d20474ef4004b4573aef1d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "403786c986d20474ef4004b4573aef1d");
                    } else {
                        b.this.i = f;
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7075b513ffcf1e93f7d1994a296cfb88", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7075b513ffcf1e93f7d1994a296cfb88");
                    } else {
                        b.this.i = f;
                    }
                }
            });
            this.h.addUpdateListener(animatorUpdateListener);
            this.h.start();
        }
    }

    @Override // com.meituan.android.yoda.widget.view.a
    public final void a(float f, float f2, long j, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(330.0f), 100L, animatorListener, animatorUpdateListener};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a5755a3c9315247604be937ed4f6d09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a5755a3c9315247604be937ed4f6d09");
            return;
        }
        if (this.h != null && this.h.isRunning()) {
            this.h.cancel();
        }
        this.h = ValueAnimator.ofFloat(f, 330.0f);
        this.h.setInterpolator(new AccelerateDecelerateInterpolator());
        this.h.setDuration(100L);
        this.h.setRepeatMode(2);
        this.h.setRepeatCount(0);
        this.h.addUpdateListener(animatorUpdateListener);
        this.h.start();
        this.h.addListener(animatorListener);
        this.h.addListener(new Animator.AnimatorListener() { // from class: com.meituan.android.yoda.widget.view.b.2
            public static ChangeQuickRedirect a;

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

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
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9c40a08fc07d72cd07dbf3f3299364c7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9c40a08fc07d72cd07dbf3f3299364c7");
                    return;
                }
                b bVar = b.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b.g;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "9e167fc619afcac346cd4e657fb22a56", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "9e167fc619afcac346cd4e657fb22a56");
                } else {
                    bVar.h.cancel();
                    bVar.h.removeAllUpdateListeners();
                }
                b.this.i = 330.0f;
                b.this.c.invalidate();
                b.this.j.set(false);
            }
        });
    }

    @Override // com.meituan.android.yoda.widget.view.a
    public final void a(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c9111e513d3ebb646ac8bde423bff53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c9111e513d3ebb646ac8bde423bff53");
        } else {
            b(onClickListener);
        }
    }

    @Override // com.meituan.android.yoda.widget.view.a
    public final int e() {
        return this.u;
    }

    @Override // com.meituan.android.yoda.widget.view.a
    public final float f() {
        return this.v;
    }

    @Override // com.meituan.android.yoda.widget.view.a
    public final void a(int i) {
        this.y = i;
    }

    @Override // com.meituan.android.yoda.widget.view.a
    public final void g() {
        this.z = this.y;
    }

    @Override // com.meituan.android.yoda.widget.view.a
    public final void h() {
        this.y = this.z;
    }
}
