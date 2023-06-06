package com.sankuai.waimai.router.generated;

import com.meituan.android.legwork.common.ui.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.common.IPageAnnotationInit;
import com.sankuai.waimai.router.common.e;
import com.sankuai.waimai.router.core.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class UriRouter_RouterPage_8e2b98145d33dd2e0ee023bd1b7c0dc9 implements IPageAnnotationInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.router.components.b
    public void init(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "991be78a7d3c76336f4cfafb87434d7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "991be78a7d3c76336f4cfafb87434d7e");
        } else {
            eVar.a("/legwork/poiConfirm", new c(), new i[0]);
        }
    }
}
