package com.sankuai.waimai.business.address.util;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static void a(Context context, AddressItem addressItem, int i) {
        String str;
        Object[] objArr = {context, addressItem, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "97a96465c6650f9b9285116ae5f22299", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "97a96465c6650f9b9285116ae5f22299");
            return;
        }
        com.sankuai.waimai.addrsdk.base.a b = com.sankuai.waimai.addrsdk.manager.a.a().b();
        if (b != null && b.a() != null) {
            str = b.a() + "+" + System.currentTimeMillis();
        } else {
            str = "+" + System.currentTimeMillis();
        }
        JudasManualManager.a("b_UwnMt").a("index", i).a("address_longitude", String.valueOf(addressItem.lng / 1000000.0d)).a("address_latitude", String.valueOf(addressItem.lat / 1000000.0d)).a("address_name", addressItem.addrBrief).a("address_address", addressItem.addrDesc).a("address_type", addressItem.type).a("search_type", "附近搜索").a("radius", com.sankuai.waimai.platform.domain.manager.location.search.b.a(context.getApplicationContext())).a("city", addressItem.cityName).a("address_services", a(context)).a("address_id", addressItem.mapSearchPoiId).a("source", addressItem.source).a("req_trace_id", str).a();
    }

    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "918ad13e3e355867a33310cf847727dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "918ad13e3e355867a33310cf847727dd");
        }
        ABStrategy strategy = ABTestManager.getInstance(context.getApplicationContext()).getStrategy("wm_address_services_test", null);
        return strategy != null ? strategy.expName : "";
    }
}
