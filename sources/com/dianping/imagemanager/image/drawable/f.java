package com.dianping.imagemanager.image.drawable;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.dianping.imagemanager.image.drawable.g;
import com.dianping.imagemanager.utils.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f extends g {
    public static ChangeQuickRedirect b = null;
    private static int s = 0;
    private static int t = 1;
    private static int u = 2;
    private static int v = 3;
    private RectF A;
    protected Paint c;
    public boolean d;
    public float e;
    public float f;
    public RectF g;
    public RectF h;
    private int o;
    private boolean p;
    private float q;
    private final boolean[] r;
    private Paint w;
    private Paint x;
    private BitmapShader y;
    private boolean z;

    public f(Drawable drawable, g.b bVar) {
        super(drawable, bVar);
        Object[] objArr = {drawable, bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4813921b00425c814996c97a0b0a405a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4813921b00425c814996c97a0b0a405a");
            return;
        }
        this.o = -986896;
        this.d = false;
        this.p = false;
        this.q = 0.0f;
        this.r = new boolean[]{false, false, false, false};
        this.z = true;
        this.e = 1.0f;
        this.f = 1.0f;
        this.g = new RectF();
        this.h = new RectF();
        this.A = new RectF();
        c();
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96e5b2164bb70c466525f65313275d13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96e5b2164bb70c466525f65313275d13");
        } else if (this.c == null) {
            this.c = new Paint();
            this.c.setColor(this.o);
            this.c.setAntiAlias(true);
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "899df41500a2f8b8f4882d8695af301b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "899df41500a2f8b8f4882d8695af301b");
            return;
        }
        this.o = i;
        this.d = this.o == 0;
        this.c.setColor(this.o);
        this.c.setAntiAlias(true);
        invalidateSelf();
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09d2c67bd921a37e026a560fa78c8207", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09d2c67bd921a37e026a560fa78c8207");
            return;
        }
        this.p = z;
        invalidateSelf();
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc53533237ae381ce72b64c4b7410d08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc53533237ae381ce72b64c4b7410d08");
        } else {
            a(f, f, f, f);
        }
    }

    private void a(float f, float f2, float f3, float f4) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c40bdeca06726f86e97ccb8c797aaf25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c40bdeca06726f86e97ccb8c797aaf25");
            return;
        }
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f));
        hashSet.add(Float.valueOf(f2));
        hashSet.add(Float.valueOf(f3));
        hashSet.add(Float.valueOf(f4));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
        }
        if (!hashSet.isEmpty()) {
            float floatValue = ((Float) hashSet.iterator().next()).floatValue();
            if (Float.isInfinite(floatValue) || Float.isNaN(floatValue) || floatValue < 0.0f) {
                throw new IllegalArgumentException("Invalid radius value: " + floatValue);
            }
            this.q = floatValue;
        } else {
            this.q = 0.0f;
        }
        this.r[s] = f > 0.0f;
        this.r[t] = f2 > 0.0f;
        this.r[v] = f3 > 0.0f;
        this.r[u] = f4 > 0.0f;
    }

    public final void a(boolean z, boolean z2, boolean z3, boolean z4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Byte.valueOf(z4 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19523231e591cfc53f9f9dbfa55509f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19523231e591cfc53f9f9dbfa55509f2");
            return;
        }
        this.r[s] = z;
        this.r[t] = z2;
        this.r[v] = z3;
        this.r[u] = z4;
    }

    @Override // com.dianping.imagemanager.image.drawable.e, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a444ebf098892cdae4acf0a45ce04ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a444ebf098892cdae4acf0a45ce04ff");
            return;
        }
        super.setAlpha(i);
        c();
        this.c.setAlpha(i);
    }

    @Override // com.dianping.imagemanager.image.drawable.g, com.dianping.imagemanager.image.drawable.e, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "673cbd4f57596c103790dbec591a8de6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "673cbd4f57596c103790dbec591a8de6");
        } else if (a() == null) {
        } else {
            b();
            if (this.p) {
                d();
                this.g.set(getBounds());
                this.h.set(getBounds());
                this.h.inset(1.0f, 1.0f);
                int save = canvas.save();
                if (!this.d) {
                    canvas.drawCircle(this.h.centerX(), this.h.centerY(), s.a(this.h) / 2.0f, this.c);
                }
                canvas.drawCircle(this.g.centerX(), this.g.centerY(), s.a(this.g) / 2.0f, e());
                canvas.restoreToCount(save);
            } else if (s.a(this.q, this.r)) {
                d();
                this.g.set(getBounds());
                this.h.set(getBounds());
                this.h.inset(1.0f, 1.0f);
                int save2 = canvas.save();
                if (!this.d) {
                    canvas.drawRoundRect(this.h, this.q, this.q, this.c);
                }
                canvas.drawRoundRect(this.g, this.q, this.q, e());
                RectF rectF = this.g;
                Paint e = e();
                Object[] objArr2 = {canvas, rectF, e};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c70278ea27c3b7075564ffe443522977", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c70278ea27c3b7075564ffe443522977");
                } else if (!s.a(this.r) && this.q != 0.0f) {
                    float f = rectF.left;
                    float f2 = rectF.top;
                    float width = rectF.width() + f;
                    float height = rectF.height() + f2;
                    float f3 = this.q;
                    if (!this.r[s]) {
                        this.A.set(f, f2, f + f3, f2 + f3);
                        if (!this.d) {
                            canvas.drawRect(this.A, this.c);
                        }
                        canvas.drawRect(this.A, e);
                    }
                    if (!this.r[t]) {
                        this.A.set(width - f3, f2, width, f3);
                        if (!this.d) {
                            canvas.drawRect(this.A, this.c);
                        }
                        canvas.drawRect(this.A, e);
                    }
                    if (!this.r[v]) {
                        this.A.set(width - f3, height - f3, width, height);
                        if (!this.d) {
                            canvas.drawRect(this.A, this.c);
                        }
                        canvas.drawRect(this.A, e);
                    }
                    if (!this.r[u]) {
                        this.A.set(f, height - f3, f3 + f, height);
                        if (!this.d) {
                            canvas.drawRect(this.A, this.c);
                        }
                        canvas.drawRect(this.A, e);
                    }
                }
                canvas.restoreToCount(save2);
            } else {
                if (!this.d) {
                    canvas.drawRect(getBounds(), this.c);
                }
                if (this.n != null) {
                    int save3 = canvas.save();
                    canvas.clipRect(getBounds());
                    canvas.concat(this.n);
                    a().draw(canvas);
                    canvas.restoreToCount(save3);
                    return;
                }
                a().draw(canvas);
            }
        }
    }

    @Override // com.dianping.imagemanager.image.drawable.g, com.dianping.imagemanager.image.drawable.e
    public final Drawable a(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09769ed2850452365c5b5a2873eb852b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09769ed2850452365c5b5a2873eb852b");
        }
        this.z = drawable != getCurrent();
        return super.a(drawable);
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc69d9b8adf5217eb929d4aed76493d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc69d9b8adf5217eb929d4aed76493d8");
        } else if (getCurrent() instanceof ColorDrawable) {
            this.e = 1.0f;
            this.f = 1.0f;
            this.y = null;
            this.w = null;
            if (this.x == null) {
                this.x = new Paint();
                this.x.setAntiAlias(true);
                this.x.setStyle(Paint.Style.FILL);
                this.x.setDither(true);
            }
            this.x.setColor(((ColorDrawable) getCurrent()).getColor());
        } else {
            if (this.w == null) {
                this.w = new Paint();
                this.w.setAntiAlias(true);
                this.w.setFilterBitmap(true);
                this.w.setStyle(Paint.Style.FILL);
                this.w.setDither(true);
            }
            float f = this.e;
            float f2 = this.f;
            if (this.z) {
                Bitmap a = s.a(a());
                if (a != null) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.y = new BitmapShader(a, tileMode, tileMode);
                    this.w.setShader(this.y);
                    if ((a() instanceof BitmapDrawable) && a.getWidth() > 0 && a.getHeight() > 0) {
                        float intrinsicWidth = (a().getIntrinsicWidth() * 1.0f) / a.getWidth();
                        f2 = (a().getIntrinsicHeight() * 1.0f) / a.getHeight();
                        f = intrinsicWidth;
                        this.z = false;
                    }
                }
                f = 1.0f;
                f2 = 1.0f;
                this.z = false;
            }
            this.e = f;
            this.f = f2;
            if (this.y != null) {
                if (this.n != null) {
                    Matrix matrix = new Matrix();
                    matrix.set(this.n);
                    if (Float.compare(f, 1.0f) != 0 || Float.compare(f2, 1.0f) != 0) {
                        matrix.preScale(f, f2);
                    }
                    this.y.setLocalMatrix(matrix);
                } else if (Float.compare(f, 1.0f) == 0 && Float.compare(f2, 1.0f) == 0) {
                } else {
                    Matrix matrix2 = new Matrix();
                    matrix2.preScale(f, f2);
                    this.y.setLocalMatrix(matrix2);
                }
            }
        }
    }

    private Paint e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec88a4b42ae4024ada39c73a4c30ff7b", RobustBitConfig.DEFAULT_VALUE) ? (Paint) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec88a4b42ae4024ada39c73a4c30ff7b") : getCurrent() instanceof ColorDrawable ? this.x : this.w;
    }
}
