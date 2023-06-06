package com.sankuai.waimai.store.drug.util;

import android.app.Activity;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.util.monitor.monitor.DrugSchemeMonitor;
import com.sankuai.waimai.store.util.w;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a = null;
    public static final String b = "0";
    public static final String c = "1";
    public static int d;
    private static int e;
    private static int f;

    public static void a(@NonNull Activity activity, Poi poi) {
        Object[] objArr = {activity, poi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "39532e34c3c6e40732c0e73960bf093e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "39532e34c3c6e40732c0e73960bf093e");
            return;
        }
        Uri data = activity.getIntent().getData();
        HashMap hashMap = new HashMap();
        if (data != null) {
            hashMap.put(NetLogConstants.Details.SCHEME, data.toString());
        }
        hashMap.put("from", "sg");
        hashMap.put("source_vc", activity.getClass().getSimpleName());
        if (poi != null) {
            hashMap.put("store_type", a(poi));
        }
        hashMap.put("source_scheme", a(data) ? b : c);
        com.sankuai.waimai.store.util.monitor.c.a(DrugSchemeMonitor.MEDPoiTransferError, "", "商家页路由监控", hashMap);
    }

    public static void b(@NonNull Activity activity, Poi poi) {
        Object[] objArr = {activity, poi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "26205ea79066f744d65e33088293acc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "26205ea79066f744d65e33088293acc6");
            return;
        }
        Uri data = activity.getIntent().getData();
        HashMap hashMap = new HashMap();
        hashMap.put("from", DefaultHeaderService.KEY_DRUG);
        hashMap.put("source_vc", activity.getClass().getSimpleName());
        if (poi != null) {
            hashMap.put("store_type", a(poi));
        }
        hashMap.put("source_scheme", a(data) ? b : c);
        com.sankuai.waimai.store.util.monitor.c.b(DrugSchemeMonitor.MEDPoiNormal, "", "商家页路由监控", hashMap);
    }

    private static boolean a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "28a951d8f9ca38e2a1b316023a9b245b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "28a951d8f9ca38e2a1b316023a9b245b")).booleanValue();
        }
        if (uri != null) {
            String scheme = uri.getScheme();
            if (!TextUtils.isEmpty(scheme)) {
                return scheme.equalsIgnoreCase("wm_router");
            }
        }
        return false;
    }

    public static String a(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f01ea0b4f198d1ce15d0163a341765f6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f01ea0b4f198d1ce15d0163a341765f6") : (restMenuResponse == null || restMenuResponse.mPoiShoppingCart == null) ? "Unknown" : restMenuResponse.mPoiShoppingCart.cartType == 2 ? "b2c" : restMenuResponse.mPoiShoppingCart.cartType == 4 ? "o2o" : "Unknown";
    }

    public static String a(Poi poi) {
        Object[] objArr = {poi};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "773eeb67ce76e143107d299628ea7256", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "773eeb67ce76e143107d299628ea7256") : poi == null ? "Unknown" : w.d(poi) ? "RetailStore" : w.e(poi) ? "StandardStore" : w.f(poi) ? "FusionStore" : w.g(poi) ? "SelfBusinessStore" : "Unknown";
    }
}
