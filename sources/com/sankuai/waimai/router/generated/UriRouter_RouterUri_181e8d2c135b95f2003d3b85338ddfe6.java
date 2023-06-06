package com.sankuai.waimai.router.generated;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.common.IUriAnnotationInit;
import com.sankuai.waimai.router.common.h;
import com.sankuai.waimai.router.core.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class UriRouter_RouterUri_181e8d2c135b95f2003d3b85338ddfe6 implements IUriAnnotationInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.router.components.b
    public void init(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8284c57b984e5fdb25f850530b499ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8284c57b984e5fdb25f850530b499ed");
            return;
        }
        hVar.a("", "", "/takeout/machpro", new com.sankuai.waimai.platform.machpro.container.a(), false, new i[0]);
        hVar.a("", "", "/machpro", new com.sankuai.waimai.platform.machpro.container.a(), false, new i[0]);
    }
}
