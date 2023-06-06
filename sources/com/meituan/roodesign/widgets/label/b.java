package com.meituan.roodesign.widgets.label;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.ColorInt;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    final RooLabel b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    @ColorInt
    int i;
    @ColorInt
    int j;
    GradientDrawable k;
    boolean l;
    private GradientDrawable m;

    public b(RooLabel rooLabel) {
        Object[] objArr = {rooLabel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9463e474ce39f33a621b52fcbea9a8f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9463e474ce39f33a621b52fcbea9a8f7");
            return;
        }
        this.l = false;
        this.b = rooLabel;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Drawable a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f0d21d3a58554ec1f1f2adcda1f1ccc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f0d21d3a58554ec1f1f2adcda1f1ccc");
        }
        float[] fArr = {this.d, this.d, this.e, this.e, this.g, this.g, this.f, this.f};
        this.k = new GradientDrawable();
        this.k.setCornerRadii(fArr);
        this.k.setColor(this.j);
        this.m = new GradientDrawable();
        this.m.setCornerRadii(fArr);
        this.m.setColor(0);
        this.m.setStroke(this.h, this.i);
        return new a(new Drawable[]{this.k, this.m});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccb1a770028c8f0b6fe48ac25884f176", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccb1a770028c8f0b6fe48ac25884f176");
        } else if (this.m != null) {
            this.b.setInternalBackground(a());
        }
    }

    public final void a(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b684bb5761a77098105bb48213ea50fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b684bb5761a77098105bb48213ea50fe");
        } else if (this.d == i && this.e == i2 && this.f == i3 && this.g == i4) {
        } else {
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = i4;
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "038314f88fce62b3cd2f23740ae6ce69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "038314f88fce62b3cd2f23740ae6ce69");
        } else if (this.k == null || this.m == null) {
        } else {
            this.b.setInternalBackground(a());
        }
    }
}
