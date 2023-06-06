package com.sankuai.waimai.store.drug.msc.preload;

import com.meituan.android.common.statistics.Statistics;
import com.meituan.msc.lib.interfaces.IRequestPrefetchListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.platform.b;
import com.sankuai.waimai.platform.model.c;
import com.sankuai.waimai.store.base.net.g;
import com.sankuai.waimai.store.util.i;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugMSCPreloadRequestImpl implements IRequestPrefetchListener {
    public static ChangeQuickRedirect a;

    private void a(String str, Map<String, String> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4024992b4755c4cd9fb29a851ea690c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4024992b4755c4cd9fb29a851ea690c3");
        } else if (t.a(str) || !str.contains("=")) {
        } else {
            String[] split = str.split("=");
            if (split.length == 2) {
                map.put(split[0], split[1]);
            }
        }
    }

    @Override // com.meituan.msc.lib.interfaces.IRequestPrefetchListener
    public final Map<String, String> a(String str, String str2, String str3, String str4) {
        int indexOf;
        int i;
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2566bdc99db9e10c8e85f73ec4c3f8c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2566bdc99db9e10c8e85f73ec4c3f8c7");
        }
        HashMap hashMap = new HashMap();
        try {
            HashMap hashMap2 = new HashMap();
            if (!t.a(str2) && !t.a(str3)) {
                String substring = (!str3.contains(CommonConstant.Symbol.QUESTION_MARK) || (indexOf = str3.indexOf(CommonConstant.Symbol.QUESTION_MARK)) == -1 || (i = indexOf + 1) >= str3.length()) ? str3 : str3.substring(i);
                if (substring.contains("&")) {
                    for (String str5 : substring.split("&")) {
                        a(str5, hashMap2);
                    }
                } else {
                    a(substring, hashMap2);
                }
            }
            if ("/pages/msc/drug-goods-detail/index".equals(str2)) {
                HashMap hashMap3 = new HashMap();
                String[] strArr = {"sku_id", "spuid", FoodDetailNetWorkPreLoader.URI_SKU, FoodDetailNetWorkPreLoader.URI_POI, FoodDetailNetWorkPreLoader.URI_POI_STR, "activitytag", "activityTag", "sputag", "activityUuid", "extra", "sale_type"};
                String[] strArr2 = {"sku_id", "spu_id", "sku_id", "wm_poi_id", FoodDetailNetWorkPreLoader.URI_POI_STR, "activity_tag", "activity_tag", "spu_tag", "share_activity_uuid", "extra", "sale_type"};
                for (int i2 = 0; i2 < 11; i2++) {
                    String str6 = strArr[i2];
                    if (hashMap2.containsKey(str6) && hashMap2.get(str6) != null) {
                        hashMap3.put(strArr2[i2], hashMap2.get(str6));
                    }
                }
                hashMap3.put("fromPreRequest", "1");
                hashMap.put("planKey", "drug-detail");
                hashMap.put("variablesStr", i.a(hashMap3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hashMap;
    }

    @Override // com.meituan.msc.lib.interfaces.IRequestPrefetchListener
    public final Map<String, String> b(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "437ee7239754b44c398c2798565c7409", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "437ee7239754b44c398c2798565c7409");
        }
        Map<String, String> a2 = a();
        a2.putAll(g.a());
        a2.put("msc_prefetch", "true");
        return a2;
    }

    private static Map a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a2bef2a14d92a3cf155f8e167fe05db8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a2bef2a14d92a3cf155f8e167fe05db8");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_model", String.valueOf(c.a().b()));
        hashMap.put("wm_seq", String.valueOf(b.A().p()));
        hashMap.put("req_time", String.valueOf(com.meituan.android.time.c.b()));
        hashMap.put("push_token", b.A().D());
        WMLocation i = com.sankuai.waimai.foundation.location.v2.g.a().i();
        if (i != null) {
            double latitude = i.getLatitude();
            double longitude = i.getLongitude();
            hashMap.put("wm_actual_latitude", String.valueOf((long) (latitude * 1000000.0d)));
            hashMap.put("wm_actual_longitude", String.valueOf((long) (longitude * 1000000.0d)));
        } else {
            hashMap.put("wm_actual_latitude", "0");
            hashMap.put("wm_actual_longitude", "0");
        }
        WMLocation p = com.sankuai.waimai.foundation.location.v2.g.a().p();
        if (p != null) {
            try {
                hashMap.put("wm_latitude", String.valueOf((long) (p.getLatitude() * 1000000.0d)));
                hashMap.put("wm_longitude", String.valueOf((long) (p.getLongitude() * 1000000.0d)));
            } catch (NullPointerException unused) {
            }
        }
        hashMap.put("personalized", String.valueOf(b.A().I()));
        hashMap.put("wm_did", b.A().b());
        if (com.sankuai.waimai.router.set_id.b.a().b().get("region_id") != null) {
            hashMap.put("region_id", com.sankuai.waimai.router.set_id.b.a().b().get("region_id"));
        }
        if (com.sankuai.waimai.router.set_id.b.a().b().get("region_version") != null) {
            hashMap.put("region_version", com.sankuai.waimai.router.set_id.b.a().b().get("region_version"));
        }
        if (com.sankuai.waimai.router.set_id.b.a().b().get("region_user_id") != null) {
            hashMap.put("region_user_id", com.sankuai.waimai.router.set_id.b.a().b().get("region_user_id"));
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.c.a;
        hashMap.putAll(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "aace2f9fd1878a09efdd09b8b45b4dc7", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "aace2f9fd1878a09efdd09b8b45b4dc7") : com.sankuai.waimai.platform.net.c.a().g());
        hashMap.put("uuid", b.A().c());
        hashMap.put("request_id", Statistics.getRequestId(""));
        hashMap.put("seq_id", b());
        return hashMap;
    }

    private static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "32f357ca3ceac973b05a3c477fd4a855", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "32f357ca3ceac973b05a3c477fd4a855");
        }
        try {
            return String.valueOf(Statistics.getChannel().getSeq());
        } catch (Exception unused) {
            return "";
        }
    }
}
