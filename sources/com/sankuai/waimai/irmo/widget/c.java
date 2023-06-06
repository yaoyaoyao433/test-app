package com.sankuai.waimai.irmo.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.alipay.sdk.app.PayTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends View {
    public static ChangeQuickRedirect a;
    private LinearGradient b;
    private Matrix c;
    private Paint d;
    private int e;
    private int f;
    private float g;
    private float h;
    private Rect i;
    private boolean j;
    private ValueAnimator k;

    public static /* synthetic */ boolean a(c cVar, boolean z) {
        cVar.j = true;
        return true;
    }

    public c(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d75f6d03a47b012e16f94339076c1712", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d75f6d03a47b012e16f94339076c1712");
        }
    }

    private c(Context context, AttributeSet attributeSet) {
        super(context, null);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c2957da836dfe7b4be65db47711f427", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c2957da836dfe7b4be65db47711f427");
            return;
        }
        this.j = false;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e748cbf79c5d6e9881314f0e9cfed1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e748cbf79c5d6e9881314f0e9cfed1a");
            return;
        }
        this.d = new Paint();
        this.c = new Matrix();
        this.i = new Rect();
        a();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e82632a2681b0407e2ab47eaa8c4f1dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e82632a2681b0407e2ab47eaa8c4f1dd");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.e == 0) {
            this.e = getWidth();
            this.f = getHeight();
            if (this.e > 0) {
                this.b = new LinearGradient(0.0f, 0.0f, this.e / 2, this.f / 2, new int[]{ViewCompat.MEASURED_SIZE_MASK, 872415231, 1728053247, -1711276033, -1275068417, -1711276033, 1728053247, 872415231, ViewCompat.MEASURED_SIZE_MASK}, new float[]{0.0f, 0.12f, 0.24f, 0.36f, 0.48f, 0.6f, 0.72f, 0.84f, 0.96f}, Shader.TileMode.CLAMP);
                this.d.setShader(this.b);
                this.c.setTranslate(this.e * (-2), this.f);
                this.b.setLocalMatrix(this.c);
                this.i.set(0, 0, i, i2);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7463f150c9c0593e72e2efa11ccaaca5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7463f150c9c0593e72e2efa11ccaaca5");
            return;
        }
        super.onDraw(canvas);
        if (!this.j || this.c == null) {
            return;
        }
        canvas.drawRect(this.i, this.d);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6e0d685ea75712989c6671125a44a83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6e0d685ea75712989c6671125a44a83");
            return;
        }
        super.setVisibility(i);
        if (i == 0) {
            if (this.k != null) {
                this.k.start();
            } else {
                a();
            }
        } else if (this.k != null) {
            this.k.cancel();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a2e5bd532b9ee4162f61399073dd9cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a2e5bd532b9ee4162f61399073dd9cf");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("FlashView", "onDetachedFromWindow=" + toString(), new Object[0]);
        super.onDetachedFromWindow();
        if (this.k != null) {
            this.k.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect a;
        public WeakReference<c> b;

        public a(c cVar) {
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f899049a67a2701cfb8a6a67d1727795", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f899049a67a2701cfb8a6a67d1727795");
            } else {
                this.b = new WeakReference<>(cVar);
            }
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            c cVar;
            Object[] objArr = {valueAnimator};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4156f481fc26296b89937a4ce602fe0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4156f481fc26296b89937a4ce602fe0");
            } else if (this.b == null || (cVar = this.b.get()) == null) {
            } else {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cVar.g = ((cVar.e * 4) * floatValue) - (cVar.e * 2);
                cVar.h = cVar.f * floatValue;
                if (cVar.c != null) {
                    cVar.c.setTranslate(cVar.g, cVar.h);
                }
                if (cVar.b != null) {
                    cVar.b.setLocalMatrix(cVar.c);
                }
                cVar.invalidate();
            }
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f2d64c84d98ed3aab5eefdf04b6f59d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f2d64c84d98ed3aab5eefdf04b6f59d");
            return;
        }
        this.k = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.k.setDuration(PayTask.j);
        this.k.addUpdateListener(new a(this));
        this.k.setRepeatCount(-1);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.irmo.widget.c.1
            public static ChangeQuickRedirect a;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b31ecf9583a2b3938ee01424ac1804df", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b31ecf9583a2b3938ee01424ac1804df");
                    return;
                }
                c.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                c.a(c.this, true);
                if (c.this.k != null) {
                    c.this.k.start();
                }
            }
        });
    }
}
