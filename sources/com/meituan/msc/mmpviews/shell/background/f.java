package com.meituan.msc.mmpviews.shell.background;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import com.meituan.msc.uimanager.ah;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f extends Drawable implements Animatable, Drawable.Callback {
    public static ChangeQuickRedirect a;
    private final Paint A;
    private int B;
    private int C;
    private com.meituan.msc.mmpviews.shell.background.a[] D;
    @Nullable
    public ah b;
    @Nullable
    public ah c;
    @Nullable
    public ah d;
    public b[] e;
    public boolean f;
    public float g;
    public float[] h;
    public int i;
    @Nullable
    public float[] j;
    public Drawable[] k;
    @Nullable
    private b l;
    @Nullable
    private PathEffect m;
    @Nullable
    private Path n;
    @Nullable
    private Path o;
    @Nullable
    private Path p;
    @Nullable
    private Path q;
    @Nullable
    private Path r;
    @Nullable
    private RectF s;
    @Nullable
    private RectF t;
    @Nullable
    private RectF u;
    @Nullable
    private RectF v;
    @Nullable
    private PointF w;
    @Nullable
    private PointF x;
    @Nullable
    private PointF y;
    @Nullable
    private PointF z;

    private static int a(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de3c85abdf1c23741d2fb858569b1319", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de3c85abdf1c23741d2fb858569b1319")).intValue() : ((((int) f) << 24) & (-16777216)) | (((int) f2) & ViewCompat.MEASURED_SIZE_MASK);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum b {
        SOLID,
        DASHED,
        DOTTED;
        
        public static ChangeQuickRedirect a;

        b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78c6cab1df53939a488fcda94623b53b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78c6cab1df53939a488fcda94623b53b");
            }
        }

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bfd959d7ad4f32755ae128acabccc99b", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bfd959d7ad4f32755ae128acabccc99b") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d22ecc239b8a345634b9ca8d8531f291", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d22ecc239b8a345634b9ca8d8531f291") : (b[]) values().clone();
        }

        @Nullable
        public static PathEffect a(b bVar, float f) {
            Object[] objArr = {bVar, Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff1a417ba5577fd72c2515c3bfeeb5d6", RobustBitConfig.DEFAULT_VALUE)) {
                return (PathEffect) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff1a417ba5577fd72c2515c3bfeeb5d6");
            }
            switch (bVar) {
                case SOLID:
                    return null;
                case DASHED:
                    float f2 = f * 3.0f;
                    return new DashPathEffect(new float[]{f2, f2, f2, f2}, 0.0f);
                case DOTTED:
                    return new DashPathEffect(new float[]{f, f, f, f}, 0.0f);
                default:
                    return null;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum a {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_RIGHT,
        BOTTOM_LEFT;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4bc2de9c1024ae87725e36b08b82200", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4bc2de9c1024ae87725e36b08b82200");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ee93075478254e8e71fa7e65e7c3757", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ee93075478254e8e71fa7e65e7c3757") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7366e9bf98a64785eee482f17dcf76e6", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7366e9bf98a64785eee482f17dcf76e6") : (a[]) values().clone();
        }
    }

    public f(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39f013af49dca26aec514a982cb9e838", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39f013af49dca26aec514a982cb9e838");
            return;
        }
        this.f = false;
        this.g = Float.NaN;
        this.A = new Paint(1);
        this.i = 0;
        this.B = 255;
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0225  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r68) {
        /*
            Method dump skipped, instructions count: 1829
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.mmpviews.shell.background.f.draw(android.graphics.Canvas):void");
    }

    public final boolean a() {
        float[] fArr;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d4e41e867dd3aff9c3532659a408aa3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d4e41e867dd3aff9c3532659a408aa3")).booleanValue();
        }
        if (com.facebook.yoga.b.a(this.g) || this.g <= 0.0f) {
            if (this.j != null) {
                for (float f : this.j) {
                    if (!com.facebook.yoga.b.a(f) && f > 0.0f) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e958174fccdd4ba7cc4406c37e89fbae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e958174fccdd4ba7cc4406c37e89fbae");
            return;
        }
        super.onBoundsChange(rect);
        if (this.D != null) {
            for (com.meituan.msc.mmpviews.shell.background.a aVar : this.D) {
                aVar.setBounds(rect);
            }
        }
        this.f = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2583e4c9d2935e1435284c04e7e43684", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2583e4c9d2935e1435284c04e7e43684");
        } else if (i != this.B) {
            this.B = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0cb939af14346312e4ac41489e4f7fb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0cb939af14346312e4ac41489e4f7fb")).intValue();
        }
        int a2 = com.meituan.msc.mmpviews.shell.background.b.a(this.i, this.B);
        Object[] objArr2 = {Integer.valueOf(a2)};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.mmpviews.shell.background.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f0c3e5b6f1ded0c6b883ce3f4ef4bbd9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f0c3e5b6f1ded0c6b883ce3f4ef4bbd9")).intValue();
        }
        int i = a2 >>> 24;
        if (i == 255) {
            return -1;
        }
        return i == 0 ? -2 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Object[] objArr = {outline};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "104b24e0c14d363381d2a63d864f157c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "104b24e0c14d363381d2a63d864f157c");
        } else if (Build.VERSION.SDK_INT < 21) {
            super.getOutline(outline);
        } else if ((!com.facebook.yoga.b.a(this.g) && this.g > 0.0f) || this.j != null) {
            d();
            if (this.p == null) {
                com.meituan.msc.modules.reporter.g.d("[MSCViewBackgroundDrawable@getOutline] mPathForBorderRadiusOutline is null");
                return;
            }
            try {
                outline.setConvexPath(this.p);
            } catch (IllegalArgumentException e) {
                if (!"path must be convex".equals(e.getMessage())) {
                    throw e;
                }
                com.meituan.msc.modules.reporter.g.b("ReactViewBackgroundDrawable", null, e);
            }
        } else {
            outline.setRect(getBounds());
        }
    }

    public final float b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1681e2a40a62ed3a0bdd2de1fed57df", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1681e2a40a62ed3a0bdd2de1fed57df")).floatValue();
        }
        if (com.facebook.yoga.b.a(this.g)) {
            return 0.0f;
        }
        return this.g;
    }

    public final float a(float f, a aVar) {
        Object[] objArr = {Float.valueOf(f), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "007ffb56ba3f00ff335eede80c046a08", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "007ffb56ba3f00ff335eede80c046a08")).floatValue();
        }
        if (this.j == null) {
            return f;
        }
        float f2 = this.j[aVar.ordinal()];
        return com.facebook.yoga.b.a(f2) ? f : f2;
    }

    public final void a(com.meituan.msc.mmpviews.shell.background.a[] aVarArr) {
        Object[] objArr = {aVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80ac832299b6ed058bb3f12a10ce791e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80ac832299b6ed058bb3f12a10ce791e");
            return;
        }
        if (this.D != null) {
            for (com.meituan.msc.mmpviews.shell.background.a aVar : this.D) {
                aVar.setCallback(null);
            }
        }
        this.D = aVarArr;
        if (aVarArr != null) {
            for (com.meituan.msc.mmpviews.shell.background.a aVar2 : aVarArr) {
                aVar2.setCallback(this);
                aVar2.setVisible(isVisible(), true);
                aVar2.setState(getState());
                aVar2.setLevel(getLevel());
                aVar2.setBounds(getBounds());
                if (Build.VERSION.SDK_INT >= 23) {
                    aVar2.setLayoutDirection(getLayoutDirection());
                }
            }
        }
        invalidateSelf();
    }

    public final boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "329d45f17aec71de5817d6069f7274f1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "329d45f17aec71de5817d6069f7274f1")).booleanValue();
        }
        if (this.C != i) {
            this.C = i;
            return false;
        }
        return false;
    }

    private void d() {
        float max;
        float max2;
        float max3;
        float max4;
        float max5;
        float max6;
        float max7;
        float max8;
        int i;
        float f;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebba992459a262e3c65ffd13624a2ce0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebba992459a262e3c65ffd13624a2ce0");
        } else if (this.f) {
            this.f = false;
            if (this.n == null) {
                this.n = new Path();
            }
            if (this.o == null) {
                this.o = new Path();
            }
            if (this.p == null) {
                this.p = new Path();
            }
            if (this.r == null) {
                this.r = new Path();
            }
            if (this.s == null) {
                this.s = new RectF();
            }
            if (this.t == null) {
                this.t = new RectF();
            }
            if (this.u == null) {
                this.u = new RectF();
            }
            if (this.v == null) {
                this.v = new RectF();
            }
            this.n.reset();
            this.o.reset();
            this.p.reset();
            this.r.reset();
            this.s.set(getBounds());
            this.t.set(getBounds());
            this.u.set(getBounds());
            this.v.set(getBounds());
            RectF c = c();
            this.s.top += c.top;
            this.s.bottom -= c.bottom;
            this.s.left += c.left;
            this.s.right -= c.right;
            this.v.top += c.top * 0.5f;
            this.v.bottom -= c.bottom * 0.5f;
            this.v.left += c.left * 0.5f;
            this.v.right -= c.right * 0.5f;
            float b2 = b();
            float a2 = a(b2, a.TOP_LEFT);
            float a3 = a(b2, a.TOP_RIGHT);
            float a4 = a(b2, a.BOTTOM_LEFT);
            float a5 = a(b2, a.BOTTOM_RIGHT);
            this.h = new float[]{Math.max(a2 - c.left, 0.0f), Math.max(a2 - c.top, 0.0f), Math.max(a3 - c.right, 0.0f), Math.max(a3 - c.top, 0.0f), Math.max(a5 - c.right, 0.0f), Math.max(a5 - c.bottom, 0.0f), Math.max(a4 - c.left, 0.0f), Math.max(a4 - c.bottom, 0.0f)};
            this.n.addRoundRect(this.s, this.h, Path.Direction.CW);
            this.o.addRoundRect(this.t, new float[]{a2, a2, a3, a3, a5, a5, a4, a4}, Path.Direction.CW);
            if (this.b != null) {
                i = 8;
                f = this.b.a(8) / 2.0f;
            } else {
                i = 8;
                f = 0.0f;
            }
            Path path = this.p;
            RectF rectF = this.u;
            float[] fArr = new float[i];
            float f2 = a2 + f;
            fArr[0] = f2;
            fArr[1] = f2;
            float f3 = a3 + f;
            fArr[2] = f3;
            fArr[3] = f3;
            float f4 = a5 + f;
            fArr[4] = f4;
            fArr[5] = f4;
            float f5 = f + a4;
            fArr[6] = f5;
            fArr[7] = f5;
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            Path path2 = this.r;
            RectF rectF2 = this.v;
            float[] fArr2 = new float[8];
            fArr2[0] = Math.max(a2 - (c.left * 0.5f), c.left > 0.0f ? a2 / c.left : 0.0f);
            fArr2[1] = Math.max(a2 - (c.top * 0.5f), c.top > 0.0f ? a2 / c.top : 0.0f);
            fArr2[2] = Math.max(a3 - (c.right * 0.5f), c.right > 0.0f ? a3 / c.right : 0.0f);
            fArr2[3] = Math.max(a3 - (c.top * 0.5f), c.top > 0.0f ? a3 / c.top : 0.0f);
            fArr2[4] = Math.max(a5 - (c.right * 0.5f), c.right > 0.0f ? a5 / c.right : 0.0f);
            fArr2[5] = Math.max(a5 - (c.bottom * 0.5f), c.bottom > 0.0f ? a5 / c.bottom : 0.0f);
            fArr2[6] = Math.max(a4 - (c.left * 0.5f), c.left > 0.0f ? a4 / c.left : 0.0f);
            fArr2[7] = Math.max(a4 - (c.bottom * 0.5f), c.bottom > 0.0f ? a4 / c.bottom : 0.0f);
            path2.addRoundRect(rectF2, fArr2, Path.Direction.CW);
            if (this.w == null) {
                this.w = new PointF();
            }
            this.w.x = this.s.left;
            this.w.y = this.s.top;
            a(this.s.left, this.s.top, this.s.left + (max * 2.0f), this.s.top + (max2 * 2.0f), this.t.left, this.t.top, this.s.left, this.s.top, this.w);
            if (this.z == null) {
                this.z = new PointF();
            }
            this.z.x = this.s.left;
            this.z.y = this.s.bottom;
            a(this.s.left, this.s.bottom - (max8 * 2.0f), this.s.left + (max7 * 2.0f), this.s.bottom, this.t.left, this.t.bottom, this.s.left, this.s.bottom, this.z);
            if (this.x == null) {
                this.x = new PointF();
            }
            this.x.x = this.s.right;
            this.x.y = this.s.top;
            a(this.s.right - (max3 * 2.0f), this.s.top, this.s.right, this.s.top + (max4 * 2.0f), this.t.right, this.t.top, this.s.right, this.s.top, this.x);
            if (this.y == null) {
                this.y = new PointF();
            }
            this.y.x = this.s.right;
            this.y.y = this.s.bottom;
            a(this.s.right - (max5 * 2.0f), this.s.bottom - (max6 * 2.0f), this.s.right, this.s.bottom, this.t.right, this.t.bottom, this.s.right, this.s.bottom, this.y);
        }
    }

    private static void a(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, PointF pointF) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5), Double.valueOf(d6), Double.valueOf(d7), Double.valueOf(d8), pointF};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dfa590f168341fdc8b00672e004eae4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dfa590f168341fdc8b00672e004eae4b");
            return;
        }
        double d9 = (d + d3) / 2.0d;
        double d10 = (d2 + d4) / 2.0d;
        double d11 = d5 - d9;
        double d12 = d6 - d10;
        double abs = Math.abs(d3 - d) / 2.0d;
        double abs2 = Math.abs(d4 - d2) / 2.0d;
        double d13 = ((d8 - d10) - d12) / ((d7 - d9) - d11);
        double d14 = d12 - (d11 * d13);
        double d15 = abs2 * abs2;
        double d16 = abs * abs;
        double d17 = (d16 * d13 * d13) + d15;
        double d18 = abs * 2.0d * abs * d14 * d13;
        double d19 = (-(d16 * ((d14 * d14) - d15))) / d17;
        double d20 = d17 * 2.0d;
        double sqrt = ((-d18) / d20) - Math.sqrt(d19 + Math.pow(d18 / d20, 2.0d));
        double d21 = sqrt + d9;
        double d22 = (d13 * sqrt) + d14 + d10;
        if (Double.isNaN(d21) || Double.isNaN(d22)) {
            return;
        }
        pointF.x = (float) d21;
        pointF.y = (float) d22;
    }

    private float a(float f, int i) {
        Object[] objArr = {Float.valueOf(f), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "450964e6499989119f90b0b6033b3576", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "450964e6499989119f90b0b6033b3576")).floatValue();
        }
        if (this.b == null) {
            return f;
        }
        float f2 = this.b.b[i];
        return com.facebook.yoga.b.a(f2) ? f : f2;
    }

    private float e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1c62dbeb4e6da6265579c06b836fd64", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1c62dbeb4e6da6265579c06b836fd64")).floatValue();
        }
        if (this.b == null || com.facebook.yoga.b.a(this.b.b[8])) {
            return 0.0f;
        }
        return this.b.b[8];
    }

    private void a(Canvas canvas, RectF rectF, boolean z) {
        Object[] objArr = {canvas, rectF, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1660dab133ee4380c623daaa555d268a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1660dab133ee4380c623daaa555d268a");
            return;
        }
        int save = canvas.save();
        if (z) {
            canvas.clipPath(this.o);
        } else {
            canvas.clipRect(getBounds());
        }
        Rect rect = new Rect();
        rect.set(getBounds());
        if (rect.right > 0) {
            rect.right = (int) (rect.right - (rectF.right + rectF.left));
        }
        if (rect.bottom > 0) {
            rect.bottom = (int) (rect.bottom - (rectF.bottom + rectF.top));
        }
        canvas.translate(rectF.left, rectF.top);
        if (this.D != null) {
            for (int length = this.D.length - 1; length >= 0; length--) {
                com.meituan.msc.mmpviews.shell.background.a aVar = this.D[length];
                if (aVar != null) {
                    aVar.setBounds(rect);
                    aVar.a(rectF);
                    aVar.draw(canvas);
                }
            }
        }
        if (this.k != null) {
            for (int length2 = this.k.length - 1; length2 >= 0; length2--) {
                Drawable drawable = this.k[length2];
                if (drawable != null) {
                    drawable.setBounds(rect);
                    drawable.draw(canvas);
                }
            }
        }
        canvas.restoreToCount(save);
    }

    private void a(Canvas canvas, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        Object[] objArr = {canvas, Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(f6), Float.valueOf(f7), Float.valueOf(f8)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b42d4e0bf99253b3ef35d0284306c4ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b42d4e0bf99253b3ef35d0284306c4ad");
        } else if (i == 0) {
        } else {
            if (this.q == null) {
                this.q = new Path();
            }
            this.A.setColor(i);
            this.q.reset();
            this.q.moveTo(f, f2);
            this.q.lineTo(f3, f4);
            this.q.lineTo(f5, f6);
            this.q.lineTo(f7, f8);
            this.q.lineTo(f, f2);
            canvas.drawPath(this.q, this.A);
        }
    }

    private void a(Canvas canvas, b bVar, boolean z, float f, int i, float f2, float f3, float f4, float f5) {
        Object[] objArr = {canvas, bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Float.valueOf(f), Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "feb3fe248e35d5cbe43f508a1264137e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "feb3fe248e35d5cbe43f508a1264137e");
            return;
        }
        this.A.setStyle(Paint.Style.STROKE);
        this.A.setColor(i);
        float f6 = z ? f5 - f3 : f4 - f2;
        if (bVar == b.DOTTED) {
            int ceil = ((int) Math.ceil((f6 / f) / 2.0f)) + 1;
            Path path = new Path();
            float f7 = f / 2.0f;
            path.addCircle(f7, f7, f7, Path.Direction.CW);
            this.A.setPathEffect(new PathDashPathEffect(path, ((f6 - (ceil * f)) / (ceil - 1)) + f, 0.0f, PathDashPathEffect.Style.TRANSLATE));
        } else if (bVar == b.DASHED) {
            float ceil2 = f6 / ((((int) Math.ceil((f6 / f) / 3.0f)) * 3) + 2);
            Path path2 = new Path();
            if (z) {
                path2.lineTo(f, 0.0f);
                path2.rLineTo(0.0f, 2.0f * ceil2);
                path2.rLineTo(-f, 0.0f);
            } else {
                path2.lineTo(ceil2 * 2.0f, 0.0f);
                path2.rLineTo(0.0f, f);
                path2.rLineTo((-ceil2) * 2.0f, 0.0f);
            }
            this.A.setPathEffect(new PathDashPathEffect(path2, ceil2 * 3.0f, 0.0f, PathDashPathEffect.Style.TRANSLATE));
        }
        Path path3 = new Path();
        path3.moveTo(f2, f3);
        path3.lineTo(f4, f5);
        canvas.drawPath(path3, this.A);
    }

    private int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0334b9201b83e9ac8b24ee29034f865", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0334b9201b83e9ac8b24ee29034f865")).intValue();
        }
        return a(this.d != null ? this.d.a(i) : 255.0f, this.c != null ? this.c.a(i) : 0.0f);
    }

    public final RectF c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc44d92b563d642fb4c717f08442d099", RobustBitConfig.DEFAULT_VALUE)) {
            return (RectF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc44d92b563d642fb4c717f08442d099");
        }
        float a2 = a(0.0f, 8);
        return new RectF(a(a2, 0), a(a2, 1), a(a2, 2), a(a2, 3));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NonNull Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90ae24bebe9ee02c9ac8b097307a61bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90ae24bebe9ee02c9ac8b097307a61bf");
            return;
        }
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        Object[] objArr = {drawable, runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5f486f2c3811388a0628a147c596c74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5f486f2c3811388a0628a147c596c74");
            return;
        }
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Object[] objArr = {drawable, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3a9c615f2b03dc187e5007d10c8b74d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3a9c615f2b03dc187e5007d10c8b74d");
            return;
        }
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        com.meituan.msc.mmpviews.shell.background.a[] aVarArr;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c64aa7fb3582985eb8839502c8b82fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c64aa7fb3582985eb8839502c8b82fd");
        } else if (this.D != null) {
            for (com.meituan.msc.mmpviews.shell.background.a aVar : this.D) {
                if (aVar instanceof Animatable) {
                    aVar.start();
                }
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        com.meituan.msc.mmpviews.shell.background.a[] aVarArr;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c660af79493f8d07101133a8d3abda2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c660af79493f8d07101133a8d3abda2");
        } else if (this.D != null) {
            for (com.meituan.msc.mmpviews.shell.background.a aVar : this.D) {
                if (aVar instanceof Animatable) {
                    aVar.stop();
                }
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        com.meituan.msc.mmpviews.shell.background.a[] aVarArr;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c63053b636c922af03ab50a6f726397e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c63053b636c922af03ab50a6f726397e")).booleanValue();
        }
        if (this.D != null) {
            for (com.meituan.msc.mmpviews.shell.background.a aVar : this.D) {
                if ((aVar instanceof Animatable) && aVar.isRunning()) {
                    return true;
                }
            }
        }
        return false;
    }
}
