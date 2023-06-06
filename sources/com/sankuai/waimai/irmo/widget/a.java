package com.sankuai.waimai.irmo.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ColorUtils;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends View {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;
    private int d;
    private int e;
    private com.sankuai.waimai.irmo.utils.a f;
    private ValueAnimator g;

    public a(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fb0e47088ce58527a6a02dc1cd0a258", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fb0e47088ce58527a6a02dc1cd0a258");
        }
    }

    private a(Context context, AttributeSet attributeSet) {
        super(context, null);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63fd61ef8ccb12c71427bdbe3ba11995", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63fd61ef8ccb12c71427bdbe3ba11995");
            return;
        }
        this.b = 30;
        this.c = SupportMenu.CATEGORY_MASK;
        this.d = this.c;
        this.e = 1000;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d93f918284cd868bdf206394f886235c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d93f918284cd868bdf206394f886235c");
            return;
        }
        this.f = new com.sankuai.waimai.irmo.utils.a();
        this.f.a(20.0f);
        a();
    }

    public final void setShadowColor(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "257ae79f6bab4431217a8b6921d78276", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "257ae79f6bab4431217a8b6921d78276");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.d = ColorUtils.parseColor(str, this.c);
        }
    }

    public final void setDuration(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ce69f5410d07cd3a09e6cd447d34a4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ce69f5410d07cd3a09e6cd447d34a4b");
        } else if (i >= 0) {
            this.e = i;
            if (this.g != null) {
                this.g.setDuration(this.e);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "769ede6c0c8dd3891fb8550e85dbbebb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "769ede6c0c8dd3891fb8550e85dbbebb");
            return;
        }
        com.sankuai.waimai.irmo.utils.a aVar = this.f;
        Object[] objArr2 = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.irmo.utils.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "cc8f4f3d2c99f2661ec9aa7af767f318", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "cc8f4f3d2c99f2661ec9aa7af767f318");
        } else if (Build.VERSION.SDK_INT >= 28) {
            Object[] objArr3 = {canvas};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.irmo.utils.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "8ecbbf8cb301bd66d9c79c6a6775dc68", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "8ecbbf8cb301bd66d9c79c6a6775dc68");
            } else {
                if (aVar.i || aVar.k == null) {
                    aVar.i = false;
                    aVar.j.setColor(aVar.e);
                    aVar.j.setShadowLayer(aVar.d, aVar.b, aVar.c, aVar.e);
                    if (aVar.k == null) {
                        aVar.k = new Path();
                    }
                    if (aVar.l == null) {
                        aVar.l = new RectF(0.0f, 0.0f, aVar.f, aVar.g);
                    } else {
                        aVar.l.set(0.0f, 0.0f, aVar.f, aVar.g);
                    }
                    aVar.k.addRoundRect(aVar.l, aVar.h, Path.Direction.CW);
                }
                canvas.drawPath(aVar.k, aVar.j);
                aVar.k.reset();
            }
        } else {
            Object[] objArr4 = {canvas};
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.irmo.utils.a.a;
            if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "8fbe725c77edf0d62aa381bf6b58d3a2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "8fbe725c77edf0d62aa381bf6b58d3a2");
            } else {
                if (aVar.i) {
                    aVar.i = false;
                    if (aVar.m != null && !aVar.m.isRecycled()) {
                        aVar.m.recycle();
                    }
                    int i = (int) (aVar.d * 2.0f);
                    try {
                        aVar.m = Bitmap.createBitmap(aVar.f + i, aVar.g + i, Bitmap.Config.ARGB_4444);
                        if (aVar.m != null) {
                            Canvas canvas2 = new Canvas(aVar.m);
                            Paint paint = new Paint();
                            paint.setAntiAlias(true);
                            paint.setColor(aVar.e);
                            paint.setStyle(Paint.Style.FILL);
                            paint.setShadowLayer(aVar.d, aVar.b, aVar.c, aVar.e);
                            Path path = new Path();
                            path.addRoundRect(new RectF(aVar.d, aVar.d, aVar.f + aVar.d, aVar.g + aVar.d), aVar.h, Path.Direction.CW);
                            canvas2.translate(-aVar.b, -aVar.c);
                            canvas2.clipPath(path, Region.Op.DIFFERENCE);
                            canvas2.drawPath(path, paint);
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (aVar.m != null && !aVar.m.isRecycled()) {
                    canvas.drawBitmap(aVar.m, (-aVar.d) + aVar.b, (-aVar.d) + aVar.c, (Paint) null);
                }
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee788482183fd1880911d3eb8f26263e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee788482183fd1880911d3eb8f26263e");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        com.sankuai.waimai.irmo.utils.a aVar = this.f;
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        Object[] objArr2 = {Integer.valueOf(width), Integer.valueOf(height)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.irmo.utils.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "16ab1763445f43bbee5abf0294d126a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "16ab1763445f43bbee5abf0294d126a7");
        } else if (aVar.f == width && aVar.g == height) {
        } else {
            aVar.f = width;
            aVar.g = height;
            aVar.i = true;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75cc552f47cf97bd7ea8d356dda9b111", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75cc552f47cf97bd7ea8d356dda9b111");
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "618044b4e54970de2fdfde98b9e09240", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "618044b4e54970de2fdfde98b9e09240");
            return;
        }
        super.setVisibility(i);
        if (i == 0) {
            if (this.g != null) {
                this.g.start();
            } else {
                a();
            }
        } else if (this.g != null) {
            this.g.cancel();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abc28c57b7f86dbb3a07513e8454b0bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abc28c57b7f86dbb3a07513e8454b0bc");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("BreathView", "onDetachedFromWindow=" + toString(), new Object[0]);
        super.onDetachedFromWindow();
        if (this.g != null) {
            this.g.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.irmo.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0980a implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect a;
        public WeakReference<a> b;

        public C0980a(a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3afc3b8f991d170fca9e8eaf4995f9a1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3afc3b8f991d170fca9e8eaf4995f9a1");
            } else {
                this.b = new WeakReference<>(aVar);
            }
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            a aVar;
            Object[] objArr = {valueAnimator};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fd9958d92e5695ae89c1bcd1b788c00", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fd9958d92e5695ae89c1bcd1b788c00");
            } else if (this.b == null || (aVar = this.b.get()) == null) {
            } else {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                com.sankuai.waimai.irmo.utils.a aVar2 = aVar.f;
                float f = aVar.b;
                int a2 = a.a(floatValue, aVar.d);
                Object[] objArr2 = {Float.valueOf(f), Float.valueOf(0.0f), Float.valueOf(0.0f), Integer.valueOf(a2)};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.irmo.utils.a.a;
                if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "3cb1c9e53ddd3d581303646ce4cb97b5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "3cb1c9e53ddd3d581303646ce4cb97b5");
                } else {
                    aVar2.e = a2;
                    aVar2.d = f;
                    aVar2.b = 0.0f;
                    aVar2.c = 0.0f;
                    aVar2.i = true;
                }
                aVar.invalidate();
            }
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b8842bfe8a791cfc71b89e65f5f9eaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b8842bfe8a791cfc71b89e65f5f9eaa");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("BreathView-test2", "[initGradientAnimator]  mValueAnimator = " + this.g, new Object[0]);
        this.g = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.g.setDuration((long) this.e);
        this.g.setInterpolator(new b());
        this.g.setRepeatCount(-1);
        this.g.addUpdateListener(new C0980a(this));
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.irmo.widget.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "922ebaa41003a5ece807a80a2357eca0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "922ebaa41003a5ece807a80a2357eca0");
                    return;
                }
                a.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (a.this.g != null) {
                    a.this.g.start();
                }
            }
        });
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b implements TimeInterpolator {
        public static ChangeQuickRedirect a;

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            Object[] objArr = {Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d456728719f4e74edd46b2105b517eaf", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d456728719f4e74edd46b2105b517eaf")).floatValue();
            }
            float f2 = f * 6.0f;
            if (f2 < 0.0f || f2 >= 2.0000002f) {
                if (f2 < 2.0000002f || f2 >= 6.0f) {
                    return 0.0f;
                }
                return (float) Math.pow((Math.sin(((f2 - 8.0f) - 0.0f) * 0.78540003f) * 0.5d) + 0.5d, 2.0d);
            }
            return (float) ((Math.sin(((f2 - 1.0f) - 0.0f) * 1.5708f) * 0.5d) + 0.5d);
        }
    }

    public static int a(float f, int i) {
        Object[] objArr = {Float.valueOf(f), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6960c5e38376ac07cfbc334c22a331b1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6960c5e38376ac07cfbc334c22a331b1")).intValue() : (Math.min(255, Math.max(0, (int) (f * 255.0f))) << 24) + (i & ViewCompat.MEASURED_SIZE_MASK);
    }
}
