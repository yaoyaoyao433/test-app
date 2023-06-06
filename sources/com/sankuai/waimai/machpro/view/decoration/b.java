package com.sankuai.waimai.machpro.view.decoration;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends Drawable {
    public static ChangeQuickRedirect a;
    public a b;
    public Path c;
    public boolean d;
    private Paint e;
    private Path f;
    private float[] g;
    private final float[] h;
    private RectF i;
    private Rect j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private Path p;
    private Paint q;
    private float[] r;
    private boolean s;
    private c t;
    private Shader u;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73d0735f4d048e48045bc448116cc7e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73d0735f4d048e48045bc448116cc7e3");
            return;
        }
        this.g = new float[8];
        this.h = new float[8];
        this.i = new RectF();
        this.j = new Rect();
        this.r = new float[8];
        this.d = true;
        this.f = new Path();
        this.p = new Path();
        this.c = new Path();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4de2abc800cbb1f151aecc512baec25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4de2abc800cbb1f151aecc512baec25");
            return;
        }
        super.setBounds(i, i2, i3, i4);
        this.i.set(i, i2, i3, i4);
        this.j.set(i, i2, i3, i4);
        this.s = true;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08c1e1be1b9cd0868380658602f28c8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08c1e1be1b9cd0868380658602f28c8d");
            return;
        }
        if (this.e == null) {
            this.e = new Paint();
        }
        this.e.reset();
        this.e.setAntiAlias(true);
        this.e.setStyle(Paint.Style.FILL_AND_STROKE);
        this.e.setColor(i);
        invalidateSelf();
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56a21321c37efb8b26b083750dc83795", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56a21321c37efb8b26b083750dc83795");
            return;
        }
        this.k = f;
        this.g[0] = this.k;
        this.g[1] = this.k;
        this.s = true;
        invalidateSelf();
    }

    public final void b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "642718477dc50b36f802699dc2f8b235", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "642718477dc50b36f802699dc2f8b235");
            return;
        }
        this.l = f;
        this.g[6] = this.l;
        this.g[7] = this.l;
        this.s = true;
        invalidateSelf();
    }

    public final void c(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bdbf76f9a1279f35158aa53a59c21f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bdbf76f9a1279f35158aa53a59c21f6");
            return;
        }
        this.m = f;
        this.g[2] = this.m;
        this.g[3] = this.m;
        this.s = true;
        invalidateSelf();
    }

    public final void d(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66f2ada15a58b969a41aade7542f06fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66f2ada15a58b969a41aade7542f06fe");
            return;
        }
        this.n = f;
        this.g[4] = this.n;
        this.g[5] = this.n;
        this.s = true;
        invalidateSelf();
    }

    public final void e(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f009e9118ded5d732462b21b74c8ae98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f009e9118ded5d732462b21b74c8ae98");
            return;
        }
        this.o = f;
        Arrays.fill(this.g, this.o);
        this.s = true;
        invalidateSelf();
    }

    private boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b3379a98f08bf6d63ebf1304738ca92", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b3379a98f08bf6d63ebf1304738ca92")).booleanValue() : this.o > 0.0f || this.k > 0.0f || this.l > 0.0f || this.m > 0.0f || this.n > 0.0f;
    }

    public final void a(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ae3e9ba8b702139b4e29d48089062a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ae3e9ba8b702139b4e29d48089062a6");
        } else if (this.b == null || this.q == null) {
        } else {
            canvas.drawPath(this.p, this.q);
        }
    }

    public final void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e97354dea94a8cd63079c097dbec41f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e97354dea94a8cd63079c097dbec41f0");
            return;
        }
        this.t = cVar;
        if (this.t == null) {
            this.u = null;
        }
        this.s = true;
        if (this.e == null) {
            this.e = new Paint();
        }
        this.e.reset();
        this.e.setAntiAlias(true);
        this.e.setStyle(Paint.Style.FILL_AND_STROKE);
        invalidateSelf();
    }

    private PathEffect f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08dd6ef5e0f718b40cfb84a70f5701f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (PathEffect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08dd6ef5e0f718b40cfb84a70f5701f8");
        }
        if (this.b == null) {
            return null;
        }
        switch (this.b.c) {
            case 2:
                return new DashPathEffect(new float[]{this.b.b, this.b.b, this.b.b, this.b.b}, 0.0f);
            case 3:
                return new DashPathEffect(new float[]{this.b.b * 3.0f, this.b.b * 3.0f, this.b.b * 3.0f, this.b.b * 3.0f}, 0.0f);
            default:
                return null;
        }
    }

    public final void a() {
        this.b = null;
        this.q = null;
        this.s = true;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba55103661732765ae17868662d115be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba55103661732765ae17868662d115be");
            return;
        }
        if (this.q == null) {
            this.q = new Paint();
        }
        this.q.reset();
        this.q.setAntiAlias(true);
        this.q.setStyle(Paint.Style.STROKE);
        this.q.setStrokeWidth(this.b.b);
        this.q.setColor(this.b.d);
        this.q.setPathEffect(f());
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9820eeedba2d06e4f7c2e4dd5f916937", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9820eeedba2d06e4f7c2e4dd5f916937");
            return;
        }
        b();
        this.s = true;
        invalidateSelf();
    }

    private boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63c6fa30fa5084b57fd65c3cda85eaea", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63c6fa30fa5084b57fd65c3cda85eaea")).booleanValue() : this.b != null && this.b.b > 0.0f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        float f;
        RectF rectF;
        char c;
        char c2;
        float[] fArr;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ddc6fdf9690f63db85de38986f5b0fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ddc6fdf9690f63db85de38986f5b0fe");
            return;
        }
        if (this.s) {
            this.s = false;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "33689627d334fb7eb1b0bfa9ef8237fe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "33689627d334fb7eb1b0bfa9ef8237fe");
            } else {
                RectF rectF2 = new RectF(this.i);
                if (g() && this.b.a()) {
                    f = this.b.b * 0.5f;
                    rectF2.left += this.b.b * 0.5f;
                    rectF2.top += this.b.b * 0.5f;
                    rectF2.right -= this.b.b * 0.5f;
                    rectF2.bottom -= this.b.b * 0.5f;
                } else {
                    f = 0.0f;
                }
                float[] fArr2 = new float[8];
                if (e()) {
                    fArr2[0] = Math.max(this.g[0] - f, 0.0f);
                    fArr2[1] = Math.max(this.g[1] - f, 0.0f);
                    fArr2[2] = Math.max(this.g[2] - f, 0.0f);
                    fArr2[3] = Math.max(this.g[3] - f, 0.0f);
                    fArr2[4] = Math.max(this.g[4] - f, 0.0f);
                    fArr2[5] = Math.max(this.g[5] - f, 0.0f);
                    fArr2[6] = Math.max(this.g[6] - f, 0.0f);
                    fArr2[7] = Math.max(this.g[7] - f, 0.0f);
                }
                this.f.reset();
                if (this.e != null) {
                    if (g() && this.b.a()) {
                        this.e.setStrokeWidth(this.b.b);
                    } else {
                        this.e.setStrokeWidth(0.0f);
                    }
                    this.f.addRoundRect(rectF2, fArr2, Path.Direction.CW);
                }
                if (this.t != null) {
                    c cVar = this.t;
                    if (cVar.b == -1 && cVar.c != -1.0f) {
                        float f2 = this.t.c;
                        float width = this.i.width();
                        float height = this.i.height();
                        Object[] objArr3 = {Float.valueOf(f2), Float.valueOf(width), Float.valueOf(height)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ba861065acd0c092da11a6900f9dea4f", RobustBitConfig.DEFAULT_VALUE)) {
                            fArr = (float[]) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ba861065acd0c092da11a6900f9dea4f");
                            rectF = rectF2;
                        } else {
                            float[] fArr3 = {0.0f, 0.0f, 0.0f, 0.0f};
                            float f3 = (float) (f2 * 0.017453292519943295d);
                            float atan = (float) Math.atan(height / width);
                            float atan2 = (float) Math.atan(width / height);
                            if (f3 <= atan) {
                                rectF = rectF2;
                                fArr3[0] = (float) ((width - (Math.tan(f3) * height)) / 2.0d);
                                fArr3[1] = height;
                                fArr3[2] = width - fArr3[0];
                                fArr3[3] = 0.0f;
                            } else {
                                rectF = rectF2;
                                double d = f3;
                                if (d < 1.5707963267948966d) {
                                    fArr3[0] = 0.0f;
                                    fArr3[1] = (float) ((height + (Math.tan(1.5707963267948966d - d) * width)) / 2.0d);
                                    fArr3[2] = width;
                                    fArr3[3] = height - fArr3[1];
                                } else if (d == 1.5707963267948966d) {
                                    fArr3[0] = 0.0f;
                                    fArr3[1] = 0.0f;
                                    fArr3[2] = width;
                                    fArr3[3] = 0.0f;
                                } else {
                                    double d2 = atan;
                                    if (d <= 3.141592653589793d - d2) {
                                        fArr3[0] = 0.0f;
                                        fArr3[1] = (float) ((height - (width * Math.tan(d - 1.5707963267948966d))) / 2.0d);
                                        fArr3[2] = width;
                                        fArr3[3] = height - fArr3[1];
                                    } else if (d < 3.141592653589793d) {
                                        fArr3[0] = (float) ((width - (height * Math.tan(3.141592653589793d - d))) / 2.0d);
                                        fArr3[1] = 0.0f;
                                        fArr3[2] = width - fArr3[0];
                                        fArr3[3] = height;
                                    } else if (d == 3.141592653589793d) {
                                        fArr3[0] = 0.0f;
                                        fArr3[1] = 0.0f;
                                        fArr3[2] = 0.0f;
                                        fArr3[3] = height;
                                    } else if (d <= atan2 + 3.141592653589793d) {
                                        fArr3[0] = (float) ((width + (Math.tan(d - 3.141592653589793d) * height)) / 2.0d);
                                        fArr3[1] = 0.0f;
                                        fArr3[2] = width - fArr3[0];
                                        fArr3[3] = height;
                                    } else if (d < 4.71238898038469d) {
                                        fArr3[0] = width;
                                        fArr3[1] = (float) ((height - (width * Math.tan(4.71238898038469d - d))) / 2.0d);
                                        fArr3[2] = 0.0f;
                                        fArr3[3] = height - fArr3[1];
                                    } else if (d == 4.71238898038469d) {
                                        fArr3[0] = width;
                                        fArr3[1] = 0.0f;
                                        fArr3[2] = 0.0f;
                                        fArr3[3] = 0.0f;
                                    } else if (d <= d2 + 4.71238898038469d) {
                                        fArr3[0] = width;
                                        fArr3[1] = (float) ((height + (Math.tan(d - 4.71238898038469d) * width)) / 2.0d);
                                        fArr3[2] = 0.0f;
                                        fArr3[3] = height - fArr3[1];
                                    } else {
                                        if (d < 6.283185307179586d) {
                                            fArr3[0] = (float) ((width + (Math.tan(6.283185307179586d - d) * height)) / 2.0d);
                                            fArr3[1] = height;
                                            fArr3[2] = width - fArr3[0];
                                            fArr3[3] = 0.0f;
                                        } else {
                                            fArr3[0] = 0.0f;
                                            fArr3[1] = height;
                                            fArr3[2] = 0.0f;
                                            fArr3[3] = 0.0f;
                                        }
                                        fArr = fArr3;
                                    }
                                }
                            }
                            fArr = fArr3;
                        }
                    } else {
                        rectF = rectF2;
                        int i = this.t.b;
                        float width2 = this.i.width();
                        float height2 = this.i.height();
                        Object[] objArr4 = {Integer.valueOf(i), Float.valueOf(width2), Float.valueOf(height2)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "9c3712b5bca30fccca26cde68652fbb4", RobustBitConfig.DEFAULT_VALUE)) {
                            fArr = (float[]) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "9c3712b5bca30fccca26cde68652fbb4");
                        } else {
                            float[] fArr4 = {0.0f, 0.0f, 0.0f, 0.0f};
                            switch (i) {
                                case 1:
                                    c = 3;
                                    c2 = 0;
                                    fArr4[3] = height2;
                                    break;
                                case 2:
                                    c2 = 0;
                                    fArr4[0] = width2;
                                    c = 3;
                                    fArr4[3] = height2;
                                    break;
                                case 3:
                                    c2 = 0;
                                    fArr4[0] = width2;
                                    c = 3;
                                    break;
                                case 4:
                                    c2 = 0;
                                    fArr4[0] = width2;
                                    fArr4[1] = height2;
                                    c = 3;
                                    break;
                                case 5:
                                    fArr4[1] = height2;
                                    c = 3;
                                    c2 = 0;
                                    break;
                                case 6:
                                    fArr4[2] = width2;
                                    fArr4[1] = height2;
                                    c = 3;
                                    c2 = 0;
                                    break;
                                case 7:
                                    fArr4[2] = width2;
                                    c = 3;
                                    c2 = 0;
                                    break;
                                case 8:
                                    fArr4[2] = width2;
                                    fArr4[3] = height2;
                                    c = 3;
                                    c2 = 0;
                                    break;
                                default:
                                    c = 3;
                                    c2 = 0;
                                    break;
                            }
                            fArr = fArr4;
                            this.u = new LinearGradient(fArr[c2], fArr[1], fArr[2], fArr[c], this.t.d, this.t.e, Shader.TileMode.CLAMP);
                        }
                    }
                    c = 3;
                    c2 = 0;
                    this.u = new LinearGradient(fArr[c2], fArr[1], fArr[2], fArr[c], this.t.d, this.t.e, Shader.TileMode.CLAMP);
                } else {
                    rectF = rectF2;
                }
                if (g()) {
                    this.p.reset();
                    this.r = fArr2;
                    float[] fArr5 = this.h;
                    if (e()) {
                        fArr5 = this.r;
                    }
                    if (this.b.a()) {
                        this.p.addRoundRect(rectF, fArr5, Path.Direction.CW);
                    } else {
                        float f4 = this.b.b * 0.5f;
                        if ((this.b.e & 1) != 0) {
                            this.p.moveTo(this.b.b * 0.5f, this.r[0]);
                            this.p.lineTo(this.b.b * 0.5f, this.i.bottom - this.r[7]);
                            this.p.addArc(new RectF(f4, f4, (this.r[0] * 2.0f) - f4, (this.r[0] * 2.0f) - f4), 180.0f, 45.0f);
                            this.p.addArc(new RectF(f4, (this.i.bottom - (this.r[7] * 2.0f)) + f4, (this.r[7] * 2.0f) - f4, this.i.bottom - f4), 135.0f, 45.0f);
                        }
                        if ((this.b.e & 4096) != 0) {
                            this.p.moveTo(this.r[7], this.i.bottom - (this.b.b * 0.5f));
                            this.p.lineTo(this.i.right - this.r[4], this.i.bottom - (this.b.b * 0.5f));
                            this.p.addArc(new RectF(f4, (this.i.bottom - (this.r[7] * 2.0f)) + f4, (this.r[7] * 2.0f) - f4, this.i.bottom - f4), 90.0f, 45.0f);
                            this.p.addArc(new RectF((this.i.right - (this.r[4] * 2.0f)) + f4, (this.i.bottom - (this.r[4] * 2.0f)) + f4, this.i.right - f4, this.i.bottom - f4), 45.0f, 45.0f);
                        }
                        if ((this.b.e & 256) != 0) {
                            this.p.moveTo(this.r[0], this.b.b * 0.5f);
                            this.p.lineTo(this.i.right - this.r[2], this.b.b * 0.5f);
                            this.p.addArc(new RectF(f4, f4, (this.r[0] * 2.0f) - f4, (this.r[0] * 2.0f) - f4), 225.0f, 45.0f);
                            this.p.addArc(new RectF((this.i.right - (this.r[2] * 2.0f)) + f4, f4, this.i.right - f4, (this.r[2] * 2.0f) - f4), 270.0f, 45.0f);
                        }
                        if ((this.b.e & 16) != 0) {
                            this.p.moveTo(this.i.right - (this.b.b * 0.5f), this.r[2]);
                            this.p.lineTo(this.i.right - (this.b.b * 0.5f), this.i.bottom - this.r[4]);
                            this.p.addArc(new RectF((this.i.right - (this.r[2] * 2.0f)) + f4, f4, this.i.right - f4, (this.r[2] * 2.0f) - f4), 315.0f, 45.0f);
                            this.p.addArc(new RectF((this.i.right - (this.r[4] * 2.0f)) + f4, (this.i.bottom - (this.r[4] * 2.0f)) + f4, this.i.right - f4, this.i.bottom - f4), 0.0f, 45.0f);
                        }
                    }
                }
                this.c.reset();
                if (e()) {
                    this.c.addRoundRect(this.i, this.g, Path.Direction.CW);
                } else {
                    this.c.addRect(this.i, Path.Direction.CW);
                }
            }
        }
        Object[] objArr5 = {canvas};
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "5252192382322f4f3a8147a0f3f935bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "5252192382322f4f3a8147a0f3f935bd");
        } else if (this.e != null) {
            if (this.u != null) {
                this.e.setShader(this.u);
            }
            canvas.drawPath(this.f, this.e);
            this.u = null;
        }
        if (this.d) {
            a(canvas);
        }
    }

    public final boolean d() {
        for (float f : this.g) {
            if (f != this.g[0]) {
                return false;
            }
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(@NonNull Outline outline) {
        Object[] objArr = {outline};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e0838c682633a4ba401622de0199241", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e0838c682633a4ba401622de0199241");
        } else if (d() && Build.VERSION.SDK_INT >= 21) {
            outline.setRoundRect(this.j, this.g[0]);
        } else {
            super.getOutline(outline);
        }
    }
}
