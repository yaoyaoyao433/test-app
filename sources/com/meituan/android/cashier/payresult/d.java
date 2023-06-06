package com.meituan.android.cashier.payresult;

import android.app.Activity;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cashier.NativeStandardCashierAdapter;
import com.meituan.android.cashier.activity.MTCashierActivity;
import com.meituan.android.cashier.common.ICashier;
import com.meituan.android.cashier.common.i;
import com.meituan.android.cashier.model.bean.OrderResult;
import com.meituan.android.cashier.retrofit.CashierRequestService;
import com.meituan.android.common.sniffer.annotation.SnifferThrow;
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
    public ICashier d;
    public String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;

    public d(i iVar, PayBaseActivity payBaseActivity, String str, String str2, String str3, String str4) {
        Object[] objArr = {iVar, payBaseActivity, str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f70ebdeb6044dde05f1425d1018102b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f70ebdeb6044dde05f1425d1018102b");
            return;
        }
        this.b = iVar;
        this.c = payBaseActivity;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = str4;
    }

    public final void a(String str, HashMap<String, String> hashMap) {
        Object[] objArr = {str, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb7f8d263500e0a0c0afb833b49b23e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb7f8d263500e0a0c0afb833b49b23e5");
            return;
        }
        this.f = str;
        ((CashierRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(CashierRequestService.class, this, 87)).queryOrder(this.g, this.h, "1", this.i, b(), hashMap);
    }

    private String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f750a65eebfa60bd1961c340d15045de", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f750a65eebfa60bd1961c340d15045de");
        }
        if (TextUtils.isEmpty(this.j)) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("outer_business_statics", this.j);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6e7451b106316c8d4fcc18bbe400b94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6e7451b106316c8d4fcc18bbe400b94");
            return;
        }
        if (obj != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c4f612a683408eba6bc5bb18b396050b", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c4f612a683408eba6bc5bb18b396050b")).booleanValue();
            } else {
                z = this.c.isFinishing() || this.c.m();
            }
            if (!z) {
                com.meituan.android.paybase.common.analyse.a.a("b_ruzoirdm", new a.c().a(KnbConstants.PARAMS_SCENE, this.f).b);
                if (((OrderResult) obj).isResult()) {
                    PayBaseActivity payBaseActivity = this.c;
                    Object[] objArr3 = {this};
                    ChangeQuickRedirect changeQuickRedirect3 = f.a;
                    com.meituan.android.paybase.utils.f.a(payBaseActivity, PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "4290932694dd97b430824a5f954bb12c", RobustBitConfig.DEFAULT_VALUE) ? (f.InterfaceC0337f) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "4290932694dd97b430824a5f954bb12c") : new f(this));
                    return;
                }
                if (!TextUtils.isEmpty(this.e)) {
                    com.meituan.android.paybase.dialog.e.a((Activity) this.c, (Object) this.e, true);
                }
                com.meituan.android.paybase.common.analyse.a.a("b_j64z0cpq", (Map<String, Object>) null);
                com.meituan.android.paybase.common.analyse.a.a("MTCashierActivity", "onPayFail", "failMsg:" + this.e, "");
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_pay_cashier", -9753);
                if (this.d != null && (this.d instanceof NativeStandardCashierAdapter)) {
                    ((NativeStandardCashierAdapter) this.d).a();
                }
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd9b107ef7e587bf79b12fa5838a1c58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd9b107ef7e587bf79b12fa5838a1c58");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf21dd47011f3b87cc07d9011751db75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf21dd47011f3b87cc07d9011751db75");
        } else {
            this.c.hideProgress();
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestStart(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34ac51e28e9b149786e191929be63962", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34ac51e28e9b149786e191929be63962");
        } else {
            this.c.a(true, PayBaseActivity.a.CASHIER, (String) null);
        }
    }

    @SnifferThrow(describe = "other pay fail", module = "meituan_payment_cashier_other_fail")
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bfc61f9d7508b3ff67a0d2451f04da9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bfc61f9d7508b3ff67a0d2451f04da9");
        } else {
            com.meituan.android.paybase.common.analyse.a.a((Map<String, Object>) new a.c().a("meituan_payment_cashier_fail", "meituan_payment_cashier_other_fail").b);
        }
    }
}
