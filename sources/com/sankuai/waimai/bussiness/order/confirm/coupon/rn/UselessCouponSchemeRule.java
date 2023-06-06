package com.sankuai.waimai.bussiness.order.confirm.coupon.rn;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.schemereplace.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class UselessCouponSchemeRule extends a {
    private static final String MT_USELESS_COUPON_RULE = "/takeout/order/uselesscouponlist";
    private static final String USELESS_COUPON_RULE = "/order/uselesscouponlist";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.schemereplace.a
    public String getMRNComponent() {
        return "expired-redpacket";
    }

    @Override // com.sankuai.waimai.platform.schemereplace.a
    public String getMRNEntry() {
        return "expired-redpacket";
    }

    @Override // com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public boolean shouldReplace(@NonNull Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1af851de6bb779e2b7da9b94867c6aa3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1af851de6bb779e2b7da9b94867c6aa3")).booleanValue() : TextUtils.equals(uri.getPath(), USELESS_COUPON_RULE) || TextUtils.equals(uri.getPath(), MT_USELESS_COUPON_RULE);
    }
}
