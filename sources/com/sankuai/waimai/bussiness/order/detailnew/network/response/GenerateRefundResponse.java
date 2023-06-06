package com.sankuai.waimai.bussiness.order.detailnew.network.response;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class GenerateRefundResponse implements Serializable {
    public static final int REFUND_CATEGORY_ALL = 0;
    public static final int REFUND_CATEGORY_PART = 1;
    public static final int REFUND_WAY_DISABLED = -1;
    public static final int REFUND_WAY_SELECTED = 1;
    public static final int REFUND_WAY_TYPE_NEW_CASH_AND_GOODS = 4;
    public static final int REFUND_WAY_TYPE_NEW_ONLY_CASH = 3;
    public static final int REFUND_WAY_TYPE_NORMAL = 0;
    public static final int REFUND_WAY_TYPE_SPEED = 1;
    public static final int REFUND_WAY_UNSELECTED = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("address_modify_fee")
    public a addressModifyFee;
    @SerializedName("biz_tag")
    public int biz_tag;
    @SerializedName("box_desc")
    public String boxDesc;
    @SerializedName("cycle_food_list")
    public List<Object> cycleFoodList;
    @SerializedName("failure_description")
    public String failuerDesc;
    @SerializedName("foodlist")
    public List<c> foodInfoList;
    @SerializedName("insurance")
    public d insurance;
    @SerializedName("packing_bag")
    public e packing_bag;
    @SerializedName("poi_info")
    public f poiInfo;
    @SerializedName("poi_phone")
    public String poiPhone;
    @SerializedName("poi_refund_support")
    public int poiRefundSupport;
    @SerializedName("refund_category")
    public List<g> refundCategoryList;
    @SerializedName("refund_desc")
    public String refundDesc;
    @SerializedName("refund_money")
    public double refundMoney;
    @SerializedName("type_reasons")
    public List<Object> refundReasonList;
    @SerializedName("refund_rule_desc")
    public String refundRuleDesc;
    @SerializedName("refund_type")
    public List<Object> refundTypeList;
    @SerializedName("refund_way")
    public List<Object> refundWayList;
    @SerializedName("refund_without_picture_tip")
    public String refundWithoutPictureTip;
    @SerializedName("shipping")
    public h shipping;
    @SerializedName("support_part_refund")
    public int supportPartRefund;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        @SerializedName("title")
        public String a;
        @SerializedName("price")
        public double b;
        @SerializedName("can_refund")
        public boolean c;
        @SerializedName("refund_tip")
        public String d;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class d implements Serializable {
        @SerializedName("insurance_name")
        public String a;
        @SerializedName("insurance_price")
        public double b;
        @SerializedName("insurance_tip")
        public String c;
        @SerializedName("can_refund")
        public int d;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class e implements Serializable {
        @SerializedName("title")
        public String a;
        @SerializedName("price")
        public double b;
        @SerializedName("tip")
        public String c;
        @SerializedName("can_refund")
        public boolean d;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class h implements Serializable {
        @SerializedName("shipping_title")
        public String a;
        @SerializedName("shipping_fee")
        public double b;
    }

    public void parsePoiInfo(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ca46599002639a5b7a3d6f301aa4a5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ca46599002639a5b7a3d6f301aa4a5d");
        } else if (jSONObject != null) {
            this.poiInfo = new f();
            f fVar = this.poiInfo;
            Object[] objArr2 = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect3 = f.a;
            if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect3, false, "3826b06663c84919d91da54d0fa461b3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect3, false, "3826b06663c84919d91da54d0fa461b3");
            } else if (jSONObject != null) {
                fVar.b = jSONObject.optLong("poi_id");
                fVar.c = jSONObject.optString(FoodDetailNetWorkPreLoader.URI_POI_STR);
                fVar.d = jSONObject.optString(AgainManager.EXTRA_POI_NAME);
                fVar.e = jSONObject.optString("poi_url");
                fVar.f = jSONObject.optInt("product_count");
                fVar.g = jSONObject.optDouble("total");
                fVar.h = jSONObject.optInt("shipping_type");
            }
        }
    }

    public void parseRefundCategory(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8cc89da8dee7c89a815aad14604316c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8cc89da8dee7c89a815aad14604316c6");
        } else if (jSONArray != null) {
            this.refundCategoryList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    g gVar = new g();
                    Object[] objArr2 = {optJSONObject};
                    ChangeQuickRedirect changeQuickRedirect3 = g.a;
                    if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect3, false, "cdfca99dd25c0af406438dfb63efd365", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect3, false, "cdfca99dd25c0af406438dfb63efd365");
                    } else if (optJSONObject != null) {
                        gVar.b = optJSONObject.optString("description");
                        gVar.c = optJSONObject.optInt("type");
                    }
                    this.refundCategoryList.add(gVar);
                }
            }
        }
    }

    public void parseFoodInfo(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e137077940c9a0b2b1a080fc19b104c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e137077940c9a0b2b1a080fc19b104c2");
        } else if (jSONArray != null) {
            this.foodInfoList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    c cVar = new c();
                    Object[] objArr2 = {optJSONObject};
                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                    if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect3, false, "608a462cd72c1e84551d9334dcd89377", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect3, false, "608a462cd72c1e84551d9334dcd89377");
                    } else if (optJSONObject != null) {
                        cVar.b = optJSONObject.optString("item_id");
                        cVar.c = optJSONObject.optLong("wm_food_id");
                        cVar.d = optJSONObject.optDouble("food_price");
                        cVar.e = optJSONObject.optInt("count");
                        cVar.f = optJSONObject.optDouble("box_num");
                        cVar.g = optJSONObject.optDouble("box_price");
                        cVar.h = optJSONObject.optString("food_name");
                        cVar.i = optJSONObject.optDouble("origin_food_price");
                        cVar.j = optJSONObject.optDouble("refund_price");
                        cVar.k = optJSONObject.optString("food_label_url");
                        cVar.l = optJSONObject.optString("food_pic_url");
                        cVar.m = optJSONObject.optInt("refund_status_code");
                        cVar.n = optJSONObject.optString("refund_status_desc");
                        cVar.o = b.a(optJSONObject.optJSONArray("attrs"));
                    }
                    this.foodInfoList.add(cVar);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class f implements Serializable {
        public static ChangeQuickRedirect a;
        @SerializedName("poi_id")
        public long b;
        @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
        public String c = "";
        @SerializedName(AgainManager.EXTRA_POI_NAME)
        public String d;
        @SerializedName("poi_url")
        public String e;
        @SerializedName("product_count")
        public int f;
        @SerializedName("total")
        public double g;
        @SerializedName("shipping_type")
        public int h;

        public f() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class g implements Serializable {
        public static ChangeQuickRedirect a;
        @SerializedName("description")
        public String b;
        @SerializedName("type")
        public int c;

        public g() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class c implements Serializable {
        public static ChangeQuickRedirect a;
        @SerializedName("item_id")
        public String b;
        @SerializedName("wm_food_id")
        public long c;
        @SerializedName("food_price")
        public double d;
        @SerializedName("count")
        public int e;
        @SerializedName("box_num")
        public double f;
        @SerializedName("box_price")
        public double g;
        @SerializedName("food_name")
        public String h;
        @SerializedName("origin_food_price")
        public double i;
        @SerializedName("refund_price")
        public double j;
        @SerializedName("food_label_url")
        public String k;
        @SerializedName("food_pic_url")
        public String l;
        @SerializedName("refund_status_code")
        public int m;
        @SerializedName("refund_status_desc")
        public String n;
        @SerializedName("attrs")
        public ArrayList<b> o;

        public c() {
            Object[] objArr = {GenerateRefundResponse.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b10038291324021144eb5ab085df7d7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b10038291324021144eb5ab085df7d7");
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b implements Serializable {
        public static ChangeQuickRedirect a;
        @SerializedName("id")
        public long b;
        @SerializedName("value")
        public String c;

        public static ArrayList<b> a(JSONArray jSONArray) {
            b bVar;
            Object[] objArr = {jSONArray};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "31fb23b56b28d4adad185ffd2d7df991", RobustBitConfig.DEFAULT_VALUE)) {
                return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "31fb23b56b28d4adad185ffd2d7df991");
            }
            if (jSONArray == null) {
                return null;
            }
            ArrayList<b> arrayList = new ArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    Object[] objArr2 = {optJSONObject};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7767ffcbf408f5a6ded5550c041a75b7", RobustBitConfig.DEFAULT_VALUE)) {
                        bVar = (b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7767ffcbf408f5a6ded5550c041a75b7");
                    } else if (optJSONObject == null) {
                        bVar = null;
                    } else {
                        b bVar2 = new b();
                        bVar2.b = optJSONObject.optLong("id");
                        bVar2.c = optJSONObject.optString("value");
                        bVar = bVar2;
                    }
                    if (bVar != null) {
                        arrayList.add(bVar);
                    }
                }
            }
            return arrayList;
        }
    }
}
