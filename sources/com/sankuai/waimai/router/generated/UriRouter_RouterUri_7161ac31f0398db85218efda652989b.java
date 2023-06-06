package com.sankuai.waimai.router.generated;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.common.IUriAnnotationInit;
import com.sankuai.waimai.router.common.h;
import com.sankuai.waimai.router.core.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class UriRouter_RouterUri_7161ac31f0398db85218efda652989b implements IUriAnnotationInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.router.components.b
    public void init(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e9d0c668415a436dfe93c924750e1fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e9d0c668415a436dfe93c924750e1fe");
        } else {
            hVar.a("", "", "/supermarket/globalsearch", new com.sankuai.waimai.store.search.a(), false, new i[0]);
        }
    }
}
