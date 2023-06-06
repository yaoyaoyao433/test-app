package com.sankuai.waimai.bussiness.order.confirm.coupon.rn;

import android.net.Uri;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.schemereplace.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OrderConfirmSelectRedPakageSchemeRule extends a {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.schemereplace.a
    public String getMRNComponent() {
        return "select-redpacket";
    }

    @Override // com.sankuai.waimai.platform.schemereplace.a
    public String getMRNEntry() {
        return "select-redpacket";
    }

    @Override // com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public boolean shouldReplace(@NonNull Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "55c4e9713a7afef22bd4007baa1d0911", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "55c4e9713a7afef22bd4007baa1d0911")).booleanValue() : "/ordercoupon".equals(uri.getPath()) || "/crossordercoupon".equals(uri.getPath());
    }
}
