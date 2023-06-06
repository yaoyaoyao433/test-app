package com.meituan.android.cashier.common.mesh;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mesh.bean.MeshBaseUrl;
import com.sankuai.mesh.core.c;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements c.a {
    public static ChangeQuickRedirect a;
    private final CashierService b;

    public a(CashierService cashierService) {
        this.b = cashierService;
    }

    @Override // com.sankuai.mesh.core.c.a
    public final void a(MeshBaseUrl meshBaseUrl) {
        Object[] objArr = {meshBaseUrl};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02b8bedcea3db613ea20020d76560b46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02b8bedcea3db613ea20020d76560b46");
        } else {
            CashierService.lambda$openCashier$9(this.b, meshBaseUrl);
        }
    }
}
