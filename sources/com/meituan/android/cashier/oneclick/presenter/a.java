package com.meituan.android.cashier.oneclick.presenter;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cashier.common.q;
import com.meituan.android.cashier.oneclick.model.bean.OpenOneClickPay;
import com.meituan.android.cashier.oneclick.retrofit.OneClickRequestService;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.retrofit.b;
import com.meituan.android.paybase.utils.MTPayNeedToPersist;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.i;
import com.meituan.android.paybase.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a implements b {
    public static ChangeQuickRedirect a;
    private static volatile a m;
    @MTPayNeedToPersist
    public String b;
    @MTPayNeedToPersist
    public String c;
    public String d;
    public int e;
    public String f;
    public HashMap<String, String> g;
    public String h;
    private String i;
    private WeakReference<com.meituan.android.cashier.oneclick.callback.a> j;
    private WeakReference<Activity> k;
    private String l;

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestFinal(int i) {
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestStart(int i) {
    }

    public final a a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6245124d747650b5aef7cddedd63a7e", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6245124d747650b5aef7cddedd63a7e");
        }
        this.k = new WeakReference<>(activity);
        return this;
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0ae851c21e5e3c8b247290b2c1121e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0ae851c21e5e3c8b247290b2c1121e3");
        }
        if (m == null) {
            synchronized (a.class) {
                if (m == null) {
                    m = new a();
                }
            }
        }
        return m;
    }

    private String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4462de2c6731f29e3b68f7ae398bd932", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4462de2c6731f29e3b68f7ae398bd932");
        }
        if (this.k == null) {
            return "";
        }
        Activity activity = this.k.get();
        if (activity instanceof PayBaseActivity) {
            PayBaseActivity payBaseActivity = (PayBaseActivity) activity;
            return !TextUtils.isEmpty(payBaseActivity.p()) ? payBaseActivity.p() : "";
        }
        return "";
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7676bf754cc8bed509fb10f6ab61ac96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7676bf754cc8bed509fb10f6ab61ac96");
            return;
        }
        if (this.j != null) {
            this.j.clear();
        }
        if (this.k != null) {
            this.k.clear();
        }
        this.b = null;
        this.i = null;
        this.d = null;
        this.c = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public final void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70afd4b1b056e246790e276da4dcadbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70afd4b1b056e246790e276da4dcadbd");
            return;
        }
        try {
            this.l = jSONObject.getString("url");
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put(KnbConstants.PARAMS_SCENE, "4");
            hashMap.put("mtPlanId", d());
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            hashMap.put("openType", PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "757ac72be00e9391c601b01edeaf8d91", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "757ac72be00e9391c601b01edeaf8d91") : "1");
            hashMap.put("creditPayUtmSource", this.d);
            hashMap.put("serialCode", this.c);
            hashMap.put("nb_fingerprint", com.meituan.android.paycommon.lib.config.a.a().o());
            hashMap.put("outer_business_data", this.f);
            hashMap.put("ext_dim_stat", e());
            JSONObject optJSONObject = jSONObject.optJSONObject("requestData");
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, optJSONObject.get(next).toString());
            }
            com.meituan.android.cashier.oneclick.util.a.a(this.l, "b_pay_oneclickpay_open_start_sc", new a.c().a("path", this.l).b);
            q.a("oneclickpay_open_start", b());
            if (!i.a(this.g)) {
                hashMap.putAll(this.g);
            }
            ((OneClickRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(OneClickRequestService.class, this, 11)).openAndAdjustOneClickPay(this.l, hashMap, 8000L);
        } catch (JSONException e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "OneClickOpenNeoPresenter_openAndAdjustOneClickPayType", (Map<String, Object>) null);
            a(1000, "js桥数据错误");
        }
    }

    public final void b(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c8c13342cf325254f367f0c60deb196", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c8c13342cf325254f367f0c60deb196");
            return;
        }
        try {
            this.l = jSONObject.getString("url");
            HashMap<String, String> hashMap = new HashMap<>();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            hashMap.put("token", PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b4bb4a844583f86eb3bb7326e83dbbb6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b4bb4a844583f86eb3bb7326e83dbbb6") : com.meituan.android.paycommon.lib.config.a.a().q());
            hashMap.put("mtPlanId", d());
            hashMap.put("creditPayUtmSource", this.d);
            hashMap.put("outer_business_data", this.f);
            hashMap.put("ext_dim_stat", e());
            JSONObject optJSONObject = jSONObject.optJSONObject("requestData");
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, optJSONObject.get(next).toString());
            }
            com.meituan.android.cashier.oneclick.util.a.a(this.l, "b_pay_oneclickpay_deductordersave_start_sc", new a.c().a("path", this.l).b);
            q.a("oneclickpay_deductordersave_start", b());
            if (!i.a(this.g)) {
                hashMap.putAll(this.g);
            }
            ((OneClickRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(OneClickRequestService.class, this, 10)).adjustOneClickPay(this.l, hashMap, 8000L);
        } catch (JSONException e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "OneClickOpenNeoPresenter_adjustOneClickPayTypeList", (Map<String, Object>) null);
            a(1000, "js桥数据错误");
        }
    }

    public final void c(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b641abb7f30f8f59545403257fc7816", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b641abb7f30f8f59545403257fc7816");
            return;
        }
        a((String) null);
        a(1000, (OpenOneClickPay) null, "用户取消扣款顺序");
    }

    public final void d(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "230bd4a13de90e1951cbf036350690b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "230bd4a13de90e1951cbf036350690b7");
            return;
        }
        a((String) null);
        a(3000, (OpenOneClickPay) null, (String) null);
    }

    private void a(int i, OpenOneClickPay openOneClickPay, String str) {
        Activity activity;
        Object[] objArr = {Integer.valueOf(i), openOneClickPay, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a6f9f4ee05553891e2bb6f93d24e5fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a6f9f4ee05553891e2bb6f93d24e5fe");
        } else if (this.k == null || (activity = this.k.get()) == null) {
        } else {
            Intent intent = new Intent();
            if (this.i != null) {
                intent.putExtra("result_open_data", this.i);
            }
            if (openOneClickPay != null) {
                intent.putExtra("result_one_click", openOneClickPay);
            }
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("result_extra_data", str);
            }
            activity.setResult(i, intent);
            activity.finish();
            c();
        }
    }

    private void a(String str) {
        com.meituan.android.cashier.oneclick.callback.a aVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49b3ef88b17b53ce99ffbfd4cbc705ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49b3ef88b17b53ce99ffbfd4cbc705ac");
        } else if (this.j == null || (aVar = this.j.get()) == null) {
        } else {
            aVar.executeSuccess(str);
        }
    }

    private void a(int i, String str) {
        com.meituan.android.cashier.oneclick.callback.a aVar;
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7cc68b2116bb6949911e618a068ad4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7cc68b2116bb6949911e618a068ad4d");
        } else if (this.j == null || (aVar = this.j.get()) == null) {
        } else {
            aVar.executeFail(i, str);
        }
    }

    public final void a(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c59ff6f6af923a36b6e8a3fb3b0018d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c59ff6f6af923a36b6e8a3fb3b0018d");
        } else {
            a(activity, str, (PayException) null);
        }
    }

    private void a(Activity activity, String str, PayException payException) {
        Object[] objArr = {activity, str, payException};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0853b983c9a5c62a48c979a7e969e836", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0853b983c9a5c62a48c979a7e969e836");
        } else if (activity != null) {
            Intent intent = new Intent();
            if (this.i != null) {
                intent.putExtra("result_open_data", this.i);
            }
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("result_extra_data", str);
            }
            if (payException != null) {
                intent.putExtra("result_extra_error_level", payException);
            }
            activity.setResult(4000, intent);
            activity.finish();
            c();
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    @MTPaySuppressFBWarnings({"SF_SWITCH_NO_DEFAULT"})
    public void onRequestSucc(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a3ab2684c9764c84a807736754cba46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a3ab2684c9764c84a807736754cba46");
        } else if (obj == null) {
            a(1000, "js桥数据错误");
            if (this.k == null || this.k.get() == null) {
                return;
            }
            a(this.k.get(), "接口参数错误");
        } else {
            switch (i) {
                case 10:
                    com.meituan.android.cashier.oneclick.util.a.b(this.l, "b_pay_oneclickpay_deductordersave_succ_sc", com.meituan.android.neohybrid.neo.report.a.a().b);
                    q.c("oneclickpay_deductordersave_succ", com.meituan.android.neohybrid.neo.report.a.a().b, b());
                    a(n.a().toJson(obj));
                    a(3000, (OpenOneClickPay) null, (String) null);
                    return;
                case 11:
                    String json = n.a().toJson(obj);
                    OpenOneClickPay openOneClickPay = (OpenOneClickPay) obj;
                    boolean isOpened = openOneClickPay.isOpened();
                    com.meituan.android.cashier.oneclick.util.a.b(this.l, "b_pay_oneclickpay_open_succ_sc", com.meituan.android.neohybrid.neo.report.a.a().a("opened", Boolean.valueOf(isOpened)).b);
                    q.c("oneclickpay_open_succ", com.meituan.android.neohybrid.neo.report.a.a().a("opened", Boolean.valueOf(isOpened)).b, b());
                    a(json);
                    a(2000, openOneClickPay, "开通成功，进行支付");
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    @MTPaySuppressFBWarnings({"SF_SWITCH_NO_DEFAULT"})
    public void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06cefd37a37de1663d499f14b9c23f69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06cefd37a37de1663d499f14b9c23f69");
            return;
        }
        a(i, exc.getMessage());
        switch (i) {
            case 10:
                com.meituan.android.cashier.oneclick.util.a.a(this.l, "b_pay_oneclickpay_deductordersave_fail_sc", exc);
                q.a("oneclickpay_deductordersave_fail", exc, b());
                com.meituan.android.cashier.oneclick.util.b.c(1100030);
                com.meituan.android.cashier.oneclick.util.a.a("b_pay_oneclick_pay_downgrade_to_standard_cashier_sc", com.meituan.android.neohybrid.neo.report.a.c(KnbConstants.PARAMS_SCENE, 9).b);
                q.c("oneclick_pay_downgrade_to_standard_cashier", com.meituan.android.neohybrid.neo.report.a.c(KnbConstants.PARAMS_SCENE, 9).b, b());
                break;
            case 11:
                com.meituan.android.cashier.oneclick.util.a.a(this.l, "b_pay_oneclickpay_open_fail_sc", exc);
                q.a("oneclickpay_open_fail", exc, b());
                com.meituan.android.cashier.oneclick.util.b.c(1100030);
                com.meituan.android.cashier.oneclick.util.a.a("b_pay_oneclick_pay_downgrade_to_standard_cashier_sc", com.meituan.android.neohybrid.neo.report.a.c(KnbConstants.PARAMS_SCENE, 2).b);
                q.c("oneclick_pay_downgrade_to_standard_cashier", com.meituan.android.neohybrid.neo.report.a.c(KnbConstants.PARAMS_SCENE, 2).b, b());
                break;
        }
        PayException payException = exc instanceof PayException ? (PayException) exc : null;
        if (this.k == null || this.k.get() == null) {
            return;
        }
        a(this.k.get(), "接口错误", payException);
    }

    public final a a(com.meituan.android.cashier.oneclick.callback.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a4f6bcecfe5ea5c7270c24cb696738b", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a4f6bcecfe5ea5c7270c24cb696738b");
        }
        this.j = new WeakReference<>(aVar);
        return this;
    }

    public final void e(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6017c4c14e1b635d00bd3c5c4cd9a7a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6017c4c14e1b635d00bd3c5c4cd9a7a1");
        } else {
            this.i = jSONObject.toString();
        }
    }

    private String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93cdf9e2d9d80207afcee71fa9226c84", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93cdf9e2d9d80207afcee71fa9226c84") : String.valueOf(this.e);
    }

    private String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a10e6a82e283d8511cb3db89c6758222", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a10e6a82e283d8511cb3db89c6758222");
        }
        if (TextUtils.isEmpty(this.h)) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("outer_business_statics", this.h);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "OneClickOpenNeoPresenter_getExtDimStat", (Map<String, Object>) null);
        }
        return jSONObject.toString();
    }
}
