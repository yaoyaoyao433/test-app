package com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.submit.model.CyclePurchaseCalculateInfo;
import com.sankuai.waimai.bussiness.order.confirm.helper.OrderGsonTypeAdapter;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.OrderFoodOutput;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.OrderFoodOutputAttr;
import com.sankuai.waimai.foundation.core.exception.a;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.b;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttrList;
import com.sankuai.waimai.platform.domain.core.order.ComboProduct;
import com.tencent.connect.common.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class OrderFoodInput implements Serializable {
    public static final int COMBO_TYPE_COMBO = 1;
    public static final int COMBO_TYPE_FOOD = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_extra")
    @JsonAdapter(OrderGsonTypeAdapter.StringJsonDeserializer.class)
    public Object activityExtra;
    @SerializedName("activity_tag")
    public String activityTag;
    @SerializedName(alternate = {"add_price_attrs"}, value = "premium_attrs")
    public List<GoodsAttr> addPriceAttrs;
    @SerializedName(alternate = {"goods_attr"}, value = "attrs")
    public List<Long> attrs;
    @SerializedName("backup_food_list")
    public List<Map<String, Object>> backupFoodList;
    @SerializedName("cart_id")
    public int cartId;
    @SerializedName("combo_products")
    @JsonAdapter(ComboProduct.SubmitNetInputTypeAdaptor.class)
    public List<ComboProduct> comboProducts;
    @SerializedName("count")
    public int count;
    public String groupChatShare;
    @SerializedName(alternate = {"sku_id"}, value = "id")
    public long id;
    @SerializedName("each_nper_count")
    public int mEachNperCount;
    @SerializedName("name")
    public String name;
    @SerializedName(Constants.PACKAGE_ID)
    public int packageId;
    @SerializedName("product_extra_info")
    public String productExtraInfo;
    public int seckill;
    @SerializedName("sfc")
    public String sfc;
    @SerializedName("spu_attrs")
    public List<OrderFoodOutputAttr> spuAttrs;
    @SerializedName("spu_id")
    public long spuId;

    public OrderFoodInput() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc00d01094e41f1e43cc09054974c40a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc00d01094e41f1e43cc09054974c40a");
        } else {
            this.addPriceAttrs = new ArrayList();
        }
    }

    public OrderFoodInput(@NonNull OrderFoodOutput orderFoodOutput) {
        Object[] objArr = {orderFoodOutput};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3299973cedd66f8387b9ff4291376ae6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3299973cedd66f8387b9ff4291376ae6");
            return;
        }
        this.addPriceAttrs = new ArrayList();
        this.spuId = orderFoodOutput.spuId;
        this.id = orderFoodOutput.id;
        this.count = orderFoodOutput.count;
        this.cartId = orderFoodOutput.cartId;
        this.packageId = orderFoodOutput.packageId;
        this.name = orderFoodOutput.name;
        if (orderFoodOutput.attrs != null) {
            this.attrs = new ArrayList();
            for (int i = 0; i < orderFoodOutput.attrs.size(); i++) {
                if (orderFoodOutput.attrs.get(i) != null) {
                    this.attrs.add(Long.valueOf(orderFoodOutput.attrs.get(i).id));
                }
            }
            if (b.a(orderFoodOutput.attrs)) {
                this.spuAttrs = new ArrayList();
                this.spuAttrs.addAll(orderFoodOutput.attrs);
            }
        }
        if (orderFoodOutput.addPriceAttrs != null) {
            this.addPriceAttrs = new ArrayList();
            for (int i2 = 0; i2 < orderFoodOutput.addPriceAttrs.size(); i2++) {
                if (orderFoodOutput.addPriceAttrs.get(i2) != null) {
                    this.addPriceAttrs.add(orderFoodOutput.addPriceAttrs.get(i2));
                }
            }
        }
        if (orderFoodOutput.comboType == 1 || orderFoodOutput.comboType == 2) {
            this.comboProducts = orderFoodOutput.mComboProduct;
        }
        this.activityTag = orderFoodOutput.activityTag;
        this.activityExtra = orderFoodOutput.activityExtra;
        this.mEachNperCount = orderFoodOutput.eachNperCount;
        this.productExtraInfo = orderFoodOutput.productExtraInfo;
        this.groupChatShare = orderFoodOutput.groupChatShare;
        this.seckill = orderFoodOutput.getSeckill();
        this.sfc = orderFoodOutput.sfc;
    }

    public OrderFoodInput(@NonNull CyclePurchaseCalculateInfo.FoodList foodList) {
        Object[] objArr = {foodList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "149dc129132a45a724b4f70b0c422739", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "149dc129132a45a724b4f70b0c422739");
            return;
        }
        this.addPriceAttrs = new ArrayList();
        this.id = parseLong(foodList.mSkuId, -1L);
        this.count = foodList.mCount;
        this.spuId = parseLong(foodList.mSpuId, -1L);
        this.cartId = 0;
        this.activityTag = aa.a(foodList.mActivityTag) ? "" : foodList.mActivityTag;
        this.mEachNperCount = foodList.mEachNperCount;
        if (b.b(foodList.attrs)) {
            return;
        }
        this.attrs = new ArrayList();
        for (GoodsAttrList goodsAttrList : foodList.attrs) {
            if (goodsAttrList != null && !b.b(goodsAttrList.values) && b.a(goodsAttrList.values, 0) != null) {
                this.attrs.add(Long.valueOf(((GoodsAttr) b.a(goodsAttrList.values, 0)).id));
            }
        }
    }

    private long parseLong(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "231b2add897ba9a56c534be388a0f494", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "231b2add897ba9a56c534be388a0f494")).longValue();
        }
        try {
            return Long.parseLong(str);
        } catch (Exception e) {
            a.b(e);
            return j;
        }
    }
}
