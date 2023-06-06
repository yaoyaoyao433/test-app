package com.sankuai.waimai.mmp.modules.location;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.statistics.Constants;
import com.meituan.mmp.lib.api.location.AbsMapLocationModule;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.g;
import com.sankuai.waimai.foundation.location.utils.a;
import com.sankuai.waimai.foundation.router.interfaces.c;
import com.sankuai.waimai.platform.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class WMMMPMapLocationModule extends AbsMapLocationModule {

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class OpenLocation extends AbsMapLocationModule.AbsOpenLocation {
        public static ChangeQuickRedirect b;

        @Override // com.meituan.mmp.lib.api.ApiFunction
        public final /* synthetic */ void a(String str, AbsMapLocationModule.OpenLocationParams openLocationParams, IApiCallback iApiCallback) {
            AbsMapLocationModule.OpenLocationParams openLocationParams2 = openLocationParams;
            Object[] objArr = {str, openLocationParams2, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41bb269a91298ea1b8dd64e28da02043", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41bb269a91298ea1b8dd64e28da02043");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt(Constants.PRIVACY.KEY_LATITUDE, (int) (openLocationParams2.latitude * 1000000.0d));
            bundle.putInt(Constants.PRIVACY.KEY_LONGITUDE, (int) (openLocationParams2.longitude * 1000000.0d));
            bundle.putString("poiName", openLocationParams2.name);
            bundle.putString("poiAddress", openLocationParams2.address);
            double[] e = g.e();
            if (e != null && e.length == 2) {
                bundle.putString("distance", String.format("%.2f", Float.valueOf(a.a(new com.sankuai.waimai.foundation.location.model.a(e[0], e[1]), new com.sankuai.waimai.foundation.location.model.a(openLocationParams2.latitude, openLocationParams2.longitude)) / 1000.0f)) + "km");
            }
            com.sankuai.waimai.foundation.router.a.a(getActivity(), c.s, bundle);
            a(null, iApiCallback);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class ChooseLocation extends AbsMapLocationModule.AbsChooseLocation {
        public static ChangeQuickRedirect b;

        @Override // com.meituan.mmp.lib.api.ApiFunction
        public final /* synthetic */ void a(String str, AbsMapLocationModule.ChooseLocationParams chooseLocationParams, IApiCallback iApiCallback) {
            Object[] objArr = {str, chooseLocationParams, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50502a61e3a42aa1a46fc8c843ef2cc9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50502a61e3a42aa1a46fc8c843ef2cc9");
                return;
            }
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse("meituanwaimai://waimai.meituan.com/mapchannel/mappoint/selector?mapsource=platformminiprogram&coordtype=0"));
            intent.setPackage(getContext().getPackageName());
            startActivityForResult(intent, iApiCallback);
        }

        @Override // com.meituan.mmp.lib.api.ApiFunction, com.meituan.mmp.lib.api.AbsApi
        public void onActivityResult(int i, Intent intent, IApiCallback iApiCallback) {
            Object[] objArr = {Integer.valueOf(i), intent, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a47aa53c96cce0d324065580f8041a70", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a47aa53c96cce0d324065580f8041a70");
            } else if (i == -1) {
                AbsMapLocationModule.LocationParams locationParams = new AbsMapLocationModule.LocationParams();
                locationParams.latitude = intent.getDoubleExtra(Constants.PRIVACY.KEY_LATITUDE, 0.0d);
                locationParams.longitude = intent.getDoubleExtra(Constants.PRIVACY.KEY_LONGITUDE, 0.0d);
                locationParams.name = f.a(intent, "name");
                locationParams.address = f.a(intent, GearsLocator.ADDRESS);
                a(locationParams, iApiCallback);
            } else {
                a(-1, "user canceled", iApiCallback);
            }
        }
    }
}
