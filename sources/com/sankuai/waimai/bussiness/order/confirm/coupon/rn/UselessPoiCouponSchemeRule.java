package com.sankuai.waimai.bussiness.order.confirm.coupon.rn;

import android.net.Uri;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.schemereplace.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class UselessPoiCouponSchemeRule extends a {
    private static final String MT_USELESS__POi_COUPON_SCHEME_PATH = "/takeout/order/uselesspoicouponlist";
    private static final String USELESS__POI_COUPON_SCHEME_PATH = "/order/uselesspoicouponlist";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.schemereplace.a
    public String getMRNComponent() {
        return "expired-coupon";
    }

    @Override // com.sankuai.waimai.platform.schemereplace.a
    public String getMRNEntry() {
        return "expired-coupon";
    }

    @Override // com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public boolean shouldReplace(@NonNull Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a88d4599605968e788c949c79b19b623", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a88d4599605968e788c949c79b19b623")).booleanValue() : USELESS__POI_COUPON_SCHEME_PATH.equals(uri.getPath()) || MT_USELESS__POi_COUPON_SCHEME_PATH.equals(uri.getPath());
    }
}
