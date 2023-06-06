package com.sankuai.waimai.store.goods.list.templet.newmarket.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiMemberInfo;
import com.sankuai.waimai.store.platform.shop.model.PoiOperationItem;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public final f b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0a9136bbfd38c198b920eaf5df258f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0a9136bbfd38c198b920eaf5df258f7");
        } else {
            this.b = new f();
        }
    }

    public final void a(List<PoiOperationItem> list, Poi.CouponSummary couponSummary) {
        this.b.a = list;
        this.b.b = couponSummary;
    }

    public final void a(PoiMemberInfo poiMemberInfo) {
        this.b.c = poiMemberInfo;
    }
}
