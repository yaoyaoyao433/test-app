package com.meituan.android.paycommon.lib.fragment;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.hybridcashier.bridge.result.PayResultBean;
import com.meituan.android.hybridcashier.bridge.result.c;
import com.meituan.android.neohybrid.a;
import com.meituan.android.neohybrid.container.NeoBaseFragment;
import com.meituan.android.neohybrid.core.config.DowngradeConfig;
import com.meituan.android.neohybrid.core.config.LoadingConfig;
import com.meituan.android.neohybrid.core.config.NSFConfig;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.core.config.UIConfig;
import com.meituan.android.neohybrid.neo.bridge.NeoBridge;
import com.meituan.android.paybase.downgrading.d;
import com.meituan.android.paybase.utils.ae;
import com.meituan.android.paybase.utils.i;
import com.meituan.android.paybase.utils.n;
import com.meituan.android.paybase.utils.q;
import com.meituan.android.paycommon.lib.utils.m;
import com.meituan.android.paycommon.lib.utils.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.platform.utils.f;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HalfPageFragment extends NeoBaseFragment implements c {
    private static long a;
    public static ChangeQuickRedirect b;
    private static final Type g = new TypeToken<HashMap<String, Object>>() { // from class: com.meituan.android.paycommon.lib.fragment.HalfPageFragment.1
    }.getType();
    private String f;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface b {
        void a(int i, String str);

        void a(@Nullable String str);
    }

    public Map<String, Object> f() {
        return null;
    }

    @Override // com.meituan.android.neohybrid.container.NeoBaseFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        String queryParameter;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa42f164f8eff56c5345a2909a70b4c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa42f164f8eff56c5345a2909a70b4c2");
            return;
        }
        super.onCreate(bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a40b28ff1b673b20a40472b440d6e5ed", RobustBitConfig.DEFAULT_VALUE)) {
            queryParameter = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a40b28ff1b673b20a40472b440d6e5ed");
        } else {
            Intent j = j();
            if (j == null) {
                queryParameter = "";
            } else {
                Uri data = j.getData();
                if (data == null) {
                    queryParameter = "";
                } else {
                    String queryParameter2 = data.getQueryParameter("arg_target_scene");
                    if (TextUtils.isEmpty(queryParameter2) && getArguments() != null) {
                        queryParameter2 = getArguments().getString("arg_target_scene");
                    }
                    queryParameter = TextUtils.isEmpty(queryParameter2) ? data.getQueryParameter(NeoConfig.NEO_SCENE) : queryParameter2;
                }
            }
        }
        this.f = queryParameter;
        NeoBridge.registerNeoBridgeCustomize(this.d, "pay_notifyHybridProcessResult");
    }

    @Override // com.meituan.android.neohybrid.container.NeoBaseFragment, com.meituan.android.neohybrid.core.listener.c
    public boolean a(NeoConfig neoConfig) {
        Object[] objArr = {neoConfig};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2cae68a59224f1b3d356d21fe03cd3b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2cae68a59224f1b3d356d21fe03cd3b")).booleanValue();
        }
        b(neoConfig);
        neoConfig.setNeoBridge(true);
        return super.a(neoConfig);
    }

    public void b(NeoConfig neoConfig) {
        Object[] objArr = {neoConfig};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93680750917f06e4826d9eb7aa254849", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93680750917f06e4826d9eb7aa254849");
            return;
        }
        try {
            Uri data = j().getData();
            if (neoConfig == null || data == null) {
                return;
            }
            String queryParameter = data.getQueryParameter("request_data");
            if (TextUtils.isEmpty(queryParameter)) {
                return;
            }
            neoConfig.nsfConfig().setNsfParams((HashMap) n.a().fromJson(queryParameter, g));
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "HalfPageFragment_onCreateNeoConfig", (Map<String, Object>) null);
        }
    }

    @Override // com.meituan.android.neohybrid.container.NeoBaseFragment, com.meituan.android.neohybrid.core.listener.c
    public void y_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bbca8e2a8af68a200d6eab11efb8b96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bbca8e2a8af68a200d6eab11efb8b96");
            return;
        }
        super.y_();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ffe81821b005973a7cbfdd95bfb6ba6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ffe81821b005973a7cbfdd95bfb6ba6c");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(NeoConfig.NEO_SCENE, this.f);
            hashMap.put("duration", Long.valueOf(System.currentTimeMillis() - a));
            hashMap.put("url", n());
            if (!i.a(f())) {
                hashMap.putAll(f());
            }
            a("b_pay_half_page_success_sc", (HashMap<String, Object>) hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put(NeoConfig.NEO_SCENE, this.f);
            a("pay_half_page_success", (Map<String, Object>) hashMap2);
        }
        LocalBroadcastManager.getInstance(getContext()).sendBroadcast(new Intent("com.meituan.android.paycommon.lib.fragment.HalfPageFragment_" + this.f));
    }

    @Override // com.meituan.android.neohybrid.container.NeoBaseFragment, com.meituan.android.neohybrid.core.listener.c
    public boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b523c1bfe5c1656c145e0e44bec36bd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b523c1bfe5c1656c145e0e44bec36bd")).booleanValue();
        }
        d(str);
        return super.a(str);
    }

    public final void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c9c0a9d0397a21bdafa922190f66d09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c9c0a9d0397a21bdafa922190f66d09");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                a(jSONObject.optInt("errorCode"), jSONObject.optString("errorMessage"));
            } catch (JSONException unused) {
                com.meituan.android.paybase.common.analyse.cat.a.a("HalfPageFragment", "finishDowngrade");
                a(-2, str);
            }
        }
    }

    private void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "609fccc8d46b7caa3a5e30389493cece", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "609fccc8d46b7caa3a5e30389493cece");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(NeoConfig.NEO_SCENE, this.f);
        hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, Integer.valueOf(i));
        hashMap.put("url", n());
        hashMap.put("error_message", str);
        if (!i.a(f())) {
            hashMap.putAll(f());
        }
        a("b_pay_half_page_fail_sc", (HashMap<String, Object>) hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(NeoConfig.NEO_SCENE, this.f);
        hashMap2.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, Integer.valueOf(i));
        a("pay_half_page_fail", (Map<String, Object>) hashMap2);
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b34689007af4e6dc0fab4e2099169cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b34689007af4e6dc0fab4e2099169cc");
            return;
        }
        a = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put(NeoConfig.NEO_SCENE, str);
        hashMap.put("url", str2);
        a("b_pay_half_page_start_sc", (HashMap<String, Object>) hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(NeoConfig.NEO_SCENE, str);
        a("pay_half_page_start", (Map<String, Object>) hashMap2);
    }

    private String n() {
        Uri data;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1e6835435556329147f1f5053121c3d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1e6835435556329147f1f5053121c3d");
        }
        Intent j = j();
        return (j == null || (data = j.getData()) == null) ? "" : data.getQueryParameter("url");
    }

    private static void a(String str, HashMap<String, Object> hashMap) {
        Object[] objArr = {str, hashMap};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec2c8d3636be9ac045f2ee9abe91cb99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec2c8d3636be9ac045f2ee9abe91cb99");
        } else {
            ae.a(null, str, hashMap, "c_pay_dmfidr05", "com.meituan.android.paybase.utils.StatisticsUtils", true);
        }
    }

    private static void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "928769032fed986edcfd515df1d0ee02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "928769032fed986edcfd515df1d0ee02");
        } else {
            com.meituan.android.paybase.common.analyse.cat.a.a(str, map, null, "");
        }
    }

    public static String a(m.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f60d96ce3498c2aeeaaeaa71a5477832", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f60d96ce3498c2aeeaaeaa71a5477832");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tradeno", aVar.getTradeNo());
            jSONObject.put("extra_statics", aVar.getExtraStatics());
            jSONObject.put("extra_data", aVar.getExtraData());
            jSONObject.put("merchant_no", aVar.getMerchantNo());
            HashMap<String, String> extendTransmissionParams = aVar.getExtendTransmissionParams();
            if (!i.a(extendTransmissionParams)) {
                for (Map.Entry<String, String> entry : extendTransmissionParams.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "HalfPageFragment_getTunnelExtraData", (Map<String, Object>) null);
        }
        return jSONObject.toString();
    }

    public static void a(int i, Intent intent, b bVar) {
        Object[] objArr = {Integer.valueOf(i), intent, bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "916d7263f1b8f3f5eaa1491963300de8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "916d7263f1b8f3f5eaa1491963300de8");
            return;
        }
        String str = "";
        if (intent != null) {
            str = f.a(intent, "resultData");
            if (TextUtils.isEmpty(str)) {
                Object a2 = q.a(f.a(intent, "resultData_uniqueKey"));
                if (a2 instanceof String) {
                    str = a2.toString();
                }
            }
        }
        if (TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put(KnbConstants.PARAMS_SCENE, "HalfPageFragment_onActivityResult");
            ae.a("cashier_halfpage_fragment_onactivityresult", (Map<String, Object>) null, (List<Float>) null);
            a("b_pay_5l3pq2aw_sc", (HashMap<String, Object>) hashMap);
        }
        if (i == 703710) {
            String a3 = intent != null ? f.a(intent, "downgrade_message") : "";
            HashMap hashMap2 = new HashMap();
            hashMap2.put("downGradeMessage", a3);
            hashMap2.put(KnbConstants.PARAMS_SCENE, "fail");
            o.a("b_pay_half_page_dialog_result_sc", hashMap2);
            try {
                JSONObject jSONObject = new JSONObject(a3);
                bVar.a(jSONObject.optInt("errorCode"), jSONObject.optString("errorMessage"));
                return;
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "HalfPageFragment_onActivityResult", (Map<String, Object>) null);
                bVar.a(-2, a3);
                return;
            }
        }
        HashMap hashMap3 = new HashMap();
        hashMap3.put(KnbConstants.PARAMS_SCENE, "success");
        hashMap3.put("result", str);
        o.a("b_pay_half_page_dialog_result_sc", hashMap3);
        bVar.a(str);
    }

    public static long m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3c2f41995fe1c42a39edc7484d85c9ce", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3c2f41995fe1c42a39edc7484d85c9ce")).longValue();
        }
        com.meituan.android.paybase.downgrading.c cVar = d.a().b;
        if (cVar != null) {
            return (long) (cVar.b * 1000.0d);
        }
        return 6000L;
    }

    private static Intent a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j) {
        long j2 = j;
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7, str8, new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "33e07c9223cb2f8b63ce31bf2f9ffd3c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "33e07c9223cb2f8b63ce31bf2f9ffd3c");
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        com.meituan.android.neohybrid.a.a(intent, "half_page_render_data", b("initialData", str3));
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str4)) {
                try {
                    jSONObject = new JSONObject(str4);
                } catch (Exception e) {
                    com.meituan.android.paybase.common.analyse.a.a(e, "HalfPageFragment_createIntent", (Map<String, Object>) null);
                    jSONObject = new JSONObject();
                }
            }
            Object[] objArr2 = new Object[2];
            if (j2 == 0) {
                j2 = System.currentTimeMillis();
            }
            objArr2[0] = Long.valueOf(j2);
            objArr2[1] = Long.valueOf(System.currentTimeMillis());
            jSONObject.put("stat_time", String.format("%d,%d,0", objArr2));
            jSONObject.put("member_id", com.meituan.android.paybase.set.a.a());
            jSONObject.put("zone_user_id", com.meituan.android.paybase.config.a.d().s().a());
            a(intent, jSONObject);
        } catch (Exception e2) {
            com.meituan.android.paybase.common.analyse.a.a(e2, "HalfPageFragment_createIntent", (Map<String, Object>) null);
        }
        Uri.Builder buildUpon = Uri.parse("meituanpayment://hybrid_cashier/launch").buildUpon();
        buildUpon.appendQueryParameter(NeoConfig.NEO_SCENE, str);
        buildUpon.appendQueryParameter(LoadingConfig.LOADING_ENABLED, "1");
        buildUpon.appendQueryParameter(DowngradeConfig.LOADING_CANCEL_DOWNGRADE, "1");
        buildUpon.appendQueryParameter(DowngradeConfig.LOADING_TIMEOUT_DOWNGRADE, "1");
        if (TextUtils.isEmpty(str5)) {
            buildUpon.appendQueryParameter(UIConfig.BACKGROUND_COLOR, "#99000000");
        } else {
            buildUpon.appendQueryParameter(UIConfig.BACKGROUND_COLOR, str5);
        }
        buildUpon.appendQueryParameter(UIConfig.MODAL, "1");
        buildUpon.appendQueryParameter("url", str2);
        buildUpon.appendQueryParameter("arg_target_scene", str);
        long parseLong = NumberUtils.parseLong(str6, m());
        if (parseLong <= 0) {
            parseLong = m();
        }
        buildUpon.appendQueryParameter(LoadingConfig.LOADING_DURATION, String.valueOf(parseLong));
        buildUpon.appendQueryParameter(NSFConfig.NEO_NSF, str7);
        buildUpon.appendQueryParameter("request_data", str8);
        intent.setData(buildUpon.build());
        intent.setPackage(com.meituan.android.paybase.config.a.d().a().getPackageName());
        return intent;
    }

    private static String b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f98217896774f5ba428372cd659e3804", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f98217896774f5ba428372cd659e3804");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, str2);
        } catch (Exception unused) {
            com.meituan.android.paybase.common.analyse.cat.a.a("HalfPageFragment", "createH5JsonParams");
        }
        return jSONObject.toString();
    }

    private static void a(Intent intent, JSONObject jSONObject) {
        a.EnumC0301a enumC0301a;
        Object[] objArr = {intent, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d1b0ff1240075fbdbce907c16719dc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d1b0ff1240075fbdbce907c16719dc5");
            return;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt instanceof JSONObject) {
                enumC0301a = a.EnumC0301a.JSON;
            } else {
                enumC0301a = a.EnumC0301a.STRING;
            }
            com.meituan.android.neohybrid.a.a(intent, next, opt, enumC0301a);
        }
    }

    @Override // com.meituan.android.hybridcashier.bridge.result.c
    public final boolean a(PayResultBean payResultBean) {
        Object[] objArr = {payResultBean};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c63c73eabbf1c15194c351e8ca1e89fc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c63c73eabbf1c15194c351e8ca1e89fc")).booleanValue();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("targetScene", this.f);
        hashMap.put(KnbConstants.PARAMS_SCENE, "HalfPageFragment_onHandlePayResult");
        if (payResultBean == null || TextUtils.isEmpty(payResultBean.getAction())) {
            ae.a("cashier_halfpage_fragment_error", hashMap, (List<Float>) null);
            a("b_pay_5l3pq2aw_sc", (HashMap<String, Object>) hashMap);
        }
        Intent intent = new Intent();
        try {
            intent.putExtra("resultData_uniqueKey", q.a((Object) n.a().toJson(payResultBean)));
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "HalfPageFragment_onHandlePayResult", (Map<String, Object>) null);
            ae.a("cashier_halfpage_fragment_parse_error", hashMap, (List<Float>) null);
        }
        a(-1, intent);
        k();
        return true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        String b;
        String c;
        String d;
        int e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        long k;

        public a(String str, String str2, String str3, int i) {
            Object[] objArr = {str, str2, str3, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3aa1700815f290c7b2c1b4270d5e5fdd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3aa1700815f290c7b2c1b4270d5e5fdd");
                return;
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = i;
        }
    }

    public static void a(Fragment fragment, a aVar) {
        Object[] objArr = {fragment, aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "08a6fe594308c1650b57f75ed8a4b0ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "08a6fe594308c1650b57f75ed8a4b0ad");
            return;
        }
        a(aVar.b, aVar.c);
        com.meituan.android.neohybrid.container.a.a(aVar.b, HalfPageFragment.class);
        Intent a2 = a(aVar.b, aVar.c, aVar.d, aVar.j, aVar.f, aVar.g, aVar.h, aVar.i, aVar.k);
        if (fragment != null) {
            fragment.startActivityForResult(a2, aVar.e);
        }
    }

    public static void a(Activity activity, a aVar) {
        Object[] objArr = {activity, aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed999d11d716d7332bd7fe255622111f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed999d11d716d7332bd7fe255622111f");
            return;
        }
        a(aVar.b, aVar.c);
        com.meituan.android.neohybrid.container.a.a(aVar.b, HalfPageFragment.class);
        Intent a2 = a(aVar.b, aVar.c, aVar.d, aVar.j, aVar.f, aVar.g, aVar.h, aVar.i, aVar.k);
        if (activity != null) {
            activity.startActivityForResult(a2, aVar.e);
        }
    }
}
