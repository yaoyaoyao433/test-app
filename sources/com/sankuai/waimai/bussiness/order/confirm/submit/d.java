package com.sankuai.waimai.bussiness.order.confirm.submit;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.R;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.OrderFoodOutput;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.UnAvailableFood;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.utils.m;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends c {
    public static ChangeQuickRedirect i;
    public boolean j;
    public boolean k;
    public boolean l;
    public b m;
    private a n;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af21fd3d4be2c4f71197704a55b5c56e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af21fd3d4be2c4f71197704a55b5c56e");
            return;
        }
        this.j = false;
        this.n = new a() { // from class: com.sankuai.waimai.bussiness.order.confirm.submit.d.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.confirm.submit.a
            public final void a(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6a84364be3cc32dbf4a9c33f8d55d5ac", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6a84364be3cc32dbf4a9c33f8d55d5ac");
                } else if (d.this.b.isFinishing()) {
                } else {
                    d.this.b();
                    com.sankuai.waimai.platform.capacity.network.errorhanding.b.a(d.this.b, th);
                    if (d.this.m != null) {
                        d.this.m.a();
                    }
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.confirm.submit.a
            public final void a(BaseResponse baseResponse) {
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de1280aee73d338fd4ac7629e1f33fa4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de1280aee73d338fd4ac7629e1f33fa4");
                    return;
                }
                d.this.b();
                if (d.this.b.isFinishing()) {
                    return;
                }
                if (d.this.m != null) {
                    d.this.m.a();
                }
                if (baseResponse == null) {
                    m.a(d.this.b, d.this.b.getString(R.string.wm_order_confirm_submit_error), (Throwable) new com.sankuai.waimai.platform.widget.emptylayout.a("B_-2", "/order/submit"));
                    return;
                }
                try {
                    d.a(d.this, baseResponse);
                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) d.this.b, "cash_coupon_code", (String) null);
                } catch (JSONException e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                    m.a(d.this.b, d.this.b.getString(R.string.wm_order_confirm_submit_error), (Throwable) e);
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:415:0x0b63  */
    /* JADX WARN: Removed duplicated region for block: B:425:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.sankuai.waimai.bussiness.order.confirm.submit.d r23, final com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse r24) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 3037
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.confirm.submit.d.a(com.sankuai.waimai.bussiness.order.confirm.submit.d, com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse):void");
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.submit.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9d81e5a3b4721729451a52bcfb2f841", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9d81e5a3b4721729451a52bcfb2f841");
            return;
        }
        a(this.n);
        b();
        if (this.d == null || this.c == null) {
            return;
        }
        this.f = com.sankuai.waimai.platform.widget.dialog.a.a(this.b);
        this.d.a(this.c, this.e);
    }

    private boolean a(BaseResponse baseResponse) {
        Object[] objArr = {baseResponse};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e6d75470291b8727b331ea0e1eadbe6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e6d75470291b8727b331ea0e1eadbe6")).booleanValue();
        }
        if (baseResponse.code != 71) {
            return false;
        }
        try {
            JSONObject jSONObject = (JSONObject) baseResponse.data;
            if (jSONObject != null) {
                JSONArray optJSONArray = jSONObject.optJSONArray("unAvailableFoodList");
                List arrayList = new ArrayList();
                if (optJSONArray != null) {
                    arrayList = (List) new Gson().fromJson(optJSONArray.toString(), new TypeToken<List<UnAvailableFood>>() { // from class: com.sankuai.waimai.bussiness.order.confirm.submit.d.12
                    }.getType());
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("availableFoodList");
                List arrayList2 = new ArrayList();
                if (optJSONArray2 != null) {
                    arrayList2 = (List) new Gson().fromJson(optJSONArray2.toString(), new TypeToken<List<OrderFoodOutput>>() { // from class: com.sankuai.waimai.bussiness.order.confirm.submit.d.14
                    }.getType());
                }
                com.sankuai.waimai.business.order.submit.b.a(this.b, (JsonObject) new JsonParser().parse(jSONObject.toString()), arrayList, arrayList2, this.h);
            }
        } catch (Exception unused) {
        }
        return true;
    }

    private void a(BaseResponse baseResponse, String str) {
        Object[] objArr = {baseResponse, str};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55398358ab8e145bd0df075fc8b40aca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55398358ab8e145bd0df075fc8b40aca");
            return;
        }
        try {
            JSONObject jSONObject = (JSONObject) baseResponse.data;
            r0 = jSONObject != null ? com.sankuai.waimai.platform.domain.core.order.a.a(jSONObject.optJSONArray("missingfoods")) : null;
            String optString = jSONObject.optString("schema");
            if (baseResponse.code == 66 && !aa.a(optString)) {
                com.sankuai.waimai.foundation.router.a.a(this.b, optString);
                return;
            }
        } catch (Exception unused) {
        }
        com.sankuai.waimai.business.order.submit.b.a(this.b, this.g, this.h, r0, baseResponse.msg, baseResponse.code, str, this.k, this.l, this.j);
    }

    private boolean b(BaseResponse baseResponse) {
        Object[] objArr = {baseResponse};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f05012918ec0077a85e4e5fde80d428", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f05012918ec0077a85e4e5fde80d428")).booleanValue();
        }
        if (baseResponse.code != 17) {
            return false;
        }
        List<com.sankuai.waimai.platform.domain.core.order.a> list = null;
        try {
            JSONObject jSONObject = (JSONObject) baseResponse.data;
            if (jSONObject != null) {
                list = com.sankuai.waimai.platform.domain.core.order.a.a(jSONObject.optJSONArray("missingfoods"));
            }
        } catch (Exception unused) {
        }
        com.sankuai.waimai.business.order.submit.b.a(this.b, this.g, this.h, list, baseResponse.msg, baseResponse.code, this.b.getString(R.string.wm_order_base_out_of_stock), this.k, this.l, this.j);
        return true;
    }

    private boolean c(BaseResponse baseResponse) {
        JSONObject jSONObject;
        Object[] objArr = {baseResponse};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d06f861a73da26d3e2369a167e449b4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d06f861a73da26d3e2369a167e449b4")).booleanValue();
        }
        if (baseResponse.code != 64) {
            return false;
        }
        try {
            jSONObject = (JSONObject) baseResponse.data;
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            jSONObject = null;
        }
        if (jSONObject != null) {
            Activity activity = this.b;
            Object[] objArr2 = {activity, jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.order.submit.b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e2dfc7edbbe10dc8f900bdee24959988", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e2dfc7edbbe10dc8f900bdee24959988");
            } else {
                String str = com.sankuai.waimai.foundation.router.interfaces.b.c;
                if (com.sankuai.waimai.foundation.core.a.e()) {
                    str = "imeituan://www.meituan.com";
                } else if (com.sankuai.waimai.foundation.core.a.f()) {
                    str = "dianping://waimai.dianping.com";
                }
                com.sankuai.waimai.foundation.router.a.a(activity, str + "/machalertview?cid=c_ykhs39e&template_id=supermarket_order_order_stock_change_alert_style_1&data=" + jSONObject.toString());
            }
            return true;
        }
        return false;
    }
}
