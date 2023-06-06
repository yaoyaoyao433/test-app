package com.sankuai.waimai.business.search.ui.result.mach.prerender;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.datatype.CommonMachData;
import com.sankuai.waimai.business.search.model.OasisModule;
import com.sankuai.waimai.business.search.ui.SearchShareData;
import com.sankuai.waimai.search.common.mach.provider.IMachProvider;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class i {
    public static ChangeQuickRedirect a;
    private static final Map<String, h> b;
    private static final IMachProvider c = (IMachProvider) com.sankuai.waimai.router.a.a(IMachProvider.class, "sg");

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put("mach_waimai-search-business-direct-style-12", new a());
        b.put("mach_waimai-search-labelrank-style-8", new n());
        b.put("mach_waimai-search-queryrecommend-style-10", new m());
        b.put("waimai-search-feed-intelligence-2", new l());
        b.put("waimai-search-feed-intelligence-1", new j());
        b.put("waimai-search-medicine-feed-1", new d());
        b.put("waimai-search-medicine-feed-2", new f());
        b.put("waimai-search-supermarket-feed-1", new o());
        b.put("waimai-search-supermarket-feed-2", new q());
        b.put("waimai_search_category_intent_cake_fall", new g());
        b.put("product_mode", new b());
        b.put("productlist_module_feed_739", new b());
        b.put("poi_fall_mode", new g());
    }

    public static CommonMachData a(SearchShareData searchShareData, @NonNull OasisModule oasisModule, com.sankuai.waimai.mach.recycler.b bVar, Activity activity, int i, boolean z, Map<String, Object> map) {
        com.sankuai.waimai.mach.recycler.c a2;
        com.sankuai.waimai.mach.recycler.c a3;
        Object[] objArr = {searchShareData, oasisModule, bVar, activity, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c35ee598ca42780af998fa8987ab39f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (CommonMachData) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c35ee598ca42780af998fa8987ab39f9");
        }
        if (oasisModule == null || TextUtils.isEmpty(oasisModule.machTemplateId)) {
            return null;
        }
        if (c != null && c.intercept(oasisModule.machTemplateId) && (a3 = com.sankuai.waimai.business.search.ui.result.mach.c.a(c, oasisModule, activity, map, z)) != null && a3.b() != null) {
            a3.a("mach_extra_key_biz_data", oasisModule.stringData);
            return new CommonMachData(c, a3, oasisModule.unionId);
        }
        if (b.containsKey(oasisModule.machTemplateId)) {
            Serializable b2 = com.sankuai.waimai.business.search.common.data.a.b(oasisModule);
            if (b2 == null) {
                b2 = !TextUtils.isEmpty(oasisModule.stringData) ? oasisModule.stringData : null;
            }
            if (b2 != null) {
                return b.get(oasisModule.machTemplateId).a(oasisModule, b2, oasisModule.stringData, oasisModule.unionId, searchShareData, activity, i);
            }
        }
        if (b.containsKey(oasisModule.moduleId)) {
            Serializable c2 = com.sankuai.waimai.business.search.common.data.a.c(oasisModule);
            if (c2 == null) {
                c2 = !TextUtils.isEmpty(oasisModule.stringData) ? oasisModule.stringData : null;
            }
            if (c2 != null) {
                return b.get(oasisModule.moduleId).a(oasisModule, c2, oasisModule.stringData, oasisModule.unionId, searchShareData, activity, i);
            }
        }
        Map a4 = com.sankuai.waimai.mach.utils.b.a(oasisModule.stringData);
        if (a4 == null) {
            a4 = new HashMap();
        }
        Map map2 = a4;
        map2.put(Constants.Environment.KEY_UNION_ID, oasisModule.unionId);
        IMachProvider iMachProvider = (IMachProvider) com.sankuai.waimai.router.a.a(IMachProvider.class, "wm");
        if (iMachProvider == null) {
            a2 = com.sankuai.waimai.business.search.ui.result.mach.b.a(bVar, oasisModule.machTemplateId, oasisModule.defaultTemplateId, activity, map2, oasisModule.stringData, i, 0, null, null, map);
        } else {
            a2 = com.sankuai.waimai.business.search.ui.result.mach.c.a(iMachProvider, oasisModule, activity, map, z);
        }
        if (a2 == null || a2.b() == null) {
            return null;
        }
        a2.a("mach_extra_key_biz_data", oasisModule.stringData);
        return new CommonMachData(iMachProvider, a2, oasisModule.unionId);
    }
}
