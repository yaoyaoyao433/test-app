package com.sankuai.waimai.bussiness.order.crossconfirm.utils;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.waimai.business.order.submit.SubmitOrderManager;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.OrderFoodInput;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.OrderFoodOutput;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.OrderFoodOutputAttr;
import com.sankuai.waimai.foundation.utils.d;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.order.ComboProduct;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    @NonNull
    public static List<WmOrderedFood> a(@Nullable List<OrderedFood> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2f6b7956e1f92e5788f1aaacdc678f52", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2f6b7956e1f92e5788f1aaacdc678f52");
        }
        ArrayList arrayList = new ArrayList();
        if (!d.a(list)) {
            for (OrderedFood orderedFood : list) {
                WmOrderedFood wmOrderedFood = new WmOrderedFood(orderedFood.spu.id, orderedFood.sku.id, orderedFood.getAttrIds(), orderedFood.getCount(), a(orderedFood.getActivityTag()) ? 0 : orderedFood.getCartId(), orderedFood.plusCount, orderedFood.getActivityTag());
                wmOrderedFood.groupChatShare = orderedFood.sku.groupChatShare;
                wmOrderedFood.seckill = orderedFood.sku.getSeckill();
                wmOrderedFood.comboProducts = ComboProduct.a(orderedFood.getComboItems());
                arrayList.add(wmOrderedFood);
            }
        }
        return arrayList;
    }

    private static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "097106ef92b526c51a0192878e2dec6b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "097106ef92b526c51a0192878e2dec6b")).booleanValue() : "plus_discount".equals(str) && 14 == SubmitOrderManager.getInstance().getSourceType();
    }

    @NonNull
    public static ArrayList<OrderFoodInput> b(@Nullable List<OrderedFood> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "76e08f80c4fda87bb8ff2e707593989c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "76e08f80c4fda87bb8ff2e707593989c");
        }
        ArrayList<OrderFoodInput> arrayList = new ArrayList<>();
        if (!d.a(list)) {
            for (OrderedFood orderedFood : list) {
                if (orderedFood != null) {
                    OrderFoodInput orderFoodInput = new OrderFoodInput();
                    orderFoodInput.spuId = orderedFood.spu.id;
                    orderFoodInput.id = orderedFood.sku.id;
                    orderFoodInput.count = orderedFood.count;
                    orderFoodInput.cartId = orderedFood.getCartId();
                    orderFoodInput.packageId = orderedFood.getCartId();
                    orderFoodInput.groupChatShare = orderedFood.sku.getGroupChatShare();
                    orderFoodInput.seckill = orderedFood.sku.getSeckill();
                    GoodsAttr[] attrIds = orderedFood.getAttrIds();
                    if (attrIds != null) {
                        orderFoodInput.attrs = new ArrayList();
                        for (GoodsAttr goodsAttr : attrIds) {
                            if (goodsAttr != null) {
                                if (goodsAttr.mode == 999) {
                                    orderFoodInput.addPriceAttrs.add(goodsAttr);
                                } else {
                                    orderFoodInput.attrs.add(Long.valueOf(goodsAttr.id));
                                }
                            }
                        }
                    }
                    orderFoodInput.comboProducts = ComboProduct.a(orderedFood.getComboItems());
                    orderFoodInput.activityTag = orderedFood.spu.activityTag;
                    a(orderFoodInput, orderedFood.plusCount);
                    arrayList.add(orderFoodInput);
                }
            }
        }
        return arrayList;
    }

    @NonNull
    public static ArrayList<OrderFoodInput> c(@Nullable List<WmOrderedFood> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6b89dfbbb56242e9911e5eecf564812", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6b89dfbbb56242e9911e5eecf564812");
        }
        ArrayList<OrderFoodInput> arrayList = new ArrayList<>();
        if (!d.a(list)) {
            for (WmOrderedFood wmOrderedFood : list) {
                if (wmOrderedFood != null) {
                    OrderFoodInput orderFoodInput = new OrderFoodInput();
                    orderFoodInput.spuId = wmOrderedFood.getSpuId();
                    orderFoodInput.id = wmOrderedFood.getSkuId();
                    orderFoodInput.count = wmOrderedFood.count;
                    orderFoodInput.cartId = wmOrderedFood.getCartId();
                    orderFoodInput.packageId = wmOrderedFood.getCartId();
                    orderFoodInput.productExtraInfo = wmOrderedFood.productExtraInfo;
                    orderFoodInput.groupChatShare = wmOrderedFood.groupChatShare;
                    orderFoodInput.seckill = wmOrderedFood.seckill;
                    GoodsAttr[] attrIds = wmOrderedFood.getAttrIds();
                    if (attrIds != null) {
                        orderFoodInput.attrs = new ArrayList();
                        for (GoodsAttr goodsAttr : attrIds) {
                            if (goodsAttr != null) {
                                if (goodsAttr.mode == 999) {
                                    orderFoodInput.addPriceAttrs.add(goodsAttr);
                                } else {
                                    orderFoodInput.attrs.add(Long.valueOf(goodsAttr.id));
                                }
                            }
                        }
                    }
                    orderFoodInput.comboProducts = wmOrderedFood.comboProducts;
                    orderFoodInput.activityTag = wmOrderedFood.getActivityTag();
                    a(orderFoodInput, wmOrderedFood.plusCount);
                    arrayList.add(orderFoodInput);
                }
            }
        }
        return arrayList;
    }

    private static void a(OrderFoodInput orderFoodInput, int i) {
        Object[] objArr = {orderFoodInput, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0f530d036c00c809c6d65c3dff82cd72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0f530d036c00c809c6d65c3dff82cd72");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        if (i > 0) {
            jSONArray.put(new com.sankuai.waimai.platform.domain.core.shop.a("plus_discount", i).a());
        }
        JSONObject jSONObject = new JSONObject();
        if (jSONArray.length() > 0) {
            try {
                jSONObject.put(PushConstants.INTENT_ACTIVITY_NAME, jSONArray);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        try {
            jSONObject.put("groupChatShare", orderFoodInput.groupChatShare);
            jSONObject.put("seckill", orderFoodInput.seckill);
        } catch (Exception unused) {
        }
        orderFoodInput.activityExtra = jSONObject.toString();
    }

    @NonNull
    public static List<WmOrderedFood> d(@Nullable List<OrderFoodOutput> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93e612f35714068a05d26303c32686cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93e612f35714068a05d26303c32686cb");
        }
        ArrayList arrayList = new ArrayList();
        if (!d.a(list)) {
            for (OrderFoodOutput orderFoodOutput : list) {
                boolean a2 = a(orderFoodOutput.activityTag);
                WmOrderedFood wmOrderedFood = new WmOrderedFood(orderFoodOutput.spuId, orderFoodOutput.id, e(orderFoodOutput.attrs), a2 ? 0 : orderFoodOutput.count, a2 ? 0 : orderFoodOutput.cartId, a2 ? orderFoodOutput.count : 0, orderFoodOutput.activityTag);
                wmOrderedFood.groupChatShare = orderFoodOutput.groupChatShare;
                if (orderFoodOutput.comboType == 1 || orderFoodOutput.comboType == 2) {
                    wmOrderedFood.comboProducts = orderFoodOutput.mComboProduct;
                }
                wmOrderedFood.seckill = orderFoodOutput.getSeckill();
                arrayList.add(wmOrderedFood);
            }
        }
        return arrayList;
    }

    @Nullable
    private static GoodsAttr[] e(@Nullable List<OrderFoodOutputAttr> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b72f19280fff400abd89f8a645a7faf8", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsAttr[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b72f19280fff400abd89f8a645a7faf8");
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        GoodsAttr[] goodsAttrArr = new GoodsAttr[list.size()];
        for (int i = 0; i < list.size(); i++) {
            OrderFoodOutputAttr orderFoodOutputAttr = list.get(i);
            GoodsAttr goodsAttr = new GoodsAttr();
            if (orderFoodOutputAttr != null) {
                goodsAttr.id = orderFoodOutputAttr.id;
                goodsAttr.value = orderFoodOutputAttr.value;
            }
            goodsAttrArr[i] = goodsAttr;
        }
        return goodsAttrArr;
    }
}
