package com.meituan.android.cashier.mtpay;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cashier.activity.MTCashierActivity;
import com.meituan.android.cashier.bean.CashierParams;
import com.meituan.android.cashier.bean.CashierProductInfo;
import com.meituan.android.cashier.bean.ClientRouterInfoBean;
import com.meituan.android.cashier.bean.ClientRouterParamBean;
import com.meituan.android.cashier.common.ICashier;
import com.meituan.android.cashier.common.i;
import com.meituan.android.cashier.common.q;
import com.meituan.android.cashier.common.s;
import com.meituan.android.cashier.common.u;
import com.meituan.android.cashier.model.bean.MTPaymentURL;
import com.meituan.android.cashier.retrofit.CashierRequestService;
import com.meituan.android.pay.jshandler.HybridSignPayJSHandler;
import com.meituan.android.pay.model.bean.RetainDisplayCloseInfoBean;
import com.meituan.android.pay.utils.l;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.downgrading.c;
import com.meituan.android.paybase.downgrading.d;
import com.meituan.android.paybase.moduleinterface.payment.PayActionListener;
import com.meituan.android.paybase.moduleinterface.payment.PayFailInfo;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.retrofit.b;
import com.meituan.android.paybase.utils.MTPayBaseClass;
import com.meituan.android.paybase.utils.aa;
import com.meituan.android.paybase.utils.ac;
import com.meituan.android.paybase.utils.e;
import com.meituan.android.paybase.utils.n;
import com.meituan.android.paybase.utils.r;
import com.meituan.android.paycommon.lib.coupon.model.Promotion;
import com.meituan.android.paycommon.lib.utils.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@MTPayBaseClass
/* loaded from: classes2.dex */
public class HybridPrePosedMTCashierAdapter extends u implements PayActionListener {
    public static ChangeQuickRedirect a;
    private CashierParams b;
    private MTCashierActivity c;
    private Call<MTPaymentURL> d;
    private ClientRouterInfoBean e;
    private boolean f;
    private final a g;
    private BroadcastReceiver h;

    @Override // com.meituan.android.paybase.moduleinterface.payment.PayActionListener
    public final void b(String str) {
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.v
    public final void b(boolean z) {
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.h
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "165e5adc6fcb43a88b6ea902078981d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "165e5adc6fcb43a88b6ea902078981d5");
        }
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.h
    public final boolean h() {
        return false;
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.ICashier
    public final String i() {
        return "hybrid_preposed_mtcashier";
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.paybase.retrofit.b
    public void onRequestFinal(int i) {
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.paybase.retrofit.b
    public void onRequestStart(int i) {
    }

    public HybridPrePosedMTCashierAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d270b00aea0a1e11abbc26e408cc4f5e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d270b00aea0a1e11abbc26e408cc4f5e");
        } else {
            this.g = new a();
        }
    }

    @Override // com.meituan.android.cashier.common.ICashier
    public final <T extends FragmentActivity & i & b> ICashier.a a(T t, CashierParams cashierParams) {
        String productType;
        ClientRouterInfoBean clientRouterInfoBean;
        boolean z;
        Object[] objArr = {t, cashierParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b983544fd0f832664f2776dc7437df0", RobustBitConfig.DEFAULT_VALUE)) {
            return (ICashier.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b983544fd0f832664f2776dc7437df0");
        }
        this.b = cashierParams;
        this.c = (MTCashierActivity) t;
        Object[] objArr2 = {cashierParams};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a9587071c2704c7071bd90a012c56248", RobustBitConfig.DEFAULT_VALUE)) {
            productType = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a9587071c2704c7071bd90a012c56248");
        } else {
            productType = cashierParams == null ? "" : cashierParams.getProductType();
        }
        if ("preposed-mtcashier".equals(productType)) {
            Object[] objArr3 = {cashierParams};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d67a450be50bc67d91b66200a3be8a41", RobustBitConfig.DEFAULT_VALUE)) {
                return (ICashier.a) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d67a450be50bc67d91b66200a3be8a41");
            }
            a aVar = this.g;
            Object[] objArr4 = {cashierParams};
            ChangeQuickRedirect changeQuickRedirect4 = a.a;
            if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "dce59c4791227c5202bbb1b506d0894a", RobustBitConfig.DEFAULT_VALUE)) {
                clientRouterInfoBean = (ClientRouterInfoBean) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "dce59c4791227c5202bbb1b506d0894a");
            } else {
                if (aVar.b == null) {
                    if (cashierParams != null) {
                        aVar.b = aVar.a(cashierParams.getPreDispatcherCashierConfig("hybrid_preposed_mtcashier"));
                    }
                    if (aVar.b == null) {
                        String str = s.a().b;
                        if (TextUtils.isEmpty(str)) {
                            clientRouterInfoBean = null;
                        } else {
                            aVar.b = aVar.a(str);
                        }
                    }
                }
                clientRouterInfoBean = aVar.b;
            }
            this.e = clientRouterInfoBean;
            if (!a(this.b)) {
                return new ICashier.a(true);
            }
            if (this.e == null) {
                return new ICashier.a(false, "001", "config is empty");
            }
            String cashierUrl = this.e.getCashierUrl();
            if (TextUtils.isEmpty(cashierUrl)) {
                return new ICashier.a(false, "002", "cashier url is empty");
            }
            if (cashierParams.getCashierRouterInfo() == null) {
                return new ICashier.a(false, "003", "cashierRouterInfo is null");
            }
            if (TextUtils.isEmpty(cashierParams.getCashierRouterInfo().getProductInfo().getPath())) {
                return new ICashier.a(false, "004", "cashierRouterInfo.path is null");
            }
            HashMap<String, Object> nestConfigurations = this.e.getNestConfigurations();
            if (nestConfigurations == null) {
                return new ICashier.a(true);
            }
            if (((Boolean) nestConfigurations.get("enable_degrade")).booleanValue()) {
                return new ICashier.a(false, "005", "enable_degrade");
            }
            if (((Boolean) nestConfigurations.get("enable_offline_degrade")).booleanValue()) {
                Object[] objArr5 = {cashierUrl};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a3bce4707388f438b1eab38e340a1f70", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a3bce4707388f438b1eab38e340a1f70")).booleanValue();
                } else {
                    List<String> globalOfflineHybridMtp = ClientRouterParamBean.createClientRouterParamBean().getGlobalOfflineHybridMtp();
                    if (!com.meituan.android.paybase.utils.i.a((Collection) globalOfflineHybridMtp)) {
                        for (String str2 : globalOfflineHybridMtp) {
                            if (TextUtils.equals(a(str2), a(cashierUrl))) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                }
                if (z) {
                    return new ICashier.a(true);
                }
                return new ICashier.a(false, "006", "offline degrade");
            }
            return new ICashier.a(true);
        }
        return new ICashier.a(false, "007", "productType is not preposed-mtcashier");
    }

    private String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "885c148f4abeddd58c272fcc6eb29220", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "885c148f4abeddd58c272fcc6eb29220");
        }
        if (str.startsWith("http:") || str.startsWith("https:")) {
            return Uri.parse(str).getPath();
        }
        return str.contains(CommonConstant.Symbol.QUESTION_MARK) ? str.substring(0, str.indexOf(63)) : str;
    }

    private void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52dd8ab1754e26162eca760b5600d7cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52dd8ab1754e26162eca760b5600d7cf");
            return;
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "007a9305343ce5da3ced2c596fffdfac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "007a9305343ce5da3ced2c596fffdfac");
        } else if (this.c != null) {
            this.c.b("hybrid_preposed_mtcashier", RetainDisplayCloseInfoBean.TYPE_STANDARDCASHIER, str);
        }
    }

    @Override // com.meituan.android.cashier.common.u
    public final void a(String str, Map<String, Object> map) {
        String o;
        HashMap<String, String> hashMap;
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24113f2d6b699957fbd07d94e4cb723b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24113f2d6b699957fbd07d94e4cb723b");
            return;
        }
        CashierProductInfo productInfo = this.b.getCashierRouterInfo().getProductInfo();
        l.a(c(false), this.p);
        l.b(this.p);
        HashMap<String, String> d = d(productInfo.getNextReqParams());
        com.meituan.android.cashier.retrofit.a.a(d, d());
        Object[] objArr2 = {d};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c81c16a2d1d34cd8e5fbebb5f36d7d82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c81c16a2d1d34cd8e5fbebb5f36d7d82");
        } else {
            d.put("payExtendParams", com.meituan.android.cashier.retrofit.a.a(d.get("payExtendParams"), "transmission_param", a()));
        }
        m.a(this.c, d);
        l.a("cashier/gohellopay", "b_pay_cashier_gohellopay_start_sc", (Map<String, Object>) null, this.p);
        l.a("cashier_gohellopay_start", this.p);
        c cVar = d.a().b;
        if (cVar != null && cVar.i) {
            o = com.meituan.android.neohybrid.cache.a.b();
            this.f = cVar.i;
        } else {
            o = com.meituan.android.paycommon.lib.config.a.a().o();
            this.f = false;
        }
        String str2 = o;
        l.a("b_pay_i1x8qph2_sc", (Map<String, Object>) new a.c().a("is_asyn_fingerprint_open", Boolean.valueOf(this.f)).b, this.p);
        CashierRequestService cashierRequestService = (CashierRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(CashierRequestService.class, this.c, 10);
        String path = productInfo.getPath();
        Object[] objArr3 = {d, productInfo};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "803f9cdfeb93e76b0294d78b47323fab", RobustBitConfig.DEFAULT_VALUE)) {
            hashMap = (HashMap) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "803f9cdfeb93e76b0294d78b47323fab");
        } else {
            if (d == null) {
                d = new HashMap<>();
            }
            hashMap = d;
            hashMap.put("tradeno", this.b.getTradeNo());
            hashMap.put("pay_token", this.b.getPayToken());
            hashMap.put("guide_plan_infos", d());
            hashMap.put("nb_hybrid_version", c());
            hashMap.put("submit_path", productInfo.getPath());
            hashMap.put("nb_container", "hybrid");
        }
        this.d = cashierRequestService.goHelloPay(path, hashMap, str2);
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7ef2168b93ac4ba3a60b56886bc82c45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7ef2168b93ac4ba3a60b56886bc82c45");
            return;
        }
        if (this.h == null) {
            this.h = new BroadcastReceiver() { // from class: com.meituan.android.cashier.mtpay.HybridPrePosedMTCashierAdapter.1
                public static ChangeQuickRedirect a;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    Object[] objArr5 = {context, intent};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "07b7847640272a4d31ad81480ade6852", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "07b7847640272a4d31ad81480ade6852");
                    } else if (!r.a(HybridPrePosedMTCashierAdapter.this.c, "com.meituan.android.cashier.mtpay.loadState.fail", intent)) {
                        if (r.a(HybridPrePosedMTCashierAdapter.this.c, "com.meituan.android.cashier.mtpay.loadState.success", intent)) {
                            HybridPrePosedMTCashierAdapter.this.a(true, (Map<String, Object>) null);
                        }
                    } else {
                        HybridPrePosedMTCashierAdapter.this.a(false, (Map<String, Object>) null);
                    }
                }
            };
        }
        r.a(this.c, new String[]{"com.meituan.android.cashier.mtpay.loadState.success", "com.meituan.android.cashier.mtpay.loadState.fail"}, this.h);
    }

    private HashMap<String, Object> c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0b472e21b234cf37c17f177847ae7f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0b472e21b234cf37c17f177847ae7f8");
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("nb_container", "hybrid");
        hashMap.put("device_rooted", ac.b(this.c).b("is_root", "0"));
        hashMap.put("is_saved_state", Boolean.valueOf(z));
        if (this.b != null) {
            hashMap.put(HybridSignPayJSHandler.ARG_TRADE_NO, this.b.getTradeNo());
            hashMap.put("merchant_no", this.b.getMerchantNo());
        }
        hashMap.put("hybrid_mtpay_verison", c());
        hashMap.put("hybrid_current_url", b());
        hashMap.put("nb_hybrid_version", c());
        return hashMap;
    }

    private String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97f0423252e850b2da21daa97300ecf0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97f0423252e850b2da21daa97300ecf0");
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("cashier_paytoken", this.b.getPayToken());
            jSONObject2.put("tradeno", this.b.getTradeNo());
            jSONObject2.put("mtp_cashier_url", b());
            jSONObject2.put("force_enter", !a(this.b));
            jSONObject2.put("app_id", e());
            jSONObject2.put("nb_hybrid_version", c());
            jSONObject2.put("install_app", com.meituan.android.paymentchannel.utils.a.a(this.c.getApplicationContext()));
            jSONObject2.put("rooted", ac.b(this.c).b("is_root", "0"));
            jSONObject.put("mtp_hybrid_info", jSONObject2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    private String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d03b680723ddec8c225bea7da21d2e10", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d03b680723ddec8c225bea7da21d2e10") : this.e == null ? "" : a(this.e);
    }

    private String a(ClientRouterInfoBean clientRouterInfoBean) {
        Object[] objArr = {clientRouterInfoBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3798a158a43c0f3238ff1a26f92601b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3798a158a43c0f3238ff1a26f92601b");
        }
        if (clientRouterInfoBean == null) {
            return null;
        }
        String cashierUrl = clientRouterInfoBean.getCashierUrl();
        if (TextUtils.isEmpty(cashierUrl)) {
            return cashierUrl;
        }
        Uri.Builder buildUpon = Uri.parse(cashierUrl).buildUpon();
        buildUpon.appendQueryParameter("app_pay_sdk_version", com.meituan.android.paybase.config.a.d().q());
        buildUpon.appendQueryParameter("device_platform", com.meituan.android.paybase.config.a.d().d());
        return buildUpon.build().toString();
    }

    private String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7c2ae5664397c6dfd0af58abde4b0e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7c2ae5664397c6dfd0af58abde4b0e3");
        }
        String b = b();
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        Matcher matcher = Pattern.compile("v([0-9]+.){2,3}[0-9]+").matcher(b);
        if (matcher.find()) {
            String group = matcher.group(0);
            return !TextUtils.isEmpty(group) ? group.replace("v", "") : group;
        }
        return null;
    }

    private String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b551ca9252b57872169b778b37e7fce8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b551ca9252b57872169b778b37e7fce8");
        }
        if (TextUtils.isEmpty(this.b.getExtraData())) {
            return "";
        }
        try {
            return new JSONObject(this.b.getExtraData()).optString("guide_plan_infos");
        } catch (JSONException e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "StandardCashier_start_parseJson", (Map<String, Object>) null);
            return "";
        }
    }

    private HashMap<String, String> d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7eda8906394aa6667f8c3acfda42002", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7eda8906394aa6667f8c3acfda42002");
        }
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
        } catch (Exception unused) {
            com.meituan.android.paybase.common.analyse.cat.a.a("MTHybridHalfPageCashier", "json 解析异常 " + this.b.getUri().toString());
        }
        return hashMap;
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.ICashier
    public final PayBaseActivity.a a(int i) {
        return PayBaseActivity.a.CASHIER;
    }

    @Override // com.meituan.android.cashier.common.h
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aea634a98253dd0d483bf48be730fafa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aea634a98253dd0d483bf48be730fafa");
        } else {
            aa.a(this, getClass(), bundle);
        }
    }

    @Override // com.meituan.android.cashier.common.h
    public final void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bff3553b650aa06b9963e6faddc3f042", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bff3553b650aa06b9963e6faddc3f042");
            return;
        }
        aa.b(this, getClass(), bundle);
        l.a(c(true), this.p);
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.h
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbf598848b7e823863e1619e20319cca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbf598848b7e823863e1619e20319cca");
            return;
        }
        if (this.d != null && !this.d.c()) {
            this.d.cancel();
        }
        l.a(this.p);
        if (this.h != null) {
            LocalBroadcastManager.getInstance(this.c).unregisterReceiver(this.h);
        }
    }

    @Override // com.meituan.android.cashier.common.h
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a38a2522d267ec4a9ce362520e567c50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a38a2522d267ec4a9ce362520e567c50");
            return;
        }
        com.meituan.android.paymentchannel.b.a().a(this.c, this);
        if (com.meituan.android.paymentchannel.b.a().a(this.c, i, i2, intent)) {
            com.meituan.android.paybase.common.analyse.a.a("MTHybridHalfPageCashier", "consumeActivityResult", "requestCode:" + i, "");
        }
    }

    private String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a51a4294ef5fab5c50c62b604e41dd3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a51a4294ef5fab5c50c62b604e41dd3");
        }
        if (TextUtils.isEmpty(this.b.getExtraData())) {
            return "";
        }
        try {
            return new JSONObject(this.b.getExtraData()).optString("app_id");
        } catch (JSONException e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "MTHybridHalfPageCashier_start_parseJson", (Map<String, Object>) null);
            return "";
        }
    }

    private static String a(PayException payException) {
        Object[] objArr = {payException};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2bbf3c1a3ab279131b2fa683b9f83975", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2bbf3c1a3ab279131b2fa683b9f83975");
        }
        if (payException == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        int code = payException.getCode();
        String message = payException.getMessage();
        if (code != -1) {
            try {
                jSONObject.put("pay_err_code", code);
                if (!TextUtils.isEmpty(message)) {
                    jSONObject.put("pay_err_msg", message);
                }
            } catch (JSONException e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "MTHalfPageCashier_getPreComponentFailInfo", (Map<String, Object>) null);
            }
        }
        jSONObject.put("jump_from_product", "preposed-mtcashier");
        return jSONObject.toString();
    }

    @Override // com.meituan.android.paybase.moduleinterface.payment.PayActionListener
    public final void a(String str, int i, PayFailInfo payFailInfo) {
        boolean z;
        boolean z2;
        Object[] objArr = {str, Integer.valueOf(i), payFailInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34e3172a1df0167be5c7be5c0a09207c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34e3172a1df0167be5c7be5c0a09207c");
        } else if ("quickbank".equals(str)) {
            Object[] objArr2 = {str, Integer.valueOf(i), payFailInfo};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22b611ebeed4f660645be2564cb4e051", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22b611ebeed4f660645be2564cb4e051");
            } else if (i == 1) {
                com.meituan.android.pay.desk.component.analyse.a.a(this.p);
                q.a("b_pay_ydxzmlrc_mv", new a.b().a("pay_type", str).b, this.p);
                if (!e.a()) {
                    this.c.i = "#00000000";
                }
                a(payFailInfo);
            } else {
                if (i != -1) {
                    Object[] objArr3 = {payFailInfo};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "aabce33061ff76987ad6a1c133e11b37", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "aabce33061ff76987ad6a1c133e11b37")).booleanValue();
                    } else {
                        z = payFailInfo != null && payFailInfo.getErrorCode() == -11037;
                    }
                    if (z) {
                        HashMap hashMap = new HashMap();
                        hashMap.put(KnbConstants.PARAMS_SCENE, "cancel");
                        a(false, (Map<String, Object>) hashMap);
                    } else {
                        Object[] objArr4 = {payFailInfo};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0d5628bfc068fe72ef36008697a65161", RobustBitConfig.DEFAULT_VALUE)) {
                            z2 = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0d5628bfc068fe72ef36008697a65161")).booleanValue();
                        } else {
                            z2 = payFailInfo != null && payFailInfo.getErrorCode() == -11040;
                        }
                        if (z2) {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put(KnbConstants.PARAMS_SCENE, "renderFail");
                            a(false, (Map<String, Object>) hashMap2);
                            c(c(payFailInfo));
                            return;
                        } else if (b(payFailInfo)) {
                            c(c(payFailInfo));
                            return;
                        }
                    }
                }
                f();
            }
        }
    }

    private void a(PayFailInfo payFailInfo) {
        Promotion promotion;
        Object[] objArr = {payFailInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3429d61545da25d1e53c3cfade274d5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3429d61545da25d1e53c3cfade274d5a");
        } else if (this.c == null) {
        } else {
            if (e.a()) {
                this.c.f = "success";
                this.c.w_();
                this.c.a(1);
            } else if (payFailInfo == null) {
                this.c.a((Promotion) null);
            } else {
                try {
                    promotion = (Promotion) n.a().fromJson(new JSONObject(payFailInfo.getExtra()).optString("pay_promotion"), (Class<Object>) Promotion.class);
                } catch (Exception e) {
                    com.meituan.android.paybase.common.analyse.a.a(e, "NativeStandardCashierAdapter_onMeituanPaySuccess", (Map<String, Object>) null);
                    promotion = null;
                }
                this.c.a(promotion);
            }
        }
    }

    private boolean b(PayFailInfo payFailInfo) {
        Object[] objArr = {payFailInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19e49229e08d6e636d80cc53e8371c81", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19e49229e08d6e636d80cc53e8371c81")).booleanValue();
        }
        JSONObject jSONObject = null;
        if (payFailInfo != null) {
            try {
                if (!TextUtils.isEmpty(payFailInfo.getExtra())) {
                    jSONObject = new JSONObject(payFailInfo.getExtra());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return !(jSONObject != null && jSONObject.has("action") && TextUtils.equals(jSONObject.optString("action"), "downgrade_to_business"));
    }

    private static String c(PayFailInfo payFailInfo) {
        Object[] objArr = {payFailInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bff324890d878a2dd00f66879471bf0d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bff324890d878a2dd00f66879471bf0d");
        }
        if (payFailInfo == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        int errorCode = payFailInfo.getErrorCode();
        String msg = payFailInfo.getMsg();
        if (errorCode != -1) {
            try {
                jSONObject.put("pay_err_code", errorCode);
            } catch (JSONException e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "MTHalfPageCashier_getPreComponentFailInfo", (Map<String, Object>) null);
            }
        }
        if (!TextUtils.isEmpty(msg)) {
            jSONObject.put("pay_err_msg", msg);
        }
        jSONObject.put("jump_from_product", "preposed-mtcashier");
        return jSONObject.toString();
    }

    @Override // com.meituan.android.cashier.common.u
    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ca493a39db0af83cc5cee266dbf3e31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ca493a39db0af83cc5cee266dbf3e31");
        } else if (e.a()) {
        } else {
            try {
                this.c.getWindow().getDecorView().setBackgroundColor(Color.parseColor("#99000000"));
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "HybridPrePosedMTCashierAdapter_onSLASuccess", (Map<String, Object>) null);
            }
        }
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "489da2983ff1a257c8e0a0222b679d69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "489da2983ff1a257c8e0a0222b679d69");
        } else {
            this.c.j();
        }
    }

    private boolean a(CashierParams cashierParams) {
        Object[] objArr = {cashierParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9033982af20652c42eda452f667c651e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9033982af20652c42eda452f667c651e")).booleanValue() : cashierParams.getCashierScope("hybrid_preposed_mtcashier", this.p).isDowngradeAvailable();
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.paybase.retrofit.b
    public void onRequestSucc(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d7d8c8117a0d2dc807133405d8fe781", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d7d8c8117a0d2dc807133405d8fe781");
        } else if (i == 10) {
            l.b("cashier/gohellopay", "b_pay_cashier_gohellopay_succ_sc", null, this.p);
            l.b("cashier_gohellopay_succ", null, this.p);
            MTPaymentURL mTPaymentURL = (MTPaymentURL) obj;
            Object[] objArr2 = {mTPaymentURL};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "16510d188532c4528b1b8157e97097e8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "16510d188532c4528b1b8157e97097e8");
            } else if (mTPaymentURL != null) {
                if (mTPaymentURL.getOverLoadInfo() != null && mTPaymentURL.getOverLoadInfo().isStatus()) {
                    c((String) null);
                    return;
                }
                try {
                    String optString = new JSONObject(new String(com.meituan.android.paybase.utils.c.a(mTPaymentURL.getUrl()))).optString("trans_id");
                    if (TextUtils.isEmpty(optString)) {
                        optString = "-999";
                    }
                    l.a("qdb_no", optString, this.p);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                com.meituan.android.paymentchannel.b.a().a(this.c, "quickbank", mTPaymentURL.getUrl(), this.b.getTradeNo(), this);
                com.meituan.android.cashier.utils.a.a(mTPaymentURL, "hybrid", this.p);
            }
        }
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.paybase.retrofit.b
    public void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f896d21f64d5323490c7128fc1deeb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f896d21f64d5323490c7128fc1deeb1");
        } else if (i == 10) {
            l.a("cashier_gohellopay_fail", exc, this.p);
            l.a("cashier/gohellopay", "b_pay_cashier_gohellopay_fail_sc", exc, this.p);
            if (exc instanceof PayException) {
                c(a((PayException) exc));
            } else {
                c((String) null);
            }
        }
    }
}
