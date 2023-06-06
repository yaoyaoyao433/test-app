package com.sankuai.waimai.store.shopping.cart.pre;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static b a(Activity activity, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, @NonNull SCPageConfig sCPageConfig) {
        Object[] objArr = {activity, aVar, sCPageConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "22db7107bbb0918a101d196103840191", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "22db7107bbb0918a101d196103840191");
        }
        if (aVar != null && aVar.t()) {
            return new com.sankuai.waimai.store.shopping.cart.pre.drug.use.a(activity, aVar, sCPageConfig);
        }
        return new a();
    }
}
