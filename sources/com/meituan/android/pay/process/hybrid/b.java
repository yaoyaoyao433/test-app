package com.meituan.android.pay.process.hybrid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.neohybrid.util.f;
import com.meituan.android.pay.activity.PayActivity;
import com.meituan.android.pay.common.payment.bean.HybridInfo;
import com.meituan.android.pay.fragment.MTHybridHalfPageContainerFragment;
import com.meituan.android.pay.fragment.MeituanPayTitansFragment;
import com.meituan.android.pay.fragment.SignPayNeoFragment;
import com.meituan.android.pay.jshandler.mediator.a;
import com.meituan.android.pay.model.PayErrorCode;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.pay.model.bean.HybridSignPayHornConfig;
import com.meituan.android.pay.process.c;
import com.meituan.android.pay.process.g;
import com.meituan.android.pay.process.j;
import com.meituan.android.pay.utils.d;
import com.meituan.android.pay.utils.h;
import com.meituan.android.pay.utils.n;
import com.meituan.android.pay.utils.o;
import com.meituan.android.pay.utils.s;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.fingerprint.soter.soterexternal.e;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.ak;
import com.meituan.android.paycommon.lib.fragment.HalfPageFragment;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b implements MTHybridHalfPageContainerFragment.a, c, com.meituan.android.paybase.retrofit.b {
    public static ChangeQuickRedirect a;
    FragmentActivity b;
    private HybridInfo c;
    private Handler d;
    private boolean e;

    @Override // com.meituan.android.pay.process.c
    public final String d() {
        return "HybridProcess";
    }

    public static /* synthetic */ void a(b bVar, String str, String str2, int i, String str3) {
        Object[] objArr = {str, str2, Integer.valueOf(i), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "cdec27130a54844fe43eefadf99c8292", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "cdec27130a54844fe43eefadf99c8292");
            return;
        }
        o.b(ak.a(bVar.b));
        String str4 = com.meituan.android.pay.common.analyse.a.b;
        d.a(1180120, str4, (HybridInfo) null);
        com.meituan.android.pay.common.analyse.b.b("c_pay_emhyaxrm", "b_pay_kv4ualxg_mc", "", new a.c().a("type", Integer.valueOf(i)).a("reason", str3).a("launchUrl", str).a("isHelloPay", Boolean.TRUE).a("mtpay_scene", str4).a("downgradeType", str2).b, ak.a(bVar.b));
        com.meituan.android.paybase.metrics.a.c("tti_contract_pay_hybrid_view", "request_contractinfo");
        d.a("paybiz_hybrid_degrade_start", i);
        d.a(i);
        bVar.e();
        g.b(bVar.b);
    }

    public b(FragmentActivity fragmentActivity, HybridInfo hybridInfo) {
        Object[] objArr = {fragmentActivity, hybridInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a557e221c7dc03b4706eb5d5764d54aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a557e221c7dc03b4706eb5d5764d54aa");
            return;
        }
        this.d = new Handler();
        this.b = fragmentActivity;
        this.c = hybridInfo;
    }

    @Override // com.meituan.android.pay.process.c
    public final Context a() {
        return this.b;
    }

    @Override // com.meituan.android.pay.process.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c75b16499ec0a47dc75ca5b59efdac9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c75b16499ec0a47dc75ca5b59efdac9");
            return;
        }
        String b = com.meituan.android.pay.common.payment.utils.b.b(this.b, "launch_url");
        if (TextUtils.equals(b, "/qdbsign/sign")) {
            com.meituan.android.pay.common.payment.utils.b.a(this.b, "enable_neo_sign_pay", String.valueOf(((HybridSignPayHornConfig) com.meituan.android.neohybrid.core.horn.a.a().a(HybridSignPayHornConfig.class)).isEnableNeoSignPay()));
            a(this.c, b, (Bundle) null);
        } else if (com.meituan.android.pay.desk.component.data.b.e(this.b)) {
            f();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void f() {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.pay.process.hybrid.b.f():void");
    }

    private void a(HashMap<String, Object> hashMap, String str) {
        Object[] objArr = {hashMap, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4296e726b8838d8aaecb6a24cef30c07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4296e726b8838d8aaecb6a24cef30c07");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.opt(next));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6025ac2b14fcceb3b92e8b9dac03812b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6025ac2b14fcceb3b92e8b9dac03812b");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            JSONObject a2 = com.meituan.android.pay.desk.component.data.b.a(this.b);
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.put("cashier_paytoken", a2.opt("cashier_paytoken"));
            jSONObject.put("tradeno", a2.opt("tradeno"));
            jSONObject.put("has_touchid", com.meituan.android.paybase.fingerprint.util.c.c());
            jSONObject.put("model_key", com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.f());
            jSONObject.put("support_finger_type", String.valueOf(com.meituan.android.paybase.fingerprint.util.a.a(this.b)));
            jSONObject.put("need_update_soter_key", String.valueOf(e.a(this.b, "")));
            jSONObject.put("google_fingerprint_locked", com.meituan.android.paybase.fingerprint.util.b.c(com.meituan.android.paybase.config.a.d().i()) ? "0" : "1");
            jSONObject.put("hardware_detected", com.meituan.android.paybase.fingerprint.util.c.d());
            com.meituan.android.paybase.downgrading.c cVar = com.meituan.android.paybase.downgrading.d.a().b;
            if (cVar != null) {
                boolean z = cVar.d;
                String str2 = cVar.e;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("show", z);
                jSONObject2.put("url", str2);
                jSONObject.put("safe_key_notice_info", jSONObject2.toString());
            }
            jSONObject.put("zone_user_id", com.meituan.android.paybase.config.a.d().s().a());
            jSONObject.put("member_id", com.meituan.android.paybase.set.a.a());
            jSONObject.put("nb_hybrid_version", a2.opt("nb_hybrid_version"));
            jSONObject.put("nb_container", "hybrid");
            jSONObject.put("installed_apps", a2.opt("install_app"));
            jSONObject.put("nb_fingerprint", com.meituan.android.paycommon.lib.config.a.a().o());
            jSONObject.put("rooted", a2.opt("rooted"));
            try {
                JSONObject jSONObject3 = new JSONObject(com.meituan.android.pay.utils.e.d(this.b));
                Iterator<String> keys = jSONObject3.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (TextUtils.isEmpty(jSONObject.optString(next))) {
                        jSONObject.put(next, jSONObject3.optString(next));
                    } else {
                        com.meituan.android.paybase.common.analyse.a.a(new Exception("key 值存在重复：" + next), "HybridProcess_appendUniversalParams", (Map<String, Object>) null);
                    }
                }
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "HybridProcess_appendUniversalParams", (Map<String, Object>) null);
            }
            return jSONObject.toString();
        } catch (JSONException e2) {
            com.meituan.android.paybase.common.analyse.a.a(e2, "HybridProcess_putUniversalParams", (Map<String, Object>) null);
            return "";
        }
    }

    private String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eccf439beb4208ad4a1549b1f811bff2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eccf439beb4208ad4a1549b1f811bff2");
        }
        JSONObject a2 = com.meituan.android.pay.desk.component.data.b.a(this.b);
        if (a2 != null) {
            try {
                return a2.getString("mtp_cashier_url");
            } catch (JSONException e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "HybridProcess_getCashierUrl", (Map<String, Object>) null);
                return "";
            }
        }
        return "";
    }

    @Override // com.meituan.android.pay.process.c
    public final void a(FragmentActivity fragmentActivity, Object obj) {
        Object[] objArr = {fragmentActivity, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a348353dad0abf922a506ac2600bfaaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a348353dad0abf922a506ac2600bfaaa");
        } else if (com.meituan.android.pay.desk.component.data.a.b(fragmentActivity)) {
            new a(fragmentActivity).a(obj);
        }
    }

    @Override // com.meituan.android.pay.process.c
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1496e9024190caf6764b1370ae85bb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1496e9024190caf6764b1370ae85bb7");
            return;
        }
        if (this.d != null) {
            this.d.removeCallbacksAndMessages(null);
            this.d = null;
        }
        this.c = null;
    }

    private void a(HybridInfo hybridInfo, final String str, Bundle bundle) {
        final Fragment a2;
        Object[] objArr = {hybridInfo, str, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8efbdf37ec48c14c77d8524dfdcf140", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8efbdf37ec48c14c77d8524dfdcf140");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_vu5zl0wy_mc", new a.c().a("launchUrl", str).a("isHelloPay", Boolean.TRUE).a("mtpay_scene", com.meituan.android.pay.common.analyse.a.b).b);
        n.a(this.b);
        ((PayActivity) this.b).b(true);
        String str2 = "";
        try {
            str2 = URLDecoder.decode(hybridInfo.getHybridUrl(), "utf-8");
        } catch (UnsupportedEncodingException e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "PayActivity_startSignPayByHybrid", new a.c().a("hybrid_url", hybridInfo.getHybridUrl()).b);
        }
        o.a(ak.a(this.b));
        if (Boolean.TRUE.toString().equals(com.meituan.android.pay.common.payment.utils.b.b(this.b, "enable_neo_sign_pay"))) {
            a2 = SignPayNeoFragment.a(this.b, R.id.content, str2, bundle);
            f.a("进入签约支付-使用【Neo容器】");
        } else {
            a2 = MeituanPayTitansFragment.a(this.b, R.id.content, str2);
            f.a("进入签约支付-使用【KNB容器】");
        }
        final boolean[] zArr = {false};
        this.d.postDelayed(new Runnable() { // from class: com.meituan.android.pay.process.hybrid.b.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "da6fe3f78ddbbdd005efd45d9ab56a39", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "da6fe3f78ddbbdd005efd45d9ab56a39");
                } else if (zArr[0]) {
                } else {
                    ((PayActivity) b.this.b).hideProgress();
                    b.a(b.this, str, "timeout_downgrade", 1180202, "加载超时降级");
                }
            }
        }, hybridInfo.getLoadingTime() == 0 ? MetricsAnrManager.ANR_THRESHOLD : hybridInfo.getLoadingTime() * 1000);
        com.meituan.android.pay.jshandler.mediator.a.a().a(this.b, new a.InterfaceC0326a() { // from class: com.meituan.android.pay.process.hybrid.b.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.pay.jshandler.mediator.a.InterfaceC0326a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "86f3198ea687a90bea6a985272cb31e3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "86f3198ea687a90bea6a985272cb31e3");
                    return;
                }
                zArr[0] = true;
                if (a2 instanceof SignPayNeoFragment) {
                    ((SignPayNeoFragment) a2).d.b();
                    return;
                }
                if (a2 instanceof MeituanPayTitansFragment) {
                    MeituanPayTitansFragment meituanPayTitansFragment = (MeituanPayTitansFragment) a2;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = MeituanPayTitansFragment.a;
                    if (PatchProxy.isSupport(objArr3, meituanPayTitansFragment, changeQuickRedirect3, false, "0423c9b5c1dc2fc0b00a11aeac7bee69", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, meituanPayTitansFragment, changeQuickRedirect3, false, "0423c9b5c1dc2fc0b00a11aeac7bee69");
                    } else if (!meituanPayTitansFragment.b.isShown()) {
                        meituanPayTitansFragment.b.setVisibility(0);
                        meituanPayTitansFragment.hideProgress();
                    }
                }
                com.meituan.android.paybase.metrics.a.c("tti_contract_pay_hybrid_view", "h5_render_finish");
                com.meituan.android.paybase.metrics.a.b("tti_contract_pay_hybrid_view");
                n.a(b.this.b, false, "knb");
                ((PayActivity) b.this.b).hideProgress();
            }

            @Override // com.meituan.android.pay.jshandler.mediator.a.InterfaceC0326a
            public final void a(String str3, String str4, String str5, String str6) {
                Object[] objArr2 = {str3, str4, str5, str6};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "048ca567fa6c962a3d94b9859049bf73", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "048ca567fa6c962a3d94b9859049bf73");
                    return;
                }
                if (!TextUtils.isEmpty(str5)) {
                    com.meituan.android.pay.common.payment.utils.b.a(b.this.b, (HashMap) com.meituan.android.paybase.utils.n.a().fromJson(str5, new TypeToken<HashMap<String, String>>() { // from class: com.meituan.android.pay.process.hybrid.b.2.1
                    }.getType()));
                }
                o.b(ak.a(b.this.b));
                if (!TextUtils.isEmpty(str3)) {
                    BankInfo bankInfo = (BankInfo) com.meituan.android.paybase.utils.n.a().fromJson(str3, (Class<Object>) BankInfo.class);
                    if (com.meituan.android.pay.desk.component.data.a.b(b.this.b) && !com.meituan.android.pay.utils.c.g(bankInfo)) {
                        com.meituan.android.pay.process.f.b(b.this.b, bankInfo);
                    } else {
                        com.meituan.android.pay.common.payment.utils.b.a(b.this.b, "current_url", str6);
                        b.this.a(bankInfo);
                    }
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_kt4lhuvl_mc", new a.c().a("type", "succ").b);
                } else if (!TextUtils.isEmpty(str4)) {
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_kt4lhuvl_mc", new a.c().a("type", "error").b);
                    PayException payException = (PayException) com.meituan.android.paybase.utils.n.a().fromJson(str4, (Class<Object>) PayException.class);
                    if (payException != null) {
                        if (com.meituan.android.pay.desk.component.data.a.b(b.this.b)) {
                            com.meituan.android.pay.process.f.b(b.this.b, payException);
                        } else {
                            com.meituan.android.pay.common.payment.utils.b.a(b.this.b, "current_url", str6);
                            if (h.a(b.this.b, payException)) {
                                h.a(b.this.b, payException, null, b.this);
                                return;
                            }
                            s.a((Activity) b.this.b, (Exception) payException, 3);
                        }
                    }
                }
                com.meituan.android.paybase.common.analyse.a.a("b_pay_c2hxz2jj_mc", new a.c().a("resultData", str3).a("resultError", str4).a("param", str5).a("path", str6).a("path", str6).a("mtpay_scene", com.meituan.android.pay.common.analyse.a.b).b);
                b.this.e();
            }

            @Override // com.meituan.android.pay.jshandler.mediator.a.InterfaceC0326a
            public final void a(String str3) {
                Object[] objArr2 = {str3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "960b768f6bcd3f8ffa3a5487defcc4f0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "960b768f6bcd3f8ffa3a5487defcc4f0");
                } else {
                    b.a(b.this, str, "h5_dowgrade", 1180203, str3);
                }
            }

            @Override // com.meituan.android.pay.jshandler.mediator.a.InterfaceC0326a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d3a018118d7b995d9cc3480ed7cef714", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d3a018118d7b995d9cc3480ed7cef714");
                } else {
                    zArr[0] = true;
                }
            }
        });
    }

    void a(BankInfo bankInfo) {
        Object[] objArr = {bankInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9c981aaf1f4f016b910d2b284562217", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9c981aaf1f4f016b910d2b284562217");
            return;
        }
        j.b(this.b, bankInfo);
        com.meituan.android.pay.process.f.a(this.b, bankInfo);
    }

    void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da7820ebe2d2cd490af02f514e59839b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da7820ebe2d2cd490af02f514e59839b");
        } else if (this.b == null || this.b.getSupportFragmentManager() == null) {
        } else {
            Fragment findFragmentById = this.b.getSupportFragmentManager().findFragmentById(R.id.content);
            if ((findFragmentById instanceof MeituanPayTitansFragment) || (findFragmentById instanceof SignPayNeoFragment)) {
                com.meituan.android.paycommon.lib.utils.h.b(this.b, findFragmentById);
            }
        }
    }

    @Override // com.meituan.android.pay.process.c
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c11854b8c7d45e0b7f3b94c005442cef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c11854b8c7d45e0b7f3b94c005442cef");
            return;
        }
        Fragment findFragmentById = this.b.getSupportFragmentManager().findFragmentById(R.id.content);
        if ((findFragmentById instanceof MeituanPayTitansFragment) || (findFragmentById instanceof SignPayNeoFragment) || (findFragmentById instanceof HalfPageFragment)) {
            findFragmentById.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestSucc(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17e64c213ea8e6b17f362dbd64873122", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17e64c213ea8e6b17f362dbd64873122");
        } else if (this.b != null && i == 228) {
            a((BankInfo) obj);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c1f323bd0c1b28f42953cb3d519e0d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c1f323bd0c1b28f42953cb3d519e0d5");
        } else {
            s.a(this.b, exc, 3);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestFinal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0e911057101dadeb7690f9396e06529", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0e911057101dadeb7690f9396e06529");
        } else if (this.b == null) {
        } else {
            ((PayActivity) this.b).onRequestFinal(i);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestStart(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfc416a8ade83d5a8550cf182e8a161c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfc416a8ade83d5a8550cf182e8a161c");
        } else if (this.b == null) {
        } else {
            ((PayActivity) this.b).onRequestStart(i);
        }
    }

    @Override // com.meituan.android.pay.process.c
    public final void a(FragmentActivity fragmentActivity, Bundle bundle) {
        Object[] objArr = {fragmentActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b4622a218ce2d62119435573d4fd84b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b4622a218ce2d62119435573d4fd84b");
            return;
        }
        String b = com.meituan.android.pay.common.payment.utils.b.b(fragmentActivity, "launch_url");
        if (TextUtils.equals(b, "/qdbsign/sign")) {
            a(this.c, b, bundle);
        } else if (com.meituan.android.pay.desk.component.data.b.e(fragmentActivity)) {
            f();
        }
    }

    @Override // com.meituan.android.pay.fragment.MTHybridHalfPageContainerFragment.a
    public final void a(int i, boolean z, String str) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6644496272582192b1eec4a8a9eeb36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6644496272582192b1eec4a8a9eeb36");
        } else if (101 != i || z) {
        } else {
            PayActivity.b(this.b, str, PayErrorCode.HYBRID_PREPOSED_MTCASHIER_LOADING_ERROR);
        }
    }
}
