package com.sankuai.waimai.business.restaurant.rn.schemereplace;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.a;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.foundation.location.g;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
import com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PoiAddressMapSchemeRule implements SchemeReplaceRule {
    private static final String POI_ADDRESS_MAP_MRN_AB_MT = "mt_waimai_poi_address_map_android";
    private static final String POI_ADDRESS_MAP_MRN_AB_WM = "waimai_poi_address_map_android";
    public static ChangeQuickRedirect changeQuickRedirect;

    private boolean isABTestHit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2c356fb0b4f97a2b1a72caf2b134364", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2c356fb0b4f97a2b1a72caf2b134364")).booleanValue();
        }
        ABStrategy strategy = ABTestManager.getInstance(b.a).getStrategy(a.d() ? POI_ADDRESS_MAP_MRN_AB_WM : POI_ADDRESS_MAP_MRN_AB_MT, null);
        return strategy != null && strategy.expName.equals(ErrorCode.ERROR_TYPE_B);
    }

    @Override // com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public boolean shouldReplace(@NonNull Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b153d054e2db1cc65ea59e4df51fbfa3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b153d054e2db1cc65ea59e4df51fbfa3")).booleanValue() : TextUtils.equals(uri.getPath(), "/poiaddressmap");
    }

    @Override // com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public void schemeReplace(@NonNull j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27e58f0cd104e80d714320e86eaa1dc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27e58f0cd104e80d714320e86eaa1dc2");
            return;
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("wm_router").authority("page").path("mrn").query(jVar.d.getQuery()).appendQueryParameter("mrn_biz", "waimai").appendQueryParameter("mrn_entry", "poi-address-map").appendQueryParameter("mrn_component", "poiAddressMap");
        Bundle bundle = (Bundle) jVar.a(Bundle.class, "com.sankuai.waimai.router.activity.intent_extra");
        if (bundle != null) {
            int i = bundle.getInt(Constants.PRIVACY.KEY_LATITUDE, 0);
            int i2 = bundle.getInt(Constants.PRIVACY.KEY_LONGITUDE, 0);
            bundle.remove(Constants.PRIVACY.KEY_LATITUDE);
            bundle.remove(Constants.PRIVACY.KEY_LONGITUDE);
            bundle.putString(Constants.PRIVACY.KEY_LATITUDE, String.valueOf(i / 1000000.0d));
            bundle.putString(Constants.PRIVACY.KEY_LONGITUDE, String.valueOf(i2 / 1000000.0d));
            bundle.putString("poiname", bundle.getString("poiName"));
            bundle.putString(GearsLocator.ADDRESS, bundle.getString("poiAddress"));
            double[] e = g.e();
            if (e != null && e.length >= 2) {
                bundle.putString("userLatitude", String.valueOf(e[0]));
                bundle.putString("userLongitude", String.valueOf(e[1]));
            }
        }
        jVar.a(appendQueryParameter.build());
    }
}
