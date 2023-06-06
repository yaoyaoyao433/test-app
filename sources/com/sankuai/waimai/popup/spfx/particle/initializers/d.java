package com.sankuai.waimai.popup.spfx.particle.initializers;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Random;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d implements b {
    public static ChangeQuickRedirect a;
    private float b;
    private float c;
    private float d;
    private float e;

    public d(float f, float f2, float f3, float f4) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45a7ac0a0d89deb5b7b9fd5bd9f01270", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45a7ac0a0d89deb5b7b9fd5bd9f01270");
            return;
        }
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override // com.sankuai.waimai.popup.spfx.particle.initializers.b
    public final void a(com.sankuai.waimai.popup.spfx.particle.a aVar, Random random) {
        Object[] objArr = {aVar, random};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb60a312651d04b8acfd3c324a8e44f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb60a312651d04b8acfd3c324a8e44f8");
            return;
        }
        aVar.k = (random.nextFloat() * (this.c - this.b)) + this.b;
        aVar.l = (random.nextFloat() * (this.e - this.d)) + this.d;
    }
}
