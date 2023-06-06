package com.sankuai.waimai.platform.schemereplace;

import android.net.Uri;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a implements SchemeReplaceRule {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract String getMRNComponent();

    public abstract String getMRNEntry();

    @Override // com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public void schemeReplace(@NonNull j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed05ae2c7fe70d780a1b57acb9292752", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed05ae2c7fe70d780a1b57acb9292752");
        } else {
            jVar.a(new Uri.Builder().scheme("wm_router").authority("page").path("mrn").encodedQuery(jVar.d.getQuery()).appendQueryParameter("mrn_biz", "waimai").appendQueryParameter("mrn_entry", getMRNEntry()).appendQueryParameter("mrn_component", getMRNComponent()).build());
        }
    }
}
