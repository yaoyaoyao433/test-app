package com.dianping.imagemanager.utils;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.dianping.imagemanager.image.drawable.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class r extends Drawable {
    public static ChangeQuickRedirect a = null;
    public static int i = 0;
    public static int j = 1;
    public static int k = 2;
    public static int l = 3;
    public final Bitmap b;
    public final Paint c;
    public float d;
    public final boolean[] e;
    public boolean f;
    public float g;
    public ColorStateList h;
    private final RectF m;
    private final RectF n;
    private final RectF o;
    private final Paint p;
    private final int q;
    private final int r;
    private final RectF s;
    private final Matrix t;
    private final RectF u;
    private Shader.TileMode v;
    private Shader.TileMode w;
    private boolean x;
    private boolean y;
    private g.b z;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    private r(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "814f90e663c894fe866cabd96e39b338", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "814f90e663c894fe866cabd96e39b338");
            return;
        }
        this.m = new RectF();
        this.n = new RectF();
        this.o = new RectF();
        this.s = new RectF();
        this.t = new Matrix();
        this.u = new RectF();
        this.v = Shader.TileMode.CLAMP;
        this.w = Shader.TileMode.CLAMP;
        this.x = true;
        this.d = 0.0f;
        this.e = new boolean[]{false, false, false, false};
        this.y = false;
        this.f = false;
        this.g = 0.0f;
        this.h = ColorStateList.valueOf(-16777216);
        this.z = g.b.d;
        this.b = bitmap;
        this.q = bitmap.getWidth();
        this.r = bitmap.getHeight();
        this.o.set(0.0f, 0.0f, this.q, this.r);
        this.m.set(this.o);
        this.p = new Paint();
        this.p.setStyle(Paint.Style.FILL);
        this.p.setAntiAlias(true);
        this.c = new Paint();
        this.c.setStyle(Paint.Style.STROKE);
        this.c.setAntiAlias(true);
        this.c.setColor(this.h.getColorForState(getState(), -16777216));
        this.c.setStrokeWidth(this.g);
    }

    public static Drawable a(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a413433d36e7c60dd2d419a78af974ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a413433d36e7c60dd2d419a78af974ca");
        }
        if (drawable == null || (drawable instanceof r)) {
            return drawable;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable.setDrawableByLayerId(layerDrawable.getId(i2), a(layerDrawable.getDrawable(i2)));
            }
            return layerDrawable;
        }
        Bitmap a2 = s.a(drawable);
        if (a2 != null) {
            return new r(a2);
        }
        return drawable;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b75c95eaecfdbb4d31a988576ab7400", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b75c95eaecfdbb4d31a988576ab7400")).booleanValue() : this.h.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b8c7a2f34faea789ee4fddf1fa74f78", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b8c7a2f34faea789ee4fddf1fa74f78")).booleanValue();
        }
        int colorForState = this.h.getColorForState(iArr, 0);
        if (this.c.getColor() != colorForState) {
            this.c.setColor(colorForState);
            return true;
        }
        return super.onStateChange(iArr);
    }

    public void a() {
        float width;
        float f;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "210bb455b417fe9a3ff9b12d34a35334", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "210bb455b417fe9a3ff9b12d34a35334");
            return;
        }
        if (this.z == g.b.f) {
            this.s.set(this.m);
            this.s.inset(this.g / 2.0f, this.g / 2.0f);
            this.t.reset();
            this.t.setTranslate((int) (((this.s.width() - this.q) * 0.5f) + 0.5f), (int) (((this.s.height() - this.r) * 0.5f) + 0.5f));
        } else {
            float f2 = 0.0f;
            if (this.z == g.b.h) {
                this.s.set(this.m);
                this.s.inset(this.g / 2.0f, this.g / 2.0f);
                this.t.reset();
                if (this.q * this.s.height() > this.s.width() * this.r) {
                    width = this.s.height() / this.r;
                    f = (this.s.width() - (this.q * width)) * 0.5f;
                } else {
                    width = this.s.width() / this.q;
                    f2 = (this.s.height() - (this.r * width)) * 0.5f;
                    f = 0.0f;
                }
                this.t.setScale(width, width);
                this.t.postTranslate((int) (f + 0.5f), (int) (f2 + 0.5f));
            } else if (this.z == g.b.g) {
                this.t.reset();
                float min = (((float) this.q) > this.m.width() || ((float) this.r) > this.m.height()) ? Math.min(this.m.width() / this.q, this.m.height() / this.r) : 1.0f;
                this.t.setScale(min, min);
                this.t.postTranslate((int) (((this.m.width() - (this.q * min)) * 0.5f) + 0.5f), (int) (((this.m.height() - (this.r * min)) * 0.5f) + 0.5f));
                this.s.set(this.o);
                this.t.mapRect(this.s);
                this.s.inset(this.g / 2.0f, this.g / 2.0f);
                this.t.setRectToRect(this.o, this.s, Matrix.ScaleToFit.FILL);
            } else if (this.z == g.b.d) {
                this.s.set(this.o);
                this.t.setRectToRect(this.o, this.m, Matrix.ScaleToFit.CENTER);
                this.t.mapRect(this.s);
                this.s.inset(this.g / 2.0f, this.g / 2.0f);
                this.t.setRectToRect(this.o, this.s, Matrix.ScaleToFit.FILL);
            } else if (this.z == g.b.e) {
                this.s.set(this.o);
                this.t.setRectToRect(this.o, this.m, Matrix.ScaleToFit.END);
                this.t.mapRect(this.s);
                this.s.inset(this.g / 2.0f, this.g / 2.0f);
                this.t.setRectToRect(this.o, this.s, Matrix.ScaleToFit.FILL);
            } else if (this.z == g.b.c) {
                this.s.set(this.o);
                this.t.setRectToRect(this.o, this.m, Matrix.ScaleToFit.START);
                this.t.mapRect(this.s);
                this.s.inset(this.g / 2.0f, this.g / 2.0f);
                this.t.setRectToRect(this.o, this.s, Matrix.ScaleToFit.FILL);
            } else if (this.z == g.b.b) {
                this.s.set(this.m);
                this.s.inset(this.g / 2.0f, this.g / 2.0f);
                this.t.reset();
                this.t.setRectToRect(this.o, this.s, Matrix.ScaleToFit.FILL);
            } else if (this.z == g.b.j) {
                this.s.set(this.m);
                this.s.inset(this.g / 2.0f, this.g / 2.0f);
                this.t.reset();
                float max = Math.max(this.s.height() / this.r, this.s.width() / this.q);
                this.t.setScale(max, max);
            } else if (this.z == g.b.k) {
                this.s.set(this.m);
                this.s.inset(this.g / 2.0f, this.g / 2.0f);
                this.t.reset();
                float max2 = Math.max(this.s.height() / this.r, this.s.width() / this.q);
                float width2 = this.s.width() - (this.q * max2);
                this.t.setScale(max2, max2);
                this.t.postTranslate((int) (width2 + 0.5f), 0.0f);
            } else if (this.z == g.b.l) {
                this.s.set(this.m);
                this.s.inset(this.g / 2.0f, this.g / 2.0f);
                this.t.reset();
                float max3 = Math.max(this.s.height() / this.r, this.s.width() / this.q);
                float height = this.s.height() - (this.r * max3);
                this.t.setScale(max3, max3);
                this.t.postTranslate(0.0f, (int) (height + 0.5f));
            } else if (this.z == g.b.m) {
                this.s.set(this.m);
                this.s.inset(this.g / 2.0f, this.g / 2.0f);
                this.t.reset();
                float max4 = Math.max(this.s.height() / this.r, this.s.width() / this.q);
                float width3 = this.s.width() - (this.q * max4);
                float height2 = this.s.height() - (this.r * max4);
                this.t.setScale(max4, max4);
                this.t.postTranslate((int) (width3 + 0.5f), (int) (height2 + 0.5f));
            } else if (this.z == g.b.p) {
                this.s.set(this.m);
                this.s.inset(this.g / 2.0f, this.g / 2.0f);
                this.t.reset();
                float max5 = Math.max(this.s.height() / this.r, this.s.width() / this.q);
                this.t.setScale(max5, max5);
                this.t.postTranslate((int) (((this.s.width() - (this.q * max5)) * 0.5f) + 0.5f), 0.0f);
            } else if (this.z == g.b.q) {
                this.s.set(this.m);
                this.s.inset(this.g / 2.0f, this.g / 2.0f);
                this.t.reset();
                float max6 = Math.max(this.s.height() / this.r, this.s.width() / this.q);
                float height3 = this.s.height() - (this.r * max6);
                this.t.setScale(max6, max6);
                this.t.postTranslate((int) (((this.s.width() - (this.q * max6)) * 0.5f) + 0.5f), (int) (height3 + 0.5f));
            } else if (this.z == g.b.n) {
                this.s.set(this.m);
                this.s.inset(this.g / 2.0f, this.g / 2.0f);
                this.t.reset();
                float max7 = Math.max(this.s.height() / this.r, this.s.width() / this.q);
                this.t.setScale(max7, max7);
                this.t.postTranslate(0.0f, (int) (((this.s.height() - (this.r * max7)) * 0.5f) + 0.5f));
            } else if (this.z == g.b.o) {
                this.s.set(this.m);
                this.s.inset(this.g / 2.0f, this.g / 2.0f);
                this.t.reset();
                float max8 = Math.max(this.s.height() / this.r, this.s.width() / this.q);
                float width4 = this.s.width() - (this.q * max8);
                this.t.setScale(max8, max8);
                this.t.postTranslate((int) (width4 + 0.5f), (int) (((this.s.height() - (this.r * max8)) * 0.5f) + 0.5f));
            }
        }
        this.x = true;
        this.n.set(this.s);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fb0e85249e88a1b59fa2a047445e35a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fb0e85249e88a1b59fa2a047445e35a");
            return;
        }
        super.onBoundsChange(rect);
        if (rect.width() != 0 && rect.height() != 0) {
            this.m.set(rect);
        }
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "766df56745d3c8447ced033cd10952d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "766df56745d3c8447ced033cd10952d5");
            return;
        }
        if (this.x) {
            BitmapShader bitmapShader = new BitmapShader(this.b, this.v, this.w);
            if (this.v == Shader.TileMode.CLAMP && this.w == Shader.TileMode.CLAMP) {
                bitmapShader.setLocalMatrix(this.t);
            }
            this.p.setShader(bitmapShader);
            this.x = false;
        }
        if (this.f) {
            if (this.g > 0.0f) {
                canvas.drawCircle(this.n.centerX(), this.n.centerY(), s.a(this.n) / 2.0f, this.p);
                canvas.drawCircle(this.s.centerX(), this.s.centerY(), s.a(this.s) / 2.0f, this.c);
                return;
            }
            canvas.drawCircle(this.n.centerX(), this.n.centerY(), s.a(this.n) / 2.0f, this.p);
        } else if (this.y) {
            if (this.g > 0.0f) {
                canvas.drawOval(this.n, this.p);
                canvas.drawOval(this.s, this.c);
                return;
            }
            canvas.drawOval(this.n, this.p);
        } else if (s.a(this.d, this.e)) {
            float f = this.d;
            if (this.g > 0.0f) {
                canvas.drawRoundRect(this.n, f, f, this.p);
                canvas.drawRoundRect(this.s, f, f, this.c);
                a(canvas);
                Object[] objArr2 = {canvas};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8eb54b988aac027e83e771e3897a45ac", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8eb54b988aac027e83e771e3897a45ac");
                    return;
                } else if (s.a(this.e) || this.d == 0.0f) {
                    return;
                } else {
                    float f2 = this.n.left;
                    float f3 = this.n.top;
                    float width = f2 + this.n.width();
                    float height = f3 + this.n.height();
                    float f4 = this.d;
                    float f5 = this.g / 2.0f;
                    if (!this.e[i]) {
                        canvas.drawLine(f2 - f5, f3, f2 + f4, f3, this.c);
                        canvas.drawLine(f2, f3 - f5, f2, f3 + f4, this.c);
                    }
                    if (!this.e[j]) {
                        canvas.drawLine((width - f4) - f5, f3, width, f3, this.c);
                        canvas.drawLine(width, f3 - f5, width, f3 + f4, this.c);
                    }
                    if (!this.e[l]) {
                        canvas.drawLine((width - f4) - f5, height, width + f5, height, this.c);
                        canvas.drawLine(width, height - f4, width, height, this.c);
                    }
                    if (this.e[k]) {
                        return;
                    }
                    canvas.drawLine(f2 - f5, height, f2 + f4, height, this.c);
                    canvas.drawLine(f2, height - f4, f2, height, this.c);
                    return;
                }
            }
            canvas.drawRoundRect(this.n, f, f, this.p);
            a(canvas);
        } else {
            canvas.drawRect(this.n, this.p);
            if (this.g > 0.0f) {
                canvas.drawRect(this.s, this.c);
            }
        }
    }

    private void a(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9216ea37bfb96ac7522f86fdbfbe4ae8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9216ea37bfb96ac7522f86fdbfbe4ae8");
        } else if (s.a(this.e) || this.d == 0.0f) {
        } else {
            float f = this.n.left;
            float f2 = this.n.top;
            float width = this.n.width() + f;
            float height = this.n.height() + f2;
            float f3 = this.d;
            if (!this.e[i]) {
                this.u.set(f, f2, f + f3, f2 + f3);
                canvas.drawRect(this.u, this.p);
            }
            if (!this.e[j]) {
                this.u.set(width - f3, f2, width, f3);
                canvas.drawRect(this.u, this.p);
            }
            if (!this.e[l]) {
                this.u.set(width - f3, height - f3, width, height);
                canvas.drawRect(this.u, this.p);
            }
            if (this.e[k]) {
                return;
            }
            this.u.set(f, height - f3, f3 + f, height);
            canvas.drawRect(this.u, this.p);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "392efd6571d7e31c41e1468492303cf4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "392efd6571d7e31c41e1468492303cf4")).intValue() : this.p.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ab8164a1831194e05ce2911fb283e22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ab8164a1831194e05ce2911fb283e22");
            return;
        }
        this.p.setAlpha(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbab282d01336813f4af57f3a0f6bd69", RobustBitConfig.DEFAULT_VALUE) ? (ColorFilter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbab282d01336813f4af57f3a0f6bd69") : this.p.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Object[] objArr = {colorFilter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9062fa160178098d79452a5648c6f9ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9062fa160178098d79452a5648c6f9ba");
            return;
        }
        this.p.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50d2a5c804d6c4184d21d3e18d4bc5d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50d2a5c804d6c4184d21d3e18d4bc5d1");
            return;
        }
        this.p.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90bf6a26ace845141c9d68906c36418e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90bf6a26ace845141c9d68906c36418e");
            return;
        }
        this.p.setFilterBitmap(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (!this.f || this.q < this.r) ? this.q : this.r;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (!this.f || this.r < this.q) ? this.r : this.q;
    }

    public final r a(g.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdec4bf3e3dbf999f98953a3abbefda0", RobustBitConfig.DEFAULT_VALUE)) {
            return (r) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdec4bf3e3dbf999f98953a3abbefda0");
        }
        if (bVar == null) {
            bVar = g.b.d;
        }
        if (this.z != bVar) {
            this.z = bVar;
            a();
        }
        return this;
    }
}
