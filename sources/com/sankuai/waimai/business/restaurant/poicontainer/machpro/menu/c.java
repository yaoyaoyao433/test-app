package com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static GoodsSku a(GoodsSpu goodsSpu, long j) {
        Object[] objArr = {goodsSpu, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4b1eecde05c396378e44fd0c061f58c", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsSku) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4b1eecde05c396378e44fd0c061f58c");
        }
        if (goodsSpu == null || goodsSpu.getSkus() == null || goodsSpu.getSkus().isEmpty()) {
            return null;
        }
        List<GoodsSku> skus = goodsSpu.getSkus();
        for (int i = 0; i < skus.size(); i++) {
            GoodsSku goodsSku = skus.get(i);
            if (goodsSku != null && goodsSku.id == j) {
                return goodsSku;
            }
        }
        return null;
    }
}
