package com.sankuai.waimai.store;

import com.meituan.android.common.fingerprint.FingerprintManager;
import com.meituan.msc.lib.interfaces.IRequestPrefetchListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.msi.apis.SGIRequestInfo;
import com.sankuai.waimai.store.util.an;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGMSCPreRequestImpl implements IRequestPrefetchListener {
    public static ChangeQuickRedirect a;

    private void a(String str, Map<String, String> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfdf24573d1942b9590ff82d0da97480", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfdf24573d1942b9590ff82d0da97480");
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
        int i2 = 0;
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea1953a3ea2c3c602b8e7cb4635366e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea1953a3ea2c3c602b8e7cb4635366e3");
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
            if ("/pages/detail/index".equals(str2)) {
                HashMap hashMap3 = new HashMap();
                String[] strArr = {"spuid", FoodDetailNetWorkPreLoader.URI_SKU, FoodDetailNetWorkPreLoader.URI_POI, FoodDetailNetWorkPreLoader.URI_POI_STR, "activitytag", "activityUuid", "extra", "sale_type"};
                String[] strArr2 = {"spu_id", "sku_id", "wm_poi_id", FoodDetailNetWorkPreLoader.URI_POI_STR, "activity_tag", "share_activity_uuid", "extra", "sale_type"};
                while (i2 < 8) {
                    String str6 = strArr[i2];
                    if (hashMap2.containsKey(str6) && hashMap2.get(str6) != null) {
                        String c = an.c(hashMap2.get(str6));
                        String str7 = strArr2[i2];
                        if (c == null) {
                            c = "";
                        }
                        hashMap3.put(str7, c);
                    }
                    i2++;
                }
                hashMap3.put("page_source", 40);
                HashMap hashMap4 = new HashMap();
                hashMap4.put("isMSC", 1);
                hashMap3.put("tileExtra", com.sankuai.waimai.store.util.i.a(hashMap4));
                hashMap.put("params", com.sankuai.waimai.store.util.i.a(hashMap3));
            } else if ("/pages/store/index".equals(str2)) {
                hashMap.put("wm_poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(hashMap2, "-1"));
                hashMap.put("need_spu_count_cut", "1");
                hashMap.put("front_page_type", "1");
                String[] strArr3 = {FoodDetailNetWorkPreLoader.URI_POI_STR, "spu_id", "page_index", "tag_id", "extra", "origin_shopcart_product_list", "origin_poi_name", "origin_poi_id", "origin_poi_id_str"};
                String[] strArr4 = {FoodDetailNetWorkPreLoader.URI_POI_STR, "product_spu_id", "page_index", "tag_id", "extra", "origin_shopcart_product_list", "origin_poi_name", "origin_poi_id", "origin_poi_id_str"};
                while (i2 < 9) {
                    String str8 = strArr3[i2];
                    if (hashMap2.containsKey(str8) && hashMap2.get(str8) != null) {
                        String c2 = an.c(hashMap2.get(str8));
                        String str9 = strArr4[i2];
                        if (c2 == null) {
                            c2 = "";
                        }
                        hashMap.put(str9, c2);
                    }
                    i2++;
                }
                String F = com.sankuai.waimai.platform.b.A().F();
                if (!t.a(F)) {
                    hashMap.put(FingerprintManager.TAG, F);
                }
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cffa01c7efde3984b1142110ed1da31c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cffa01c7efde3984b1142110ed1da31c");
        }
        Map<String, String> a2 = SGIRequestInfo.a();
        a2.putAll(com.sankuai.waimai.store.base.net.g.a());
        a2.put("msc_prefetch", "true");
        return a2;
    }
}
