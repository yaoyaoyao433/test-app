package com.sankuai.waimai.popup;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.meituan.passport.PassportConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.platform.popup.WMBasePopup;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a = null;
    public static String b = "sky_fall_request";
    public static boolean c = false;

    public static boolean a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "782d54839c0cca369a436569b94f05bc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "782d54839c0cca369a436569b94f05bc")).booleanValue();
        }
        boolean a2 = com.sankuai.waimai.platform.utils.f.a(intent, b, false);
        if (intent != null) {
            intent.putExtra(b, false);
        }
        return a2;
    }

    public static Intent a(WMBasePopup.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "33e5af5a547b186a0d88f4cafd0d2767", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "33e5af5a547b186a0d88f4cafd0d2767");
        }
        if (bVar.d == null || !bVar.d.containsKey(WMStartUpPopup.SPLASH_AD_INTENT)) {
            return null;
        }
        return (Intent) bVar.d.get(WMStartUpPopup.SPLASH_AD_INTENT);
    }

    public static boolean a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc46905e8bfcff4c8a475b698e2ba8d4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc46905e8bfcff4c8a475b698e2ba8d4")).booleanValue();
        }
        if (com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) activity, "has_multi_person_order", false)) {
            Bundle bundle = new Bundle();
            bundle.putInt("page_source", 3);
            long b2 = com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) activity, "multi_person_order_poi_id", 0L);
            String b3 = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(activity, "multi_person_order_poi_id_str", "");
            String b4 = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(activity, "multi_person_order_cart_id", "");
            StringBuilder sb = new StringBuilder();
            sb.append(b2);
            bundle.putString("poi_id", sb.toString());
            bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, b3);
            bundle.putString("cart_id", b4);
            com.sankuai.waimai.foundation.router.a.a(activity, "wm_router://page/mrn?mrn_biz=waimai&mrn_component=multiPerson&mrn_entry=multi-person", bundle);
            return true;
        }
        return false;
    }

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e2c57fbe392d9ead7f2247737476ab9c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e2c57fbe392d9ead7f2247737476ab9c")).booleanValue();
        }
        PassportConfig.d(false);
        return false;
    }
}
