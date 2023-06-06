package com.meituan.msc.common.config;

import android.os.Build;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MSCRenderConfig extends a<Config> {
    public static ChangeQuickRedirect c;
    private static volatile MSCRenderConfig d;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class Config {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Map<String, Object> interactionMonitorBindEventBlacklist;
        public Map<String, Object> interactionMonitorBizAPIWhitelist;
        public boolean enableReportOOM = false;
        public boolean enableMSCRenderLogPrint = false;
        public boolean enableMSCRenderCommandOptimizeOnHW = true;
        public int interactionMonitorSamplingRate = 0;
        public int interactionMonitorTimeWindow = 1500;
        @SerializedName("enableMtWebViewInOV")
        public boolean enableMtWebViewInOV = false;
        public boolean enableMetricxFPS = true;
        public boolean enablePropsDiff = false;
        public boolean enableOptimizeApplyViewUpdate = false;
        public boolean shrinkGif = false;
        public boolean cascadeUseByteArrayCharset = false;
        public boolean initREngineWithFlashBuyABStrategy = false;
        public boolean enableMSCRenderCommandOptimizeOnRList = false;
        public boolean isPreCreateViews = false;
        public boolean retryRListCommand = true;
        public boolean enableJSErrorFix = true;
        public boolean isPreCreateShadows = false;
        public boolean enableTextMeasureOpt = false;
        public boolean enableVNodeErrorFix = false;
    }

    private static MSCRenderConfig u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e7a05ebdb92535136e827bf674f241d", RobustBitConfig.DEFAULT_VALUE)) {
            return (MSCRenderConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e7a05ebdb92535136e827bf674f241d");
        }
        if (d == null) {
            synchronized (MSCRenderConfig.class) {
                if (d == null) {
                    d = new MSCRenderConfig();
                }
            }
        }
        return d;
    }

    public MSCRenderConfig() {
        super("msc_render_android", Config.class);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d3e48e0506c1255e94188d74d10feb7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d3e48e0506c1255e94188d74d10feb7");
        }
    }

    @Override // com.meituan.msc.common.config.a
    public final Map<String, Object> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c76abe673aac1819563302b22f65f69e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c76abe673aac1819563302b22f65f69e");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("cityId", Long.valueOf(com.meituan.android.singleton.a.a().b()));
        hashMap.put("chromeVersion", com.meituan.msc.modules.api.web.a.a(MSCEnvHelper.getContext()));
        hashMap.put("deviceLevel", Integer.valueOf(DeviceUtil.getDeviceLevel(MSCEnvHelper.getContext()).getValue()));
        hashMap.put("deviceScore", Double.valueOf(DeviceUtil.getDeviceScore(MSCEnvHelper.getContext())));
        try {
            String str = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("manufacturer", str);
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [Config, java.lang.Object] */
    @Override // com.meituan.msc.common.config.a
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c0a64224a832ee4e0471167104258b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c0a64224a832ee4e0471167104258b3");
            return;
        }
        super.b(str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b = a(str);
    }

    public static boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "46606bb45cf39a37be96d45dd281fe17", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "46606bb45cf39a37be96d45dd281fe17")).booleanValue() : ((Config) u().b).enableMSCRenderLogPrint;
    }

    public static boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "150cb34d68c88eec21df182b70f9d5f5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "150cb34d68c88eec21df182b70f9d5f5")).booleanValue() : ((Config) u().b).enableMSCRenderCommandOptimizeOnHW;
    }

    public static int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce1bd231ece902841fb6e64c411c6979", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce1bd231ece902841fb6e64c411c6979")).intValue() : ((Config) u().b).interactionMonitorSamplingRate;
    }

    public static int g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5fb1093cbe19083a3377b2c11fead59b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5fb1093cbe19083a3377b2c11fead59b")).intValue() : ((Config) u().b).interactionMonitorTimeWindow;
    }

    public static boolean a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = c;
        List list = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a2a8b1791f3b5c483e9d9b20db3307d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a2a8b1791f3b5c483e9d9b20db3307d")).booleanValue();
        }
        Object[] objArr2 = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ae3efc54197865b92b4552b39a339202", RobustBitConfig.DEFAULT_VALUE)) {
            list = (List) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ae3efc54197865b92b4552b39a339202");
        } else {
            Map<String, Object> map = ((Config) u().b).interactionMonitorBindEventBlacklist;
            if (map != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                if (map.containsKey(str)) {
                    Object obj = map.get(str);
                    if (obj instanceof Map) {
                        Map map2 = (Map) obj;
                        if (map2.containsKey(str2)) {
                            Object obj2 = map2.get(str2);
                            if (obj2 instanceof List) {
                                list = (List) obj2;
                            } else {
                                g.b("[MSCRenderConfig@interactionEventBackList]", null, "function list format error", obj2, str, str2);
                            }
                        } else {
                            g.d("[MSCRenderConfig@interactionEventBackList]", "no page in blacklist", str2, str, str2);
                        }
                    } else {
                        g.b("[MSCRenderConfig@interactionEventBackList]", null, "page format error", obj, str, str2);
                    }
                } else {
                    g.d("[MSCRenderConfig@interactionEventBackList]", "no appId in black list", str, str2);
                }
            }
        }
        return list != null && list.contains(str3);
    }

    public static boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2beb360a6a61e9d537bf06b66f354389", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2beb360a6a61e9d537bf06b66f354389")).booleanValue();
        }
        Map<String, Object> map = ((Config) u().b).interactionMonitorBizAPIWhitelist;
        if (map == null || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!map.containsKey(str)) {
            g.d("[MSCRenderConfig@existInInteractionAPIBackList]", null, "no scope in black list", str, str2);
            return false;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return ((List) obj).contains(str2);
        }
        g.b("[MSCRenderConfig@existInInteractionAPIBackList]", null, "function list format error", obj, str, str2);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
        if ((com.meituan.robust.PatchProxy.isSupport(r1, null, r11, true, "788440a4dd7bc5b9a8883c783ad1d492", com.meituan.robust.utils.RobustBitConfig.DEFAULT_VALUE) ? ((java.lang.Boolean) com.meituan.robust.PatchProxy.accessDispatch(r1, null, r11, true, "788440a4dd7bc5b9a8883c783ad1d492")).booleanValue() : "vivo".equalsIgnoreCase(android.os.Build.BRAND)) == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean h() {
        /*
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.msc.common.config.MSCRenderConfig.c
            java.lang.String r10 = "271dbf04c212bde42547935e74215b93"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L21
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r3, r9, r2, r10)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L21:
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r1 >= r4) goto L85
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = com.meituan.msc.common.utils.l.a
            java.lang.String r12 = "fa831d95071a3e0f153b897f582b968b"
            r6 = 0
            r8 = 1
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            r5 = r1
            r7 = r4
            r9 = r12
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10)
            if (r5 == 0) goto L45
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r1, r3, r4, r2, r12)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L4e
        L45:
            java.lang.String r1 = "oppo"
            java.lang.String r4 = android.os.Build.BRAND
            boolean r1 = r1.equalsIgnoreCase(r4)
        L4e:
            if (r1 != 0) goto L7a
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r11 = com.meituan.msc.common.utils.l.a
            java.lang.String r12 = "788440a4dd7bc5b9a8883c783ad1d492"
            r5 = 0
            r7 = 1
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            r4 = r1
            r6 = r11
            r8 = r12
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9)
            if (r4 == 0) goto L6e
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r1, r3, r11, r2, r12)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L77
        L6e:
            java.lang.String r1 = "vivo"
            java.lang.String r2 = android.os.Build.BRAND
            boolean r1 = r1.equalsIgnoreCase(r2)
        L77:
            if (r1 != 0) goto L7a
            goto L85
        L7a:
            com.meituan.msc.common.config.MSCRenderConfig r0 = u()
            Config r0 = r0.b
            com.meituan.msc.common.config.MSCRenderConfig$Config r0 = (com.meituan.msc.common.config.MSCRenderConfig.Config) r0
            boolean r0 = r0.enableMtWebViewInOV
            return r0
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.common.config.MSCRenderConfig.h():boolean");
    }

    public static boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0287972000d4e818db805d22ead57ab2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0287972000d4e818db805d22ead57ab2")).booleanValue() : ((Config) u().b).enableMetricxFPS;
    }

    public static boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "482e798d335941d5f7188305fc42c676", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "482e798d335941d5f7188305fc42c676")).booleanValue() : ((Config) u().b).enablePropsDiff;
    }

    public static boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0af75107cbc2f8b0680c9f6833b5c835", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0af75107cbc2f8b0680c9f6833b5c835")).booleanValue() : ((Config) u().b).enableOptimizeApplyViewUpdate;
    }

    public static boolean l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "383d159e1c11e1932441d691a66ea2d3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "383d159e1c11e1932441d691a66ea2d3")).booleanValue() : ((Config) u().b).shrinkGif;
    }

    public static boolean m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ccb09cc81b5a5e2d08e828acdaada827", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ccb09cc81b5a5e2d08e828acdaada827")).booleanValue() : ((Config) u().b).cascadeUseByteArrayCharset;
    }

    public static boolean n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0744dc13934abea35bbf43f14d0e0193", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0744dc13934abea35bbf43f14d0e0193")).booleanValue() : ((Config) u().b).initREngineWithFlashBuyABStrategy;
    }

    public static boolean o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "405c0bb18795a5d8385b85d408e93b8c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "405c0bb18795a5d8385b85d408e93b8c")).booleanValue() : ((Config) u().b).enableMSCRenderCommandOptimizeOnRList;
    }

    public static boolean p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6814269b4c7d84919a31b2a2f06dab78", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6814269b4c7d84919a31b2a2f06dab78")).booleanValue() : ((Config) u().b).isPreCreateViews;
    }

    public static boolean q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90d896a6a2c5457dd77033396d45ae1a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90d896a6a2c5457dd77033396d45ae1a")).booleanValue() : ((Config) u().b).enableJSErrorFix;
    }

    public static boolean r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4eaef3ff89585cf23e7e126f533fecf6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4eaef3ff89585cf23e7e126f533fecf6")).booleanValue() : ((Config) u().b).isPreCreateShadows;
    }

    public static boolean s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "29412944b743ed377dcb17790467e1c3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "29412944b743ed377dcb17790467e1c3")).booleanValue() : ((Config) u().b).enableTextMeasureOpt;
    }

    public static boolean t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "72f29c2d13d1ecd482fe47fd416b8edc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "72f29c2d13d1ecd482fe47fd416b8edc")).booleanValue() : ((Config) u().b).enableVNodeErrorFix;
    }
}
