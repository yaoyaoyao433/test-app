package com.sankuai.waimai.business.restaurant.rn.schemereplace;

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
public class ProductSetSchemeRule implements SchemeReplaceRule {
    private static final String PRODUCT_PATH = "/productset";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public boolean shouldReplace(@NonNull Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eed35ea4051578128be36125f24235f2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eed35ea4051578128be36125f24235f2")).booleanValue() : TextUtils.equals(uri.getPath(), PRODUCT_PATH);
    }

    @Override // com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public void schemeReplace(@NonNull j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c97e36332be7f14e94d4b209134b0637", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c97e36332be7f14e94d4b209134b0637");
            return;
        }
        Uri.Builder buildUpon = Uri.parse(jVar.d.toString().replace(PRODUCT_PATH, "/goodscollections")).buildUpon();
        buildUpon.appendQueryParameter("mrn_biz", "waimai");
        buildUpon.appendQueryParameter("mrn_entry", "goodscollection");
        buildUpon.appendQueryParameter("mrn_component", "goodscollection");
        jVar.a(buildUpon.build());
    }
}
