package com.sankuai.waimai.business.ugc.live.utils;

import android.os.Build;
import com.dianping.monitor.impl.l;
import com.dianping.monitor.impl.m;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.privacy.interfaces.MtTelephonyManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.knbbridge.ShowLogJsHandler;
import com.sankuai.waimai.foundation.location.v2.City;
import com.sankuai.waimai.foundation.location.v2.g;
import java.util.Collections;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a = null;
    public static String b = "live_first_playing_time";
    public static String c = "live_buffer_loading_time";
    public static String d = "live_buffer_loading_times";
    public static String e = "live_play_times";
    public static String f = "live_exception_times";
    public static String g = "live_preload_times";
    private static String h = "wm_live_player_qos";

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public String a;
        public float b;
        public String c;
        public String d;
        public int e;
        public int f;
        public int g;
        public String h;
        public int i;
    }

    public static void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f526a683febd5dca4fc881af44e4f191", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f526a683febd5dca4fc881af44e4f191");
            return;
        }
        l a2 = new m(com.sankuai.waimai.config.a.a().d(), com.meituan.android.singleton.b.a, com.sankuai.waimai.platform.b.A().c()).a(h, Collections.singletonList(Float.valueOf(aVar.b))).a("qosType", aVar.a).a("value", String.valueOf(aVar.b));
        float f2 = aVar.b;
        Object[] objArr2 = {Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        l a3 = a2.a("valueThreshold", PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c689551699202c53484a94c08bff1054", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c689551699202c53484a94c08bff1054") : String.format(Locale.getDefault(), "%.1f", Float.valueOf(f2 / 1000.0f))).a("biz", aVar.c).a(ShowLogJsHandler.PARAM_NAME_MODULE, aVar.d).a("playType", String.valueOf(aVar.e)).a(DMKeys.KEY_VIEW_WIDTH, String.valueOf(aVar.f)).a(DMKeys.KEY_VIEW_HEIGHT, String.valueOf(aVar.g)).a("liveId", aVar.h).a("preloadState", String.valueOf(aVar.i));
        Object[] objArr3 = {a3};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "7204e55a4f7ab6e1b8f1278bbad6a00d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "7204e55a4f7ab6e1b8f1278bbad6a00d");
        } else {
            a3.a(DeviceInfo.OS_NAME, "android").a(DeviceInfo.DEVICE_MODEL, Build.MODEL).a("osVersion", Build.VERSION.RELEASE).a("screenWidth", String.valueOf(com.sankuai.waimai.platform.b.A().l())).a("screenHeight", String.valueOf(com.sankuai.waimai.platform.b.A().m())).a("version", com.sankuai.waimai.platform.b.A().i()).a("netType", AppUtil.getNetWorkType(com.meituan.android.singleton.b.a));
            City l = g.a().l();
            if (l != null) {
                a3.a("city", l.getCityName());
            }
            MtTelephonyManager createTelephonyManager = Privacy.createTelephonyManager(com.meituan.android.singleton.b.a, "com.sankuai.waimai.foundation:utils");
            if (createTelephonyManager != null) {
                a3.a("networkOperator", createTelephonyManager.getNetworkOperatorName());
            }
        }
        String str = d.b;
        com.sankuai.waimai.foundation.utils.log.a.b(str, "reportRaptor, qosType: " + aVar.a + ", value: " + aVar.b, new Object[0]);
        a3.a();
    }
}
