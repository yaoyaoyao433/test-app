package com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.mach;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {
    public static ChangeQuickRedirect a;
    private final d b;

    private h(d dVar) {
        this.b = dVar;
    }

    public static Runnable a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e8a9fbb3be7ae094b0bb89bed850b6d5", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e8a9fbb3be7ae094b0bb89bed850b6d5") : new h(dVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb3805736c86762f79db665c922deb2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb3805736c86762f79db665c922deb2a");
            return;
        }
        d dVar = this.b;
        Object[] objArr2 = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ae60d4b2a303b5ea82f77a4a0756e1d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ae60d4b2a303b5ea82f77a4a0756e1d2");
        } else if (dVar.d != null) {
            dVar.d.setVisibility(8);
        }
    }
}
