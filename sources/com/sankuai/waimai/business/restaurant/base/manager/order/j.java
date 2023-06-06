package com.sankuai.waimai.business.restaurant.base.manager.order;

import android.app.Activity;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class j implements Serializable {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.business.restaurant.base.shopcart.b b;

    public j(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51c9d5461dfedf13e81764a04455022d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51c9d5461dfedf13e81764a04455022d");
        } else {
            this.b = bVar;
        }
    }

    public final void a(Activity activity, GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr, int i, int i2, g gVar) throws com.sankuai.waimai.platform.domain.manager.exceptions.a {
        boolean z = false;
        Object[] objArr = {activity, goodsSpu, goodsSku, goodsAttrArr, Integer.valueOf(i), Integer.valueOf(i2), gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c381dbc40211ec28c4e5d474089f672a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c381dbc40211ec28c4e5d474089f672a");
        } else if (!b.a(goodsSpu)) {
            throw new com.sankuai.waimai.platform.domain.manager.exceptions.a(com.meituan.android.singleton.b.a.getString(R.string.wm_restaurant_good_sold_out));
        } else {
            Object[] objArr2 = {goodsSpu, goodsSku, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e8e7158727bbbfb55d82b974acd8edd3", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e8e7158727bbbfb55d82b974acd8edd3")).booleanValue();
            } else {
                int a2 = goodsSpu != null ? this.b.a(goodsSpu.getId(), goodsSku.getSkuId()) : 0;
                int stock = goodsSku.getStock();
                if (stock >= 0 && a2 + i2 > stock) {
                    z = true;
                }
            }
            if (z) {
                throw new com.sankuai.waimai.platform.domain.manager.exceptions.a(com.meituan.android.singleton.b.a.getString(R.string.wm_restaurant_no_activity_stock));
            }
        }
    }
}
