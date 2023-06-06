package com.sankuai.waimai.bussiness.order.rocks;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements com.sankuai.waimai.platform.preload.c {
    public static ChangeQuickRedirect a;
    private final f b;
    private final boolean c;

    private h(f fVar, boolean z) {
        this.b = fVar;
        this.c = z;
    }

    public static com.sankuai.waimai.platform.preload.c a(f fVar, boolean z) {
        Object[] objArr = {fVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ebe2ca20dd9970410301e90b3fa25394", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.platform.preload.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ebe2ca20dd9970410301e90b3fa25394") : new h(fVar, z);
    }

    @Override // com.sankuai.waimai.platform.preload.c
    public final void a(com.sankuai.waimai.platform.preload.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a53fdf1435ca4dc2e7d19a3042bb1a67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a53fdf1435ca4dc2e7d19a3042bb1a67");
        } else {
            f.a(this.b, this.c, fVar);
        }
    }
}
