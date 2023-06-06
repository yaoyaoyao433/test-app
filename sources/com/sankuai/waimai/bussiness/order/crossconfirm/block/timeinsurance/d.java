package com.sankuai.waimai.bussiness.order.crossconfirm.block.timeinsurance;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.submit.model.Insurance;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.meituan.android.cube.pga.viewmodel.a<Insurance> {
    public static ChangeQuickRedirect o;
    @NonNull
    c p;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a2d67ebecbaa6e0345d42adf685576c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a2d67ebecbaa6e0345d42adf685576c");
        } else {
            this.p = new c();
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b10e15e8c6f968687090b13740ce7ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b10e15e8c6f968687090b13740ce7ca");
            return;
        }
        super.d();
        if (this.c != 0) {
            this.p.a = ((Insurance) this.c).insuranceSelected == 1;
            this.p.b = ((Insurance) this.c).isShow == 1;
            this.p.c = ((Insurance) this.c).insuranceIcon;
            this.p.d = ((Insurance) this.c).insuranceName;
            this.p.e = ((Insurance) this.c).description;
            this.p.f = ((Insurance) this.c).insuranceExplainUrl;
            this.p.g = ((Insurance) this.c).purchaseType != 0;
            this.p.h = ((Insurance) this.c).confirmDesc;
            this.p.i = ((Insurance) this.c).purchaseDesc;
            this.p.j = ((Insurance) this.c).cost;
            this.p.k = ((Insurance) this.c).insuranceReasonCode;
            this.p.l = ((Insurance) this.c).purchaseType;
            return;
        }
        this.p.a = false;
        this.p.b = false;
        this.p.c = null;
        this.p.d = null;
        this.p.e = null;
        this.p.f = null;
        this.p.g = false;
        this.p.h = null;
        this.p.i = null;
        this.p.j = 0.0d;
        this.p.k = 0;
        this.p.l = 0;
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final Boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ade6d32877a1f3c5d6d1327ee4619565", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ade6d32877a1f3c5d6d1327ee4619565");
        }
        return Boolean.valueOf(this.c != 0);
    }
}
