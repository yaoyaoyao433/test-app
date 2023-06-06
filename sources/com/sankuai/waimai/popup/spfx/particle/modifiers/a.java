package com.sankuai.waimai.popup.spfx.particle.modifiers;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements b {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;
    private long d;
    private long e;
    private float f;
    private float g;
    private Interpolator h;

    private a(int i, int i2, long j, long j2, Interpolator interpolator) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), new Long(j), new Long(j2), interpolator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b001bac9be474d382703068ac02d767", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b001bac9be474d382703068ac02d767");
            return;
        }
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.f = (float) (this.e - this.d);
        this.g = this.c - this.b;
        this.h = interpolator;
    }

    public a(int i, int i2, long j, long j2) {
        this(120, 0, 0L, 6000L, new LinearInterpolator());
        Object[] objArr = {120, 0, 0L, 6000L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efd8bedecf50fe2d15c5cfbfaaf580ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efd8bedecf50fe2d15c5cfbfaaf580ca");
        }
    }

    @Override // com.sankuai.waimai.popup.spfx.particle.modifiers.b
    public final void a(com.sankuai.waimai.popup.spfx.particle.a aVar, long j) {
        Object[] objArr = {aVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebc72507a9c0f3976852736e8a09ae33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebc72507a9c0f3976852736e8a09ae33");
        } else if (j < this.d) {
            aVar.h = this.b;
        } else if (j > this.e) {
            aVar.h = this.c;
        } else {
            aVar.h = (int) (this.b + (this.g * this.h.getInterpolation((((float) (j - this.d)) * 1.0f) / this.f)));
        }
    }
}
