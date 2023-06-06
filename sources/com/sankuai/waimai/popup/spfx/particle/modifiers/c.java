package com.sankuai.waimai.popup.spfx.particle.modifiers;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements b {
    public static ChangeQuickRedirect a;
    private float b;
    private float c;
    private long d;
    private long e;
    private long f;
    private float g;
    private Interpolator h;

    private c(float f, float f2, long j, long j2, Interpolator interpolator) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), new Long(j), new Long(j2), interpolator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bb05886e5120657c44bd2165c08ef51", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bb05886e5120657c44bd2165c08ef51");
            return;
        }
        this.b = f;
        this.c = f2;
        this.e = j;
        this.d = j2;
        this.f = this.d - this.e;
        this.g = this.c - this.b;
        this.h = interpolator;
    }

    public c(float f, float f2, long j, long j2) {
        this(0.1f, 3.0f, 0L, 4000L, new LinearInterpolator());
        Object[] objArr = {Float.valueOf(0.1f), Float.valueOf(3.0f), 0L, 4000L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "868a677ed3cb0a949ac254baaddeefcf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "868a677ed3cb0a949ac254baaddeefcf");
        }
    }

    @Override // com.sankuai.waimai.popup.spfx.particle.modifiers.b
    public final void a(com.sankuai.waimai.popup.spfx.particle.a aVar, long j) {
        Object[] objArr = {aVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41dd4a1445b3b652fff5ef2f3366199a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41dd4a1445b3b652fff5ef2f3366199a");
        } else if (j < this.e) {
            aVar.e = this.b;
        } else if (j > this.d) {
            aVar.e = this.c;
        } else {
            aVar.e = this.b + (this.g * this.h.getInterpolation((((float) (j - this.e)) * 1.0f) / ((float) this.f)));
        }
    }
}
