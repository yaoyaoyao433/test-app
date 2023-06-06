package com.sankuai.waimai.store.mrn.schemehander;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.h;
import com.sankuai.waimai.router.core.j;
import com.sankuai.waimai.store.config.d;
import com.sankuai.waimai.store.config.drug.DrugConfigPath;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends h {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.router.core.h
    public final boolean a(@NonNull j jVar) {
        return true;
    }

    @Override // com.sankuai.waimai.router.core.h
    public final void a(@NonNull j jVar, @NonNull g gVar) {
        boolean z = true;
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42ecc08d501c026a3bfae1bcbf12b388", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42ecc08d501c026a3bfae1bcbf12b388");
            return;
        }
        Object[] objArr2 = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b718e5b6339965ac7c9ef1fea07f23fc", RobustBitConfig.DEFAULT_VALUE)) {
            ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b718e5b6339965ac7c9ef1fea07f23fc")).booleanValue();
            return;
        }
        String path = jVar.d.getPath();
        if (TextUtils.equals("/supermarket/goodscomments", path)) {
            a("flashbuy-goods-comment", jVar, gVar);
        } else if (TextUtils.equals("/supermarket/poiinfo", path)) {
            a("flashbuy-store-info", jVar, gVar);
        } else if (TextUtils.equals("/supermarket/coupon2poiset", path)) {
            a("flashbuy-coupons-poi-list", jVar, gVar);
        } else if (TextUtils.equals("/supermarket/membercard/bind", path)) {
            a("flashbuy-membercard-bind", jVar, gVar);
        } else if (TextUtils.equals("/supermarket/membercard/detail", path)) {
            a("flashbuy-membercard-detail", jVar, gVar);
        } else if (TextUtils.equals("/supermarket/descriptionlist", path)) {
            a("flashbuy-spu-richtext-detail", jVar, gVar);
        } else if (TextUtils.equals("/supermarket/membercard/home", path)) {
            a("flashbuy-membercard-list", jVar, gVar);
        } else if (TextUtils.equals("/supermarket/toofar", path)) {
            a("flashbuy-toofar", jVar, gVar);
        } else if (TextUtils.equals("/supermarket/activityset", path)) {
            b("flashbuy-activities-collection", jVar, gVar);
        } else if (TextUtils.equals("/supermarket/productset", path)) {
            b("flashbuy-activity-product-set", jVar, gVar);
        } else if (TextUtils.equals("/supermarket/restaurantsearch", path)) {
            b("flashbuy-restaurant-search", jVar, gVar);
        } else if (TextUtils.equals("/supermarket/order/shippingcouponlist", path)) {
            Bundle bundle = (Bundle) jVar.a(Bundle.class, "com.sankuai.waimai.router.activity.intent_extra");
            z = (bundle == null || !bundle.getString("biz_line", "").equals("health")) ? false : false;
            boolean a2 = d.h().a(DrugConfigPath.DRUG_DELIVERY_COUPON_SWITCH, false);
            if (z && a2) {
                a("medicine-deli-coupon-sel", jVar, gVar);
            } else {
                a("flashbuy-delivery-coupon-select", jVar, gVar);
            }
        }
    }

    private void a(String str, @NonNull j jVar, @NonNull g gVar) {
        Object[] objArr = {str, jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbea4e28d92386cb95ee806d890f0d36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbea4e28d92386cb95ee806d890f0d36");
            return;
        }
        com.sankuai.waimai.store.router.g.a(jVar, str);
        gVar.a(200);
    }

    private void b(String str, @NonNull j jVar, @NonNull g gVar) {
        Object[] objArr = {str, jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28399458ef9afa18a6818e3702c64713", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28399458ef9afa18a6818e3702c64713");
            return;
        }
        com.sankuai.waimai.store.router.g.b(jVar, str);
        gVar.a(200);
    }
}
