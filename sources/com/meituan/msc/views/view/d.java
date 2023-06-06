package com.meituan.msc.views.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.uimanager.ah;
import com.meituan.msc.uimanager.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends Drawable {
    public static ChangeQuickRedirect a;
    private int A;
    int b;
    @Nullable
    private ah c;
    @Nullable
    private ah d;
    @Nullable
    private ah e;
    @Nullable
    private b f;
    @Nullable
    private PathEffect g;
    @Nullable
    private Path h;
    @Nullable
    private Path i;
    @Nullable
    private Path j;
    @Nullable
    private Path k;
    @Nullable
    private Path l;
    @Nullable
    private RectF m;
    @Nullable
    private RectF n;
    @Nullable
    private RectF o;
    @Nullable
    private RectF p;
    @Nullable
    private PointF q;
    @Nullable
    private PointF r;
    @Nullable
    private PointF s;
    @Nullable
    private PointF t;
    private boolean u;
    private float v;
    private final Paint w;
    private int x;
    @Nullable
    private float[] y;
    private final Context z;

    private static int a(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2127c910488ba06557b8ec9ffe181d33", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2127c910488ba06557b8ec9ffe181d33")).intValue() : ((((int) f) << 24) & (-16777216)) | (((int) f2) & ViewCompat.MEASURED_SIZE_MASK);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    enum b {
        SOLID,
        DASHED,
        DOTTED;
        
        public static ChangeQuickRedirect a;

        b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d138928d66a868d293bd1b92afeff25", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d138928d66a868d293bd1b92afeff25");
            }
        }

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d636204c7832f6dd90c456c31295c0f", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d636204c7832f6dd90c456c31295c0f") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f3c416558e260a6c607d59a15768328", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f3c416558e260a6c607d59a15768328") : (b[]) values().clone();
        }

        @Nullable
        public static PathEffect a(b bVar, float f) {
            Object[] objArr = {bVar, Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "06c4b70db8abc800c1f660446451a86a", RobustBitConfig.DEFAULT_VALUE)) {
                return (PathEffect) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "06c4b70db8abc800c1f660446451a86a");
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
        BOTTOM_LEFT,
        TOP_START,
        TOP_END,
        BOTTOM_START,
        BOTTOM_END;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "824cb6a5cd6c7aff359735264c96048c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "824cb6a5cd6c7aff359735264c96048c");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "23d6b3f5310b53662e0596b476bba2ee", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "23d6b3f5310b53662e0596b476bba2ee") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "820d0f0c8db7b799f61ef5a176feb690", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "820d0f0c8db7b799f61ef5a176feb690") : (a[]) values().clone();
        }
    }

    public d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1b540d8b59701df246317c3db8ce7b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1b540d8b59701df246317c3db8ce7b2");
            return;
        }
        this.u = false;
        this.v = Float.NaN;
        this.w = new Paint(1);
        this.b = 0;
        this.x = 255;
        this.z = context;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        float f;
        float f2;
        float f3;
        float f4;
        int i3;
        char c;
        char c2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "605878e93da3029f4bf981a69ccd770a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "605878e93da3029f4bf981a69ccd770a");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "53bc1b9566bfeace6b4a8147f620c586", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "53bc1b9566bfeace6b4a8147f620c586");
        } else {
            this.g = this.f != null ? b.a(this.f, e()) : null;
            this.w.setPathEffect(this.g);
        }
        if (a()) {
            Object[] objArr3 = {canvas};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b1b39b3364a8d9e6a5445500aaa7a1b9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b1b39b3364a8d9e6a5445500aaa7a1b9");
                return;
            }
            d();
            canvas.save();
            int a2 = com.meituan.msc.views.view.a.a(this.b, this.x);
            if (Color.alpha(a2) != 0) {
                this.w.setColor(a2);
                this.w.setStyle(Paint.Style.FILL);
                canvas.drawPath(this.h, this.w);
            }
            RectF c3 = c();
            int d = d(0);
            int d2 = d(1);
            int d3 = d(2);
            int d4 = d(3);
            if (c3.top > 0.0f || c3.bottom > 0.0f || c3.left > 0.0f || c3.right > 0.0f) {
                float e = e();
                int d5 = d(8);
                if (c3.top != e || c3.bottom != e || c3.left != e || c3.right != e || d != d5 || d2 != d5 || d3 != d5 || d4 != d5) {
                    this.w.setStyle(Paint.Style.FILL);
                    canvas.clipPath(this.i, Region.Op.INTERSECT);
                    canvas.clipPath(this.h, Region.Op.DIFFERENCE);
                    if (Build.VERSION.SDK_INT >= 17) {
                        boolean z = true;
                        if (this.A == 1) {
                            i3 = 4;
                        } else {
                            i3 = 4;
                            z = false;
                        }
                        int d6 = d(i3);
                        int d7 = d(5);
                        com.meituan.msc.jse.modules.i18nmanager.a.a();
                        if (c(i3)) {
                            d = d6;
                        }
                        if (c(5)) {
                            d3 = d7;
                        }
                        i = z ? d3 : d;
                        if (!z) {
                            d = d3;
                        }
                        i2 = d;
                    } else {
                        i = d;
                        i2 = d3;
                    }
                    float f5 = this.n.left;
                    float f6 = this.n.right;
                    float f7 = this.n.top;
                    float f8 = this.n.bottom;
                    if (c3.left > 0.0f) {
                        f = f8;
                        f2 = f7;
                        f3 = f6;
                        f4 = f5;
                        a(canvas, i, f5, f7, this.q.x, this.q.y, this.t.x, this.t.y, f5, f);
                    } else {
                        f = f8;
                        f2 = f7;
                        f3 = f6;
                        f4 = f5;
                    }
                    if (c3.top > 0.0f) {
                        a(canvas, d2, f4, f2, this.q.x, this.q.y, this.r.x, this.r.y, f3, f2);
                    }
                    if (c3.right > 0.0f) {
                        a(canvas, i2, f3, f2, this.r.x, this.r.y, this.s.x, this.s.y, f3, f);
                    }
                    if (c3.bottom > 0.0f) {
                        a(canvas, d4, f4, f, this.t.x, this.t.y, this.s.x, this.s.y, f3, f);
                    }
                } else if (e > 0.0f) {
                    this.w.setColor(com.meituan.msc.views.view.a.a(d5, this.x));
                    this.w.setStyle(Paint.Style.STROKE);
                    this.w.setStrokeWidth(e);
                    canvas.drawPath(this.l, this.w);
                }
            }
            canvas.restore();
            return;
        }
        Object[] objArr4 = {canvas};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b2d3a0823250d351e923c6f86f1a789f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b2d3a0823250d351e923c6f86f1a789f");
            return;
        }
        this.w.setStyle(Paint.Style.FILL);
        int a3 = com.meituan.msc.views.view.a.a(this.b, this.x);
        if (Color.alpha(a3) != 0) {
            this.w.setColor(a3);
            canvas.drawRect(getBounds(), this.w);
        }
        RectF c4 = c();
        int round = Math.round(c4.left);
        int round2 = Math.round(c4.top);
        int round3 = Math.round(c4.right);
        int round4 = Math.round(c4.bottom);
        if (round > 0 || round3 > 0 || round2 > 0 || round4 > 0) {
            Rect bounds = getBounds();
            int d8 = d(0);
            int d9 = d(1);
            int d10 = d(2);
            int d11 = d(3);
            if (Build.VERSION.SDK_INT >= 17) {
                boolean z2 = this.A == 1;
                c2 = 4;
                int d12 = d(4);
                c = 5;
                int d13 = d(5);
                com.meituan.msc.jse.modules.i18nmanager.a.a();
                if (c(4)) {
                    d8 = d12;
                }
                if (c(5)) {
                    d10 = d13;
                }
                int i13 = z2 ? d10 : d8;
                if (!z2) {
                    d8 = d10;
                }
                i4 = d8;
                i5 = i13;
            } else {
                c = 5;
                c2 = 4;
                i4 = d10;
                i5 = d8;
            }
            int i14 = bounds.left;
            int i15 = bounds.top;
            Object[] objArr5 = new Object[8];
            objArr5[0] = Integer.valueOf(round);
            objArr5[1] = Integer.valueOf(round2);
            objArr5[2] = Integer.valueOf(round3);
            objArr5[3] = Integer.valueOf(round4);
            objArr5[c2] = Integer.valueOf(i5);
            objArr5[c] = Integer.valueOf(d9);
            objArr5[6] = Integer.valueOf(i4);
            objArr5[7] = Integer.valueOf(d11);
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "c9794ac42f1206a7b7425404bfe3ccda", RobustBitConfig.DEFAULT_VALUE)) {
                i6 = ((Integer) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "c9794ac42f1206a7b7425404bfe3ccda")).intValue();
            } else {
                i6 = (round4 > 0 ? d11 : -1) & (round > 0 ? i5 : -1) & (round2 > 0 ? d9 : -1) & (round3 > 0 ? i4 : -1);
                if (i6 != ((round > 0 ? i5 : 0) | (round2 > 0 ? d9 : 0) | (round3 > 0 ? i4 : 0) | (round4 > 0 ? d11 : 0))) {
                    i6 = 0;
                }
            }
            if (i6 != 0) {
                if (Color.alpha(i6) != 0) {
                    int i16 = bounds.right;
                    int i17 = bounds.bottom;
                    this.w.setColor(i6);
                    if (round > 0) {
                        canvas.drawRect(i14, i15, i14 + round, i17 - round4, this.w);
                    }
                    if (round2 > 0) {
                        canvas.drawRect(round + i14, i15, i16, i15 + round2, this.w);
                    }
                    if (round3 > 0) {
                        canvas.drawRect(i16 - round3, i15 + round2, i16, i17, this.w);
                    }
                    if (round4 > 0) {
                        canvas.drawRect(i14, i17 - round4, i16 - round3, i17, this.w);
                        return;
                    }
                    return;
                }
                return;
            }
            this.w.setAntiAlias(false);
            int width = bounds.width();
            int height = bounds.height();
            if (round > 0) {
                float f9 = i14;
                float f10 = i14 + round;
                i7 = i15;
                i8 = i14;
                a(canvas, i5, f9, i15, f10, i15 + round2, f10, i12 - round4, f9, i15 + height);
            } else {
                i7 = i15;
                i8 = i14;
            }
            if (round2 > 0) {
                float f11 = i7;
                float f12 = i7 + round2;
                a(canvas, d9, i8, f11, i8 + round, f12, i11 - round3, f12, i8 + width, f11);
            }
            if (round3 > 0) {
                int i18 = i8 + width;
                float f13 = i18;
                float f14 = i18 - round3;
                a(canvas, i4, f13, i7, f13, i7 + height, f14, i10 - round4, f14, i7 + round2);
            }
            if (round4 > 0) {
                int i19 = i7 + height;
                float f15 = i19;
                float f16 = i19 - round4;
                a(canvas, d11, i8, f15, i8 + width, f15, i9 - round3, f16, i8 + round, f16);
            }
            this.w.setAntiAlias(true);
        }
    }

    public final boolean a() {
        float[] fArr;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "801d49490f491febc5abc51cb3bdec2e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "801d49490f491febc5abc51cb3bdec2e")).booleanValue();
        }
        if (com.meituan.android.msc.yoga.f.a(this.v) || this.v <= 0.0f) {
            if (this.y != null) {
                for (float f : this.y) {
                    if (!com.meituan.android.msc.yoga.f.a(f) && f > 0.0f) {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1437afc8c33221564a607c0fbf1e986f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1437afc8c33221564a607c0fbf1e986f");
            return;
        }
        super.onBoundsChange(rect);
        this.u = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc138fdcbebf7388ec47c5f44c5c65f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc138fdcbebf7388ec47c5f44c5c65f0");
        } else if (i != this.x) {
            this.x = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.x;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f3a4b7495f717a415b1286d659e0fc0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f3a4b7495f717a415b1286d659e0fc0")).intValue();
        }
        int a2 = com.meituan.msc.views.view.a.a(this.b, this.x);
        Object[] objArr2 = {Integer.valueOf(a2)};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.views.view.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3097af37b9ad7e100a0246135a48f745", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3097af37b9ad7e100a0246135a48f745")).intValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f28713c20d465bffdffe82e6aa223ceb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f28713c20d465bffdffe82e6aa223ceb");
        } else if (Build.VERSION.SDK_INT < 21) {
            super.getOutline(outline);
        } else if ((!com.meituan.android.msc.yoga.f.a(this.v) && this.v > 0.0f) || this.y != null) {
            d();
            try {
                outline.setConvexPath(this.j);
            } catch (IllegalArgumentException e) {
                if (!"path must be convex".equals(e.getMessage())) {
                    throw e;
                }
                g.b("ReactViewBackgroundDrawable", null, e);
            }
        } else {
            outline.setRect(getBounds());
        }
    }

    public final void a(int i, float f) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19c8c633704083accbf1d18d630bd759", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19c8c633704083accbf1d18d630bd759");
            return;
        }
        if (this.c == null) {
            this.c = new ah();
        }
        if (q.a(this.c.b[i], f)) {
            return;
        }
        this.c.a(i, f);
        if (i != 8) {
            switch (i) {
            }
            invalidateSelf();
        }
        this.u = true;
        invalidateSelf();
    }

    public final void a(int i, float f, float f2) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5205405b06241323ba6ec783cf34b6ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5205405b06241323ba6ec783cf34b6ae");
            return;
        }
        b(i, f);
        c(i, f2);
    }

    private void b(int i, float f) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d45c198fbffff69273566ae1e293c06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d45c198fbffff69273566ae1e293c06");
            return;
        }
        if (this.d == null) {
            this.d = new ah(0.0f);
        }
        if (q.a(this.d.b[i], f)) {
            return;
        }
        this.d.a(i, f);
        invalidateSelf();
    }

    private void c(int i, float f) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd12d87b0fcd74522949ce654a5ed6ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd12d87b0fcd74522949ce654a5ed6ab");
            return;
        }
        if (this.e == null) {
            this.e = new ah(255.0f);
        }
        if (q.a(this.e.b[i], f)) {
            return;
        }
        this.e.a(i, f);
        invalidateSelf();
    }

    public final void a(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24e24364dcf755291c1f79233aca3e55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24e24364dcf755291c1f79233aca3e55");
            return;
        }
        b valueOf = str == null ? null : b.valueOf(str.toUpperCase(Locale.US));
        if (this.f != valueOf) {
            this.f = valueOf;
            this.u = true;
            invalidateSelf();
        }
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d666877169921f2e4f550c6b9de21f58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d666877169921f2e4f550c6b9de21f58");
        } else if (q.a(this.v, f)) {
        } else {
            this.v = f;
            this.u = true;
            invalidateSelf();
        }
    }

    public final void a(float f, int i) {
        Object[] objArr = {Float.valueOf(f), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c542df65d4b597953f6226e64d57dc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c542df65d4b597953f6226e64d57dc6");
            return;
        }
        if (this.y == null) {
            this.y = new float[8];
            Arrays.fill(this.y, Float.NaN);
        }
        if (q.a(this.y[i], f)) {
            return;
        }
        this.y[i] = f;
        this.u = true;
        invalidateSelf();
    }

    public final float b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ebba6127b0a3f4c5e0ee2a99b09b5da", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ebba6127b0a3f4c5e0ee2a99b09b5da")).floatValue();
        }
        if (com.meituan.android.msc.yoga.f.a(this.v)) {
            return 0.0f;
        }
        return this.v;
    }

    public final float a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4af96f74c324811fbe7caee17ef140b", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4af96f74c324811fbe7caee17ef140b")).floatValue() : a(Float.NaN, aVar);
    }

    public final float a(float f, a aVar) {
        Object[] objArr = {Float.valueOf(f), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cbffc404705dd64ea4d8643f8d3b23f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cbffc404705dd64ea4d8643f8d3b23f")).floatValue();
        }
        if (this.y == null) {
            return f;
        }
        float f2 = this.y[aVar.ordinal()];
        return com.meituan.android.msc.yoga.f.a(f2) ? f : f2;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ddbbf0e1fb3e4d2b6eb509df504a395", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ddbbf0e1fb3e4d2b6eb509df504a395");
            return;
        }
        this.b = i;
        invalidateSelf();
    }

    public final boolean b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b76886a0c8e581ac664928215e2147a1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b76886a0c8e581ac664928215e2147a1")).booleanValue();
        }
        if (this.A != i) {
            this.A = i;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "676c52c0f3298b2574e4581274075146", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "676c52c0f3298b2574e4581274075146");
        } else if (this.u) {
            this.u = false;
            if (this.h == null) {
                this.h = new Path();
            }
            if (this.i == null) {
                this.i = new Path();
            }
            if (this.j == null) {
                this.j = new Path();
            }
            if (this.l == null) {
                this.l = new Path();
            }
            if (this.m == null) {
                this.m = new RectF();
            }
            if (this.n == null) {
                this.n = new RectF();
            }
            if (this.o == null) {
                this.o = new RectF();
            }
            if (this.p == null) {
                this.p = new RectF();
            }
            this.h.reset();
            this.i.reset();
            this.j.reset();
            this.l.reset();
            this.m.set(getBounds());
            this.n.set(getBounds());
            this.o.set(getBounds());
            this.p.set(getBounds());
            RectF c = c();
            this.m.top += c.top;
            this.m.bottom -= c.bottom;
            this.m.left += c.left;
            this.m.right -= c.right;
            this.p.top += c.top * 0.5f;
            this.p.bottom -= c.bottom * 0.5f;
            this.p.left += c.left * 0.5f;
            this.p.right -= c.right * 0.5f;
            float b2 = b();
            float a2 = a(b2, a.TOP_LEFT);
            float a3 = a(b2, a.TOP_RIGHT);
            float a4 = a(b2, a.BOTTOM_LEFT);
            float a5 = a(b2, a.BOTTOM_RIGHT);
            if (Build.VERSION.SDK_INT >= 17) {
                boolean z = this.A == 1;
                float a6 = a(a.TOP_START);
                float a7 = a(a.TOP_END);
                float a8 = a(a.BOTTOM_START);
                float a9 = a(a.BOTTOM_END);
                com.meituan.msc.jse.modules.i18nmanager.a.a();
                if (!com.meituan.android.msc.yoga.f.a(a6)) {
                    a2 = a6;
                }
                if (!com.meituan.android.msc.yoga.f.a(a7)) {
                    a3 = a7;
                }
                if (!com.meituan.android.msc.yoga.f.a(a8)) {
                    a4 = a8;
                }
                if (!com.meituan.android.msc.yoga.f.a(a9)) {
                    a5 = a9;
                }
                float f2 = z ? a3 : a2;
                if (z) {
                    a3 = a2;
                }
                float f3 = z ? a5 : a4;
                if (z) {
                    a5 = a4;
                }
                a4 = f3;
                a2 = f2;
            }
            float f4 = a4;
            this.h.addRoundRect(this.m, new float[]{Math.max(a2 - c.left, 0.0f), Math.max(a2 - c.top, 0.0f), Math.max(a3 - c.right, 0.0f), Math.max(a3 - c.top, 0.0f), Math.max(a5 - c.right, 0.0f), Math.max(a5 - c.bottom, 0.0f), Math.max(a4 - c.left, 0.0f), Math.max(a4 - c.bottom, 0.0f)}, Path.Direction.CW);
            this.i.addRoundRect(this.n, new float[]{a2, a2, a3, a3, a5, a5, f4, f4}, Path.Direction.CW);
            if (this.c != null) {
                i = 8;
                f = this.c.a(8) / 2.0f;
            } else {
                i = 8;
                f = 0.0f;
            }
            Path path = this.j;
            RectF rectF = this.o;
            float[] fArr = new float[i];
            float f5 = a2 + f;
            fArr[0] = f5;
            fArr[1] = f5;
            float f6 = a3 + f;
            fArr[2] = f6;
            fArr[3] = f6;
            float f7 = a5 + f;
            fArr[4] = f7;
            fArr[5] = f7;
            float f8 = f4 + f;
            fArr[6] = f8;
            fArr[7] = f8;
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            Path path2 = this.l;
            RectF rectF2 = this.p;
            float[] fArr2 = new float[8];
            fArr2[0] = Math.max(a2 - (c.left * 0.5f), c.left > 0.0f ? a2 / c.left : 0.0f);
            fArr2[1] = Math.max(a2 - (c.top * 0.5f), c.top > 0.0f ? a2 / c.top : 0.0f);
            fArr2[2] = Math.max(a3 - (c.right * 0.5f), c.right > 0.0f ? a3 / c.right : 0.0f);
            fArr2[3] = Math.max(a3 - (c.top * 0.5f), c.top > 0.0f ? a3 / c.top : 0.0f);
            fArr2[4] = Math.max(a5 - (c.right * 0.5f), c.right > 0.0f ? a5 / c.right : 0.0f);
            fArr2[5] = Math.max(a5 - (c.bottom * 0.5f), c.bottom > 0.0f ? a5 / c.bottom : 0.0f);
            fArr2[6] = Math.max(f4 - (c.left * 0.5f), c.left > 0.0f ? f4 / c.left : 0.0f);
            fArr2[7] = Math.max(f4 - (c.bottom * 0.5f), c.bottom > 0.0f ? f4 / c.bottom : 0.0f);
            path2.addRoundRect(rectF2, fArr2, Path.Direction.CW);
            if (this.q == null) {
                this.q = new PointF();
            }
            this.q.x = this.m.left;
            this.q.y = this.m.top;
            a(this.m.left, this.m.top, this.m.left + (max * 2.0f), this.m.top + (max2 * 2.0f), this.n.left, this.n.top, this.m.left, this.m.top, this.q);
            if (this.t == null) {
                this.t = new PointF();
            }
            this.t.x = this.m.left;
            this.t.y = this.m.bottom;
            a(this.m.left, this.m.bottom - (max8 * 2.0f), this.m.left + (max7 * 2.0f), this.m.bottom, this.n.left, this.n.bottom, this.m.left, this.m.bottom, this.t);
            if (this.r == null) {
                this.r = new PointF();
            }
            this.r.x = this.m.right;
            this.r.y = this.m.top;
            a(this.m.right - (max3 * 2.0f), this.m.top, this.m.right, this.m.top + (max4 * 2.0f), this.n.right, this.n.top, this.m.right, this.m.top, this.r);
            if (this.s == null) {
                this.s = new PointF();
            }
            this.s.x = this.m.right;
            this.s.y = this.m.bottom;
            a(this.m.right - (max5 * 2.0f), this.m.bottom - (max6 * 2.0f), this.m.right, this.m.bottom, this.n.right, this.n.bottom, this.m.right, this.m.bottom, this.s);
        }
    }

    private static void a(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, PointF pointF) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5), Double.valueOf(d6), Double.valueOf(d7), Double.valueOf(d8), pointF};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b2e3bb1c03883aba977564a3db5731b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b2e3bb1c03883aba977564a3db5731b");
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

    private float b(float f, int i) {
        Object[] objArr = {Float.valueOf(f), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ee3a86e0b24dca0b72bab00f11be460", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ee3a86e0b24dca0b72bab00f11be460")).floatValue();
        }
        if (this.c == null) {
            return f;
        }
        float f2 = this.c.b[i];
        return com.meituan.android.msc.yoga.f.a(f2) ? f : f2;
    }

    private float e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29997f484f3a188d2959d09c059a7602", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29997f484f3a188d2959d09c059a7602")).floatValue();
        }
        if (this.c == null || com.meituan.android.msc.yoga.f.a(this.c.b[8])) {
            return 0.0f;
        }
        return this.c.b[8];
    }

    private void a(Canvas canvas, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        Object[] objArr = {canvas, Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(f6), Float.valueOf(f7), Float.valueOf(f8)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f621366eff1ac2c48d1f69b7644b5b71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f621366eff1ac2c48d1f69b7644b5b71");
        } else if (i == 0) {
        } else {
            if (this.k == null) {
                this.k = new Path();
            }
            this.w.setColor(i);
            this.k.reset();
            this.k.moveTo(f, f2);
            this.k.lineTo(f3, f4);
            this.k.lineTo(f5, f6);
            this.k.lineTo(f7, f8);
            this.k.lineTo(f, f2);
            canvas.drawPath(this.k, this.w);
        }
    }

    private boolean c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "248db68d4b9085aacb1dd90560845f1d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "248db68d4b9085aacb1dd90560845f1d")).booleanValue();
        }
        return (com.meituan.android.msc.yoga.f.a(this.d != null ? this.d.a(i) : Float.NaN) || com.meituan.android.msc.yoga.f.a(this.e != null ? this.e.a(i) : Float.NaN)) ? false : true;
    }

    private int d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31345d8813c99c68f215540a5d0c124f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31345d8813c99c68f215540a5d0c124f")).intValue();
        }
        return a(this.e != null ? this.e.a(i) : 255.0f, this.d != null ? this.d.a(i) : 0.0f);
    }

    public final RectF c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebf7874add49a24e1af41e0f545f9c6b", RobustBitConfig.DEFAULT_VALUE)) {
            return (RectF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebf7874add49a24e1af41e0f545f9c6b");
        }
        float b2 = b(0.0f, 8);
        float b3 = b(b2, 1);
        float b4 = b(b2, 3);
        float b5 = b(b2, 0);
        float b6 = b(b2, 2);
        if (Build.VERSION.SDK_INT >= 17 && this.c != null) {
            boolean z = this.A == 1;
            float f = this.c.b[4];
            float f2 = this.c.b[5];
            com.meituan.msc.jse.modules.i18nmanager.a.a();
            if (com.meituan.android.msc.yoga.f.a(f)) {
                f = b5;
            }
            if (!com.meituan.android.msc.yoga.f.a(f2)) {
                b6 = f2;
            }
            b5 = z ? b6 : f;
            if (z) {
                b6 = f;
            }
        }
        return new RectF(b5, b3, b6, b4);
    }
}
