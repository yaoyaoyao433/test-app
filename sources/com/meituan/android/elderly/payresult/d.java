package com.meituan.android.elderly.payresult;

import android.app.Activity;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cashier.activity.MTCashierActivity;
import com.meituan.android.cashier.common.i;
import com.meituan.android.common.sniffer.annotation.SnifferThrow;
import com.meituan.android.elderly.retrofit.CashierRequestService;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d implements com.meituan.android.paybase.retrofit.b {
    public static ChangeQuickRedirect a;
    public i b;
    public PayBaseActivity c;
    public String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;

    public d(i iVar, PayBaseActivity payBaseActivity, String str, String str2, String str3, String str4) {
        Object[] objArr = {iVar, payBaseActivity, str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b01eb2ae6361c24585b03f6633f7484", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b01eb2ae6361c24585b03f6633f7484");
            return;
        }
        this.b = iVar;
        this.c = payBaseActivity;
        this.f = str;
        this.i = str2;
        this.g = str3;
        this.h = str4;
    }

    public final void a(String str, HashMap<String, String> hashMap) {
        Object[] objArr = {str, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d1dc806a214433a9a14e38b74ebe629", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d1dc806a214433a9a14e38b74ebe629");
            return;
        }
        this.e = str;
        ((CashierRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(CashierRequestService.class, this, 87)).queryOrder(this.f, this.i, "1", this.g, b(), hashMap);
    }

    private String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "846c851eb0a1b8e7f05813646216d1ba", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "846c851eb0a1b8e7f05813646216d1ba");
        }
        if (TextUtils.isEmpty(this.h)) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("outer_business_statics", this.h);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "ThirdPayResultHandler_getExtDimStat", (Map<String, Object>) null);
        }
        return jSONObject.toString();
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestSucc(int i, Object obj) {
        boolean z;
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10b2ab1285323aae4c1fd64cd7227780", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10b2ab1285323aae4c1fd64cd7227780");
            return;
        }
        if (obj != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "001448683a789e4f531268d3b27754d8", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "001448683a789e4f531268d3b27754d8")).booleanValue();
            } else {
                z = this.c.isFinishing() || this.c.m();
            }
            if (!z) {
                com.meituan.android.paybase.common.analyse.a.a("b_ruzoirdm", new a.c().a(KnbConstants.PARAMS_SCENE, this.e).b);
                if (((Boolean) ((HashMap) obj).get("result")).booleanValue()) {
                    PayBaseActivity payBaseActivity = this.c;
                    Object[] objArr3 = {this};
                    ChangeQuickRedirect changeQuickRedirect3 = f.a;
                    com.meituan.android.paybase.utils.f.a(payBaseActivity, PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "c03a1a4599c7b92df72c22bb912356a8", RobustBitConfig.DEFAULT_VALUE) ? (f.InterfaceC0337f) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "c03a1a4599c7b92df72c22bb912356a8") : new f(this));
                    return;
                }
                if (!TextUtils.isEmpty(this.d)) {
                    com.meituan.android.paybase.dialog.e.a((Activity) this.c, (Object) this.d, true);
                }
                com.meituan.android.paybase.common.analyse.a.a("b_j64z0cpq", (Map<String, Object>) null);
                com.meituan.android.paybase.common.analyse.a.a("MTCashierActivity", "onPayFail", "failMsg:" + this.d, "");
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_pay_cashier", -9753);
                if (this.c == null || !(this.c instanceof MTCashierActivity)) {
                    return;
                }
                ((MTCashierActivity) this.c).d = false;
                return;
            }
        }
        if (obj == null) {
            a.c a2 = new a.c().a(KnbConstants.PARAMS_SCENE, "o == null");
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            com.meituan.android.paybase.common.analyse.a.a("b_pay_pfjic30w_mv", a2.a("tag", sb.toString()).b);
            return;
        }
        a.c a3 = new a.c().a(KnbConstants.PARAMS_SCENE, "isDestroyed");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i);
        com.meituan.android.paybase.common.analyse.a.a("b_pay_pfjic30w_mv", a3.a("tag", sb2.toString()).b);
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50e63ae36a1b2c1aa830519e838ef6ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50e63ae36a1b2c1aa830519e838ef6ab");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_v3zwwi9x_mv", (Map<String, Object>) null);
        if (this.c == null || !(this.c instanceof MTCashierActivity)) {
            return;
        }
        ((MTCashierActivity) this.c).d = false;
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestFinal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cee790c5d770cd143f736227c0084ece", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cee790c5d770cd143f736227c0084ece");
        } else {
            this.c.hideProgress();
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestStart(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48c1ebf20ccb2cba1aa6126c6578497c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48c1ebf20ccb2cba1aa6126c6578497c");
        } else {
            this.c.a(true, PayBaseActivity.a.CASHIER, (String) null);
        }
    }

    @SnifferThrow(describe = "other pay fail", module = "meituan_payment_cashier_other_fail")
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "854741ca0df7a3adf85c3e3912405687", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "854741ca0df7a3adf85c3e3912405687");
        } else {
            com.meituan.android.paybase.common.analyse.a.a((Map<String, Object>) new a.c().a("meituan_payment_cashier_fail", "meituan_payment_cashier_other_fail").b);
        }
    }
}
