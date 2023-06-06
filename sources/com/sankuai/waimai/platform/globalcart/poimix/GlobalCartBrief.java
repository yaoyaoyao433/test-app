package com.sankuai.waimai.platform.globalcart.poimix;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.globalcart.model.CartProduct;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.order.ComboProduct;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class GlobalCartBrief implements Serializable {
    private static final int PRODUCT_MAX_NUM = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("wm_poi_id")
    public long poiId;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String poiIdStr;
    @SerializedName("product_list")
    public List<a> productList;

    public GlobalCartBrief() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c16af664f5cbab4fac3e975b172ef908", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c16af664f5cbab4fac3e975b172ef908");
        } else {
            this.poiIdStr = "";
        }
    }

    public JSONObject toJson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6926481ee2c6b9c54047ba461c3f4609", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6926481ee2c6b9c54047ba461c3f4609");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("wm_poi_id", this.poiId);
            jSONObject.put(FoodDetailNetWorkPreLoader.URI_POI_STR, aa.a(this.poiIdStr) ? "" : this.poiIdStr);
            JSONArray jSONArray = new JSONArray();
            if (this.productList != null) {
                for (a aVar : this.productList) {
                    jSONArray.put(aVar.a());
                }
            }
            jSONObject.put("product_list", jSONArray);
        } catch (JSONException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        return jSONObject;
    }

    public GlobalCartBrief fromPoiShopcart(com.sankuai.waimai.globalcart.model.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c6c0c30a296b33e16ac2ed01fffd983", RobustBitConfig.DEFAULT_VALUE)) {
            return (GlobalCartBrief) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c6c0c30a296b33e16ac2ed01fffd983");
        }
        if (aVar == null) {
            return this;
        }
        this.poiId = aVar.b;
        this.poiIdStr = aVar.c;
        this.productList = new ArrayList();
        if (!com.sankuai.waimai.foundation.utils.b.b(aVar.e)) {
            int size = aVar.e.size();
            if (z) {
                size = Math.min(size, 2);
            }
            for (int i = 0; i < size; i++) {
                CartProduct cartProduct = aVar.e.get(i);
                if (cartProduct != null) {
                    this.productList.add(new a().a(cartProduct));
                }
            }
        }
        return this;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c148dfc6aa8d6103b7f539821591e99", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c148dfc6aa8d6103b7f539821591e99")).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof GlobalCartBrief)) {
            return false;
        }
        GlobalCartBrief globalCartBrief = (GlobalCartBrief) obj;
        return ((com.sankuai.waimai.foundation.utils.b.b(this.productList) && com.sankuai.waimai.foundation.utils.b.b(globalCartBrief.productList)) || this.productList == null || !this.productList.equals(globalCartBrief.productList)) ? false : true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements Serializable {
        public static ChangeQuickRedirect a;
        @SerializedName("cart_id")
        public long b;
        @SerializedName("spu_id")
        public long c;
        @SerializedName("sku_id")
        public long d;
        @SerializedName("attrs")
        public List<Long> e;
        @SerializedName("count")
        public int f;
        @SerializedName("activity_tag")
        public String g;
        @SerializedName("activity_extra")
        public String h;
        @SerializedName("add_price_attrs")
        public List<GoodsAttr> i;
        @SerializedName("package_combo_item_list")
        public List<ComboProduct> j;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68df669a0872550d6cdc4f2ee4406714", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68df669a0872550d6cdc4f2ee4406714");
                return;
            }
            this.i = new ArrayList();
            this.j = new ArrayList();
        }

        public final JSONObject a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a62e4a10cdb066e074a55b4fb66412f9", RobustBitConfig.DEFAULT_VALUE)) {
                return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a62e4a10cdb066e074a55b4fb66412f9");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("spu_id", this.c);
                jSONObject.put("sku_id", this.d);
                jSONObject.put("count", this.f);
                jSONObject.put("cart_id", this.b);
                jSONObject.put("activity_tag", this.g);
                if (this.j != null && this.j.size() > 0) {
                    jSONObject.put("package_combo_item_list", new JSONArray(ComboProduct.b(this.j)));
                }
                if (this.e != null && this.e.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i = 0; i < this.e.size(); i++) {
                        jSONArray.put(this.e.get(i));
                    }
                    jSONObject.put("attrs", jSONArray);
                }
                if (this.i != null && this.i.size() > 0) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (GoodsAttr goodsAttr : this.i) {
                        jSONArray2.put(goodsAttr.toAddPriceJson());
                    }
                    jSONObject.put("add_price_attrs", jSONArray2);
                }
                jSONObject.put("activity_extra", this.h);
            } catch (JSONException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
            return jSONObject;
        }

        public final a a(CartProduct cartProduct) {
            Object[] objArr = {cartProduct};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53af85e0b8bcd13bbac657ca95fb927e", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53af85e0b8bcd13bbac657ca95fb927e");
            }
            if (cartProduct == null) {
                return this;
            }
            this.b = cartProduct.cartId;
            this.c = cartProduct.spuId;
            this.d = cartProduct.skuId;
            this.f = cartProduct.count;
            this.g = cartProduct.activityTag;
            this.e = cartProduct.attrs;
            this.i = cartProduct.mAddPriceAttributes;
            this.j = cartProduct.mComboProducts;
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = new JSONArray();
                if (!com.sankuai.waimai.foundation.utils.b.b(cartProduct.activityTagList)) {
                    for (com.sankuai.waimai.platform.domain.core.shop.a aVar : cartProduct.activityTagList) {
                        if (aVar != null) {
                            jSONArray.put(aVar.a());
                        }
                    }
                }
                jSONObject.put(PushConstants.INTENT_ACTIVITY_NAME, jSONArray);
                jSONObject.put("groupChatShare", cartProduct.groupChatShare);
                jSONObject.put("seckill", cartProduct.seckill);
            } catch (JSONException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
            this.h = jSONObject.toString();
            return this;
        }

        public final boolean equals(Object obj) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "848d5d916cc197ed77d9d3c59d1deb72", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "848d5d916cc197ed77d9d3c59d1deb72")).booleanValue();
            }
            if (obj == this) {
                return true;
            }
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.b == this.b && this.c == aVar.c && this.d == aVar.d && this.f == aVar.f) {
                List<Long> list = aVar.e;
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "176847ecdf3eba878863b7b82cd0a765", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "176847ecdf3eba878863b7b82cd0a765")).booleanValue();
                } else {
                    z = (com.sankuai.waimai.foundation.utils.b.b(this.e) && com.sankuai.waimai.foundation.utils.b.b(list)) || (this.e != null && this.e.equals(list));
                }
                if (z) {
                    String str = aVar.g;
                    Object[] objArr3 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "23b07d177e95f81f7acc84ed2860f785", RobustBitConfig.DEFAULT_VALUE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "23b07d177e95f81f7acc84ed2860f785")).booleanValue();
                    } else {
                        z2 = (TextUtils.isEmpty(this.g) && TextUtils.isEmpty(str)) || (this.g != null && this.g.equals(str));
                    }
                    if (z2) {
                        String str2 = aVar.h;
                        Object[] objArr4 = {str2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "331aeff4daac0672a64fb9901b6d466c", RobustBitConfig.DEFAULT_VALUE)) {
                            z3 = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "331aeff4daac0672a64fb9901b6d466c")).booleanValue();
                        } else {
                            z3 = (TextUtils.isEmpty(this.h) && TextUtils.isEmpty(str2)) || (this.h != null && this.h.equals(str2));
                        }
                        if (z3) {
                            List<GoodsAttr> list2 = aVar.i;
                            Object[] objArr5 = {list2};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "0c938157181b03f8006b69e3d6f77ef3", RobustBitConfig.DEFAULT_VALUE)) {
                                z4 = ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "0c938157181b03f8006b69e3d6f77ef3")).booleanValue();
                            } else {
                                z4 = (com.sankuai.waimai.foundation.utils.b.b(this.i) && com.sankuai.waimai.foundation.utils.b.b(list2)) || (this.i != null && this.i.equals(list2));
                            }
                            if (z4) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
    }
}
