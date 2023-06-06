package com.sankuai.waimai.store.poi.list.logreport;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newcustomer.b;
import com.sankuai.waimai.store.platform.domain.core.poi.NewCustomCouponDetail;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d implements b.c {
    public static ChangeQuickRedirect a;
    private final com.sankuai.waimai.store.param.a b;

    public d(@NonNull com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2815984fac9e250c8db9ba73dec1e5cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2815984fac9e250c8db9ba73dec1e5cd");
        } else {
            this.b = aVar;
        }
    }

    @Override // com.sankuai.waimai.store.newcustomer.b.c
    public final void a(int i, NewCustomCouponDetail newCustomCouponDetail, String str) {
        Object[] objArr = {Integer.valueOf(i), newCustomCouponDetail, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd4c982c213b79fb4039355422dbdbc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd4c982c213b79fb4039355422dbdbc2");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(this.b.G, "b_uq5dapd9").a("order_view_id", 0).a("index", Integer.valueOf(i)).a("category_code", Long.valueOf(this.b.c)).a("coupon_source", "").a("channel_url_key", newCustomCouponDetail.channelUrlKey).a("coupon_id", newCustomCouponDetail.couponId).a();
        }
    }

    @Override // com.sankuai.waimai.store.newcustomer.b.c
    public final void b(int i, NewCustomCouponDetail newCustomCouponDetail, String str) {
        Object[] objArr = {Integer.valueOf(i), newCustomCouponDetail, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9ffa49d115681810dc5ae47c4b05fa2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9ffa49d115681810dc5ae47c4b05fa2");
        } else {
            com.sankuai.waimai.store.manager.judas.b.b(this.b.G, "b_waimai_zm7sq5vi_mv").a("order_view_id", 0).a("category_code", Long.valueOf(this.b.c)).a("coupon_source", "").a("channel_url_key", newCustomCouponDetail.channelUrlKey).a("index", Integer.valueOf(i)).a();
        }
    }

    @Override // com.sankuai.waimai.store.newcustomer.b.c
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b92ada74e256db720ed22de139b530f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b92ada74e256db720ed22de139b530f9");
        } else {
            com.sankuai.waimai.store.manager.judas.b.b(this.b.G, "b_9vtgtrpx").a("category_code", Long.valueOf(this.b.c)).a("channel_url_key", "-10101").a("order_view_id", 0).a();
        }
    }
}
