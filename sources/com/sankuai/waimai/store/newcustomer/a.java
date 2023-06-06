package com.sankuai.waimai.store.newcustomer;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newcustomer.b;
import com.sankuai.waimai.store.platform.domain.core.poi.NewCustomCouponDetail;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements b.c {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.newcustomer.b.c
    public final void a(int i, NewCustomCouponDetail newCustomCouponDetail, String str) {
        Object[] objArr = {Integer.valueOf(i), newCustomCouponDetail, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70ef8fcde522bfe948b2f0c442aea4a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70ef8fcde522bfe948b2f0c442aea4a1");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a("c_hgowsqb", "b_uq5dapd9").a("order_view_id", str).a("category_code", 0).a("channel_url_key", newCustomCouponDetail.channelUrlKey).a("index", Integer.valueOf(i)).a();
        }
    }

    @Override // com.sankuai.waimai.store.newcustomer.b.c
    public final void b(int i, NewCustomCouponDetail newCustomCouponDetail, String str) {
        Object[] objArr = {Integer.valueOf(i), newCustomCouponDetail, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "704bd051d3f7e6c9fde92b34235ab85d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "704bd051d3f7e6c9fde92b34235ab85d");
        } else {
            com.sankuai.waimai.store.manager.judas.b.b("c_hgowsqb", "b_waimai_zm7sq5vi_mv").a("order_view_id", str).a("category_code", 0).a("channel_url_key", newCustomCouponDetail.channelUrlKey).a("index", Integer.valueOf(i)).a();
        }
    }

    @Override // com.sankuai.waimai.store.newcustomer.b.c
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1360befe8e28fcaaf72fb322e550a20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1360befe8e28fcaaf72fb322e550a20");
        } else {
            com.sankuai.waimai.store.manager.judas.b.b("c_hgowsqb", "b_9vtgtrpx").a("category_code", 0).a("order_view_id", str).a("channel_url_key", "-10101").a();
        }
    }
}
