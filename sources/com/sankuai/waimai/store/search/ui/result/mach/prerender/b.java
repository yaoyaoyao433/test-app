package com.sankuai.waimai.store.search.ui.result.mach.prerender;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.store.search.data.c;
import com.sankuai.waimai.store.search.model.CommonMachData;
import com.sankuai.waimai.store.search.model.OasisModule;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.search.ui.result.ISearchTemplateProvider;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static Map<String, a> b = new HashMap();

    static {
        Map<String, a> provideMachPreRenderActions;
        Map<String, a> provideMachPreRenderActions2;
        ISearchTemplateProvider iSearchTemplateProvider = (ISearchTemplateProvider) com.sankuai.waimai.router.a.a(ISearchTemplateProvider.class, ISearchTemplateProvider.ROUTER_SERVICE_KEY_STORE_SEARCH);
        ISearchTemplateProvider iSearchTemplateProvider2 = (ISearchTemplateProvider) com.sankuai.waimai.router.a.a(ISearchTemplateProvider.class, ISearchTemplateProvider.ROUTER_SERVICE_KEY_DRUG_SEARCH);
        if (iSearchTemplateProvider != null && (provideMachPreRenderActions2 = iSearchTemplateProvider.provideMachPreRenderActions()) != null) {
            b.putAll(provideMachPreRenderActions2);
        }
        if (iSearchTemplateProvider2 == null || (provideMachPreRenderActions = iSearchTemplateProvider2.provideMachPreRenderActions()) == null) {
            return;
        }
        b.putAll(provideMachPreRenderActions);
    }

    public static CommonMachData a(SearchShareData searchShareData, @NonNull OasisModule oasisModule, com.sankuai.waimai.mach.recycler.b bVar, Activity activity, int i) {
        int i2;
        boolean z;
        Object[] objArr = {searchShareData, oasisModule, bVar, activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a43c7997d52e63d57256a2149cf2aec6", RobustBitConfig.DEFAULT_VALUE)) {
            return (CommonMachData) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a43c7997d52e63d57256a2149cf2aec6");
        }
        if (oasisModule == null || TextUtils.isEmpty(oasisModule.machTemplateId)) {
            return null;
        }
        if (oasisModule.layoutInfo == null || oasisModule.layoutInfo.templateStyle != 2) {
            i2 = i;
            z = false;
        } else {
            i2 = ((i - (g.a(activity, 12.0f) * 2)) - g.a(activity, 8.0f)) / 2;
            z = true;
        }
        Serializable b2 = c.b(oasisModule);
        if (b.containsKey(oasisModule.machTemplateId) && b2 != null) {
            return b.get(oasisModule.machTemplateId).a(b2, oasisModule.stringData, oasisModule.unionId, searchShareData, activity, i2);
        }
        Map a2 = com.sankuai.waimai.mach.utils.b.a(oasisModule.stringData);
        if (a2 == null) {
            a2 = new HashMap();
        }
        Map map = a2;
        map.put(Constants.Environment.KEY_UNION_ID, oasisModule.unionId);
        com.sankuai.waimai.mach.recycler.c a3 = com.sankuai.waimai.store.search.ui.result.mach.b.a(bVar, oasisModule.machTemplateId, oasisModule.defaultTemplateId, activity, map, oasisModule.stringData, i2, 0, null, null, null, searchShareData.L == null ? null : searchShareData.L.f);
        if (a3 == null || a3.b() == null) {
            return null;
        }
        a3.a("mach_extra_key_biz_data", oasisModule.stringData);
        CommonMachData commonMachData = new CommonMachData(a3, oasisModule.unionId, b2);
        if (z) {
            commonMachData.bottomMargin = g.a(activity, 8.0f);
        }
        return commonMachData;
    }
}
