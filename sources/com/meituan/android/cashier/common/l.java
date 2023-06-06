package com.meituan.android.cashier.common;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.android.cashier.activity.MTCashierActivity;
import com.meituan.android.cashier.bean.CashierParams;
import com.meituan.android.cashier.bean.CashierRouterInfo;
import com.meituan.android.cashier.bean.CashierScopeBean;
import com.meituan.android.cashier.common.ProductTypeConstant;
import com.meituan.android.cashier.common.e;
import com.meituan.android.cashier.common.u;
import com.meituan.android.cashier.retrofit.CashierRouterRequestService;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.neohybrid.Neo;
import com.meituan.android.neohybrid.core.horn.bean.NeoHornConfig;
import com.meituan.android.pay.jshandler.HybridSignPayJSHandler;
import com.meituan.android.pay.model.bean.RetainDisplayCloseInfoBean;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.ac;
import com.meituan.android.paybase.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class l implements com.meituan.android.paybase.retrofit.b {
    public static ChangeQuickRedirect a;
    public CashierParams b;
    MTCashierActivity c;
    public e d;
    public j e;
    public a f;
    public final k g;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(ICashier iCashier, Map<String, Object> map);
    }

    public l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "199fa63847f48f753977932c712f944e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "199fa63847f48f753977932c712f944e");
        } else {
            this.g = new k();
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestSucc(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fef87ddd1581fb743d2cdf0abc0dc80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fef87ddd1581fb743d2cdf0abc0dc80");
        } else if (this.d != null) {
            this.d.onRequestSucc(i, obj);
        }
    }

    void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ecd40e6c2a091e54e9c20ac43d06ff6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ecd40e6c2a091e54e9c20ac43d06ff6");
        } else if (this.b != null) {
            this.b.setDowngradeInfo(str);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eafce9d9fa90cc744483bb9b6936ea1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eafce9d9fa90cc744483bb9b6936ea1b");
        } else if (this.d != null) {
            this.d.onRequestException(i, exc);
        }
    }

    String a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd8b5575f8206a6bbdd6a244fd907091", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd8b5575f8206a6bbdd6a244fd907091");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("jump_from_product", "preposed-mtcashier");
            if (i != -1) {
                jSONObject.put("pay_err_code", i);
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("pay_err_msg", str);
                }
            }
        } catch (JSONException unused) {
            com.meituan.android.paybase.common.analyse.cat.a.a("CashierRouter", "getExtParam");
        }
        return jSONObject.toString();
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestFinal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59f5cc198a5a810955c79ca4710073e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59f5cc198a5a810955c79ca4710073e0");
        } else if (this.d != null) {
            this.d.onRequestFinal(i);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestStart(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20b52bff9199a0c8dd8422b116e9fe93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20b52bff9199a0c8dd8422b116e9fe93");
        } else if (this.d != null) {
            this.d.onRequestStart(i);
        }
    }

    public final void a(MTCashierActivity mTCashierActivity, CashierParams cashierParams, String str) {
        Object[] objArr = {mTCashierActivity, cashierParams, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db6964437f541c5c125cc408f9364cf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db6964437f541c5c125cc408f9364cf6");
            return;
        }
        com.meituan.android.paybase.downgrading.d.a().a(mTCashierActivity.getApplicationContext());
        b.a().a(mTCashierActivity.getApplicationContext());
        this.c = mTCashierActivity;
        this.b = cashierParams;
        this.d = new e(cashierParams, mTCashierActivity);
        this.e = new j(cashierParams, mTCashierActivity);
        a(cashierParams, str);
    }

    private void a(CashierParams cashierParams, String str) {
        Object[] objArr = {cashierParams, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9fbc32db7ce067a5b70da0952d6ddcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9fbc32db7ce067a5b70da0952d6ddcc");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("device_rooted", ac.b(this.c).b("is_root", "0"));
        hashMap.put("unique_id", str);
        hashMap.put(HybridSignPayJSHandler.ARG_TRADE_NO, cashierParams.getTradeNo());
        hashMap.put("tradeNo", cashierParams.getTradeNo());
        hashMap.put("merchant_no", cashierParams.getMerchantNo());
        com.meituan.android.paybase.downgrading.c cVar = com.meituan.android.paybase.downgrading.d.a().b;
        if (cVar != null) {
            hashMap.put("android_router_back_enabled", Boolean.valueOf(cVar.q));
        }
        hashMap.put("use_new_cashier_callback", Boolean.valueOf(!com.meituan.android.paybase.utils.e.a()));
        if (this.c.getCallingActivity() != null) {
            hashMap.put("last_resumed_page", this.c.getCallingActivity().getClassName());
        }
        com.meituan.android.cashier.util.b.b(hashMap, c());
    }

    public String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43c9b74e624900875c7862bb4a817246", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43c9b74e624900875c7862bb4a817246");
        }
        if (TextUtils.isEmpty(this.b.getCif())) {
            return "";
        }
        try {
            return new JSONObject(this.b.getCif()).optString(Constants.Environment.KEY_CT);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.d(e.getMessage(), "CashierRouter_parse_cif", null);
            return "";
        }
    }

    public ICashier a(List<CashierScopeBean> list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee2a18e496202f9b2f8693f58301a806", RobustBitConfig.DEFAULT_VALUE)) {
            return (ICashier) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee2a18e496202f9b2f8693f58301a806");
        }
        ICashier a2 = this.e.a(d.a(list));
        com.meituan.android.cashier.util.b.a(a2, this.b, c(), z);
        return a2;
    }

    public Map<String, Object> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "524271d6bec740d1e41def605aec6eb8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "524271d6bec740d1e41def605aec6eb8");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("flow_source", "enter");
        return hashMap;
    }

    Map<String, Object> a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3edc8614969752cc3555a32e11531eed", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3edc8614969752cc3555a32e11531eed");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("flow_source", z ? "predispatcher_success" : "predispatcher_failed");
        return hashMap;
    }

    private void e() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "840274cac32723ff1b0168203341fd7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "840274cac32723ff1b0168203341fd7e");
            return;
        }
        com.meituan.android.cashier.util.b.b(c());
        e eVar = this.d;
        e.a aVar = new e.a() { // from class: com.meituan.android.cashier.common.l.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cashier.common.e.a
            public final void a(CashierRouterInfo cashierRouterInfo) {
                Object[] objArr2 = {cashierRouterInfo};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e77ca6425905490108630f00e1c747d3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e77ca6425905490108630f00e1c747d3");
                    return;
                }
                l lVar = l.this;
                Object[] objArr3 = {cashierRouterInfo};
                ChangeQuickRedirect changeQuickRedirect3 = l.a;
                if (PatchProxy.isSupport(objArr3, lVar, changeQuickRedirect3, false, "162417c6cf0e7d5cc4cab50265b9bd9b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, lVar, changeQuickRedirect3, false, "162417c6cf0e7d5cc4cab50265b9bd9b");
                    return;
                }
                lVar.b.setCashierRouterInfo(cashierRouterInfo);
                lVar.b.setProductType(cashierRouterInfo.getProductType());
                if (TextUtils.isEmpty(lVar.b.getMerchantNo()) || TextUtils.equals(lVar.b.getMerchantNo(), "NULL")) {
                    String preDispatcherMerchantNo = lVar.b.getPreDispatcherMerchantNo();
                    lVar.b.setMerchantNo(preDispatcherMerchantNo);
                    Uri uri = null;
                    if (lVar.b.getUri() != null && lVar.b.getUri().getQueryParameterNames() != null && lVar.b.getUri().getQueryParameterNames().contains("merchant_no")) {
                        uri = com.meituan.android.cashier.common.a.a(lVar.b.getUri(), "merchant_no", preDispatcherMerchantNo);
                    } else {
                        Uri uri2 = lVar.b.getUri();
                        Object[] objArr4 = {uri2, "merchant_no", preDispatcherMerchantNo};
                        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.cashier.common.a.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "7b467040e9d5e08a40adc7dda183155e", RobustBitConfig.DEFAULT_VALUE)) {
                            uri = (Uri) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "7b467040e9d5e08a40adc7dda183155e");
                        } else if (uri2 != null) {
                            if (TextUtils.isEmpty("merchant_no")) {
                                uri = uri2;
                            } else {
                                Uri.Builder buildUpon = uri2.buildUpon();
                                buildUpon.appendQueryParameter("merchant_no", preDispatcherMerchantNo);
                                uri = buildUpon.build();
                            }
                        }
                    }
                    lVar.b.setUri(uri);
                    lVar.c.getIntent().setDataAndType(uri, lVar.c.getIntent().getType());
                }
                List<CashierScopeBean> a2 = d.a(lVar.b, cashierRouterInfo.getProductType());
                ICashier a3 = lVar.e.a(d.a(a2));
                com.meituan.android.cashier.util.b.a(true, a3, cashierRouterInfo.getProductType(), lVar.b, lVar.c());
                if (a3 != null) {
                    lVar.g.a(cashierRouterInfo.getProductType(), a2, a3.i());
                    lVar.a(a3, lVar.a(true));
                }
            }

            @Override // com.meituan.android.cashier.common.e.a
            public final void a(Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ed8598e91bcccbee91d97fa09e99c679", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ed8598e91bcccbee91d97fa09e99c679");
                    return;
                }
                l lVar = l.this;
                Object[] objArr3 = {exc};
                ChangeQuickRedirect changeQuickRedirect3 = l.a;
                if (PatchProxy.isSupport(objArr3, lVar, changeQuickRedirect3, false, "1c63c80c27b127ee72c6cfb9e8660e65", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, lVar, changeQuickRedirect3, false, "1c63c80c27b127ee72c6cfb9e8660e65");
                    return;
                }
                lVar.b.setProductType(RetainDisplayCloseInfoBean.TYPE_STANDARDCASHIER);
                List<CashierScopeBean> a2 = d.a(lVar.b, RetainDisplayCloseInfoBean.TYPE_STANDARDCASHIER);
                ICashier a3 = lVar.e.a(d.a(a2));
                if (exc instanceof PayException) {
                    lVar.a(lVar.a(exc.getMessage(), ((PayException) exc).getCode()));
                } else {
                    lVar.a((String) null);
                }
                com.meituan.android.cashier.util.b.a(false, a3, RetainDisplayCloseInfoBean.TYPE_STANDARDCASHIER, lVar.b, lVar.c());
                if (a3 != null) {
                    lVar.g.a(RetainDisplayCloseInfoBean.TYPE_STANDARDCASHIER, a2, a3.i());
                    lVar.a(a3, lVar.a(false));
                }
            }
        };
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "3efb0566a52c9878bc94813a946bee7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "3efb0566a52c9878bc94813a946bee7a");
            return;
        }
        eVar.d = aVar;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "fcbcb0d350e3b1ef988e97c579116fda", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "fcbcb0d350e3b1ef988e97c579116fda")).booleanValue();
        } else {
            z = eVar.b() < 3 && !Neo.debugger().a("not_use_bff") && ((NeoHornConfig) com.meituan.android.neohybrid.core.horn.a.a().a(NeoHornConfig.class)).isEnableCombineDispatcherRequest();
        }
        eVar.f = z;
        if (z) {
            q.a("cashier/combinedispatcher", "b_pay_cashier_combinedispatcher_start_sc", (Map<String, Object>) null, eVar.a());
            q.a("cashier_combinedispatcher_start", eVar.a());
            Object[] objArr4 = {eVar};
            ChangeQuickRedirect changeQuickRedirect4 = f.a;
            u.a fVar = PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "dd91df2390681bbdcf0cab7f66b11a73", RobustBitConfig.DEFAULT_VALUE) ? (u.a) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "dd91df2390681bbdcf0cab7f66b11a73") : new f(eVar);
            Object[] objArr5 = {fVar};
            ChangeQuickRedirect changeQuickRedirect5 = e.a;
            if (PatchProxy.isSupport(objArr5, eVar, changeQuickRedirect5, false, "b0ff5f7ffeccb50d74f20cce1e8a8f6f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, eVar, changeQuickRedirect5, false, "b0ff5f7ffeccb50d74f20cce1e8a8f6f");
            } else if (fVar != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("tradeno", eVar.b.getTradeNo());
                hashMap.put("pay_token", eVar.b.getPayToken());
                hashMap.put("clientRouterParam", eVar.d());
                hashMap.put("extra_data", eVar.b.getExtraData());
                hashMap.put("ext_dim_stat", eVar.e());
                if (!com.meituan.android.paybase.utils.i.a(eVar.b.getExtendTransmissionParams())) {
                    hashMap.putAll(eVar.b.getExtendTransmissionParams());
                }
                hashMap.put("app_display_type", r.c());
                hashMap.put("callback_url", eVar.b.getCallbackUrl());
                hashMap.put("dispatcher_scene", "");
                hashMap.put("nb_fingerprint", com.meituan.android.paycommon.lib.config.a.a().o());
                hashMap.put("ext_param", "");
                JSONObject c = eVar.c();
                if (c != null) {
                    hashMap.put("guide_plan_infos", c.optString("guide_plan_infos"));
                }
                hashMap.put("is_saved_state", "");
                hashMap.put("usr_id", com.meituan.android.paybase.config.a.d().i());
                hashMap.put("merchant_no", eVar.b.getMerchantNo());
                hashMap.put("last_resumed_page", eVar.b.getLastResumedFeature());
                List a2 = com.sankuai.meituan.serviceloader.b.a(ICashier.class, "hybrid_standard_cashier");
                if (!com.meituan.android.paybase.utils.i.a((Collection) a2)) {
                    ICashier iCashier = (ICashier) a2.get(0);
                    if (iCashier instanceof u) {
                        u uVar = (u) iCashier;
                        Object[] objArr6 = {hashMap, fVar};
                        ChangeQuickRedirect changeQuickRedirect6 = g.a;
                        uVar.a(PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "db89c9532b7548f8c4cedbf45779b6a8", RobustBitConfig.DEFAULT_VALUE) ? (u.a) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "db89c9532b7548f8c4cedbf45779b6a8") : new g(hashMap, fVar));
                    }
                }
                fVar.a(hashMap);
            }
        } else {
            q.a("cashier/predispatcher", "b_pay_cashier_predispatcher_start_sc", (Map<String, Object>) null, eVar.a());
            q.a("cashier_predispatcher_start", eVar.a());
            CashierRouterRequestService cashierRouterRequestService = (CashierRouterRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(CashierRouterRequestService.class, eVar.c, 20);
            String tradeNo = eVar.b.getTradeNo();
            String payToken = eVar.b.getPayToken();
            String d = eVar.d();
            String extraData = eVar.b.getExtraData();
            String e = eVar.e();
            String c2 = r.c();
            Object[] objArr7 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect7 = e.a;
            eVar.e = cashierRouterRequestService.predispatcher(tradeNo, payToken, d, extraData, e, c2, PatchProxy.isSupport(objArr7, eVar, changeQuickRedirect7, false, "404c0c9c14b72d2a4655382c4e9ea6e9", RobustBitConfig.DEFAULT_VALUE) ? (HashMap) PatchProxy.accessDispatch(objArr7, eVar, changeQuickRedirect7, false, "404c0c9c14b72d2a4655382c4e9ea6e9") : eVar.b.getExtendTransmissionParams());
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("is_bff_node", Boolean.valueOf(eVar.f));
        String a3 = eVar.a();
        Object[] objArr8 = {hashMap2, a3};
        ChangeQuickRedirect changeQuickRedirect8 = q.a;
        if (PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "99edc1bfef6f61ca7d2ab50c1d5ba361", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "99edc1bfef6f61ca7d2ab50c1d5ba361");
        } else if (!com.meituan.android.paybase.utils.i.a(hashMap2)) {
            x.c("com.meituan.android.cashier.common.CashierStaticsUtils", hashMap2);
            x.c(q.a(a3), hashMap2);
        }
        com.meituan.android.cashier.util.b.a(hashMap2, eVar.a());
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "966405f2e6ed5248406dc9339aa177ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "966405f2e6ed5248406dc9339aa177ee");
            return;
        }
        this.f = aVar;
        e();
    }

    public void a(ICashier iCashier, Map<String, Object> map) {
        Object[] objArr = {iCashier, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9c38c71dd0e61caf6cfe23e89415394", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9c38c71dd0e61caf6cfe23e89415394");
        } else if (this.f != null) {
            this.f.a(iCashier, map);
        } else {
            this.c.b("1140002", "onCashierRouteInfoReady mCashierRouterListener is null");
        }
    }

    public String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c3a941b557e7abdb2c7fc14a462d912", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c3a941b557e7abdb2c7fc14a462d912") : this.c == null ? "" : this.c.p();
    }

    @ProductTypeConstant.ProductType
    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "070b0c18d2b698ca7e33b3ff0b77f3c8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "070b0c18d2b698ca7e33b3ff0b77f3c8") : this.b == null ? "" : this.b.getProductType();
    }
}
