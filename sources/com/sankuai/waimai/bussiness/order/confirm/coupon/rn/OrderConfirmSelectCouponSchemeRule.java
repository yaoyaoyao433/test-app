package com.sankuai.waimai.bussiness.order.confirm.coupon.rn;

import android.net.Uri;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.schemereplace.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OrderConfirmSelectCouponSchemeRule extends a {
    private static final String MT_CHOOSE_COUPON_RULE = "/takeout/selectcoupon";
    private static final String WM_CHOOSE_COUPON_RULE = "/selectcoupon";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.schemereplace.a
    public String getMRNComponent() {
        return "coupon-select";
    }

    @Override // com.sankuai.waimai.platform.schemereplace.a
    public String getMRNEntry() {
        return "coupon-select";
    }

    @Override // com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public boolean shouldReplace(@NonNull Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b2680f9df28ed06c21a818fceeeb7c0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b2680f9df28ed06c21a818fceeeb7c0")).booleanValue() : WM_CHOOSE_COUPON_RULE.equals(uri.getPath()) || MT_CHOOSE_COUPON_RULE.equals(uri.getPath()) || "/ordercouponvoucher".equals(uri.getPath());
    }
}
