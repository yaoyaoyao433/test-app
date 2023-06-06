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
public class SelfDeliverySchemeRule implements SchemeReplaceRule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public boolean shouldReplace(@NonNull Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ec1d0d0281daa7e41562b2e985dcf81", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ec1d0d0281daa7e41562b2e985dcf81")).booleanValue();
        }
        if (TextUtils.equals(uri.getPath(), "/poifilter") || TextUtils.equals(uri.getPath(), "/takeout/secondpage")) {
            if (!com.sankuai.waimai.foundation.core.a.d()) {
                uri = updateUri(uri);
            }
            long longValue = uri.getQueryParameter("categorytype") != null ? Long.valueOf(uri.getQueryParameter("categorytype")).longValue() : 0L;
            return longValue == 101712 || (longValue == 224186 && com.sankuai.waimai.foundation.core.a.b());
        }
        return false;
    }

    private Uri updateUri(@NonNull Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbbad70fc6fc9c9fa2f608e554baaa2a", RobustBitConfig.DEFAULT_VALUE) ? (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbbad70fc6fc9c9fa2f608e554baaa2a") : Uri.parse(uri.toString().replaceAll("category_type", "categorytype").replaceAll("category_text", "categorytext"));
    }

    @Override // com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public void schemeReplace(@NonNull j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e648173fb266bbd7b42a52033f17775", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e648173fb266bbd7b42a52033f17775");
            return;
        }
        Uri uri = jVar.d;
        if (!com.sankuai.waimai.foundation.core.a.d()) {
            uri = updateUri(uri);
        }
        jVar.a(uri.buildUpon().scheme("wm_router").authority("page").path("/mrn").appendQueryParameter("mrn_biz", "waimai").appendQueryParameter("mrn_entry", "self-delivery").appendQueryParameter("mrn_component", "self-delivery").build());
    }
}
