package com.sankuai.meituan.model.datarequest;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.model.NoProguard;
import java.io.Serializable;
/* compiled from: ProGuard */
@NoProguard
/* loaded from: classes4.dex */
public class Query implements Serializable, Cloneable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Long area;
    private long areaGroupId;
    private int areaType;
    private Long cate;
    private long cityId;
    private QueryFilter filter;
    private boolean hasGroup;
    private int hotRecommendType;
    private String hotTag;
    private String hotelStar;
    private String latlng;
    private Long parentCate;
    private String priceRange;
    private Range range;
    private Sort sort;
    private String startendday;
    private long subwayGroupId;
    private Long subwayline;
    private Long subwaystation;
    public static final Sort[] SORTS = {Sort.defaults, Sort.distance, Sort.rating, Sort.start, Sort.solds, Sort.price, Sort.priceDesc};
    public static final Sort[] SORTS_POI_FIFTH = {Sort.defaults, Sort.distance, Sort.rating, Sort.solds};
    public static final Sort[] NO_DISTANCE_SORTS = {Sort.defaults, Sort.rating, Sort.start, Sort.solds, Sort.price, Sort.priceDesc};
    public static final Sort[] SORTS_FOR_ALLTAB = {Sort.defaults, Sort.rating, Sort.distance, Sort.avgPrice, Sort.avgPriceDesc};
    public static final Sort[] AROUNDPOILIST_SORTS = {Sort.smart, Sort.avgscore, Sort.distance, Sort.lowestprice};
    public static final Sort[] AROUNDPOILIST_NO_DISTANCE_SORTS = {Sort.smart, Sort.avgscore, Sort.lowestprice};
    public static Sort[] AROUNDPOILIST_MOVIE_SORTS = {Sort.distance, Sort.avgscore, Sort.lowestprice};

    public Query() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eacbec154eca43ed38c4ded6ec6cf224", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eacbec154eca43ed38c4ded6ec6cf224");
            return;
        }
        this.cate = -1L;
        this.sort = Sort.defaults;
        this.range = null;
        this.hasGroup = true;
        this.parentCate = -1L;
    }

    public Object clone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8fa44622f9621d80f5e4b82a3e9d3139", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8fa44622f9621d80f5e4b82a3e9d3139");
        }
        try {
            Query query = (Query) super.clone();
            if (this.filter != null) {
                query.filter = (QueryFilter) this.filter.clone();
            }
            return query;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* compiled from: ProGuard */
    @NoProguard
    /* loaded from: classes4.dex */
    public enum Sort {
        defaults("defaults"),
        distance("distance"),
        rating("rating"),
        start("start"),
        solds("solds"),
        price("price"),
        priceDesc("priceDesc"),
        avgscore("avgscore"),
        lowestprice("lowestprice"),
        highestprice("highestprice"),
        smart("smart"),
        showPrice("showPrice"),
        marknumbers("marknumbers"),
        avgPrice("avgPrice"),
        avgPriceDesc("avgPriceDesc"),
        starttime("starttime"),
        tourstar("tourstar"),
        sceniclevel("sceniclevel");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        private final String key;

        public static Sort valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6b15ab33473f436507c788905ada0f19", RobustBitConfig.DEFAULT_VALUE) ? (Sort) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6b15ab33473f436507c788905ada0f19") : (Sort) Enum.valueOf(Sort.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Sort[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d1916df3341975b35b917883da9c1b6f", RobustBitConfig.DEFAULT_VALUE) ? (Sort[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d1916df3341975b35b917883da9c1b6f") : (Sort[]) values().clone();
        }

        Sort(String str) {
            Object[] objArr = {r10, Integer.valueOf(r11), str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99fc7f4af4d83bc67f1d69b28961486a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99fc7f4af4d83bc67f1d69b28961486a");
            } else {
                this.key = str;
            }
        }

        public static Sort instanceFromString(String str) {
            Sort[] valuesCustom;
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1c925fda6bff97ceffa9f99a6dd7a7e9", RobustBitConfig.DEFAULT_VALUE)) {
                return (Sort) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1c925fda6bff97ceffa9f99a6dd7a7e9");
            }
            for (Sort sort : valuesCustom()) {
                if (TextUtils.equals(str, sort.getKey())) {
                    return sort;
                }
            }
            return null;
        }

        public final String getKey() {
            return this.key;
        }
    }

    /* compiled from: ProGuard */
    @NoProguard
    /* loaded from: classes4.dex */
    public enum Range {
        one("1000"),
        three("3000"),
        five("5000"),
        ten("10000"),
        all(""),
        unknow("-1");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        private final String key;

        public static Range valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bfc4f362675be12b0cc9ce147184fcc1", RobustBitConfig.DEFAULT_VALUE) ? (Range) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bfc4f362675be12b0cc9ce147184fcc1") : (Range) Enum.valueOf(Range.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Range[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fb1b52a9e6a888ad0439348805d78b71", RobustBitConfig.DEFAULT_VALUE) ? (Range[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fb1b52a9e6a888ad0439348805d78b71") : (Range[]) values().clone();
        }

        Range(String str) {
            Object[] objArr = {r10, Integer.valueOf(r11), str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37fdd465abf88cc85360cf66f10dc301", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37fdd465abf88cc85360cf66f10dc301");
            } else {
                this.key = str;
            }
        }

        public static Range instanceFromStringName(String str) {
            Range[] valuesCustom;
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a24617c58900e41565c3086c8e96bd1f", RobustBitConfig.DEFAULT_VALUE)) {
                return (Range) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a24617c58900e41565c3086c8e96bd1f");
            }
            for (Range range : valuesCustom()) {
                if (TextUtils.equals(str, range.name())) {
                    return range;
                }
            }
            return all;
        }

        public static Range instanceFromString(String str) {
            Range[] valuesCustom;
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d2f5ed9a744d82fef1591ea44da87d61", RobustBitConfig.DEFAULT_VALUE)) {
                return (Range) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d2f5ed9a744d82fef1591ea44da87d61");
            }
            for (Range range : valuesCustom()) {
                if (TextUtils.equals(str, range.getKey())) {
                    return range;
                }
            }
            return all;
        }

        public final String getKey() {
            return this.key;
        }
    }
}
