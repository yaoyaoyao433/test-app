package com.meituan.android.pay.fragment;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import com.google.gson.JsonObject;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.neohybrid.container.NeoBaseFragment;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.android.neohybrid.core.config.LoadingConfig;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.neo.bridge.NeoBridge;
import com.meituan.android.pay.activity.PayActivity;
import com.meituan.android.pay.bridge.GetBiometricParamsBridge;
import com.meituan.android.pay.common.payment.bean.HybridInfo;
import com.meituan.android.pay.jshandler.HybridSignPayJSHandler;
import com.meituan.android.pay.jshandler.mediator.a;
import com.meituan.android.pay.model.bean.HybridSignPayHornConfig;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.ak;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SignPayNeoFragment extends NeoBaseFragment {
    public static ChangeQuickRedirect a;

    public static SignPayNeoFragment a(@NonNull FragmentActivity fragmentActivity, int i, String str, Bundle bundle) {
        SignPayNeoFragment signPayNeoFragment;
        Object[] objArr = {fragmentActivity, Integer.valueOf((int) R.id.content), str, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9de6be0ab057951bd0c68561490deccd", RobustBitConfig.DEFAULT_VALUE)) {
            return (SignPayNeoFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9de6be0ab057951bd0c68561490deccd");
        }
        GetBiometricParamsBridge.b();
        FragmentTransaction beginTransaction = fragmentActivity.getSupportFragmentManager().beginTransaction();
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4c26b042d51b906e21832f392ac96071", RobustBitConfig.DEFAULT_VALUE)) {
            signPayNeoFragment = (SignPayNeoFragment) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4c26b042d51b906e21832f392ac96071");
        } else {
            SignPayNeoFragment signPayNeoFragment2 = new SignPayNeoFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putString(NeoConfig.NEO_SCENE, "sign_pay");
            bundle2.putString("url", str);
            bundle2.putString("enable_nsf", Boolean.TRUE.toString());
            bundle2.putString(LoadingConfig.LOADING_ENABLED, "1");
            signPayNeoFragment2.setArguments(bundle2);
            signPayNeoFragment = signPayNeoFragment2;
        }
        signPayNeoFragment.c(bundle);
        beginTransaction.add(R.id.content, signPayNeoFragment);
        beginTransaction.addToBackStack(null);
        beginTransaction.commitAllowingStateLoss();
        return signPayNeoFragment;
    }

    @Override // com.meituan.android.neohybrid.container.NeoBaseFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "690f457f2b50814b30cb9c0f71b5a8ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "690f457f2b50814b30cb9c0f71b5a8ac");
            return;
        }
        super.onCreate(bundle);
        NeoBridge.registerNeoBridgeCustomize(this.d, "signPay_signPayResult", "pay_getBiometricsInfo", "signPay_modal", "signPay_closePage");
    }

    @Override // com.meituan.android.neohybrid.container.NeoBaseFragment, com.meituan.android.neohybrid.core.listener.c
    public final boolean a(NeoConfig neoConfig) {
        Object[] objArr = {neoConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12ac3af4d5abd2d245f1017a29b0b698", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12ac3af4d5abd2d245f1017a29b0b698")).booleanValue();
        }
        super.a(neoConfig);
        if (this.e == null) {
            String url = neoConfig.getUrl();
            Object[] objArr2 = {url};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7d64cd904b5b48ad25fc6f3bbf14cc82", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7d64cd904b5b48ad25fc6f3bbf14cc82");
            } else {
                HashMap hashMap = new HashMap();
                JsonObject jsonObject = new JsonObject();
                for (Map.Entry<String, String> entry : com.meituan.android.pay.common.payment.utils.b.c(getActivity()).entrySet()) {
                    jsonObject.addProperty(entry.getKey(), entry.getValue());
                }
                jsonObject.addProperty("has_touchid", com.meituan.android.paybase.fingerprint.util.c.c());
                jsonObject.addProperty("nb_channel", com.meituan.android.paybase.config.a.d().c());
                jsonObject.addProperty("nb_deviceid", com.meituan.android.paybase.config.a.d().j());
                hashMap.put("pay_params", jsonObject);
                hashMap.put(HybridSignPayJSHandler.ARG_SIGN_PAY_SOURCE, Integer.valueOf(com.meituan.android.pay.utils.d.a()));
                hashMap.put(HybridSignPayJSHandler.ARG_TRADE_NO, com.meituan.android.paybase.common.analyse.a.b);
                hashMap.put("nb_ci", com.meituan.android.hybridcashier.config.a.f());
                hashMap.put("nb_location", com.meituan.android.hybridcashier.config.a.e());
                hashMap.put("nb_adid", "");
                hashMap.put("member_id", com.meituan.android.paybase.set.a.a());
                hashMap.put("zone_user_id", com.meituan.android.paybase.config.a.d().s().a());
                try {
                    JsonObject jsonObject2 = new JsonObject();
                    HybridSignPayHornConfig hybridSignPayHornConfig = (HybridSignPayHornConfig) com.meituan.android.neohybrid.core.horn.a.a().a(HybridSignPayHornConfig.class);
                    jsonObject2.addProperty("enable_nsf", Boolean.valueOf(d(url)));
                    jsonObject2.addProperty("enable_close_page", Boolean.valueOf(hybridSignPayHornConfig.isEnableClosePage()));
                    jsonObject2.addProperty("enable_modal", Boolean.valueOf(hybridSignPayHornConfig.isEnableModal()));
                    hashMap.put(NeoConfig.NEO_CONFIG, jsonObject2);
                } catch (Exception e) {
                    com.meituan.android.neohybrid.util.f.a(e.toString());
                }
                com.meituan.android.neohybrid.neo.tunnel.a.a().a(this.d, hashMap);
                com.meituan.android.neohybrid.neo.tunnel.a.a().a(this.d, com.meituan.android.neohybrid.neo.report.a.c("enable_data_loader", "1").b);
            }
        }
        neoConfig.setNeoBridge(true);
        neoConfig.setNeoRequestBridge(true);
        neoConfig.uiConfig().setModal(true);
        neoConfig.setNeoStorageBridge(((HybridSignPayHornConfig) com.meituan.android.neohybrid.core.horn.a.a().a(HybridSignPayHornConfig.class)).isEnableNeoStorageBridge());
        if (d(neoConfig.getUrl())) {
            b(neoConfig);
        }
        return false;
    }

    private boolean d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87949e0234a75a88cc31a6a416bd2b63", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87949e0234a75a88cc31a6a416bd2b63")).booleanValue();
        }
        Bundle arguments = getArguments();
        return arguments != null && str.contains("sign-bindcard-version") && !str.endsWith("half-speed-bind") && ((HybridSignPayHornConfig) com.meituan.android.neohybrid.core.horn.a.a().a(HybridSignPayHornConfig.class)).isEnableNSF() && Boolean.TRUE.toString().equals(arguments.getString("enable_nsf", Boolean.FALSE.toString()));
    }

    @Override // com.meituan.android.neohybrid.container.NeoBaseFragment, com.meituan.android.neohybrid.core.listener.c
    public final void a(@Nullable View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f95dfa219d2edfec45cf75c2bbde8fd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f95dfa219d2edfec45cf75c2bbde8fd5");
        } else if (!(getActivity() instanceof PayActivity) || view == null) {
        } else {
            view.setVisibility(4);
        }
    }

    @Override // com.meituan.android.neohybrid.container.NeoBaseFragment, com.meituan.android.neohybrid.core.listener.c
    public final void y_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "504e4f861db730096af0d8cc0f993741", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "504e4f861db730096af0d8cc0f993741");
            return;
        }
        super.y_();
        if (getActivity() instanceof PayActivity) {
            ((PayActivity) getActivity()).hideProgress();
            a.InterfaceC0326a a2 = com.meituan.android.pay.jshandler.mediator.a.a().a(getActivity());
            if (a2 != null) {
                a2.b();
            } else {
                com.meituan.android.neohybrid.neo.report.b.a("SignPayNeoFragment_signPayResult", "signStateChange_is_null");
            }
            com.meituan.android.paybase.metrics.a.c("tti_contract_pay_hybrid_view", "h5_render_finish");
            com.meituan.android.paybase.metrics.a.b("tti_contract_pay_hybrid_view");
            com.meituan.android.pay.utils.n.a(getActivity(), false, KernelConfig.CONTAINER_TYPE_NEO);
        }
    }

    @Override // com.meituan.android.neohybrid.container.NeoBaseFragment, com.meituan.android.neohybrid.core.listener.c
    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf4a9836126e3f38168b2fc948375536", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf4a9836126e3f38168b2fc948375536")).booleanValue();
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3531c49d13364299ff1f6853273311e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3531c49d13364299ff1f6853273311e6");
        } else {
            FragmentActivity activity = getActivity();
            com.meituan.android.pay.utils.o.b(ak.a(activity));
            String str2 = com.meituan.android.pay.common.analyse.a.b;
            com.meituan.android.pay.utils.d.a(1180120, str2, (HybridInfo) null);
            com.meituan.android.pay.common.analyse.b.b("c_pay_emhyaxrm", "b_pay_kv4ualxg_mc", "", new a.c().a("type", 1180203).a("reason", str).a("launchUrl", "/qbdsign/sign").a("isHelloPay", Boolean.TRUE).a("mtpay_scene", str2).a("downgradeType", "/qbdsign/sign").b, ak.a(activity));
            com.meituan.android.paybase.metrics.a.c("tti_contract_pay_hybrid_view", "request_contractinfo");
            com.meituan.android.pay.utils.d.a("paybiz_hybrid_degrade_start", 1180203);
            com.meituan.android.pay.utils.d.a(1180203);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "98ac9639e33995dd463826ea6a625f72", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "98ac9639e33995dd463826ea6a625f72");
            } else {
                FragmentActivity activity2 = getActivity();
                if (activity2 != null && activity2.getSupportFragmentManager() != null) {
                    Fragment findFragmentById = activity2.getSupportFragmentManager().findFragmentById(R.id.content);
                    if ((findFragmentById instanceof MeituanPayTitansFragment) || (findFragmentById instanceof SignPayNeoFragment)) {
                        com.meituan.android.paycommon.lib.utils.h.b(activity2, findFragmentById);
                    }
                }
            }
            com.meituan.android.pay.process.g.b(activity);
        }
        return true;
    }

    private void b(NeoConfig neoConfig) {
        JSONObject jSONObject;
        Object[] objArr = {neoConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b984b1624ec1411b91728dd896384d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b984b1624ec1411b91728dd896384d7");
            return;
        }
        Map<String, Object> a2 = com.meituan.android.neohybrid.neo.tunnel.a.a().a(this.d);
        try {
            Object obj = a2.get("pay_params");
            obj.getClass();
            jSONObject = new JSONObject(obj.toString());
        } catch (Exception e) {
            e.printStackTrace();
            jSONObject = null;
        }
        if (a2 == null || jSONObject == null) {
            return;
        }
        neoConfig.nsfConfig().setNsf("/cardsign/signdispatcher");
        HashMap hashMap = new HashMap();
        hashMap.put("neo_nsf", "true");
        hashMap.put("bind_card_serial_no", "");
        hashMap.put("product_name", "standard_sign_pay");
        hashMap.put("card_sign_flag", "");
        hashMap.put("entry", "cashier_change_paytype");
        hashMap.put("nb_uuid", com.meituan.android.paybase.config.a.d().j());
        hashMap.put("nb_source", jSONObject.optString("nb_source"));
        hashMap.put("nb_version", com.meituan.android.paybase.config.a.d().q());
        hashMap.put("nb_app", com.meituan.android.hybridcashier.config.a.i());
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.hybridcashier.config.a.a;
        hashMap.put("nb_platform", PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "34f92a8a372f59fa3173e283d1ae4dee", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "34f92a8a372f59fa3173e283d1ae4dee") : com.meituan.android.neohybrid.init.a.c().d());
        hashMap.put("nb_ci", com.meituan.android.hybridcashier.config.a.f());
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.hybridcashier.config.a.a;
        hashMap.put("nb_location", PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "caea1ea83fa261fb7d425b9a04fd5de9", RobustBitConfig.DEFAULT_VALUE) ? (MtLocation) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "caea1ea83fa261fb7d425b9a04fd5de9") : com.meituan.android.neohybrid.init.a.c().f());
        hashMap.put("nb_fingerprint", com.meituan.android.neohybrid.cache.a.b());
        hashMap.put("nb_device_model", Build.MODEL);
        hashMap.put("nb_os_version", com.meituan.android.hybridcashier.config.a.d());
        hashMap.put("nb_appversion", com.meituan.android.hybridcashier.config.a.j());
        hashMap.put("nb_deviceid", com.meituan.android.hybridcashier.config.a.g());
        hashMap.put("nb_adid", a2.containsKey("nb_adid") ? a2.get("nb_adid") : "");
        hashMap.put("sdk_platform", "android");
        hashMap.put("user_type", "1");
        hashMap.put("sign_pay_container", "hybrid");
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.optString(next));
        }
        hashMap.put("enable_neo_sign_pay", "true");
        neoConfig.nsfConfig().setNsfParams(hashMap);
        neoConfig.nsfConfig().setNsfSaved(true);
    }

    @Override // com.meituan.android.neohybrid.container.NeoBaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3ab53982af7a0859b9f17be23b1e13e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3ab53982af7a0859b9f17be23b1e13e");
            return;
        }
        this.d.g = !com.meituan.android.neohybrid.c.a(getActivity());
        super.onResume();
    }
}
