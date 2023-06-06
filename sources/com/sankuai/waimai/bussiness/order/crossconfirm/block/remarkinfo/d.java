package com.sankuai.waimai.bussiness.order.crossconfirm.block.remarkinfo;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.submit.model.FieldInfo;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.meituan.android.cube.pga.viewmodel.a<FieldInfo> {
    public static ChangeQuickRedirect o;
    public long p;
    public String q;
    @NonNull
    public c r;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a13eb4b1a66426cd55a2a789bae254b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a13eb4b1a66426cd55a2a789bae254b");
            return;
        }
        this.p = -1L;
        this.q = "";
        this.r = new c();
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6d85014481c0f33b84dceb4ffabf4cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6d85014481c0f33b84dceb4ffabf4cc");
            return;
        }
        super.d();
        this.r.a = true;
        this.r.b = this.p;
        this.r.c = this.q;
        if (this.c != 0) {
            this.r.f = (FieldInfo) this.c;
            return;
        }
        this.r.f = new FieldInfo();
    }
}
