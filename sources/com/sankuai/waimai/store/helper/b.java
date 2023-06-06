package com.sankuai.waimai.store.helper;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static String a(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "939654a7bc476e35939d02263db2afdd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "939654a7bc476e35939d02263db2afdd");
        }
        if (goodsSpu != null) {
            if (goodsSpu.getSku() != null) {
                return String.valueOf(goodsSpu.getSku().id);
            }
            return com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.getSkuList(), 0) != null ? String.valueOf(goodsSpu.getSkuList().get(0).id) : "-999";
        }
        return "-999";
    }
}
