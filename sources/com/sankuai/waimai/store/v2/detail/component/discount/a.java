package com.sankuai.waimai.store.v2.detail.component.discount;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsPromotion;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static boolean a(GoodsPromotion goodsPromotion) {
        Object[] objArr = {goodsPromotion};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "385f5770239efa2bdaf2bb1118044be8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "385f5770239efa2bdaf2bb1118044be8")).booleanValue() : (goodsPromotion == null || TextUtils.isEmpty(goodsPromotion.activityTypeText)) ? false : true;
    }
}
