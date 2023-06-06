package com.sankuai.waimai.router.generated;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.core.i;
import com.sankuai.waimai.router.regex.IRegexAnnotationInit;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class UriRouter_RouterRegex_a73f7ee6692d528b681d624fe617456 implements IRegexAnnotationInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.router.components.b
    public void init(com.sankuai.waimai.router.regex.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "148e0221a274f789286ccd19e1b474dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "148e0221a274f789286ccd19e1b474dc");
        } else {
            aVar.a("^http(s)?://.*", new com.sankuai.eh.component.web.wm.router.a(), true, 100, new i[0]);
        }
    }
}
