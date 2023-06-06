package com.sankuai.waimai.bussiness.order.confirm.coupon.rn;

import android.net.Uri;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.schemereplace.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MyPoiCouponSchemeRule extends a {
    private static final String MT_MY_POi_COUPON_SCHEME_PATH = "/takeout/poicoupons";
    private static final String MY_POI_COUPON_SCHEME_PATH = "/poicoupons";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.schemereplace.a
    public String getMRNComponent() {
        return "coupon-list";
    }

    @Override // com.sankuai.waimai.platform.schemereplace.a
    public String getMRNEntry() {
        return "coupon-list";
    }

    @Override // com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public boolean shouldReplace(@NonNull Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91686f5904d7dae60c4be41e74e3e80f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91686f5904d7dae60c4be41e74e3e80f")).booleanValue() : MY_POI_COUPON_SCHEME_PATH.equals(uri.getPath()) || MT_MY_POi_COUPON_SCHEME_PATH.equals(uri.getPath());
    }
}
