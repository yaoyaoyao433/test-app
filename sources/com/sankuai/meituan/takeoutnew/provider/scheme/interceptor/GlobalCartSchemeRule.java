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
public class GlobalCartSchemeRule implements SchemeReplaceRule {
    private static final String GLOBALCART_PATH = "/globalcart";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public boolean shouldReplace(@NonNull Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82027fd00f26c7166ac8c02c05b0c8be", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82027fd00f26c7166ac8c02c05b0c8be")).booleanValue() : TextUtils.equals(uri.getPath(), GLOBALCART_PATH);
    }

    @Override // com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public void schemeReplace(@NonNull j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b854768fd8593914b76d213069a0c5ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b854768fd8593914b76d213069a0c5ad");
            return;
        }
        Uri.Builder buildUpon = Uri.parse("meituanwaimai://waimai.meituan.com/mrn").buildUpon();
        buildUpon.appendQueryParameter("mrn_biz", "waimai");
        buildUpon.appendQueryParameter("mrn_entry", "globalcart");
        buildUpon.appendQueryParameter("mrn_component", "globalCart");
        buildUpon.appendQueryParameter("need_login", "1");
        jVar.a(buildUpon.build());
    }
}
