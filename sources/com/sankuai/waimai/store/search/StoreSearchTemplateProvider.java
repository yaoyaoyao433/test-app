package com.sankuai.waimai.store.search;

import android.content.Context;
import android.support.v4.util.SparseArrayCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.ITagProcessor;
import com.sankuai.waimai.store.search.adapterdelegates.b;
import com.sankuai.waimai.store.search.model.GuessRecommend;
import com.sankuai.waimai.store.search.model.NoResultNonDeliveryEntity;
import com.sankuai.waimai.store.search.model.NoResultRemindInfoData;
import com.sankuai.waimai.store.search.model.NonDeliveryV732Info;
import com.sankuai.waimai.store.search.model.OverPageFilterGroup;
import com.sankuai.waimai.store.search.model.PoiEntity;
import com.sankuai.waimai.store.search.model.QueryCorrect;
import com.sankuai.waimai.store.search.model.QuickFilterCard;
import com.sankuai.waimai.store.search.model.SGActivityFilterEntity;
import com.sankuai.waimai.store.search.model.SGSearchSortFilterEntity;
import com.sankuai.waimai.store.search.model.SearchLocation;
import com.sankuai.waimai.store.search.model.SearchResultBanner;
import com.sankuai.waimai.store.search.model.SecondFilterCard;
import com.sankuai.waimai.store.search.model.SecondSearchEntity;
import com.sankuai.waimai.store.search.model.V732PaotuiEntranceData;
import com.sankuai.waimai.store.search.model.f;
import com.sankuai.waimai.store.search.model.g;
import com.sankuai.waimai.store.search.template.nonlbs.c;
import com.sankuai.waimai.store.search.template.nonlbs.d;
import com.sankuai.waimai.store.search.template.poicate.i;
import com.sankuai.waimai.store.search.ui.result.ISearchTemplateProvider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class StoreSearchTemplateProvider implements ISearchTemplateProvider {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.store.search.ui.result.ISearchTemplateProvider
    public SparseArrayCompat<ITagProcessor> providerMachComponentProcessor() {
        return null;
    }

    @Override // com.sankuai.waimai.store.search.ui.result.ISearchTemplateProvider
    public Map<String, Class<?>> provideDeserializeModels() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee24f04268bad160ac3c7ebcc23f291e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee24f04268bad160ac3c7ebcc23f291e");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("wm_search_poi_template_radical", PoiEntity.class);
        hashMap.put("wm_search_poi_template", PoiEntity.class);
        hashMap.put("wm_search_category_template_radical", PoiEntity.class);
        hashMap.put("wm_search_category_template", PoiEntity.class);
        hashMap.put("wm_search_brand_ad_template", PoiEntity.class);
        hashMap.put("wm_search_recommend_poi_template", PoiEntity.class);
        hashMap.put("wm_search_feed_product_750", f.class);
        hashMap.put("wm_search_feed_product_template", f.class);
        hashMap.put("sg_brand_sale_business_direct", g.class);
        hashMap.put("new_wm_search_direct_card", SearchResultBanner.class);
        hashMap.put("sg_search_double_card_business_directcard", SearchResultBanner.class);
        hashMap.put("sg_search_carousel_card_business_directcard", SearchResultBanner.class);
        hashMap.put("wm_search_header_no_result", NoResultNonDeliveryEntity.class);
        hashMap.put("wm_search_fullpage_no_result", NoResultRemindInfoData.class);
        hashMap.put("wm_shangou_search_sort_filter_bar", SGSearchSortFilterEntity.class);
        hashMap.put("searchPage_addressBar", SearchLocation.class);
        hashMap.put("sg_search_no_result_recommend", PoiEntity.class);
        hashMap.put("wm_shangou_search_over_page_filter", OverPageFilterGroup.class);
        hashMap.put("wm_shangou_search_over_page_search", OverPageFilterGroup.class);
        hashMap.put("shangou_only_nondelivery_poi_732_template", NonDeliveryV732Info.class);
        hashMap.put("wm_search_recommend_header", GuessRecommend.class);
        hashMap.put("wm_search_query_correct", QueryCorrect.class);
        hashMap.put("sg_search_cascade_product_template", f.class);
        hashMap.put("wm_shangou_search_over_page_filter_cascade", OverPageFilterGroup.class);
        hashMap.put("wm_shangou_search_over_page_search_cascade", OverPageFilterGroup.class);
        hashMap.put("supermarket-search-paotui-common", V732PaotuiEntranceData.class);
        hashMap.put("supermarket-search-paotui-poi", V732PaotuiEntranceData.class);
        hashMap.put("supermarket-search-user-promotion-filter", SGActivityFilterEntity.class);
        hashMap.put("supermarket-search-product", f.class);
        hashMap.put("supermarket-search-product-v2", f.class);
        hashMap.put("supermarket-search-product-flower", f.class);
        hashMap.put("supermarket-search-poi", PoiEntity.class);
        hashMap.put("supermarket-search-second-filter", SecondFilterCard.class);
        hashMap.put("supermarket-over-page-filter", OverPageFilterGroup.class);
        hashMap.put("supermarket-over-page-search", OverPageFilterGroup.class);
        hashMap.put("supermarket-search-drop-down-filter", QuickFilterCard.class);
        hashMap.put("supermarket-search-second-search", SecondSearchEntity.class);
        hashMap.put("supermarket-search-second-text-search", SecondSearchEntity.class);
        return hashMap;
    }

    @Override // com.sankuai.waimai.store.search.ui.result.ISearchTemplateProvider
    public SparseArrayCompat<b> provideNativeTemplates(Context context, String str, com.sankuai.waimai.store.search.ui.result.b bVar) {
        Object[] objArr = {context, str, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10ca499e57d269ff036599cbf11a3056", RobustBitConfig.DEFAULT_VALUE)) {
            return (SparseArrayCompat) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10ca499e57d269ff036599cbf11a3056");
        }
        SparseArrayCompat<b> sparseArrayCompat = new SparseArrayCompat<>();
        sparseArrayCompat.put(0, new com.sankuai.waimai.store.search.template.spu.a(context));
        sparseArrayCompat.put(1, new com.sankuai.waimai.store.search.template.poicate.f(context));
        sparseArrayCompat.put(2, new com.sankuai.waimai.store.search.template.poicate.b(context));
        sparseArrayCompat.put(3, new i(context));
        sparseArrayCompat.put(4, new com.sankuai.waimai.store.search.template.poicate.g(context));
        sparseArrayCompat.put(5, new com.sankuai.waimai.store.search.template.filterbar.a(context));
        sparseArrayCompat.put(6, new com.sankuai.waimai.store.search.template.overpagefilter.a(context));
        sparseArrayCompat.put(7, new com.sankuai.waimai.store.search.template.overpagesearch.a(context));
        sparseArrayCompat.put(8, new com.sankuai.waimai.store.search.template.hotrank.a(context));
        sparseArrayCompat.put(9, new com.sankuai.waimai.store.search.template.brand.a(context));
        sparseArrayCompat.put(10, new com.sankuai.waimai.store.search.template.banner.a(context));
        sparseArrayCompat.put(11, new com.sankuai.waimai.store.search.template.guesslike.a(context));
        sparseArrayCompat.put(12, new com.sankuai.waimai.store.search.template.doublecard.a(context));
        sparseArrayCompat.put(13, new com.sankuai.waimai.store.search.template.carouselcard.a(context));
        sparseArrayCompat.put(14, new com.sankuai.waimai.store.search.template.other.a(context));
        sparseArrayCompat.put(15, new c(context));
        sparseArrayCompat.put(16, new com.sankuai.waimai.store.search.template.nonlbs.b(context));
        sparseArrayCompat.put(17, new com.sankuai.waimai.store.search.template.correctkey.a(context));
        sparseArrayCompat.put(18, new d(context, str));
        sparseArrayCompat.put(19, new com.sankuai.waimai.store.search.template.location.a(context));
        sparseArrayCompat.put(20, new com.sankuai.waimai.store.search.template.noresult.a(context));
        sparseArrayCompat.put(21, new com.sankuai.waimai.store.search.template.noresult.b(context));
        sparseArrayCompat.put(22, new com.sankuai.waimai.store.search.template.waterfallspu.a(context));
        sparseArrayCompat.put(23, new com.sankuai.waimai.store.search.template.overpagefilter.c(context));
        sparseArrayCompat.put(24, new com.sankuai.waimai.store.search.template.overpagesearch.b(context));
        return sparseArrayCompat;
    }

    @Override // com.sankuai.waimai.store.search.ui.result.ISearchTemplateProvider
    public b provideMachAdapterDelegate(Context context, com.sankuai.waimai.store.search.ui.result.b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b91e9e4606ec0ac5219fc5e29beaee5", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b91e9e4606ec0ac5219fc5e29beaee5") : new com.sankuai.waimai.store.search.template.machcontainer.a(context);
    }

    @Override // com.sankuai.waimai.store.search.ui.result.ISearchTemplateProvider
    public Map<String, com.sankuai.waimai.store.search.ui.result.mach.prerender.a> provideMachPreRenderActions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "696c3211648a1c5a9b2f67b2b7984aa3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "696c3211648a1c5a9b2f67b2b7984aa3");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("supermarket-search-paotui-common", new com.sankuai.waimai.store.search.mach.paotui.b());
        hashMap.put("supermarket-search-paotui-poi", new com.sankuai.waimai.store.search.mach.paotui.a());
        hashMap.put("supermarket-search-user-promotion-filter", new com.sankuai.waimai.store.search.mach.promotionfilter.a());
        hashMap.put("supermarket-search-product", new com.sankuai.waimai.store.search.mach.spu.b("supermarket-search-product"));
        hashMap.put("supermarket-search-product-v2", new com.sankuai.waimai.store.search.mach.spu.b("supermarket-search-product-v2"));
        hashMap.put("supermarket-search-product-flower", new com.sankuai.waimai.store.search.mach.spu.b("supermarket-search-product-flower"));
        hashMap.put("supermarket-search-poi", new com.sankuai.waimai.store.search.mach.poi.b());
        hashMap.put("supermarket-search-second-filter", new com.sankuai.waimai.store.search.mach.secondfilter.b());
        hashMap.put("supermarket-search-drop-down-filter", new com.sankuai.waimai.store.search.mach.dropdownfilter.b());
        hashMap.put("supermarket-search-second-search", new com.sankuai.waimai.store.search.mach.secondsearch.a());
        return hashMap;
    }

    @Override // com.sankuai.waimai.store.search.ui.result.ISearchTemplateProvider
    public com.sankuai.waimai.mach.render.b providerMachRenderEngine() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d7014b3a3135f381db6513ed3ecc454", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.render.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d7014b3a3135f381db6513ed3ecc454") : new com.sankuai.waimai.mach.render.b();
    }

    @Override // com.sankuai.waimai.store.search.ui.result.ISearchTemplateProvider
    public Set<String> provideWaterfallTemplateId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "afb24d7856b98083b7cdb3fc2f00213d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "afb24d7856b98083b7cdb3fc2f00213d");
        }
        HashSet hashSet = new HashSet();
        hashSet.add("sg_search_cascade_product_template");
        hashSet.add("wm_shangou_search_over_page_filter_cascade");
        hashSet.add("wm_shangou_search_over_page_search_cascade");
        return hashSet;
    }
}
