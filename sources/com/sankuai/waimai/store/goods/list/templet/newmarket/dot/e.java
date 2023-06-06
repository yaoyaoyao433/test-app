package com.sankuai.waimai.store.goods.list.templet.newmarket.dot;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
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
public class e {
    public static ChangeQuickRedirect b;
    @NonNull
    protected final c c;
    @NonNull
    protected final com.sankuai.waimai.store.goods.list.templet.newmarket.e d;

    public e(@NonNull com.sankuai.waimai.store.goods.list.templet.newmarket.e eVar, @NonNull Context context) {
        Object[] objArr = {eVar, context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2e2fe3692da07b5eb8a603c8ec9cfcc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2e2fe3692da07b5eb8a603c8ec9cfcc");
            return;
        }
        this.d = eVar;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        this.c = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d9021eb1b2f90370b16e6bf9b8a1b24d", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d9021eb1b2f90370b16e6bf9b8a1b24d") : new d(context, this.d.k(), this.d.q());
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef8042e1a046c7173d8842fb1c2f1541", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef8042e1a046c7173d8842fb1c2f1541");
        } else {
            this.c.a();
        }
    }

    private void b(@NonNull Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7afa1e4d672107fa440d1292f87d8957", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7afa1e4d672107fa440d1292f87d8957");
            return;
        }
        com.sankuai.waimai.store.platform.domain.manager.poi.a x = this.d.x();
        map.put("poi_id", x.d());
        map.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(x.v()));
    }

    public final void a(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f16dac421e14eb2b8eb692b49114e36a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f16dac421e14eb2b8eb692b49114e36a");
        } else if (goodsPoiCategory == null || goodsSpu == null) {
        } else {
            HashMap hashMap = new HashMap();
            b(hashMap);
            GoodsPoiCategory s = this.d.s();
            if (s != null) {
                int B = this.d.B();
                hashMap.put(DataConstants.CATEGORY_ID, s.getTagCode());
                hashMap.put("category_name", s.getTagName());
                hashMap.put("category_index", Integer.valueOf(B));
                hashMap.put("category_type", Integer.valueOf(s.type));
            }
            hashMap.put("spu_id", Long.valueOf(goodsSpu.id));
            hashMap.put("index", 9999);
            hashMap.put("goods_type", Integer.valueOf(goodsSpu.mSaleType));
            this.c.a("b_waimai_waimai_presales_buy_mc", hashMap);
        }
    }

    public final void a(GoodsPoiCategory goodsPoiCategory, int i, View view, int i2) {
        Object[] objArr = {goodsPoiCategory, Integer.valueOf(i), view, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ccc01c506e43d2166e861ba2d9dcdc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ccc01c506e43d2166e861ba2d9dcdc1");
            return;
        }
        GoodsPoiCategory s = this.d.s();
        if (s == null || goodsPoiCategory == null) {
            return;
        }
        int B = this.d.B();
        HashMap hashMap = new HashMap();
        b(hashMap);
        hashMap.put("stid", c());
        hashMap.put("fst_cat_name", s.getTagName());
        hashMap.put("fst_cat_id", s.getTagCode());
        hashMap.put("fst_cat_index", Integer.valueOf(B));
        hashMap.put("sec_cat_id", goodsPoiCategory.getTagCode());
        hashMap.put("sec_cat_index", Integer.valueOf(i));
        hashMap.put("index", Integer.valueOf(i));
        hashMap.put("activity_type", Integer.valueOf(goodsPoiCategory.mWmActivityTypeValue));
        if (!t.a(goodsPoiCategory.rankTraceId)) {
            hashMap.put("rankTraceId", goodsPoiCategory.rankTraceId);
        }
        if (!t.a(goodsPoiCategory.rankExtend)) {
            hashMap.put("rankExtend", goodsPoiCategory.rankExtend);
        }
        a(hashMap, goodsPoiCategory);
        c cVar = this.c;
        String str = s.type == 25 ? "b_waimai_gtuf3wwn_mv" : "b_qOqsq";
        StringBuilder sb = new StringBuilder();
        sb.append(goodsPoiCategory.getTagCode());
        sb.append(i2);
        sb.append(s.type == 25 ? "b_waimai_gtuf3wwn_mv" : "b_qOqsq");
        cVar.a(str, hashMap, view, sb.toString());
    }

    public final void a(Map<String, Object> map, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {map, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d06191792dc313f043112ba860a81b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d06191792dc313f043112ba860a81b9");
        } else if (goodsPoiCategory == null || goodsPoiCategory.receiveCouponTip == null) {
        } else {
            map.put("coupon_id", Long.valueOf(goodsPoiCategory.receiveCouponTip.couponId));
            map.put("status", Integer.valueOf(goodsPoiCategory.receiveCouponTip.couponStatus));
            map.put("coupon_source", Integer.valueOf(goodsPoiCategory.receiveCouponTip.couponType));
            map.put("coupon_type", Integer.valueOf(goodsPoiCategory.receiveCouponTip.couponType));
            map.put("activity_id", Long.valueOf(goodsPoiCategory.receiveCouponTip.activityId));
        }
    }

    public final void a(GoodsPoiCategory goodsPoiCategory, int i, int i2) {
        Object[] objArr = {goodsPoiCategory, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c2a8f45fe97a18db5dbbac0d2a8991c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c2a8f45fe97a18db5dbbac0d2a8991c");
            return;
        }
        GoodsPoiCategory s = this.d.s();
        if (s == null || goodsPoiCategory == null) {
            return;
        }
        int B = this.d.B();
        HashMap hashMap = new HashMap();
        b(hashMap);
        hashMap.put("stid", c());
        hashMap.put("fst_cat_name", s.getTagName());
        hashMap.put("fst_cat_id", s.getTagCode());
        hashMap.put("fst_cat_index", Integer.valueOf(B));
        hashMap.put("sec_cat_id", goodsPoiCategory.getTagCode());
        hashMap.put("sec_cat_index", Integer.valueOf(i));
        hashMap.put("index", Integer.valueOf(i));
        hashMap.put("scene_id", Integer.valueOf(i2));
        hashMap.put("poi_id", (this.d == null || this.d.x() == null) ? "-999" : this.d.x().d());
        if (!t.a(goodsPoiCategory.rankTraceId)) {
            hashMap.put("rankTraceId", goodsPoiCategory.rankTraceId);
        }
        if (!t.a(goodsPoiCategory.rankExtend)) {
            hashMap.put("rankExtend", goodsPoiCategory.rankExtend);
        }
        a(hashMap, goodsPoiCategory);
        this.c.a(s.type == 25 ? "b_waimai_gtuf3wwn_mc" : "b_wiPlE", hashMap);
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08c18cbdced631a1f1a6528ded416678", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08c18cbdced631a1f1a6528ded416678");
            return;
        }
        HashMap hashMap = new HashMap();
        b(hashMap);
        c cVar = this.c;
        Object[] objArr2 = {"b_4UpWy", hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "9ab2ab9085b2c398c43d69201c18c605", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "9ab2ab9085b2c398c43d69201c18c605");
        } else {
            com.sankuai.waimai.store.manager.judas.b.c(cVar.c, "b_4UpWy").b(hashMap).a(AppUtil.generatePageInfoKey(cVar.b)).a();
        }
    }

    public void a(GoodsPoiCategory goodsPoiCategory, int i) {
        Object[] objArr = {goodsPoiCategory, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88e43e1289ef8ef2ce7987ececeb4301", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88e43e1289ef8ef2ce7987ececeb4301");
        } else if (goodsPoiCategory == null) {
        } else {
            HashMap hashMap = new HashMap();
            b(hashMap);
            hashMap.put("category_name", goodsPoiCategory.getTagName());
            hashMap.put("category_index", Integer.valueOf(i));
            hashMap.put(DataConstants.CATEGORY_ID, goodsPoiCategory.getTagCode());
            hashMap.put("category_type", Integer.valueOf(goodsPoiCategory.type));
            hashMap.put(SearchIntents.EXTRA_QUERY, goodsPoiCategory.activityInfo == null ? "" : goodsPoiCategory.activityInfo.activityText);
            this.c.a("b_MOzqJ", hashMap);
        }
    }

    public void a(GoodsPoiCategory goodsPoiCategory, int i, View view) {
        Object[] objArr = {goodsPoiCategory, Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "122b99bd3ca962ca3961346c947f227d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "122b99bd3ca962ca3961346c947f227d");
        } else if (goodsPoiCategory == null) {
        } else {
            HashMap hashMap = new HashMap();
            b(hashMap);
            hashMap.put("category_name", goodsPoiCategory.getTagName());
            hashMap.put("category_index", Integer.valueOf(i));
            hashMap.put(DataConstants.CATEGORY_ID, goodsPoiCategory.getTagCode());
            hashMap.put("category_type", Integer.valueOf(goodsPoiCategory.type));
            hashMap.put("stid", c());
            hashMap.put("index", Integer.valueOf(i));
            hashMap.put(SearchIntents.EXTRA_QUERY, goodsPoiCategory.activityInfo == null ? "" : goodsPoiCategory.activityInfo.activityText);
            if (goodsPoiCategory.type == 13) {
                c cVar = this.c;
                cVar.b("b_waimai_xoqh1dxp_mv", hashMap, view, goodsPoiCategory.getTagCode() + "b_waimai_xoqh1dxp_mv");
                return;
            }
            c cVar2 = this.c;
            cVar2.a("b_waimai_sg_90uw7iuh_mv", hashMap, view, goodsPoiCategory.getTagCode() + "b_waimai_sg_90uw7iuh_mv");
        }
    }

    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97765e3689b966678f6bb2ae5e8e3c8f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97765e3689b966678f6bb2ae5e8e3c8f") : (this.d == null || this.d.x() == null || this.d.x().b == null || t.a(this.d.x().b.abExpInfo)) ? "-999" : this.d.x().b.abExpInfo;
    }

    public final void a(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92a2a1d29c0acdd78f2a28833c650485", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92a2a1d29c0acdd78f2a28833c650485");
            return;
        }
        ArrayMap arrayMap = new ArrayMap();
        b(arrayMap);
        arrayMap.put("banner_id", Long.valueOf(j));
        arrayMap.put("index", Integer.valueOf(i));
        this.c.a("b_wpDVN", arrayMap);
    }

    public final void a(int i, View view) {
        Object[] objArr = {Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b1c234734803fcdac5a9c4de16ce432", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b1c234734803fcdac5a9c4de16ce432");
            return;
        }
        HashMap hashMap = new HashMap();
        b(hashMap);
        hashMap.put("index", Integer.valueOf(i));
        c cVar = this.c;
        cVar.a("b_rqzXO", hashMap, view, i + "-b_rqzXO");
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "002d77351015305e90ba350ace87bc97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "002d77351015305e90ba350ace87bc97");
        } else {
            this.c.a(view);
        }
    }

    public final void a(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu, View view, HandPriceInfo handPriceInfo) {
        String str;
        Object[] objArr = {goodsPoiCategory, goodsSpu, view, handPriceInfo};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c962799dde4be698fda3bd0f53b91fc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c962799dde4be698fda3bd0f53b91fc0");
        } else if (goodsSpu == null || goodsPoiCategory == null) {
        } else {
            int i = (this.d == null || this.d.x() == null || k.b(this.d.x().b, goodsSpu) == null) ? 0 : 1;
            final Map<String, Object> f = f(goodsPoiCategory, goodsSpu);
            f.put("sg_spu_tag", Integer.valueOf(goodsSpu.isFreeget ? 1 : 0));
            f.put("activity_id", goodsSpu.isFreeget ? goodsSpu.activityID : "");
            f.put("food_activity_type", Integer.valueOf(goodsSpu.activityType));
            f.put("stock", Integer.valueOf(1 != goodsSpu.getStatus() ? 1 : 0));
            f.put("card_type", Integer.valueOf(!TextUtils.isEmpty(goodsSpu.praiseRate) ? 1 : 0));
            f.put("show_type", TextUtils.isEmpty(goodsSpu.coverUrl) ? "1" : "2");
            f.put("spu_search_type", Integer.valueOf(goodsSpu.spuSearchType));
            a(f, goodsSpu);
            f.put("variedproperty_tag", Integer.valueOf(e(goodsSpu)));
            if (!t.a(goodsSpu.rankTraceId)) {
                f.put("rankTraceId", goodsSpu.rankTraceId);
            }
            if (!t.a(goodsSpu.rankExtend)) {
                f.put("rankExtend", goodsSpu.rankExtend);
            }
            String a = j.a(goodsSpu.getPicture());
            if (TextUtils.isEmpty(a)) {
                str = this.d.G();
            } else {
                str = a + ";" + this.d.G();
            }
            f.put("stid", str);
            f.put("spu_tag", handPriceInfo == null ? "" : handPriceInfo.getHandPriceLabel());
            f.put("final_price", Integer.valueOf(i));
            y.a(goodsSpu.productTopLabels, goodsSpu.recommendReason, new y.a() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.dot.e.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.y.a
                public final void a(@NonNull String str2) {
                    Object[] objArr2 = {str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b8c896dcdb94f4693f028bb9ca891dc8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b8c896dcdb94f4693f028bb9ca891dc8");
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
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ed7e8d20c2ad479e00e2d45e44103364", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ed7e8d20c2ad479e00e2d45e44103364");
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
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6dfcf7cedf80e0e8304bf05e56395aca", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6dfcf7cedf80e0e8304bf05e56395aca");
                        return;
                    }
                    f.put("recommend", 0);
                    f.put("rank_label_info", -999);
                    f.put("rank_label_text", -999);
                }
            });
            f.put("rankTraceIdV2", goodsPoiCategory.rankTraceId);
            f.put("rankExtendV2", goodsPoiCategory.rankExtend);
            this.c.a("b_Wl3cp", "b_waimai_aapbbuyz_mv", f, view, goodsPoiCategory.getTagCode() + CommonConstant.Symbol.MINUS + goodsSpu.id + "-b_Wl3cp");
        }
    }

    private static void a(@NonNull Map<String, Object> map, @NonNull String str, @Nullable GoodsSpu.GoodPropertyLabel goodPropertyLabel) {
        Object[] objArr = {map, str, goodPropertyLabel};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a828fae7f254556b6008c74d3eacc47a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a828fae7f254556b6008c74d3eacc47a");
        } else if (goodPropertyLabel != null) {
            int i = goodPropertyLabel.type;
            HashMap hashMap = new HashMap();
            hashMap.put("label_type", Integer.valueOf(i));
            if (goodPropertyLabel.hasRankInfo()) {
                hashMap.put("rank_label_info", Integer.valueOf(goodPropertyLabel.getRankInfo()));
                hashMap.put("rank_label_text", goodPropertyLabel.getRankText());
            }
            map.put(str, hashMap);
        }
    }

    public final void a(GoodsSpu goodsSpu, long j, String str, View view) {
        Object[] objArr = {goodsSpu, new Long(j), str, view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a372152b29904c7d30251b0d280ddda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a372152b29904c7d30251b0d280ddda");
        } else if (goodsSpu == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(str, j));
            hashMap.put("spu_id", String.valueOf(goodsSpu.id));
            String str2 = t.a(goodsSpu.physicalTag) ? "" : goodsSpu.physicalTag;
            c cVar = this.c;
            cVar.a("b_waimai_sg_xobjm6dr_mv", hashMap, view, str2 + CommonConstant.Symbol.MINUS + goodsSpu.id + "-b_waimai_sg_xobjm6dr_mv");
        }
    }

    public final void a(GoodsSpu goodsSpu, long j, View view) {
        Object[] objArr = {goodsSpu, new Long(j), view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfc59d6bb6a9ee5bb9d3eed21a1a1772", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfc59d6bb6a9ee5bb9d3eed21a1a1772");
        } else if (goodsSpu == null) {
        } else {
            HashMap hashMap = new HashMap();
            String G = this.d.G();
            hashMap.put("poi_id", String.valueOf(j));
            hashMap.put("spu_id", String.valueOf(goodsSpu.id));
            hashMap.put("pageinfo", 1);
            if (TextUtils.isEmpty(G)) {
                G = "-999";
            }
            hashMap.put("stid", G);
            c cVar = this.c;
            cVar.a("b_waimai_ncpsx7dc_mv", hashMap, view, goodsSpu.id + "-b_waimai_ncpsx7dc_mv");
        }
    }

    public final void b(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        String str;
        int i = 0;
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e439f01f7dac9c64a115317f9ec8e8a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e439f01f7dac9c64a115317f9ec8e8a9");
        } else if (goodsSpu == null || goodsPoiCategory == null) {
        } else {
            if (this.d.x() != null && k.b(this.d.x().b, goodsSpu) != null) {
                i = 1;
            }
            Map<String, Object> f = f(goodsPoiCategory, goodsSpu);
            f.put("sg_spu_tag", Integer.valueOf(goodsSpu.isFreeget ? 1 : 0));
            f.put("activity_id", goodsSpu.isFreeget ? goodsSpu.activityID : "");
            f.put("food_activity_type", Integer.valueOf(goodsSpu.activityType));
            f.put("card_type", Integer.valueOf(!TextUtils.isEmpty(goodsSpu.praiseRate) ? 1 : 0));
            f.put("show_type", TextUtils.isEmpty(goodsSpu.coverUrl) ? "1" : "2");
            f.put("spu_search_type", Integer.valueOf(goodsSpu.spuSearchType));
            a(f, goodsSpu);
            f.put("variedproperty_tag", Integer.valueOf(e(goodsSpu)));
            if (!t.a(goodsSpu.rankTraceId)) {
                f.put("rankTraceId", goodsSpu.rankTraceId);
            }
            if (!t.a(goodsSpu.rankExtend)) {
                f.put("rankExtend", goodsSpu.rankExtend);
            }
            f.put("final_price", Integer.valueOf(i));
            String a = j.a(goodsSpu.getPicture());
            if (TextUtils.isEmpty(a)) {
                str = this.d.G();
            } else {
                str = a + ";" + this.d.G();
            }
            f.put("stid", str);
            f.put("rankTraceIdV2", goodsPoiCategory.rankTraceId);
            f.put("rankExtendV2", goodsPoiCategory.rankExtend);
            this.c.a("b_sct3Y", f);
        }
    }

    @NonNull
    private Map<String, Object> f(@NonNull GoodsPoiCategory goodsPoiCategory, @NonNull GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a2aaa8e519116b028250cb50a011ebb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a2aaa8e519116b028250cb50a011ebb");
        }
        HashMap hashMap = new HashMap();
        GoodsPoiCategory s = this.d.s();
        if (s == null) {
            return hashMap;
        }
        int B = this.d.B();
        int C = this.d.C();
        b(hashMap);
        hashMap.put("spu_id", Long.valueOf(goodsSpu.id));
        hashMap.put("trace_id", t.a(goodsPoiCategory.traceId) ? -999 : goodsPoiCategory.traceId);
        hashMap.put(DataConstants.CATEGORY_ID, s.getTagCode());
        hashMap.put("category_name", s.getTagName());
        hashMap.put("category_index", Integer.valueOf(B));
        hashMap.put("category_type", Integer.valueOf(s.type));
        boolean z = goodsPoiCategory != s;
        String tagName = z ? goodsPoiCategory.getTagName() : "";
        hashMap.put("category_sec_id", z ? goodsPoiCategory.getTagCode() : "");
        hashMap.put("category_sec_index", Integer.valueOf(C));
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
        hashMap.put("product_tag_title", Integer.valueOf(goodsSpu.iconAheadName != null ? goodsSpu.iconAheadName.labelType : -999));
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) goodsSpu.propertyLabels)) {
            a(hashMap, "deceison_info_first", (GoodsSpu.GoodPropertyLabel) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.propertyLabels, 0));
            a(hashMap, "deceison_info_second", (GoodsSpu.GoodPropertyLabel) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.propertyLabels, 1));
        }
        return hashMap;
    }

    private static String c(@NonNull GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d11f19d69bfca8557ba8440a9d38052", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d11f19d69bfca8557ba8440a9d38052");
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
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a56226af008677cca7f6086d3a830921", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a56226af008677cca7f6086d3a830921");
            return;
        }
        if (this.d.x() != null && k.b(this.d.x().b, goodsSpu) != null) {
            i = 1;
        }
        Map<String, Object> f = f(goodsPoiCategory, goodsSpu);
        f.put("sg_spu_tag", Integer.valueOf(goodsSpu.isFreeget ? 1 : 0));
        f.put("activity_id", goodsSpu.isFreeget ? goodsSpu.activityID : "");
        f.put("food_activity_type", Integer.valueOf(goodsSpu.activityType));
        f.put("stid", d(goodsSpu));
        f.put("spu_search_type", Integer.valueOf(goodsSpu.spuSearchType));
        a(f, goodsSpu);
        f.put("variedproperty_tag", Integer.valueOf(e(goodsSpu)));
        if (!t.a(goodsSpu.rankTraceId)) {
            f.put("rankTraceId", goodsSpu.rankTraceId);
        }
        if (!t.a(goodsSpu.rankExtend)) {
            f.put("rankExtend", goodsSpu.rankExtend);
        }
        f.put("final_price", Integer.valueOf(i));
        f.put("rankTraceIdV2", goodsPoiCategory.rankTraceId);
        f.put("rankExtendV2", goodsPoiCategory.rankExtend);
        this.c.a("b_xU9Ua", f);
    }

    public final void d(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8be110a06d6b200dfd2c0caeec8159e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8be110a06d6b200dfd2c0caeec8159e0");
            return;
        }
        Map<String, Object> f = f(goodsPoiCategory, goodsSpu);
        f.put("sg_spu_tag", Integer.valueOf(goodsSpu.isFreeget ? 1 : 0));
        f.put("activity_id", goodsSpu.isFreeget ? goodsSpu.activityID : "");
        f.put("food_activity_type", Integer.valueOf(goodsSpu.activityType));
        f.put("stid", d(goodsSpu));
        f.put("spu_search_type", Integer.valueOf(goodsSpu.spuSearchType));
        a(f, goodsSpu);
        f.put("variedproperty_tag", Integer.valueOf(e(goodsSpu)));
        if (!t.a(goodsSpu.rankTraceId)) {
            f.put("rankTraceId", goodsSpu.rankTraceId);
        }
        if (!t.a(goodsSpu.rankExtend)) {
            f.put("rankExtend", goodsSpu.rankExtend);
        }
        this.c.a("b_C71ok", f);
    }

    public final void a(GoodsSpu goodsSpu, String str) {
        Object[] objArr = {goodsSpu, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55127025902ac1e5214329de47fedeb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55127025902ac1e5214329de47fedeb7");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id", str);
        hashMap.put("spu_id", String.valueOf(goodsSpu.id));
        this.c.a("b_waimai_sg_xobjm6dr_mc", hashMap);
    }

    private String d(@NonNull GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03ab99a681674a858a84bd5acfe0efda", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03ab99a681674a858a84bd5acfe0efda");
        }
        String a = j.a(goodsSpu.getPicture());
        if (TextUtils.isEmpty(a)) {
            return this.d.G();
        }
        return a + ";" + this.d.G();
    }

    public final Map<String, Object> e(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        int i = 0;
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e714cfa983493d538179225f3691c2e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e714cfa983493d538179225f3691c2e");
        }
        if (this.d.x() != null && k.b(this.d.x().b, goodsSpu) != null) {
            i = 1;
        }
        Map<String, Object> f = f(goodsPoiCategory, goodsSpu);
        f.put("spu_search_type", Integer.valueOf(goodsSpu.spuSearchType));
        f.put("final_price", Integer.valueOf(i));
        if (!t.a(goodsSpu.rankTraceId)) {
            f.put("rankTraceId", goodsSpu.rankTraceId);
        }
        if (!t.a(goodsSpu.rankExtend)) {
            f.put("rankExtend", goodsSpu.rankExtend);
        }
        f.put("rankTraceIdV2", goodsPoiCategory.rankTraceId);
        f.put("rankExtendV2", goodsPoiCategory.rankExtend);
        a(f, goodsSpu);
        f.put("stid", d(goodsSpu));
        this.c.a("b_JLdQv", f);
        return f;
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d783354fe32d42863290f1471476b5ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d783354fe32d42863290f1471476b5ab");
            return;
        }
        GoodsPoiCategory r = this.d.r();
        GoodsPoiCategory s = this.d.s();
        if (r == null || s == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id", this.d.x().d());
        int B = this.d.B();
        hashMap.put("fst_cate_id", s.getTagCode());
        hashMap.put("fst_cate_name", s.getTagName());
        hashMap.put("fst_cate_index", Integer.valueOf(B));
        hashMap.put("click_status", Integer.valueOf(!z ? 1 : 0));
        hashMap.put("stid", c());
        this.c.a("b_vvr21nas", hashMap);
    }

    public final void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d545ad1c3355f9e06874e97b43c7dc0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d545ad1c3355f9e06874e97b43c7dc0f");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id", this.d.x().d());
        this.c.a("b_ndrhig0o", hashMap, view, "b_ndrhig0o");
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16a6100ada013ddbb5f1e50fee76187c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16a6100ada013ddbb5f1e50fee76187c");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id", this.d.x().d());
        this.c.a("b_idop8eyd", hashMap);
    }

    private void b(@NonNull Map<String, Object> map, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {map, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f9004722d9ac113f9a94ff5e7106a84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f9004722d9ac113f9a94ff5e7106a84");
            return;
        }
        b(map);
        map.put("category_index", Integer.valueOf(this.d.B()));
        if (goodsPoiCategory != null) {
            map.put("category_name", goodsPoiCategory.getTagName());
            map.put("category_type", Integer.valueOf(goodsPoiCategory.type));
            map.put(DataConstants.CATEGORY_ID, goodsPoiCategory.getTagCode());
        }
    }

    public final void b(GoodsPoiCategory goodsPoiCategory, int i, int i2) {
        Object[] objArr = {goodsPoiCategory, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e030fba5a9c45b4a56ab14b47dd2072e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e030fba5a9c45b4a56ab14b47dd2072e");
        } else if (goodsPoiCategory == null) {
        } else {
            HashMap hashMap = new HashMap();
            b(hashMap, goodsPoiCategory);
            hashMap.put("sort_cate", Integer.valueOf(i));
            hashMap.put("sort_type", Integer.valueOf(i2));
            this.c.a("b_7yr351tb", hashMap);
        }
    }

    public final void a(View view, GoodsPoiCategory goodsPoiCategory, int i) {
        Object[] objArr = {view, goodsPoiCategory, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4d9c1ff352bfc0cc3ca1f2de1e2b1da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4d9c1ff352bfc0cc3ca1f2de1e2b1da");
        } else if (goodsPoiCategory == null) {
        } else {
            HashMap hashMap = new HashMap();
            b(hashMap, goodsPoiCategory);
            hashMap.put("sort_cate", Integer.valueOf(i));
            String tagCode = goodsPoiCategory.getTagCode();
            this.c.a("b_gr9u038i", hashMap, view, tagCode + CommonConstant.Symbol.MINUS + i + "-b_gr9u038i");
        }
    }

    public final void a(View view, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {view, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06d36cc9fb70d8481a0bd25f8b46247c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06d36cc9fb70d8481a0bd25f8b46247c");
        } else if (goodsPoiCategory == null) {
        } else {
            HashMap hashMap = new HashMap();
            b(hashMap, goodsPoiCategory);
            this.c.a("b_waimai_8p513pcl_mv", hashMap, view, goodsPoiCategory.getTagCode() + "-b_waimai_8p513pcl_mv");
        }
    }

    public final void a(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07122e8aae782a4bd9e36394cf1cdffd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07122e8aae782a4bd9e36394cf1cdffd");
        } else if (goodsPoiCategory == null) {
        } else {
            HashMap hashMap = new HashMap();
            b(hashMap, goodsPoiCategory);
            this.c.a("b_waimai_8p513pcl_mc", hashMap);
        }
    }

    public final void a(View view, GoodsPoiCategory goodsPoiCategory, String str, int i) {
        Object[] objArr = {view, goodsPoiCategory, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddec2193e1c569d0ecac1dc457e2f52d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddec2193e1c569d0ecac1dc457e2f52d");
        } else if (goodsPoiCategory == null) {
        } else {
            HashMap hashMap = new HashMap();
            b(hashMap, goodsPoiCategory);
            hashMap.put("brand_name", str);
            hashMap.put("index", Integer.valueOf(i));
            this.c.a("b_waimai_m986e8c0_mv", hashMap, view, goodsPoiCategory.getTagCode() + "-b_waimai_m986e8c0_mv" + CommonConstant.Symbol.MINUS + str);
        }
    }

    public final void a(GoodsPoiCategory goodsPoiCategory, String str, int i) {
        Object[] objArr = {goodsPoiCategory, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c09a399a128c6f355907c1d147ae975d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c09a399a128c6f355907c1d147ae975d");
        } else if (goodsPoiCategory == null) {
        } else {
            HashMap hashMap = new HashMap();
            b(hashMap, goodsPoiCategory);
            hashMap.put("brand_name", str);
            hashMap.put("index", Integer.valueOf(i));
            this.c.a("b_waimai_m986e8c0_mc", hashMap);
        }
    }

    public final void a(GoodsSpu goodsSpu) {
        GoodsSku goodsSku;
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5d1fdce6077074ed57667f74ef7929a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5d1fdce6077074ed57667f74ef7929a");
        } else if (goodsSpu == null || (goodsSku = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.skus, 0)) == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("poi_id", this.d.x().d());
            hashMap.put("spu_id", Long.valueOf(goodsSpu.id));
            hashMap.put("sku_id", Long.valueOf(goodsSku.id));
            hashMap.put("stid", this.d.G());
            this.c.a("b_waimai_k9pdc9e0_mc", hashMap);
        }
    }

    public final void c(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79ce07c4a45b2379d0aa1b2b5e62675b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79ce07c4a45b2379d0aa1b2b5e62675b");
            return;
        }
        Map<String, Object> f = f();
        this.c.a("b_waimai_sg_jy7pj4ps_mv", f, view, f.get(DataConstants.CATEGORY_ID) + CommonConstant.Symbol.MINUS + f.get("category_sec_id") + "-b_waimai_sg_jy7pj4ps_mv" + CommonConstant.Symbol.MINUS);
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d365f6db3c01d13f3a2045d7ef49e5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d365f6db3c01d13f3a2045d7ef49e5a");
        } else {
            this.c.a("b_waimai_sg_jy7pj4ps_mc", f());
        }
    }

    private Map<String, Object> f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ccfda10fba4851172dc032408d6a4ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ccfda10fba4851172dc032408d6a4ec");
        }
        HashMap hashMap = new HashMap();
        GoodsPoiCategory s = this.d.s();
        GoodsPoiCategory r = this.d.r();
        if (s == null || r == null) {
            return hashMap;
        }
        hashMap.put("poi_id", this.d.x().d());
        hashMap.put(DataConstants.CATEGORY_ID, s.getTagCode());
        hashMap.put("category_name", s.getTagName());
        hashMap.put("category_sec_id", r.getTagCode());
        hashMap.put("category_sec_name", r.getTagName());
        hashMap.put("stid", this.d.G());
        return hashMap;
    }

    public final void d(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af51bd5625d4398e2c7cb18a66576253", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af51bd5625d4398e2c7cb18a66576253");
            return;
        }
        GoodsPoiCategory r = this.d.r();
        if (r == null) {
            return;
        }
        com.sankuai.waimai.store.platform.domain.manager.poi.a x = this.d.x();
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id", x.d());
        hashMap.put("stid", this.d.G());
        this.c.a("b_waimai_sg_xreeoi5s_mv", hashMap, view, r.getTagCode() + "-b_waimai_sg_xreeoi5s_mv");
    }

    public final void a(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a61b590d0bd4590b34e643e7be268b70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a61b590d0bd4590b34e643e7be268b70");
        } else if (goodsSpu == null) {
        } else {
            com.sankuai.waimai.store.platform.domain.manager.poi.a x = this.d.x();
            HashMap hashMap = new HashMap();
            hashMap.put("poi_id", x.d());
            hashMap.put("stid", this.d.G());
            hashMap.put("spu_id", Long.valueOf(goodsSpu.id));
            hashMap.put(DataConstants.INDEX, Integer.valueOf(i));
            this.c.a("b_waimai_sg_pkky1msa_mc", hashMap);
        }
    }

    public final void a(GoodsSpu goodsSpu, int i, View view) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4310857edc6f043a9b191d4b0bbfa2ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4310857edc6f043a9b191d4b0bbfa2ed");
        } else if (goodsSpu == null) {
        } else {
            com.sankuai.waimai.store.platform.domain.manager.poi.a x = this.d.x();
            HashMap hashMap = new HashMap();
            hashMap.put("poi_id", x.d());
            hashMap.put("stid", this.d.G());
            hashMap.put("spu_id", Long.valueOf(goodsSpu.id));
            hashMap.put(DataConstants.INDEX, Integer.valueOf(i));
            c cVar = this.c;
            cVar.a("b_waimai_sg_nzzeggnp_mv", hashMap, view, "b_waimai_sg_nzzeggnp_mv" + goodsSpu.getId());
        }
    }

    public final void b(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a782936b997f044aecbb801e1d1217ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a782936b997f044aecbb801e1d1217ca");
        } else if (goodsSpu == null) {
        } else {
            com.sankuai.waimai.store.platform.domain.manager.poi.a x = this.d.x();
            HashMap hashMap = new HashMap();
            hashMap.put("poi_id", x.d());
            hashMap.put("stid", this.d.G());
            hashMap.put("spu_id", Long.valueOf(goodsSpu.id));
            hashMap.put(DataConstants.INDEX, Integer.valueOf(i));
            this.c.a("b_waimai_sg_nzzeggnp_mc", hashMap);
        }
    }

    public final void a(View view, GoodsSpu goodsSpu) {
        Object[] objArr = {view, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d41bd8a124b805966c87adfc0352c009", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d41bd8a124b805966c87adfc0352c009");
        } else if (goodsSpu == null) {
        } else {
            com.sankuai.waimai.store.platform.domain.manager.poi.a x = this.d.x();
            HashMap hashMap = new HashMap();
            hashMap.put("spu_id", Long.valueOf(goodsSpu.getId()));
            hashMap.put("poi_id", x.d());
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
            hashMap.put("final_price", Integer.valueOf(k.b(x.b, goodsSpu) != null ? 1 : 0));
            c cVar = this.c;
            cVar.a("b_waimai_kxhucnlj_mv", hashMap, view, goodsSpu.id + "-b_Wl3cp");
        }
    }

    public final void b(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05006ea09dc625f6c70191b41d133ed3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05006ea09dc625f6c70191b41d133ed3");
        } else if (goodsSpu == null) {
        } else {
            com.sankuai.waimai.store.platform.domain.manager.poi.a x = this.d.x();
            HashMap hashMap = new HashMap();
            hashMap.put("spu_id", Long.valueOf(goodsSpu.getId()));
            hashMap.put("poi_id", x.d());
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
            this.c.a("b_waimai_kxhucnlj_mc", hashMap);
        }
    }

    public final void a(View view, GoodsSpu goodsSpu, Map<String, String> map) {
        Object[] objArr = {view, goodsSpu, map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08e60dec52d75855e1a1bd7300ba360d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08e60dec52d75855e1a1bd7300ba360d");
        } else if (goodsSpu == null || map == null) {
        } else {
            com.sankuai.waimai.store.platform.domain.manager.poi.a x = this.d.x();
            HashMap hashMap = new HashMap();
            hashMap.putAll(map);
            hashMap.put("spu_id", Long.valueOf(goodsSpu.getId()));
            hashMap.put("poi_id", x.d());
            hashMap.put("final_price", Integer.valueOf(k.b(x.b, goodsSpu) != null ? 1 : 0));
            com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_kxhucnlj_mv", view);
            bVar.b(hashMap);
            bVar.e();
        }
    }

    public final void a(GoodsSpu goodsSpu, Map<String, String> map) {
        Object[] objArr = {goodsSpu, map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d23c961182867bd3b42d9d48ce7f6bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d23c961182867bd3b42d9d48ce7f6bc");
        } else if (goodsSpu == null || map == null) {
        } else {
            com.sankuai.waimai.store.platform.domain.manager.poi.a x = this.d.x();
            HashMap hashMap = new HashMap();
            hashMap.putAll(map);
            hashMap.put("spu_id", Long.valueOf(goodsSpu.getId()));
            hashMap.put("poi_id", x.d());
            this.c.a("b_waimai_kxhucnlj_mc", hashMap);
        }
    }

    public final void b(View view, GoodsSpu goodsSpu) {
        Object[] objArr = {view, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bcbd81986e0072f4b8768501787b101", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bcbd81986e0072f4b8768501787b101");
        } else if (goodsSpu == null || view == null) {
        } else {
            HashMap hashMap = new HashMap();
            c cVar = this.c;
            cVar.a("b_waimai_med_daoshoujia_mv", hashMap, view, (goodsSpu.id + 45) + "b_waimai_med_daoshoujia_mv");
        }
    }

    private void a(@NonNull Map<String, Object> map, GoodsSpu goodsSpu) {
        Object[] objArr = {map, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42696a84f76bd8f3e8081a71d6223274", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42696a84f76bd8f3e8081a71d6223274");
        } else if (goodsSpu == null || com.sankuai.shangou.stone.util.a.b(goodsSpu.productLabelPictureList)) {
            map.put("property_tag", 0);
            map.put("property_tag_location", -999);
        } else {
            com.sankuai.waimai.store.platform.domain.core.goods.a aVar = (com.sankuai.waimai.store.platform.domain.core.goods.a) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.productLabelPictureList, 0);
            if (aVar != null) {
                map.put("property_tag", Integer.valueOf(aVar.e));
                map.put("property_tag_location", Integer.valueOf(aVar.f));
            }
        }
    }

    private int e(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c07ae649d811978b352220af226d13cf", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c07ae649d811978b352220af226d13cf")).intValue() : (goodsSpu == null || goodsSpu.productAttrLabel == null || !com.sankuai.shangou.stone.util.a.a((Collection<?>) goodsSpu.productAttrLabel.attrLabelList) || com.sankuai.shangou.stone.util.a.a((Collection<?>) goodsSpu.productTopLabels) || !t.a(goodsSpu.recommendReason)) ? 0 : 1;
    }

    public final void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f83f868aa86e015189f8dd3e5a6304c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f83f868aa86e015189f8dd3e5a6304c");
            return;
        }
        Map<String, String> I = this.d.I();
        if (I == null || I.isEmpty()) {
            return;
        }
        String str = I.get("rank_trace_id");
        if (str != null) {
            map.put("rankTraceIdV2", str);
        }
        String str2 = I.get("rank_extend");
        if (str2 != null) {
            map.put("rankExtendV2", str2);
        }
    }
}
