package com.sankuai.waimai.bussiness.order.crossconfirm.block.invoiceinfo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.iconfont.RooIconFont;
import com.sankuai.waimai.business.order.api.submit.model.Invoice;
import com.sankuai.waimai.foundation.utils.h;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    String e;
    String f;
    int g;
    String h;
    c i;
    LinearLayout j;
    TextView k;
    TextView l;
    RooIconFont m;
    int n;
    Invoice o;
    Activity p;
    private final String q;
    private final String r;
    private boolean s;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_layout_invoice_info;
    }

    public static /* synthetic */ void a(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "f582b8677b2bcc033959288fdecb6c5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "f582b8677b2bcc033959288fdecb6c5a");
            return;
        }
        JudasManualManager.a("b_1bp5glky").a("c_ykhs39e").a(bVar.c).a();
        if (bVar.i == null || TextUtils.isEmpty(bVar.i.o)) {
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "4898173486eebb252543f1400d8ba838", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "4898173486eebb252543f1400d8ba838");
            return;
        }
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) bVar.p, "ceres_invoice_mt_invoice", 1);
        Bundle bundle = new Bundle();
        bundle.putInt("intent_source", 1);
        com.sankuai.waimai.foundation.router.a.a(bVar.p, bVar.i.o, bundle, bVar.n + RequestIDMap.OP_TYPE_TAG.OP_TYPE_INSERT_PAGE_NAME);
    }

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8140351754e986a59e6cb4b89d26fdac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8140351754e986a59e6cb4b89d26fdac");
            return;
        }
        this.q = "jump_add_invoice";
        this.r = "jump_list_invoice";
        this.e = "";
        this.f = "";
        this.g = 0;
        this.h = "jump_add_invoice";
        this.s = false;
        this.p = (Activity) context;
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "487975f9dcbca203b5281ea4a2f537ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "487975f9dcbca203b5281ea4a2f537ae");
            return;
        }
        super.b();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "51920d9e4d964172d5c8177b2372a049", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "51920d9e4d964172d5c8177b2372a049");
            return;
        }
        this.j = (LinearLayout) this.b.findViewById(R.id.layout_invoice_root_new);
        this.k = (TextView) this.b.findViewById(R.id.txt_order_invoice_content);
        this.l = (TextView) this.b.findViewById(R.id.txt_order_invoice_taxpayerId_new);
        this.m = (RooIconFont) this.b.findViewById(R.id.img_arrow_invoice_new);
        this.j.setVisibility(8);
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.invoiceinfo.b.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f56f44dcb52517f6817d0159300a2f96", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f56f44dcb52517f6817d0159300a2f96");
                } else if (3 == b.this.e()) {
                    b.a(b.this);
                }
            }
        });
    }

    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a3d531945dffe0aaef30b384c9ea231", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a3d531945dffe0aaef30b384c9ea231")).intValue();
        }
        if (this.i != null) {
            boolean a = this.i.a();
            double d2 = this.i.j;
            double d3 = this.i.i;
            if (a) {
                return h.e(Double.valueOf(d3), Double.valueOf(d2)) ? 3 : 2;
            }
            return 1;
        }
        return 0;
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d2db2d3d7e2871ae5e4ccb10657ea77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d2db2d3d7e2871ae5e4ccb10657ea77");
        } else if (this.s || this.i == null) {
        } else {
            JudasManualManager.b("b_tsq1c8ag").a("c_ykhs39e").a("invoicetype", e()).a(this.c).a();
            this.s = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Invoice a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6707b704d12e775d8f347ce43eda0ef1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Invoice) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6707b704d12e775d8f347ce43eda0ef1");
        }
        if (intent == null) {
            return null;
        }
        String a = f.a(intent, "resultData");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        try {
            InvoiceMTPlatformInfoData invoiceMTPlatformInfoData = (InvoiceMTPlatformInfoData) k.a().fromJson(a, (Class<Object>) InvoiceMTPlatformInfoData.class);
            if (invoiceMTPlatformInfoData != null && !TextUtils.isEmpty(invoiceMTPlatformInfoData.getTitle())) {
                return new Invoice(invoiceMTPlatformInfoData.getTitle(), invoiceMTPlatformInfoData.getCompanyTaxId(), invoiceMTPlatformInfoData.getType());
            }
            return null;
        } catch (Exception e) {
            com.dianping.judas.util.a.a(e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Invoice invoice) {
        Object[] objArr = {invoice};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5d42427e2ee009ffb6c1653a5f298b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5d42427e2ee009ffb6c1653a5f298b9");
        } else if (invoice == null) {
            g();
        } else {
            this.g = invoice.getInvoiceType();
            this.e = invoice.getTitle();
            this.f = invoice.getTaxpayerId();
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a672278c91352d21e47d2ab7dd8984fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a672278c91352d21e47d2ab7dd8984fb");
            return;
        }
        this.g = 0;
        this.e = "";
        this.f = "";
    }
}
