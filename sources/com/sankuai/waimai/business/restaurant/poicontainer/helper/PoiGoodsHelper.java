package com.sankuai.waimai.business.restaurant.poicontainer.helper;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class PoiGoodsHelper {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface PoiGoodsFromSource {
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface UnsalableGoodsState {
    }

    public static boolean a(GoodsSpu goodsSpu, GoodsSpu goodsSpu2) {
        Object[] objArr = {goodsSpu, goodsSpu2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "57be9a0dfb9f672ae428010d4f832a6d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "57be9a0dfb9f672ae428010d4f832a6d")).booleanValue();
        }
        if (goodsSpu != null && goodsSpu2 != null && goodsSpu.getId() == goodsSpu2.getId()) {
            String tag = goodsSpu.getTag();
            if (!TextUtils.isEmpty(tag) && (tag.equals(goodsSpu2.getTag()) || tag.equals(goodsSpu2.getActivityTag()))) {
                return true;
            }
        }
        return false;
    }
}
