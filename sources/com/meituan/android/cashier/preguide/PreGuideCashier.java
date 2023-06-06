package com.meituan.android.cashier.preguide;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.view.View;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cashier.activity.MTCashierActivity;
import com.meituan.android.cashier.bean.CashierParams;
import com.meituan.android.cashier.bean.CashierRouterPreGuideHornConfig;
import com.meituan.android.cashier.common.ICashier;
import com.meituan.android.cashier.common.i;
import com.meituan.android.cashier.common.m;
import com.meituan.android.cashier.common.q;
import com.meituan.android.cashier.common.u;
import com.meituan.android.pay.model.bean.RetainDisplayCloseInfoBean;
import com.meituan.android.paybase.dialog.e;
import com.meituan.android.paybase.retrofit.b;
import com.meituan.android.paybase.utils.MTPayBaseClass;
import com.meituan.android.paybase.utils.MTPayNeedToPersist;
import com.meituan.android.paycommon.lib.coupon.model.Promotion;
import com.meituan.android.paycommon.lib.fragment.HalfPageFragment;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
@MTPayBaseClass
/* loaded from: classes2.dex */
public class PreGuideCashier extends u {
    public static ChangeQuickRedirect b;
    @MTPayNeedToPersist
    private CashierRouterPreGuideHornConfig a;
    private MTCashierActivity c;
    private CashierParams d;
    private final Handler e;
    private Drawable f;
    private BroadcastReceiver g;

    @Override // com.meituan.android.cashier.common.h
    public final void a(Bundle bundle) {
    }

    public void a(@NonNull CashierRouterPreGuideHornConfig cashierRouterPreGuideHornConfig, @NonNull HalfPageFragment.a aVar) {
    }

    public void a(JSONObject jSONObject) {
    }

    @Override // com.meituan.android.cashier.common.h
    public final void b(Bundle bundle) {
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.ICashier
    public String i() {
        return "hybrid_pre_guide_cashier";
    }

    public PreGuideCashier() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52e625ac6285f70974a62806f33145e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52e625ac6285f70974a62806f33145e5");
        } else {
            this.e = new Handler();
        }
    }

    public static /* synthetic */ void a(PreGuideCashier preGuideCashier, JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, preGuideCashier, changeQuickRedirect, false, "2f3672516555bc02d32386f28f0cbdc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, preGuideCashier, changeQuickRedirect, false, "2f3672516555bc02d32386f28f0cbdc4");
        } else if (jSONObject != null) {
            String optString = jSONObject.optString("dest_cashier_type");
            String optString2 = jSONObject.optString("source_cashier_type");
            String optString3 = jSONObject.optString("downgrade_info");
            preGuideCashier.c.g = jSONObject.optString("pay_result_extra");
            if (TextUtils.isEmpty(optString)) {
                HashMap hashMap = new HashMap();
                hashMap.put(KnbConstants.PARAMS_SCENE, "PreGuideCashier_handleDowngrade");
                q.b("b_pay_5l3pq2aw_sc", hashMap, preGuideCashier.p);
                q.a("paybiz_pay_later_result_dest_cashier_empty", (Map<String, Object>) null, (List<Float>) null, preGuideCashier.p);
            }
            if (TextUtils.equals(optString, "hybrid_preposed_mtcashier")) {
                preGuideCashier.c.b(optString2, "preposed-mtcashier", optString3);
            } else if (TextUtils.equals(optString, "request_predispatcher")) {
                preGuideCashier.c.b(optString2, "request_predispatcher", optString3);
            } else {
                preGuideCashier.c.b(optString2, RetainDisplayCloseInfoBean.TYPE_STANDARDCASHIER, optString3);
            }
        }
    }

    public static /* synthetic */ void b(PreGuideCashier preGuideCashier) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, preGuideCashier, changeQuickRedirect, false, "834e0a7545a7828ccb9f474ead8ed457", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, preGuideCashier, changeQuickRedirect, false, "834e0a7545a7828ccb9f474ead8ed457");
            return;
        }
        CashierRouterPreGuideHornConfig cashierRouterPreGuideHornConfig = preGuideCashier.a;
        if (cashierRouterPreGuideHornConfig == null) {
            com.meituan.android.paybase.common.analyse.a.d("cashierRouterPreGuideHornConfig == null", "PreGuideCashier_onLoadTimeOut", null);
            preGuideCashier.c.c("");
            return;
        }
        String renderErrorAction = cashierRouterPreGuideHornConfig.getRenderErrorAction();
        String renderErrorToast = cashierRouterPreGuideHornConfig.getRenderErrorToast();
        if (TextUtils.equals(renderErrorAction, "pay_finish")) {
            preGuideCashier.c.c(renderErrorToast);
        } else if (TextUtils.isEmpty(renderErrorToast)) {
            preGuideCashier.a(renderErrorAction);
        } else {
            e.a((Activity) preGuideCashier.c, (Object) renderErrorToast, false);
            preGuideCashier.e.postDelayed(a.a(preGuideCashier, renderErrorAction), 1500L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void b(com.meituan.android.cashier.preguide.PreGuideCashier r11, org.json.JSONObject r12) {
        /*
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.cashier.preguide.PreGuideCashier.b
            java.lang.String r10 = "d6b9d95d93ab7fc0706f8c8a77fa1c78"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            return
        L1b:
            if (r12 == 0) goto L8f
            java.lang.String r0 = "status"
            java.lang.String r0 = r12.optString(r0)
            java.lang.String r1 = "pay_result_extra"
            java.lang.String r1 = r12.optString(r1)
            r2 = 0
            java.lang.String r3 = "promotion"
            org.json.JSONObject r12 = r12.optJSONObject(r3)     // Catch: java.lang.Exception -> L46
            if (r12 == 0) goto L4c
            com.google.gson.Gson r3 = com.meituan.android.paybase.utils.n.a()     // Catch: java.lang.Exception -> L46
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Exception -> L46
            java.lang.Class<com.meituan.android.paycommon.lib.coupon.model.Promotion> r4 = com.meituan.android.paycommon.lib.coupon.model.Promotion.class
            java.lang.Object r12 = r3.fromJson(r12, r4)     // Catch: java.lang.Exception -> L46
            com.meituan.android.paycommon.lib.coupon.model.Promotion r12 = (com.meituan.android.paycommon.lib.coupon.model.Promotion) r12     // Catch: java.lang.Exception -> L46
            goto L4d
        L46:
            r12 = move-exception
            java.lang.String r3 = "PreGuideCashier_parse_promotion"
            com.meituan.android.paybase.common.analyse.a.a(r12, r3, r2)
        L4c:
            r12 = r2
        L4d:
            com.meituan.android.cashier.activity.MTCashierActivity r3 = r11.c
            r3.g = r1
            java.lang.String r1 = "success"
            boolean r1 = android.text.TextUtils.equals(r1, r0)
            if (r1 == 0) goto L5e
            r11.a(r12)
            return
        L5e:
            java.lang.String r12 = "fail"
            boolean r12 = android.text.TextUtils.equals(r12, r0)
            if (r12 == 0) goto L6e
            com.meituan.android.cashier.activity.MTCashierActivity r11 = r11.c
            java.lang.String r12 = ""
            r11.c(r12)
            return
        L6e:
            java.lang.String r12 = "cancel"
            boolean r12 = android.text.TextUtils.equals(r12, r0)
            if (r12 == 0) goto L7c
            com.meituan.android.cashier.activity.MTCashierActivity r11 = r11.c
            r11.j()
            return
        L7c:
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            java.lang.String r1 = "status"
            r12.put(r1, r0)
            java.lang.String r0 = "paybiz_pay_later_result_status_is_not_defined"
            java.lang.String r11 = r11.p
            com.meituan.android.cashier.common.q.a(r0, r12, r2, r11)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.cashier.preguide.PreGuideCashier.b(com.meituan.android.cashier.preguide.PreGuideCashier, org.json.JSONObject):void");
    }

    @Override // com.meituan.android.cashier.common.ICashier
    @CallSuper
    public <T extends FragmentActivity & i & b> ICashier.a a(T t, CashierParams cashierParams) {
        Object[] objArr = {t, cashierParams};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44593ade838a9df7e21cb80d0bc70c2f", RobustBitConfig.DEFAULT_VALUE)) {
            return (ICashier.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44593ade838a9df7e21cb80d0bc70c2f");
        }
        this.a = null;
        this.c = (MTCashierActivity) t;
        List<CashierRouterPreGuideHornConfig> b2 = m.a().b();
        this.d = cashierParams;
        Uri uri = cashierParams.getUri();
        if (uri == null) {
            return new ICashier.a(false);
        }
        return new ICashier.a(a(b2, cashierParams.getProductType(), uri.getQueryParameter("merchant_no")));
    }

    private boolean a(List<CashierRouterPreGuideHornConfig> list, String str, String str2) {
        Object[] objArr = {list, str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a89b02545aeb710b33b4202569366bd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a89b02545aeb710b33b4202569366bd")).booleanValue();
        }
        if (com.meituan.android.paybase.utils.i.a((Collection) list) || TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator<CashierRouterPreGuideHornConfig> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            CashierRouterPreGuideHornConfig next = it.next();
            if (next != null && TextUtils.equals(next.getCashierType(), str)) {
                this.a = next;
                break;
            }
        }
        return (this.a == null || TextUtils.isEmpty(this.a.getUrl())) ? false : true;
    }

    @Override // com.meituan.android.cashier.common.u
    public final void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac937ed0af8297b80451909a388d3dc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac937ed0af8297b80451909a388d3dc2");
            return;
        }
        CashierRouterPreGuideHornConfig cashierRouterPreGuideHornConfig = this.a;
        String trim = cashierRouterPreGuideHornConfig.getUrl().trim();
        if (!trim.startsWith(AbsApiFactory.HTTPS) && !trim.startsWith(AbsApiFactory.HTTP)) {
            trim = com.meituan.android.neohybrid.init.a.e() + cashierRouterPreGuideHornConfig.getUrl();
        }
        HalfPageFragment.a aVar = new HalfPageFragment.a(cashierRouterPreGuideHornConfig.getCashierType(), trim, "", 101);
        aVar.j = c();
        aVar.g = String.valueOf(cashierRouterPreGuideHornConfig.getLoadingTimeOut());
        aVar.f = (!com.meituan.android.paybase.utils.e.a() && TextUtils.isEmpty(cashierRouterPreGuideHornConfig.getBackgroundColor())) ? "#00000000" : cashierRouterPreGuideHornConfig.getBackgroundColor();
        a(cashierRouterPreGuideHornConfig, aVar);
        String cashierType = cashierRouterPreGuideHornConfig.getCashierType();
        Object[] objArr2 = {cashierType};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "79f5c985531e48c3cd1c442e4e039c77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "79f5c985531e48c3cd1c442e4e039c77");
        } else {
            if (this.g == null) {
                this.g = new BroadcastReceiver() { // from class: com.meituan.android.cashier.preguide.PreGuideCashier.1
                    public static ChangeQuickRedirect a;

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        Object[] objArr3 = {context, intent};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f7eafc875ef3272e94275c970838403f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f7eafc875ef3272e94275c970838403f");
                            return;
                        }
                        PreGuideCashier.this.a(true, (Map<String, Object>) null);
                        PreGuideCashier.this.b();
                    }
                };
            }
            LocalBroadcastManager.getInstance(this.c).registerReceiver(this.g, new IntentFilter("com.meituan.android.paycommon.lib.fragment.HalfPageFragment_" + cashierType));
        }
        HalfPageFragment.a(this.c, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62f62832880d491cc2e7a67a8c6a82e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62f62832880d491cc2e7a67a8c6a82e1");
        } else if (this.g != null) {
            LocalBroadcastManager.getInstance(this.c).unregisterReceiver(this.g);
        }
    }

    private String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9f8726fafa57e036de56a143a1ad68a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9f8726fafa57e036de56a143a1ad68a");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tradeno", this.d.getTradeNo());
            jSONObject.put("extra_statics", this.d.getExtraStatics());
            jSONObject.put("extra_data", this.d.getExtraData());
            jSONObject.put("merchant_no", this.c.getMerchantNo());
            jSONObject.put("pay_token", this.d.getPayToken());
            HashMap<String, String> extendTransmissionParams = this.d.getExtendTransmissionParams();
            if (!com.meituan.android.paybase.utils.i.a(extendTransmissionParams)) {
                for (Map.Entry<String, String> entry : extendTransmissionParams.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "HalfPageFragment_getTunnelExtraData", (Map<String, Object>) null);
        }
        a(jSONObject);
        return jSONObject.toString();
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54f79dc4a9cde8f14150e8c30450be36", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54f79dc4a9cde8f14150e8c30450be36");
        }
        if (TextUtils.isEmpty(this.d.getExtraStatics())) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("outer_business_statics", this.d.getExtraStatics());
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "PreGuideCashier_getExtDimStat", (Map<String, Object>) null);
        }
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Promotion promotion) {
        Object[] objArr = {promotion};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a26ffc29b97beb81f657b43ecf910290", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a26ffc29b97beb81f657b43ecf910290");
            return;
        }
        if (!com.meituan.android.paybase.utils.e.a()) {
            this.c.i = "#00000000";
        }
        this.c.a(promotion);
    }

    @Override // com.meituan.android.cashier.common.h
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db7c9ffc9168c768896e0d212af937ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db7c9ffc9168c768896e0d212af937ae");
        } else if (i == 101) {
            HalfPageFragment.a(i2, intent, new HalfPageFragment.b() { // from class: com.meituan.android.cashier.preguide.PreGuideCashier.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.paycommon.lib.fragment.HalfPageFragment.b
                public final void a(int i3, String str) {
                    Object[] objArr2 = {Integer.valueOf(i3), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "74874b36142570d7f9137bd6cf2f4a3e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "74874b36142570d7f9137bd6cf2f4a3e");
                    } else {
                        PreGuideCashier.b(PreGuideCashier.this);
                    }
                }

                @Override // com.meituan.android.paycommon.lib.fragment.HalfPageFragment.b
                public final void a(@Nullable String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "67acb9f0f94a9ee48410f811d8b09a3c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "67acb9f0f94a9ee48410f811d8b09a3c");
                    } else if (TextUtils.isEmpty(str)) {
                        PreGuideCashier.this.a((Promotion) null);
                        q.a("paybiz_pay_later_result_is_illegal", (Map<String, Object>) null, (List<Float>) null, PreGuideCashier.this.p);
                    } else {
                        try {
                            JSONObject jSONObject = new JSONObject(str);
                            String optString = jSONObject.optString("action");
                            if (TextUtils.equals("downgrade", optString)) {
                                PreGuideCashier.a(PreGuideCashier.this, jSONObject);
                            } else if (TextUtils.equals("finish", optString)) {
                                PreGuideCashier.b(PreGuideCashier.this, jSONObject);
                            } else {
                                HashMap hashMap = new HashMap();
                                hashMap.put("action", optString);
                                q.a("paybiz_pay_later_result_action_is_not_defined", hashMap, (List<Float>) null, PreGuideCashier.this.p);
                            }
                        } catch (Exception unused) {
                            PreGuideCashier.this.a((Promotion) null);
                            q.a("paybiz_pay_later_result_is_illegal", (Map<String, Object>) null, (List<Float>) null, PreGuideCashier.this.p);
                        }
                    }
                }
            });
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aac3283dee238d6a8b10d4317cd828d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aac3283dee238d6a8b10d4317cd828d3");
        } else if (TextUtils.equals(str, "hybrid_preposed_mtcashier")) {
            this.c.b(i(), "preposed-mtcashier", "");
        } else if (TextUtils.equals(str, "request_predispatcher")) {
            this.c.b(i(), "request_predispatcher", "");
        } else {
            this.c.b(i(), RetainDisplayCloseInfoBean.TYPE_STANDARDCASHIER, "");
        }
    }

    public static /* synthetic */ void a(PreGuideCashier preGuideCashier, String str) {
        Object[] objArr = {preGuideCashier, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "443bbec8ec1ede10f04dce9365b3685e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "443bbec8ec1ede10f04dce9365b3685e");
        } else {
            preGuideCashier.a(str);
        }
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.h
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1368c5215491abde01deca994a6cdfee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1368c5215491abde01deca994a6cdfee");
            return;
        }
        super.a(z);
        this.e.removeCallbacksAndMessages(null);
        if (this.f != null && !this.c.isFinishing()) {
            ViewCompat.setBackground(this.c.getWindow().getDecorView(), this.f);
        }
        b();
    }

    @Override // com.meituan.android.cashier.common.u
    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cada4552a8c27c29e6c9254c662ed884", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cada4552a8c27c29e6c9254c662ed884");
        } else if (com.meituan.android.paybase.utils.e.a()) {
        } else {
            try {
                View decorView = this.c.getWindow().getDecorView();
                this.f = decorView.getBackground();
                decorView.setBackgroundColor(Color.parseColor("#99000000"));
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "HybridPrePosedMTCashierAdapter_onSLASuccess", (Map<String, Object>) null);
            }
        }
    }
}
