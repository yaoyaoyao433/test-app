package com.sankuai.waimai.router.generated;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mmp.f;
import com.sankuai.waimai.router.common.IUriAnnotationInit;
import com.sankuai.waimai.router.common.h;
import com.sankuai.waimai.router.core.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class UriRouter_RouterUri_8b65d0b728bdd1256c5336f68a7955ae implements IUriAnnotationInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.router.components.b
    public void init(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06cad3418494af80541a00ca51d6e336", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06cad3418494af80541a00ca51d6e336");
            return;
        }
        hVar.a("", "", "/msc", new com.sankuai.waimai.mmp.h(), true, new i[0]);
        hVar.a("", "", "/mmp", new f(), true, new i[0]);
    }
}
