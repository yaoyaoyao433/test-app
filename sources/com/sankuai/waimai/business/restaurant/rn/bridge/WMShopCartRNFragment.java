package com.sankuai.waimai.business.restaurant.rn.bridge;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.core.utils.e;
import com.sankuai.waimai.platform.machpro.mrn.MRNMachProViewManager;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMShopCartRNFragment extends ShopCartCommonRNFragment {
    public static ChangeQuickRedirect g;

    public static ShopCartCommonRNFragment a(Intent intent) {
        Bundle bundle;
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "234bfca91072c13ec02f1be17a0bee05", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShopCartCommonRNFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "234bfca91072c13ec02f1be17a0bee05");
        }
        Object[] objArr2 = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = ShopCartCommonRNFragment.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1edb513b7abf18029293601a0fbfb4a4", RobustBitConfig.DEFAULT_VALUE)) {
            bundle = (Bundle) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1edb513b7abf18029293601a0fbfb4a4");
        } else if (intent == null || intent.getData() == null) {
            bundle = null;
        } else {
            Uri data = intent.getData();
            String queryParameter = data.getQueryParameter("mrn_biz");
            String queryParameter2 = data.getQueryParameter("mrn_entry");
            String queryParameter3 = data.getQueryParameter("mrn_component");
            Bundle bundle2 = new Bundle();
            bundle2.putString("mrn_biz", queryParameter);
            bundle2.putString("mrn_entry", queryParameter2);
            bundle2.putString("mrn_component", queryParameter3);
            Bundle extras = intent.getExtras();
            if (extras != null && extras.getInt("jump_from") == 1) {
                bundle2.putInt("jump_from", 1);
                bundle2.putString("poi_id", String.valueOf(extras.getLong("poi_id")));
                bundle2.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, String.valueOf(extras.getString(FoodDetailNetWorkPreLoader.URI_POI_STR)));
                bundle2.putString("poi_search_placeholder", extras.getString("poi_search_placeholder"));
            }
            if (extras != null && !TextUtils.isEmpty(extras.getString("extra"))) {
                bundle2.putString("extra", extras.getString("extra"));
            }
            if (extras != null && extras.getBundle("rn_extra_data") != null) {
                bundle2.putAll(extras.getBundle("rn_extra_data"));
            }
            String a = e.a(intent);
            if (!TextUtils.isEmpty(a)) {
                bundle2.putString("linkIdentifierInfo", a);
            }
            bundle2.putInt("isRestrict", com.sankuai.waimai.business.restaurant.composeorder.a.b ? 1 : 0);
            bundle = bundle2;
        }
        if (bundle == null) {
            return null;
        }
        WMShopCartRNFragment wMShopCartRNFragment = new WMShopCartRNFragment();
        wMShopCartRNFragment.setArguments(bundle);
        return wMShopCartRNFragment;
    }

    @Override // com.sankuai.waimai.business.restaurant.rn.bridge.ShopCartCommonRNFragment
    public final List<NativeModule> a(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b07a4a1505dc7d602cb677bbed19195", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b07a4a1505dc7d602cb677bbed19195") : Collections.singletonList(new WMRNShoppingCartManager(reactApplicationContext));
    }

    @Override // com.sankuai.waimai.business.restaurant.rn.bridge.ShopCartCommonRNFragment
    public final List<ViewManager> b(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c80c56561cb631881bb35b8e3fbc7a4", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c80c56561cb631881bb35b8e3fbc7a4") : Collections.singletonList(new MRNMachProViewManager());
    }
}
