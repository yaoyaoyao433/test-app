package com.sankuai.waimai.store.mrn.preload;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.config.SCConfigPath;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class k implements com.sankuai.waimai.router.core.i {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.router.core.i
    public final void a(@NonNull com.sankuai.waimai.router.core.j jVar, @NonNull com.sankuai.waimai.router.core.g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d6290bf56ac5f40eb582a2dd66f7e65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d6290bf56ac5f40eb582a2dd66f7e65");
            return;
        }
        if (com.sankuai.waimai.store.config.i.h().a(SCConfigPath.PRELOAD_MRN, false) && jVar.d.isHierarchical() && "supermarket".equals(jVar.d.getQueryParameter("mrn_biz")) && "flashbuy-activity-product-set".equals(jVar.d.getQueryParameter("mrn_entry"))) {
            i.a(jVar.d).a();
        }
        gVar.a();
    }
}
