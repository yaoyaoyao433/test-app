package com.sankuai.waimai.bussiness.order.base.pay.payment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.i;
import com.sankuai.waimai.bussiness.order.base.pay.payment.PaymentManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public static ChangeQuickRedirect a;
    private final PaymentManager.b b;
    private final i c;

    private b(PaymentManager.b bVar, i iVar) {
        this.b = bVar;
        this.c = iVar;
    }

    public static Runnable a(PaymentManager.b bVar, i iVar) {
        Object[] objArr = {bVar, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77f59b53c99804cc2314d1aba238e157", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77f59b53c99804cc2314d1aba238e157") : new b(bVar, iVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed95005b22479723ca44c869a3c18ac7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed95005b22479723ca44c869a3c18ac7");
            return;
        }
        PaymentManager.b bVar = this.b;
        i iVar = this.c;
        Object[] objArr2 = {bVar, iVar};
        ChangeQuickRedirect changeQuickRedirect2 = PaymentManager.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "594405469a0a7cb355ea95702283f73e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "594405469a0a7cb355ea95702283f73e");
        } else {
            PaymentManager.startPay(bVar.e, bVar.d, iVar, bVar.b, bVar.c);
        }
    }
}
