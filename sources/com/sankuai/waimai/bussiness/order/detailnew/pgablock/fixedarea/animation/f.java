package com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.animation;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.OrderFixAreaInfo;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends com.meituan.android.cube.pga.viewmodel.a<OrderFixAreaInfo> {
    public static ChangeQuickRedirect o;

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffa4e1445d337c29581305e112430d03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffa4e1445d337c29581305e112430d03");
        } else {
            super.d();
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final Boolean c() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cab36b110e64de9367039227ed525f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cab36b110e64de9367039227ed525f2");
        }
        if (this.c != 0 && ((OrderFixAreaInfo) this.c).animationInfo != null && !TextUtils.isEmpty(((OrderFixAreaInfo) this.c).animationInfo.animationUrl)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
