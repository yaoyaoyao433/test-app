package com.sankuai.meituan.mapsdk.core.widgets;

import android.graphics.Bitmap;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    int b;
    int c;
    public int d;
    public String e;
    public String f;
    public Bitmap g;
    public float[] h;
    public float[] i;
    public float[] j;
    public float[] k;
    FrameLayout.LayoutParams l;
    public final b m;
    private float n;
    private float o;

    public c(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "beaafa47d791ae4023502b9eb23fa684", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "beaafa47d791ae4023502b9eb23fa684");
            return;
        }
        this.n = 1.0f;
        this.o = 1.0f;
        float[] fArr = d.b;
        this.h = Arrays.copyOf(fArr, fArr.length);
        float[] fArr2 = d.d;
        this.i = Arrays.copyOf(fArr2, fArr2.length);
        float[] fArr3 = d.e;
        this.j = Arrays.copyOf(fArr3, fArr3.length);
        float[] fArr4 = d.c;
        this.k = Arrays.copyOf(fArr4, fArr4.length);
        this.m = bVar;
        this.l = new FrameLayout.LayoutParams(this.b, this.c);
        this.l.gravity = 8388691;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc87d30443143a5859388848b1f9122d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc87d30443143a5859388848b1f9122d");
            return;
        }
        this.b = this.g == null ? 0 : (int) ((this.g.getWidth() * this.n) + 0.5f);
        this.c = this.g == null ? 0 : (int) ((this.g.getHeight() * this.o) + 0.5f);
        this.k[0] = com.sankuai.meituan.mapsdk.core.utils.d.a(this.b);
        this.k[1] = com.sankuai.meituan.mapsdk.core.utils.d.a(this.c);
    }

    public final void a(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(1.0f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3a5bdb6a6d5e20aad8cf25585c9c8ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3a5bdb6a6d5e20aad8cf25585c9c8ae");
            return;
        }
        if (f >= 0.0f) {
            this.n = f;
        }
        this.o = 1.0f;
    }
}
