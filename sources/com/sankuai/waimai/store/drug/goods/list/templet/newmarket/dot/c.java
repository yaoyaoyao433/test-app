package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.dot;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.View;
import com.huawei.hms.actions.SearchIntents;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodTopLabel;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsLogField;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.util.j;
import com.sankuai.waimai.store.util.k;
import com.sankuai.waimai.store.util.n;
import com.sankuai.waimai.store.util.y;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    @NonNull
    protected final a b;
    @NonNull
    protected final h c;

    public c(@NonNull h hVar, @NonNull Context context) {
        Object[] objArr = {hVar, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aca9d3e046dcb2717862c35773131fd3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aca9d3e046dcb2717862c35773131fd3");
            return;
        }
        this.c = hVar;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        this.b = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe914a58d83178427610a7d3ab3d6d98", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe914a58d83178427610a7d3ab3d6d98") : new b(context, this.c.g());
    }

    private void a(@NonNull Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbe192d0b15db5bd4e20eb806526b349", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbe192d0b15db5bd4e20eb806526b349");
            return;
        }
        com.sankuai.waimai.store.platform.domain.manager.poi.a q = this.c.q();
        map.put("poi_id", q.d());
        map.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(q.v()));
    }

    public final void a(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c10c4ccb11b06753325687d438f735ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c10c4ccb11b06753325687d438f735ec");
        } else if (goodsPoiCategory == null || goodsSpu == null) {
        } else {
            HashMap hashMap = new HashMap();
            a(hashMap);
            GoodsPoiCategory n = this.c.n();
            if (n != null) {
                int u = this.c.u();
                hashMap.put(DataConstants.CATEGORY_ID, n.getTagCode());
                hashMap.put("category_name", n.getTagName());
                hashMap.put("category_index", Integer.valueOf(u));
                hashMap.put("category_type", Integer.valueOf(n.type));
            }
            hashMap.put("spu_id", Long.valueOf(goodsSpu.id));
            hashMap.put("index", 9999);
            hashMap.put("goods_type", Integer.valueOf(goodsSpu.mSaleType));
            this.b.a("b_waimai_waimai_presales_buy_mc", hashMap);
        }
    }

    public final void a(GoodsPoiCategory goodsPoiCategory, int i, View view, int i2) {
        Object[] objArr = {goodsPoiCategory, Integer.valueOf(i), view, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e92cb95e2462ae97ea92d4d1ef889916", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e92cb95e2462ae97ea92d4d1ef889916");
            return;
        }
        GoodsPoiCategory n = this.c.n();
        if (n == null || goodsPoiCategory == null) {
            return;
        }
        int u = this.c.u();
        HashMap hashMap = new HashMap();
        a(hashMap);
        hashMap.put("stid", d());
        hashMap.put("fst_cat_name", n.getTagName());
        hashMap.put("fst_cat_id", n.getTagCode());
        hashMap.put("fst_cat_index", Integer.valueOf(u));
        hashMap.put("sec_cat_id", goodsPoiCategory.getTagCode());
        hashMap.put("sec_cat_index", Integer.valueOf(i));
        hashMap.put("index", Integer.valueOf(i));
        if (!t.a(goodsPoiCategory.rankTraceId)) {
            hashMap.put("rankTraceId", goodsPoiCategory.rankTraceId);
        }
        a(hashMap, goodsPoiCategory);
        a aVar = this.b;
        aVar.a("b_qOqsq", hashMap, view, goodsPoiCategory.getTagCode() + i2 + "b_qOqsq");
    }

    public final void a(View view, GoodsSpu goodsSpu, Map<String, String> map) {
        Object[] objArr = {view, goodsSpu, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88747c854a65046f51aeac46321cc111", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88747c854a65046f51aeac46321cc111");
        } else if (goodsSpu == null || map == null) {
        } else {
            com.sankuai.waimai.store.platform.domain.manager.poi.a q = this.c.q();
            HashMap hashMap = new HashMap();
            hashMap.putAll(map);
            hashMap.put("stid", d());
            hashMap.put("spu_id", Long.valueOf(goodsSpu.getId()));
            hashMap.put("poi_id", q.d());
            com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_3vggekx6_mv", view);
            bVar.b(hashMap);
            bVar.e();
        }
    }

    public final void a(GoodsSpu goodsSpu, Map<String, String> map) {
        Object[] objArr = {goodsSpu, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2421cc806392a850063dc4795384037", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2421cc806392a850063dc4795384037");
        } else if (goodsSpu == null || map == null) {
        } else {
            com.sankuai.waimai.store.platform.domain.manager.poi.a q = this.c.q();
            HashMap hashMap = new HashMap();
            hashMap.putAll(map);
            hashMap.put("stid", d());
            hashMap.put("spu_id", Long.valueOf(goodsSpu.getId()));
            hashMap.put("poi_id", q.d());
            this.b.a("b_waimai_3vggekx6_mc", hashMap);
        }
    }

    private void a(Map<String, Object> map, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {map, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb495e60befd30eac04a6c9a2f3dca52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb495e60befd30eac04a6c9a2f3dca52");
        } else if (goodsPoiCategory == null || goodsPoiCategory.receiveCouponTip == null) {
        } else {
            map.put("coupon_id", Long.valueOf(goodsPoiCategory.receiveCouponTip.couponId));
            map.put("status", Integer.valueOf(goodsPoiCategory.receiveCouponTip.couponStatus));
            map.put("coupon_source", Integer.valueOf(goodsPoiCategory.receiveCouponTip.couponType));
        }
    }

    public final void a(GoodsPoiCategory goodsPoiCategory, int i, int i2) {
        Object[] objArr = {goodsPoiCategory, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ea321b04726eeedd809645cc58f6281", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ea321b04726eeedd809645cc58f6281");
            return;
        }
        GoodsPoiCategory n = this.c.n();
        if (n == null || goodsPoiCategory == null) {
            return;
        }
        int u = this.c.u();
        HashMap hashMap = new HashMap();
        a(hashMap);
        hashMap.put("stid", d());
        hashMap.put("fst_cat_name", n.getTagName());
        hashMap.put("fst_cat_id", n.getTagCode());
        hashMap.put("fst_cat_index", Integer.valueOf(u));
        hashMap.put("sec_cat_id", goodsPoiCategory.getTagCode());
        hashMap.put("sec_cat_index", Integer.valueOf(i));
        hashMap.put("index", Integer.valueOf(i));
        hashMap.put("scene_id", Integer.valueOf(i2));
        if (!t.a(goodsPoiCategory.rankTraceId)) {
            hashMap.put("rankTraceId", goodsPoiCategory.rankTraceId);
        }
        a(hashMap, goodsPoiCategory);
        this.b.a("b_wiPlE", hashMap);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc8488d9a6351f8323920019bc23d2b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc8488d9a6351f8323920019bc23d2b2");
            return;
        }
        HashMap hashMap = new HashMap();
        a(hashMap);
        a aVar = this.b;
        Object[] objArr2 = {"b_4UpWy", hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "61292cc3f783120c7d752948dc93c857", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "61292cc3f783120c7d752948dc93c857");
        } else {
            com.sankuai.waimai.store.manager.judas.b.c(aVar.c, "b_4UpWy").b(hashMap).a(AppUtil.generatePageInfoKey(aVar.b)).a();
        }
    }

    public final void a(GoodsPoiCategory goodsPoiCategory, int i) {
        Object[] objArr = {goodsPoiCategory, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4998bf44c4db0621b2012dd845fe911", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4998bf44c4db0621b2012dd845fe911");
        } else if (goodsPoiCategory == null) {
        } else {
            HashMap hashMap = new HashMap();
            a(hashMap);
            hashMap.put("category_name", goodsPoiCategory.getTagName());
            hashMap.put("category_index", Integer.valueOf(i));
            hashMap.put(DataConstants.CATEGORY_ID, goodsPoiCategory.getTagCode());
            hashMap.put("category_type", Integer.valueOf(goodsPoiCategory.type));
            hashMap.put(SearchIntents.EXTRA_QUERY, goodsPoiCategory.activityInfo == null ? "" : goodsPoiCategory.activityInfo.activityText);
            this.b.a("b_MOzqJ", hashMap);
        }
    }

    public final void a(GoodsPoiCategory goodsPoiCategory, int i, View view) {
        Object[] objArr = {goodsPoiCategory, Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64e9db022408728430631a0652870e00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64e9db022408728430631a0652870e00");
        } else if (goodsPoiCategory == null) {
        } else {
            HashMap hashMap = new HashMap();
            a(hashMap);
            hashMap.put("category_name", goodsPoiCategory.getTagName());
            hashMap.put("category_index", Integer.valueOf(i));
            hashMap.put(DataConstants.CATEGORY_ID, goodsPoiCategory.getTagCode());
            hashMap.put("category_type", Integer.valueOf(goodsPoiCategory.type));
            hashMap.put("stid", d());
            hashMap.put("index", Integer.valueOf(i));
            hashMap.put(SearchIntents.EXTRA_QUERY, goodsPoiCategory.activityInfo == null ? "" : goodsPoiCategory.activityInfo.activityText);
            a aVar = this.b;
            aVar.a("b_waimai_sg_90uw7iuh_mv", hashMap, view, goodsPoiCategory.getTagCode() + "b_waimai_sg_90uw7iuh_mv");
        }
    }

    private String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8563b5eaff05e41e2193e812682d9996", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8563b5eaff05e41e2193e812682d9996") : (this.c == null || this.c.q() == null || this.c.q().b == null || t.a(this.c.q().b.abExpInfo)) ? "-999" : this.c.q().b.abExpInfo;
    }

    public final void a(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba785044599b2d8649a8e9282efbdb88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba785044599b2d8649a8e9282efbdb88");
            return;
        }
        ArrayMap arrayMap = new ArrayMap();
        a(arrayMap);
        arrayMap.put("banner_id", Long.valueOf(j));
        arrayMap.put("index", Integer.valueOf(i));
        this.b.a("b_wpDVN", arrayMap);
    }

    public final void a(int i, View view) {
        Object[] objArr = {Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d58c7a229eac84a18d2ba3c27cf413e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d58c7a229eac84a18d2ba3c27cf413e");
            return;
        }
        HashMap hashMap = new HashMap();
        a(hashMap);
        hashMap.put("index", Integer.valueOf(i));
        a aVar = this.b;
        aVar.a("b_rqzXO", hashMap, view, i + "-b_rqzXO");
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fca6b97ea4e9782320735b6e719a9e1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fca6b97ea4e9782320735b6e719a9e1f");
        } else {
            this.b.a(view);
        }
    }

    public final void a(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu, View view, HandPriceInfo handPriceInfo) {
        String str;
        Object[] objArr = {goodsPoiCategory, goodsSpu, view, handPriceInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b727bea156fc139b70f05308e6fb865a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b727bea156fc139b70f05308e6fb865a");
        } else if (goodsSpu == null || goodsPoiCategory == null) {
        } else {
            int i = (this.c == null || this.c.q() == null || k.b(this.c.q().b, goodsSpu) == null) ? 0 : 1;
            final Map<String, Object> f = f(goodsPoiCategory, goodsSpu);
            f.put("sg_spu_tag", Integer.valueOf(goodsSpu.isFreeget ? 1 : 0));
            f.put("activity_id", goodsSpu.isFreeget ? goodsSpu.activityID : "");
            f.put("food_activity_type", Integer.valueOf(goodsSpu.activityType));
            f.put("stock", Integer.valueOf(1 != goodsSpu.getStatus() ? 1 : 0));
            f.put("card_type", Integer.valueOf(!TextUtils.isEmpty(goodsSpu.praiseRate) ? 1 : 0));
            f.put("show_type", TextUtils.isEmpty(goodsSpu.coverUrl) ? "1" : "2");
            f.put("spu_search_type", Integer.valueOf(goodsSpu.spuSearchType));
            f.put("property_tag", Integer.valueOf(e(goodsSpu)));
            f.put("variedproperty_tag", Integer.valueOf(f(goodsSpu)));
            f.put("medicine_activity_type", goodsSpu.getActivityId());
            f.put("upc_id", goodsSpu.getUPCCode());
            if (!t.a(goodsSpu.rankTraceId)) {
                f.put("rankTraceId", goodsSpu.rankTraceId);
            }
            String a2 = j.a(goodsSpu.getPicture());
            if (TextUtils.isEmpty(a2)) {
                str = this.c.z();
            } else {
                str = a2 + ";" + this.c.z();
            }
            f.put("stid", str);
            f.put("spu_tag", handPriceInfo == null ? "" : handPriceInfo.getHandPriceLabel());
            f.put("final_price", Integer.valueOf(i));
            y.a(goodsSpu.productTopLabels, goodsSpu.recommendReason, new y.a() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.dot.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.y.a
                public final void a(@NonNull String str2) {
                    Object[] objArr2 = {str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d7803f97d5760a0913488c6cf684566a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d7803f97d5760a0913488c6cf684566a");
                        return;
                    }
                    f.put("recommend", 1);
                    f.put("rank_label_info", -999);
                    f.put("rank_label_text", -999);
                }

                @Override // com.sankuai.waimai.store.util.y.a
                public final void a(@NonNull GoodTopLabel goodTopLabel) {
                    Object[] objArr2 = {goodTopLabel};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b5198b27e54ebfdaab9a34bdee7ef5e4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b5198b27e54ebfdaab9a34bdee7ef5e4");
                        return;
                    }
                    f.put("recommend", 0);
                    f.put("rank_label_info", Integer.valueOf(goodTopLabel.rankCode));
                    f.put("rank_label_text", goodTopLabel.content);
                }

                @Override // com.sankuai.waimai.store.util.y.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "432f71382cd516f4a2fc689d1d966944", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "432f71382cd516f4a2fc689d1d966944");
                        return;
                    }
                    f.put("recommend", 0);
                    f.put("rank_label_info", -999);
                    f.put("rank_label_text", -999);
                }
            });
            this.b.a("b_Wl3cp", f, view, goodsPoiCategory.getTagCode() + CommonConstant.Symbol.MINUS + goodsSpu.id + "-b_Wl3cp");
        }
    }

    public final void a(GoodsSpu goodsSpu, String str, View view) {
        Object[] objArr = {goodsSpu, str, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae8d5b37633383e6c325dbf5506c2619", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae8d5b37633383e6c325dbf5506c2619");
        } else if (goodsSpu == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("poi_id", str);
            hashMap.put("spu_id", String.valueOf(goodsSpu.id));
            String str2 = t.a(goodsSpu.physicalTag) ? "" : goodsSpu.physicalTag;
            a aVar = this.b;
            aVar.a("b_waimai_sg_xobjm6dr_mv", hashMap, view, str2 + CommonConstant.Symbol.MINUS + goodsSpu.id + "-b_waimai_sg_xobjm6dr_mv");
        }
    }

    public final void b(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        String str;
        int i = 0;
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d8494ffdba89c5a5018e73deef087be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d8494ffdba89c5a5018e73deef087be");
        } else if (goodsSpu == null || goodsPoiCategory == null) {
        } else {
            if (this.c != null && this.c.q() != null && !com.sankuai.waimai.store.order.a.e().i(this.c.q().d()) && k.b(this.c.q().b, goodsSpu) != null) {
                i = 1;
            }
            Map<String, Object> f = f(goodsPoiCategory, goodsSpu);
            f.put("sg_spu_tag", Integer.valueOf(goodsSpu.isFreeget ? 1 : 0));
            f.put("activity_id", goodsSpu.isFreeget ? goodsSpu.activityID : "");
            f.put("food_activity_type", Integer.valueOf(goodsSpu.activityType));
            f.put("card_type", Integer.valueOf(!TextUtils.isEmpty(goodsSpu.praiseRate) ? 1 : 0));
            f.put("show_type", TextUtils.isEmpty(goodsSpu.coverUrl) ? "1" : "2");
            f.put("spu_search_type", Integer.valueOf(goodsSpu.spuSearchType));
            f.put("property_tag", Integer.valueOf(e(goodsSpu)));
            f.put("variedproperty_tag", Integer.valueOf(f(goodsSpu)));
            if (!t.a(goodsSpu.rankTraceId)) {
                f.put("rankTraceId", goodsSpu.rankTraceId);
            }
            f.put("final_price", Integer.valueOf(i));
            f.put("medicine_activity_type", goodsSpu.getActivityId());
            f.put("upc_id", goodsSpu.getUPCCode());
            String a2 = j.a(goodsSpu.getPicture());
            if (TextUtils.isEmpty(a2)) {
                str = this.c.z();
            } else {
                str = a2 + ";" + this.c.z();
            }
            f.put("stid", str);
            this.b.a("b_sct3Y", f);
        }
    }

    @NonNull
    private Map<String, Object> f(@NonNull GoodsPoiCategory goodsPoiCategory, @NonNull GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73900313026342bb3503b44f40d8cd01", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73900313026342bb3503b44f40d8cd01");
        }
        HashMap hashMap = new HashMap();
        GoodsPoiCategory n = this.c.n();
        if (n == null) {
            return hashMap;
        }
        int u = this.c.u();
        int v = this.c.v();
        a(hashMap);
        hashMap.put("spu_id", Long.valueOf(goodsSpu.id));
        hashMap.put("trace_id", t.a(goodsPoiCategory.traceId) ? -999 : goodsPoiCategory.traceId);
        hashMap.put(DataConstants.CATEGORY_ID, n.getTagCode());
        hashMap.put("category_name", n.getTagName());
        hashMap.put("category_index", Integer.valueOf(u));
        hashMap.put("category_type", Integer.valueOf(n.type));
        boolean z = goodsPoiCategory != n;
        String tagName = z ? goodsPoiCategory.getTagName() : "";
        hashMap.put("category_sec_id", z ? goodsPoiCategory.getTagCode() : "");
        hashMap.put("category_sec_index", Integer.valueOf(v));
        hashMap.put("category_sec_name", tagName);
        hashMap.put("spu_type", Integer.valueOf(goodsSpu.activityType));
        hashMap.put("product_index", 9999);
        hashMap.put("rec_trace_id", "");
        hashMap.put("has_menu_spu", Integer.valueOf(goodsSpu.getRecipeMenuTypeForJudas()));
        GoodsSku goodsSku = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.getSkuList(), 0);
        hashMap.put("sku_id", goodsSku == null ? "" : Long.valueOf(goodsSku.getSkuId()));
        hashMap.put("friend_praise", Integer.valueOf(!TextUtils.isEmpty(goodsSpu.getFriendPraiseContent()) ? 1 : 0));
        GoodsLogField goodLogField = goodsSpu.getGoodLogField();
        hashMap.put("product_tag", goodLogField != null ? goodLogField.getLabelTypeList() : "");
        hashMap.put("ad", c(goodsSpu));
        hashMap.put("is_ad", goodsSpu.isAd ? "1" : "0");
        return hashMap;
    }

    private static String c(@NonNull GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "607d9e2a6c8a06c59ef7c4aed09274df", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "607d9e2a6c8a06c59ef7c4aed09274df");
        }
        if (goodsSpu.isAd) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adChargeInfo", n.a(goodsSpu.chargeInfo));
                return jSONObject.toString();
            } catch (JSONException e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
        return "";
    }

    public final void c(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        int i = 0;
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f73c2f95f7bade9676a4e99e0d9b943e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f73c2f95f7bade9676a4e99e0d9b943e");
            return;
        }
        if (this.c != null && this.c.q() != null && !com.sankuai.waimai.store.order.a.e().i(this.c.q().d()) && k.b(this.c.q().b, goodsSpu) != null) {
            i = 1;
        }
        Map<String, Object> f = f(goodsPoiCategory, goodsSpu);
        f.put("sg_spu_tag", Integer.valueOf(goodsSpu.isFreeget ? 1 : 0));
        f.put("activity_id", goodsSpu.isFreeget ? goodsSpu.activityID : "");
        f.put("food_activity_type", Integer.valueOf(goodsSpu.activityType));
        f.put("stid", d(goodsSpu));
        f.put("spu_search_type", Integer.valueOf(goodsSpu.spuSearchType));
        f.put("property_tag", Integer.valueOf(e(goodsSpu)));
        f.put("variedproperty_tag", Integer.valueOf(f(goodsSpu)));
        if (!t.a(goodsSpu.rankTraceId)) {
            f.put("rankTraceId", goodsSpu.rankTraceId);
        }
        f.put("final_price", Integer.valueOf(i));
        f.put("medicine_activity_type", goodsSpu.getActivityId());
        f.put("upc_id", goodsSpu.getUPCCode());
        this.b.a("b_xU9Ua", f);
    }

    public final void d(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7752a47c49a322808a9762e9958e95f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7752a47c49a322808a9762e9958e95f0");
            return;
        }
        Map<String, Object> f = f(goodsPoiCategory, goodsSpu);
        f.put("sg_spu_tag", Integer.valueOf(goodsSpu.isFreeget ? 1 : 0));
        f.put("activity_id", goodsSpu.isFreeget ? goodsSpu.activityID : "");
        f.put("food_activity_type", Integer.valueOf(goodsSpu.activityType));
        f.put("stid", d(goodsSpu));
        f.put("spu_search_type", Integer.valueOf(goodsSpu.spuSearchType));
        f.put("property_tag", Integer.valueOf(e(goodsSpu)));
        f.put("variedproperty_tag", Integer.valueOf(f(goodsSpu)));
        if (!t.a(goodsSpu.rankTraceId)) {
            f.put("rankTraceId", goodsSpu.rankTraceId);
        }
        this.b.a("b_C71ok", f);
    }

    public final void a(GoodsSpu goodsSpu, String str) {
        Object[] objArr = {goodsSpu, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7df96e54f947aba2431d25ec0566c4c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7df96e54f947aba2431d25ec0566c4c2");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id", str);
        hashMap.put("spu_id", String.valueOf(goodsSpu.id));
        this.b.a("b_waimai_sg_xobjm6dr_mc", hashMap);
    }

    private String d(@NonNull GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "815194192b20fd8a951eface4fab1a9c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "815194192b20fd8a951eface4fab1a9c");
        }
        String a2 = j.a(goodsSpu.getPicture());
        if (TextUtils.isEmpty(a2)) {
            return this.c.z();
        }
        return a2 + ";" + this.c.z();
    }

    public final Map<String, Object> e(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        int i = 0;
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "384165a76ff2c2ccafc5f969df509b82", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "384165a76ff2c2ccafc5f969df509b82");
        }
        if (this.c != null && this.c.q() != null && !com.sankuai.waimai.store.order.a.e().i(this.c.q().d()) && k.b(this.c.q().b, goodsSpu) != null) {
            i = 1;
        }
        Map<String, Object> f = f(goodsPoiCategory, goodsSpu);
        f.put("spu_search_type", Integer.valueOf(goodsSpu.spuSearchType));
        f.put("final_price", Integer.valueOf(i));
        if (!t.a(goodsSpu.rankTraceId)) {
            f.put("rankTraceId", goodsSpu.rankTraceId);
        }
        this.b.a("b_JLdQv", f);
        return f;
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e92797545fdd9ad5de01480e629abc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e92797545fdd9ad5de01480e629abc6");
            return;
        }
        GoodsPoiCategory m = this.c.m();
        GoodsPoiCategory n = this.c.n();
        if (m == null || n == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id", this.c.q().d());
        int u = this.c.u();
        hashMap.put("fst_cate_id", n.getTagCode());
        hashMap.put("fst_cate_name", n.getTagName());
        hashMap.put("fst_cate_index", Integer.valueOf(u));
        hashMap.put("click_status", Integer.valueOf(!z ? 1 : 0));
        hashMap.put("stid", d());
        this.b.a("b_vvr21nas", hashMap);
    }

    public final void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "797068a05c668853feaf0df9449490f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "797068a05c668853feaf0df9449490f2");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id", this.c.q().d());
        this.b.a("b_ndrhig0o", hashMap, view, "b_ndrhig0o");
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "715194ff3c43cbb5c53cbbeef6988d81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "715194ff3c43cbb5c53cbbeef6988d81");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id", this.c.q().d());
        this.b.a("b_idop8eyd", hashMap);
    }

    private void b(@NonNull Map<String, Object> map, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {map, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c23e4e146a39974bb2ccb677ad68f8f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c23e4e146a39974bb2ccb677ad68f8f8");
            return;
        }
        a(map);
        map.put("category_index", Integer.valueOf(this.c.u()));
        if (goodsPoiCategory != null) {
            map.put("category_name", goodsPoiCategory.getTagName());
            map.put("category_type", Integer.valueOf(goodsPoiCategory.type));
            map.put(DataConstants.CATEGORY_ID, goodsPoiCategory.getTagCode());
        }
    }

    public final void b(GoodsPoiCategory goodsPoiCategory, int i, int i2) {
        Object[] objArr = {goodsPoiCategory, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a2e2238c762580093fd0f9aeca39914", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a2e2238c762580093fd0f9aeca39914");
        } else if (goodsPoiCategory == null) {
        } else {
            HashMap hashMap = new HashMap();
            b(hashMap, goodsPoiCategory);
            hashMap.put("sort_cate", Integer.valueOf(i));
            hashMap.put("sort_type", Integer.valueOf(i2));
            this.b.a("b_7yr351tb", hashMap);
        }
    }

    public final void a(View view, GoodsPoiCategory goodsPoiCategory, int i) {
        Object[] objArr = {view, goodsPoiCategory, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a74f8f6267061a4456958bfb9d672e30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a74f8f6267061a4456958bfb9d672e30");
        } else if (goodsPoiCategory == null) {
        } else {
            HashMap hashMap = new HashMap();
            b(hashMap, goodsPoiCategory);
            hashMap.put("sort_cate", Integer.valueOf(i));
            String tagCode = goodsPoiCategory.getTagCode();
            this.b.a("b_gr9u038i", hashMap, view, tagCode + CommonConstant.Symbol.MINUS + i + "-b_gr9u038i");
        }
    }

    public final void a(View view, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {view, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e9978a9088c7f15e057fd9fc775a262", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e9978a9088c7f15e057fd9fc775a262");
        } else if (goodsPoiCategory == null) {
        } else {
            HashMap hashMap = new HashMap();
            b(hashMap, goodsPoiCategory);
            this.b.a("b_waimai_8p513pcl_mv", hashMap, view, goodsPoiCategory.getTagCode() + "-b_waimai_8p513pcl_mv");
        }
    }

    public final void a(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cac9c0aa85b54cd4191203aa0fb7098", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cac9c0aa85b54cd4191203aa0fb7098");
        } else if (goodsPoiCategory == null) {
        } else {
            HashMap hashMap = new HashMap();
            b(hashMap, goodsPoiCategory);
            this.b.a("b_waimai_8p513pcl_mc", hashMap);
        }
    }

    public final void a(View view, GoodsPoiCategory goodsPoiCategory, String str, int i) {
        Object[] objArr = {view, goodsPoiCategory, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37f33409e5cbcb838beea300a2700906", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37f33409e5cbcb838beea300a2700906");
        } else if (goodsPoiCategory == null) {
        } else {
            HashMap hashMap = new HashMap();
            b(hashMap, goodsPoiCategory);
            hashMap.put("brand_name", str);
            hashMap.put("index", Integer.valueOf(i));
            this.b.a("b_waimai_m986e8c0_mv", hashMap, view, goodsPoiCategory.getTagCode() + "-b_waimai_m986e8c0_mv" + CommonConstant.Symbol.MINUS + str);
        }
    }

    public final void a(GoodsPoiCategory goodsPoiCategory, String str, int i) {
        Object[] objArr = {goodsPoiCategory, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77b4f23eeb62b495079143ac5802207c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77b4f23eeb62b495079143ac5802207c");
        } else if (goodsPoiCategory == null) {
        } else {
            HashMap hashMap = new HashMap();
            b(hashMap, goodsPoiCategory);
            hashMap.put("brand_name", str);
            hashMap.put("index", Integer.valueOf(i));
            this.b.a("b_waimai_m986e8c0_mc", hashMap);
        }
    }

    public final void a(GoodsSpu goodsSpu) {
        GoodsSku goodsSku;
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "788dc3d3da166dd066debc40f49f3135", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "788dc3d3da166dd066debc40f49f3135");
        } else if (goodsSpu == null || (goodsSku = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.skus, 0)) == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("poi_id", this.c.q().d());
            hashMap.put("spu_id", Long.valueOf(goodsSpu.id));
            hashMap.put("sku_id", Long.valueOf(goodsSku.id));
            hashMap.put("stid", this.c.z());
            this.b.a("b_waimai_k9pdc9e0_mc", hashMap);
        }
    }

    public final void c(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05ac792cc7b7b2e50ae8bf7b5f472f90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05ac792cc7b7b2e50ae8bf7b5f472f90");
            return;
        }
        Map<String, Object> e = e();
        this.b.a("b_waimai_sg_jy7pj4ps_mv", e, view, e.get(DataConstants.CATEGORY_ID) + CommonConstant.Symbol.MINUS + e.get("category_sec_id") + "-b_waimai_sg_jy7pj4ps_mv" + CommonConstant.Symbol.MINUS);
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da1b870f7de5319430b2f2b855091bab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da1b870f7de5319430b2f2b855091bab");
        } else {
            this.b.a("b_waimai_sg_jy7pj4ps_mc", e());
        }
    }

    private Map<String, Object> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e50570663029dec0f9f62659b404a097", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e50570663029dec0f9f62659b404a097");
        }
        HashMap hashMap = new HashMap();
        GoodsPoiCategory n = this.c.n();
        GoodsPoiCategory m = this.c.m();
        if (n == null || m == null) {
            return hashMap;
        }
        hashMap.put("poi_id", this.c.q().d());
        hashMap.put(DataConstants.CATEGORY_ID, n.getTagCode());
        hashMap.put("category_name", n.getTagName());
        hashMap.put("category_sec_id", m.getTagCode());
        hashMap.put("category_sec_name", m.getTagName());
        hashMap.put("stid", this.c.z());
        return hashMap;
    }

    public final void d(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53dcb78369a0b42c3f12a51d6e2ae377", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53dcb78369a0b42c3f12a51d6e2ae377");
            return;
        }
        GoodsPoiCategory m = this.c.m();
        if (m == null) {
            return;
        }
        com.sankuai.waimai.store.platform.domain.manager.poi.a q = this.c.q();
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id", q.d());
        hashMap.put("stid", this.c.z());
        this.b.a("b_waimai_sg_xreeoi5s_mv", hashMap, view, m.getTagCode() + "-b_waimai_sg_xreeoi5s_mv");
    }

    public final void a(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "562887eeaa0efe10948736ba52bbe9ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "562887eeaa0efe10948736ba52bbe9ab");
        } else if (goodsSpu == null) {
        } else {
            com.sankuai.waimai.store.platform.domain.manager.poi.a q = this.c.q();
            HashMap hashMap = new HashMap();
            hashMap.put("poi_id", q.d());
            hashMap.put("stid", this.c.z());
            hashMap.put("spu_id", Long.valueOf(goodsSpu.id));
            hashMap.put(DataConstants.INDEX, Integer.valueOf(i));
            this.b.a("b_waimai_sg_pkky1msa_mc", hashMap);
        }
    }

    public final void a(GoodsSpu goodsSpu, int i, View view) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1afb6fb00677b87fc45c11a72a4e76c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1afb6fb00677b87fc45c11a72a4e76c8");
        } else if (goodsSpu == null) {
        } else {
            com.sankuai.waimai.store.platform.domain.manager.poi.a q = this.c.q();
            HashMap hashMap = new HashMap();
            hashMap.put("poi_id", q.d());
            hashMap.put("stid", this.c.z());
            hashMap.put("spu_id", Long.valueOf(goodsSpu.id));
            hashMap.put(DataConstants.INDEX, Integer.valueOf(i));
            a aVar = this.b;
            aVar.a("b_waimai_sg_nzzeggnp_mv", hashMap, view, "b_waimai_sg_nzzeggnp_mv" + goodsSpu.getId());
        }
    }

    public final void b(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38f2fcd84eb8fd4e411038a3cf3b454f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38f2fcd84eb8fd4e411038a3cf3b454f");
        } else if (goodsSpu == null) {
        } else {
            com.sankuai.waimai.store.platform.domain.manager.poi.a q = this.c.q();
            HashMap hashMap = new HashMap();
            hashMap.put("poi_id", q.d());
            hashMap.put("stid", this.c.z());
            hashMap.put("spu_id", Long.valueOf(goodsSpu.id));
            hashMap.put(DataConstants.INDEX, Integer.valueOf(i));
            this.b.a("b_waimai_sg_nzzeggnp_mc", hashMap);
        }
    }

    public final void a(View view, GoodsSpu goodsSpu) {
        Object[] objArr = {view, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e3ad43fc684e5e4feae9d1d3eed253b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e3ad43fc684e5e4feae9d1d3eed253b");
        } else if (goodsSpu == null) {
        } else {
            com.sankuai.waimai.store.platform.domain.manager.poi.a q = this.c.q();
            HashMap hashMap = new HashMap();
            hashMap.put("spu_id", Long.valueOf(goodsSpu.getId()));
            hashMap.put("poi_id", q.d());
            hashMap.put("medicine_activity_type", goodsSpu.getActivityId());
            hashMap.put("upc_id", goodsSpu.getUPCCode());
            if (goodsSpu.promotion != null) {
                hashMap.put("coupon_type", Integer.valueOf(goodsSpu.promotion.couponType));
                hashMap.put("status", Integer.valueOf(goodsSpu.promotion.receiveStatus));
                hashMap.put("activity_type", !TextUtils.isEmpty(goodsSpu.promotion.activityType) ? goodsSpu.promotion.activityType : "-999");
                if (goodsSpu.promotion.coupon != null) {
                    hashMap.put("coupon_id", Long.valueOf(goodsSpu.promotion.coupon.mCouponId));
                    hashMap.put("activity_id", Long.valueOf(goodsSpu.promotion.coupon.mActivityId == 0 ? -999L : goodsSpu.promotion.coupon.mActivityId));
                }
            } else {
                hashMap.put("coupon_type", -999);
                hashMap.put("status", -999);
                hashMap.put("activity_type", "-999");
            }
            hashMap.put("final_price", Integer.valueOf(k.b(q.b, goodsSpu) != null ? 1 : 0));
            a aVar = this.b;
            aVar.a("b_waimai_3vggekx6_mv", hashMap, view, goodsSpu.id + "-b_Wl3cp");
        }
    }

    public final void b(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c6b40decc6c1b50ed221db5b2ff9806", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c6b40decc6c1b50ed221db5b2ff9806");
        } else if (goodsSpu == null) {
        } else {
            com.sankuai.waimai.store.platform.domain.manager.poi.a q = this.c.q();
            HashMap hashMap = new HashMap();
            hashMap.put("spu_id", Long.valueOf(goodsSpu.getId()));
            hashMap.put("poi_id", q.d());
            if (goodsSpu.promotion != null) {
                hashMap.put("coupon_type", Integer.valueOf(goodsSpu.promotion.couponType));
                hashMap.put("status", Integer.valueOf(goodsSpu.promotion.receiveStatus));
                hashMap.put("activity_type", !TextUtils.isEmpty(goodsSpu.promotion.activityType) ? goodsSpu.promotion.activityType : "-999");
                if (goodsSpu.promotion.coupon != null) {
                    hashMap.put("coupon_id", Long.valueOf(goodsSpu.promotion.coupon.mCouponId));
                    hashMap.put("activity_id", Long.valueOf(goodsSpu.promotion.coupon.mActivityId == 0 ? -999L : goodsSpu.promotion.coupon.mActivityId));
                }
            } else {
                hashMap.put("coupon_type", -999);
                hashMap.put("status", -999);
                hashMap.put("activity_type", "-999");
            }
            this.b.a("b_waimai_3vggekx6_mc", hashMap);
        }
    }

    public final void b(View view, GoodsSpu goodsSpu) {
        Object[] objArr = {view, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1660a126ffdba52bd30a45a75bd8194e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1660a126ffdba52bd30a45a75bd8194e");
        } else if (goodsSpu == null || view == null) {
        } else {
            HashMap hashMap = new HashMap();
            a aVar = this.b;
            aVar.a("b_waimai_med_daoshoujia_mv", hashMap, view, (goodsSpu.id + 45) + "b_waimai_med_daoshoujia_mv");
        }
    }

    public final void a(View view, int i, GoodsSpu goodsSpu) {
        Object[] objArr = {view, Integer.valueOf(i), goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0ae48383c54627576d9b49204f1bee5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0ae48383c54627576d9b49204f1bee5");
        } else if (goodsSpu == null || view == null) {
        } else {
            com.sankuai.waimai.store.platform.domain.manager.poi.a q = this.c.q();
            HashMap hashMap = new HashMap();
            hashMap.put("poi_id", q != null ? q.d() : "");
            hashMap.put("show_position", Integer.valueOf(i));
            hashMap.put("spu_id", Long.valueOf(goodsSpu.getId()));
            hashMap.put("upc_code", goodsSpu.getUPCCode());
            hashMap.put("stid", this.c.z());
            GoodsSku goodsSku = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.getSkuList(), 0);
            hashMap.put("sku_id", goodsSku == null ? "" : Long.valueOf(goodsSku.getSkuId()));
            a aVar = this.b;
            aVar.a("b_waimai_3pwi4vy6_mv", hashMap, view, (goodsSpu.id + 45) + "b_waimai_3pwi4vy6_mv");
        }
    }

    private int e(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33c1ea2664888ee80651863c1357ad10", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33c1ea2664888ee80651863c1357ad10")).intValue();
        }
        if (goodsSpu == null || com.sankuai.shangou.stone.util.a.b(goodsSpu.productLabelPictureList)) {
            return 0;
        }
        for (com.sankuai.waimai.store.platform.domain.core.goods.a aVar : goodsSpu.productLabelPictureList) {
            if (aVar != null && aVar.e == 10) {
                return 1;
            }
        }
        return 0;
    }

    private int f(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8bdc8438494b498dc04af840636bf32", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8bdc8438494b498dc04af840636bf32")).intValue() : (goodsSpu == null || goodsSpu.productAttrLabel == null || !com.sankuai.shangou.stone.util.a.a((Collection<?>) goodsSpu.productAttrLabel.attrLabelList) || com.sankuai.shangou.stone.util.a.a((Collection<?>) goodsSpu.productTopLabels) || !t.a(goodsSpu.recommendReason)) ? 0 : 1;
    }
}
