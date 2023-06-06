package com.sankuai.waimai.business.page.common.mrn;

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
public class TodayRecommendSchemeRule implements SchemeReplaceRule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public boolean shouldReplace(@NonNull Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cfd1934d054e4060074e9dbbb68c0b98", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cfd1934d054e4060074e9dbbb68c0b98")).booleanValue() : TextUtils.equals(uri.getPath(), "/todayrecommend") || TextUtils.equals(uri.getPath(), "/todayrecommend");
    }

    @Override // com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public void schemeReplace(@NonNull j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2e7ee23ae6d7696eea135be076c5487", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2e7ee23ae6d7696eea135be076c5487");
        } else {
            jVar.a(jVar.d.buildUpon().scheme("wm_router").authority("page").path("/mrn").appendQueryParameter("mrn_biz", "waimai").appendQueryParameter("mrn_entry", "subcategory-today-recommed").appendQueryParameter("mrn_component", "subcategoryTodayRecommed").build());
        }
    }
}
