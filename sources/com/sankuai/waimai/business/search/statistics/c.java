package com.sankuai.waimai.business.search.statistics;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.datatype.CommonMachData;
import com.sankuai.waimai.business.search.ui.SearchShareData;
import com.sankuai.waimai.pouch.model.PouchDynamicAd;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static void a(com.sankuai.waimai.business.search.common.data.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "06792ffa130ba2c534a7acb5c844c3ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "06792ffa130ba2c534a7acb5c844c3ef");
        } else if (dVar != null && !dVar.isEmpty()) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.search.common.data.d.a;
            int intValue = PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "2ded4e4a55759178edfafeeaae59cba1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "2ded4e4a55759178edfafeeaae59cba1")).intValue() : dVar.b.size();
            int i = 0;
            for (int i2 = 0; i2 < intValue; i2++) {
                Object[] objArr3 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.search.common.data.d.a;
                Serializable serializable = PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "83505b76a5c9cfa6881944f248f2f8e8", RobustBitConfig.DEFAULT_VALUE) ? (Serializable) PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "83505b76a5c9cfa6881944f248f2f8e8") : dVar.b.get(i2);
                if (serializable instanceof d) {
                    if (serializable instanceof CommonMachData) {
                        CommonMachData commonMachData = (CommonMachData) serializable;
                        if (commonMachData.isTrackable) {
                            int i3 = i2 - i;
                            ((d) serializable).setStatisticsIndex(i3);
                            commonMachData.mItem.a("mach_extra_key_index", Integer.valueOf(i3));
                        }
                        i++;
                    } else {
                        ((d) serializable).setStatisticsIndex(i2 - i);
                    }
                } else {
                    if (serializable instanceof PouchDynamicAd) {
                        ((PouchDynamicAd) serializable).index = i2 - i;
                    }
                    i++;
                }
            }
            a(dVar.b);
        }
    }

    public static String a(SearchShareData searchShareData) {
        Object[] objArr = {searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7965bbe863bc0d49affa1633afa4194", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7965bbe863bc0d49affa1633afa4194") : a(searchShareData, 1);
    }

    public static String b(SearchShareData searchShareData) {
        Object[] objArr = {searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "81d06b4435ceb76989de581bf9a534ce", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "81d06b4435ceb76989de581bf9a534ce") : a(searchShareData, 2);
    }

    public static String a(SearchShareData searchShareData, int i) {
        String str;
        Object[] objArr = {searchShareData, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2cb100dcb81d99558c5252e89e554ec1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2cb100dcb81d99558c5252e89e554ec1");
        }
        return (searchShareData.ad == null || (str = searchShareData.ad.get(Integer.valueOf(i))) == null) ? "" : str;
    }

    private static void a(List<Serializable> list) {
        CommonMachData commonMachData;
        com.sankuai.waimai.mach.recycler.c cVar;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2fc7c664bd2e76b7f8d3ca6fadfa935", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2fc7c664bd2e76b7f8d3ca6fadfa935");
        } else if (!com.sankuai.waimai.foundation.utils.d.a(list)) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                Serializable serializable = list.get(i3);
                if ((serializable instanceof CommonMachData) && (cVar = (commonMachData = (CommonMachData) serializable).mItem) != null && ("waimai-search-feed-intelligence-2".equals(cVar.a()) || "waimai-search-medicine-feed-2".equals(cVar.a()) || "waimai-search-supermarket-feed-2".equals(cVar.a()) || "waimai_search_category_intent_cake_fall".equals(cVar.a()) || "poi_fall_mode".equals(commonMachData.oasisModuleId))) {
                    int c = cVar.c();
                    if (i <= i2) {
                        commonMachData.getStaggerIndexLookup().a(0);
                        i += c;
                    } else {
                        commonMachData.getStaggerIndexLookup().a(1);
                        i2 += c;
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
            }
        }
    }
}
