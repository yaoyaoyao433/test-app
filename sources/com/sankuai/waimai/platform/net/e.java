package com.sankuai.waimai.platform.net;

import android.text.TextUtils;
import com.meituan.android.common.fingerprint.FingerprintManager;
import com.meituan.android.common.mtguard.MTGConfigs;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.mmp.lib.engine.LaunchMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.h;
import com.sankuai.waimai.platform.utils.l;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static final List<String> b = Arrays.asList("wm_custom_latitude", "wm_custom_longitude");
    private static com.meituan.android.singleton.e<Map<String, String>> c;

    public static Map<String, String> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dbe77b0bdddf6466d23f38fdafff7918", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dbe77b0bdddf6466d23f38fdafff7918");
        }
        Map<String, String> b2 = b(str);
        String str2 = b2.get("userid");
        if (TextUtils.isEmpty(str2) || "0".equals(str2)) {
            b2.remove("userid");
        }
        if (TextUtils.isEmpty(b2.get("wm_logintoken"))) {
            b2.remove("wm_logintoken");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(com.sankuai.waimai.platform.b.A().k);
        b2.put("wm_build_version", sb.toString());
        return b2;
    }

    public static List<String> a() {
        return b;
    }

    public static Map<String, String> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42862e2f2c7ec8bff139366c2c0baf4e", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42862e2f2c7ec8bff139366c2c0baf4e") : a(null, "");
    }

    public static Map<String, String> b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a0e6fe1e65755b7e226c073fa457b80d", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a0e6fe1e65755b7e226c073fa457b80d") : a(null, str);
    }

    private static Map<String, String> a(HashMap<String, String> hashMap, String str) {
        Object[] objArr = {null, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f946b1bade30b9af4f21373058efa042", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f946b1bade30b9af4f21373058efa042") : a(null, true, true, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map<java.lang.String, java.lang.String> a(java.util.HashMap<java.lang.String, java.lang.String> r21, boolean r22, boolean r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 945
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.net.e.a(java.util.HashMap, boolean, boolean, java.lang.String):java.util.Map");
    }

    private static String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c9a48dcfd5f2c5571812f22074a44cf1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c9a48dcfd5f2c5571812f22074a44cf1");
        }
        try {
            return String.valueOf(Statistics.getChannel().getSeq());
        } catch (Exception unused) {
            return "";
        }
    }

    public static void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e57ce2af934d6781696e7d23cec31e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e57ce2af934d6781696e7d23cec31e3");
            return;
        }
        c = new com.meituan.android.singleton.e<Map<String, String>>() { // from class: com.sankuai.waimai.platform.net.e.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.singleton.e
            public final /* synthetic */ Map<String, String> a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cecc429b8a915f8b15574224269427d7", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cecc429b8a915f8b15574224269427d7") : e.f(LaunchMode.LAUNCH_MODE_REUSE);
            }
        };
        l.a(new l.a() { // from class: com.sankuai.waimai.platform.net.e.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.utils.l.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "855f38ceba3256934d9189e0f802d00e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "855f38ceba3256934d9189e0f802d00e");
                    return;
                }
                com.meituan.android.singleton.e eVar = e.c;
                if (eVar != null) {
                    eVar.b();
                }
            }
        }, (String) null);
    }

    public static Map<String, String> c(String str) {
        com.meituan.android.singleton.e<Map<String, String>> eVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "01e8c102e00e440776af944fa0e1dca9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "01e8c102e00e440776af944fa0e1dca9");
        }
        if (b.a(str) && (eVar = c) != null) {
            return eVar.b();
        }
        return f(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "961dac507844292724825caa226f1c83", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "961dac507844292724825caa226f1c83");
        }
        HashMap hashMap = new HashMap();
        MetricsSpeedMeterTask createCustomSpeedMeterTask = MetricsSpeedMeterTask.createCustomSpeedMeterTask("takeout/net/common/fingerprint");
        if (com.sankuai.waimai.platform.b.A().l) {
            hashMap.put(FingerprintManager.TAG, com.sankuai.waimai.platform.b.A().F());
            createCustomSpeedMeterTask.recordStep(MTGConfigs.b);
        } else {
            hashMap.put(FingerprintManager.TAG, com.sankuai.waimai.platform.b.A().E());
            createCustomSpeedMeterTask.recordStep("fingerprint_manager");
        }
        h.a(createCustomSpeedMeterTask.recordStep(str));
        return hashMap;
    }

    public static Map<String, String> d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "89e4fc22873f122ed03ca1faa6eca2ba", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "89e4fc22873f122ed03ca1faa6eca2ba");
        }
        HashMap hashMap = new HashMap();
        long b2 = com.meituan.android.time.c.b();
        int p = com.sankuai.waimai.platform.b.A().p();
        StringBuilder sb = new StringBuilder();
        sb.append(b2);
        hashMap.put("req_time", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(p);
        hashMap.put("wm_seq", sb2.toString());
        hashMap.put("waimai_sign", com.sankuai.waimai.foundation.utils.security.a.a(str, "", b2, p));
        return hashMap;
    }
}
