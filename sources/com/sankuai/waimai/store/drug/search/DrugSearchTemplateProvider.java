package com.sankuai.waimai.store.drug.search;

import android.content.Context;
import android.support.v4.util.SparseArrayCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.ITagProcessor;
import com.sankuai.waimai.store.drug.search.common.model.NoResultRemindInfoData;
import com.sankuai.waimai.store.drug.search.delegates.a;
import com.sankuai.waimai.store.drug.search.delegates.c;
import com.sankuai.waimai.store.drug.search.mach.component.nestscroller.NestedScrollerTagProcessor;
import com.sankuai.waimai.store.drug.search.mach.component.nestscroller.e;
import com.sankuai.waimai.store.search.adapterdelegates.b;
import com.sankuai.waimai.store.search.model.PoiEntity;
import com.sankuai.waimai.store.search.model.SGActivityFilterEntity;
import com.sankuai.waimai.store.search.model.SearchLocation;
import com.sankuai.waimai.store.search.model.TabStyleSortFilterEntity;
import com.sankuai.waimai.store.search.model.f;
import com.sankuai.waimai.store.search.ui.result.ISearchTemplateProvider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugSearchTemplateProvider implements ISearchTemplateProvider {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.store.search.ui.result.ISearchTemplateProvider
    public Map<String, Class<?>> provideDeserializeModels() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed344310afbcd69ce117b52bfc3a30a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed344310afbcd69ce117b52bfc3a30a2");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("wm_search_poi_template", PoiEntity.class);
        hashMap.put("wm_search_category_template", PoiEntity.class);
        hashMap.put("wm_search_feed_product_template", f.class);
        hashMap.put("drug_searchPage_addressBar", SearchLocation.class);
        hashMap.put("wm_shangou_drug_merge_sort_quick_filter_v2", TabStyleSortFilterEntity.class);
        hashMap.put("drug_search_fullpage_no_result", NoResultRemindInfoData.class);
        hashMap.put("supermarket-drug-search-result-two-column", f.class);
        hashMap.put("drug-search-activity-quick-filter", SGActivityFilterEntity.class);
        return hashMap;
    }

    @Override // com.sankuai.waimai.store.search.ui.result.ISearchTemplateProvider
    public SparseArrayCompat<b> provideNativeTemplates(Context context, String str, com.sankuai.waimai.store.search.ui.result.b bVar) {
        Object[] objArr = {context, str, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f3e9a056db32d0bebcab3f3c10ca435", RobustBitConfig.DEFAULT_VALUE)) {
            return (SparseArrayCompat) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f3e9a056db32d0bebcab3f3c10ca435");
        }
        SparseArrayCompat<b> sparseArrayCompat = new SparseArrayCompat<>();
        sparseArrayCompat.put(sparseArrayCompat.size(), new com.sankuai.waimai.store.drug.search.delegates.b(context, bVar));
        sparseArrayCompat.put(sparseArrayCompat.size(), new c(context, bVar));
        sparseArrayCompat.put(sparseArrayCompat.size(), new a(context, bVar));
        return sparseArrayCompat;
    }

    @Override // com.sankuai.waimai.store.search.ui.result.ISearchTemplateProvider
    public b provideMachAdapterDelegate(Context context, com.sankuai.waimai.store.search.ui.result.b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f82ca7258e8ac298f89c48a39a5ed2a", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f82ca7258e8ac298f89c48a39a5ed2a") : new com.sankuai.waimai.store.drug.search.mach.a(context, bVar);
    }

    @Override // com.sankuai.waimai.store.search.ui.result.ISearchTemplateProvider
    public Map<String, com.sankuai.waimai.store.search.ui.result.mach.prerender.a> provideMachPreRenderActions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "002735f65926f79aa8fb0b19b853cd02", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "002735f65926f79aa8fb0b19b853cd02");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("supermarket-drug-search-result-two-column", new com.sankuai.waimai.store.drug.search.mach.prerenderaction.b());
        hashMap.put("drug-search-activity-quick-filter", new com.sankuai.waimai.store.drug.search.mach.prerenderaction.a());
        return hashMap;
    }

    @Override // com.sankuai.waimai.store.search.ui.result.ISearchTemplateProvider
    public SparseArrayCompat<ITagProcessor> providerMachComponentProcessor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96a9c0d0be3b5c370f01da660ffa3363", RobustBitConfig.DEFAULT_VALUE)) {
            return (SparseArrayCompat) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96a9c0d0be3b5c370f01da660ffa3363");
        }
        SparseArrayCompat<ITagProcessor> sparseArrayCompat = new SparseArrayCompat<>();
        sparseArrayCompat.put(sparseArrayCompat.size(), new NestedScrollerTagProcessor());
        return sparseArrayCompat;
    }

    @Override // com.sankuai.waimai.store.search.ui.result.ISearchTemplateProvider
    public com.sankuai.waimai.mach.render.b providerMachRenderEngine() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36e4e07a42810ffb5fc836c903e5f062", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.render.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36e4e07a42810ffb5fc836c903e5f062") : new e();
    }

    @Override // com.sankuai.waimai.store.search.ui.result.ISearchTemplateProvider
    public Set<String> provideWaterfallTemplateId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3347e76661fd3ea8e4a06d23afbcf6a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3347e76661fd3ea8e4a06d23afbcf6a2");
        }
        HashSet hashSet = new HashSet();
        hashSet.add("supermarket-drug-search-result-two-column");
        return hashSet;
    }
}
