package com.dianping.imagemanager.image.drawable;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d extends a {
    public static ChangeQuickRedirect c;
    public static Interpolator j = new DecelerateInterpolator();
    public static Interpolator k = new AccelerateInterpolator();
    public int d;
    public int e;
    public long f;
    public int[] g;
    public int[] h;
    public int i;
    public boolean[] l;
    public int m;
    private final Drawable[] n;

    public d(Drawable[] drawableArr) {
        super(drawableArr);
        Object[] objArr = {drawableArr};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35aefe9781b7103b8dccbe604564ce5f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35aefe9781b7103b8dccbe604564ce5f");
            return;
        }
        this.n = drawableArr;
        this.g = new int[4];
        this.h = new int[4];
        this.i = 255;
        this.l = new boolean[4];
        this.m = 0;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b7a8263a2dd0c0727afce6c311fbfa0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b7a8263a2dd0c0727afce6c311fbfa0c");
            return;
        }
        this.d = 2;
        Arrays.fill(this.g, 0);
        this.g[0] = 255;
        Arrays.fill(this.h, 0);
        this.h[0] = 255;
        Arrays.fill(this.l, false);
        this.l[0] = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "564c72589a3f90f24b5bb4961cc04fba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "564c72589a3f90f24b5bb4961cc04fba");
        } else if (this.m == 0) {
            super.invalidateSelf();
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af4282166bc26c482f6f5a1961829a53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af4282166bc26c482f6f5a1961829a53");
        } else {
            this.m++;
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69dd70cc22df7ea781b0aede9e59b8e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69dd70cc22df7ea781b0aede9e59b8e7");
            return;
        }
        this.m--;
        invalidateSelf();
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2db483e38d6832f95b1f83b696ba6630", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2db483e38d6832f95b1f83b696ba6630");
            return;
        }
        this.d = 2;
        for (int i = 0; i < this.n.length; i++) {
            this.h[i] = this.l[i] ? 255 : 0;
        }
        invalidateSelf();
    }

    private boolean a(float f) {
        int i;
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "975306935d8ba5c734bcff91db524a86", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "975306935d8ba5c734bcff91db524a86")).booleanValue();
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        boolean z = true;
        while (i < this.n.length) {
            if (this.l[i]) {
                this.h[i] = (int) (this.g[i] + (j.getInterpolation(f) * 255.0f));
                if (this.h[i] < 0) {
                    this.h[i] = 0;
                }
                if (this.h[i] > 255) {
                    this.h[i] = 255;
                }
                i = this.h[i] == 255 ? i + 1 : 0;
                z = false;
            } else {
                this.h[i] = (int) (this.g[i] - (k.getInterpolation(f) * 255.0f));
                if (this.h[i] < 0) {
                    this.h[i] = 0;
                }
                if (this.h[i] > 255) {
                    this.h[i] = 255;
                }
                if (this.h[i] == 0) {
                }
                z = false;
            }
        }
        return z;
    }

    @Override // com.dianping.imagemanager.image.drawable.a, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean a;
        boolean z;
        char c2 = 1;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a956061011d6951ef68b19c409f3805", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a956061011d6951ef68b19c409f3805");
            return;
        }
        char c3 = 2;
        switch (this.d) {
            case 0:
                System.arraycopy(this.h, 0, this.g, 0, this.n.length);
                this.f = d();
                a = a(this.e == 0 ? 1.0f : 0.0f);
                this.d = a ? 2 : 1;
                z = a;
                break;
            case 1:
                a = a(((float) (d() - this.f)) / this.e);
                this.d = a ? 2 : 1;
                z = a;
                break;
            case 2:
            default:
                z = true;
                break;
        }
        int i = 0;
        while (i < this.n.length) {
            Drawable drawable = this.n[i];
            int i2 = (this.h[i] * this.i) / 255;
            Object[] objArr2 = new Object[3];
            objArr2[0] = canvas;
            objArr2[c2] = drawable;
            objArr2[c3] = Integer.valueOf(i2);
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "601b884b7c971443b709831e50cd9aac", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "601b884b7c971443b709831e50cd9aac");
            } else if (drawable != null && i2 > 0) {
                this.m++;
                drawable.mutate().setAlpha(i2);
                this.m--;
                drawable.draw(canvas);
                i++;
                c2 = 1;
                c3 = 2;
            }
            i++;
            c2 = 1;
            c3 = 2;
        }
        if (z) {
            return;
        }
        invalidateSelf();
    }

    @Override // com.dianping.imagemanager.image.drawable.a, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f64e729b627771336febe2decb2eceb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f64e729b627771336febe2decb2eceb3");
        } else if (this.i != i) {
            this.i = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.i;
    }

    private long d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9209d58d4d9d5001fa89fa603625cea9", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9209d58d4d9d5001fa89fa603625cea9")).longValue() : SystemClock.uptimeMillis();
    }

    @Override // com.dianping.imagemanager.image.drawable.a, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6252d995e648960e24e56bc8abdb10a8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6252d995e648960e24e56bc8abdb10a8")).intValue();
        }
        int i = -1;
        for (int i2 = 0; i2 < this.n.length; i2++) {
            if (this.l[i2] && (drawable = this.n[i2]) != null) {
                i = Math.max(i, drawable.getIntrinsicWidth());
            }
        }
        if (i > 0) {
            return i;
        }
        return -1;
    }

    @Override // com.dianping.imagemanager.image.drawable.a, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e245c581d0e9a185641f04c2be325868", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e245c581d0e9a185641f04c2be325868")).intValue();
        }
        int i = -1;
        for (int i2 = 0; i2 < this.n.length; i2++) {
            if (this.l[i2] && (drawable = this.n[i2]) != null) {
                i = Math.max(i, drawable.getIntrinsicHeight());
            }
        }
        if (i > 0) {
            return i;
        }
        return -1;
    }
}
