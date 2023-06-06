package com.meituan.android.cashier.hybridwrapper;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cashier.activity.MTCashierActivity;
import com.meituan.android.cashier.bean.BffResponseBean;
import com.meituan.android.cashier.bean.CashierParams;
import com.meituan.android.cashier.common.ICashier;
import com.meituan.android.cashier.common.i;
import com.meituan.android.cashier.common.q;
import com.meituan.android.cashier.common.u;
import com.meituan.android.hybridcashier.bridge.result.PayResultBean;
import com.meituan.android.hybridcashier.cashier.HybridCashierFragment;
import com.meituan.android.hybridcashier.cashier.HybridCashierSetting;
import com.meituan.android.hybridcashier.config.bean.HybridCashierConfig;
import com.meituan.android.hybridcashier.config.horn.c;
import com.meituan.android.hybridcashier.downgrade.DowngradeBean;
import com.meituan.android.neohybrid.Neo;
import com.meituan.android.neohybrid.a;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.core.horn.a;
import com.meituan.android.neohybrid.core.horn.bean.NeoHornConfig;
import com.meituan.android.neohybrid.core.listener.b;
import com.meituan.android.neohybrid.util.g;
import com.meituan.android.neohybrid.util.l;
import com.meituan.android.pay.jshandler.HybridSignPayJSHandler;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.ac;
import com.meituan.android.paybase.utils.ah;
import com.meituan.android.paybase.utils.al;
import com.meituan.android.paybase.utils.e;
import com.meituan.android.paybase.utils.r;
import com.meituan.android.paycommon.lib.coupon.model.Promotion;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HybridStandardCashierAdapter extends u implements b {
    public static ChangeQuickRedirect a;
    private Activity b;
    private i c;
    @MTPaySuppressFBWarnings({"URF_UNREAD_FIELD"})
    private String d;
    private String e;
    private String f;
    private Uri g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private HybridCashierConfig m;
    private CashierParams n;
    private BroadcastReceiver q;
    private HybridCashierFragment r;
    private Bundle s;
    private boolean t;

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.ICashier
    public final String i() {
        return "hybrid_standard_cashier";
    }

    public HybridStandardCashierAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "effee2849972aedc6f556f0ca06ecf7a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "effee2849972aedc6f556f0ca06ecf7a");
        } else {
            this.t = false;
        }
    }

    @Override // com.meituan.android.cashier.common.ICashier
    public final <T extends FragmentActivity & i & com.meituan.android.paybase.retrofit.b> ICashier.a a(T t, CashierParams cashierParams) {
        Object[] objArr = {t, cashierParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c589d1165217522d818789f99f7c0b07", RobustBitConfig.DEFAULT_VALUE)) {
            return (ICashier.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c589d1165217522d818789f99f7c0b07");
        }
        if (cashierParams.getUri() == null) {
            return new ICashier.a(false);
        }
        this.n = cashierParams;
        String queryParameter = cashierParams.getUri().getQueryParameter("merchant_no");
        this.g = cashierParams.getUri();
        this.d = cashierParams.getTradeNo();
        this.e = queryParameter;
        this.f = cashierParams.getCif();
        this.h = cashierParams.getCallbackUrl();
        this.i = cashierParams.getExtraData();
        this.j = cashierParams.getUri().getQueryParameter("is_cancel_to_url");
        this.b = t;
        this.c = t;
        this.k = cashierParams.getDowngradeInfo();
        this.l = cashierParams.getLastResumedFeature();
        if (Neo.debugger().a("debug_not_hybrid_cashier")) {
            return new ICashier.a(false);
        }
        if (Neo.debugger().a("debug_use_horn")) {
            this.m = c.a(this.l);
            return c(true);
        } else if (((NeoHornConfig) a.a().a(NeoHornConfig.class)).isEnableUseHybridDispatcher()) {
            return new ICashier.a(false);
        } else {
            HybridCashierConfig e = e();
            this.m = e;
            if (e != null) {
                ICashier.a c = c(false);
                if (c.b) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1651df83b6d6119075c1d6da6a01231", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1651df83b6d6119075c1d6da6a01231");
                    } else {
                        BffResponseBean bffResponseBean = this.n.getCashierRouterInfo().getBffResponseBean();
                        if (bffResponseBean != null) {
                            com.meituan.android.hybridcashier.cashier.a.a = bffResponseBean.getHybridStandardCashierDispatcherResponse();
                            com.meituan.android.hybridcashier.cashier.a.b = bffResponseBean.getHybridStandardCashierSSRNodeResponse();
                        }
                    }
                }
                return c;
            }
            this.m = c.a(this.l);
            return c(true);
        }
    }

    @Override // com.meituan.android.cashier.common.u
    public final void a(String str, Map<String, Object> map) {
        HybridCashierConfig a2;
        boolean z;
        boolean z2;
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fc7876ecda45bdb2db516d661792083", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fc7876ecda45bdb2db516d661792083");
            return;
        }
        this.c.e("hybrid_cashier");
        if (!((MTCashierActivity) this.b).a(true)) {
            this.c.b("1120019", "tradeNo or token is null");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_z1qe3rbw_mv", new a.c().a("page_name", this.l).b);
        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_hybrid_absolutely_request_traffic", 200);
        q.b("b_pay_wdtare9z_mv", new a.c().a("cashier_type", "hybrid_cashier").b, this.p);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab09ea546e1f38855d0cc73e3ecc2710", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab09ea546e1f38855d0cc73e3ecc2710");
        } else {
            HybridCashierInit.b(this.b);
            HashMap<String, Object> hashMap = com.meituan.android.neohybrid.neo.report.a.a().a("hybrid_cashier_uri", this.g).a("hybrid_cashier_config", this.m).a("ext_param", this.k).a("last_resumed_page", this.l).a("merchant_no", this.e).a("cif", this.f).b;
            if (!b()) {
                Object[] objArr3 = {hashMap};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d2118d2383aab94724bb9de2c42b691c", RobustBitConfig.DEFAULT_VALUE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d2118d2383aab94724bb9de2c42b691c")).booleanValue();
                } else {
                    Activity activity = this.b;
                    Object[] objArr4 = {activity, hashMap};
                    ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.hybridcashier.b.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "e346cb190c74a11a719e82dbe9295d1e", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "e346cb190c74a11a719e82dbe9295d1e")).booleanValue();
                    } else {
                        if (!com.meituan.android.paybase.utils.i.a(hashMap)) {
                            Object obj = hashMap.get("hybrid_cashier_uri");
                            if (obj instanceof Uri) {
                                Uri.Builder buildUpon = Uri.parse(obj.toString()).buildUpon();
                                buildUpon.scheme("meituanpayment").authority("hybrid_cashier").path(PackageLoadReporter.Source.LAUNCH).build();
                                for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                                    String key = entry.getKey();
                                    Object value = entry.getValue();
                                    if (!TextUtils.isEmpty(key) && (value instanceof String)) {
                                        buildUpon.appendQueryParameter(key, (String) value);
                                    }
                                }
                                buildUpon.appendQueryParameter(NeoConfig.NEO_SCENE, "hybrid_cashier");
                                Object obj2 = hashMap.get("hybrid_cashier_config");
                                if (obj2 instanceof HybridCashierConfig) {
                                    a2 = (HybridCashierConfig) obj2;
                                } else {
                                    a2 = c.a(String.valueOf(hashMap.get("last_resumed_page")));
                                }
                                HybridCashierSetting initFromUri = com.meituan.android.hybridcashier.config.a.a(a2).initFromUri(buildUpon.build());
                                Uri build = buildUpon.build();
                                Intent intent = new Intent("android.intent.action.VIEW", build);
                                com.meituan.android.neohybrid.a.a(intent, "hybrid_cashier_setting", initFromUri, a.EnumC0301a.OBJ);
                                intent.addFlags(536870912);
                                intent.setPackage(activity.getPackageName());
                                activity.startActivityForResult(intent, 92);
                                HashMap hashMap2 = new HashMap();
                                l.a(build, hashMap2);
                                hashMap2.put(HybridSignPayJSHandler.ARG_TRADE_NO, String.valueOf(hashMap2.get("trade_number")));
                                com.meituan.android.hybridcashier.report.a.a("b_pay_hybrid_cashier_sla_start_sc", com.meituan.android.neohybrid.neo.report.a.a(hashMap2).b);
                                z = true;
                            }
                        }
                        z = false;
                    }
                    if (z) {
                        z2 = true;
                    } else {
                        com.meituan.android.neohybrid.neo.report.b.b("b_pay_hybrid_cashier_launch_fail_mv", "hybrid_cashier", com.meituan.android.neohybrid.neo.report.a.a().b("reason", this.g.toString()));
                        z2 = false;
                    }
                }
                if (!z2) {
                    com.meituan.android.neohybrid.neo.report.b.b("b_pay_hybrid_cashier_launch_fail_mv", "hybrid_cashier", com.meituan.android.neohybrid.neo.report.a.c(KnbConstants.PARAMS_SCENE, "error").b("reason", this.g.toString()));
                    c();
                }
            }
        }
        this.c.d("hybrid_cashier");
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ae03866bc5001e3316b9c77ef5d144a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ae03866bc5001e3316b9c77ef5d144a2");
            return;
        }
        if (this.q == null) {
            this.q = new BroadcastReceiver() { // from class: com.meituan.android.cashier.hybridwrapper.HybridStandardCashierAdapter.2
                public static ChangeQuickRedirect a;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent2) {
                    Object[] objArr6 = {context, intent2};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "6c0610eeaba9d37ca531505f3a2a6d04", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "6c0610eeaba9d37ca531505f3a2a6d04");
                    } else if (intent2 != null) {
                        if (!r.a(HybridStandardCashierAdapter.this.b, com.meituan.android.hybridcashier.a.b, intent2)) {
                            if (r.a(HybridStandardCashierAdapter.this.b, com.meituan.android.hybridcashier.a.c, intent2)) {
                                HybridStandardCashierAdapter.this.a(false, (Map<String, Object>) null);
                                return;
                            }
                            return;
                        }
                        String a3 = f.a(intent2, "nb_hybrid_version");
                        if (TextUtils.isEmpty(a3)) {
                            HybridStandardCashierAdapter.this.a(true, (Map<String, Object>) null);
                            return;
                        }
                        HashMap hashMap3 = new HashMap(1);
                        hashMap3.put("cashier_version", a3);
                        hashMap3.put("hybrid_cashier_version", a3);
                        hashMap3.put("hybrid_cashier_tti", Long.valueOf(f.a(intent2, "hybrid_cashier_tti", 0L)));
                        HybridStandardCashierAdapter.this.a(true, (Map<String, Object>) hashMap3);
                    }
                }
            };
        }
        r.a(this.b, new String[]{com.meituan.android.hybridcashier.a.b, com.meituan.android.hybridcashier.a.c}, this.q);
    }

    private boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5764da517fd172672de04b4e0c2f7203", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5764da517fd172672de04b4e0c2f7203")).booleanValue();
        }
        if (Neo.debugger().a("use_native_activity") || (this.m != null && this.m.isActivityMerged())) {
            HashMap hashMap = new HashMap();
            hashMap.put("ext_param", this.k);
            hashMap.put("last_resumed_page", this.l);
            hashMap.put("merchant_no", this.e);
            this.r = new HybridCashierFragment();
            HybridCashierSetting a2 = com.meituan.android.hybridcashier.config.a.a(this.m, this.l);
            Bundle bundle = new Bundle();
            bundle.putSerializable("hybrid_cashier_setting", a2);
            a2.initFromUri(com.meituan.android.hybridcashier.b.a(this.g, hashMap));
            if (a2.isLoadingEnabled()) {
                if (PayBaseActivity.n == 0) {
                    ((MTCashierActivity) this.b).a(true, PayBaseActivity.a.CASHIER, (String) null);
                } else {
                    PayBaseActivity.n++;
                }
                this.r.b = new com.meituan.android.hybridcashier.cashier.b() { // from class: com.meituan.android.cashier.hybridwrapper.HybridStandardCashierAdapter.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.hybridcashier.cashier.b
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "376cbfb325e305626ed2c9ecec260c34", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "376cbfb325e305626ed2c9ecec260c34");
                            return;
                        }
                        PayBaseActivity.n = 0;
                        ((MTCashierActivity) HybridStandardCashierAdapter.this.b).hideProgress();
                    }

                    @Override // com.meituan.android.hybridcashier.cashier.b
                    public final boolean a(PayResultBean payResultBean) {
                        Object[] objArr2 = {payResultBean};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59263346709b884dca9965218c7663f8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59263346709b884dca9965218c7663f8")).booleanValue() : HybridStandardCashierAdapter.this.a(payResultBean);
                    }
                };
            }
            this.r.setArguments(bundle);
            this.r.c(this.s);
            com.meituan.android.neohybrid.base.a.a(this.b).c("onCreate");
            ((MTCashierActivity) this.b).getSupportFragmentManager().beginTransaction().replace(R.id.content, this.r).commitAllowingStateLoss();
            if (!e.a()) {
                this.t = true;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(PayResultBean payResultBean) {
        char c;
        Object[] objArr = {payResultBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d9560f458932ac84b0975946fa96fd4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d9560f458932ac84b0975946fa96fd4")).booleanValue();
        }
        if (payResultBean == null) {
            return false;
        }
        String status = payResultBean.getStatus();
        if (TextUtils.isEmpty(status)) {
            return false;
        }
        int hashCode = status.hashCode();
        if (hashCode == -1867169789) {
            if (status.equals("success")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != -1367724422) {
            if (hashCode == 3135262 && status.equals("fail")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (status.equals("cancel")) {
                c = 1;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                this.c.a((Promotion) com.meituan.android.neohybrid.util.gson.b.a().fromJson((JsonElement) payResultBean.getPromotion(), (Class<Object>) Promotion.class));
                return true;
            case 1:
                this.c.j();
                return true;
            case 2:
                this.c.c("error");
                return true;
            default:
                return false;
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a062764ff4d55668c07e46e73ed81e7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a062764ff4d55668c07e46e73ed81e7c");
        } else if (com.meituan.android.cashier.common.r.b()) {
            this.c.a("hybrid_elderly_cashier", "native_elderly_cashier", null);
        } else {
            this.c.a("hybrid_standard_cashier", "native_standard_cashier", null);
        }
    }

    @Override // com.meituan.android.cashier.common.h
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "504703ef73e58c30fba36a285f0d9c9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "504703ef73e58c30fba36a285f0d9c9c");
        } else if (i2 == 1751757) {
            if (intent == null) {
                this.c.j();
                return;
            }
            PayResultBean payResultBean = null;
            try {
                payResultBean = (PayResultBean) com.meituan.android.neohybrid.util.gson.b.a().fromJson(f.a(intent, "pay_result"), (Class<Object>) PayResultBean.class);
            } catch (Exception unused) {
            }
            if (payResultBean == null) {
                this.c.j();
            } else if (a(payResultBean)) {
            } else {
                this.c.j();
            }
        } else if (i != 92) {
            if (this.r != null) {
                this.r.onActivityResult(i, i2, intent);
            }
        } else if (i2 == 11193582) {
            a(intent);
        } else if (i2 == 0) {
            d();
        } else {
            b(i2);
        }
    }

    @Override // com.meituan.android.neohybrid.core.listener.b
    public final boolean D_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d50acc1bc4598285d859f9fdde42ec5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d50acc1bc4598285d859f9fdde42ec5")).booleanValue();
        }
        if (this.t) {
            this.t = false;
            if (this.r != null && this.r.isAdded()) {
                this.r.D_();
                ((MTCashierActivity) this.b).getSupportFragmentManager().beginTransaction().remove(this.r).commitAllowingStateLoss();
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d0bff5e50a36bce7a982b1eddcd40d5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d0bff5e50a36bce7a982b1eddcd40d5");
                return true;
            }
            Object a2 = g.a(this.b, Activity.class, "mResultCode");
            if (!(a2 instanceof Integer)) {
                c();
                return true;
            }
            int intValue = ((Integer) a2).intValue();
            Object a3 = g.a(this.b, Activity.class, "mResultData");
            a(92, intValue, a3 instanceof Intent ? (Intent) a3 : null);
            return true;
        }
        return false;
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.h
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af0e0bc70f9e19be2df57b4546eef621", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af0e0bc70f9e19be2df57b4546eef621")).booleanValue();
        }
        if (this.r != null) {
            this.r.h();
            return true;
        }
        return false;
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.h
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eba64aba8d3ec26d4904153929ec535b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eba64aba8d3ec26d4904153929ec535b");
            return;
        }
        super.a(z);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4236a2a28cdb247f6a92e009e89db3c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4236a2a28cdb247f6a92e009e89db3c9");
        } else if (this.q != null) {
            LocalBroadcastManager.getInstance(this.b).unregisterReceiver(this.q);
        }
        com.meituan.android.hybridcashier.cashier.a.a();
    }

    private void a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c25b8e61f0696b292cdfb464be4e24c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c25b8e61f0696b292cdfb464be4e24c");
        } else if (intent == null) {
        } else {
            Serializable c = f.c(intent, "downgrade_message");
            com.meituan.android.neohybrid.neo.report.b.b("b_pay_neo_native_common_exception_mv", null, com.meituan.android.neohybrid.neo.report.a.c("downgrade_message", String.valueOf(c)).b("isResult", "true"));
            if (c instanceof DowngradeBean) {
                DowngradeBean downgradeBean = (DowngradeBean) c;
                if ("native".equals(downgradeBean.getCashierType())) {
                    c();
                    return;
                } else if ("h5".equals(downgradeBean.getCashierType())) {
                    this.n.setWebCashierUrl(downgradeBean.getDegradeUrl());
                    this.c.a("hybrid_standard_cashier", "web_cashier", "");
                    return;
                } else {
                    return;
                }
            }
            com.meituan.android.neohybrid.neo.report.b.b("b_pay_hybrid_cashier_launch_fail_mv", "hybrid_cashier", com.meituan.android.neohybrid.neo.report.a.c(KnbConstants.PARAMS_SCENE, "downgrade_error").b("reason", this.g.toString()));
        }
    }

    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14919cb35aa33bd4e4c67b050a65c48b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14919cb35aa33bd4e4c67b050a65c48b");
            return;
        }
        if (!TextUtils.isEmpty(this.h)) {
            al.a((Context) this.b, this.h, false);
        }
        ((MTCashierActivity) this.b).f = "success";
        Intent intent = new Intent();
        intent.putExtra("result", 1);
        intent.putExtra("extra_data", this.i);
        this.b.setResult(-1, intent);
        this.b.finish();
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84ab59e55bd3e2a1e6c22e2476eb6680", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84ab59e55bd3e2a1e6c22e2476eb6680");
            return;
        }
        if (TextUtils.equals("true", this.j) && !TextUtils.isEmpty(this.h)) {
            al.a((Context) this.b, this.h, false);
        }
        ((MTCashierActivity) this.b).f = "cancel";
        this.b.setResult(0);
        this.b.finish();
    }

    private HybridCashierConfig e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e34a78191fa008e7147f3cbea1c01ca1", RobustBitConfig.DEFAULT_VALUE)) {
            return (HybridCashierConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e34a78191fa008e7147f3cbea1c01ca1");
        }
        try {
            return (HybridCashierConfig) com.meituan.android.neohybrid.util.gson.b.b().fromJson(this.n.getPreDispatcherCashierConfig("hybrid_standard_cashier"), (Class<Object>) HybridCashierConfig.class);
        } catch (Exception unused) {
            return null;
        }
    }

    private ICashier.a c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec9bf1e5871d2cd1562da4d22db1a3f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (ICashier.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec9bf1e5871d2cd1562da4d22db1a3f9");
        }
        if (z && this.m == null) {
            return new ICashier.a(false, "001", "local_config_empty");
        }
        if (z && !this.m.isPageFeatureAvailable(this.l)) {
            return new ICashier.a(false, "002", "local_config_page");
        }
        if (!com.meituan.android.hybridcashier.config.a.b(this.m)) {
            return new ICashier.a(false, "003", z ? "local_config_disable" : "routing_config_disable");
        }
        if (!(this.n.getCashierScope("hybrid_standard_cashier", this.p) == null || this.n.getCashierScope("hybrid_standard_cashier", this.p).isDowngradeAvailable())) {
            return new ICashier.a(true);
        }
        if (!this.m.isOfflinePkgCheckAvailable(true)) {
            if (this.m.isEnablePresetBundle()) {
                this.m = com.meituan.android.hybridcashier.preset.a.a();
                if (com.meituan.android.neohybrid.neo.preset.a.a(this.m.getCashierUrl())) {
                    return new ICashier.a(true);
                }
            }
            return new ICashier.a(false, "004", z ? "local_config_offline" : "routing_config_offline");
        } else if (!this.m.isNsrCheckAvailable()) {
            return new ICashier.a(false, "005", z ? "local_config_nsr" : "routing_config_nsr");
        } else {
            return new ICashier.a(true);
        }
    }

    @Override // com.meituan.android.cashier.common.h
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b687cb21fe56cad8947bc5de373bcc47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b687cb21fe56cad8947bc5de373bcc47");
        } else if (this.r != null) {
            bundle.remove("android:support:fragments");
            bundle.putBoolean("hybrid_activity_merged", true);
            this.r.a(bundle);
        }
    }

    @Override // com.meituan.android.cashier.common.h
    public final void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e0be9d314f8aae99ecf06bb8b222951", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e0be9d314f8aae99ecf06bb8b222951");
            return;
        }
        this.s = bundle;
        if (bundle.getBoolean("hybrid_activity_merged")) {
            b();
        }
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.ICashier
    public final PayBaseActivity.a a(int i) {
        return PayBaseActivity.a.CASHIER;
    }

    @Override // com.meituan.android.cashier.common.u
    public final void a(final u.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbbeba21beb39c699f5ea7635a1d5381", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbbeba21beb39c699f5ea7635a1d5381");
        } else if (aVar == null) {
        } else {
            final HashMap hashMap = new HashMap();
            hashMap.put("nsr_path_list", com.meituan.android.neohybrid.neo.nsr.b.a().toString());
            hashMap.put(NeoConfig.NEO_SCENE, "hybrid_cashier");
            hashMap.put("app_hybrid_cashier_sdk_version", "0.1.33.1");
            hashMap.put("hybrid_cashier_unique_id", com.meituan.android.paybase.utils.b.c());
            hashMap.put("neo_sdk_version", "0.1.33.1");
            hashMap.put("stat_time", "");
            hashMap.put("is_foreground", "1");
            hashMap.put("device_manufacturer", Build.MANUFACTURER);
            hashMap.put("is_debug", com.meituan.android.neohybrid.init.a.h() ? "1" : "0");
            final Context a2 = com.meituan.android.paybase.config.a.d().a();
            hashMap.put("device_rooted", ac.b(a2).b("is_root", "0"));
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "adc9cc910b203603db98509ed3233882", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "adc9cc910b203603db98509ed3233882");
            } else if (com.meituan.android.paymentchannel.utils.b.d()) {
                com.meituan.android.paymentchannel.utils.b.a(com.meituan.android.paybase.config.a.d().a());
            }
            final com.meituan.android.cipstorage.q b = ac.b(a2);
            final int b2 = b.b("installed_apps", -1);
            final String b3 = b.b("is_root", "-1");
            hashMap.put("upsepay_type", com.meituan.android.paymentchannel.utils.b.b(a2));
            hashMap.put("upse_pay_status", com.meituan.android.hybridcashier.utils.b.a().d);
            if (b2 != -1 && !TextUtils.equals("-1", b3)) {
                hashMap.put("rooted", b3);
                StringBuilder sb = new StringBuilder();
                sb.append(b2);
                hashMap.put("installed_apps", sb.toString());
                aVar.a(hashMap);
            }
            new com.meituan.android.paybase.asynctask.a<String, Integer, Integer>() { // from class: com.meituan.android.cashier.hybridwrapper.HybridStandardCashierAdapter.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.paybase.asynctask.b
                public final /* synthetic */ Object a(Object[] objArr3) {
                    Object[] objArr4 = {(String[]) objArr3};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect3, false, "4f49a497a552616bf0a3395e72ee9cd8", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Integer) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect3, false, "4f49a497a552616bf0a3395e72ee9cd8");
                    }
                    b.a("is_root", ah.a() ? "1" : "0");
                    int a3 = com.meituan.android.paymentchannel.utils.a.a(a2);
                    b.a("installed_apps", a3);
                    return Integer.valueOf(a3);
                }

                @Override // com.meituan.android.paybase.asynctask.b
                public final /* synthetic */ void a(Object obj) {
                    Integer num = (Integer) obj;
                    Object[] objArr3 = {num};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "405d49f480754ba43ba3703c948dc142", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "405d49f480754ba43ba3703c948dc142");
                    } else if (b2 == -1 || TextUtils.equals("-1", b3)) {
                        hashMap.put("rooted", b.b("is_root", "-1"));
                        Map map = hashMap;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(num);
                        map.put("installed_apps", sb2.toString());
                        aVar.a(hashMap);
                    }
                }
            }.b(new String[0]);
        }
    }
}
