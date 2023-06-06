package com.sankuai.waimai.business.restaurant.base.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttrList;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.poi.PoiItem;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class RecommendPackage {
    public static final String TAG_GOODS_ITEM = "Recommend_Package_Recommend_goods";
    public static final String TAG_NON_GOODS_ITEM = "Recommend_Package_Recommend_non_goods";
    public static final String TAG_RECOMMEND_ITEM = "Recommend_Package_Recommend_item";
    public static final String TAG_TITLE = "Recommend_Package_Title";
    public static final int TEMPLATE_DOUBLE_ROW = 0;
    public static final int TEMPLATE_SINGLE_ROW = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    public d mRecommendTitle;
    public int mSpuType;
    public int orderAction;
    public ArrayList<a> recommendItemList;
    public int templateType;

    public RecommendPackage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d6e06e3e5d746742a5f2af8740b891f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d6e06e3e5d746742a5f2af8740b891f");
        } else {
            this.mSpuType = -1;
        }
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c87a34b9d5e21f76ff42dbc2a842eda1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c87a34b9d5e21f76ff42dbc2a842eda1");
        } else if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("recommend_title");
            this.templateType = jSONObject.optInt("template_type");
            this.orderAction = jSONObject.optInt("order_action");
            this.mRecommendTitle = new d();
            d dVar = this.mRecommendTitle;
            Object[] objArr2 = {optJSONObject};
            ChangeQuickRedirect changeQuickRedirect3 = d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect3, false, "3e69c011632610d7051a00eaa641eb57", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect3, false, "3e69c011632610d7051a00eaa641eb57");
            } else if (optJSONObject != null) {
                JSONArray optJSONArray = optJSONObject.optJSONArray("product_image_list");
                if (optJSONArray != null) {
                    dVar.b = new ArrayList<>();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        try {
                            dVar.b.add(optJSONArray.getString(i));
                        } catch (JSONException e) {
                            com.sankuai.waimai.imbase.log.a.a(e);
                        }
                    }
                }
                dVar.c = optJSONObject.optString("show_text");
            }
            this.mSpuType = jSONObject.optInt("spu_type", -1);
            JSONArray optJSONArray2 = jSONObject.optJSONArray("recommend_item");
            if (optJSONArray2 != null) {
                this.recommendItemList = new ArrayList<>();
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                    a aVar = new a();
                    aVar.a(optJSONObject2);
                    this.recommendItemList.add(aVar);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class d extends PoiItem {
        public static ChangeQuickRedirect a;
        @SerializedName("product_image_list")
        public ArrayList<String> b;
        @SerializedName("show_text")
        public String c;

        @Override // com.sankuai.waimai.platform.domain.core.poi.PoiItem, com.sankuai.waimai.platform.domain.core.poi.IPoiItem
        public final String getTag() {
            return RecommendPackage.TAG_TITLE;
        }

        @Override // com.sankuai.waimai.platform.domain.core.poi.PoiItem
        public final void setTag(String str) {
        }

        public d() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends PoiItem {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public String d;
        public String e;
        public double f;
        public double g;
        public long h;
        public ArrayList<c> i;
        public List<C0822a> j;

        @Override // com.sankuai.waimai.platform.domain.core.poi.PoiItem, com.sankuai.waimai.platform.domain.core.poi.IPoiItem
        public final String getTag() {
            return RecommendPackage.TAG_RECOMMEND_ITEM;
        }

        @Override // com.sankuai.waimai.platform.domain.core.poi.PoiItem
        public final void setTag(String str) {
        }

        public final void a(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14731e941f5bdf966d4a0fe7a37cba1b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14731e941f5bdf966d4a0fe7a37cba1b");
            } else if (jSONObject != null) {
                this.b = jSONObject.optString("title");
                this.d = jSONObject.optString("sub_title");
                this.e = jSONObject.optString("activity_tips");
                this.f = jSONObject.optDouble("price");
                this.g = jSONObject.optDouble("origin_price");
                this.h = jSONObject.optLong("group_id");
                this.c = jSONObject.optString("entrance_title");
                JSONArray optJSONArray = jSONObject.optJSONArray("product_list");
                if (optJSONArray != null) {
                    this.i = new ArrayList<>();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        b bVar = new b();
                        bVar.parseJson(optJSONObject);
                        this.i.add(bVar.a(bVar));
                    }
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("price_list");
                if (optJSONArray2 != null) {
                    this.j = new ArrayList();
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                        C0822a c0822a = new C0822a();
                        Object[] objArr2 = {optJSONObject2};
                        ChangeQuickRedirect changeQuickRedirect2 = C0822a.a;
                        if (PatchProxy.isSupport(objArr2, c0822a, changeQuickRedirect2, false, "63acae2e66fb501f4cc7ca2a9ccd74ea", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, c0822a, changeQuickRedirect2, false, "63acae2e66fb501f4cc7ca2a9ccd74ea");
                        } else if (optJSONObject2 != null) {
                            c0822a.b = optJSONObject2.optString("name");
                            c0822a.c = optJSONObject2.optDouble("price");
                            c0822a.d = optJSONObject2.optInt("count");
                            c0822a.e = optJSONObject2.optString(RemoteMessageConst.Notification.ICON);
                        }
                        this.j.add(c0822a);
                    }
                }
            }
        }

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.business.restaurant.base.repository.model.RecommendPackage$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public class C0822a implements Serializable {
            public static ChangeQuickRedirect a;
            public String b;
            public double c;
            public int d;
            public String e;

            public C0822a() {
                Object[] objArr = {a.this};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73d43b26b3f652acd937a17e182ebcc5", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73d43b26b3f652acd937a17e182ebcc5");
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b extends RecommendProductItem {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public int d;
        public f e;

        @Override // com.sankuai.waimai.business.restaurant.base.repository.model.RecommendProductItem
        public final void parseJson(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35a9dbd5eb0edfbeb3298de397f7ff88", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35a9dbd5eb0edfbeb3298de397f7ff88");
            } else if (jSONObject != null) {
                super.parseJson(jSONObject);
                this.b = jSONObject.optString("package_info_label");
                this.d = jSONObject.optInt("current_product");
                this.c = jSONObject.optString("package_info_label_new");
                JSONObject optJSONObject = jSONObject.optJSONObject("package_product");
                this.e = new f();
                f fVar = this.e;
                Object[] objArr2 = {optJSONObject};
                ChangeQuickRedirect changeQuickRedirect2 = f.a;
                if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "88fdefc73af351402b25219538ee666f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "88fdefc73af351402b25219538ee666f");
                } else if (optJSONObject != null) {
                    fVar.b = optJSONObject.optString("package_title");
                    fVar.d = optJSONObject.optString("package_icon");
                    fVar.e = optJSONObject.optInt("show_sequence");
                    JSONArray optJSONArray = optJSONObject.optJSONArray("package_attr");
                    if (optJSONArray != null) {
                        int length = optJSONArray.length();
                        fVar.c = new String[length];
                        for (int i = 0; i < length; i++) {
                            fVar.c[i] = optJSONArray.optString(i);
                        }
                    }
                }
            }
        }

        public final c a(b bVar) {
            GoodsSpu goodsSpu;
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da383a893d943d99b96421e10f3b943f", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da383a893d943d99b96421e10f3b943f");
            }
            c cVar = new c();
            cVar.a = bVar.id;
            GoodsSku goodsSku = null;
            Iterator<GoodsSku> it = bVar.skuList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                GoodsSku next = it.next();
                if (next != null) {
                    goodsSku = next;
                    break;
                }
            }
            if (goodsSku != null) {
                cVar.b = goodsSku.getSkuId();
                cVar.c = goodsSku.getCount();
                cVar.e = goodsSku.getSpecDesc();
                cVar.d = goodsSku.price;
                cVar.l = goodsSku;
            }
            cVar.f = bVar.name;
            if (bVar.productMedia != null && !com.sankuai.waimai.foundation.utils.b.b(bVar.productMedia)) {
                Iterator<com.sankuai.waimai.platform.domain.core.goods.e> it2 = bVar.productMedia.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    com.sankuai.waimai.platform.domain.core.goods.e next2 = it2.next();
                    if (next2 != null && next2.b == 0) {
                        cVar.g = next2.c;
                        break;
                    }
                }
            }
            if (!com.sankuai.waimai.foundation.utils.b.b(bVar.attrList)) {
                Iterator<GoodsAttrList> it3 = bVar.attrList.iterator();
                loop2: while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    GoodsAttrList next3 = it3.next();
                    if (next3 != null) {
                        for (GoodsAttr goodsAttr : next3.getValues()) {
                            if (goodsAttr != null) {
                                cVar.h = goodsAttr.getValue();
                                break loop2;
                            }
                        }
                        continue;
                    }
                }
            }
            cVar.i = bVar.b;
            cVar.j = bVar.c;
            cVar.k = bVar.d;
            Object[] objArr2 = {bVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b8df7e60d1f4787f8a32005f44a1859f", RobustBitConfig.DEFAULT_VALUE)) {
                goodsSpu = (GoodsSpu) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b8df7e60d1f4787f8a32005f44a1859f");
            } else {
                goodsSpu = new GoodsSpu();
                goodsSpu.id = bVar.id;
                goodsSpu.name = bVar.name;
                goodsSpu.activityTag = bVar.activityTag;
                goodsSpu.physicalTag = bVar.tag;
                goodsSpu.minPrice = bVar.minSkuPrice;
                goodsSpu.attrs = bVar.attrList;
                goodsSpu.setAttrListMap(goodsSpu.attrs);
                goodsSpu.skus = bVar.skuList;
            }
            cVar.m = goodsSpu;
            cVar.m.picture = cVar.g;
            cVar.p = bVar.e;
            ArrayList arrayList = new ArrayList();
            if (cVar.m.getAttrListMap() != null) {
                for (List<GoodsAttr> list : cVar.m.getAttrListMap().values()) {
                    if (!com.sankuai.waimai.foundation.utils.b.b(list)) {
                        for (GoodsAttr goodsAttr2 : list) {
                            if (goodsAttr2 != null) {
                                arrayList.add(goodsAttr2);
                            }
                        }
                    }
                }
            }
            if (!com.sankuai.waimai.foundation.utils.b.b(arrayList)) {
                cVar.o = new GoodsAttr[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    cVar.o[i] = (GoodsAttr) arrayList.get(i);
                }
            }
            cVar.n = bVar.scheme;
            return cVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c implements Serializable {
        public long a;
        public long b;
        public int c;
        public double d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public int k;
        public GoodsSku l;
        public GoodsSpu m;
        public String n;
        public GoodsAttr[] o;
        public f p;
    }
}
