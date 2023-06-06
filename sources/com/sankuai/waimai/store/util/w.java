package com.sankuai.waimai.store.util;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class w {
    public static ChangeQuickRedirect a;
    private static Set<String> b;

    static {
        HashSet hashSet = new HashSet();
        b = hashSet;
        hashSet.add(CommonConstant.Symbol.BRACKET_LEFT);
        b.add("（");
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "32cd92a794f68a5970cd81b2fe515653", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "32cd92a794f68a5970cd81b2fe515653");
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (b.contains(Character.toString(charArray[i]))) {
                if (i == 0) {
                    return str;
                }
                String substring = str.substring(0, i);
                return TextUtils.isEmpty(substring) ? str : substring;
            }
        }
        return str;
    }

    public static int a(GoodsSpu goodsSpu, String str) {
        int a2;
        GoodsSku goodsSku;
        Object[] objArr = {goodsSpu, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f5b2ba9bd92397bd4dda2397b935346", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f5b2ba9bd92397bd4dda2397b935346")).intValue();
        }
        if (goodsSpu != null) {
            if (com.sankuai.waimai.store.config.j.h().a(SCConfigPath.FOOD_EXCHANGE_SKU, true)) {
                if (TextUtils.equals(goodsSpu.activityTag, GoodsSpu.ITEM_COLLECTION_REDEEM)) {
                    a2 = com.sankuai.waimai.store.order.a.e().a(str, goodsSpu.getId(), goodsSpu.activityTag);
                } else {
                    a2 = com.sankuai.waimai.store.order.a.e().a(str, goodsSpu.getId());
                }
            } else {
                a2 = com.sankuai.waimai.store.order.a.e().a(str, goodsSpu.getId());
            }
            List<GoodsSku> skuList = goodsSpu.getSkuList();
            return (skuList == null || skuList.size() != 1 || (goodsSku = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) skuList, 0)) == null || goodsSku.getStatus() <= 0 || a2 < goodsSku.getStock() || goodsSku.getStock() == -1) ? a2 : goodsSku.getStock();
        }
        return 0;
    }

    public static boolean a(Poi poi) {
        boolean z;
        boolean z2;
        Poi.PoiCouponEntity poiCoupon;
        Object[] objArr = {poi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee18264aeca3b23f6ffe5ba54a199c3c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee18264aeca3b23f6ffe5ba54a199c3c")).booleanValue();
        }
        Object[] objArr2 = {poi};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d81da8fc19456a2c6e4f8d9838a0cfbc", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d81da8fc19456a2c6e4f8d9838a0cfbc")).booleanValue();
        } else {
            if (poi != null) {
                ArrayList<Poi.LabelInfoListItem> labelInfoList = poi.getLabelInfoList();
                if (com.sankuai.shangou.stone.util.a.a((Collection<?>) poi.getDynamicShortLabels()) || com.sankuai.shangou.stone.util.a.a((Collection<?>) labelInfoList)) {
                    z = true;
                }
            }
            z = false;
        }
        if (!z) {
            Object[] objArr3 = {poi};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "e34f2c92eba24a1224aa80d4c4704cd9", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "e34f2c92eba24a1224aa80d4c4704cd9")).booleanValue();
            } else {
                z2 = (poi == null || (poiCoupon = poi.getPoiCoupon()) == null || !com.sankuai.shangou.stone.util.a.a((Collection<?>) poiCoupon.getPoiCouponItems())) ? false : true;
            }
            if (!z2) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(Poi poi) {
        Object[] objArr = {poi};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58de5606b22efe70eaa100602d975a98", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58de5606b22efe70eaa100602d975a98")).booleanValue() : c(poi) || d(poi) || g(poi) || f(poi);
    }

    public static boolean c(Poi poi) {
        return poi != null && poi.isNewPage == 2;
    }

    public static boolean d(Poi poi) {
        return poi != null && poi.isNewPage == 1;
    }

    public static boolean e(Poi poi) {
        return poi != null && poi.isNewPage == 3;
    }

    public static boolean f(Poi poi) {
        return poi != null && poi.isNewPage == 4;
    }

    public static boolean g(Poi poi) {
        return poi != null && poi.isNewPage == 5;
    }
}
