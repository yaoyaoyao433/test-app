package com.meituan.android.cashier.oneclick.fragment;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cashier.activity.MTCashierActivity;
import com.meituan.android.cashier.common.ICashier;
import com.meituan.android.cashier.common.i;
import com.meituan.android.cashier.common.q;
import com.meituan.android.cashier.oneclick.OneClickCashier;
import com.meituan.android.cashier.oneclick.dialog.OneClickPayConfirmDialog;
import com.meituan.android.cashier.oneclick.model.bean.OneClickPay;
import com.meituan.android.cashier.oneclick.model.bean.OneClickPayOpenInfo;
import com.meituan.android.cashier.oneclick.model.bean.OneClickPayOrderState;
import com.meituan.android.cashier.oneclick.model.bean.OneClickPayRouteInfo;
import com.meituan.android.cashier.oneclick.model.bean.OpenOneClickPay;
import com.meituan.android.cashier.oneclick.retrofit.OneClickRequestService;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.util.p;
import com.meituan.android.pay.jshandler.HybridSignPayJSHandler;
import com.meituan.android.pay.model.bean.RetainDisplayCloseInfoBean;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.dialog.PayDialog;
import com.meituan.android.paybase.common.fragment.PayBaseFragment;
import com.meituan.android.paybase.common.utils.c;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.MTPayNeedToPersist;
import com.meituan.android.paybase.utils.ae;
import com.meituan.android.paybase.utils.al;
import com.meituan.android.paybase.utils.n;
import com.meituan.android.paycommon.lib.coupon.model.Promotion;
import com.meituan.android.paycommon.lib.fragment.HalfPageFragment;
import com.meituan.android.paycommon.lib.utils.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.titans.protocol.bean.TitansConstants;
import com.sankuai.waimai.platform.utils.f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MTCOneClickPayFragment extends PayBaseFragment implements c, com.meituan.android.paybase.retrofit.b {
    public static ChangeQuickRedirect a;
    private i A;
    private Handler B;
    private LinearLayout C;
    private ProgressBar D;
    private ImageView E;
    private TextView F;
    private g G;
    private LottieAnimationView H;
    @MTPayNeedToPersist
    private boolean I;
    @MTPayNeedToPersist
    private boolean J;
    private boolean K;
    private boolean L;
    private JSONObject M;
    private HashMap<String, String> N;
    private int O;
    private String P;
    private OneClickPayRouteInfo Q;
    private boolean R;
    private final String S;
    private String T;
    private String U;
    @MTPayNeedToPersist
    private String V;
    @MTPayNeedToPersist
    private String b;
    @MTPayNeedToPersist
    private String c;
    @MTPayNeedToPersist
    private String d;
    @MTPayNeedToPersist
    private String e;
    @MTPayNeedToPersist
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private long s;
    private long t;
    private long u;
    private long v;
    @MTPayNeedToPersist
    private FragmentActivity z;

    @Override // com.meituan.android.paybase.common.utils.c
    public final boolean b() {
        return false;
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment
    public final String d() {
        return "c_pay_shlovp62";
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestFinal(int i) {
    }

    public MTCOneClickPayFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "227d4ff1724f038b43144ba92bba9dde", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "227d4ff1724f038b43144ba92bba9dde");
            return;
        }
        this.j = "/api/wallet/oneclickpay/openoneclickpay";
        this.k = "/cashier/oneclickpay";
        this.n = "/cashier/oneclickpayquery";
        this.o = true;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = 1L;
        this.t = 6L;
        this.I = true;
        this.J = false;
        this.K = true;
        this.Q = null;
        this.R = com.meituan.android.cashier.oneclick.hybrid.a.h();
        this.S = com.meituan.android.cashier.oneclick.hybrid.a.i();
        this.V = "none";
    }

    public static /* synthetic */ void d(MTCOneClickPayFragment mTCOneClickPayFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mTCOneClickPayFragment, changeQuickRedirect, false, "1be98fa9c7b83abcbf6c9bfebee8d84a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mTCOneClickPayFragment, changeQuickRedirect, false, "1be98fa9c7b83abcbf6c9bfebee8d84a");
            return;
        }
        mTCOneClickPayFragment.a(mTCOneClickPayFragment.getString(R.string.cashieroneclick__timeout_text), "");
        com.meituan.android.paybase.common.analyse.a.a("b_pay_pq9j522o_mv", (Map<String, Object>) null);
        com.meituan.android.cashier.oneclick.util.b.c(1100026);
        q.c("oneclick_pay_downgrade_to_standard_cashier", com.meituan.android.neohybrid.neo.report.a.c(KnbConstants.PARAMS_SCENE, 0).b, mTCOneClickPayFragment.r());
        com.meituan.android.cashier.oneclick.util.a.a("b_pay_oneclick_pay_downgrade_to_standard_cashier_sc", com.meituan.android.neohybrid.neo.report.a.c(KnbConstants.PARAMS_SCENE, 0).b);
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "976b9cac579d5c8bb7d713ee47c6998b", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "976b9cac579d5c8bb7d713ee47c6998b") : layoutInflater.inflate(R.layout.cashieroneclick__fragment, viewGroup, false);
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fcf8936e575f3ec123612199fe1431f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fcf8936e575f3ec123612199fe1431f");
            return;
        }
        super.onViewCreated(view, bundle);
        this.C = (LinearLayout) view.findViewById(R.id.cashier_ll_one_click_pay_toast);
        this.D = (ProgressBar) view.findViewById(R.id.cashier_progress_bar);
        this.F = (TextView) view.findViewById(R.id.cashier_tv_toast_info);
        this.E = (ImageView) view.findViewById(R.id.cashier_igv_one_click_pay_fail);
        this.H = (LottieAnimationView) view.findViewById(R.id.cashier_lottie_view);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f0069a059ce7ddb7953b61bf1d66b256", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f0069a059ce7ddb7953b61bf1d66b256");
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.b = arguments.getString("trade_number");
            this.c = arguments.getString("pay_token");
            this.d = arguments.getString("extra_data");
            this.e = arguments.getString("extra_statics");
            Serializable a2 = f.a(arguments, "extend_transmission_params");
            if (a2 instanceof HashMap) {
                this.N = (HashMap) a2;
            }
        }
        this.B = new Handler();
        this.q = false;
        this.R = com.meituan.android.cashier.oneclick.hybrid.a.h();
        try {
            JSONObject jSONObject = new JSONObject(this.d);
            this.f = jSONObject.optString("serialCode");
            this.g = jSONObject.optString("open_oneclickpay");
            e(getString(R.string.cashieroneclick__toast_default_content));
            if (this.J) {
                a((Promotion) null);
            } else {
                b(this.g);
            }
            com.meituan.android.cashier.oneclick.util.b.e(200);
            if (this.A == null || !this.I) {
                return;
            }
            this.I = false;
            this.A.d("oneclickpay_cashier");
        } catch (JSONException e) {
            if (this.A != null && this.I) {
                this.I = false;
                this.A.b("1100003", "extra_data is illegal");
            }
            l();
            com.meituan.android.paybase.common.analyse.a.a(e, "MTCOneClickPayFragment_initData", (Map<String, Object>) null);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bb606831b2ba9d311d2937d25fb474f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bb606831b2ba9d311d2937d25fb474f");
            return;
        }
        super.onDestroyView();
        this.q = true;
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment
    public final HashMap<String, Object> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e76559d4f321742eb267007e683fce3", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e76559d4f321742eb267007e683fce3");
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("tradeNo", this.b);
        return hashMap;
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9543cb62126e8167b9abd69f0582268", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9543cb62126e8167b9abd69f0582268");
        } else if ("0".equalsIgnoreCase(str)) {
            d("");
        } else if ("1".equalsIgnoreCase(str)) {
            c("");
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b480e5e0989947592eba25357d659253", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b480e5e0989947592eba25357d659253");
            } else if (this.A != null) {
                this.A.c(getString(R.string.cashieroneclick__empty_param));
            } else {
                com.meituan.android.cashier.oneclick.util.b.c();
            }
        }
    }

    private void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd53ea1f249762d89922f4102d0ea548", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd53ea1f249762d89922f4102d0ea548");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        com.meituan.android.cashier.oneclick.util.a.a("/cashier/oneclickpaydispatcher", "b_pay_cashier_oneclickpaydispatcher_start_sc", (Map<String, Object>) null);
        q.a("cashier_oneclickpaydispatcher_start", r());
        try {
            ((OneClickRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(OneClickRequestService.class, this, 10)).oneClickPayRoute(this.b, this.c, Integer.parseInt(str), this.f, jSONObject.toString(), this.d, q(), 8000L, this.N);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "MTCOneClickPayFragment_requestOneClickRoute", (Map<String, Object>) null);
        }
        a("b_pay_ljgidv3e_mc", (Map<String, Object>) null);
        c();
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81d31c697d41ff792bf25b569cfd67e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81d31c697d41ff792bf25b569cfd67e8");
        } else if (!this.R || TextUtils.isEmpty(this.S)) {
        } else {
            if (com.meituan.android.cashier.oneclick.hybrid.a.q()) {
                f();
                if (TextUtils.isEmpty(this.T) || TextUtils.isEmpty(this.U)) {
                    this.U = p.a(com.meituan.android.neohybrid.init.a.d());
                    this.T = p.b(com.meituan.android.neohybrid.init.a.d());
                }
            }
            com.meituan.android.neohybrid.v2.neo.offline.g.a(this.S.trim(), com.meituan.android.cashier.oneclick.hybrid.a.j(), com.meituan.android.cashier.oneclick.hybrid.a.m());
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12ce37ad837da525d2343f3e9e996d65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12ce37ad837da525d2343f3e9e996d65");
            return;
        }
        WebView webView = new WebView(getActivity());
        WebSettings settings = webView.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        webView.evaluateJavascript(TitansConstants.JAVASCRIPT_PREFIX + "(function () {if (typeof WebAssembly!=\"object\") {return \"error\";}return \"success\"})();", new ValueCallback<String>() { // from class: com.meituan.android.cashier.oneclick.fragment.MTCOneClickPayFragment.1
            public static ChangeQuickRedirect a;

            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(String str) {
                String str2 = str;
                Object[] objArr2 = {str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b3385aa57792090ba09f04b1cf6bf328", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b3385aa57792090ba09f04b1cf6bf328");
                    return;
                }
                com.dianping.networklog.c.a("isWebViewSupportWasm " + str2, 3, new String[]{"Recce-Android"});
                MTCOneClickPayFragment.this.V = str2;
            }
        });
    }

    private void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d465d3db870ffffaf2ae51a024298cc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d465d3db870ffffaf2ae51a024298cc9");
            return;
        }
        a(this.f, this.h, this.i, str);
        if (TextUtils.isEmpty(str)) {
            a("b_pay_2rgp52gx_mc", "openoneclickpay 发起开启极速支付", new a.c().a("tradeNo", this.b).b, ae.a.CLICK);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51d1e16f58420ff71846ad53f1ffc6bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51d1e16f58420ff71846ad53f1ffc6bd");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("serialCode", this.f);
            jSONObject2.put("outer_business_statics", this.e);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "MTCOneClickPayFragment_requestOneClickPay_extDimStat", (Map<String, Object>) null);
        }
        try {
            jSONObject.put("from_guide", this.p);
            jSONObject.put("creditPayOpenMsg", this.l);
            try {
                if (this.M != null) {
                    Iterator<String> keys = this.M.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.put(next, this.M.get(next));
                    }
                }
            } catch (Exception e2) {
                com.meituan.android.paybase.common.analyse.a.a(e2, "MTCOneClickPayFragment_goOneClickPayData_fail", (Map<String, Object>) null);
            }
        } catch (Exception e3) {
            com.meituan.android.paybase.common.analyse.a.a(e3, "MTCOneClickPayFragment__requestOneClickPay_extParam", (Map<String, Object>) null);
        }
        com.meituan.android.cashier.oneclick.util.a.a(this.k, "b_pay_oneclickpay_pay_start_sc", (Map<String, Object>) null);
        q.a("oneclickpay_pay_start", r());
        ((OneClickRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(OneClickRequestService.class, this, 12)).oneClickPay(this.k, this.b, this.c, str, jSONObject.toString(), this.d, jSONObject2.toString(), 8000L, this.N);
        com.meituan.android.paybase.common.analyse.a.a("b_pay_mir9kpmk_mv", (Map<String, Object>) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Call g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f697b85c1c7002f50fa089a41cc8e7c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f697b85c1c7002f50fa089a41cc8e7c");
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_nceqy5dy_mv", (Map<String, Object>) null);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("creditPayOpenMsg", this.l);
        } catch (JSONException e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "MTCOneClickPayFragment_rrequestOrderState()", (Map<String, Object>) null);
        }
        if (this.K) {
            com.meituan.android.cashier.oneclick.util.a.a(this.n, "b_pay_oneclickpay_query_start_sc", (Map<String, Object>) null);
            q.a("oneclickpay_query_start", r());
        }
        return ((OneClickRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(OneClickRequestService.class, this, 13)).oneClickPayQuery(this.n, this.b, this.c, jSONObject.toString(), this.d, q(), 8000L, this.N);
    }

    private void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41e248af81779b64e2abb2470d19630d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41e248af81779b64e2abb2470d19630d");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.C.setVisibility(0);
            this.E.setVisibility(8);
            i();
            g(str);
        }
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35b6392f0a4d48a1f4f06c84e22cc080", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35b6392f0a4d48a1f4f06c84e22cc080");
            return;
        }
        try {
            this.H.setVisibility(0);
            this.H.setAnimation("oneclickpay_loading.json");
            this.H.c(true);
            this.H.b(true);
            this.H.a();
        } catch (Exception e) {
            this.D.getIndeterminateDrawable().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
            this.H.setVisibility(8);
            this.D.setVisibility(0);
            this.D.setProgress(0);
            com.meituan.android.paybase.common.analyse.a.a(e, "MTCOneClickPayFragment_showLoading()", (Map<String, Object>) null);
        }
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "154e2be9dac3a8d39cf82df22aa27a1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "154e2be9dac3a8d39cf82df22aa27a1e");
            return;
        }
        if (this.H != null) {
            this.H.setVisibility(8);
            this.H.clearAnimation();
        }
        if (this.D != null) {
            this.D.setVisibility(8);
        }
    }

    private void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33ce376cd8f5de10a9d1624782cddc0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33ce376cd8f5de10a9d1624782cddc0c");
            return;
        }
        if (this.C != null) {
            this.C.setVisibility(0);
        }
        j();
        if (this.E != null) {
            this.E.setVisibility(0);
        }
        g(str);
        if (this.B != null) {
            this.B.postDelayed(a.a(this, str2), 1800L);
        }
    }

    public static /* synthetic */ void a(MTCOneClickPayFragment mTCOneClickPayFragment, String str) {
        Object[] objArr = {mTCOneClickPayFragment, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b64763fb31ecb7d2a440bc969cb0287e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b64763fb31ecb7d2a440bc969cb0287e");
        } else {
            mTCOneClickPayFragment.i(str);
        }
    }

    private void f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6830381273a911fc0c0d09ec51e1a16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6830381273a911fc0c0d09ec51e1a16");
        } else {
            a(str, "");
        }
    }

    private void g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6157206bae6f7facafcaea6c8041da86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6157206bae6f7facafcaea6c8041da86");
        } else if (this.F != null) {
            this.F.setText(str);
        }
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a145e2743fd0a9d20826bf5892b90329", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a145e2743fd0a9d20826bf5892b90329");
        } else {
            this.C.setVisibility(8);
        }
    }

    private void a(Promotion promotion) {
        Object[] objArr = {promotion};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85759dd3420d959fe3f8e8b93dd6a833", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85759dd3420d959fe3f8e8b93dd6a833");
            return;
        }
        k();
        if (this.A != null) {
            this.A.a(promotion);
            com.meituan.android.cashier.oneclick.util.b.d(200);
            return;
        }
        com.meituan.android.cashier.oneclick.util.b.c();
    }

    public static /* synthetic */ void a(MTCOneClickPayFragment mTCOneClickPayFragment, OneClickPayOrderState oneClickPayOrderState) {
        Object[] objArr = {mTCOneClickPayFragment, oneClickPayOrderState};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d9ff45ff867d1becb9a9e1eec83bd60f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d9ff45ff867d1becb9a9e1eec83bd60f");
        } else {
            mTCOneClickPayFragment.a(oneClickPayOrderState.getPromotion());
        }
    }

    private void h(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f06260287bad2520dff8d2c8805d6b2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f06260287bad2520dff8d2c8805d6b2a");
        } else if (this.o) {
            this.o = false;
            if (this.q) {
                return;
            }
            if (this.A != null) {
                this.A.b("oneclickpay", RetainDisplayCloseInfoBean.TYPE_STANDARDCASHIER, str);
            } else {
                com.meituan.android.cashier.oneclick.util.b.c();
            }
            com.meituan.android.cashier.oneclick.util.b.d(1100012);
            com.meituan.android.paybase.common.analyse.a.a("b_pay_p4s5ktgk_mv", new a.c().a("nb_version", com.meituan.android.paybase.config.a.d().q()).a("tradeNo", this.b).a("message", str).a(KnbConstants.PARAMS_SCENE, com.meituan.android.cashier.oneclick.util.b.a()).b);
        }
    }

    private void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a85a09b2fc14046b5fe7de8e20ab5cb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a85a09b2fc14046b5fe7de8e20ab5cb4");
        } else {
            h("");
        }
    }

    private void i(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b16ba51cb6e56fa006d7b7f16904a70c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b16ba51cb6e56fa006d7b7f16904a70c");
            return;
        }
        k();
        h(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d52eb4041aa50644b3d18eeb367948d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d52eb4041aa50644b3d18eeb367948d");
        } else {
            i("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4110d67a4a40f9333f551ecb1e6c4246", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4110d67a4a40f9333f551ecb1e6c4246");
            return;
        }
        if (this.A != null) {
            this.A.c(str);
        } else {
            com.meituan.android.cashier.oneclick.util.b.c();
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_h92fe22k_mv", new a.c().a("failMsg", str).b);
    }

    private void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c587e1f15cf3985a99d9dec2caa764f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c587e1f15cf3985a99d9dec2caa764f3");
        } else if (this.G != null) {
            this.G.cancel();
            this.G = null;
        }
    }

    private void k(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69a52254fec79edcbb4223e57ebdd103", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69a52254fec79edcbb4223e57ebdd103");
        } else if (p()) {
            p(str);
        } else {
            o(str);
        }
    }

    private void a(OneClickPayRouteInfo oneClickPayRouteInfo) {
        Object[] objArr = {oneClickPayRouteInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb59c390ca478d537796e669436e6264", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb59c390ca478d537796e669436e6264");
        } else {
            a(oneClickPayRouteInfo, KernelConfig.KERNEL_SOURCE_DIRECT);
        }
    }

    private void a(OneClickPayRouteInfo oneClickPayRouteInfo, String str) {
        Object[] objArr = {oneClickPayRouteInfo, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43a1f5901b1ff827dc65c974e4ee551d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43a1f5901b1ff827dc65c974e4ee551d");
            return;
        }
        String f = com.meituan.android.cashier.oneclick.hybrid.a.f();
        if (oneClickPayRouteInfo == null || oneClickPayRouteInfo.getExtendInfo() == null) {
            f(getString(R.string.cashieroneclick__open_fail_text));
        } else if (TextUtils.isEmpty(f)) {
            f(getString(R.string.cashieroneclick__open_fail_text));
        } else {
            this.L = true;
            j();
            k();
            String trim = f.trim();
            com.meituan.android.cashier.oneclick.presenter.a a2 = com.meituan.android.cashier.oneclick.presenter.a.a();
            a2.b = this.b;
            a2.d = this.i;
            a2.c = this.f;
            a2.f = this.d;
            a2.g = this.N;
            a2.h = this.e;
            a2.e = oneClickPayRouteInfo.getExtendInfo().getMtPlanId();
            Intent intent = new Intent("android.intent.action.VIEW");
            com.meituan.android.neohybrid.a.a(intent, "oneclickpay_dispatcher", n.a().toJson(oneClickPayRouteInfo));
            Uri.Builder buildUpon = Uri.parse("meituanpayment://hybrid_cashier/launch").buildUpon();
            buildUpon.appendQueryParameter(NeoConfig.NEO_SCENE, "one_click_pay_modal");
            buildUpon.appendQueryParameter(KernelConfig.KEY_CONTAINER_TYPE, "knb");
            buildUpon.appendQueryParameter(KernelConfig.KEY_KERNEL_TYPE, "webview");
            buildUpon.appendQueryParameter(KernelConfig.KEY_KERNEL_SOURCE, str);
            buildUpon.appendQueryParameter("tradeno", this.b);
            buildUpon.appendQueryParameter("pay_token", this.c);
            buildUpon.appendQueryParameter("serialCode", this.f);
            buildUpon.appendQueryParameter("extra_data", this.d);
            buildUpon.appendQueryParameter("extra_statics", this.e);
            if (!com.meituan.android.paybase.utils.i.a(this.N)) {
                for (Map.Entry<String, String> entry : this.N.entrySet()) {
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                }
            }
            if (!TextUtils.isEmpty(trim) && trim.startsWith("http")) {
                buildUpon.appendQueryParameter("url", trim);
            } else {
                buildUpon.appendQueryParameter("url", com.meituan.android.neohybrid.init.a.e() + trim);
            }
            intent.setData(buildUpon.build());
            intent.setPackage(getActivity().getPackageName());
            startActivityForResult(intent, 51);
            HalfPageFragment.a("one_click_pay_modal", trim);
            b("one_click_pay_modal", "webview", str, r());
        }
    }

    private static void b(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d6b3fefb0306dcde55b2e0f80c76ad25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d6b3fefb0306dcde55b2e0f80c76ad25");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(NeoConfig.NEO_SCENE, str);
        hashMap.put(KernelConfig.KEY_KERNEL_TYPE, str2);
        hashMap.put(KernelConfig.KEY_KERNEL_SOURCE, str3);
        q.a("neo_call", hashMap, (List<Float>) null, str4);
        q.b(l("neo_call"), hashMap, str4);
    }

    private static void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e7a549bed8e067a80aa33c99d98c2f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e7a549bed8e067a80aa33c99d98c2f2");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("wasai_fail_type", str);
        hashMap.put("wasai_ddd_manager", com.alipay.sdk.widget.c.c);
        hashMap.put("wasai_cpu_abi", o());
        hashMap.put("wasai_app_abi", ProcessUtils.is64Bit() ? "abi64" : "abi32");
        q.a("one_click_pay_wasai_load_error", hashMap, (List<Float>) null, str2);
        q.b(l("one_click_pay_wasai_load_error"), hashMap, str2);
    }

    private static String o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e8bc9075c4e6335b909be55aa7931aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e8bc9075c4e6335b909be55aa7931aa");
        }
        String[] strArr = Build.VERSION.SDK_INT >= 21 ? Build.SUPPORTED_ABIS : new String[]{Build.CPU_ABI, Build.CPU_ABI2};
        StringBuilder sb = new StringBuilder();
        if (strArr != null) {
            for (int i = 0; i < strArr.length; i++) {
                sb.append(strArr[i]);
                if (i != strArr.length - 1) {
                    sb.append(CommonConstant.Symbol.COMMA);
                }
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void b(OneClickPayRouteInfo oneClickPayRouteInfo) {
        OneClickCashier oneClickCashier;
        char c;
        String builder;
        Object[] objArr = {oneClickPayRouteInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afba047ad2fa6bc4e1ed8f85ac11531a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afba047ad2fa6bc4e1ed8f85ac11531a");
        } else if (oneClickPayRouteInfo == null) {
            n("获取路由接口请求数据异常");
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "42224f01a337994c0ba756d9cb7247e5", RobustBitConfig.DEFAULT_VALUE)) {
                oneClickCashier = (OneClickCashier) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "42224f01a337994c0ba756d9cb7247e5");
            } else {
                if (getActivity() instanceof MTCashierActivity) {
                    ICashier iCashier = ((MTCashierActivity) getActivity()).e;
                    if (iCashier instanceof OneClickCashier) {
                        oneClickCashier = (OneClickCashier) iCashier;
                    }
                }
                oneClickCashier = null;
            }
            if (oneClickCashier != null) {
                oneClickCashier.a(true, (Map<String, Object>) null);
            }
            com.meituan.android.cashier.oneclick.util.a.b("result_extra_error_level", "b_pay_oneclick_pay_start_succ_sc", null);
            q.c("oneclick_pay_start_succ", com.meituan.android.neohybrid.neo.report.a.a().b, r());
            com.meituan.android.cashier.oneclick.util.a.b("/cashier/oneclickpaydispatcher", "b_pay_cashier_oneclickpaydispatcher_succ_sc", com.meituan.android.neohybrid.neo.report.a.c(KnbConstants.PARAMS_SCENE, oneClickPayRouteInfo.getScene()).b);
            q.c("cashier_oneclickpaydispatcher_succ", com.meituan.android.neohybrid.neo.report.a.c(KnbConstants.PARAMS_SCENE, oneClickPayRouteInfo.getScene()).b, r());
            this.m = oneClickPayRouteInfo.getExtendInfo().getMerchantCode();
            com.meituan.android.cashier.oneclick.util.b.a(oneClickPayRouteInfo.getExtendInfo().getMerchantCode());
            a("b_pay_awldyi3i_mc", new a.c().a("routeStatus", Integer.valueOf(oneClickPayRouteInfo.getRouteStatus())).b);
            switch (oneClickPayRouteInfo.getRouteStatus()) {
                case 0:
                    Object[] objArr3 = {oneClickPayRouteInfo};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2e92fd663b880b8e7028129ba367cdba", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2e92fd663b880b8e7028129ba367cdba");
                        return;
                    } else if (oneClickPayRouteInfo == null || TextUtils.isEmpty(oneClickPayRouteInfo.getScene())) {
                        n("获取路由接口请求数据异常");
                        return;
                    } else {
                        String scene = oneClickPayRouteInfo.getScene();
                        switch (scene.hashCode()) {
                            case -1181118221:
                                if (scene.equals(OneClickPayRouteInfo.SCENE_ONE_CLICK_PAY_CREDIT_PAY_OPEN)) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -498735525:
                                if (scene.equals(OneClickPayRouteInfo.SCENE_OPEN_ONE_CLICK_PAY_ADJUST_PAYLIST)) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -200717990:
                                if (scene.equals(OneClickPayRouteInfo.SCENE_ONE_CLICK_PAY_CONFIRM)) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 394378896:
                                if (scene.equals(OneClickPayRouteInfo.SCENE_ONE_CLICK_PAY_DEGRADE)) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1444313419:
                                if (scene.equals(OneClickPayRouteInfo.SCENE_ONLY_USE_ONE_CLICK_PAY)) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                                f(getString(R.string.cashieroneclick__open_fail_text));
                                return;
                            case 1:
                                OneClickPayOpenInfo openInfo = oneClickPayRouteInfo.getOpenInfo();
                                Object[] objArr4 = {openInfo};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1f8a4bd4b5acae8d208d0b260f14a6e6", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1f8a4bd4b5acae8d208d0b260f14a6e6");
                                    return;
                                } else if (openInfo == null) {
                                    n("guideOpenInfo获取会员开通信息异常");
                                    if (p()) {
                                        return;
                                    }
                                    q.c("oneclick_pay_downgrade_to_standard_cashier", com.meituan.android.neohybrid.neo.report.a.c(KnbConstants.PARAMS_SCENE, 3).b, r());
                                    com.meituan.android.cashier.oneclick.util.a.a("b_pay_oneclick_pay_downgrade_to_standard_cashier_sc", com.meituan.android.neohybrid.neo.report.a.c(KnbConstants.PARAMS_SCENE, 3).b);
                                    com.meituan.android.cashier.oneclick.util.b.c(1100025);
                                    return;
                                } else {
                                    a("b_pay_g5go8udx_mc", new a.c().a(KnbConstants.PARAMS_SCENE, Integer.valueOf(openInfo.getScene())).b);
                                    switch (openInfo.getScene()) {
                                        case 1:
                                            o(openInfo.getPath());
                                            this.h = String.valueOf(openInfo.getScene());
                                            c("");
                                            return;
                                        case 2:
                                            p(openInfo.getPath());
                                            d("");
                                            return;
                                        default:
                                            return;
                                    }
                                }
                            case 2:
                            case 3:
                                Object[] objArr5 = {oneClickPayRouteInfo};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "062a4bb03ec12e70c6a74c3f97e794cf", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "062a4bb03ec12e70c6a74c3f97e794cf");
                                    return;
                                }
                                boolean g = com.meituan.android.cashier.oneclick.hybrid.a.g();
                                String f = com.meituan.android.cashier.oneclick.hybrid.a.f();
                                String str = this.S;
                                new com.meituan.android.neohybrid.neo.report.a();
                                HashMap<String, Object> b = com.meituan.android.neohybrid.neo.report.a.c("url", f).b("is_downgrade", g ? "YES" : "NO");
                                com.meituan.android.cashier.oneclick.util.a.b("b_pay_oneclickpay_hybrid_start_sc", "b_pay_oneclickpay_hybrid_start_sc", b);
                                q.c("oneclickpay_hybrid_start", b, r());
                                if (oneClickPayRouteInfo == null || oneClickPayRouteInfo.getExtendInfo() == null) {
                                    f(getString(R.string.cashieroneclick__open_fail_text));
                                    return;
                                } else if (g) {
                                    a(this.g);
                                    return;
                                } else if (TextUtils.isEmpty(f) && TextUtils.isEmpty(str)) {
                                    f(getString(R.string.cashieroneclick__open_fail_text));
                                    return;
                                } else {
                                    this.L = true;
                                    j();
                                    k();
                                    byte b2 = (!this.R || TextUtils.isEmpty(str)) ? (byte) 0 : (byte) 1;
                                    Object[] objArr6 = {Byte.valueOf(b2)};
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "d401095aaecaa3e676ac0d1335406b38", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "d401095aaecaa3e676ac0d1335406b38");
                                    } else {
                                        String str2 = b2 != 0 ? KernelConfig.KERNEL_TYPE_RECCE : "webview";
                                        String l = l("one_click_pay_dynamic_start");
                                        com.meituan.android.neohybrid.neo.report.a a2 = com.meituan.android.neohybrid.neo.report.a.c(KernelConfig.KEY_KERNEL_TYPE, str2).a("webView_support_wasm", this.V).a("chromeVersion_core", this.U).a("chromeVersion", this.T);
                                        q.c("one_click_pay_dynamic_start", a2.b, r());
                                        com.meituan.android.cashier.oneclick.util.a.a(l, a2.b);
                                    }
                                    if (b2 == 0) {
                                        a(oneClickPayRouteInfo);
                                        return;
                                    }
                                    Object[] objArr7 = {oneClickPayRouteInfo};
                                    ChangeQuickRedirect changeQuickRedirect7 = a;
                                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "2887737715fb83551349faab9291a94b", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "2887737715fb83551349faab9291a94b");
                                        return;
                                    }
                                    String str3 = this.S;
                                    if (TextUtils.isEmpty(str3)) {
                                        if (com.meituan.android.cashier.oneclick.hybrid.a.l()) {
                                            b("wasaiResourceName_is_empty_01", r());
                                            a(oneClickPayRouteInfo);
                                            return;
                                        }
                                        b("wasaiResourceName_is_empty_02", r());
                                        f(getString(R.string.cashieroneclick__open_fail_text));
                                        return;
                                    }
                                    j();
                                    k();
                                    String trim = str3.trim();
                                    Intent intent = new Intent("android.intent.action.VIEW");
                                    Uri.Builder buildUpon = Uri.parse("meituanpayment://npay.meituan.com/neo").buildUpon();
                                    Object[] objArr8 = {trim};
                                    ChangeQuickRedirect changeQuickRedirect8 = a;
                                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "f170767df1473cf7b809bbfab6c0ead7", RobustBitConfig.DEFAULT_VALUE)) {
                                        builder = (String) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "f170767df1473cf7b809bbfab6c0ead7");
                                    } else {
                                        Uri.Builder builder2 = new Uri.Builder();
                                        builder2.scheme(KernelConfig.KERNEL_TYPE_RECCE);
                                        builder2.authority(Constants.EventType.PAY);
                                        builder2.path(trim);
                                        builder = builder2.toString();
                                    }
                                    Uri.Builder buildUpon2 = Uri.parse(builder).buildUpon();
                                    JsonObject jsonObject = new JsonObject();
                                    jsonObject.addProperty("business_scene", "one_click_pay_modal");
                                    jsonObject.add("oneclickpay_dispatcher", new JsonParser().parse(n.a().toJson(oneClickPayRouteInfo)));
                                    jsonObject.addProperty(HybridSignPayJSHandler.ARG_TRADE_NO, this.b);
                                    jsonObject.addProperty("pay_token", this.c);
                                    jsonObject.addProperty("serialCode", this.f);
                                    jsonObject.addProperty("extra_data", this.d);
                                    jsonObject.addProperty("outer_business_data", this.d);
                                    jsonObject.addProperty("user_id", com.meituan.android.paybase.config.a.d().i());
                                    buildUpon2.appendQueryParameter("business_data", jsonObject.toString());
                                    buildUpon2.appendQueryParameter("default_wasm_version", com.meituan.android.cashier.oneclick.hybrid.a.j());
                                    buildUpon2.appendQueryParameter("extra_packages", "wasai_one_click_pay_modal");
                                    JsonObject jsonObject2 = new JsonObject();
                                    jsonObject2.addProperty("extra_statics", this.e);
                                    buildUpon2.appendQueryParameter("lx_data", jsonObject2.toString());
                                    buildUpon.appendQueryParameter("url", buildUpon2.toString());
                                    buildUpon.appendQueryParameter(NeoConfig.NEO_SCENE, "one_click_pay_modal");
                                    buildUpon.appendQueryParameter(KernelConfig.KEY_CONTAINER_TYPE, KernelConfig.CONTAINER_TYPE_NEO);
                                    buildUpon.appendQueryParameter(KernelConfig.KEY_KERNEL_TYPE, KernelConfig.KERNEL_TYPE_RECCE);
                                    buildUpon.appendQueryParameter(KernelConfig.KEY_KERNEL_SOURCE, KernelConfig.KERNEL_SOURCE_DIRECT);
                                    buildUpon.appendQueryParameter("tradeno", this.b);
                                    buildUpon.appendQueryParameter("pay_token", this.c);
                                    buildUpon.appendQueryParameter("serialCode", this.f);
                                    buildUpon.appendQueryParameter("extra_data", this.d);
                                    buildUpon.appendQueryParameter("extra_statics", this.e);
                                    intent.setData(buildUpon.build());
                                    intent.setPackage(getActivity().getPackageName());
                                    startActivityForResult(intent, 51);
                                    HalfPageFragment.a("one_click_pay_modal", trim);
                                    b("one_click_pay_modal", KernelConfig.KERNEL_TYPE_RECCE, KernelConfig.KERNEL_SOURCE_DIRECT, r());
                                    return;
                                }
                            case 4:
                                k(oneClickPayRouteInfo.getRoutePath());
                                a(this.g);
                                return;
                            default:
                                return;
                        }
                    }
                case 1:
                    l();
                    com.meituan.android.cashier.oneclick.util.b.c(1100024);
                    return;
                case 2:
                    k(oneClickPayRouteInfo.getRoutePath());
                    a(this.g);
                    return;
                default:
                    return;
            }
        }
    }

    private void a(OpenOneClickPay openOneClickPay) {
        Object[] objArr = {openOneClickPay};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7363a4b74891055f3b604c17ccfd3d88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7363a4b74891055f3b604c17ccfd3d88");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_55gi7hct_mv", new a.c().a("openType", this.h).b);
        String str = "";
        String str2 = "";
        com.meituan.android.cashier.oneclick.util.a.b(this.j, "b_pay_oneclickpay_open_succ_sc", com.meituan.android.neohybrid.neo.report.a.c("opened", Boolean.valueOf(openOneClickPay.isOpened())).b);
        q.c("oneclickpay_open_succ", com.meituan.android.neohybrid.neo.report.a.c("opened", Boolean.valueOf(openOneClickPay.isOpened())).b, r());
        if (openOneClickPay.isOpened()) {
            this.l = openOneClickPay.getCreditPayOpenMsg();
            Object[] objArr2 = {openOneClickPay};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eb380b95d37951d6e3c4445f8138254e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eb380b95d37951d6e3c4445f8138254e");
            } else {
                this.p = true;
                if ((!this.r) && openOneClickPay.isSecondToastSwitch()) {
                    Object[] objArr3 = {openOneClickPay};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d97e67a938994ce58e3ad480d3e8f0f3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d97e67a938994ce58e3ad480d3e8f0f3");
                    } else {
                        OneClickPayConfirmDialogFragment a2 = OneClickPayConfirmDialogFragment.a(openOneClickPay, this.b);
                        a2.a(this.z.getSupportFragmentManager());
                        a2.b = new OneClickPayConfirmDialog.b() { // from class: com.meituan.android.cashier.oneclick.fragment.MTCOneClickPayFragment.2
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.android.cashier.oneclick.dialog.OneClickPayConfirmDialog.b
                            public final void a() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a65412c61cc9a8c6c0abd94f23c6578b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a65412c61cc9a8c6c0abd94f23c6578b");
                                    return;
                                }
                                MTCOneClickPayFragment.this.d("");
                                com.meituan.android.paybase.common.analyse.a.a("b_pay_0t5yh7xt_mv", (Map<String, Object>) null);
                                MTCOneClickPayFragment.this.a("b_pay_b0ja89h3_mc", "点击 二次确认弹窗 确认按钮", new a.c().a("tradeNo", MTCOneClickPayFragment.this.b).b, ae.a.VIEW);
                            }

                            @Override // com.meituan.android.cashier.oneclick.dialog.OneClickPayConfirmDialog.b
                            public final void b() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a93fe1c24655d720516a1937cf96d15e", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a93fe1c24655d720516a1937cf96d15e");
                                    return;
                                }
                                MTCOneClickPayFragment.this.m();
                                com.meituan.android.cashier.oneclick.util.b.c(1100029);
                                com.meituan.android.paybase.common.analyse.a.a("b_pay_uw8g4bw6_mv", (Map<String, Object>) null);
                                MTCOneClickPayFragment.this.a("b_pay_ysi7cxoo_mc", "点击 二次确认弹窗 关闭按钮", new a.c().a("tradeNo", MTCOneClickPayFragment.this.b).b, ae.a.VIEW);
                            }
                        };
                        com.meituan.android.paybase.common.analyse.a.a("b_pay_o3ae6ei9_mv", (Map<String, Object>) null);
                    }
                } else {
                    d("");
                }
            }
            str = "success";
            a("b_pay_tvc9mx52_mc", new a.c().a("openType", this.h).a("creditPayOpenMsg", this.l).b);
        } else if (openOneClickPay.getScene() == 2) {
            a(openOneClickPay.getUrl(), 0);
        } else {
            f(openOneClickPay.getMessage());
            str = "fail";
            str2 = openOneClickPay.getMessage();
            com.meituan.android.cashier.oneclick.util.b.c(1100021);
        }
        if (TextUtils.equals(str, "success")) {
            com.meituan.android.paybase.common.analyse.a.a("b_pay_0xmuxoyk_mc", new a.c().a("openType", this.h).b);
            com.meituan.android.cashier.oneclick.util.b.b(200);
        } else if (TextUtils.equals(str, "fail")) {
            com.meituan.android.paybase.common.analyse.a.a("b_pay_fbiur8lg_mc", new a.c().a("errorMessage", str2).a("openType", this.h).b);
            com.meituan.android.cashier.oneclick.util.b.b(1100031);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a("b_pay_68vfnny6_mc", "openoneclickpay 极速支付开启结果", new a.c().a("tradeNo", this.b).a("result", str).a("errorMessage", str2).b, ae.a.VIEW);
    }

    private void a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5709debeaa369dc509b01e7fc961edf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5709debeaa369dc509b01e7fc961edf");
            return;
        }
        if (exc instanceof PayException) {
            PayException payException = (PayException) exc;
            com.meituan.android.paybase.common.analyse.a.a("b_dfqxkh81", new a.c().a("code", Integer.valueOf(payException.getCode())).a("level", Integer.valueOf(payException.getLevel())).a("message", payException.getMessage()).b);
            int level = payException.getLevel();
            final String str = payException.getMessage() + payException.getErrorCodeStr();
            if (2 == level || 3 == level) {
                new PayDialog.a(this.z).c(exc.getMessage()).d(payException.getErrorCodeStr()).a(getString(R.string.paycommon__alert_btn_default_text), new BasePayDialog.c() { // from class: com.meituan.android.cashier.oneclick.fragment.MTCOneClickPayFragment.5
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
                    public final void a(Dialog dialog) {
                        Object[] objArr2 = {dialog};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e0ffff224324df622870b0922ad3e59", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e0ffff224324df622870b0922ad3e59");
                        } else {
                            MTCOneClickPayFragment.this.j(str);
                        }
                    }
                }).a().show();
            } else {
                j(str);
            }
        } else {
            j(this.z.getString(R.string.paycommon__error_msg_load_later));
        }
        n();
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8818fbc1797bef2b4902032747c0b68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8818fbc1797bef2b4902032747c0b68");
            return;
        }
        super.onAttach(context);
        this.z = (FragmentActivity) context;
        if (context instanceof i) {
            this.A = (i) context;
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05300936bf567bde1f0694f4f27d88d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05300936bf567bde1f0694f4f27d88d5");
            return;
        }
        super.onDetach();
        n();
        if (this.B != null) {
            this.B.removeCallbacks(null);
            this.B = null;
        }
        this.z = null;
        this.A = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02e0  */
    @Override // android.support.v4.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r19, int r20, android.content.Intent r21) {
        /*
            Method dump skipped, instructions count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.cashier.oneclick.fragment.MTCOneClickPayFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    private static String l(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b61b0426d86e5fdf19b9882d5a4bbbe3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b61b0426d86e5fdf19b9882d5a4bbbe3");
        }
        return "b_pay_" + str + "_sc";
    }

    private void m(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa50b634e7add8afab51fc805444d5b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa50b634e7add8afab51fc805444d5b7");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.p = jSONObject.optBoolean("fromGuide");
                this.M = jSONObject.optJSONObject("goOneClickPayData");
            } catch (JSONException e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "MTCOneClickPayFragment_getStartPayExtendParams", (Map<String, Object>) null);
            }
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestSucc(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8df373b5e07b75fe6b76d617275b5da2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8df373b5e07b75fe6b76d617275b5da2");
        } else if (obj == null || this.q) {
        } else {
            switch (i) {
                case 10:
                    OneClickPayRouteInfo oneClickPayRouteInfo = (OneClickPayRouteInfo) obj;
                    this.Q = oneClickPayRouteInfo;
                    b(oneClickPayRouteInfo);
                    return;
                case 11:
                    a((OpenOneClickPay) obj);
                    return;
                case 12:
                    OneClickPay oneClickPay = (OneClickPay) obj;
                    Object[] objArr2 = {oneClickPay};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b54f9caa9a206866da1857f6af2e30ad", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b54f9caa9a206866da1857f6af2e30ad");
                    } else if (oneClickPay != null) {
                        com.meituan.android.cashier.oneclick.util.a.b(this.k, "b_pay_oneclickpay_pay_succ_sc", com.meituan.android.neohybrid.neo.report.a.a().b);
                        q.c("oneclickpay_pay_succ", com.meituan.android.neohybrid.neo.report.a.a().b, r());
                        this.P = !TextUtils.isEmpty(oneClickPay.getVerifyQuitText()) ? oneClickPay.getVerifyQuitText() : getString(R.string.cashieroneclick__identify_quit_text);
                        if (!TextUtils.isEmpty(oneClickPay.getVerifyUrl())) {
                            final String verifyUrl = oneClickPay.getVerifyUrl();
                            String text = oneClickPay.getText();
                            Object[] objArr3 = {verifyUrl, 1, text};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "12750053e1857ce1c95c03c52776f9b0", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "12750053e1857ce1c95c03c52776f9b0");
                            } else if (!TextUtils.isEmpty(text)) {
                                this.C.setVisibility(0);
                                this.E.setVisibility(8);
                                i();
                                g(text);
                                if (this.B != null) {
                                    this.B.postDelayed(new Runnable() { // from class: com.meituan.android.cashier.oneclick.fragment.MTCOneClickPayFragment.3
                                        public static ChangeQuickRedirect a;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Object[] objArr4 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect4 = a;
                                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "77e02b02c76676330bd6234708d55032", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "77e02b02c76676330bd6234708d55032");
                                            } else {
                                                MTCOneClickPayFragment.this.a(verifyUrl, r3);
                                            }
                                        }
                                    }, 1500L);
                                }
                            }
                        } else if (oneClickPay.isAccept()) {
                            if (oneClickPay.getRoundQuery() != null) {
                                String queryUrl = oneClickPay.getRoundQuery().getQueryUrl();
                                if (!TextUtils.isEmpty(queryUrl)) {
                                    this.n = queryUrl;
                                }
                                int frequency = oneClickPay.getRoundQuery().getFrequency();
                                int duration = oneClickPay.getRoundQuery().getDuration();
                                this.s = frequency > 0 ? frequency : 1L;
                                this.t = duration > 0 ? duration : 6L;
                            }
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0af69b74ec5b66cf933a4678e32b6948", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0af69b74ec5b66cf933a4678e32b6948");
                            } else {
                                this.G = new g();
                                g gVar = this.G;
                                g.b bVar = new g.b() { // from class: com.meituan.android.cashier.oneclick.fragment.MTCOneClickPayFragment.4
                                    public static ChangeQuickRedirect a;

                                    @Override // com.meituan.android.paycommon.lib.utils.g.b
                                    public final Call a() {
                                        Object[] objArr5 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d432e072c0b0e0dd8187fdac1dc8fedb", RobustBitConfig.DEFAULT_VALUE) ? (Call) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d432e072c0b0e0dd8187fdac1dc8fedb") : MTCOneClickPayFragment.this.g();
                                    }

                                    @Override // com.meituan.android.paycommon.lib.utils.g.b
                                    public final void b() {
                                        Object[] objArr5 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "389f1a57d35f6bdeb9d33480ea7a378b", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "389f1a57d35f6bdeb9d33480ea7a378b");
                                        } else {
                                            MTCOneClickPayFragment.d(MTCOneClickPayFragment.this);
                                        }
                                    }
                                };
                                long j = this.s * 1000;
                                long j2 = this.t * 1000;
                                Object[] objArr5 = {bVar, new Long(j), new Long(j2)};
                                ChangeQuickRedirect changeQuickRedirect5 = g.a;
                                if (PatchProxy.isSupport(objArr5, gVar, changeQuickRedirect5, false, "d1de0d1a64da2bef035daf8193450d80", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, gVar, changeQuickRedirect5, false, "d1de0d1a64da2bef035daf8193450d80");
                                } else {
                                    gVar.c = bVar;
                                    gVar.d = j;
                                    gVar.b = false;
                                    gVar.f = new ArrayList();
                                    gVar.e = new g.a(gVar);
                                    gVar.e.sendEmptyMessage(1);
                                    gVar.e.sendEmptyMessageDelayed(2, j2);
                                }
                            }
                        } else {
                            a(oneClickPay.getText(), oneClickPay.getOneClickPayExtPrams());
                            com.meituan.android.paybase.common.analyse.a.a("b_pay_zyu00cjg_mc", new a.c().a("nb_version", com.meituan.android.paybase.config.a.d().q()).a("tradeNo", this.b).a("text", oneClickPay.getText()).a("message", oneClickPay.getOneclickpayErrmsg()).a("oneClickPayExt", oneClickPay.getOneClickPayExtPrams()).b);
                            com.meituan.android.cashier.oneclick.util.b.c(1100022);
                        }
                    }
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_a4clvbsw_mv", (Map<String, Object>) null);
                    return;
                case 13:
                    OneClickPayOrderState oneClickPayOrderState = (OneClickPayOrderState) obj;
                    Object[] objArr6 = {oneClickPayOrderState};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (!PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "4fc8fcb96d1f0401125dc1fde9df3ada", RobustBitConfig.DEFAULT_VALUE)) {
                        String action = oneClickPayOrderState.getAction();
                        if (this.K) {
                            this.K = false;
                            com.meituan.android.cashier.oneclick.util.a.b(this.n, "b_pay_oneclickpay_query_succ_sc", com.meituan.android.neohybrid.neo.report.a.a().b);
                            q.c("oneclickpay_query_succ", com.meituan.android.neohybrid.neo.report.a.a().b, r());
                        }
                        char c = 65535;
                        int hashCode = action.hashCode();
                        if (hashCode != -1867169789) {
                            if (hashCode != 3135262) {
                                if (hashCode == 1116313165 && action.equals("waiting")) {
                                    c = 1;
                                }
                            } else if (action.equals("fail")) {
                                c = 2;
                            }
                        } else if (action.equals("success")) {
                            c = 0;
                        }
                        switch (c) {
                            case 0:
                                this.v = System.currentTimeMillis();
                                com.meituan.android.cashier.oneclick.util.a.b(this.k, "b_pay_oneclick_pay_succ_sc", com.meituan.android.neohybrid.neo.report.a.a().b);
                                q.c("oneclick_pay_succ", com.meituan.android.neohybrid.neo.report.a.a().b, r());
                                n();
                                Object[] objArr7 = {oneClickPayOrderState};
                                ChangeQuickRedirect changeQuickRedirect7 = a;
                                if (!PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "d0f30a0f6acc569de356d6c766ab91c8", RobustBitConfig.DEFAULT_VALUE)) {
                                    long j3 = this.v - this.u;
                                    this.J = true;
                                    if (TextUtils.isEmpty(oneClickPayOrderState.getSuccessNotice())) {
                                        a(oneClickPayOrderState.getPromotion());
                                    } else {
                                        try {
                                            Object[] objArr8 = {oneClickPayOrderState};
                                            ChangeQuickRedirect changeQuickRedirect8 = a;
                                            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "92c1205c854b33c3896781a72c8858ee", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "92c1205c854b33c3896781a72c8858ee");
                                            } else {
                                                g(oneClickPayOrderState.getSuccessNotice());
                                                this.H.setAnimation("oneclickpay_succ.json");
                                                this.H.c(false);
                                                this.H.a();
                                                this.B.postDelayed(b.a(this, oneClickPayOrderState), oneClickPayOrderState.getToastDisplayTime());
                                            }
                                        } catch (Exception e) {
                                            a(oneClickPayOrderState.getPromotion());
                                            com.meituan.android.paybase.common.analyse.a.a(e, "MTCOneClickPayFragment_oneClickPaySucc", (Map<String, Object>) null);
                                        }
                                    }
                                    if (oneClickPayOrderState.getPromotion() != null) {
                                        com.meituan.android.paybase.common.analyse.a.a("b_pay_7w2gy58a_mv", (Map<String, Object>) null);
                                    }
                                    com.meituan.android.paybase.common.analyse.a.a("b_pay_ffi54rdt_mv", new a.c().a("tradeNo", this.b).b);
                                    q.a("b_pay_smi20fqe_mc", new a.c().a("totalTime", Long.valueOf(j3)).b, r());
                                    break;
                                } else {
                                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "d0f30a0f6acc569de356d6c766ab91c8");
                                    break;
                                }
                            case 2:
                                com.meituan.android.cashier.oneclick.util.a.a("b_pay_oneclick_pay_downgrade_to_standard_cashier_sc", com.meituan.android.neohybrid.neo.report.a.c(KnbConstants.PARAMS_SCENE, 5).b);
                                q.c("oneclick_pay_downgrade_to_standard_cashier", com.meituan.android.neohybrid.neo.report.a.c(KnbConstants.PARAMS_SCENE, 5).b, r());
                                n();
                                a(oneClickPayOrderState.getText(), oneClickPayOrderState.getOneClickPayExtPrams());
                                com.meituan.android.paybase.common.analyse.a.a("b_pay_04hrugfs_mc", new a.c().a("nb_version", com.meituan.android.paybase.config.a.d().q()).a("tradeNo", this.b).a("message", oneClickPayOrderState.getOneclickpayErrmsg()).b);
                                com.meituan.android.cashier.oneclick.util.b.c(1100023);
                                break;
                        }
                    } else {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "4fc8fcb96d1f0401125dc1fde9df3ada");
                    }
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_cmz98zs3_mv", (Map<String, Object>) null);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08f4eaf262f171f62947c132e5b281e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08f4eaf262f171f62947c132e5b281e7");
            return;
        }
        Object[] objArr2 = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "059a42de9ac0fa436ce7e8ae2d3d4283", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "059a42de9ac0fa436ce7e8ae2d3d4283");
        } else {
            String str = "";
            String str2 = "";
            String str3 = "";
            int i2 = -1;
            if (exc instanceof PayException) {
                PayException payException = (PayException) exc;
                str3 = payException.getErrorCodeStr();
                i2 = payException.getLevel();
                str2 = payException.getMessage();
            } else if (exc != null) {
                str2 = exc.getMessage();
            }
            switch (i) {
                case 10:
                    str = "b_pay_an20hz5j_mc";
                    break;
                case 11:
                    str = "b_pay_m5zq5q7a_mv";
                    break;
                case 12:
                    str = "b_pay_fook5lat_mv";
                    break;
                case 13:
                    str = "b_pay_uck7rldv_mv";
                    break;
            }
            if (!TextUtils.isEmpty(str)) {
                com.meituan.android.paybase.common.analyse.a.a(str, new a.c().a("nb_version", com.meituan.android.paybase.config.a.d().q()).a("tradeNo", this.b).a("code", str3).a("level", Integer.valueOf(i2)).a("message", str2).b);
            }
        }
        if (i == 13) {
            if (i == 13 && this.K) {
                this.K = false;
                com.meituan.android.cashier.oneclick.util.a.a(this.n, "b_pay_oneclickpay_query_fail_sc", exc);
                q.a("oneclickpay_query_fail", exc, r());
                com.meituan.android.cashier.oneclick.util.a.a("b_pay_oneclick_pay_downgrade_to_standard_cashier_sc", com.meituan.android.neohybrid.neo.report.a.c(KnbConstants.PARAMS_SCENE, 5).b);
                q.c("oneclick_pay_downgrade_to_standard_cashier", com.meituan.android.neohybrid.neo.report.a.c(KnbConstants.PARAMS_SCENE, 5).b, r());
            }
        } else if (i == 10) {
            com.meituan.android.cashier.oneclick.util.a.a("/cashier/oneclickpaydispatcher", "b_pay_cashier_oneclickpaydispatcher_fail_sc", exc);
            q.a("pay_cashier_oneclickpaydispatcher_fail", exc, r());
            com.meituan.android.cashier.oneclick.util.a.a("b_pay_oneclick_pay_downgrade_to_standard_cashier_sc", com.meituan.android.neohybrid.neo.report.a.c(KnbConstants.PARAMS_SCENE, 1).b);
            q.c("oneclick_pay_downgrade_to_standard_cashier", com.meituan.android.neohybrid.neo.report.a.c(KnbConstants.PARAMS_SCENE, 1).b, r());
            if (exc instanceof PayException) {
                a(exc);
                return;
            }
            n("路由接口返回异常");
            if (!p()) {
                com.meituan.android.cashier.oneclick.util.b.c(1100024);
                return;
            }
            com.meituan.android.cashier.oneclick.util.a.b("result_extra_error_level", "b_pay_oneclick_pay_start_succ_sc", null);
            q.c("oneclick_pay_start_succ", com.meituan.android.neohybrid.neo.report.a.a().b, r());
        } else {
            if (i == 11) {
                com.meituan.android.cashier.oneclick.util.a.a(this.j, "b_pay_oneclickpay_open_fail_sc", exc);
                q.a("oneclickpay_open_fail", exc, r());
                com.meituan.android.cashier.oneclick.util.b.b(1100031);
                com.meituan.android.cashier.oneclick.util.a.a("b_pay_oneclick_pay_downgrade_to_standard_cashier_sc", com.meituan.android.neohybrid.neo.report.a.c(KnbConstants.PARAMS_SCENE, 2).b);
                q.c("oneclick_pay_downgrade_to_standard_cashier", com.meituan.android.neohybrid.neo.report.a.c(KnbConstants.PARAMS_SCENE, 2).b, r());
            } else if (i == 12) {
                com.meituan.android.cashier.oneclick.util.a.a("b_pay_oneclick_pay_downgrade_to_standard_cashier_sc", com.meituan.android.neohybrid.neo.report.a.c(KnbConstants.PARAMS_SCENE, 4).b);
                q.c("oneclick_pay_downgrade_to_standard_cashier", com.meituan.android.neohybrid.neo.report.a.c(KnbConstants.PARAMS_SCENE, 4).b, r());
                com.meituan.android.cashier.oneclick.util.a.a(this.k, "b_pay_oneclickpay_pay_fail_sc", exc);
                q.a("oneclickpay_pay_fail", exc, r());
                com.meituan.android.cashier.oneclick.util.b.d(1100011);
            }
            a(exc);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestStart(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ab49dd238497e837b8e4bfe086a0372", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ab49dd238497e837b8e4bfe086a0372");
        } else if (i == 12) {
            this.u = System.currentTimeMillis();
        }
    }

    private boolean p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e172bf1289a1b0a0202a4ee02c30fbd8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e172bf1289a1b0a0202a4ee02c30fbd8")).booleanValue() : TextUtils.equals(this.g, "0");
    }

    private void n(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30bdff8c31e339899403c3207d6a5388", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30bdff8c31e339899403c3207d6a5388");
            return;
        }
        if (p()) {
            d("");
        } else {
            l();
        }
        a("b_pay_cew0r25d_mc", new a.c().a("errorMsg", str).b);
    }

    private String q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86d0e445d7b83c8adb81f6fb6d5af9d8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86d0e445d7b83c8adb81f6fb6d5af9d8");
        }
        if (TextUtils.isEmpty(this.e)) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("outer_business_statics", this.e);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "MTCOneClickPayFragment_getExtDimStat", (Map<String, Object>) null);
        }
        return jSONObject.toString();
    }

    private void o(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74554c2be6328611623aa3aa6b72f291", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74554c2be6328611623aa3aa6b72f291");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.j = str;
        }
    }

    private void p(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a660fa7f211ca77c46ae3628c9b3105", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a660fa7f211ca77c46ae3628c9b3105");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.k = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, HashMap<String, Object> hashMap, ae.a aVar) {
        Object[] objArr = {str, str2, hashMap, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "631b6b3f4cc4fa3b51f130e7e3fc4b63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "631b6b3f4cc4fa3b51f130e7e3fc4b63");
        } else {
            q.a("c_pay_shlovp62", str, str2, hashMap, aVar, r());
        }
    }

    private void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4633503634a7e24dfc9136d4eb435632", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4633503634a7e24dfc9136d4eb435632");
        } else {
            q.a(str, map, "c_pay_shlovp62", r());
        }
    }

    private void a(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14feaa5b09672db6287ba7d0e31c40f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14feaa5b09672db6287ba7d0e31c40f9");
            return;
        }
        com.meituan.android.cashier.oneclick.util.a.a(this.j, "b_pay_oneclickpay_open_start_sc", (Map<String, Object>) null);
        q.a("oneclickpay_open_start", r());
        ((OneClickRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(OneClickRequestService.class, this, 11)).openOneClickPay(this.j, this.L ? 4 : 1, str, str2, str3, str4, com.meituan.android.paycommon.lib.config.a.a().o(), this.d, q(), 8000L, this.N);
        com.meituan.android.paybase.common.analyse.a.a("b_pay_nruwbre4_mv", new a.c().a("openType", this.h).a("creditPayUtmSource", this.l).b);
    }

    public final void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42487f795482253dd13ead9bd4809fbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42487f795482253dd13ead9bd4809fbc");
            return;
        }
        this.O = i;
        if (TextUtils.isEmpty(str)) {
            com.meituan.android.cashier.oneclick.util.b.b();
        }
        al.a(this, str, 21);
        com.meituan.android.paybase.common.analyse.a.a("b_pay_xweunckr_mv", (Map<String, Object>) null);
        a("b_pay_88layuvl_mc", "拉起独立验证", new a.c().a("tradeNo", this.b).b, ae.a.VIEW);
    }
}
