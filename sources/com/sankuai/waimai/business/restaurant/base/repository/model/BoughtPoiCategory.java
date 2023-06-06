package com.sankuai.waimai.business.restaurant.base.repository.model;

import android.support.annotation.Keep;
import android.support.constraint.R;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.domain.core.poi.IPoiItem;
import com.sankuai.waimai.platform.domain.core.shop.PoiCategory;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class BoughtPoiCategory extends PoiCategory {
    public static final String TAGCODE = "BoughtPoiCategory";
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("orderlist_his")
    public List<PoiBoughtItem> boughtList;
    @SerializedName("tag")
    public String tag;
    @SerializedName("tag_icon")
    public String tagIcon;
    @SerializedName("tag_name")
    public String tagName;
    @SerializedName("tag_sequence")
    public int tagSequence;

    @Override // com.sankuai.waimai.platform.domain.core.shop.PoiCategory
    public boolean isEmpty() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "687c5ef34bc3b71e398a48b55ea87eb1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "687c5ef34bc3b71e398a48b55ea87eb1")).booleanValue() : com.sankuai.waimai.foundation.utils.b.b(this.boughtList);
    }

    @Override // com.sankuai.waimai.platform.domain.core.shop.PoiCategory
    public String getTagName() {
        return this.tagName;
    }

    @Override // com.sankuai.waimai.platform.domain.core.shop.PoiCategory
    public String getTagIcon() {
        return this.tagIcon;
    }

    @Override // com.sankuai.waimai.platform.domain.core.shop.PoiCategory
    public int getTagSequence() {
        return this.tagSequence;
    }

    @Override // com.sankuai.waimai.platform.domain.core.shop.PoiCategory
    public String getTagCode() {
        return this.tag;
    }

    @Override // com.sankuai.waimai.platform.domain.core.shop.PoiCategory
    public List<? extends IPoiItem> getItemList() {
        return this.boughtList;
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95d4c4431feaf6f2f442a71c138a5303", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95d4c4431feaf6f2f442a71c138a5303");
            return;
        }
        this.tag = jSONObject.optString("tag");
        if (TextUtils.isEmpty(this.tag)) {
            this.tag = "BoughtPoiCategory";
        }
        this.tagName = jSONObject.optString("tag_name");
        this.tagIcon = jSONObject.optString("tag_icon");
        this.tagSequence = jSONObject.optInt("tag_sequence");
        this.boughtList = parseOrderList(jSONObject);
    }

    private ArrayList<PoiBoughtItem> parseOrderList(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject2 = jSONObject;
        Object[] objArr = {jSONObject2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bdd66897e3ac927849a7279d8b2f3627", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bdd66897e3ac927849a7279d8b2f3627");
        }
        ArrayList<PoiBoughtItem> arrayList = new ArrayList<>();
        try {
            JSONArray optJSONArray = jSONObject2.optJSONArray("orderlist_his");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int i = 0;
                while (i < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    PoiBoughtItem poiBoughtItem = new PoiBoughtItem();
                    poiBoughtItem.setTag(this.tag);
                    poiBoughtItem.orderId = optJSONObject.optLong("order_id");
                    poiBoughtItem.orderTime = optJSONObject.optLong("order_time");
                    poiBoughtItem.total = optJSONObject.optDouble("total");
                    poiBoughtItem.latitude = optJSONObject.optInt(Constants.PRIVACY.KEY_LATITUDE);
                    poiBoughtItem.longitude = optJSONObject.optInt(Constants.PRIVACY.KEY_LONGITUDE);
                    StringBuilder sb = new StringBuilder();
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("foodlist");
                    ArrayList<OrderedFood> arrayList2 = new ArrayList<>();
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < optJSONArray2.length()) {
                        JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                        OrderedFood orderedFood = new OrderedFood();
                        int i4 = i3;
                        orderedFood.setSpuId(optJSONObject2.optLong("spu_id"));
                        orderedFood.setSkuId(optJSONObject2.optLong("id"));
                        orderedFood.setName(optJSONObject2.optString("name"));
                        orderedFood.setCount(optJSONObject2.optInt("count"));
                        orderedFood.setSubTotal(optJSONObject2.optString("sub_total"));
                        orderedFood.setCartId(optJSONObject2.optInt("cart_id"));
                        orderedFood.setSpec(optJSONObject2.optString("spec"));
                        orderedFood.setActivityTag(jSONObject2.optString("activity_tag"));
                        orderedFood.setPrice(optJSONObject2.optDouble("price"));
                        orderedFood.setOriginPrice(optJSONObject2.optDouble("original_price"));
                        sb.append(orderedFood.getName());
                        StringBuilder sb2 = new StringBuilder();
                        if (!TextUtils.isEmpty(orderedFood.getSpec())) {
                            sb2.append(orderedFood.getSpec());
                        }
                        JSONArray optJSONArray3 = optJSONObject2.optJSONArray("attrs");
                        if (optJSONArray3 == null || optJSONArray3.length() <= 0) {
                            jSONArray = optJSONArray;
                            jSONArray2 = optJSONArray2;
                        } else {
                            int length = optJSONArray3.length();
                            GoodsAttr[] goodsAttrArr = new GoodsAttr[length];
                            int i5 = 0;
                            while (i5 < length) {
                                JSONObject jSONObject3 = optJSONArray3.getJSONObject(i5);
                                JSONArray jSONArray3 = optJSONArray;
                                GoodsAttr goodsAttr = new GoodsAttr();
                                JSONArray jSONArray4 = optJSONArray2;
                                JSONArray jSONArray5 = optJSONArray3;
                                int i6 = length;
                                goodsAttr.id = jSONObject3.optLong("id");
                                goodsAttr.setValue(jSONObject3.optString("value"));
                                goodsAttrArr[i5] = goodsAttr;
                                if (!TextUtils.isEmpty(sb2.toString())) {
                                    sb2.append(com.meituan.android.singleton.b.a.getString(R.string.wm_restaurant_comma));
                                }
                                if (goodsAttr.getValue() != null) {
                                    sb2.append(goodsAttr.getValue());
                                }
                                i5++;
                                optJSONArray = jSONArray3;
                                optJSONArray2 = jSONArray4;
                                optJSONArray3 = jSONArray5;
                                length = i6;
                            }
                            jSONArray = optJSONArray;
                            jSONArray2 = optJSONArray2;
                            orderedFood.setAttrIds(goodsAttrArr);
                        }
                        if ((i4 & (1 << orderedFood.getCartId())) == 0) {
                            OrderedFood orderedFood2 = new OrderedFood();
                            orderedFood2.setCartId(orderedFood.getCartId());
                            arrayList2.add(orderedFood2);
                            i3 = i4 | (1 << orderedFood.getCartId());
                        } else {
                            i3 = i4;
                        }
                        arrayList2.add(orderedFood);
                        if (!TextUtils.isEmpty(sb2.toString())) {
                            sb.append(com.meituan.android.singleton.b.a.getString(R.string.wm_restaurant_brackets, sb2.toString()));
                        }
                        sb.append(CommonConstant.Symbol.COMMA);
                        i2++;
                        optJSONArray = jSONArray;
                        optJSONArray2 = jSONArray2;
                        jSONObject2 = jSONObject;
                    }
                    JSONArray jSONArray6 = optJSONArray;
                    poiBoughtItem.mGoodsList = arrayList2;
                    String sb3 = sb.toString();
                    poiBoughtItem.foodsName = sb3.substring(0, sb3.length() - 1);
                    arrayList.add(poiBoughtItem);
                    i++;
                    optJSONArray = jSONArray6;
                    jSONObject2 = jSONObject;
                }
            }
        } catch (Exception e) {
            String simpleName = getClass().getSimpleName();
            com.sankuai.waimai.foundation.utils.log.a.e(simpleName, e.getMessage(), new Object[0]);
        }
        return arrayList;
    }
}
