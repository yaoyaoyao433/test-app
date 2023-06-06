package com.sankuai.waimai.business.search.model;

import android.support.annotation.VisibleForTesting;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.datatype.CategoryFilterData;
import com.sankuai.waimai.business.search.datatype.FilterNoResultRemindInfoData;
import com.sankuai.waimai.business.search.datatype.ForbiddenInfo;
import com.sankuai.waimai.business.search.datatype.GuideQueryCard;
import com.sankuai.waimai.business.search.datatype.GuideQueryData;
import com.sankuai.waimai.business.search.datatype.NoResultRemindInfoData;
import com.sankuai.waimai.business.search.datatype.ProductPoi;
import com.sankuai.waimai.business.search.datatype.QueryCorrect;
import com.sankuai.waimai.business.search.datatype.RecommendCard;
import com.sankuai.waimai.business.search.datatype.RecommendPoiListTitle;
import com.sankuai.waimai.business.search.datatype.SearchThemeSlideData;
import com.sankuai.waimai.pouch.model.PouchDynamicAd;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;
    @VisibleForTesting
    public Map<String, Class<?>> b;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c4b4e498716c8fb9feb6fad7e20ae74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c4b4e498716c8fb9feb6fad7e20ae74");
            return;
        }
        this.b = new HashMap();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bc58dd0ce8eb3bf59ffe5863ad88c453", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bc58dd0ce8eb3bf59ffe5863ad88c453");
        } else {
            this.b.put("wm_search_forbidden", ForbiddenInfo.class);
            this.b.put("wm_search_header_no_result", com.sankuai.waimai.business.search.datatype.d.class);
            this.b.put("wm_search_fullpage_no_result", NoResultRemindInfoData.class);
            this.b.put("wm_search_query_correct", QueryCorrect.class);
            this.b.put("wm_search_guide_query", GuideQueryData.class);
            this.b.put("wm_search_filter_no_result", FilterNoResultRemindInfoData.class);
            this.b.put("wm_search_coupon_card", GlobalSearchCouponCard.class);
            this.b.put("wm_search_guide_query_template", GuideQueryCard.class);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c6bfa2d047732acbbf57f218bfea664e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c6bfa2d047732acbbf57f218bfea664e");
        } else {
            this.b.put("wm_search_brand_ad_template", com.sankuai.waimai.business.search.datatype.g.class);
            this.b.put("wm_search_theme_slide_template", SearchThemeSlideData.class);
            this.b.put("wm_nox_template_pouch", PouchDynamicAd.class);
            this.b.put("wm_search_category2_filter_template", CategoryFilterData.class);
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "12f02b8ab98c8db82a820cb5e013dff7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "12f02b8ab98c8db82a820cb5e013dff7");
        } else {
            this.b.put("waimai-search-feed-intelligence-1", ProductPoi.class);
            this.b.put("waimai-search-feed-intelligence-2", ProductPoi.class);
            this.b.put("waimai-search-medicine-feed-1", ProductPoi.class);
            this.b.put("waimai-search-medicine-feed-2", ProductPoi.class);
            this.b.put("waimai-search-supermarket-feed-1", ProductPoi.class);
            this.b.put("waimai-search-supermarket-feed-2", ProductPoi.class);
            this.b.put("product_mode", ProductPoi.class);
            this.b.put("productlist_module_feed_739", ProductPoi.class);
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "aa53b232ff2ee0854e17314c8407490a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "aa53b232ff2ee0854e17314c8407490a");
        } else {
            this.b.put("wm_search_recommend_header", RecommendPoiListTitle.class);
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "f8648c92389b4f0d3f439bdc451cdc90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "f8648c92389b4f0d3f439bdc451cdc90");
        } else {
            this.b.put("wm_search_label_rank", RecommendCard.class);
            this.b.put("wm_search_query_recommend", RecommendCard.class);
            this.b.put("wm_search_poi_product_recommend", RecommendCard.class);
        }
        Object[] objArr7 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect7 = a;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "25fd94e4683291dafd849a2ce0dca274", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "25fd94e4683291dafd849a2ce0dca274");
            return;
        }
        this.b.put("mach_waimai-search-labelrank-style-8", RecommendCard.class);
        this.b.put("mach_waimai-search-business-direct-style-12", com.sankuai.waimai.business.search.datatype.a.class);
        this.b.put("mach_waimai-search-queryrecommend-style-10", RecommendCard.class);
    }
}
