package com.meituan.android.wallet.scheme;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.dianping.titans.js.JsHandlerFactory;
import com.google.gson.JsonObject;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cashier.bean.CashierRouterPreGuideHornConfig;
import com.meituan.android.cashier.common.m;
import com.meituan.android.cashier.common.q;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.dialog.e;
import com.meituan.android.paybase.downgrading.a;
import com.meituan.android.paybase.utils.MTPayNeedToPersist;
import com.meituan.android.paybase.utils.al;
import com.meituan.android.paybase.utils.i;
import com.meituan.android.paybase.utils.j;
import com.meituan.android.paycommon.lib.fragment.HalfPageFragment;
import com.meituan.metrics.common.Constants;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mesh.bean.MeshBaseUrl;
import com.sankuai.mesh.core.c;
import com.sankuai.mesh.util.d;
import com.sankuai.waimai.platform.utils.f;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SchemeRouteActivity extends PayBaseActivity {
    public static ChangeQuickRedirect a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    @MTPayNeedToPersist
    private boolean g;
    @MTPayNeedToPersist
    private String h;
    @MTPayNeedToPersist
    private String i;
    @MTPayNeedToPersist
    private String q;
    @MTPayNeedToPersist
    private int r;
    @MTPayNeedToPersist
    private boolean s;
    @MTPayNeedToPersist
    private boolean t;
    @MTPayNeedToPersist
    private String u;
    @MTPayNeedToPersist
    private String v;

    public SchemeRouteActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19526a6eda31d214c150708807e205b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19526a6eda31d214c150708807e205b2");
            return;
        }
        this.b = "https://npay.meituan.com/resource/ibalance/index.html?";
        this.c = "https://npay.meituan.com/portal/bindcard/bankcard-list.html?";
        this.d = "https://npay.meituan.com/resource/pay-settings/index.html?";
        this.e = "https://npay.meituan.com/portal/bindcard/bankcard-list.html#/bankcard-quota?";
        this.f = "https://npay.meituan.com/resource/conch-hybrid/index.html?future=2&notitlebar=1";
        this.g = false;
        this.r = -1;
        this.s = true;
        this.t = true;
        this.u = "";
        this.v = "";
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18d60fe93522e571243d93125294c146", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18d60fe93522e571243d93125294c146");
            return;
        }
        super.onCreate(bundle);
        if (getSupportActionBar() != null) {
            getSupportActionBar().c();
        }
        getWindow().setBackgroundDrawableResource(R.color.paybase__transparent);
        if (TextUtils.equals(a.a().a("balance_page_link"), "b")) {
            try {
                JSONObject jSONObject = new JSONObject(a.a().b("balance_page_link"));
                if (!TextUtils.isEmpty(jSONObject.get("balance_page_link").toString())) {
                    this.b = jSONObject.get("balance_page_link").toString();
                    this.c = jSONObject.get("bankcard_page_link").toString();
                    this.d = jSONObject.get("pay_set_page_link").toString();
                    this.e = jSONObject.get("bankcard_quota_page_link").toString();
                }
                if (TextUtils.isEmpty(jSONObject.get("offline_native_page_wallet_main").toString())) {
                    return;
                }
                this.f = jSONObject.get("offline_native_page_wallet_main").toString();
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a(e);
            }
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "343eb9a47e39abadb027379d3a82a657", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "343eb9a47e39abadb027379d3a82a657");
        } else if (this.s) {
            this.s = false;
            Uri data = getIntent().getData();
            this.h = data.getQueryParameter("destUrl");
            this.i = data.getQueryParameter("meshUrl");
            this.q = d(this.h);
            if (!TextUtils.isEmpty(data.getQueryParameter(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY))) {
                try {
                    this.r = Integer.parseInt(data.getQueryParameter(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY));
                } catch (Exception e) {
                    com.meituan.android.paybase.common.analyse.a.a(e, "SchemeRouteActivity_openActivityRequestedByMesh", (Map<String, Object>) null);
                }
            }
            if (TextUtils.isEmpty(this.h)) {
                return;
            }
            j.a(this, this.h, this.r);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6855eb1ee3b41fcfaddca1b3d0c0adcf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6855eb1ee3b41fcfaddca1b3d0c0adcf");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("tradeNo", this.q);
            hashMap.put("meshBaseUrl", this.i);
            hashMap.put("destUrl", this.h);
            d.a("b_pay_mesh_cashier_open_sc", hashMap);
        }
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        boolean z;
        Uri data;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaecef29ba85c96e45d407de22c6d315", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaecef29ba85c96e45d407de22c6d315");
            return;
        }
        super.onStart();
        Intent intent = getIntent();
        Object[] objArr2 = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9a4010d79e0be59072318cbb8885209b", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9a4010d79e0be59072318cbb8885209b")).booleanValue();
        } else {
            if (intent != null && (data = intent.getData()) != null) {
                String host = data.getHost();
                String path = data.getPath();
                if (TextUtils.equals(host, "halfpage") && TextUtils.equals(path, "/launch")) {
                    z = true;
                }
            }
            z = false;
        }
        if (z) {
            if (this.t) {
                this.t = false;
                i();
            }
        } else if (com.meituan.android.paycommon.lib.config.a.a() != null && com.meituan.android.paycommon.lib.config.a.a().s() != null && com.meituan.android.paycommon.lib.config.a.a().s().a(this)) {
            i();
        } else if (!this.g) {
            if (com.meituan.android.paycommon.lib.config.a.a() != null && com.meituan.android.paycommon.lib.config.a.a().s() != null) {
                com.meituan.android.paycommon.lib.config.a.a().s().b(this);
                this.g = true;
                return;
            }
            finish();
        } else {
            finish();
        }
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6ff11681a0e964b7cc3dca918933ef8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6ff11681a0e964b7cc3dca918933ef8");
            return;
        }
        try {
            if (getIntent() != null) {
                a(getIntent().getData());
                return;
            }
            finish();
            com.meituan.android.paybase.common.analyse.cat.a.a("externalStartError", "外部应用调起异常");
        } catch (Exception e) {
            j.a(this, "SchemeRouteActivity_onStart", e, false);
            finish();
            com.meituan.android.paybase.common.analyse.cat.a.a("externalStartError", "外部应用调起异常");
        }
    }

    private void a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a47df2a6aec326844523a75f2cbe889f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a47df2a6aec326844523a75f2cbe889f");
        } else if (uri != null) {
            String host = uri.getHost();
            String path = uri.getPath();
            if ("payment".equals(host)) {
                String a2 = a(uri.getQueryParameter("page_id"), uri.getQuery());
                if (!TextUtils.isEmpty(a2)) {
                    al.a(this, a2);
                    b(a2);
                } else {
                    com.meituan.android.paybase.common.analyse.cat.a.a("urlIsNull", "路由页面获取的下一步跳转链接为空");
                }
                finish();
                return;
            }
            if (TextUtils.equals(path, "/verifyvoiceprint") || TextUtils.equals(path, "/voiceprint/settings") || TextUtils.equals(path, "/paymanagement/deductpaylist") || TextUtils.equals(path, "/fingerprint/settings") || TextUtils.equals(path, "/moduleViewController")) {
                e.a(this, Integer.valueOf((int) R.string.paybase__start_page_exception_alert), e.a.TOAST_TYPE_EXCEPTION);
                b(path);
            } else if (TextUtils.equals(host, "wallet") && TextUtils.equals(path, "/accountbalance")) {
                al.a(this, a(this.b, uri));
                b(path);
            } else if (TextUtils.equals(path, "/paymanagement")) {
                al.a(this, a(this.d, uri));
                b(path);
            } else if (TextUtils.equals(host, "halfpage") && TextUtils.equals(path, "/launch")) {
                q.b("b_pay_direct_halfpage_start_sc", new a.c().a(Constants.TRAFFIC_URI, uri).b, p());
                q.a("direct_halfpage_start", new a.c().a(Constants.TRAFFIC_URI, uri).b, (List<Float>) null, p());
                b(uri);
                return;
            } else if (TextUtils.equals(path, "/bankcardbinding") || TextUtils.equals(path, "/bankcardlist") || TextUtils.equals(path, "/awp/hfe/block/4323/index.html")) {
                al.a(this, a(this.c, uri));
                b(path);
            } else if (TextUtils.equals(path, "/bankcardpayLimit")) {
                al.a(this, a(this.e, uri));
                b(path);
            } else if (TextUtils.equals(path, "/launch")) {
                al.a(this, this.f);
                com.meituan.android.paybase.common.analyse.a.a("b_pay_5m5bku5t_mv", new a.c().a("schemeURL", path).b);
            } else if (TextUtils.equals(host, "meshRoute")) {
                if (TextUtils.equals(path, "/openForResult")) {
                    g();
                    return;
                }
                return;
            }
            finish();
        } else {
            finish();
        }
    }

    private CashierRouterPreGuideHornConfig a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46f1a2150a5c8ff488834a18d71b2c72", RobustBitConfig.DEFAULT_VALUE)) {
            return (CashierRouterPreGuideHornConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46f1a2150a5c8ff488834a18d71b2c72");
        }
        List<CashierRouterPreGuideHornConfig> b = m.a().b();
        if (i.a((Collection) b)) {
            return null;
        }
        for (CashierRouterPreGuideHornConfig cashierRouterPreGuideHornConfig : b) {
            if (cashierRouterPreGuideHornConfig != null && TextUtils.equals(cashierRouterPreGuideHornConfig.getCashierType(), str)) {
                return cashierRouterPreGuideHornConfig;
            }
        }
        return null;
    }

    private void b(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "542be3c988532dc5c135295f07c26c92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "542be3c988532dc5c135295f07c26c92");
        } else if (uri != null) {
            try {
                String queryParameter = uri.getQueryParameter("target_scene");
                CashierRouterPreGuideHornConfig a2 = a(queryParameter);
                this.u = uri.getQueryParameter("url");
                String queryParameter2 = uri.getQueryParameter("initial_data");
                String queryParameter3 = uri.getQueryParameter("background_color");
                String queryParameter4 = uri.getQueryParameter("loading_timeout");
                if (a2 != null) {
                    if (!TextUtils.isEmpty(a2.getUrl()) && (TextUtils.isEmpty(this.u) || a2.isCoverUrl())) {
                        if (!a2.getUrl().startsWith(AbsApiFactory.HTTPS) && !a2.getUrl().startsWith(AbsApiFactory.HTTP)) {
                            this.u = com.meituan.android.neohybrid.init.a.e() + a2.getUrl().trim();
                        }
                        this.u = a2.getUrl().trim();
                    }
                    if (TextUtils.isEmpty(queryParameter3)) {
                        queryParameter3 = a2.getBackgroundColor();
                    }
                    if (TextUtils.isEmpty(queryParameter4)) {
                        queryParameter4 = String.valueOf(a2.getLoadingTimeOut());
                    }
                }
                String queryParameter5 = uri.getQueryParameter("request_url");
                String queryParameter6 = uri.getQueryParameter("request_data");
                this.v = uri.getQueryParameter("notice_name");
                if (!TextUtils.isEmpty(this.u) && !TextUtils.isEmpty(queryParameter)) {
                    HalfPageFragment.a aVar = new HalfPageFragment.a("half_page_" + queryParameter, this.u, queryParameter2, 99);
                    aVar.f = queryParameter3;
                    aVar.g = queryParameter4;
                    aVar.h = queryParameter5;
                    aVar.i = queryParameter6;
                    HalfPageFragment.a(this, aVar);
                    return;
                }
                a(19992, "fail", "");
                com.meituan.android.paybase.common.analyse.cat.a.a("SchemeRouteActivity", "openHalfPage url or targetScene is null");
                finish();
            } catch (Exception e) {
                a(19992, "fail", "");
                com.meituan.android.paybase.common.analyse.a.a(e, "SchemeRouteActivity_openHalfPage", new a.c().a("url", this.u).b);
                finish();
            }
        } else {
            a(19991, "fail", "");
            com.meituan.android.paybase.common.analyse.cat.a.a("SchemeRouteActivity", "openHalfPage uri is null");
            finish();
        }
    }

    private void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fca4955abd80e3b7e3fd05530c27e62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fca4955abd80e3b7e3fd05530c27e62");
        } else {
            com.meituan.android.paybase.common.analyse.a.a("b_pay_jqtihc31_mv", "", new a.c().a("schemeURL", str).b, a.EnumC0329a.VIEW, -1);
        }
    }

    private String a(String str, Uri uri) {
        Object[] objArr = {str, uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7964baf72da73ae82b36eff99f20d2d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7964baf72da73ae82b36eff99f20d2d2");
        }
        StringBuilder sb = new StringBuilder(str);
        if (uri != null) {
            if (!TextUtils.isEmpty(uri.getQueryParameter(KnbConstants.PARAMS_SCENE))) {
                sb.append("scene=" + uri.getQueryParameter(KnbConstants.PARAMS_SCENE));
            } else {
                sb.append("scene=default");
            }
            if (!TextUtils.isEmpty(uri.getQueryParameter("entry"))) {
                sb.append("&");
                sb.append("entry=" + uri.getQueryParameter("entry"));
            } else {
                sb.append("&");
                sb.append("entry=default");
            }
            if (!TextUtils.isEmpty(uri.getQueryParameter("merchant_no"))) {
                sb.append("&");
                sb.append("merchant_no=" + uri.getQueryParameter("merchant_no"));
            } else {
                sb.append("&");
                sb.append("merchant_no=10003");
            }
            if (!TextUtils.isEmpty(uri.getQueryParameter("bankcardId"))) {
                sb.append("&");
                sb.append("bankcardId=" + uri.getQueryParameter("bankcardId"));
            }
            return sb.toString();
        }
        return str;
    }

    private String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06e048264760b8d4a99d7b43a403eb81", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06e048264760b8d4a99d7b43a403eb81");
        }
        String str3 = "";
        if (TextUtils.equals("b", com.meituan.android.paybase.downgrading.a.a().a("route_map"))) {
            str3 = c(str);
        } else if (TextUtils.equals(str, "1000001")) {
            str3 = "meituanpayment://wallet/bankcardbinding";
        } else if (TextUtils.equals(str, "1000002")) {
            str3 = "meituanpayment://facepay/openfacepay";
        } else if (TextUtils.equals(str, "1000010")) {
            str3 = "meituanpayment://www.meituan.com/web";
        }
        return str3 + CommonConstant.Symbol.QUESTION_MARK + str2;
    }

    private String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11115d106efd90f82558becf1c349657", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11115d106efd90f82558becf1c349657");
        }
        try {
            return new JSONObject(com.meituan.android.paybase.downgrading.a.a().b("route_map")).getString(str);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "SchemeRouteActivity_getRouteMap", (Map<String, Object>) null);
            return "";
        }
    }

    @Override // com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dbc6178bcfd324fbe6a5c7e8d9af612", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dbc6178bcfd324fbe6a5c7e8d9af612");
            return;
        }
        super.onDestroy();
        this.g = false;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, final int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "244a57bb6dd06d5710100f4f55b53013", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "244a57bb6dd06d5710100f4f55b53013");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        if (i == this.r) {
            Object[] objArr2 = {Integer.valueOf(i2), intent};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "230852fc450db090a739821125405d6e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "230852fc450db090a739821125405d6e");
            } else {
                MeshBaseUrl a2 = com.sankuai.mesh.util.e.a(this.i);
                String str = "unknow";
                if (i2 == -1) {
                    if (intent != null && intent.hasExtra("result")) {
                        int a3 = f.a(intent, "result", -1);
                        if (a3 == 1) {
                            a2.setStatus("success");
                            str = "success";
                        } else if (a3 == 2) {
                            a2.setStatus("fail");
                            JsonObject jsonObject = new JsonObject();
                            jsonObject.addProperty("errorCode", (Number) 11);
                            jsonObject.addProperty("errorMsg", "支付失败");
                            a2.setError(jsonObject);
                            str = "fail";
                        } else {
                            a2.setStatus("fail");
                        }
                    }
                } else if (i2 == 0) {
                    a2.setStatus("fail");
                    JsonObject jsonObject2 = new JsonObject();
                    jsonObject2.addProperty("errorCode", (Number) 12);
                    jsonObject2.addProperty("errorMsg", "支付取消");
                    a2.setError(jsonObject2);
                    str = "cancel";
                }
                String str2 = str;
                Object[] objArr3 = {a2, str2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3a90bc6f03d3c325e32127a1aeccdb05", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3a90bc6f03d3c325e32127a1aeccdb05");
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("tradeNo", this.q);
                    hashMap.put("meshBaseUrl", a2.toString());
                    hashMap.put("destUrl", this.h);
                    hashMap.put("payStatus", str2);
                    d.a("b_pay_mesh_cashier_finish_sc", hashMap);
                }
                com.sankuai.mesh.core.e.a(this, a2, (c.a) null);
                finish();
            }
        } else if (i == 99) {
            Object[] objArr4 = {Integer.valueOf(i2), intent};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9fb65cc1eaa5cc807fd8d7715e1b9ca4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9fb65cc1eaa5cc807fd8d7715e1b9ca4");
            } else {
                HalfPageFragment.a(i2, intent, new HalfPageFragment.b() { // from class: com.meituan.android.wallet.scheme.SchemeRouteActivity.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.paycommon.lib.fragment.HalfPageFragment.b
                    public final void a(int i3, String str3) {
                        Object[] objArr5 = {Integer.valueOf(i3), str3};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "2a7acbc076ddd1017f8af96ad2b6d378", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "2a7acbc076ddd1017f8af96ad2b6d378");
                            return;
                        }
                        SchemeRouteActivity.this.a(i2, "fail", "");
                        SchemeRouteActivity.this.finish();
                    }

                    @Override // com.meituan.android.paycommon.lib.fragment.HalfPageFragment.b
                    public final void a(String str3) {
                        Object[] objArr5 = {str3};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "54a5152c9596b03e2b6ff610add59a30", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "54a5152c9596b03e2b6ff610add59a30");
                            return;
                        }
                        SchemeRouteActivity.this.a(i2, "success", str3);
                        SchemeRouteActivity.this.finish();
                    }
                });
            }
        }
        com.meituan.android.privacy.aop.a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7641e5dd9cd0b940c1faebdc9a85259a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7641e5dd9cd0b940c1faebdc9a85259a");
            return;
        }
        q.b("b_pay_direct_halfpage_callback_result_sc", new a.c().a("action", this.v).a("halfpage_status", str).a("halfpage_result", str2).b, p());
        q.a("direct_halfpage_callback_result", new a.c().a("action", this.v).a("halfpage_status", str).a("halfpage_result", str2).b, (List<Float>) null, p());
        Intent intent = new Intent();
        intent.putExtra("halfpage_status", str);
        intent.putExtra("halfpage_result", str2);
        setResult(i, intent);
        if (TextUtils.isEmpty(this.v)) {
            return;
        }
        a(this.v, str, str2);
        b(this.v, str, str2);
    }

    private void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0650557bee64cd226f9f7318eab442e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0650557bee64cd226f9f7318eab442e6");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", str);
            jSONObject.put("halfpage_status", str2);
            jSONObject.put("halfpage_result", str3);
            JsHandlerFactory.publish(jSONObject);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "SchemeRouteActivity_publishHalfPageResultToH5", new a.c().a("action", str).a("halfpage_status", str2).a("halfpage_result", str3).b);
        }
    }

    private void b(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "145e57c809ec825809c8a46b5e86a657", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "145e57c809ec825809c8a46b5e86a657");
            return;
        }
        try {
            Intent intent = new Intent(str);
            intent.putExtra("halfpage_status", str2);
            intent.putExtra("halfpage_result", str3);
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "SchemeRouteActivity_publishHalfPageResultToNative", new a.c().a("action", str).a("halfpage_status", str2).a("halfpage_result", str3).b);
        }
    }

    private String d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "400d17c00e1173d5c277ece4f6cc924d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "400d17c00e1173d5c277ece4f6cc924d");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Uri.parse(str).getQueryParameter("trade_number");
        } catch (Exception unused) {
            return null;
        }
    }
}
