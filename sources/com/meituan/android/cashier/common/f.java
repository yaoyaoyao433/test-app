package com.meituan.android.cashier.common;

import com.meituan.android.cashier.common.u;
import com.meituan.android.cashier.retrofit.CashierRouterRequestService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements u.a {
    public static ChangeQuickRedirect a;
    private final e b;

    public f(e eVar) {
        this.b = eVar;
    }

    @Override // com.meituan.android.cashier.common.u.a
    public final void a(Map map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2c7b49d4809528cae6378b94d356316", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2c7b49d4809528cae6378b94d356316");
            return;
        }
        e eVar = this.b;
        Object[] objArr2 = {eVar, map};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d1feb4217f3b9f4ce7a5909cf717a8ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d1feb4217f3b9f4ce7a5909cf717a8ae");
        } else {
            eVar.e = ((CashierRouterRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(CashierRouterRequestService.class, eVar.c, 20)).bffNode(map);
        }
    }
}
