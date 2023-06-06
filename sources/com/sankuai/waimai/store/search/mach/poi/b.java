package com.sankuai.waimai.store.search.mach.poi;

import android.app.Activity;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.recycler.c;
import com.sankuai.waimai.store.search.data.g;
import com.sankuai.waimai.store.search.model.CommonMachData;
import com.sankuai.waimai.store.search.model.PoiEntity;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements com.sankuai.waimai.store.search.ui.result.mach.prerender.a {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.search.ui.result.mach.prerender.a
    public final CommonMachData a(Serializable serializable, String str, String str2, SearchShareData searchShareData, Activity activity, int i) {
        Object[] objArr = {serializable, str, str2, searchShareData, activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dee81ca253368d9e92936381c8e2dab2", RobustBitConfig.DEFAULT_VALUE)) {
            return (CommonMachData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dee81ca253368d9e92936381c8e2dab2");
        }
        if (serializable instanceof PoiEntity) {
            PoiEntity poiEntity = (PoiEntity) serializable;
            poiEntity.templateDetail = searchShareData.D;
            if (g.a == -1) {
                g.a = poiEntity.productShowType;
            }
            if (!poiEntity.isRecommendResult() && poiEntity.productShowType != 3 && searchShareData.D == 4) {
                poiEntity.productShowType = g.a;
            }
        }
        Map<String, Object> a2 = com.sankuai.waimai.mach.utils.b.a(str);
        if (a2 != null && a2.containsKey("product_show_type")) {
            a2.put("product_show_type", Integer.valueOf(((PoiEntity) serializable).productShowType));
        }
        com.sankuai.waimai.mach.recycler.b bVar = searchShareData.t;
        Map<String, Object> map = searchShareData.L == null ? null : searchShareData.L.f;
        a aVar = new a(1, "c_nfqbfvw", AppUtil.generatePageInfoKey(activity));
        c a3 = com.sankuai.waimai.store.search.ui.result.mach.b.a(bVar, "supermarket-search-poi", "", activity, a2, str, i, 0, null, aVar, null, map);
        aVar.b = a3;
        if (a3 == null || a3.b() == null) {
            return null;
        }
        a3.a("mach_extra_key_biz_data", serializable);
        return new CommonMachData(a3, str2, serializable);
    }
}
