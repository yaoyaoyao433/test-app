package com.sankuai.waimai.bussiness.order.crossconfirm.block.remindinfo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.poi.Remind;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.meituan.android.cube.pga.viewmodel.a<List<Remind>> {
    public static ChangeQuickRedirect o;
    c p;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a8999c129745349469511c428becaf6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a8999c129745349469511c428becaf6");
        } else {
            this.p = new c();
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb0ddb21eb9d98b0e1cbc6b456fae34d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb0ddb21eb9d98b0e1cbc6b456fae34d");
            return;
        }
        super.d();
        if (this.c != 0) {
            this.p.a = (List) this.c;
            return;
        }
        this.p.a = null;
    }
}
