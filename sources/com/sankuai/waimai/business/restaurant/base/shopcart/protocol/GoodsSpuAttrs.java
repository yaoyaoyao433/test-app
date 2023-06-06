package com.sankuai.waimai.business.restaurant.base.shopcart.protocol;

import android.support.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.util.d;
import com.sankuai.waimai.business.restaurant.poicontainer.json.c;
import com.sankuai.waimai.business.restaurant.poicontainer.utils.MachProJsonUtil;
import com.sankuai.waimai.foundation.utils.b;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class GoodsSpuAttrs implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("attrs")
    public List<GoodsAttr> attrs;
    @SerializedName("cart_id")
    public int cartId;
    @SerializedName("combo_group")
    public List<GoodsSpuAttrs> comboGroup;
    @SerializedName("count")
    public int count;
    @SerializedName("groupId")
    public long groupId;
    @SerializedName(DataConstants.INDEX)
    public int itemIndex;
    @SerializedName("product_type")
    public int productType;
    public GoodsSku sku;
    @SerializedName("sku_id")
    public long skuId;
    @SerializedName("spu")
    public GoodsSpu spu;

    public GoodsAttr[] getAttrsArray() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb33414153393c09ee0742dd6b250e28", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsAttr[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb33414153393c09ee0742dd6b250e28");
        }
        if (b.b(this.attrs)) {
            return null;
        }
        return (GoodsAttr[]) this.attrs.toArray(new GoodsAttr[this.attrs.size()]);
    }

    public static GoodsSpuAttrs parseJson(JSONObject jSONObject) {
        GoodsSpu goodsSpu;
        JSONObject optJSONObject;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a92b1e081dc57d3de27cad829f957264", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsSpuAttrs) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a92b1e081dc57d3de27cad829f957264");
        }
        GoodsSpuAttrs goodsSpuAttrs = new GoodsSpuAttrs();
        try {
            goodsSpu = new GoodsSpu();
            optJSONObject = jSONObject.optJSONObject("spu");
        } catch (NullPointerException | JSONException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        if (optJSONObject == null) {
            throw new NullPointerException("spu is null");
        }
        goodsSpu.parseJson(optJSONObject);
        goodsSpuAttrs.spu = goodsSpu;
        goodsSpuAttrs.skuId = jSONObject.optLong("sku_id");
        goodsSpuAttrs.cartId = jSONObject.optInt("cart_id");
        goodsSpuAttrs.itemIndex = jSONObject.optInt(DataConstants.INDEX);
        if (!b.b(goodsSpu.getSkuList())) {
            Iterator<GoodsSku> it = goodsSpu.getSkuList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                GoodsSku next = it.next();
                if (next.id == goodsSpuAttrs.skuId) {
                    goodsSpuAttrs.sku = next;
                    break;
                }
            }
        }
        goodsSpuAttrs.attrs = GoodsAttr.fromJsonArray(jSONObject.getJSONArray("attrs"));
        goodsSpuAttrs.count = jSONObject.optInt("count");
        goodsSpuAttrs.groupId = jSONObject.optLong("groupId");
        goodsSpuAttrs.productType = jSONObject.optInt("product_type");
        JSONArray optJSONArray = jSONObject.optJSONArray("combo_group");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                if (jSONObject2 != null) {
                    arrayList.add(parseJson(jSONObject2));
                }
            }
            goodsSpuAttrs.comboGroup = arrayList;
        }
        return goodsSpuAttrs;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Deserializer implements JsonDeserializer<GoodsSpuAttrs> {
        public static ChangeQuickRedirect a;

        @Override // com.google.gson.JsonDeserializer
        public /* synthetic */ GoodsSpuAttrs deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "854fa7c6ada2caa288e9dfbb8b6d98d6", RobustBitConfig.DEFAULT_VALUE) ? (GoodsSpuAttrs) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "854fa7c6ada2caa288e9dfbb8b6d98d6") : GoodsSpuAttrs.parseJson(new c((JsonObject) jsonElement));
        }
    }

    public static GoodsSpuAttrs getGoodsSpu(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "63bd02568c884a6620f7b60dbef8a196", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsSpuAttrs) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "63bd02568c884a6620f7b60dbef8a196");
        }
        GoodsSpuAttrs goodsSpuAttrs = (GoodsSpuAttrs) d.a().fromJson(str, (Class<Object>) GoodsSpuAttrs.class);
        if (goodsSpuAttrs.spu == null || goodsSpuAttrs.skuId == 0) {
            return null;
        }
        return goodsSpuAttrs;
    }

    public static List<GoodsSpuAttrs> getGoodsSpuList(String str) {
        List<GoodsSpuAttrs> list;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ba8cbc94f3990b5393a1a212cbd733a0", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ba8cbc94f3990b5393a1a212cbd733a0");
        }
        try {
            list = (List) d.a().fromJson(str, new TypeToken<List<GoodsSpuAttrs>>() { // from class: com.sankuai.waimai.business.restaurant.base.shopcart.protocol.GoodsSpuAttrs.1
            }.getType());
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list;
    }

    public static List<GoodsSpuAttrs> getGoodsSpuList(MachArray machArray) {
        List<GoodsSpuAttrs> list;
        Object[] objArr = {machArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9434be41ec2b8981dd65c5ae62c014ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9434be41ec2b8981dd65c5ae62c014ad");
        }
        try {
            Type type = new TypeToken<List<GoodsSpuAttrs>>() { // from class: com.sankuai.waimai.business.restaurant.base.shopcart.protocol.GoodsSpuAttrs.2
            }.getType();
            Gson a = d.a();
            Object[] objArr2 = {machArray};
            ChangeQuickRedirect changeQuickRedirect3 = MachProJsonUtil.a;
            list = (List) a.fromJson(PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "a69f0aa32ae33407188b549a0de207bc", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "a69f0aa32ae33407188b549a0de207bc") : new GsonBuilder().registerTypeAdapterFactory(new MachProJsonUtil.MachMapTypeAdapter.MachMapTypeAdapterFactory(null)).setPrettyPrinting().serializeSpecialFloatingPointValues().create().toJsonTree(machArray, MachArray.class), type);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list;
    }
}
