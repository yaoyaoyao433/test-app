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
public class MineAddressListSchemeRule implements SchemeReplaceRule {
    private static final String MINE_ADDRESS_LIST_URI_PATH = "/mineaddress";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public boolean shouldReplace(@NonNull Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5267afbf8ff831e2b5627d40581561d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5267afbf8ff831e2b5627d40581561d")).booleanValue() : TextUtils.equals(uri.getPath(), MINE_ADDRESS_LIST_URI_PATH);
    }

    @Override // com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public void schemeReplace(@NonNull j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8afa0dee0760bd0701fa1db014d1a06c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8afa0dee0760bd0701fa1db014d1a06c");
        } else {
            jVar.a(new Uri.Builder().scheme("wm_router").authority("page").path("mrn").encodedQuery(jVar.d.getQuery()).appendQueryParameter("mrn_biz", "waimai").appendQueryParameter("mrn_entry", "my-address").appendQueryParameter("mrn_component", "WMMyAddress").build());
        }
    }
}
