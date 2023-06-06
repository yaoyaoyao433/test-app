package com.sankuai.waimai.globalcart.model;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.cashier.bridge.icashier.ICashierJSHandler;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.platform.domain.core.activities.ActivityPolicy;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.order.ComboProduct;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class GlobalCart implements Serializable {
    public static final int ACTIVITY_CONTENT_TYPE_ALLOWANCE = 305;
    public static final int ACTIVITY_CONTENT_TYPE_FULL_REDUCTION = 2;
    public static final int ACTIVITY_TYPE_LARGE_FULL_REDUCTION = 1;
    public static final int BIZ_TYPE_MARKET = 2;
    public static final int BIZ_TYPE_WAIMAI = 1;
    public static final int TYPE_MARKET = 14;
    public static final int TYPE_WAIMAI = 15;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("clearing_info")
    public b clearingInfo;
    public boolean isNonDelivery;
    @SerializedName("item_discount_coupon_view_id")
    public String itemDiscountCouponViewId;
    @SerializedName("poi_coupon_view_id")
    public String poiCouponViewId;
    @SerializedName("wm_poi_id")
    public long poiId;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String poiIdStr;
    @SerializedName("poi_info")
    public d poiInfo;
    @SerializedName("product_list")
    public List<g> productList;
    @SerializedName("red_coupon_view_id")
    public String redCouponViewId;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String restaurantScheme;
    @SerializedName("sg_item_coupon_view_id")
    public String sgItemCouponViewId;
    @SerializedName("tip_info")
    public String tipInfo;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        @SerializedName("content")
        public String a;
        @SerializedName("status")
        public int b;
        @SerializedName("over_weight")
        public boolean c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b implements Serializable {
        @SerializedName("shipping_fee")
        public String a;
        @SerializedName("box_price")
        public String b;
        @SerializedName("total_price")
        public double c;
        @SerializedName("price_calculate_list")
        public List<Object> d;
        @SerializedName("button")
        public a e;
        @SerializedName("discount_info")
        public String f;
        @SerializedName("discount_prefix")
        public String g;
        @SerializedName("discount_money")
        public String h;
        @SerializedName("packing_bag")
        public com.sankuai.waimai.platform.domain.core.order.b i;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c implements Serializable {
        @SerializedName("product_status")
        public int a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class d implements Serializable {
        @SerializedName("name")
        public String a;
        @SerializedName("pic")
        public String b;
        @SerializedName("status")
        public f c;
        @SerializedName("activity_prompt")
        public List<Object> d;
        @SerializedName("log_field")
        public e e;
        @SerializedName("biz_type")
        public int f;
        @SerializedName("poi_activity_content_list")
        public List<Object> g;
        @SerializedName("poi_global_activity_list")
        public List<Object> h;
        @SerializedName("use_poi_tags_field")
        public boolean i;
        @SerializedName("poi_tags")
        public List<com.sankuai.waimai.platform.widget.tag.api.d> j;
        @SerializedName("sub_biz_type")
        public int k;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class e implements Serializable {
        @SerializedName("poi_status")
        public int a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class f implements Serializable {
        @SerializedName("status_description")
        public String a;
        @SerializedName("gray_status")
        public int b;
        @SerializedName("click_status")
        public int c;
        @SerializedName("click_toast")
        public String d;
        @SerializedName("status_description_color")
        public int e;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class h implements Serializable {
        @SerializedName("sell_status")
        public int a;
        @SerializedName("sell_status_description")
        public String b;
        @SerializedName("check_status")
        public int c;
        @SerializedName("click_status")
        public int d;
        @SerializedName("click_toast")
        public String e;
    }

    public GlobalCart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62c64edf431df51331f233719536c3f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62c64edf431df51331f233719536c3f1");
        } else {
            this.poiIdStr = "";
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class g implements Serializable {
        public static ChangeQuickRedirect a;
        @SerializedName(ICashierJSHandler.KEY_PROMOTION)
        public String A;
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String B;
        @SerializedName("activity_tag_id")
        public String C;
        @SerializedName("vip_label_url")
        public String D;
        @SerializedName("activity_extra")
        public String E;
        @SerializedName("list_type")
        public int F;
        @SerializedName("product_icon_url")
        public String G;
        @SerializedName("add_price_attrs")
        public List<GoodsAttr> H;
        @SerializedName("package_combo_item_list")
        public List<ComboProduct> I;
        public boolean J;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String b;
        @SerializedName("spu_id")
        public long c;
        @SerializedName("sku_id")
        public long d;
        @SerializedName("name")
        public String e;
        @SerializedName("pic")
        public String f;
        @SerializedName("count")
        public int g;
        @SerializedName("price_with_count")
        public double h;
        @SerializedName("origin_price_with_count")
        public double i;
        @SerializedName("status")
        public h j;
        @SerializedName("description")
        public String k;
        @SerializedName("attrs")
        public List<GoodsAttr> l;
        @SerializedName("price")
        public double m;
        @SerializedName("origin_price")
        public double n;
        @SerializedName("spec")
        public String o;
        @SerializedName("box_num")
        public double p;
        @SerializedName("box_price")
        public double q;
        @SerializedName("min_order_count")
        public int r;
        @SerializedName("tag")
        public String s;
        @SerializedName("restrict")
        public int t;
        @SerializedName("activity_tag")
        public String u;
        @SerializedName("activity_stock")
        public int v;
        @SerializedName("real_stock")
        public int w;
        @SerializedName("activity_type")
        public int x;
        @SerializedName("activity_policy")
        public ActivityPolicy y;
        @SerializedName("log_field")
        public c z;

        public g() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbbb573eed5dbe799a6bdd2f2755b076", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbbb573eed5dbe799a6bdd2f2755b076");
                return;
            }
            this.H = new ArrayList();
            this.I = new ArrayList();
        }

        public static OrderedFood a(g gVar) {
            int i;
            Object[] objArr = {gVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "83d0793100c296884edd83a31b4bef72", RobustBitConfig.DEFAULT_VALUE)) {
                return (OrderedFood) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "83d0793100c296884edd83a31b4bef72");
            }
            OrderedFood orderedFood = new OrderedFood();
            orderedFood.setCount(gVar.g);
            orderedFood.setFoodLabelUrl(gVar.f);
            int size = (gVar.H != null ? gVar.H.size() : 0) + (gVar.l != null ? gVar.l.size() : 0);
            if (size != 0) {
                GoodsAttr[] goodsAttrArr = new GoodsAttr[size];
                if (gVar.l != null) {
                    i = gVar.l.size();
                    for (int i2 = 0; i2 < gVar.l.size(); i2++) {
                        goodsAttrArr[i2] = gVar.l.get(i2);
                    }
                } else {
                    i = 0;
                }
                if (gVar.H != null) {
                    for (int i3 = i; i3 < size; i3++) {
                        goodsAttrArr[i3] = gVar.H.get(i3 - i);
                        goodsAttrArr[i3].mode = 999;
                    }
                }
                orderedFood.setAttrIds(goodsAttrArr);
            }
            orderedFood.setComboItemList(new ArrayList<OrderedFood>() { // from class: com.sankuai.waimai.globalcart.model.GlobalCart.g.1
                {
                    for (ComboProduct comboProduct : g.this.I) {
                        add(ComboProduct.a(comboProduct));
                    }
                }
            });
            orderedFood.spu.setActivityTag(gVar.u);
            orderedFood.spu.convertActivityExtra2GroupChatShare(gVar.E);
            orderedFood.spu.setActivityType(gVar.x);
            orderedFood.spu.setPhysicalTag(gVar.s);
            orderedFood.spu.id = gVar.c;
            orderedFood.spu.setName(gVar.e);
            orderedFood.spu.setActivityPolicy(gVar.y);
            orderedFood.sku.id = gVar.d;
            orderedFood.sku.spec = gVar.o;
            orderedFood.sku.picture = gVar.f;
            orderedFood.sku.description = gVar.k;
            orderedFood.sku.price = gVar.m;
            orderedFood.sku.originPrice = gVar.n;
            orderedFood.sku.boxNum = gVar.p;
            orderedFood.sku.boxPrice = gVar.q;
            orderedFood.sku.minOrderCount = gVar.r;
            orderedFood.sku.realStock = gVar.w;
            orderedFood.sku.restrict = gVar.t;
            orderedFood.sku.activityStock = gVar.v;
            orderedFood.sku.status = 0;
            orderedFood.sku.promotionInfo = gVar.A;
            orderedFood.sku.checkStatus = gVar.j != null ? gVar.j.c : 0;
            orderedFood.sku.convertActivityExtra2GroupChatShare(gVar.E);
            orderedFood.setActivityList(gVar.E);
            orderedFood.setVipLabelUrl(gVar.D);
            List<GoodsSku> skuList = orderedFood.spu.getSkuList();
            if (skuList == null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(orderedFood.sku);
                orderedFood.spu.setSkuList(arrayList);
            } else if (skuList.isEmpty()) {
                skuList.add(orderedFood.sku);
            }
            if (gVar.j != null) {
                orderedFood.spu.setStatus(gVar.j.a);
            }
            return orderedFood;
        }

        public final boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0c9c4277c2ea1e1cf947abacd817590", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0c9c4277c2ea1e1cf947abacd817590")).booleanValue();
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.c == gVar.c && this.d == gVar.d) {
                    if (com.sankuai.waimai.foundation.utils.d.a(this.l) && com.sankuai.waimai.foundation.utils.d.a(gVar.l)) {
                        return true;
                    }
                    return !com.sankuai.waimai.foundation.utils.d.a(this.l) && !com.sankuai.waimai.foundation.utils.d.a(gVar.l) && this.l.size() == gVar.l.size() && this.H.size() == gVar.H.size() && this.l.containsAll(gVar.l) && this.H.containsAll(gVar.H);
                }
                return false;
            }
            return false;
        }

        public final int a() {
            if (this.j != null) {
                return this.j.c;
            }
            return 0;
        }
    }

    public boolean isAllSelect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "850e7d705d556cfcc1695c014e74c054", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "850e7d705d556cfcc1695c014e74c054")).booleanValue();
        }
        if (this.productList == null || this.productList.isEmpty()) {
            return false;
        }
        for (g gVar : this.productList) {
            if (gVar.j.c == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isDelAllSelect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d7aafe22eee1bc93c613de390fe13a9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d7aafe22eee1bc93c613de390fe13a9")).booleanValue();
        }
        if (this.productList == null || this.productList.isEmpty()) {
            return false;
        }
        for (g gVar : this.productList) {
            if (!gVar.J) {
                return false;
            }
        }
        return true;
    }

    public boolean isAllDisable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6080d0769150141e228ad65240215658", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6080d0769150141e228ad65240215658")).booleanValue();
        }
        if (this.productList == null || this.productList.isEmpty()) {
            return false;
        }
        for (g gVar : this.productList) {
            if (gVar.j.c != 2) {
                return false;
            }
        }
        return true;
    }

    @NonNull
    public static List<OrderedFood> convert2OrderedFoodList(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1af906259b24f6113dfaca0ff19f3abd", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1af906259b24f6113dfaca0ff19f3abd");
        }
        ArrayList arrayList = new ArrayList();
        if (gVar == null) {
            return arrayList;
        }
        String str = gVar.E;
        if (!TextUtils.isEmpty(str)) {
            try {
                SparseIntArray sparseIntArray = new SparseIntArray();
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("activity_tag");
                        int optInt = optJSONObject.optInt("count", -1);
                        if (optInt > 0) {
                            int convertActivityTagToBuyType = convertActivityTagToBuyType(optString);
                            int i2 = sparseIntArray.get(convertActivityTagToBuyType, -1);
                            if (i2 < 0) {
                                sparseIntArray.put(convertActivityTagToBuyType, optInt);
                            } else {
                                sparseIntArray.put(convertActivityTagToBuyType, i2 + optInt);
                            }
                        }
                    }
                }
                sparseIntArray.size();
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    private static int convertActivityTagToBuyType(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b6808d90db74f6056e5ab3b1f7414414", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b6808d90db74f6056e5ab3b1f7414414")).intValue() : "plus_discount".equals(str) ? 1 : 0;
    }

    public int getBizType() {
        return (this.poiInfo != null && this.poiInfo.f == 2) ? 14 : 15;
    }

    public void cancleAllCheck() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "296d4944c06b850da7a7697703066cea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "296d4944c06b850da7a7697703066cea");
        } else if (!com.sankuai.waimai.foundation.utils.d.a(this.productList)) {
            for (g gVar : this.productList) {
                if (gVar != null) {
                    gVar.j.c = 0;
                }
            }
        }
    }

    public boolean hasChecked() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7661a0ecb793b51eb786f0d2ff4674a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7661a0ecb793b51eb786f0d2ff4674a")).booleanValue();
        }
        if (!com.sankuai.waimai.foundation.utils.d.a(this.productList)) {
            for (g gVar : this.productList) {
                if (gVar != null && gVar.j != null && gVar.j.c == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
