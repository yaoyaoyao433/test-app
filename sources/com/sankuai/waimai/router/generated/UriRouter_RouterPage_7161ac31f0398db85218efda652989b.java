package com.sankuai.waimai.router.generated;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.common.IPageAnnotationInit;
import com.sankuai.waimai.router.common.e;
import com.sankuai.waimai.router.core.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class UriRouter_RouterPage_7161ac31f0398db85218efda652989b implements IPageAnnotationInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.router.components.b
    public void init(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5036c26003d904adcec2302971a1b720", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5036c26003d904adcec2302971a1b720");
        } else {
            eVar.a("/sc_global_search", new com.sankuai.waimai.store.search.a(), new i[0]);
        }
    }
}
