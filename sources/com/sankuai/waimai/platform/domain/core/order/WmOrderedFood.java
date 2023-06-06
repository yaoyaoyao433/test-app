package com.sankuai.waimai.platform.domain.core.order;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class WmOrderedFood implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_tag")
    public String activityTag;
    @SerializedName(alternate = {"attrs"}, value = "goods_attr")
    private GoodsAttr[] attrIds;
    @SerializedName("cart_id")
    private int cartId;
    @SerializedName("combo_products")
    public List<ComboProduct> comboProducts;
    @SerializedName("count")
    public int count;
    @SerializedName("group_chat_share")
    public String groupChatShare;
    @SerializedName("plus_count")
    public int plusCount;
    @SerializedName("product_extra_info")
    public String productExtraInfo;
    @SerializedName("seckill")
    public int seckill;
    @SerializedName(alternate = {"id"}, value = "sku_id")
    public long skuId;
    @SerializedName("spu_id")
    public long spuId;

    public WmOrderedFood() {
    }

    public WmOrderedFood(long j, long j2, GoodsAttr[] goodsAttrArr, int i, int i2, int i3, String str) {
        Object[] objArr = {new Long(j), new Long(j2), goodsAttrArr, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88ab00363878a8ebc6c775bd79897aff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88ab00363878a8ebc6c775bd79897aff");
            return;
        }
        this.count = i;
        this.cartId = i2;
        this.plusCount = i3;
        this.spuId = j;
        this.skuId = j2;
        this.activityTag = str;
        if (goodsAttrArr == null || goodsAttrArr.length <= 0) {
            return;
        }
        this.attrIds = new GoodsAttr[goodsAttrArr.length];
        for (int i4 = 0; i4 < goodsAttrArr.length; i4++) {
            if (goodsAttrArr[i4] != null) {
                this.attrIds[i4] = goodsAttrArr[i4].m15clone();
            }
        }
    }

    public WmOrderedFood(long j, long j2, GoodsAttr[] goodsAttrArr, int i, int i2, int i3, String str, String str2) {
        Object[] objArr = {new Long(j), new Long(j2), goodsAttrArr, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8a78a94e5921adfe15e82f61098c405", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8a78a94e5921adfe15e82f61098c405");
            return;
        }
        this.count = i;
        this.cartId = i2;
        this.plusCount = i3;
        this.spuId = j;
        this.skuId = j2;
        this.activityTag = str;
        if (goodsAttrArr != null && goodsAttrArr.length > 0) {
            this.attrIds = new GoodsAttr[goodsAttrArr.length];
            for (int i4 = 0; i4 < goodsAttrArr.length; i4++) {
                if (goodsAttrArr[i4] != null) {
                    this.attrIds[i4] = goodsAttrArr[i4].m15clone();
                }
            }
        }
        this.productExtraInfo = str2;
    }

    public String getActivityTag() {
        return this.activityTag;
    }

    public void setActivityTag(String str) {
        this.activityTag = str;
    }

    public long getSpuId() {
        return this.spuId;
    }

    public void setSpuId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4bf30de4ca1d6efa0cea0e470a56f83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4bf30de4ca1d6efa0cea0e470a56f83");
        } else {
            this.spuId = j;
        }
    }

    public void setSkuId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fddbf6261732293a802075a2fba41910", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fddbf6261732293a802075a2fba41910");
        } else {
            this.skuId = j;
        }
    }

    public long getSkuId() {
        return this.skuId;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public int getCartId() {
        return this.cartId;
    }

    public void setCartId(int i) {
        this.cartId = i;
    }

    public GoodsAttr[] getAttrIds() {
        return this.attrIds;
    }

    public void setAttrIds(GoodsAttr[] goodsAttrArr) {
        this.attrIds = goodsAttrArr;
    }

    public boolean isSameAttrs(GoodsAttr[] goodsAttrArr) {
        Object[] objArr = {goodsAttrArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b63bba9133c95ec9b60266e08acf78bb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b63bba9133c95ec9b60266e08acf78bb")).booleanValue();
        }
        if ((this.attrIds == null || this.attrIds.length == 0) && (goodsAttrArr == null || goodsAttrArr.length == 0)) {
            return true;
        }
        if (this.attrIds == null || goodsAttrArr == null) {
            return false;
        }
        return Arrays.equals(this.attrIds, goodsAttrArr);
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ffc6b6436911bb602c9ca32b61209f4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ffc6b6436911bb602c9ca32b61209f4")).booleanValue();
        }
        if (obj instanceof WmOrderedFood) {
            WmOrderedFood wmOrderedFood = (WmOrderedFood) obj;
            boolean z = wmOrderedFood.spuId == this.spuId && wmOrderedFood.skuId == this.skuId && isSameAttrs(wmOrderedFood.attrIds);
            return (this.comboProducts == null || this.comboProducts.size() <= 0 || wmOrderedFood.comboProducts == null || wmOrderedFood.comboProducts.size() <= 0) ? z : z && this.comboProducts.equals(wmOrderedFood.comboProducts);
        }
        return false;
    }

    @Nullable
    private static WmOrderedFood fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6e260a1207b769f6890005d2ce495636", RobustBitConfig.DEFAULT_VALUE)) {
            return (WmOrderedFood) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6e260a1207b769f6890005d2ce495636");
        }
        if (jSONObject == null) {
            return null;
        }
        WmOrderedFood wmOrderedFood = new WmOrderedFood();
        wmOrderedFood.count = jSONObject.optInt("count");
        wmOrderedFood.cartId = jSONObject.optInt("cart_id");
        JSONArray optJSONArray = jSONObject.optJSONArray("attrs");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            wmOrderedFood.attrIds = (GoodsAttr[]) GoodsAttr.fromJsonArray(optJSONArray).toArray(new GoodsAttr[0]);
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("package_combo_item_list");
        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray2.length(); i++) {
                try {
                    ComboProduct comboProduct = (ComboProduct) new Gson().fromJson(optJSONArray2.optJSONObject(i).toString(), (Class<Object>) ComboProduct.class);
                    if (comboProduct != null) {
                        arrayList.add(comboProduct);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            wmOrderedFood.comboProducts = arrayList;
        }
        wmOrderedFood.skuId = r.a(jSONObject.optString("sku_id"), 0L);
        wmOrderedFood.spuId = r.a(jSONObject.optString("spu_id"), 0L);
        wmOrderedFood.activityTag = jSONObject.optString("activity_tag");
        wmOrderedFood.productExtraInfo = jSONObject.optString("activity_tag");
        return wmOrderedFood;
    }

    @NonNull
    public static List<WmOrderedFood> fromJsonArray(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "376d1e1ebf621d6faa95450c7571f760", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "376d1e1ebf621d6faa95450c7571f760");
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            WmOrderedFood fromJson = fromJson(jSONArray.optJSONObject(i));
            if (fromJson != null) {
                arrayList.add(fromJson);
            }
        }
        return arrayList;
    }
}
