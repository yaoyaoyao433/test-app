package com.sankuai.waimai.bussiness.order.crossconfirm.block.deliveryinfo;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.submit.model.PaymentItem;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.OrderFoodInput;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.OrderFoodOutput;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.PoiOrderPreviewResult;
import com.sankuai.waimai.foundation.utils.aa;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends com.meituan.android.cube.pga.viewmodel.a<PoiOrderPreviewResult> {
    public static ChangeQuickRedirect o;
    @NonNull
    final d p;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38a057b5a51a7429f7d35c820b899a6f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38a057b5a51a7429f7d35c820b899a6f");
        } else {
            this.p = new d();
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c1616b812265cfa35a76689636f7924", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c1616b812265cfa35a76689636f7924");
            return;
        }
        super.d();
        if (this.c != 0) {
            this.p.a = ((PoiOrderPreviewResult) this.c).poiInfo != null ? ((PoiOrderPreviewResult) this.c).poiInfo.poiId : -1L;
            this.p.b = ((PoiOrderPreviewResult) this.c).poiInfo != null ? ((PoiOrderPreviewResult) this.c).poiInfo.poiIdStr : "";
            if (((PoiOrderPreviewResult) this.c).mExpectedArrivalInfo != null) {
                this.p.c = ((PoiOrderPreviewResult) this.c).mExpectedArrivalInfo.dateTypeTip;
                this.p.g = ((PoiOrderPreviewResult) this.c).mExpectedArrivalInfo.selectViewTime;
                this.p.h = ((PoiOrderPreviewResult) this.c).mExpectedArrivalInfo.unixTime;
                this.p.i = ((PoiOrderPreviewResult) this.c).mExpectedArrivalInfo.clickable;
            } else {
                this.p.c = null;
                this.p.g = null;
                this.p.h = 0;
                this.p.i = false;
            }
            this.p.d = 1;
            this.p.e = false;
            this.p.f = ((PoiOrderPreviewResult) this.c).poiInfo != null && ((PoiOrderPreviewResult) this.c).poiInfo.preOrder == 1;
            this.p.j = ((PoiOrderPreviewResult) this.c).mOrderDeliveryTipArea;
            this.p.l = ((PoiOrderPreviewResult) this.c).wmOrderTagType;
            if (!aa.a(((PoiOrderPreviewResult) this.c).previewOrderCallbackInfo)) {
                this.p.m = ((PoiOrderPreviewResult) this.c).previewOrderCallbackInfo;
            } else if (((PoiOrderPreviewResult) this.c).extendsInfo != null) {
                this.p.m = ((PoiOrderPreviewResult) this.c).extendsInfo.previewOrderCallbackInfo;
            } else {
                this.p.m = null;
            }
            LinkedList linkedList = new LinkedList();
            if (com.sankuai.waimai.foundation.utils.b.a(((PoiOrderPreviewResult) this.c).foodList)) {
                for (OrderFoodOutput orderFoodOutput : ((PoiOrderPreviewResult) this.c).foodList) {
                    if (orderFoodOutput != null) {
                        linkedList.add(new OrderFoodInput(orderFoodOutput));
                    }
                }
            }
            this.p.n = linkedList;
        } else {
            this.p.a = -1L;
            this.p.c = null;
            this.p.g = null;
            this.p.h = 0;
            this.p.i = false;
            this.p.l = 0;
            this.p.d = 1;
            this.p.e = false;
            this.p.f = false;
            this.p.j = null;
            this.p.m = null;
            this.p.n = null;
        }
        d dVar = this.p;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = o;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85f33823c0a5cd637c7019e9a9030446", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85f33823c0a5cd637c7019e9a9030446")).intValue();
        } else if (this.c == 0 || ((PoiOrderPreviewResult) this.c).paymentInfo == null) {
            i = 1;
        } else {
            int i2 = ((PoiOrderPreviewResult) this.c).paymentInfo.defaultPayType;
            List<PaymentItem> list = ((PoiOrderPreviewResult) this.c).paymentInfo.paymentDetail;
            i = (list == null || list.size() <= 0 || list.size() != 1) ? i2 : list.get(0).payType;
        }
        dVar.k = i;
    }
}
