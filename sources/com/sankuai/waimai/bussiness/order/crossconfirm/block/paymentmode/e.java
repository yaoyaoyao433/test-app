package com.sankuai.waimai.bussiness.order.crossconfirm.block.paymentmode;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.PoiOrderPreviewPaymentResult;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends com.meituan.android.cube.pga.viewmodel.a<PoiOrderPreviewPaymentResult> {
    public static ChangeQuickRedirect o;
    @NonNull
    final d p;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c15d7c7e5e5ab963b5002dbea1e59a23", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c15d7c7e5e5ab963b5002dbea1e59a23");
        } else {
            this.p = new d();
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41b229eb5463e6b6b3bc933c561f73af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41b229eb5463e6b6b3bc933c561f73af");
            return;
        }
        super.d();
        if (this.c != 0) {
            this.p.a = ((PoiOrderPreviewPaymentResult) this.c).paymentDetail;
            this.p.b = ((PoiOrderPreviewPaymentResult) this.c).defaultPayType;
            this.p.c = ((PoiOrderPreviewPaymentResult) this.c).payTypeTip;
            this.p.d = null;
            return;
        }
        this.p.a = null;
        this.p.b = 1;
        this.p.c = null;
        this.p.d = null;
    }
}
