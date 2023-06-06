package com.sankuai.waimai.router.generated;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.provider.scheme.handler.e;
import com.sankuai.waimai.router.core.i;
import com.sankuai.waimai.router.regex.IRegexAnnotationInit;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class UriRouter_RouterRegex_33ec9a679ba145f4cde6c2b14a766c3 implements IRegexAnnotationInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.router.components.b
    public void init(com.sankuai.waimai.router.regex.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1be9d0dfb671badffa373e2780b5543", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1be9d0dfb671badffa373e2780b5543");
        } else {
            aVar.a("^http(s)?://.*", new e(), true, 0, new i[0]);
        }
    }
}
