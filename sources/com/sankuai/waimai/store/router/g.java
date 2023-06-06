package com.sankuai.waimai.store.router;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.meituan.android.paycommon.lib.VersionInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.config.SCRouterService;
import com.sankuai.waimai.store.goods.list.model.SpecModel;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.search.model.SearchCarouselText;
import com.sankuai.waimai.store.skuchoose.i;
import com.sankuai.waimai.store.util.ak;
import com.sankuai.waimai.store.util.an;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g {
    public static ChangeQuickRedirect a;

    private static float a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af451d91315f73066b5f42e35c5e66a3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af451d91315f73066b5f42e35c5e66a3")).floatValue();
        }
        if (i <= 0) {
            return 0.4f;
        }
        return i < 3 ? 0.6f : 0.8f;
    }

    public static void a(Context context, String str, String str2, String str3) {
        Object[] objArr = {context, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ac554283950177b8fb9b4750ac4cd63c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ac554283950177b8fb9b4750ac4cd63c");
        } else {
            a(context, str, str2, str3, false);
        }
    }

    public static void a(Context context, String str, String str2, String str3, boolean z) {
        Object[] objArr = {context, str, str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aa04b667e00be6fac88087d015024d5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aa04b667e00be6fac88087d015024d5a");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("poiId", str);
        bundle.putString("poiName", str2);
        bundle.putString("from", "from poi list");
        bundle.putString("PoiListFragment", "CurrentLocation");
        if (z) {
            bundle.putBoolean("KeyNotNewIntent", true);
        }
        if (t.a(str3)) {
            d.a(context, c.a, bundle);
        } else {
            d.a(context, str3, bundle);
        }
    }

    public static void a(Context context, com.sankuai.waimai.store.param.a aVar, String str, SearchCarouselText searchCarouselText) {
        Object[] objArr = {context, aVar, str, searchCarouselText};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f6689e0fc413a9043175483452ed73a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f6689e0fc413a9043175483452ed73a");
        } else {
            a(context, aVar, str, searchCarouselText, false, "");
        }
    }

    public static void a(Context context, com.sankuai.waimai.store.param.a aVar, String str, SearchCarouselText searchCarouselText, boolean z, String str2) {
        String str3;
        Object[] objArr = {context, aVar, str, searchCarouselText, Byte.valueOf(z ? (byte) 1 : (byte) 0), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c88e566b6f5b4dfc79580edb52ccc9e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c88e566b6f5b4dfc79580edb52ccc9e3");
            return;
        }
        com.sankuai.waimai.store.mach.e.b();
        Bundle bundle = new Bundle();
        long j = aVar.c;
        if (aVar.w > 0) {
            j = aVar.w;
        }
        long a2 = com.sankuai.shangou.stone.util.f.a((Object) aVar.f, 0L);
        bundle.putInt("global_search_from", 2);
        bundle.putLong("navigate_type", j);
        bundle.putLong("category_type", aVar.c);
        bundle.putString("category_text", aVar.o);
        bundle.putLong("sub_category_type", a2);
        bundle.putString(ReactTextInputShadowNode.PROP_PLACEHOLDER, aVar.v);
        bundle.putSerializable("search_carousel_query_text", searchCarouselText);
        bundle.putString("search_bar_extend_func", aVar.ah);
        bundle.putBoolean("is_from_ocr_search", z);
        bundle.putString("search_return_path_exp", aVar.x);
        boolean a3 = com.sankuai.waimai.store.config.j.h().a(SCConfigPath.SEARCH_DOWNGRADING, false);
        if (!TextUtils.isEmpty(str2)) {
            String format = String.format("%s&query=%s", str2, a(str));
            if (TextUtils.isEmpty(str)) {
                format = str2;
            }
            d.a(context, format, bundle);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            Object[] objArr2 = new Object[2];
            objArr2[0] = a3 ? h.k : h.p;
            objArr2[1] = a(str);
            str3 = String.format("%s?query=%s", objArr2);
        } else {
            str3 = a3 ? c.i : c.e;
        }
        d.a(context, str3, bundle);
    }

    public static Bundle a(com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c368c66c5d62b177bce57a059754d33d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c368c66c5d62b177bce57a059754d33d");
        }
        Bundle bundle = new Bundle();
        long j = aVar.c;
        if (aVar.w > 0) {
            j = aVar.w;
        }
        long a2 = com.sankuai.shangou.stone.util.f.a((Object) aVar.f, 0L);
        bundle.putInt("global_search_from", 2);
        bundle.putLong("navigate_type", j);
        bundle.putLong("category_type", j);
        bundle.putLong("sub_category_type", a2);
        return bundle;
    }

    public static void a(Context context, List<com.sankuai.waimai.platform.domain.core.goods.e> list, int i, String str) {
        Object[] objArr = {context, list, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e163e26c147f326fb009be6accc7efcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e163e26c147f326fb009be6accc7efcb");
        } else if (list instanceof ArrayList) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("intent_media_infos", (ArrayList) list);
            bundle.putInt("current_img_path", i);
            bundle.putInt("intent_media_video_position", 0);
            bundle.putBoolean("intent_video_playing_boolean", false);
            bundle.putBoolean("intent_media_include_boolean", true);
            bundle.putString("intent_poi_id", str);
            d.a().a(bundle).a(context, c.k);
        }
    }

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "73c8b4b053b1183ba68252ee74d8c87d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "73c8b4b053b1183ba68252ee74d8c87d");
        } else {
            com.sankuai.waimai.platform.capacity.abtest.d.a(context);
        }
    }

    public static void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d5b5b29b984023a13bdf2e962fbd7d72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d5b5b29b984023a13bdf2e962fbd7d72");
        } else {
            com.sankuai.waimai.platform.capacity.abtest.d.a(context, str);
        }
    }

    public static void a(Context context, int i) {
        Object[] objArr = {context, 103};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9247725e7f18c8d8f4c0ea7e31244c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9247725e7f18c8d8f4c0ea7e31244c2");
        } else {
            com.sankuai.waimai.platform.capacity.abtest.d.a(context, 103);
        }
    }

    public static void a(Context context, GoodsSpu goodsSpu, Poi poi) {
        Object[] objArr = {context, goodsSpu, poi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4c5a5f831a33ad60a29166b2fecaac6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4c5a5f831a33ad60a29166b2fecaac6");
        } else {
            a(context, goodsSpu, poi, (com.sankuai.waimai.store.util.h) null);
        }
    }

    public static void a(Context context, GoodsSpu goodsSpu, Poi poi, com.sankuai.waimai.store.util.h hVar) {
        Object[] objArr = {context, goodsSpu, poi, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1588f71e87870c41fb8cf2c4bb566db4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1588f71e87870c41fb8cf2c4bb566db4");
        } else {
            a(context, goodsSpu, poi, hVar, 0);
        }
    }

    private static void a(Context context, GoodsSpu goodsSpu, Poi poi, com.sankuai.waimai.store.util.h hVar, int i) {
        boolean z = true;
        Object[] objArr = {context, goodsSpu, poi, hVar, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea8d99ecdd4701e34e9c04bd44a18514", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea8d99ecdd4701e34e9c04bd44a18514");
        } else if (goodsSpu == null) {
        } else {
            Bundle bundle = new Bundle();
            bundle.putInt("from", 0);
            bundle.putString("spuTag", goodsSpu.getTag());
            bundle.putString("activityTag", goodsSpu.activityTag);
            String str = "";
            if (SCRouterService.a()) {
                if (poi != null && poi.getBuzType() == 9) {
                    z = false;
                }
                bundle.putBoolean("isStore", z);
                GoodsSku a2 = com.sankuai.waimai.store.goods.detail.components.root.d.a(goodsSpu.getSkuList());
                String str2 = poi != null ? "isInStore=1" : "isInStore=0";
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append("&skuid=");
                sb.append(a2 != null ? a2.getSkuId() : 0L);
                String sb2 = sb.toString();
                try {
                    sb2 = sb2 + "&picture=" + URLEncoder.encode(goodsSpu.picture, "utf-8");
                } catch (Exception unused) {
                }
                if (!t.a(goodsSpu.detailScheme)) {
                    str = "&" + sb2;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(sb2);
                    sb3.append("&wmpoiid=");
                    sb3.append(poi != null ? Long.valueOf(poi.getId()) : "");
                    String sb4 = sb3.toString();
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(sb4);
                    sb5.append("&poi_id_str=");
                    sb5.append(poi != null ? poi.getStringPoiId() : "");
                    String sb6 = sb5.toString();
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(sb6);
                    sb7.append("&spuid=");
                    sb7.append(goodsSpu != null ? Long.valueOf(goodsSpu.getId()) : "");
                    String sb8 = sb7.toString();
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(sb8);
                    sb9.append("&activityTag=");
                    sb9.append(goodsSpu != null ? goodsSpu.getActivityTag() : "");
                    String sb10 = sb9.toString();
                    StringBuilder sb11 = new StringBuilder();
                    sb11.append(sb10);
                    sb11.append("&activityUuid=");
                    sb11.append(goodsSpu != null ? goodsSpu.shareActivityUuid : "");
                    String sb12 = sb11.toString();
                    StringBuilder sb13 = new StringBuilder();
                    sb13.append(sb12);
                    sb13.append("&sale_type=");
                    sb13.append(goodsSpu != null ? Integer.valueOf(goodsSpu.mSaleType) : "");
                    str = CommonConstant.Symbol.QUESTION_MARK + sb13.toString();
                }
            }
            if (!t.a(goodsSpu.detailScheme)) {
                d.a().a(FoodDetailNetWorkPreLoader.INTENT_POI, (String) poi).a("foodspu", (String) goodsSpu).a("good_detail_image_ratio", (String) Float.valueOf(hVar != null ? hVar.a : -1.0f)).a(bundle).a(74).a(context, goodsSpu.detailScheme + str);
            } else {
                d.a().a(FoodDetailNetWorkPreLoader.INTENT_POI, (String) poi).a("foodspu", (String) goodsSpu).a("good_detail_image_ratio", (String) Float.valueOf(hVar != null ? hVar.a : -1.0f)).a(bundle).a(74).a(context, c.c + str);
                com.sankuai.waimai.store.base.report.a.a(context, poi);
            }
            if (context instanceof Activity) {
                ((Activity) context).overridePendingTransition(0, 17432577);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r19, long r20, java.lang.String r22, int r23, com.sankuai.waimai.store.platform.domain.core.poi.Poi r24, int r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.router.g.a(android.content.Context, long, java.lang.String, int, com.sankuai.waimai.store.platform.domain.core.poi.Poi, int, java.lang.String):void");
    }

    public static void a(Activity activity, int i, GoodsSpu goodsSpu, @Nullable GoodsSku goodsSku, Poi poi, Map<String, Object> map) {
        HashMap<Long, Integer> a2;
        Object[] objArr = {activity, Integer.valueOf(i), goodsSpu, goodsSku, poi, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1fa2500bd840506e106bf3bf6b85b23e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1fa2500bd840506e106bf3bf6b85b23e");
        } else if (com.sankuai.waimai.store.base.abtest.a.b().c()) {
            Bundle bundle = new Bundle();
            new HashMap();
            if (com.sankuai.waimai.store.config.j.h().a(SCConfigPath.FOOD_EXCHANGE_SKU, true) && goodsSpu != null) {
                a2 = com.sankuai.waimai.store.goods.list.utils.f.a(goodsSpu, poi, goodsSpu.getActivityTag());
            } else {
                a2 = com.sankuai.waimai.store.goods.list.utils.f.a(goodsSpu, poi);
            }
            SpecModel specModel = new SpecModel(goodsSpu, "", poi.id, poi.poiIdStr, a2, com.sankuai.waimai.store.goods.list.utils.f.b);
            specModel.food_sku_id = goodsSku == null ? 0L : goodsSku.id;
            specModel.pay_sdk_version = VersionInfo.getVersion();
            if (goodsSpu != null && !TextUtils.isEmpty(goodsSpu.bridgeConfigExtra)) {
                specModel.bridge_config_extra = goodsSpu.bridgeConfigExtra;
            }
            bundle.putString("extra", com.sankuai.waimai.store.util.i.a(specModel));
            d.a(activity, com.sankuai.waimai.store.goods.list.utils.f.a(goodsSpu, activity), bundle);
        } else {
            com.sankuai.waimai.store.skuchoose.i a3 = i.a.a(activity, goodsSpu);
            a3.a(i, map);
            a3.a(0, poi, goodsSpu);
        }
    }

    public static void a(Activity activity, GoodsSpu goodsSpu, Poi poi, int i, String str, String str2) {
        HashMap<Long, Integer> a2;
        Object[] objArr = {activity, goodsSpu, poi, Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8960d154daf49230b495073df9d4813b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8960d154daf49230b495073df9d4813b");
            return;
        }
        Bundle bundle = new Bundle();
        com.sankuai.waimai.store.goods.list.utils.f.a(goodsSpu, poi);
        if (com.sankuai.waimai.store.config.j.h().a(SCConfigPath.FOOD_EXCHANGE_SKU, true) && goodsSpu != null) {
            a2 = com.sankuai.waimai.store.goods.list.utils.f.a(goodsSpu, poi, goodsSpu.getActivityTag());
        } else {
            a2 = com.sankuai.waimai.store.goods.list.utils.f.a(goodsSpu, poi);
        }
        SpecModel specModel = new SpecModel(goodsSpu, "", poi.id, poi.poiIdStr, a2, com.sankuai.waimai.store.goods.list.utils.f.b);
        specModel.poi_info = TextUtils.isEmpty(str2) ? com.sankuai.waimai.store.util.i.a(poi) : str2;
        specModel.pay_sdk_version = VersionInfo.getVersion();
        if (i != 0) {
            specModel.show_type = i;
            specModel.unique_stype = str;
        }
        if (goodsSpu != null && !TextUtils.isEmpty(goodsSpu.bridgeConfigExtra)) {
            specModel.bridge_config_extra = goodsSpu.bridgeConfigExtra;
        }
        bundle.putString("extra", com.sankuai.waimai.store.util.i.a(specModel));
        d.a(activity, com.sankuai.waimai.store.goods.list.utils.f.a(goodsSpu, activity), bundle);
    }

    public static void a(Activity activity, GoodsSpu goodsSpu, Poi poi, int i) {
        Object[] objArr = {activity, goodsSpu, poi, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "761f046c2a6e2a4cdf1a0d5ea27a9d88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "761f046c2a6e2a4cdf1a0d5ea27a9d88");
        } else if (com.sankuai.waimai.store.base.abtest.a.b().c()) {
            a(activity, goodsSpu, poi, 0, (String) null, "");
        } else {
            i.a.a(activity, goodsSpu).a(i, poi, goodsSpu);
        }
    }

    public static void a(Activity activity, GoodsSpu goodsSpu, Poi poi, int i, String str, String str2, String str3, int i2, String str4) {
        HashMap<Long, Integer> a2;
        Object[] objArr = {activity, goodsSpu, poi, Integer.valueOf(i), str, str2, str3, 0, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b84325e6e7b4c4c7e876fe3183a70ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b84325e6e7b4c4c7e876fe3183a70ba");
        } else if (com.sankuai.waimai.store.base.abtest.a.b().c()) {
            Bundle bundle = new Bundle();
            new HashMap();
            if (com.sankuai.waimai.store.config.j.h().a(SCConfigPath.FOOD_EXCHANGE_SKU, true) && goodsSpu != null) {
                a2 = com.sankuai.waimai.store.goods.list.utils.f.a(goodsSpu, poi, goodsSpu.getActivityTag());
            } else {
                a2 = com.sankuai.waimai.store.goods.list.utils.f.a(goodsSpu, poi);
            }
            SpecModel specModel = new SpecModel(goodsSpu, "", poi.id, poi.poiIdStr, a2, com.sankuai.waimai.store.goods.list.utils.f.b);
            specModel.pay_sdk_version = VersionInfo.getVersion();
            bundle.putString("extra", com.sankuai.waimai.store.util.i.a(specModel));
            d.a(activity, com.sankuai.waimai.store.goods.list.utils.f.a(goodsSpu, activity), bundle);
        } else {
            com.sankuai.waimai.store.skuchoose.i a3 = i.a.a(activity, goodsSpu);
            a3.a(str, str2, str3, i, 0, str4);
            a3.a(1, poi, goodsSpu);
        }
    }

    public static void a(Activity activity, com.sankuai.waimai.store.repository.model.f fVar, com.sankuai.waimai.store.param.a aVar, int i, int i2) {
        Object[] objArr = {activity, fVar, aVar, 5, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef906b342e1ab9838b963852856c269e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef906b342e1ab9838b963852856c269e");
        } else if (fVar == null || fVar.b == null || p.a(fVar.b.spu, fVar.b.poi)) {
        } else {
            com.sankuai.waimai.store.skuchoose.i a2 = i.a.a(activity, fVar.b.spu);
            a2.a(fVar.b.poi, aVar, i2);
            a2.a(5, fVar.b.poi, fVar.b.spu);
        }
    }

    public static void a(SCBaseActivity sCBaseActivity, long j, String str, GoodsSpu goodsSpu, String str2) {
        String str3;
        Object[] objArr = {sCBaseActivity, new Long(j), str, goodsSpu, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd4b3ae64bc92d41727aec131f13b0e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd4b3ae64bc92d41727aec131f13b0e4");
        } else if (com.sankuai.waimai.store.util.b.a(sCBaseActivity) || goodsSpu == null) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("poi_id", String.valueOf(j));
                jSONObject.put("preview_order_call_back_info", str2 == null ? "" : str2);
                str3 = jSONObject.toString();
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
                str3 = "";
            }
            d.a(sCBaseActivity, h.s + "?mrn_biz=supermarket&mrn_entry=flashbuy-cycle-buy&mrn_component=flashbuy-cycle-buy-sheet&page_height=0.8&spu_id=" + goodsSpu.getId() + "&sku_id=" + goodsSpu.getCycleSkuId() + "&wm_poi_id=" + j + "&poi_id_str=" + str + "&spu_tag=" + goodsSpu.physicalTag + "&cid=" + sCBaseActivity.b() + "&extra=" + str3);
        }
    }

    public static void a(Activity activity, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, com.sankuai.waimai.store.repository.model.h hVar, int i, GoodsSpu goodsSpu, String str) {
        Object[] objArr = {activity, aVar, hVar, Integer.valueOf(i), goodsSpu, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7769e78d153801a46054475d2d01a8b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7769e78d153801a46054475d2d01a8b5");
        } else if (com.sankuai.waimai.store.util.b.a(activity) || aVar == null) {
        } else {
            int i2 = hVar == null ? 0 : 1;
            boolean z = hVar == null ? false : hVar.h;
            if (aVar.b != null) {
                StringBuilder sb = new StringBuilder(h.s);
                sb.append("?mrn_biz=sgc&mrn_entry=flashbuy-coupons-container");
                sb.append("&mrn_component=flashbuy-coupons-container&stid=");
                sb.append(aVar.b.abExpInfo);
                sb.append("&cid=");
                sb.append(com.sankuai.waimai.store.manager.judas.b.a((Context) activity));
                sb.append("&page_height=0.8&wm_poi_id=");
                sb.append(aVar.f());
                sb.append("&poi_id_str=");
                sb.append(aVar.h());
                sb.append("&page_source=");
                sb.append(i2);
                sb.append("&selected_tab_type=");
                sb.append(i);
                sb.append("&coupon_type=-1&mrn_min_version=7.76.0");
                sb.append("&extra_data_map=" + a(goodsSpu, aVar, i2, z, str));
                d.a(activity, sb.toString());
            }
        }
    }

    private static String a(GoodsSpu goodsSpu, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, int i, boolean z, String str) {
        Object[] objArr = {goodsSpu, aVar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9af8929a48260c8b76de459ce0df4f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9af8929a48260c8b76de459ce0df4f3");
        }
        HashMap hashMap = new HashMap();
        if (goodsSpu != null) {
            hashMap.put("spu_id", Long.valueOf(goodsSpu.id));
            GoodsSku goodsSku = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.skus, 0);
            if (goodsSku != null) {
                hashMap.put("sku_id", Long.valueOf(goodsSku.id));
            }
        }
        if (aVar != null && aVar.b != null) {
            if (!t.a(aVar.b.getAdditionalFields()) && i == 0) {
                try {
                    hashMap.put("extra", URLDecoder.decode(aVar.b.getAdditionalFields(), "utf-8"));
                } catch (UnsupportedEncodingException e) {
                    com.sankuai.waimai.store.base.log.a.a(e);
                }
            }
            if (aVar.b.addition != null) {
                hashMap.put("additional_info", com.sankuai.waimai.store.util.i.a(aVar.b.addition));
            }
        }
        if (!t.a(str)) {
            hashMap.put("selectFriendCoupon", str);
        }
        hashMap.put("is_need_request", Boolean.valueOf(z));
        try {
            return URLEncoder.encode(com.sankuai.waimai.store.util.i.a(hashMap), "utf-8");
        } catch (UnsupportedEncodingException e2) {
            com.sankuai.waimai.store.base.log.a.a(e2);
            return "";
        }
    }

    public static void a(SCBaseActivity sCBaseActivity, long j, String str, GoodsSpu goodsSpu) {
        int i;
        Object[] objArr = {sCBaseActivity, new Long(j), str, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe8276843abff8e47ae116a0a1357bb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe8276843abff8e47ae116a0a1357bb4");
        } else if (com.sankuai.waimai.store.util.b.a(sCBaseActivity)) {
        } else {
            String a2 = a.a(h.s, "sgc", "flashbuy-full-pre-sale", "flashbuy-full-pre-sale");
            HashMap hashMap = new HashMap();
            hashMap.put("cid", com.sankuai.waimai.store.manager.judas.b.a((Context) sCBaseActivity));
            hashMap.put("wm_poi_id", String.valueOf(j));
            hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
            if (goodsSpu != null) {
                if (ak.a(goodsSpu)) {
                    i = com.sankuai.shangou.stone.util.a.c(goodsSpu.spuAttrsList);
                } else {
                    Map<String, List<GoodsAttr>> attrList = goodsSpu.getAttrList();
                    int i2 = com.sankuai.shangou.stone.util.a.c(goodsSpu.getSkuList()) <= 1 ? 0 : 1;
                    if (attrList != null && attrList.size() > 0) {
                        i2 += attrList.size();
                    }
                    i = i2;
                }
                hashMap.put("spu_id", String.valueOf(goodsSpu.getId()));
                hashMap.put("attr_info_length", String.valueOf(i));
            } else {
                i = 0;
            }
            hashMap.put("page_height", String.valueOf(a(i)));
            d.a(sCBaseActivity, a.a(a2, a.a(hashMap)));
        }
    }

    public static void a(Context context, long j, String str, Poi poi) {
        Object[] objArr = {context, new Long(j), str, poi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e05bf0c43d43f51834f80f9c8a081579", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e05bf0c43d43f51834f80f9c8a081579");
        } else {
            a(context, j, str, poi, (poi == null || t.a(poi.poiSpuSaleText)) ? "" : poi.poiSpuSaleText, (poi == null || t.a(poi.schemeForInshop)) ? "" : poi.schemeForInshop);
        }
    }

    public static void a(Context context, long j, String str, Poi poi, String str2, String str3) {
        Object[] objArr = {context, new Long(j), str, poi, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb38606b5a9784ed417a7e557f647d7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb38606b5a9784ed417a7e557f647d7b");
        } else if (!t.a(str3)) {
            d.a().a(context, str3);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("poi_search_placeholder", a(str2));
            hashMap.put("poi_id", String.valueOf(j));
            hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
            String a2 = a.a(h.i, a.a(hashMap));
            d.a a3 = d.a().a(hashMap);
            if (poi != null) {
                a3.a("arg_poi", (String) poi);
            }
            a3.a(context, a2);
        }
    }

    public static String a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3c59d8d0d05e9bc6300beea5cd5db9b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3c59d8d0d05e9bc6300beea5cd5db9b6");
        }
        if (obj == null) {
            return "";
        }
        try {
            String a2 = obj instanceof String ? (String) obj : com.sankuai.waimai.store.util.i.a(obj);
            return a2 != null ? URLEncoder.encode(a2, "utf-8") : "";
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return "";
        }
    }

    public static void a(com.sankuai.waimai.router.core.j jVar, String str) {
        Object[] objArr = {jVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f59af55ed7f235619115560f5cb32c5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f59af55ed7f235619115560f5cb32c5a");
        } else {
            d.b(jVar, str);
        }
    }

    public static void b(com.sankuai.waimai.router.core.j jVar, String str) {
        Object[] objArr = {jVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8bb66bd68bd29e287cfe22664424e5fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8bb66bd68bd29e287cfe22664424e5fa");
        } else {
            d.c(jVar, str);
        }
    }

    public static String a(@NonNull String str, @Nullable Map<String, String> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a15a76c5f13f772daa7251e5a96ff315", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a15a76c5f13f772daa7251e5a96ff315");
        }
        if (map.isEmpty()) {
            return str;
        }
        Uri parse = Uri.parse(str);
        String path = parse.getPath();
        if ("/mmp".equals(path) || "/msc".equals(path) || str.startsWith("dianping://msc")) {
            try {
                Uri.Builder builder = new Uri.Builder();
                builder.scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse.getPath());
                for (String str2 : parse.getQueryParameterNames()) {
                    String queryParameter = parse.getQueryParameter(str2);
                    if ("targetPath".equals(str2)) {
                        StringBuffer stringBuffer = new StringBuffer(queryParameter);
                        if (!t.a(queryParameter)) {
                            if (!queryParameter.contains(CommonConstant.Symbol.QUESTION_MARK)) {
                                stringBuffer.append(CommonConstant.Symbol.QUESTION_MARK);
                            } else if (!queryParameter.endsWith("&")) {
                                stringBuffer.append("&");
                            }
                            int size = map.size();
                            int i = 0;
                            for (String str3 : map.keySet()) {
                                i++;
                                stringBuffer.append(str3);
                                stringBuffer.append("=");
                                stringBuffer.append(an.a((Object) map.get(str3)));
                                if (i < size) {
                                    stringBuffer.append("&");
                                }
                            }
                            builder.appendQueryParameter(str2, stringBuffer.toString());
                        }
                    } else {
                        builder.appendQueryParameter(str2, queryParameter);
                    }
                }
                builder.appendQueryParameter("_sgc_msc_", "1");
                return builder.build().toString();
            } catch (Exception e) {
                com.dianping.judas.util.a.a(e);
            }
        }
        return str;
    }
}
