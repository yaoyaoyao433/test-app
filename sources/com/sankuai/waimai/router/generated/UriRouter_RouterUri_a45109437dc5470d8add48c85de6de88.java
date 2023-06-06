package com.sankuai.waimai.router.generated;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.common.IUriAnnotationInit;
import com.sankuai.waimai.router.common.h;
import com.sankuai.waimai.router.core.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class UriRouter_RouterUri_a45109437dc5470d8add48c85de6de88 implements IUriAnnotationInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.router.components.b
    public void init(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0950d12c108c9b2c6c5ddc1eca14ab4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0950d12c108c9b2c6c5ddc1eca14ab4");
            return;
        }
        hVar.a("", "", "/takeout/mscHalfPage", new com.sankuai.waimai.store.drug.vessel.a(), true, new i[0]);
        hVar.a("", "", "/takeout/drug/home", new com.sankuai.waimai.store.drug.home.a(), true, new i[0]);
        hVar.a("", "", "/takeout/drug/detail", new com.sankuai.waimai.store.drug.a(), true, new i[0]);
        hVar.a("", "", "/takeout/drug/store", new com.sankuai.waimai.store.drug.goods.list.a(), false, new i[0]);
    }
}
