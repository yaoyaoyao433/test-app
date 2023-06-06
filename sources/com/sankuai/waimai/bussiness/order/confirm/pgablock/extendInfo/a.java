package com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo;

import android.support.annotation.NonNull;
import com.dianping.titans.utils.StorageUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.submit.model.FieldInfo;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.tablewareinfo.d;
import com.sankuai.waimai.foundation.utils.aa;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.viewmodel.a<Map<String, Object>> {
    public static ChangeQuickRedirect o;
    public ExtendInfoModel p;
    @NonNull
    private com.sankuai.waimai.bussiness.order.crossconfirm.block.remarkinfo.c q;
    @NonNull
    private com.sankuai.waimai.bussiness.order.crossconfirm.block.invoiceinfo.c r;
    private d s;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "016a6612850ed2374c78d9ff1d8d8985", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "016a6612850ed2374c78d9ff1d8d8985");
            return;
        }
        this.q = new com.sankuai.waimai.bussiness.order.crossconfirm.block.remarkinfo.c();
        this.r = new com.sankuai.waimai.bussiness.order.crossconfirm.block.invoiceinfo.c();
        this.s = new d();
    }

    public final void b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4012ce613c35162cc5971b8112c338de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4012ce613c35162cc5971b8112c338de");
            return;
        }
        this.c = map;
        if (this.c != 0) {
            try {
                this.p = (ExtendInfoModel) com.sankuai.waimai.mach.utils.b.a().fromJson(com.sankuai.waimai.mach.utils.b.a().toJson(this.c), (Class<Object>) ExtendInfoModel.class);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c600c96b3a01e6314a0a5aa52025fc83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c600c96b3a01e6314a0a5aa52025fc83");
            return;
        }
        super.d();
        if (this.c != 0) {
            this.p = (ExtendInfoModel) com.sankuai.waimai.mach.utils.b.a().fromJson(com.sankuai.waimai.mach.utils.b.a().toJson(this.c), (Class<Object>) ExtendInfoModel.class);
        }
    }

    public final d n() {
        this.s.a = false;
        if (this.c != 0) {
            this.s.g = this.p.dinersOptionList;
            this.s.i = this.p.tablewareAdvocateTip;
            this.s.h = this.p.tablewareTip;
            this.s.f = this.p.tablewareSettingsInfo;
        } else {
            this.s.g = null;
            this.s.i = null;
            this.s.h = null;
            this.s.f = null;
        }
        return this.s;
    }

    @NonNull
    public final com.sankuai.waimai.bussiness.order.crossconfirm.block.remarkinfo.c a(long j, String str) {
        String p;
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef9fa21825946ca448b6350e99a5904a", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.bussiness.order.crossconfirm.block.remarkinfo.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef9fa21825946ca448b6350e99a5904a");
        }
        this.q.a = false;
        this.q.b = j;
        this.q.c = str;
        com.sankuai.waimai.bussiness.order.crossconfirm.block.remarkinfo.c cVar = this.q;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = o;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f7132849a82b774aab038d1f1eb0b92f", RobustBitConfig.DEFAULT_VALUE)) {
            p = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f7132849a82b774aab038d1f1eb0b92f");
        } else {
            p = p();
            if (aa.a(p)) {
                p = com.sankuai.waimai.bussiness.order.confirm.cache.a.a().a(str);
            }
        }
        cVar.h = p;
        if (this.c != 0) {
            this.q.f = this.p.remark_field;
        } else {
            this.q.f = new FieldInfo();
        }
        return this.q;
    }

    @NonNull
    public final com.sankuai.waimai.bussiness.order.crossconfirm.block.invoiceinfo.c o() {
        this.r.d = false;
        if (this.c != 0) {
            this.r.g = this.p.has_invoice;
            this.r.h = this.p.invoice_support;
            this.r.f = this.p.invoice_text;
            this.r.j = this.p.min_invoice_price;
            this.r.e = this.p.invoice_show;
            this.r.l = this.p.invoice_type;
            this.r.m = this.p.taxpayer_id_number;
            this.r.n = this.p.invoice_title;
            this.r.o = this.p.invoice_link;
            this.r.p = this.p.invoice_make_type;
        } else {
            this.r.g = 0;
            this.r.h = 0;
            this.r.f = "";
            this.r.j = 0.0d;
            this.r.e = false;
            this.r.l = -1;
            this.r.m = "";
            this.r.n = "";
            this.r.o = "";
            this.r.p = 0;
        }
        return this.r;
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final Boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5c68279cfde14a5011c1764519e8b62", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5c68279cfde14a5011c1764519e8b62");
        }
        return Boolean.valueOf(this.c != 0);
    }

    private String p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdb6c04975761e6b2ed506fe74fc841a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdb6c04975761e6b2ed506fe74fc841a");
        }
        String sharedValue = StorageUtil.getSharedValue(com.meituan.android.singleton.b.a, "netbar_address_info");
        if (aa.a(sharedValue)) {
            return null;
        }
        try {
            return new JSONObject(sharedValue).optString("remark");
        } catch (JSONException unused) {
            return null;
        }
    }
}
