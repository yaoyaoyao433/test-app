package com.sankuai.waimai.business.order.api.submit.model;

import android.support.annotation.Keep;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.titans.widget.DynamicTitleParser;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.common.promotion.bean.PayLabel;
import com.meituan.android.pay.common.promotion.bean.PayLabelConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.open.SocialConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class DiscountItem implements Serializable {
    public static final long DISCOUNT_ACTVITY_TYPE = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_tip")
    public String activityTip;
    @SerializedName("add_on_item_info_preview")
    public b addOnItemInfoPreview;
    @SerializedName("add_on_item_key")
    public String addOnItemKey;
    public c allowanceTip;
    @SerializedName("allowance_tip")
    public String allowanceTipStr;
    @SerializedName("collect_order_stage_preview")
    public CollectOrder collectOrderStagePreview;
    @SerializedName("coupon_sign")
    public String couponSign;
    public d discountDetailInfo;
    @SerializedName("discount_detail_info")
    public String discountDetailInfoStr;
    @SerializedName("discount_items")
    public List<DiscountItem> discountItems;
    @SerializedName("discounts_desc_scheme")
    public String discountsDescScheme;
    @SerializedName("icon_url")
    public String icon_url;
    @SerializedName("id")
    public long id;
    @SerializedName("info")
    public String info;
    @SerializedName("info_highlight")
    public boolean infoHighlight;
    @SerializedName("name")
    public String name;
    @SerializedName("redio_info")
    public com.sankuai.waimai.business.order.api.submit.model.a redioInfo;
    @SerializedName("reduce_fee")
    public double reduceFee;
    @SerializedName("type")
    public int type;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b implements Serializable {
        public static ChangeQuickRedirect a = null;
        private static final long serialVersionUID = -7768504937454096578L;
        @SerializedName("add_on_item_key")
        public String b;
        @SerializedName("add_on_item_tip")
        public String c;
        @SerializedName(DynamicTitleParser.PARSER_KEY_ELEMENTS)
        public List<a> d;
        @SerializedName("current")
        public double e;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        public static ChangeQuickRedirect a = null;
        private static final long serialVersionUID = 1300377705864383374L;
        @SerializedName(PayLabel.ITEM_TYPE_DISCOUNT)
        public double b;
        @SerializedName("reached_tip")
        public String c;
        @SerializedName("current_threshold")
        private double d;

        public final int a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff67a4390947d8ccdb37c9f05c06f4f9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff67a4390947d8ccdb37c9f05c06f4f9")).intValue() : Double.valueOf(this.d).intValue();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c implements Serializable {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;

        public static c a(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed18b5073f34da51b874801ed45fa752", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed18b5073f34da51b874801ed45fa752");
            }
            if (jSONObject == null) {
                return null;
            }
            c cVar = new c();
            cVar.b = jSONObject.optString("color");
            cVar.c = jSONObject.optString("reason");
            return cVar;
        }
    }

    public static DiscountItem fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        com.sankuai.waimai.business.order.api.submit.model.a aVar = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "02f81d75e160ff166bbe9bb6424085ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (DiscountItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "02f81d75e160ff166bbe9bb6424085ff");
        }
        if (jSONObject == null) {
            return null;
        }
        DiscountItem discountItem = new DiscountItem();
        discountItem.id = jSONObject.optLong("id", 0L);
        discountItem.name = jSONObject.optString("name");
        discountItem.icon_url = jSONObject.optString("icon_url");
        discountItem.info = jSONObject.optString("info");
        discountItem.type = jSONObject.optInt("type");
        discountItem.reduceFee = jSONObject.optDouble("reduce_fee");
        discountItem.couponSign = jSONObject.optString("coupon_sign");
        discountItem.activityTip = jSONObject.optString("activity_tip");
        discountItem.infoHighlight = jSONObject.optBoolean("info_highlight", false);
        discountItem.discountsDescScheme = jSONObject.optString("discounts_desc_scheme");
        discountItem.collectOrderStagePreview = CollectOrder.fromJson(jSONObject.optJSONObject("collect_order_stage_preview"));
        JSONObject optJSONObject = jSONObject.optJSONObject("redio_info");
        Object[] objArr2 = {optJSONObject};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.order.api.submit.model.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "1101e4d01c71a3fe98442572875c92f1", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (com.sankuai.waimai.business.order.api.submit.model.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "1101e4d01c71a3fe98442572875c92f1");
        } else if (optJSONObject != null) {
            aVar = new com.sankuai.waimai.business.order.api.submit.model.a();
            aVar.b = optJSONObject.optBoolean("show", false);
            aVar.c = optJSONObject.optInt(DMKeys.KEY_SELECTED, 0);
        }
        discountItem.redioInfo = aVar;
        discountItem.allowanceTip = c.a(jSONObject.optJSONObject("allowance_tip"));
        discountItem.discountDetailInfo = d.a(jSONObject.optJSONObject("discount_detail_info"));
        discountItem.discountItems = fromJsonArray(jSONObject.optJSONArray("discount_items"));
        return discountItem;
    }

    public static List<DiscountItem> fromJsonArray(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "342646c2002160fdcc0b2b68fcb9034c", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "342646c2002160fdcc0b2b68fcb9034c");
        }
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            DiscountItem fromJson = fromJson(jSONArray.optJSONObject(i));
            if (fromJson != null) {
                arrayList.add(fromJson);
            }
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class d implements Serializable {
        public static ChangeQuickRedirect a;
        @SerializedName("rule_url")
        public String b;
        @SerializedName("rate")
        public String c;
        @SerializedName("tip")
        public f d;
        @SerializedName(SocialConstants.PARAM_ACT)
        public a e;

        /* compiled from: ProGuard */
        /* loaded from: classes4.dex */
        public static class a implements Serializable {
            @SerializedName("type")
            public int a;
            @SerializedName("need_show_act")
            public boolean b;
            @SerializedName("reduction")
            public e c;
            @SerializedName("foodList")
            public List<c> d;
        }

        /* compiled from: ProGuard */
        /* loaded from: classes4.dex */
        public static class b implements Serializable {
            public static ChangeQuickRedirect a;
            @SerializedName("id")
            public long b;
            @SerializedName("value")
            public String c;
        }

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.business.order.api.submit.model.DiscountItem$d$d  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0755d implements Serializable {
            @SerializedName("text")
            public String a;
            @SerializedName("font_color")
            public String b;
        }

        /* compiled from: ProGuard */
        /* loaded from: classes4.dex */
        public static class e implements Serializable {
            @SerializedName("tip")
            public String a;
            @SerializedName(PayLabelConstants.TYPE_REDUCE)
            public String b;
        }

        /* compiled from: ProGuard */
        /* loaded from: classes4.dex */
        public static class f implements Serializable {
            @SerializedName(PayLabelConstants.TYPE_REDUCE)
            public String a;
            @SerializedName("need_show_msg")
            public boolean b;
            @SerializedName("msg")
            public C0755d c;
        }

        public static d a(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a036f0d9b45733c327f2266a6d6a722", RobustBitConfig.DEFAULT_VALUE)) {
                return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a036f0d9b45733c327f2266a6d6a722");
            }
            if (jSONObject == null) {
                return null;
            }
            d dVar = new d();
            dVar.b = jSONObject.optString("rule_url");
            dVar.c = jSONObject.optString("rate");
            JSONObject optJSONObject = jSONObject.optJSONObject("tip");
            if (optJSONObject != null) {
                f fVar = new f();
                fVar.a = optJSONObject.optString(PayLabelConstants.TYPE_REDUCE);
                fVar.b = optJSONObject.optBoolean("need_show_msg");
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("msg");
                if (optJSONObject2 != null) {
                    C0755d c0755d = new C0755d();
                    c0755d.a = optJSONObject2.optString("text");
                    c0755d.b = optJSONObject2.optString("font_color");
                    fVar.c = c0755d;
                }
                dVar.d = fVar;
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject(SocialConstants.PARAM_ACT);
            if (optJSONObject3 != null) {
                a aVar = new a();
                aVar.a = optJSONObject3.optInt("type");
                aVar.b = optJSONObject3.optBoolean("need_show_act");
                JSONObject optJSONObject4 = optJSONObject3.optJSONObject("reduction");
                if (optJSONObject4 != null) {
                    e eVar = new e();
                    eVar.a = optJSONObject4.optString("tip");
                    eVar.b = optJSONObject4.optString(PayLabelConstants.TYPE_REDUCE);
                    aVar.c = eVar;
                }
                JSONArray optJSONArray = optJSONObject3.optJSONArray("foodList");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        arrayList.add(c.a(optJSONArray.optJSONObject(i)));
                    }
                    aVar.d = arrayList;
                }
                dVar.e = aVar;
            }
            return dVar;
        }

        /* compiled from: ProGuard */
        /* loaded from: classes4.dex */
        public static class c implements Serializable {
            public static ChangeQuickRedirect a;
            @SerializedName("picture")
            public String b;
            @SerializedName("food_label_url")
            public String c;
            @SerializedName("count")
            public int d;
            @SerializedName("skuId")
            public int e;
            @SerializedName("spuId")
            public int f;
            @SerializedName("name")
            public String g;
            @SerializedName("tip")
            public String h;
            @SerializedName(PayLabelConstants.TYPE_REDUCE)
            public String i;
            @SerializedName("attrs")
            public List<b> j;

            public static c a(JSONObject jSONObject) {
                b bVar;
                Object[] objArr = {jSONObject};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58669057e71c7ebd5c723bbfaf52861f", RobustBitConfig.DEFAULT_VALUE)) {
                    return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58669057e71c7ebd5c723bbfaf52861f");
                }
                if (jSONObject == null) {
                    return null;
                }
                c cVar = new c();
                cVar.b = jSONObject.optString("picture");
                cVar.c = jSONObject.optString("food_label_url");
                cVar.d = jSONObject.optInt("count");
                cVar.e = jSONObject.optInt("skuId");
                cVar.f = jSONObject.optInt("spuId");
                cVar.g = jSONObject.optString("name");
                cVar.h = jSONObject.optString("tip");
                cVar.i = jSONObject.optString(PayLabelConstants.TYPE_REDUCE);
                JSONArray optJSONArray = jSONObject.optJSONArray("attrs");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        Object[] objArr2 = {optJSONObject};
                        ChangeQuickRedirect changeQuickRedirect2 = b.a;
                        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "070efb9f58d96da09fe29a9da14172e1", RobustBitConfig.DEFAULT_VALUE)) {
                            bVar = (b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "070efb9f58d96da09fe29a9da14172e1");
                        } else if (optJSONObject == null) {
                            bVar = null;
                        } else {
                            b bVar2 = new b();
                            bVar2.b = optJSONObject.optInt("id");
                            bVar2.c = optJSONObject.optString("value");
                            bVar = bVar2;
                        }
                        arrayList.add(bVar);
                    }
                    cVar.j = arrayList;
                }
                return cVar;
            }
        }
    }
}
