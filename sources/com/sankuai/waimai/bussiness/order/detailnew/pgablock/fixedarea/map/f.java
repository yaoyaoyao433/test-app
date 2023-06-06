package com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.q;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.OrderFixAreaInfo;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends com.meituan.android.cube.pga.viewmodel.a<OrderFixAreaInfo> {
    public static ChangeQuickRedirect o;
    @NonNull
    b p;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7afb6da5f791fd421ab8f7cb991852ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7afb6da5f791fd421ab8f7cb991852ef");
        } else {
            this.p = new b();
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5309c8aee77739fa3dcdde0ac7c06d60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5309c8aee77739fa3dcdde0ac7c06d60");
            return;
        }
        super.d();
        if (this.c != 0) {
            this.p.b = ((OrderFixAreaInfo) this.c).mLotteryInfo;
            this.p.c = ((OrderFixAreaInfo) this.c).riderInfo;
            this.p.d = ((OrderFixAreaInfo) this.c).userInfo;
            this.p.e = ((OrderFixAreaInfo) this.c).poiInfo;
            this.p.f = ((OrderFixAreaInfo) this.c).cityDeliveryArea;
            this.p.g = ((OrderFixAreaInfo) this.c).progressBarInfo;
            this.p.h = ((OrderFixAreaInfo) this.c).rxAreaStatus;
            this.p.i = ((OrderFixAreaInfo) this.c).selfDeliveryArea;
            this.p.j = ((OrderFixAreaInfo) this.c).attentionInfo;
            this.p.l = ((OrderFixAreaInfo) this.c).orderCommonInfo;
            this.p.m = ((OrderFixAreaInfo) this.c).orderStatusDesc;
            this.p.n = ((OrderFixAreaInfo) this.c).orderId;
            if (TextUtils.isEmpty(((OrderFixAreaInfo) this.c).trackingInfo)) {
                return;
            }
            this.p.o = (q) com.sankuai.waimai.bussiness.order.detailnew.util.d.a().fromJson(((OrderFixAreaInfo) this.c).trackingInfo, (Class<Object>) q.class);
        }
    }
}
