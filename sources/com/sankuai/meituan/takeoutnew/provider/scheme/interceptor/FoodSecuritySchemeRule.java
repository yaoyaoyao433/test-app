package com.sankuai.meituan.takeoutnew.provider.scheme.interceptor;

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
public class FoodSecuritySchemeRule implements SchemeReplaceRule {
    private static final String INSURANCE_PATH = "/insurancepreview";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public boolean shouldReplace(@NonNull Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a19270b06b7e0c534295cfba8ddcd006", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a19270b06b7e0c534295cfba8ddcd006")).booleanValue() : TextUtils.equals(uri.getPath(), INSURANCE_PATH);
    }

    @Override // com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public void schemeReplace(@NonNull j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1df9f440332c4acc580af9a5ec4cdc28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1df9f440332c4acc580af9a5ec4cdc28");
        } else {
            jVar.a(new Uri.Builder().scheme("wm_router").authority("page").path("mrn").encodedQuery(jVar.d.getQuery()).appendQueryParameter("mrn_biz", "waimai").appendQueryParameter("mrn_entry", "food-security").appendQueryParameter("mrn_component", "WMFoodSecurity").build());
        }
    }
}
