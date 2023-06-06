package com.meituan.android.hybridcashier.config.horn;

import android.os.Build;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.hybridcashier.config.bean.HybridCashierConfig;
import com.meituan.android.neohybrid.Neo;
import com.meituan.android.neohybrid.util.f;
import com.meituan.android.neohybrid.util.p;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static long g;
    private static final C0259a d = new C0259a("keqing_config_entry");
    private static final com.meituan.android.neohybrid.base.model.a<String> e = Neo.debugger().a("hybrid_cashier_horn_name", "keqing_config_entry", true);
    private static final com.meituan.android.neohybrid.base.model.a<Boolean> f = Neo.debugger().a("hybrid_cashier_horn_check_disabled", (String) Boolean.FALSE, true);
    public static final com.meituan.android.neohybrid.base.model.a<String> b = Neo.debugger().a("hybrid_cashier_horn_string", b.a(), true);
    public static final com.meituan.android.neohybrid.base.model.a<String> c = Neo.debugger().a("config_debug", "0", true);

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0a91bcf16e2dcf3556db47c6c0b84f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0a91bcf16e2dcf3556db47c6c0b84f8");
            return;
        }
        g = System.currentTimeMillis();
        C0259a.a(d);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.hybridcashier.config.horn.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0259a implements HornCallback {
        public static ChangeQuickRedirect a;
        private final String b;

        public static /* synthetic */ void a(C0259a c0259a) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, c0259a, changeQuickRedirect, false, "37fc17e9b490b81caf91f0165fa96c37", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, c0259a, changeQuickRedirect, false, "37fc17e9b490b81caf91f0165fa96c37");
                return;
            }
            Object[] objArr2 = {"b_pay_dyuanyb7_sc"};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.hybridcashier.report.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f65a1675776e229b2a4d7fd00d0edfe8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f65a1675776e229b2a4d7fd00d0edfe8");
            } else {
                com.meituan.android.hybridcashier.report.a.a("b_pay_dyuanyb7_sc", (Map<String, Object>) null);
            }
            HashMap hashMap = new HashMap(8);
            hashMap.put("hybrid_user_id", com.meituan.android.hybridcashier.config.a.h());
            hashMap.put("pay_sdk_version", com.meituan.android.hybridcashier.config.a.a());
            hashMap.put("hybrid_net_type", com.meituan.android.paybase.utils.b.a());
            hashMap.put("channel", com.meituan.android.hybridcashier.config.a.c());
            hashMap.put("debug", com.meituan.android.neohybrid.init.a.h() ? "1" : "0");
            hashMap.put(DeviceInfo.DEVICE_MODEL, Build.MODEL);
            hashMap.put("device_level", String.valueOf(DeviceUtil.getDeviceLevel(com.meituan.android.neohybrid.init.a.d())));
            hashMap.put("chrome_version", p.b(com.meituan.android.neohybrid.init.a.d()));
            hashMap.put("chrome_version_core", p.a(com.meituan.android.neohybrid.init.a.d()));
            hashMap.put("package_name", com.meituan.android.hybridcashier.config.a.b().getPackageName());
            hashMap.put("project_id", "wkUYdvGSD_RF3c1d");
            hashMap.put("client_type", "mobile");
            hashMap.put("user_id", com.meituan.android.hybridcashier.config.a.h());
            hashMap.put("os", TextUtils.equals(a.c.a(), "1") ? "android_test" : "android");
            hashMap.put("os_version", com.meituan.android.hybridcashier.config.a.d());
            hashMap.put("config_debug", a.c.a());
            hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, com.meituan.android.hybridcashier.config.a.j());
            hashMap.put("device_model", Build.MODEL);
            hashMap.put("device_id", com.meituan.android.hybridcashier.config.a.g());
            Horn.register(c0259a.b, c0259a, hashMap);
            f.a("hornName: " + c0259a.b);
            f.a("hornQuery: " + hashMap.toString());
        }

        private C0259a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f03d9e8b7a4c292d47f0dd13e7a23f6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f03d9e8b7a4c292d47f0dd13e7a23f6");
            } else {
                this.b = str;
            }
        }

        @Override // com.meituan.android.common.horn.HornCallback
        public void onChanged(boolean z, String str) {
            boolean z2 = false;
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "324183f7b85ad6ef5840b7bf7a3af619", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "324183f7b85ad6ef5840b7bf7a3af619");
                return;
            }
            f.a("HybridHornCallback_result: " + str);
            if (Neo.debugger().a("debug_use_hybrid_cashier")) {
                return;
            }
            com.meituan.android.neohybrid.base.model.a aVar = a.e;
            String str2 = this.b;
            Object[] objArr2 = {aVar, str2};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.base.model.b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a1017fe133212cce2addd5c8f5d617eb", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a1017fe133212cce2addd5c8f5d617eb")).booleanValue();
            } else if (aVar == str2) {
                z2 = true;
            } else if (aVar != null && str2 != null) {
                z2 = aVar.equals(str2);
            }
            if (z2 && z && !TextUtils.isEmpty(str)) {
                synchronized (C0259a.class) {
                    a.b.a(str);
                }
            }
        }
    }

    public static /* synthetic */ void a(String str) {
        Gson a2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ca49926b0f40e1e756b1f9be07c1144", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ca49926b0f40e1e756b1f9be07c1144");
            return;
        }
        HashMap<String, Object> b2 = com.meituan.android.neohybrid.neo.report.a.c("horn", str).b("horn_time", Long.valueOf(System.currentTimeMillis() - g));
        Object[] objArr2 = {"b_pay_hybrid_horn_content_mv", b2};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.hybridcashier.report.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2e4ad9e76595b1057d80552427d9fcbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2e4ad9e76595b1057d80552427d9fcbc");
        } else {
            com.meituan.android.neohybrid.neo.report.b.a("b_pay_hybrid_horn_content_mv", "c_pay_7c9fc4b4", "hybrid_cashier", b2);
        }
        try {
            boolean booleanValue = f.a().booleanValue();
            Object[] objArr3 = {Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.neohybrid.util.gson.b.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "4368e9373c4e1e5113a6f5ca983dea12", RobustBitConfig.DEFAULT_VALUE)) {
                a2 = (Gson) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "4368e9373c4e1e5113a6f5ca983dea12");
            } else {
                a2 = booleanValue ? com.meituan.android.neohybrid.util.gson.b.a() : com.meituan.android.neohybrid.util.gson.b.b();
            }
            c.a((List) a2.fromJson(str, new TypeToken<List<HybridCashierConfig>>() { // from class: com.meituan.android.hybridcashier.config.horn.a.1
            }.getType()));
        } catch (Exception e2) {
            com.meituan.android.hybridcashier.report.a.a("b_pay_hybrid_error_parse_sc", com.meituan.android.neohybrid.neo.report.a.c("error_message", e2.getMessage()).b);
            com.meituan.android.hybridcashier.report.a.a("paybiz_hybrid_horn_parse_error", "exception:" + e2.getMessage());
            com.meituan.android.neohybrid.neo.report.b.a("b_pay_ihfvgdzu_sc", com.meituan.android.neohybrid.neo.report.a.c("horn", str).b);
        }
    }
}
