package com.sankuai.waimai.bussiness.order.crossconfirm.block.invoiceinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.android.cube.pga.type.b;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.submit.model.Invoice;
import com.sankuai.waimai.foundation.utils.h;
import com.sankuai.waimai.platform.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.block.a<b, d, com.sankuai.waimai.bussiness.order.crossconfirm.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53e2b5be14eed2ffa82187e8e9c337bf", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53e2b5be14eed2ffa82187e8e9c337bf") : new d();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ b z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b56ab3adbb392ac124a85ae7ea48cc4", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b56ab3adbb392ac124a85ae7ea48cc4") : new b(m());
    }

    public a(com.sankuai.waimai.bussiness.order.crossconfirm.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9daa789af109df8a246b112bfe5f39c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9daa789af109df8a246b112bfe5f39c");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db5ad641874bd539d6336463612b706a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db5ad641874bd539d6336463612b706a");
            return;
        }
        super.s();
        ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).o.a(new com.meituan.android.cube.pga.action.b<b.a>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.invoiceinfo.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(b.a aVar) {
                b.a aVar2 = aVar;
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7fa62645d3c7bf7cbb7b27581f156b2b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7fa62645d3c7bf7cbb7b27581f156b2b");
                    return;
                }
                b bVar = (b) a.this.g;
                int i = aVar2.a;
                int i2 = aVar2.b;
                Intent intent = aVar2.c;
                Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2), intent};
                ChangeQuickRedirect changeQuickRedirect3 = b.d;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "a3377618b2dda4477ee3e25ac3b06262", RobustBitConfig.DEFAULT_VALUE)) {
                    ((Boolean) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "a3377618b2dda4477ee3e25ac3b06262")).booleanValue();
                } else if (i != bVar.n + UserCenter.TYPE_LOGOUT_NEGATIVE && i != bVar.n + 30000) {
                    if (i == bVar.n + RequestIDMap.OP_TYPE_TAG.OP_TYPE_INSERT_PAGE_NAME && i2 == -1) {
                        Invoice a2 = bVar.a(intent);
                        bVar.o = a2;
                        bVar.a(a2);
                    }
                } else if (i2 == -1) {
                    Object[] objArr4 = {intent};
                    ChangeQuickRedirect changeQuickRedirect4 = b.d;
                    Invoice invoice = null;
                    if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "fb8ca81ea1576392f74dec0c929e6136", RobustBitConfig.DEFAULT_VALUE)) {
                        invoice = (Invoice) PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "fb8ca81ea1576392f74dec0c929e6136");
                    } else if (intent != null) {
                        String a3 = f.a(intent, "title");
                        if (!TextUtils.isEmpty(a3)) {
                            long a4 = f.a(intent, "id", 0L);
                            String a5 = f.a(intent, "pt_id");
                            invoice = new Invoice(a4, TextUtils.isEmpty(a5) ? null : a5, a3, f.a(intent, "taxpayer_id_number"), f.a(intent, "invoice_type", 0));
                        }
                    }
                    bVar.o = invoice;
                    bVar.a(invoice);
                }
            }
        });
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97cb37302a53d73134c2654a2a7f07b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97cb37302a53d73134c2654a2a7f07b8");
            return;
        }
        super.I();
        b bVar = (b) this.g;
        c cVar = ((d) this.n).p;
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "cd85f5131941b26e4b14ebb8b5f59aec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "cd85f5131941b26e4b14ebb8b5f59aec");
            return;
        }
        Object[] objArr3 = {cVar};
        ChangeQuickRedirect changeQuickRedirect3 = b.d;
        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "800a0582df6bf841090aff0a60b880d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "800a0582df6bf841090aff0a60b880d7");
            return;
        }
        bVar.i = cVar;
        bVar.n = cVar.k;
        if (cVar != null) {
            boolean a = cVar.a();
            double d = cVar.j;
            double d2 = cVar.i;
            if (bVar.i.e) {
                bVar.j.setVisibility(0);
                Object[] objArr4 = {Byte.valueOf(a ? (byte) 1 : (byte) 0), Double.valueOf(d), Double.valueOf(d2)};
                ChangeQuickRedirect changeQuickRedirect4 = b.d;
                if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "e76ccbe22ea0d0b9dd7520702a9f482b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "e76ccbe22ea0d0b9dd7520702a9f482b");
                    return;
                } else if (!a) {
                    bVar.m.setVisibility(8);
                    bVar.k.setTextColor(bVar.p.getResources().getColor(R.color.wm_order_confirm_title_text_color_hint_not_support));
                    if (TextUtils.isEmpty(bVar.i.f)) {
                        bVar.k.setText(R.string.wm_order_confirm_do_not_support_invoice);
                        return;
                    } else {
                        bVar.k.setText(bVar.i.f);
                        return;
                    }
                } else if (h.e(Double.valueOf(d2), Double.valueOf(d))) {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = b.d;
                    if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "25e69d84943819c3453304b95d925c71", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "25e69d84943819c3453304b95d925c71");
                        return;
                    }
                    bVar.m.setVisibility(0);
                    Invoice b = bVar.i.b();
                    bVar.o = b;
                    Object[] objArr6 = {b};
                    ChangeQuickRedirect changeQuickRedirect6 = b.d;
                    if (PatchProxy.isSupport(objArr6, bVar, changeQuickRedirect6, false, "49bee93c1056ee1c0e1fac7ba3a09049", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr6, bVar, changeQuickRedirect6, false, "49bee93c1056ee1c0e1fac7ba3a09049")).booleanValue();
                    } else {
                        z = (b == null || TextUtils.isEmpty(b.getTitle())) ? false : true;
                    }
                    if (!z) {
                        Object[] objArr7 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect7 = b.d;
                        if (PatchProxy.isSupport(objArr7, bVar, changeQuickRedirect7, false, "6a37e657474a14434ef7a299a80a7043", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, bVar, changeQuickRedirect7, false, "6a37e657474a14434ef7a299a80a7043");
                            return;
                        }
                        bVar.l.setVisibility(8);
                        bVar.k.setTextColor(bVar.p.getResources().getColor(R.color.wm_order_confirm_title_text_color_hint));
                        if (bVar.i != null && bVar.i.g == 1) {
                            bVar.h = "jump_list_invoice";
                            bVar.k.setText(R.string.wm_order_confirm_tableware_un_choose_tips);
                            return;
                        }
                        bVar.h = "jump_add_invoice";
                        bVar.k.setText(R.string.wm_order_confirm_tableware_un_choose_tips);
                        return;
                    }
                    bVar.g = b.getInvoiceType();
                    bVar.e = b.getTitle();
                    bVar.f = b.getTaxpayerId() == null ? "" : b.getTaxpayerId();
                    bVar.h = "jump_list_invoice";
                    bVar.k.setTextColor(bVar.p.getResources().getColor(R.color.wm_order_confirm_title_text_color));
                    bVar.k.setText(b.getTitle());
                    String taxpayerId = b.getTaxpayerId();
                    if (taxpayerId != null && !"".equals(taxpayerId)) {
                        bVar.l.setVisibility(0);
                        bVar.l.setText(taxpayerId);
                        return;
                    }
                    bVar.l.setVisibility(8);
                    return;
                } else {
                    bVar.m.setVisibility(8);
                    bVar.k.setTextColor(bVar.p.getResources().getColor(R.color.wm_order_confirm_title_text_color_hint_not_support));
                    bVar.k.setText(bVar.p.getString(R.string.wm_order_confirm_not_enough_to_have_invoice, new Object[]{h.a(d)}));
                    return;
                }
            }
            bVar.j.setVisibility(8);
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c782ccd61fcc47bbef4962c1e8e49324", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c782ccd61fcc47bbef4962c1e8e49324");
            return;
        }
        super.y();
        if (((b) this.g).a().getVisibility() != 8) {
            ((b) this.g).f();
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85a92b52f4be4a8374824f1cdcf35830", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85a92b52f4be4a8374824f1cdcf35830");
            return;
        }
        super.b(bundle);
        b bVar = (b) this.g;
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "16846fe4f2c7a539a21b633cb5fe286b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "16846fe4f2c7a539a21b633cb5fe286b");
            return;
        }
        bundle.putInt("mChooseInvoiceType", bVar.g);
        bundle.putString("mChosenInvoiceTitle", bVar.e);
        bundle.putString("mChosenInvoiceTaxpayerId", bVar.f);
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void c(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b25494258da205477d2f929088e52452", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b25494258da205477d2f929088e52452");
            return;
        }
        super.c(bundle);
        b bVar = (b) this.g;
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "c5a8f255c104fd5cd54aa40ae0896f8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "c5a8f255c104fd5cd54aa40ae0896f8d");
            return;
        }
        bVar.g = bundle.getInt("mChooseInvoiceType");
        bVar.e = bundle.getString("mChosenInvoiceTitle");
        bVar.f = bundle.getString("mChosenInvoiceTaxpayerId");
    }

    public final String M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "699c5828819a0af950a19f2b0720c602", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "699c5828819a0af950a19f2b0720c602") : ((b) this.g).e;
    }

    public final int N() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ad7301b8a7344cb93c60a0886ef8ffa", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ad7301b8a7344cb93c60a0886ef8ffa")).intValue() : ((b) this.g).g;
    }

    public final String O() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e235a41a3e7b63aa6420b61b9389e6e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e235a41a3e7b63aa6420b61b9389e6e") : ((b) this.g).f;
    }
}
