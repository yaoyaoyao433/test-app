package com.sankuai.waimai.store.v2.detail.component.pricebar;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.v2.detail.component.pricebar.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends b.a {
    public static ChangeQuickRedirect c;

    public e(b.InterfaceC1335b interfaceC1335b) {
        super(interfaceC1335b);
        Object[] objArr = {interfaceC1335b};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b04c2c249db8880c0b8b69d864785aa3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b04c2c249db8880c0b8b69d864785aa3");
        }
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.pricebar.b.a
    public final void a(GoodsSpu goodsSpu) {
        boolean z = true;
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ab646d90ee747ffb76e38e9bbf0d3a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ab646d90ee747ffb76e38e9bbf0d3a9");
        } else if (goodsSpu == null) {
        } else {
            g gVar = new g();
            gVar.b = goodsSpu.getMinPrice();
            gVar.c = goodsSpu.getOriginPrice();
            gVar.d = goodsSpu.getVipPrice();
            gVar.e = goodsSpu.getMemberHintTex();
            if (i.e(Double.valueOf(gVar.d), Double.valueOf(0.0d))) {
                if (!i.b(Double.valueOf(gVar.c), Double.valueOf(0.0d)) && !i.b(Double.valueOf(gVar.d), Double.valueOf(gVar.b))) {
                    z = false;
                }
                gVar.a = z;
            }
            this.b.a(gVar);
        }
    }
}
