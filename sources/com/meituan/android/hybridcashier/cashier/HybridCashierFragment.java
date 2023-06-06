package com.meituan.android.hybridcashier.cashier;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.view.View;
import com.google.gson.JsonElement;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.hybridcashier.HybridCashierActivity;
import com.meituan.android.hybridcashier.bridge.result.PayResultBean;
import com.meituan.android.hybridcashier.bridge.result.c;
import com.meituan.android.hybridcashier.config.bean.HybridCashierGlobalConfig;
import com.meituan.android.hybridcashier.downgrade.DowngradeBean;
import com.meituan.android.neohybrid.a;
import com.meituan.android.neohybrid.container.NeoBaseFragment;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.core.u;
import com.meituan.android.neohybrid.neo.bridge.NeoBridge;
import com.meituan.android.neohybrid.neo.nsf.NSFJsHandler;
import com.meituan.android.neohybrid.neo.pool.c;
import com.meituan.android.neohybrid.neo.report.d;
import com.meituan.android.neohybrid.neo.tunnel.TunnelParamJSHandler;
import com.meituan.android.neohybrid.util.i;
import com.meituan.android.neohybrid.util.n;
import com.meituan.android.pay.jshandler.HybridSignPayJSHandler;
import com.meituan.android.paybase.dialog.progressdialog.RollingCircleDotView;
import com.meituan.android.paybase.utils.e;
import com.meituan.android.paybase.utils.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HybridCashierFragment extends NeoBaseFragment implements c {
    public static ChangeQuickRedirect a;
    public b b;
    private HybridCashierSetting f;
    private String g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private a m;
    private boolean n;

    @Override // com.meituan.android.neohybrid.container.NeoBaseFragment
    public final boolean e() {
        return true;
    }

    @Override // com.meituan.android.neohybrid.container.NeoBaseFragment
    public final com.meituan.android.neohybrid.core.a b() {
        HybridCashierSetting hybridCashierSetting;
        com.meituan.android.neohybrid.core.a a2;
        String builder;
        com.meituan.android.neohybrid.core.a a3;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99f8aa2fb3e3f0a4a75f91947e1d7559", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.neohybrid.core.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99f8aa2fb3e3f0a4a75f91947e1d7559");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a4bf34eee9a987960529818f732c11eb", RobustBitConfig.DEFAULT_VALUE)) {
            hybridCashierSetting = (HybridCashierSetting) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a4bf34eee9a987960529818f732c11eb");
        } else {
            Bundle arguments = getArguments();
            if (arguments == null) {
                arguments = com.meituan.android.neohybrid.a.a(j(), a.EnumC0301a.OBJ);
            }
            hybridCashierSetting = arguments == null ? null : (HybridCashierSetting) arguments.get("hybrid_cashier_setting");
        }
        this.f = hybridCashierSetting;
        if (!n()) {
            if (this.f.isNSREnabled() && (a3 = com.meituan.android.neohybrid.neo.nsr.b.a((builder = this.f.genCashierUrlForNSR().toString()), false)) != null) {
                this.j = "1".equals(n.b(builder, "prerender_merged_enable"));
                return a3;
            } else if (this.f.isPreloadEnabled()) {
                String genPreloadUrl = this.f.genPreloadUrl();
                if (TextUtils.isEmpty(genPreloadUrl)) {
                    a2 = com.meituan.android.neohybrid.neo.pool.c.a(c.a.a(c.EnumC0308c.NORMAL, genPreloadUrl));
                } else {
                    a2 = com.meituan.android.neohybrid.neo.pool.c.a(c.a.a(c.EnumC0308c.PRELOAD, genPreloadUrl));
                }
                if (a2 != null && this.f.isPreloadUsedEnabled()) {
                    return a2;
                }
            }
        }
        return super.b();
    }

    @Override // com.meituan.android.neohybrid.container.NeoBaseFragment, com.meituan.android.neohybrid.core.listener.c
    public final boolean a(NeoConfig neoConfig) {
        a aVar;
        Object[] objArr = {neoConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6377dba63c9cc9db1f958d616b2bfef5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6377dba63c9cc9db1f958d616b2bfef5")).booleanValue();
        }
        super.a(neoConfig);
        if (this.d == null || this.i) {
            return false;
        }
        neoConfig.loadingConfig().setLoadingEnabled(this.f.isLoadingEnabled());
        neoConfig.loadingConfig().setLoadingLayoutId(R.layout.pay_hybrid_cashier__loading_custom);
        if (!(getActivity() instanceof HybridCashierActivity)) {
            neoConfig.loadingConfig().setLoadingNoView(true);
        }
        neoConfig.setNeoBridge(this.f.enableNeoBridge());
        neoConfig.setNeoRequestBridge(this.f.ennableNeoRequestBridgeBridge());
        neoConfig.setNeoPrerenderBridge(this.f.enableNeoPrerenderBridge());
        neoConfig.setNeoOffline(this.f.isCheckOfflinePackageEnable());
        neoConfig.setNeoPresetBundle(this.f.enablePresetBundle());
        neoConfig.uiConfig().setProgressColor("#00000000");
        neoConfig.uiConfig().setTitleBarColor("#f4f4f4");
        neoConfig.uiConfig().setStatusBarColor("#f4f4f4");
        neoConfig.setNeoIndexParams(true);
        neoConfig.breathConfig().setEnableNeoBreathe(this.f.isEnableNeoBreathe());
        neoConfig.breathConfig().setBreatheDeathOptions(this.f.getBreatheDeathOptions());
        neoConfig.breathConfig().setBreatheDelayMillis(this.f.getBreatheDelayMillis());
        neoConfig.breathConfig().setBreatheIntervalTimeMillis(this.f.getBreatheIntervalTimeMillis());
        neoConfig.breathConfig().setBreatheTimeoutMillis(this.f.getBreatheTimeoutMillis());
        neoConfig.breathConfig().setBreatheUnresponsiveTimesAsBroken(this.f.getBreatheUnresponsiveTimesAsBroken());
        neoConfig.breathConfig().setEnableCheckDomCount(this.f.isEnableCheckDomCount());
        neoConfig.breathConfig().setEnablePixelColor(this.f.isEnablePixelColor());
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "484dc1be477c2da72a089fb675f2465f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "484dc1be477c2da72a089fb675f2465f");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("use_new_cashier_callback", e.a() ? "0" : "1");
            hashMap.put("tradeno", this.f.getTradeNo());
            hashMap.put("pay_token", this.f.getPayToken());
            hashMap.put("merchant_no", this.f.getMerchantNo());
            hashMap.put("cif", this.f.getCif());
            hashMap.put("last_resumed_page", this.f.getLastResumedPage());
            hashMap.put("extra_data", this.f.getExtraData());
            hashMap.put("extra_statics", this.f.getExtraStatics());
            hashMap.put("ext_param", this.f.getExtParam());
            hashMap.put("hybrid_cashier_unique_id", l().a());
            hashMap.put("stat_time", com.meituan.android.neohybrid.base.a.a(getActivity()).b());
            hashMap.put("member_id", com.meituan.android.paybase.set.a.a());
            hashMap.put("zone_user_id", com.meituan.android.paybase.config.a.d().s().a());
            hashMap.put("hybrid_user_flag", this.f.getHybridUserFlag());
            hashMap.put("grey_flag", this.f.getGreyFlag());
            if (this.f.enableCheckUpsePayStatus()) {
                hashMap.put("upse_pay_status", com.meituan.android.hybridcashier.utils.b.a().d);
            }
            com.meituan.android.neohybrid.neo.tunnel.a.a().a(this.d, hashMap);
        }
        NeoBridge.registerNeoBridgeCustomize(this.d, "pay_hybridMtpCashierTransferProcess", "pay_verifyBiometricInfo", "pay_getBiometricsInfo", "pay_notifyHybridProcessResult");
        String str = com.meituan.android.hybridcashier.cashier.a.a;
        String str2 = com.meituan.android.hybridcashier.cashier.a.b;
        com.meituan.android.hybridcashier.cashier.a.a();
        d.a(this.d, "is_bff_node", Boolean.valueOf((str == null && str2 == null) ? false : true));
        if (str2 != null) {
            aVar = a.SSR;
        } else {
            Object[] objArr3 = {this.f};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d0ad2ee72e0c574d34c6906f58bb1f0f", RobustBitConfig.DEFAULT_VALUE)) {
                aVar = (a) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d0ad2ee72e0c574d34c6906f58bb1f0f");
            } else if (this.d.c instanceof u) {
                if (this.f.isSSREnabled() && !TextUtils.isEmpty(this.f.getNsrLoadPath())) {
                    aVar = a.NSR_SSR;
                } else {
                    aVar = a.NSR_CSR;
                }
            } else if (this.f.isSSREnabled() && TextUtils.isEmpty(this.f.getNsrLoadPath())) {
                aVar = a.SSR;
            } else {
                aVar = a.CSR;
            }
        }
        this.m = aVar;
        d.a(this.d, "render_mode", String.valueOf(this.m));
        if (this.m == a.NSR_CSR || this.m == a.NSR_SSR) {
            neoConfig.downgradeConfig().setNoResponseTime(this.f.getNsrBusinessLimitTime());
        } else if (this.f.isWebUnavailableDowngrade() && this.f.getWebUnavailableTimeout() > 0) {
            neoConfig.downgradeConfig().setNoResponseTime(this.f.getWebUnavailableTimeout());
        }
        if (this.m == a.NSR_SSR || this.m == a.SSR) {
            neoConfig.downgradeConfig().setLoadingTimeout(true);
            Map<String, Object> b = com.meituan.android.neohybrid.neo.tunnel.a.a().b(this.d);
            b.put("ssr_show_on_visible", this.f.getSSRShowOnVisible());
            neoConfig.ssrConfig().c = this.f.getSsrRequestUrl();
            neoConfig.ssrConfig().b = this.f.genCashierUrlWithBusiness().toString();
            neoConfig.ssrConfig().d = b;
            neoConfig.ssrConfig().e = str2;
        } else {
            neoConfig.nsfConfig().setNsf("/cashier/dispatcher");
            neoConfig.nsfConfig().setNsfParams(this.f.genDispatcherParams());
            neoConfig.nsfConfig().setNsfSaved(((HybridCashierGlobalConfig) com.meituan.android.neohybrid.core.horn.a.a().a(HybridCashierGlobalConfig.class)).isEnableNsfSaved());
            neoConfig.nsfConfig().setPredata(str);
        }
        neoConfig.setNeoScene("hybrid_cashier");
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "bd61bd6151f6bdadc4b6ad49a6f57851", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "bd61bd6151f6bdadc4b6ad49a6f57851");
        } else {
            com.meituan.android.neohybrid.base.a l = l();
            Object[] objArr5 = {this};
            ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.neohybrid.neo.report.b.a;
            l.b = PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "511dd0187b3cf2c3517c24a861766e66", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "511dd0187b3cf2c3517c24a861766e66") : AppUtil.generatePageInfoKey(this);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("last_resumed_page", this.f.getLastResumedPage());
            hashMap2.put("hybrid_user_flag", this.f.getHybridUserFlag());
            hashMap2.put("offline_status", Integer.valueOf(this.f.getOfflineStatus()));
            hashMap2.put("hybrid_cashier_version", this.f.getHybridCashierVersion());
            hashMap2.put("unique_id", l().a());
            hashMap2.put("device_rooted", com.meituan.android.hybridcashier.utils.a.a() ? "1" : "0");
            hashMap2.put("neo_nsr_status", this.d.c instanceof u ? "1" : "0");
            hashMap2.put("grey_flag", this.f.getGreyFlag());
            hashMap2.put(HybridSignPayJSHandler.ARG_TRADE_NO, this.f.getTradeNo());
            hashMap2.put("merchant_no", this.f.getMerchantNo());
            d.a(this.d, hashMap2);
        }
        return false;
    }

    @Override // com.meituan.android.neohybrid.container.NeoBaseFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23f25d578943ae34894c196a2ca91638", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23f25d578943ae34894c196a2ca91638");
            return;
        }
        com.meituan.android.neohybrid.base.a.a(getActivity()).c("hybrid_cashier_start");
        super.onCreate(bundle);
        com.meituan.android.hybridcashier.report.a.a(this, "hybrid_cashier_start");
        com.meituan.android.hybridcashier.report.a.b(this, "b_pay_hybrid_cashier_start_mv", null);
        com.meituan.android.neohybrid.neo.report.b.a("b_pay_qeqjh2r2_sc", com.meituan.android.neohybrid.neo.report.a.c("horn", com.meituan.android.neohybrid.util.gson.b.a().toJson(com.meituan.android.hybridcashier.config.horn.a.b.a())).b);
        if (n()) {
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "43589f4c7868eda4cc431588da0072b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "43589f4c7868eda4cc431588da0072b2");
            return;
        }
        if (this.m == null) {
            this.m = a.CSR;
        }
        this.g = this.f.genCashierUrlWithBusiness().toString();
        com.meituan.android.hybridcashier.report.a.b(this, "b_pay_g14p5f1f_mv", com.meituan.android.neohybrid.neo.report.a.c("hybrid_cashier_url", this.g).b);
    }

    @Override // com.meituan.android.neohybrid.container.NeoBaseFragment
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "652a4f2050c7b8fffd41c58d7e4b3897", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "652a4f2050c7b8fffd41c58d7e4b3897");
            return;
        }
        super.a(bundle);
        i.a(bundle, "hybrid_cashier_setting", this.f);
    }

    @Override // com.meituan.android.neohybrid.container.NeoBaseFragment
    public final void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e85525c1f6e549da788a37deb8ad147", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e85525c1f6e549da788a37deb8ad147");
            return;
        }
        super.b(bundle);
        HybridCashierSetting hybridCashierSetting = (HybridCashierSetting) i.a(bundle, "hybrid_cashier_setting", (Type) HybridCashierSetting.class);
        if (hybridCashierSetting != null) {
            this.f = hybridCashierSetting;
        }
        NeoConfig f = this.d.f();
        if (bundle == null || f == null) {
            return;
        }
        f.ssrConfig().b = null;
        f.ssrConfig().c = null;
    }

    @Override // com.meituan.android.neohybrid.container.NeoBaseFragment, android.support.v4.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ea2313db73fc175b90e186ba23bd8bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ea2313db73fc175b90e186ba23bd8bb");
            return;
        }
        super.onActivityCreated(bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe2d4c1d16e8ed83f3391caa187e90d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe2d4c1d16e8ed83f3391caa187e90d5");
        } else if (this.h || this.i || this.m != a.CSR) {
        } else {
            this.h = true;
            c(this.g);
            HashMap<String, Object> hashMap = com.meituan.android.neohybrid.neo.report.a.c("hybrid_cashier_url", this.g).b;
            com.meituan.android.hybridcashier.report.a.a(this, "hybrid_load_url", hashMap);
            com.meituan.android.hybridcashier.report.a.b(this, "b_pay_hybrid_load_url_mv", hashMap);
        }
    }

    @Override // com.meituan.android.neohybrid.container.NeoBaseFragment, com.meituan.android.neohybrid.core.listener.c
    public final void a(View view) {
        RollingCircleDotView rollingCircleDotView;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98234618f84986db4087c9ca99455354", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98234618f84986db4087c9ca99455354");
            return;
        }
        super.a(view);
        com.meituan.android.hybridcashier.report.a.a(this, "hybrid_page_hide");
        Object[] objArr2 = {this, "b_pay_hybrid_page_hide_mv"};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.hybridcashier.report.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c6fe98b29d53ad1dafbe58e68464e4a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c6fe98b29d53ad1dafbe58e68464e4a5");
        } else {
            com.meituan.android.hybridcashier.report.a.b(this, "b_pay_hybrid_page_hide_mv", null);
        }
        if (view == null || (rollingCircleDotView = (RollingCircleDotView) view.findViewById(R.id.rollingCircleDotView)) == null) {
            return;
        }
        rollingCircleDotView.setFlag(true);
        rollingCircleDotView.a();
        view.setTag(rollingCircleDotView);
    }

    @Override // com.meituan.android.neohybrid.container.NeoBaseFragment, com.meituan.android.neohybrid.core.listener.c
    public final void a(View view, boolean z, boolean z2) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4acb90b684c3413562cf3dbf654483f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4acb90b684c3413562cf3dbf654483f2");
            return;
        }
        super.a(view, z, z2);
        HashMap<String, Object> b = com.meituan.android.neohybrid.neo.report.a.c("timeout", Boolean.valueOf(z)).b("isCanceled", Boolean.valueOf(z2));
        com.meituan.android.hybridcashier.report.a.a(this, "hybrid_page_show", b);
        com.meituan.android.hybridcashier.report.a.b(this, "b_pay_hybrid_page_show_mv", b);
        if (this.b != null) {
            this.b.a();
        }
        if (view != null) {
            Object tag = view.getTag();
            if (tag instanceof RollingCircleDotView) {
                ((RollingCircleDotView) tag).b = false;
            }
        }
        if (z || z2) {
            o();
        }
    }

    @Override // com.meituan.android.neohybrid.container.NeoBaseFragment, com.meituan.android.neohybrid.core.listener.c
    public final void y_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "258a8dc9e2ec7326534d5ed68f7a67db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "258a8dc9e2ec7326534d5ed68f7a67db");
            return;
        }
        super.y_();
        if (this.l) {
            return;
        }
        this.l = true;
        if (this.e == null) {
            Object[] objArr2 = {this, "b_pay_hybrid_cashier_sla_end_sc"};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.hybridcashier.report.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0a3462629434a29e0ed598c2c93f4576", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0a3462629434a29e0ed598c2c93f4576");
            } else {
                Object[] objArr3 = {this, "b_pay_hybrid_cashier_sla_end_sc", null};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.hybridcashier.report.a.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ea20968c31dfaf72f350e5b6a9b3c1b0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ea20968c31dfaf72f350e5b6a9b3c1b0");
                } else {
                    d.a(this.d, "b_pay_hybrid_cashier_sla_end_sc", "c_pay_7c9fc4b4", (Map<String, Object>) null);
                }
            }
            Intent intent = new Intent(r.b(getActivity(), com.meituan.android.hybridcashier.a.b));
            intent.putExtra("nb_hybrid_version", this.f.getHybridCashierVersion());
            intent.putExtra("hybrid_cashier_tti", System.currentTimeMillis());
            LocalBroadcastManager.getInstance(getContext()).sendBroadcast(intent);
        }
        com.meituan.android.hybridcashier.report.a.b(this, "b_pay_hybrid_cashier_native_tti_mv", com.meituan.android.neohybrid.neo.report.a.c("duration", Long.valueOf(System.currentTimeMillis() - com.meituan.android.neohybrid.base.a.a(getActivity()).d("onCreate"))).b);
        o();
    }

    @Override // com.meituan.android.neohybrid.container.NeoBaseFragment, com.meituan.android.neohybrid.core.listener.c
    public final void z_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc5490cb22bd8a055132e19945442976", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc5490cb22bd8a055132e19945442976");
            return;
        }
        super.z_();
        com.meituan.android.hybridcashier.report.a.b(this, "b_pay_hybrid_cashier_native_tti_mv", com.meituan.android.neohybrid.neo.report.a.c("visible", Long.valueOf(System.currentTimeMillis() - com.meituan.android.neohybrid.base.a.a(getActivity()).d("onCreate"))).b);
    }

    @Override // com.meituan.android.neohybrid.container.NeoBaseFragment, com.meituan.android.neohybrid.core.listener.c
    public final boolean a(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99c03df59e6585fa1ab5534d0e4642c2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99c03df59e6585fa1ab5534d0e4642c2")).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        String jSONObject2 = jSONObject.toString();
        Object[] objArr2 = {jSONObject2};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.util.a.a;
        String str2 = null;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7373946ad847ad45633b1140b1d0a5b7", RobustBitConfig.DEFAULT_VALUE)) {
            str2 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7373946ad847ad45633b1140b1d0a5b7");
        } else {
            JsonElement a2 = com.meituan.android.neohybrid.util.a.a(jSONObject2);
            if (a2 != null) {
                str2 = a2.toString();
            }
        }
        return d(str2);
    }

    @Override // com.meituan.android.neohybrid.container.NeoBaseFragment, com.meituan.android.neohybrid.core.listener.c
    public final boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7ec73a0de7e42b3041f61129a400960", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7ec73a0de7e42b3041f61129a400960")).booleanValue() : this.j && NSFJsHandler.NAME.equals(str);
    }

    @Override // com.meituan.android.neohybrid.container.NeoBaseFragment, com.meituan.android.neohybrid.core.listener.c
    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da849a354bbb6567ce0d7206c0a18a26", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da849a354bbb6567ce0d7206c0a18a26")).booleanValue();
        }
        if (d(str)) {
            return true;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2043684583:
                if (str.equals("downgrade_for_setting_error")) {
                    c = 2;
                    break;
                }
                break;
            case -800729708:
                if (str.equals("downgrade_loading_timeout")) {
                    c = 5;
                    break;
                }
                break;
            case -590084924:
                if (str.equals(NSFJsHandler.NAME)) {
                    c = 1;
                    break;
                }
                break;
            case -409164370:
                if (str.equals("downgrade_render_process_gone")) {
                    c = 7;
                    break;
                }
                break;
            case -356337914:
                if (str.equals("downgrade_illegal_chrome_version")) {
                    c = 3;
                    break;
                }
                break;
            case 378008296:
                if (str.equals(TunnelParamJSHandler.NAME)) {
                    c = 0;
                    break;
                }
                break;
            case 1078457795:
                if (str.equals("downgrade_recreate_failed")) {
                    c = 6;
                    break;
                }
                break;
            case 1751950660:
                if (str.equals("downgrade_render_offline")) {
                    c = '\b';
                    break;
                }
                break;
            case 1870656788:
                if (str.equals("downgrade_ssr_failed")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                com.meituan.android.neohybrid.core.a aVar = this.d;
                if (aVar != null) {
                    if ((aVar.c instanceof u) && !((HybridCashierGlobalConfig) com.meituan.android.neohybrid.core.horn.a.a().a(HybridCashierGlobalConfig.class)).isDisableDowngradeReLoad()) {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "375f0da242e33c37f59fd301ff38686a", RobustBitConfig.DEFAULT_VALUE)) {
                            com.meituan.android.neohybrid.neo.tunnel.a.a().a(this.d, com.meituan.android.neohybrid.neo.report.a.c("enable_data_loader", "0").b);
                            d.a(this.d, "neo_nsr_status", "0");
                            com.meituan.android.hybridcashier.report.a.b(this, "b_pay_hybrid_cashier_nsr_downgrade_mv", com.meituan.android.neohybrid.neo.report.a.c("is_nsr", "true").b("downgrade_url", this.g));
                            c(this.g);
                            break;
                        } else {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "375f0da242e33c37f59fd301ff38686a");
                            break;
                        }
                    } else {
                        d(com.meituan.android.hybridcashier.downgrade.a.a(str));
                        break;
                    }
                } else {
                    return true;
                }
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
                d(com.meituan.android.hybridcashier.downgrade.a.a(str));
                break;
        }
        return true;
    }

    private void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d82e980f81d27e2aa4e429f2bc58db67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d82e980f81d27e2aa4e429f2bc58db67");
            return;
        }
        com.meituan.android.neohybrid.neo.tunnel.a.a().a(this.d, com.meituan.android.neohybrid.neo.report.a.c("hybrid_downgrade", "1").b);
        com.meituan.android.neohybrid.neo.tunnel.a.a().a(this.d, com.meituan.android.neohybrid.neo.report.a.c("enable_data_loader", "0").b);
        c(this.g);
    }

    private boolean d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4fa3552caf620fb046ca8dd8b8a4b2e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4fa3552caf620fb046ca8dd8b8a4b2e")).booleanValue();
        }
        if (this.i) {
            return true;
        }
        DowngradeBean a2 = com.meituan.android.hybridcashier.downgrade.a.a(str, this);
        if (a2 == null) {
            return false;
        }
        HashMap<String, Object> hashMap = com.meituan.android.neohybrid.neo.report.a.c("downgrade", str).b;
        com.meituan.android.hybridcashier.report.a.a(this, "hybrid_downgrade", hashMap);
        com.meituan.android.hybridcashier.report.a.b(this, "b_pay_hybrid_downgrade_mv", hashMap);
        if ("hybrid".equals(a2.getCashierType())) {
            this.g = a2.getDegradeUrl();
            m();
        } else {
            a(11193582, new Intent().putExtra("downgrade_message", a2));
            k();
        }
        this.i = true;
        return true;
    }

    private boolean n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43019448e53d8cd684614321c77b730d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43019448e53d8cd684614321c77b730d")).booleanValue();
        }
        if (this.f == null) {
            d(com.meituan.android.hybridcashier.downgrade.a.a("downgrade_for_setting_error"));
            return true;
        }
        return false;
    }

    private void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ac231b6d5fbd02ec4097bb1c56339a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ac231b6d5fbd02ec4097bb1c56339a7");
        } else if (this.k) {
        } else {
            this.k = true;
            com.meituan.android.hybridcashier.hook.d.a().a(this.f);
        }
    }

    @Override // com.meituan.android.hybridcashier.bridge.result.c
    public final boolean a(PayResultBean payResultBean) {
        Object[] objArr = {payResultBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e56765a2bf880e129cfbd0ad3ae3efa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e56765a2bf880e129cfbd0ad3ae3efa")).booleanValue();
        }
        if (payResultBean == null || this.n) {
            return false;
        }
        this.n = true;
        if (getActivity() instanceof HybridCashierActivity) {
            a(1751757, new Intent().putExtra("pay_result", com.meituan.android.neohybrid.util.gson.b.a().toJson(payResultBean)));
            k();
            return true;
        } else if (this.b != null) {
            return this.b.a(payResultBean);
        } else {
            return false;
        }
    }

    public final String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2db3c052fb17ff5ab6d1fa0bfff58b3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2db3c052fb17ff5ab6d1fa0bfff58b3") : l().b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    enum a {
        NSR_CSR,
        NSR_SSR,
        SSR,
        CSR;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e510138056edd81bb6811463d4b694d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e510138056edd81bb6811463d4b694d");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77cf2f3f62f95db15840165963deb7c9", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77cf2f3f62f95db15840165963deb7c9") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "19458ae2627a0ee1ba62a3ae333bf9cd", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "19458ae2627a0ee1ba62a3ae333bf9cd") : (a[]) values().clone();
        }
    }
}
