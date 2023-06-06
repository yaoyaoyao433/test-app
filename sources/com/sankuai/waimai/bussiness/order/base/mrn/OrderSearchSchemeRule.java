package com.sankuai.waimai.bussiness.order.base.mrn;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OrderSearchSchemeRule implements SchemeReplaceRule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public boolean shouldReplace(@NonNull Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab8b575cf77b1900626a67a2bb8611d8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab8b575cf77b1900626a67a2bb8611d8")).booleanValue() : TextUtils.equals(uri.getPath(), "/ordersearch");
    }

    @Override // com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public void schemeReplace(@NonNull j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa20c3ebd99d9a5d60cee7978e6663f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa20c3ebd99d9a5d60cee7978e6663f6");
            return;
        }
        Uri.Builder buildUpon = Uri.parse("wm_router://page/mrn").buildUpon();
        buildUpon.appendQueryParameter("mrn_biz", "waimai");
        buildUpon.appendQueryParameter("mrn_entry", "order-search");
        buildUpon.appendQueryParameter("mrn_component", "WMOrderSearch");
        jVar.a(buildUpon.build());
    }
}
