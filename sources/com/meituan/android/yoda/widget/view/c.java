package com.meituan.android.yoda.widget.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.support.constraint.R;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.yoda.util.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends a {
    public static ChangeQuickRedirect g;
    private final float h;
    private final float i;
    private final float j;
    private final float k;
    private final int l;
    private final int m;
    private Paint n;
    private String o;
    private int p;
    private float q;
    private Bitmap r;
    private float s;
    private int t;
    private Handler u;
    private int v;

    @Override // com.meituan.android.yoda.widget.view.a
    public final float a() {
        return 0.05f;
    }

    @Override // com.meituan.android.yoda.widget.view.a
    public final void a(float f, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
    }

    @Override // com.meituan.android.yoda.widget.view.a
    public final void a(SurfaceHolder surfaceHolder) {
    }

    @Override // com.meituan.android.yoda.widget.view.a
    public final float b() {
        return 0.74f;
    }

    @Override // com.meituan.android.yoda.widget.view.a
    public final float c() {
        return 0.55f;
    }

    public c(ViewGroup viewGroup, d dVar) {
        Object[] objArr = {viewGroup, dVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79e384e4c6996f92745e27eb08e05696", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79e384e4c6996f92745e27eb08e05696");
            return;
        }
        this.h = 0.05f;
        this.i = 0.74f;
        this.j = 0.55f;
        this.k = x.a(20.0f);
        this.l = (int) x.a(30.0f);
        this.m = (int) x.a(90.0f);
        this.o = "请眨眼";
        this.p = -16777216;
        this.q = x.a(20.0f);
        this.s = 1.0f;
        this.t = -1;
        this.v = -1;
        this.b = new WeakReference<>(viewGroup);
        this.c = dVar;
        this.d = com.meituan.android.yoda.config.ui.d.a().d();
        this.n = new Paint();
        this.n.setAntiAlias(true);
        try {
            this.r = com.sankuai.waimai.launcher.util.image.a.a(dVar.getResources(), (int) R.drawable.yoda_wear_contour);
        } catch (Exception e) {
            this.r = null;
            com.meituan.android.yoda.monitor.log.a.a("CameraFaceMaskUpperBody", "wear mask bitmap exception = " + e.getMessage(), true);
        }
        this.u = new Handler(Looper.getMainLooper());
    }

    @Override // com.meituan.android.yoda.widget.view.a
    public final void a(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e45a5df31906d6044f6895caf65d2683", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e45a5df31906d6044f6895caf65d2683");
            return;
        }
        int width = this.c.getWidth();
        int height = this.c.getHeight();
        this.n.setColor(this.t);
        this.n.setStyle(Paint.Style.FILL);
        float f = width;
        canvas.drawRect(0.0f, 0.0f, f, this.l, this.n);
        if (this.r != null) {
            int i = this.l;
            canvas.drawBitmap(this.r, (Rect) null, new Rect(0, i, width, ((int) (this.s * f)) + i), this.n);
        }
        this.n.setColor(this.t);
        this.n.setStyle(Paint.Style.FILL);
        canvas.drawRect(0.0f, height - this.m, f, height, this.n);
    }

    @Override // com.meituan.android.yoda.widget.view.a
    public final void a(float f, float f2, long j, final Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(330.0f), 100L, animatorListener, animatorUpdateListener};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07aa33a7d6cbb674d4bd42f60b7aa928", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07aa33a7d6cbb674d4bd42f60b7aa928");
        } else if (this.u == null) {
        } else {
            this.u.postDelayed(new Runnable() { // from class: com.meituan.android.yoda.widget.view.c.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d1d89f2019171f2648e6e3eb7cb5a466", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d1d89f2019171f2648e6e3eb7cb5a466");
                    } else if (animatorListener != null) {
                        animatorListener.onAnimationEnd(null);
                    }
                }
            }, 200L);
        }
    }

    @Override // com.meituan.android.yoda.widget.view.a
    public final void a(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bec937ea0066621d328c50d9e9d58a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bec937ea0066621d328c50d9e9d58a2");
        } else {
            b(onClickListener);
        }
    }

    @Override // com.meituan.android.yoda.widget.view.a
    public final float d() {
        return this.k;
    }

    @Override // com.meituan.android.yoda.widget.view.a
    public final int e() {
        return this.p;
    }

    @Override // com.meituan.android.yoda.widget.view.a
    public final float f() {
        return this.q;
    }

    @Override // com.meituan.android.yoda.widget.view.a
    public final void a(int i) {
        this.t = i;
    }

    @Override // com.meituan.android.yoda.widget.view.a
    public final void g() {
        this.v = this.t;
    }

    @Override // com.meituan.android.yoda.widget.view.a
    public final void h() {
        this.t = this.v;
    }
}
