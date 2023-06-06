package com.sankuai.waimai.store.util;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.SGGoodSkuAttr;
import java.util.Collection;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class ak {
    public static ChangeQuickRedirect a;

    public static boolean a(int i) {
        return i == 7;
    }

    public static boolean a(Context context, int i) {
        return i == 0;
    }

    public static boolean b(Context context, int i) {
        return i == 2;
    }

    public static boolean c(Context context, int i) {
        return i == 1;
    }

    public static boolean d(Context context, int i) {
        return i == 3;
    }

    public static boolean a(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9431da0ecf5cca61b5a446978baa42b0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9431da0ecf5cca61b5a446978baa42b0")).booleanValue();
        }
        if (goodsSpu != null) {
            Map<Long, Map<String, SGGoodSkuAttr>> clientSkuAttrsMap = goodsSpu.getClientSkuAttrsMap();
            return clientSkuAttrsMap != null && !clientSkuAttrsMap.isEmpty() && com.sankuai.shangou.stone.util.a.a((Collection<?>) goodsSpu.spuAttrsList) && com.sankuai.shangou.stone.util.a.a((Collection<?>) goodsSpu.skus);
        }
        return false;
    }
}
