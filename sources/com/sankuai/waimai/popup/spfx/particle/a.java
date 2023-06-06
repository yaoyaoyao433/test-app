package com.sankuai.waimai.popup.spfx.particle;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    protected Bitmap b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public int h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    protected long o;
    private Matrix p;
    private Paint q;
    private float r;
    private float s;
    private float t;
    private long u;
    private int v;
    private int w;
    private List<com.sankuai.waimai.popup.spfx.particle.modifiers.b> x;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4039f54517d0b37909e0c68fa3e2813d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4039f54517d0b37909e0c68fa3e2813d");
            return;
        }
        this.e = 1.0f;
        this.f = 0.1f;
        this.g = 1.0f;
        this.h = 255;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 0.0f;
        this.p = new Matrix();
        this.q = new Paint();
    }

    public a(Bitmap bitmap) {
        this();
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c02a6a524d7e7ff1e9bdf8a4e96fab3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c02a6a524d7e7ff1e9bdf8a4e96fab3");
        } else {
            this.b = bitmap;
        }
    }

    public final void a(long j, float f, float f2) {
        Object[] objArr = {new Long(j), Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6595286e9d1a42c9badac2c8ee48d3d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6595286e9d1a42c9badac2c8ee48d3d0");
            return;
        }
        this.v = this.b.getWidth() / 2;
        this.w = this.b.getHeight() / 2;
        this.r = f - this.v;
        this.s = f2 - this.w;
        this.c = this.r;
        this.d = this.s;
        this.u = j;
    }

    public final boolean a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "690c7e169556b7985d97fcd1c137227e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "690c7e169556b7985d97fcd1c137227e")).booleanValue();
        }
        long j2 = j - this.o;
        if (j2 > this.u) {
            return false;
        }
        float f = (float) j2;
        this.c = this.r + (this.k * f) + (this.m * f * f);
        this.d = this.s + (this.l * f) + (this.n * f * f);
        this.t = this.i + ((this.j * f) / 1000.0f);
        for (int i = 0; i < this.x.size(); i++) {
            this.x.get(i).a(this, j2);
        }
        return true;
    }

    public final void a(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6db7e928d5e85f0485ca6d6e89699e5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6db7e928d5e85f0485ca6d6e89699e5c");
            return;
        }
        this.p.reset();
        this.p.postRotate(this.t, this.v, this.w);
        this.p.postScale(this.e, this.e, this.v, this.w);
        this.p.postTranslate(this.c, this.d);
        this.q.setAlpha(this.h);
        canvas.drawBitmap(this.b, this.p, this.q);
    }

    public final a a(long j, List<com.sankuai.waimai.popup.spfx.particle.modifiers.b> list) {
        Object[] objArr = {new Long(j), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c971b4bba258be08b1c2c8c31c0fda8", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c971b4bba258be08b1c2c8c31c0fda8");
        }
        this.o = j;
        this.x = list;
        return this;
    }
}
