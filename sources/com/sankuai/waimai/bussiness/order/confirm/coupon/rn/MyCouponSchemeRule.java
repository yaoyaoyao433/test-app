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
public class MyCouponSchemeRule extends a {
    private static final String MY_COUPON_RULE = "/coupons";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.schemereplace.a
    public String getMRNComponent() {
        return "redpacket";
    }

    @Override // com.sankuai.waimai.platform.schemereplace.a
    public String getMRNEntry() {
        return "redpacket";
    }

    @Override // com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public boolean shouldReplace(@NonNull Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c72e87d6799bb863dad6c69c49fbc20", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c72e87d6799bb863dad6c69c49fbc20")).booleanValue() : TextUtils.equals(uri.getPath(), MY_COUPON_RULE);
    }
}
