package com.sankuai.waimai.business.restaurant.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.config.horn.RemoteConfigCallback;
import com.sankuai.waimai.platform.config.horn.c;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RestaurantRemoteConfig implements RemoteConfigCallback {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.config.horn.RemoteConfigCallback
    public void onChanged(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2b20ffcc8e865958c4f3f02e7a6b367", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2b20ffcc8e865958c4f3f02e7a6b367");
            return;
        }
        RestaurantSP.a(cVar.a("enable_cart_data_clone", false));
        int a = cVar.a("local_cart_session_cache_interval", 0);
        if (a > 0) {
            RestaurantSP.a(a);
        }
    }
}
