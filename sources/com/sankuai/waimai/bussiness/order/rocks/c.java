package com.sankuai.waimai.bussiness.order.rocks;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements com.meituan.android.cube.pga.action.d {
    public static ChangeQuickRedirect a;
    private final b b;

    public c(b bVar) {
        this.b = bVar;
    }

    @Override // com.meituan.android.cube.pga.action.d
    public final Object a() {
        Object accessDispatch;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98bf449bea58a218210f98dcfe0fd05a", RobustBitConfig.DEFAULT_VALUE)) {
            accessDispatch = PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98bf449bea58a218210f98dcfe0fd05a");
        } else {
            b bVar = this.b;
            Object[] objArr2 = {bVar};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4b592ff543b9b70821568d5d851cd52c", RobustBitConfig.DEFAULT_VALUE)) {
                return Integer.valueOf(bVar.q - bVar.k);
            }
            accessDispatch = PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4b592ff543b9b70821568d5d851cd52c");
        }
        return accessDispatch;
    }
}
