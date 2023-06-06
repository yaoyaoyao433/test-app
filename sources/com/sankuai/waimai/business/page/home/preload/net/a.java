package com.sankuai.waimai.business.page.home.preload.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.waimai.business.page.home.model.API;
import com.sankuai.waimai.business.page.home.preload.PreloadDataModel;
import com.sankuai.waimai.business.page.home.preload.c;
import com.sankuai.waimai.business.page.home.utils.UUIDMonitoringReporter;
import com.sankuai.waimai.business.page.home.utils.h;
import com.sankuai.waimai.business.page.home.utils.l;
import com.sankuai.waimai.business.page.home.utils.m;
import com.sankuai.waimai.business.page.home.utils.o;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.mach.monitor.d;
import java.util.HashMap;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static k a(String str, b.AbstractC1042b<BaseResponse<String>> abstractC1042b) {
        Object[] objArr = {str, abstractC1042b};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "05a8067dcdae3741e7a08b3049dd6395", RobustBitConfig.DEFAULT_VALUE) ? (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "05a8067dcdae3741e7a08b3049dd6395") : a(str, false, (API) b.a((Class<Object>) API.class), abstractC1042b);
    }

    public static void b(String str, b.AbstractC1042b<BaseResponse<String>> abstractC1042b) {
        ar c;
        API api;
        Object[] objArr = {str, abstractC1042b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c53547f1119e0cd436865730b127fd71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c53547f1119e0cd436865730b127fd71");
            return;
        }
        c cVar = (c) com.sankuai.waimai.router.a.a(c.class, "takeout_homepage_preload_valid_key");
        if (cVar == null || (c = cVar.c()) == null || (api = (API) c.a(API.class)) == null) {
            return;
        }
        a(str, true, api, abstractC1042b);
    }

    private static k a(String str, boolean z, API api, b.AbstractC1042b<BaseResponse<String>> abstractC1042b) {
        String str2;
        String str3;
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), api, abstractC1042b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "25ba47b889488add70d761f7f8b14395", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "25ba47b889488add70d761f7f8b14395");
        }
        h.a().a("rcmd_api_start", new boolean[0]);
        m.a().a("RcmdReq+");
        if (z) {
            WMLocation recommendedLocation = PreloadDataModel.get().getRecommendedLocation();
            if (!a(recommendedLocation)) {
                return null;
            }
            str3 = String.valueOf((long) (recommendedLocation.getLatitude() * 1000000.0d));
            str2 = String.valueOf((long) (recommendedLocation.getLongitude() * 1000000.0d));
        } else {
            str2 = null;
            str3 = null;
        }
        com.sankuai.waimai.business.page.home.list.a.a().h = com.sankuai.waimai.platform.b.A().c();
        d.a("home/rcmdboard", "homepage");
        com.sankuai.waimai.platform.mach.monitor.b.a().b();
        UUIDMonitoringReporter.a(1);
        HashMap hashMap = new HashMap();
        if (o.b != null && o.a() == 1) {
            hashMap.putAll(o.b);
        }
        hashMap.put("net_stat", Integer.valueOf(l.a()));
        hashMap.put("rank_list_id", str);
        hashMap.put("ref_list_id", "");
        hashMap.put("wm_custom_latitude", str3);
        hashMap.put("wm_custom_longitude", str2);
        hashMap.put("behavioral_characteristics", "");
        hashMap.put("user_agent", com.sankuai.waimai.platform.b.A().J());
        hashMap.put("callback_params", 3);
        hashMap.put("ad_params", "");
        return b.a(api.getHomeNewRcmdboard(hashMap), abstractC1042b, null);
    }

    private static boolean a(WMLocation wMLocation) {
        Object[] objArr = {wMLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6bd8b9c564c07e187358f631803accb4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6bd8b9c564c07e187358f631803accb4")).booleanValue() : wMLocation != null && com.sankuai.waimai.foundation.utils.h.d(Double.valueOf(wMLocation.getLatitude()), Double.valueOf(0.0d)) && com.sankuai.waimai.foundation.utils.h.d(Double.valueOf(wMLocation.getLongitude()), Double.valueOf(0.0d));
    }
}
