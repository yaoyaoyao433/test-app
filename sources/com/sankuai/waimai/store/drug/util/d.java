package com.sankuai.waimai.store.drug.util;

import android.app.Activity;
import android.arch.lifecycle.d;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.f;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.mrn.dialog.SGMRNDialogFragment;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.router.h;
import com.sankuai.waimai.store.search.model.SearchCarouselText;
import com.sankuai.waimai.store.util.i;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static void a(Context context, com.sankuai.waimai.store.param.a aVar, String str, SearchCarouselText searchCarouselText, boolean z, String str2) {
        String str3;
        Object[] objArr = {context, aVar, str, searchCarouselText, Byte.valueOf(z ? (byte) 1 : (byte) 0), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "02476028cbe4cb3eab8b9101962cd60a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "02476028cbe4cb3eab8b9101962cd60a");
            return;
        }
        com.sankuai.waimai.store.mach.e.b();
        Bundle bundle = new Bundle();
        long j = aVar.c;
        if (aVar.w > 0) {
            j = aVar.w;
        }
        bundle.putInt("global_search_from", 2);
        bundle.putLong("navigate_type", j);
        bundle.putLong("category_type", aVar.c);
        bundle.putString("category_text", aVar.o);
        bundle.putLong("sub_category_type", f.a(com.sankuai.waimai.store.drug.home.util.b.b(aVar, com.sankuai.waimai.store.drug.home.util.b.d, "0")));
        bundle.putString(ReactTextInputShadowNode.PROP_PLACEHOLDER, aVar.v);
        bundle.putSerializable("search_carousel_query_text", searchCarouselText);
        bundle.putInt("if_med_poi", 0);
        bundle.putLong("sec_cat_id", aVar.c);
        bundle.putString("search_bar_extend_func", aVar.ah);
        bundle.putBoolean("is_from_ocr_search", z);
        boolean a2 = j.h().a(SCConfigPath.SEARCH_DOWNGRADING, false);
        if (!TextUtils.isEmpty(str2)) {
            String format = String.format("%s&query=%s", str2, a(str));
            if (TextUtils.isEmpty(str)) {
                format = str2;
            }
            com.sankuai.waimai.store.router.d.a(context, format, bundle);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            Object[] objArr2 = new Object[2];
            objArr2[0] = a2 ? h.k : h.p;
            objArr2[1] = a(str);
            str3 = String.format("%s?query=%s", objArr2);
        } else {
            str3 = a2 ? com.sankuai.waimai.store.router.c.i : com.sankuai.waimai.store.router.c.e;
        }
        com.sankuai.waimai.store.router.d.a(context, str3, bundle);
    }

    public static String a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e313dbb636d71c2ec24a7a432cb0f936", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e313dbb636d71c2ec24a7a432cb0f936");
        }
        if (obj == null) {
            return "";
        }
        try {
            String a2 = obj instanceof String ? (String) obj : i.a(obj);
            return a2 != null ? URLEncoder.encode(a2, "utf-8") : "";
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return "";
        }
    }

    public static void a(Activity activity, GoodsSpu goodsSpu, Poi poi, int i, String str, String str2, String str3, int i2, String str4) {
        Object[] objArr = {activity, goodsSpu, poi, Integer.valueOf(i), str, str2, str3, 0, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "984e640ebbadda4e0a602a8ac221751c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "984e640ebbadda4e0a602a8ac221751c");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("index", Integer.valueOf(i));
        hashMap.put("keyword", str);
        hashMap.put("poisearch_log_id", str2);
        hashMap.put("poisearch_global_id", str3);
        a(activity, goodsSpu, poi, "", (GoodDetailResponse.BuyNowInfo) null, hashMap, 1);
    }

    public static void a(Activity activity, GoodsSpu goodsSpu, Poi poi, int i) {
        Object[] objArr = {activity, goodsSpu, poi, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db74bb378a1ef46c3973200c58bc86d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db74bb378a1ef46c3973200c58bc86d4");
        } else {
            a(activity, goodsSpu, poi, "", (GoodDetailResponse.BuyNowInfo) null, (Map<String, Object>) null, i);
        }
    }

    public static void a(Activity activity, GoodsSpu goodsSpu, Poi poi, String str, GoodDetailResponse.BuyNowInfo buyNowInfo, Map<String, Object> map, int i) {
        Object[] objArr = {activity, goodsSpu, poi, str, buyNowInfo, map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "839a27d59384851717c09b8a59282de7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "839a27d59384851717c09b8a59282de7");
        } else if (activity instanceof FragmentActivity) {
            try {
                FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
                SGMRNDialogFragment.a aVar = new SGMRNDialogFragment.a();
                aVar.d = "sku-dialog-page";
                aVar.b = "supermarket";
                aVar.c = "medicine-sku-dialog-page";
                aVar.a("poi", i.a(poi)).a("spu", i.a(goodsSpu)).a("judas_params", i.a(map)).a("buyNowInfo", i.a(buyNowInfo)).a("volleyTAG", t.a(str) ? a(activity) : str).a("from", String.valueOf(i)).a().show(supportFragmentManager, activity.getClass().getSimpleName());
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
    }

    private static String a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5de852eaa31e7056b19ccca195c73d20", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5de852eaa31e7056b19ccca195c73d20") : activity instanceof SCBaseActivity ? ((SCBaseActivity) activity).w() : "";
    }

    public static void a(Context context, GoodsSpu goodsSpu, Poi poi) {
        Object[] objArr = {context, goodsSpu, poi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "166ab6257c6b894d2e872bf9ac0591d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "166ab6257c6b894d2e872bf9ac0591d0");
        } else {
            a(context, goodsSpu, poi, (com.sankuai.waimai.store.util.h) null);
        }
    }

    public static void a(Context context, GoodsSpu goodsSpu, Poi poi, com.sankuai.waimai.store.util.h hVar) {
        Object[] objArr = {context, goodsSpu, poi, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62f98e58c7645ef75de174714834d4ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62f98e58c7645ef75de174714834d4ea");
        } else {
            a(context, goodsSpu, poi, hVar, 0);
        }
    }

    private static void a(Context context, GoodsSpu goodsSpu, Poi poi, com.sankuai.waimai.store.util.h hVar, int i) {
        Object[] objArr = {context, goodsSpu, poi, hVar, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b88df1e28ef2499ecdd787f945e39ad0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b88df1e28ef2499ecdd787f945e39ad0");
        } else if (goodsSpu == null) {
        } else {
            Bundle bundle = new Bundle();
            bundle.putInt("from", 0);
            bundle.putString("spuTag", goodsSpu.getTag());
            bundle.putString("activityTag", goodsSpu.activityTag);
            if (!t.a(goodsSpu.detailScheme)) {
                com.sankuai.waimai.store.router.d.a().a(FoodDetailNetWorkPreLoader.INTENT_POI, (String) poi).a("foodspu", (String) goodsSpu).a("good_detail_image_ratio", (String) Float.valueOf(hVar != null ? hVar.a : -1.0f)).a(bundle).a(74).a(context, goodsSpu.detailScheme);
            } else {
                GoodsSku goodsSku = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.getSkus(), 0);
                if (goodsSku == null) {
                    return;
                }
                bundle.putLong(FoodDetailNetWorkPreLoader.URI_POI, poi.id);
                bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, poi.poiIdStr);
                bundle.putLong("spuid", goodsSpu.id);
                bundle.putLong(FoodDetailNetWorkPreLoader.URI_SKU, goodsSku.id);
                com.sankuai.waimai.store.router.d.a().a(FoodDetailNetWorkPreLoader.INTENT_POI, (String) poi).a("foodspu", (String) goodsSpu).a("good_detail_image_ratio", (String) Float.valueOf(hVar != null ? hVar.a : -1.0f)).a(bundle).a(74).a(context, com.sankuai.waimai.store.router.c.d);
            }
            if (context instanceof Activity) {
                ((Activity) context).overridePendingTransition(0, 17432577);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r18, long r19, java.lang.String r21, int r22, com.sankuai.waimai.store.platform.domain.core.poi.Poi r23, int r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.drug.util.d.a(android.content.Context, long, java.lang.String, int, com.sankuai.waimai.store.platform.domain.core.poi.Poi, int, boolean):void");
    }

    public static void a(SCBaseActivity sCBaseActivity, Poi.PoiLabel poiLabel, String str) {
        String str2;
        Object[] objArr = {sCBaseActivity, poiLabel, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e5603b7e2855bdbb1159bde00bf60d2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e5603b7e2855bdbb1159bde00bf60d2b");
        } else if (sCBaseActivity == null || com.sankuai.waimai.store.util.b.a(sCBaseActivity) || sCBaseActivity.getLifecycle() == null || sCBaseActivity.getLifecycle().a() == d.b.STARTED) {
        } else {
            String str3 = "";
            if (poiLabel != null && !com.sankuai.shangou.stone.util.a.b(poiLabel.labels)) {
                str3 = i.a(poiLabel.labels);
            }
            try {
                str2 = URLEncoder.encode(str3, "utf-8");
            } catch (UnsupportedEncodingException e) {
                com.sankuai.waimai.store.base.log.a.a(e);
                str2 = "";
            }
            String a2 = a(str);
            com.sankuai.waimai.store.router.d.a(sCBaseActivity, h.s + "?mrn_biz=supermarket&mrn_entry=flashbuy-drug-info&mrn_component=flashbuy-drug-poi-service-layer&page_height=0.6&poi_labels=" + str2 + "&bulletin=" + a2);
        }
    }

    public static void a(Context context, Runnable runnable, String str, String str2, GoodsSpu goodsSpu, String str3, String str4, String str5, String str6) {
        Object[] objArr = {context, runnable, str, str2, goodsSpu, str3, str4, str5, str6};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "33f9c7b5188e5d5a38f3d17db84b125f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "33f9c7b5188e5d5a38f3d17db84b125f");
            return;
        }
        FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
        try {
            SGMRNDialogFragment.a aVar = new SGMRNDialogFragment.a();
            aVar.b = "supermarket";
            aVar.c = "medicine-spu-info";
            aVar.d = "med-spu-comb";
            aVar.f = 0.0f;
            aVar.e = 1.0f;
            aVar.i = runnable;
            aVar.a("poiId", str).a(FoodDetailNetWorkPreLoader.URI_POI_STR, str2).a("spu", i.a(goodsSpu)).a("callbackKey", str3).a("pageCid", str4).a("scene_type", str5).a("volleyTAG", str6).a("is_opacity_load", "1").a().show(supportFragmentManager, context.getClass().getSimpleName());
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }
}
