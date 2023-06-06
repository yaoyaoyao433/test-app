package com.sankuai.waimai.bussiness.order.crossconfirm.block.foodsecurity;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.submit.model.FoodInsurance;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.meituan.android.cube.pga.viewmodel.a<FoodInsurance> {
    public static ChangeQuickRedirect o;
    @NonNull
    c p;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8eafbda57c8fecfd0bdc3cc8dbe20b2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8eafbda57c8fecfd0bdc3cc8dbe20b2c");
        } else {
            this.p = new c();
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88b2133b2b0e402a34a9f1f3e77074ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88b2133b2b0e402a34a9f1f3e77074ae");
            return;
        }
        super.d();
        if (this.c != 0) {
            this.p.a = (FoodInsurance) this.c;
            return;
        }
        this.p.a = null;
    }
}
