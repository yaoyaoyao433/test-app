package com.sankuai.waimai.bussiness.order.confirm.pgablock.instructions;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.meituan.android.cube.pga.viewmodel.a<Map<String, Object>> {
    public static ChangeQuickRedirect o;
    c p;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89f155f5862e4eec79f58abd0398255f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89f155f5862e4eec79f58abd0398255f");
        } else {
            this.p = new c();
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ccc0dc8292944a6890d8b5fcd9e6793", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ccc0dc8292944a6890d8b5fcd9e6793");
            return;
        }
        super.d();
        if (this.c != 0) {
            this.p.a = (Map) ((Map) this.c).get("bottom_module_info");
            return;
        }
        this.p.a = null;
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final Boolean c() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c2543c85af274af415ff25f847ecbf1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c2543c85af274af415ff25f847ecbf1");
        }
        if (this.p != null && this.p.a != null && !TextUtils.isEmpty(this.p.a.get("order_activity_instructions").toString())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
