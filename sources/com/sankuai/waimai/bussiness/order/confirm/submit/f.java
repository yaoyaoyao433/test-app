package com.sankuai.waimai.bussiness.order.confirm.submit;

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
public final class f extends c {
    public static ChangeQuickRedirect i;
    public b j;
    protected a k;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "365e4363990b01ca030191ef95d81998", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "365e4363990b01ca030191ef95d81998");
        } else {
            this.k = new a() { // from class: com.sankuai.waimai.bussiness.order.confirm.submit.f.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.bussiness.order.confirm.submit.a
                public final void a(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bfb72aed9cc1ae9f1dafcbff70971dc1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bfb72aed9cc1ae9f1dafcbff70971dc1");
                    } else if (f.this.b.isFinishing()) {
                    } else {
                        f.this.b();
                        com.sankuai.waimai.platform.capacity.network.errorhanding.b.a(f.this.b, th);
                        if (f.this.j != null) {
                            f.this.j.a();
                        }
                    }
                }

                @Override // com.sankuai.waimai.bussiness.order.confirm.submit.a
                public final void a(BaseResponse baseResponse) {
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "63ce790d8574e3d314cbced44c599067", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "63ce790d8574e3d314cbced44c599067");
                        return;
                    }
                    f.this.b();
                    if (f.this.b.isFinishing()) {
                        return;
                    }
                    if (f.this.j != null) {
                        f.this.j.a();
                    }
                    if (baseResponse == null) {
                        m.a(f.this.b, f.this.b.getString(R.string.wm_order_confirm_submit_error), (Throwable) new com.sankuai.waimai.platform.widget.emptylayout.a("B_-2", "/order/submit"));
                        return;
                    }
                    try {
                        f.a(f.this, baseResponse);
                        com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) f.this.b, "cash_coupon_code", (String) null);
                    } catch (JSONException e) {
                        com.sankuai.waimai.foundation.utils.log.a.a(e);
                        m.a(f.this.b, f.this.b.getString(R.string.wm_order_confirm_submit_error), (Throwable) e);
                    }
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:215:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:225:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.sankuai.waimai.bussiness.order.confirm.submit.f r18, final com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse r19) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.confirm.submit.f.a(com.sankuai.waimai.bussiness.order.confirm.submit.f, com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse):void");
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.submit.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "649037e98fd524fd91c2a4e0bc7603a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "649037e98fd524fd91c2a4e0bc7603a4");
            return;
        }
        a(this.k);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "575f92aa43f91c085a6321fb1de1179a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "575f92aa43f91c085a6321fb1de1179a")).booleanValue();
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
                    arrayList = (List) new Gson().fromJson(optJSONArray.toString(), new TypeToken<List<UnAvailableFood>>() { // from class: com.sankuai.waimai.bussiness.order.confirm.submit.f.5
                    }.getType());
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("availableFoodList");
                List arrayList2 = new ArrayList();
                if (optJSONArray2 != null) {
                    arrayList2 = (List) new Gson().fromJson(optJSONArray2.toString(), new TypeToken<List<OrderFoodOutput>>() { // from class: com.sankuai.waimai.bussiness.order.confirm.submit.f.6
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f95f0bdc00bb7a9e3bfce80688526f72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f95f0bdc00bb7a9e3bfce80688526f72");
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
        com.sankuai.waimai.business.order.submit.b.a(this.b, this.g, this.h, r0, baseResponse.msg, baseResponse.code, str, false, false, false);
    }
}
