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
public class AllCategorySchemeRule implements SchemeReplaceRule {
    private static final String ALL_CATEGORY_PATH = "/allCategory";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public boolean shouldReplace(@NonNull Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a529d378680321c5c735806973b83359", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a529d378680321c5c735806973b83359")).booleanValue() : TextUtils.equals(uri.getPath(), ALL_CATEGORY_PATH);
    }

    @Override // com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public void schemeReplace(@NonNull j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9dada9b188fb1d7e57b08e3b590ed650", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9dada9b188fb1d7e57b08e3b590ed650");
            return;
        }
        Uri.Builder buildUpon = Uri.parse("wm_router://page/mrn").buildUpon();
        buildUpon.appendQueryParameter("mrn_biz", "waimai");
        buildUpon.appendQueryParameter("mrn_entry", "all-subcategory");
        buildUpon.appendQueryParameter("mrn_component", "WMAllSubCategoryPage");
        jVar.a(buildUpon.build());
    }
}
