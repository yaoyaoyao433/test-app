package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ProductItemEntity {
    public static final int PRODUCT_STATUS_NORMAL = 0;
    public static final int PRODUCT_STATUS_SOLD_OUT = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("food_recommend_type")
    public int foodRecommendType;
    @SerializedName("has_videos")
    public int hasVideos;
    public boolean isExposed;
    @SerializedName("hand_price_info")
    public HandPriceInfo mHandPriceInfo;
    @SerializedName("label_on_product_picture")
    public LabelOnPicture mLabelOnPicture;
    @SerializedName("flash_sale_label")
    public String mLimitedTimeSpikeLabeldUrl;
    @SerializedName("month_sales")
    public int monthSale;
    @SerializedName("month_saled_content")
    public String monthSaledContent;
    public com.sankuai.waimai.store.search.statistics.f nodeProduct;
    @SerializedName("original_price")
    public double oriPrice;
    @SerializedName("product_price_desc")
    public String paotuiPriceDesc;
    @SerializedName("picture")
    public String picture;
    @SerializedName("wm_poi_id")
    public long poiId;
    @SerializedName("praise_content")
    public String praiseContent;
    @SerializedName("pre_sale")
    public int preSale;
    @SerializedName("price")
    public double price;
    @SerializedName("product_spu_id")
    public long productId;
    @SerializedName("product_name")
    public String productName;
    @SerializedName("product_recommend_label")
    public String productRecommendLabel;
    @SerializedName("product_status")
    public int productStatus;
    @SerializedName("promotion_info")
    public String promotionInfo;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String restaurantScheme;
    @SerializedName("product_sale_out_view")
    public SaleOutView saleOutView;
    @SerializedName("product_sku_id")
    public long skuId;
    @SerializedName("start_price_text")
    public String startPriceText;

    public ProductItemEntity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e2fef44e02c9fc904790d209e942efc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e2fef44e02c9fc904790d209e942efc");
            return;
        }
        this.isExposed = false;
        this.nodeProduct = new com.sankuai.waimai.store.search.statistics.f();
    }

    public boolean hasVideos() {
        return this.hasVideos == 1;
    }
}
