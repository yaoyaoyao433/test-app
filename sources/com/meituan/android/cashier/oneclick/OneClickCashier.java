package com.meituan.android.cashier.oneclick;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.android.cashier.activity.MTCashierActivity;
import com.meituan.android.cashier.bean.CashierParams;
import com.meituan.android.cashier.common.ICashier;
import com.meituan.android.cashier.common.i;
import com.meituan.android.cashier.common.q;
import com.meituan.android.cashier.common.u;
import com.meituan.android.cashier.oneclick.fragment.MTCOneClickPayFragment;
import com.meituan.android.cashier.oneclick.util.a;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.dialog.e;
import com.meituan.android.paybase.retrofit.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OneClickCashier extends u {
    public static ChangeQuickRedirect a;
    private Uri b;
    private String c;
    private String d;
    private String e;
    private String f;
    private HashMap<String, String> g;
    private String h;
    private FragmentActivity i;
    private i j;
    private final int k;
    private MTCOneClickPayFragment l;

    @Override // com.meituan.android.cashier.common.h
    public final void a(int i, int i2, Intent intent) {
    }

    @Override // com.meituan.android.cashier.common.h
    public final void a(Bundle bundle) {
    }

    @Override // com.meituan.android.cashier.common.h
    public final void b(Bundle bundle) {
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.v
    public final void b(boolean z) {
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.h
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3465e6c49150e0b900698ff428eebe4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3465e6c49150e0b900698ff428eebe4");
        }
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.h
    public final boolean h() {
        return true;
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.ICashier
    public final String i() {
        return "oneclickpay";
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.paybase.retrofit.b
    public void onRequestException(int i, Exception exc) {
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.paybase.retrofit.b
    public void onRequestFinal(int i) {
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.paybase.retrofit.b
    public void onRequestStart(int i) {
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.paybase.retrofit.b
    public void onRequestSucc(int i, Object obj) {
    }

    public OneClickCashier() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f5850e8699c0b390140a7c4974f6a9e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f5850e8699c0b390140a7c4974f6a9e");
        } else {
            this.k = R.id.content;
        }
    }

    @Override // com.meituan.android.cashier.common.ICashier
    public final <T extends FragmentActivity & i & b> ICashier.a a(T t, CashierParams cashierParams) {
        Object[] objArr = {t, cashierParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb9b6a8f93ea0e4da92c54476b82b74b", RobustBitConfig.DEFAULT_VALUE)) {
            return (ICashier.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb9b6a8f93ea0e4da92c54476b82b74b");
        }
        this.b = cashierParams.getUri();
        this.c = cashierParams.getTradeNo();
        this.d = cashierParams.getPayToken();
        this.e = cashierParams.getExtraData();
        this.f = cashierParams.getExtraStatics();
        this.h = cashierParams.getCallbackUrl();
        this.g = cashierParams.getExtendTransmissionParams();
        this.i = t;
        this.j = t;
        String productType = cashierParams.getProductType();
        Object[] objArr2 = {productType};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return new ICashier.a(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "37b43ab1e6a0e574e1309df499dcc690", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "37b43ab1e6a0e574e1309df499dcc690")).booleanValue() : TextUtils.equals("oneclickpay", productType));
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b5dec20117335846d2daee6d0bbc2c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b5dec20117335846d2daee6d0bbc2c7");
            return;
        }
        e.a((Activity) this.i, (Object) this.i.getString(R.string.cashieroneclick__empty_param));
        ((MTCashierActivity) this.i).a(this.b, "extraData empty");
        this.i.finish();
    }

    @Override // com.meituan.android.cashier.common.u
    public final void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e712ad6c41a81d61e3a61da953041a9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e712ad6c41a81d61e3a61da953041a9e");
            return;
        }
        a.a("result_extra_error_level", "b_pay_oneclick_pay_start_sc", (Map<String, Object>) null);
        q.a("oneclick_pay_start", this.p);
        this.j.e("oneclickpay_cashier");
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7745597c8866121848c387f6fd644fd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7745597c8866121848c387f6fd644fd8");
        } else {
            HashMap hashMap = new HashMap(1);
            hashMap.put("uri:", this.b != null ? this.b.toString() : "");
            q.b("b_pay_xs1f26hf_mv", hashMap, this.p);
        }
        com.meituan.android.cashier.oneclick.util.b.a("");
        if (!((MTCashierActivity) this.i).a(true)) {
            com.meituan.android.cashier.oneclick.util.b.e(1100001);
            this.j.b("1100001", "tradeNo or token is null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.e);
            String optString = jSONObject.optString("serialCode");
            String optString2 = jSONObject.optString("open_oneclickpay");
            if (!TextUtils.isEmpty(optString) && !StringUtil.NULL.equalsIgnoreCase(optString)) {
                if (TextUtils.isEmpty(optString2) || StringUtil.NULL.equalsIgnoreCase(optString2)) {
                    a();
                    this.j.b("1100005", "OneClickCashier invalidOneClickParam");
                    com.meituan.android.cashier.oneclick.util.b.e(1100005);
                    return;
                }
                ((MTCashierActivity) this.i).u_();
                FragmentActivity fragmentActivity = this.i;
                int i = this.k;
                Object[] objArr3 = {fragmentActivity, Integer.valueOf(i), "content"};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ea1ce4479a2643a12cd3952bc7585a05", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ea1ce4479a2643a12cd3952bc7585a05");
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("trade_number", this.c);
                bundle.putString("pay_token", this.d);
                bundle.putString("callback_url", this.h);
                bundle.putString("extra_data", this.e);
                bundle.putString("extra_statics", this.f);
                bundle.putSerializable("extend_transmission_params", this.g);
                this.l = new MTCOneClickPayFragment();
                this.l.setArguments(bundle);
                fragmentActivity.getSupportFragmentManager().beginTransaction().replace(i, this.l, "content").commitAllowingStateLoss();
                return;
            }
            a();
            this.j.b("1100004", "OneClickCashier invalidOneClickParam");
            com.meituan.android.cashier.oneclick.util.b.e(1100004);
        } catch (Exception e) {
            this.j.b("1100003", "OneClickCashier start");
            com.meituan.android.cashier.oneclick.util.b.e(1100003);
            com.meituan.android.paybase.common.analyse.a.a(e, "MTCashierActivity_onCreate", (Map<String, Object>) null);
            e.a((Activity) this.i, (Object) this.i.getString(R.string.cashieroneclick__empty_param));
            ((MTCashierActivity) this.i).a(this.b, "extraData error");
            this.i.finish();
        }
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.h
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c55a57557700772fa4032ffaa52663d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c55a57557700772fa4032ffaa52663d");
        } else if (!z || this.l == null || this.i == null) {
        } else {
            this.i.getSupportFragmentManager().beginTransaction().remove(this.l).commitAllowingStateLoss();
        }
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.ICashier
    public final PayBaseActivity.a a(int i) {
        return PayBaseActivity.a.CASHIER;
    }
}
