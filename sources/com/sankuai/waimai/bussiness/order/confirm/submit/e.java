package com.sankuai.waimai.bussiness.order.confirm.submit;

import android.content.Context;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.utils.m;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends c {
    public static ChangeQuickRedirect i;
    public boolean j;
    public boolean k;
    public b l;
    private a m;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eac9fb902d2dcdab52751ef5deb638ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eac9fb902d2dcdab52751ef5deb638ec");
            return;
        }
        this.j = false;
        this.m = new a() { // from class: com.sankuai.waimai.bussiness.order.confirm.submit.e.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.confirm.submit.a
            public final void a(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fa0ef7ff368cf40bf6f13caba5bc982c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fa0ef7ff368cf40bf6f13caba5bc982c");
                } else if (e.this.b.isFinishing()) {
                } else {
                    e.this.b();
                    com.sankuai.waimai.platform.capacity.network.errorhanding.b.a(e.this.b, th);
                    if (e.this.l != null) {
                        e.this.l.a();
                    }
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.submit.a
            public final void a(BaseResponse baseResponse) {
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6c12aa6fbd4b6c7023506465e92d1865", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6c12aa6fbd4b6c7023506465e92d1865");
                    return;
                }
                e.this.b();
                if (e.this.b.isFinishing()) {
                    return;
                }
                if (e.this.l != null) {
                    e.this.l.a();
                }
                if (baseResponse == null) {
                    m.a(e.this.b, e.this.b.getString(R.string.wm_order_confirm_submit_error), (Throwable) new com.sankuai.waimai.platform.widget.emptylayout.a("B_-2", "/order/submit"));
                    return;
                }
                try {
                    e.a(e.this, baseResponse);
                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) e.this.b, "cash_coupon_code", (String) null);
                } catch (JSONException e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                    m.a(e.this.b, e.this.b.getString(R.string.wm_order_confirm_submit_error), (Throwable) e);
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:302:0x08a0  */
    /* JADX WARN: Removed duplicated region for block: B:312:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.sankuai.waimai.bussiness.order.confirm.submit.e r22, final com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse r23) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 2284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.confirm.submit.e.a(com.sankuai.waimai.bussiness.order.confirm.submit.e, com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse):void");
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.submit.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c677cca994dfc6dd1d0108ab3ca7717", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c677cca994dfc6dd1d0108ab3ca7717");
            return;
        }
        a(this.m);
        b();
        if (this.d == null || this.c == null) {
            return;
        }
        this.f = com.sankuai.waimai.platform.widget.dialog.a.a(this.b);
        this.d.a(this.c, this.e);
    }
}
