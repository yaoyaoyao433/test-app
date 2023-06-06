package com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.submit.model.Invoice;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.invoiceinfo.InvoiceMTPlatformInfoData;
import com.sankuai.waimai.foundation.utils.h;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.platform.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public final Activity b;
    public String c;
    public String d;
    public int e;
    public double f;
    public String g;
    public com.sankuai.waimai.bussiness.order.crossconfirm.block.invoiceinfo.c h;

    public b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "082e360c079559763453c3b59ebb4e0d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "082e360c079559763453c3b59ebb4e0d");
            return;
        }
        this.c = "";
        this.d = "";
        this.e = 0;
        this.f = 0.0d;
        this.g = "";
        this.b = activity;
    }

    public boolean a(Invoice invoice) {
        Object[] objArr = {invoice};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae06782cbaae7603d00bf610134af652", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae06782cbaae7603d00bf610134af652")).booleanValue() : (invoice == null || TextUtils.isEmpty(invoice.getTitle())) ? false : true;
    }

    public Invoice a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b2dc95c361a25593c129561814cf938", RobustBitConfig.DEFAULT_VALUE)) {
            return (Invoice) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b2dc95c361a25593c129561814cf938");
        }
        if (intent == null) {
            return null;
        }
        String a2 = f.a(intent, "resultData");
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        try {
            InvoiceMTPlatformInfoData invoiceMTPlatformInfoData = (InvoiceMTPlatformInfoData) k.a().fromJson(a2, (Class<Object>) InvoiceMTPlatformInfoData.class);
            if (invoiceMTPlatformInfoData != null && !TextUtils.isEmpty(invoiceMTPlatformInfoData.getTitle())) {
                return new Invoice(invoiceMTPlatformInfoData.getTitle(), invoiceMTPlatformInfoData.getCompanyTaxId(), invoiceMTPlatformInfoData.getType());
            }
            return null;
        } catch (Exception e) {
            com.dianping.judas.util.a.a(e);
            return null;
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42de190f06a208619f28a3cb8abb8f28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42de190f06a208619f28a3cb8abb8f28");
            return;
        }
        d.b(false, false, "invoice_title", str);
        this.c = str;
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97046af63fdab156a31050f399a6a274", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97046af63fdab156a31050f399a6a274");
            return;
        }
        d.b(false, false, "taxpayer_id_number", str);
        this.d = str;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9729878a614ed758c606b27a65d60958", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9729878a614ed758c606b27a65d60958");
            return;
        }
        d.b(false, false, "invoice_type", Integer.valueOf(i));
        this.e = i;
    }

    public final int a(com.sankuai.waimai.bussiness.order.crossconfirm.block.invoiceinfo.c cVar, double d) {
        Object[] objArr = {cVar, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8316cbd115cdb5c47d10a5e1139d16b8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8316cbd115cdb5c47d10a5e1139d16b8")).intValue();
        }
        if (cVar != null) {
            boolean a2 = cVar.a();
            double d2 = cVar.j;
            if (a2) {
                return h.e(Double.valueOf(d), Double.valueOf(d2)) ? 3 : 2;
            }
            return 1;
        }
        return 0;
    }
}
