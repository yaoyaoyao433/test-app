package com.meituan.android.neohybrid.init;

import android.content.Context;
import android.os.Build;
import com.dianping.titans.js.JsHandlerFactory;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.neohybrid.Neo;
import com.meituan.android.neohybrid.c;
import com.meituan.android.neohybrid.core.hook.WebViewCreateHooker;
import com.meituan.android.neohybrid.core.horn.a;
import com.meituan.android.neohybrid.core.horn.bean.NeoHornConfig;
import com.meituan.android.neohybrid.neo.notification.NeoHybridJSHandler;
import com.meituan.android.neohybrid.neo.nsf.NSFJsHandler;
import com.meituan.android.neohybrid.neo.report.e;
import com.meituan.android.neohybrid.neo.shark.SharkRequestJSHandler;
import com.meituan.android.neohybrid.neo.tunnel.TunnelParamJSHandler;
import com.meituan.android.paybase.config.b;
import com.meituan.android.paybase.utils.af;
import com.meituan.android.paybase.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static volatile Boolean b;
    private static String c;

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe7e01210df9db7481ca729078394f52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe7e01210df9db7481ca729078394f52");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5c963af9986ec34ebf84c2f515fc237d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5c963af9986ec34ebf84c2f515fc237d");
        } else {
            HashMap hashMap = new HashMap(16);
            hashMap.put("app_name", c().k());
            hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, c().l());
            hashMap.put("app_channel", c().c());
            hashMap.put("device_platform", c().d());
            hashMap.put("device_id", c().h());
            hashMap.put("device_system_version", c().e());
            hashMap.put("device_manufacturer", Build.MANUFACTURER);
            hashMap.put("device_model", Build.MODEL);
            hashMap.put("neo_sdk_version", "0.1.33.1");
            d();
            hashMap.put("device_imsi", "");
            hashMap.put("is_debug", h() ? "1" : "0");
            com.meituan.android.neohybrid.neo.tunnel.a.a().a((Map<String, ?>) hashMap);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "dc7ea8aafc585efb4754291deea85e80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "dc7ea8aafc585efb4754291deea85e80");
        } else if (!h() || af.a("pay_debugkit").b("is_inject_knb_bridge", true)) {
            JsHandlerFactory.registerJsHandler("pay.sharkRequest", "OzzKRemkRfuLpm7rGMLTKvpGEqHpBAmxsP1t7YoJTTYNbQQ70HgLzOsy06JnMN4MWUWKsco1za1zxizV3egxgg==", SharkRequestJSHandler.class);
            JsHandlerFactory.registerJsHandler(NeoHybridJSHandler.NAME, "fTyT+vV4jVpr0KmPnepUEf6Ob7d94/BAVoVNAsbR0nTorDfyxhTnE3gL/cpR5mWpspKZgM/S2VrB9Um621cgFQ==", NeoHybridJSHandler.class);
            JsHandlerFactory.registerJsHandler(TunnelParamJSHandler.NAME, "pEOnVnZUuSgAWRgTFNOyXunnmeh2uzakXu6T2POP7m4sYFepLEJmngNcFeNLnS85+9JV1CZwApKzJkPwqpY/lQ==", TunnelParamJSHandler.class);
            JsHandlerFactory.registerJsHandler(NSFJsHandler.NAME, "QzstSzEkAi9e27Lb9RNAK5SjJXCjMlM1wdfWb3z/+PomENhbhJRnTkrIpGNaYthMwrDb8eTmQPyysMx2WPTc2g==", NSFJsHandler.class);
        }
        Context d = d();
        Object[] objArr4 = {d};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "9e568d9432970a1d1c387a0cded16446", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "9e568d9432970a1d1c387a0cded16446");
        } else if (d != null && h()) {
            try {
                Class.forName("com.meituan.android.paydebugkit.service.DebugService").getDeclaredMethod("init", Context.class).invoke(null, d);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        WebViewCreateHooker a2 = WebViewCreateHooker.a();
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = WebViewCreateHooker.a;
        if (PatchProxy.isSupport(objArr5, a2, changeQuickRedirect5, false, "8720b2b1f1cec81b6f649ce9c087240b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect5, false, "8720b2b1f1cec81b6f649ce9c087240b");
        } else {
            com.meituan.android.neohybrid.core.horn.a a3 = com.meituan.android.neohybrid.core.horn.a.a();
            WebViewCreateHooker.AnonymousClass1 anonymousClass1 = new WebViewCreateHooker.AnonymousClass1();
            Object[] objArr6 = {NeoHornConfig.class, anonymousClass1};
            ChangeQuickRedirect changeQuickRedirect6 = com.meituan.android.neohybrid.core.horn.a.a;
            if (PatchProxy.isSupport(objArr6, a3, changeQuickRedirect6, false, "f9f7708e9588870ae250c070ab2a8f08", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, a3, changeQuickRedirect6, false, "f9f7708e9588870ae250c070ab2a8f08");
            } else {
                List<a.b> list = a3.c.get(NeoHornConfig.class);
                if (list == null) {
                    list = new ArrayList<>();
                    a3.c.put(NeoHornConfig.class, list);
                }
                list.add(anonymousClass1);
            }
        }
        com.meituan.android.neohybrid.core.horn.a.a().a("hybrid_neo_container_config_default_android", NeoHornConfig.class);
        Object[] objArr7 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect7 = e.a;
        if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "4c0108f135775f6e28d70b777bbfbad3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "4c0108f135775f6e28d70b777bbfbad3");
        } else {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("neo_sdk_version", "0.1.33.1");
            hashMap2.put("nb_container", "hybrid");
            hashMap2.put("app_name", com.meituan.android.paybase.config.a.d().k());
            x.a("com.meituan.android.neohybrid.neo.report.NeoReportController", (HashMap<String, Object>) hashMap2);
        }
        c.a();
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f2ba34d94026d7c7105ce56533bfaf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f2ba34d94026d7c7105ce56533bfaf1");
            return;
        }
        HashMap hashMap = new HashMap(16);
        hashMap.put("usr_location", g());
        hashMap.put("device_fingerprint", com.meituan.android.neohybrid.cache.a.b());
        hashMap.put("usr_token", c().p());
        hashMap.put("usr_id", c().i());
        hashMap.put("usr_city_id", c().g());
        hashMap.put("device_uuid", c().j());
        com.meituan.android.neohybrid.neo.tunnel.a.a().a((Map<String, ?>) hashMap);
    }

    public static b c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7a9cf0fe5e6641d939f1add26995aed", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7a9cf0fe5e6641d939f1add26995aed") : com.meituan.android.paybase.config.a.d();
    }

    public static Context d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f84b666b46d5a2849f3efc2d4d096b21", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f84b666b46d5a2849f3efc2d4d096b21") : c().a();
    }

    public static String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef049445bb924fd6ae33c5bd0be9738a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef049445bb924fd6ae33c5bd0be9738a") : Neo.debugger().a("debug_hybrid_host", "https://npay.meituan.com");
    }

    public static String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2df33759f33de24d0e2eb651a7d42b9a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2df33759f33de24d0e2eb651a7d42b9a");
        }
        return Neo.debugger().a("debug_hybrid_host", ((NeoHornConfig) com.meituan.android.neohybrid.core.horn.a.a().a(NeoHornConfig.class)).isEnableHybridHostSwitch() ? "https://pay.meituan.com" : "https://npay.meituan.com");
    }

    public static String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d6a3d568f29aa2e8b1e058cf42b2d8b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d6a3d568f29aa2e8b1e058cf42b2d8b");
        }
        MtLocation f = c().f();
        if (f != null) {
            return f.getLatitude() + CommonConstant.Symbol.UNDERLINE + f.getLongitude();
        }
        return "unknown";
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e6, code lost:
        if (r2 != false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean h() {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.neohybrid.init.a.h():boolean");
    }
}
