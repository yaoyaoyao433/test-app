package com.sankuai.waimai.popup.spfx.particle.initializers;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Random;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements b {
    public static ChangeQuickRedirect a;
    private float b;
    private float c;
    private int d;
    private int e;

    public a(float f, float f2, int i, int i2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94bcccb5aa763d8a262a1298917c2c2b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94bcccb5aa763d8a262a1298917c2c2b");
            return;
        }
        this.b = f;
        this.c = f2;
        this.d = i;
        this.e = i2;
    }

    @Override // com.sankuai.waimai.popup.spfx.particle.initializers.b
    public final void a(com.sankuai.waimai.popup.spfx.particle.a aVar, Random random) {
        Object[] objArr = {aVar, random};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fef8d92e55e55db798be9fa7e4fe38e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fef8d92e55e55db798be9fa7e4fe38e");
            return;
        }
        float f = this.d;
        if (this.e != this.d) {
            f = random.nextInt(this.e - this.d) + this.d;
        }
        double nextFloat = (random.nextFloat() * (this.c - this.b)) + this.b;
        double d = (float) ((f * 3.141592653589793d) / 180.0d);
        aVar.m = (float) (Math.cos(d) * nextFloat);
        aVar.n = (float) (nextFloat * Math.sin(d));
    }
}
