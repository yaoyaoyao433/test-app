package com.sankuai.waimai.store.mrn.shopcartbridge;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class AddProdctResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("foods")
    private List<FoodsBean> foods;
    @SerializedName("poi_id")
    private long poiId;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    private String poiIdStr;

    public void setFoods(List<FoodsBean> list) {
        this.foods = list;
    }

    public void setPoiId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30b74f90f2f9eac9af450d670fbbc88c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30b74f90f2f9eac9af450d670fbbc88c");
        } else {
            this.poiId = j;
        }
    }

    public void setPoiIdStr(String str) {
        this.poiIdStr = str;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class FoodsBean {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("attrs")
        private List<GoodsAttr> attrs;
        @SerializedName("count")
        private int count;
        @SerializedName("description")
        private String description;
        @SerializedName("min_order_count")
        private int minOrderCount;
        @SerializedName("name")
        private String name;
        @SerializedName("original_price")
        private double originalPrice;
        @SerializedName("picture")
        private String picture;
        @SerializedName("price")
        private double price;
        @SerializedName("sku_id")
        private long skuId;
        @SerializedName("spec")
        private String spec;
        @SerializedName("spu_id")
        private long spu_id;
        @SerializedName("tag_id")
        private String tagId;

        public void setSpu_id(long j) {
            this.spu_id = j;
        }

        public void setCount(int i) {
            this.count = i;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setPrice(double d) {
            Object[] objArr = {Double.valueOf(d)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7bf229a7b59f2e2a4fbc4e558547227", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7bf229a7b59f2e2a4fbc4e558547227");
            } else {
                this.price = d;
            }
        }

        public void setOriginalPrice(double d) {
            Object[] objArr = {Double.valueOf(d)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de4a55dc3282334c6474af2bb6071e68", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de4a55dc3282334c6474af2bb6071e68");
            } else {
                this.originalPrice = d;
            }
        }

        public void setPicture(String str) {
            this.picture = str;
        }

        public void setMinOrderCount(int i) {
            this.minOrderCount = i;
        }

        public void setSkuId(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02a4150ec565bd1376400e6223ff914e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02a4150ec565bd1376400e6223ff914e");
            } else {
                this.skuId = j;
            }
        }

        public void setSpec(String str) {
            this.spec = str;
        }

        public void setDescription(String str) {
            this.description = str;
        }

        public void setTagId(String str) {
            this.tagId = str;
        }

        public void setAttrs(List<GoodsAttr> list) {
            this.attrs = list;
        }
    }
}
