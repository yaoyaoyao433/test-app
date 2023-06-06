package com.sankuai.waimai.bussiness.order.crossconfirm.block.invoiceinfo;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.PoiOrderPreviewInvoiceResult;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.meituan.android.cube.pga.viewmodel.a<PoiOrderPreviewInvoiceResult> {
    public static ChangeQuickRedirect o;
    @NonNull
    public c p;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "149f34cad5227e529525a23e376272ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "149f34cad5227e529525a23e376272ec");
        } else {
            this.p = new c();
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5cbf544da762c8c65eedc6a7a69f7aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5cbf544da762c8c65eedc6a7a69f7aa");
            return;
        }
        super.d();
        this.p.d = true;
        if (this.c != 0) {
            this.p.g = ((PoiOrderPreviewInvoiceResult) this.c).hasInvoice;
            this.p.h = ((PoiOrderPreviewInvoiceResult) this.c).invoiceSupport;
            this.p.f = ((PoiOrderPreviewInvoiceResult) this.c).invoiceText;
            this.p.j = ((PoiOrderPreviewInvoiceResult) this.c).minInvoicePrice;
            this.p.e = ((PoiOrderPreviewInvoiceResult) this.c).invoiceShow;
            this.p.l = ((PoiOrderPreviewInvoiceResult) this.c).invoiceType;
            this.p.m = ((PoiOrderPreviewInvoiceResult) this.c).taxpayerIdNumber;
            this.p.n = ((PoiOrderPreviewInvoiceResult) this.c).invoiceTitle;
            this.p.o = ((PoiOrderPreviewInvoiceResult) this.c).invoiceLink;
            this.p.p = ((PoiOrderPreviewInvoiceResult) this.c).invoiceMakeType;
            return;
        }
        this.p.g = 0;
        this.p.h = 0;
        this.p.f = "";
        this.p.j = 0.0d;
        this.p.e = false;
        this.p.l = -1;
        this.p.m = "";
        this.p.n = "";
        this.p.o = "";
        this.p.p = 0;
    }
}
