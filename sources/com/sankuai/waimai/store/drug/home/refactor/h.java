package com.sankuai.waimai.store.drug.home.refactor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class h implements com.sankuai.waimai.foundation.location.v2.callback.b {
    public static ChangeQuickRedirect a;
    private final f b;

    public h(f fVar) {
        this.b = fVar;
    }

    @Override // com.sankuai.waimai.foundation.location.v2.callback.b
    public final void a(WmAddress wmAddress) {
        Object[] objArr = {wmAddress};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e7e250509a49cc158260d76fe8daded", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e7e250509a49cc158260d76fe8daded");
        } else {
            f.a(this.b, wmAddress);
        }
    }
}
