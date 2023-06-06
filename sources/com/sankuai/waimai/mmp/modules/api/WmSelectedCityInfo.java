package com.sankuai.waimai.mmp.modules.api;

import com.meituan.msi.addapter.cityinfo.CityInfoParam;
import com.meituan.msi.addapter.cityinfo.CityInfoResponse;
import com.meituan.msi.addapter.cityinfo.CityInfoResult;
import com.meituan.msi.addapter.cityinfo.IGetSelectedCityInfo;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
import com.sankuai.waimai.foundation.location.v2.City;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WmSelectedCityInfo extends IGetSelectedCityInfo {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msi.addapter.cityinfo.IGetSelectedCityInfo
    public final CityInfoResult a(final MsiCustomContext msiCustomContext, CityInfoParam cityInfoParam) {
        Object[] objArr = {msiCustomContext, cityInfoParam};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bf2245d3785324f7322061b19fc2a1d", RobustBitConfig.DEFAULT_VALUE)) {
            return (CityInfoResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bf2245d3785324f7322061b19fc2a1d");
        }
        a(msiCustomContext, cityInfoParam, new i<CityInfoResult>() { // from class: com.sankuai.waimai.mmp.modules.api.WmSelectedCityInfo.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msi.api.i
            public final /* synthetic */ void a(CityInfoResult cityInfoResult) {
                CityInfoResult cityInfoResult2 = cityInfoResult;
                Object[] objArr2 = {cityInfoResult2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cedf499783ddbbbe734805ce9b8bcba6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cedf499783ddbbbe734805ce9b8bcba6");
                } else {
                    msiCustomContext.onSuccess(cityInfoResult2);
                }
            }

            @Override // com.meituan.msi.api.i
            public final void a(int i, String str) {
                Object[] objArr2 = {Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "49475d84496e4f7de90389c2351282bc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "49475d84496e4f7de90389c2351282bc");
                } else {
                    msiCustomContext.onError(i, str);
                }
            }
        });
        return null;
    }

    @Override // com.meituan.msi.addapter.cityinfo.IGetSelectedCityInfo
    public final void a(MsiCustomContext msiCustomContext, CityInfoParam cityInfoParam, i<CityInfoResult> iVar) {
        City meitaunCity;
        WMLocation wMLocation;
        Object[] objArr = {msiCustomContext, cityInfoParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb917b4768485a082d7a0e91d4aa428a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb917b4768485a082d7a0e91d4aa428a");
            return;
        }
        WmAddress k = g.a().k();
        CityInfoResult cityInfoResult = new CityInfoResult();
        if (k != null && (meitaunCity = k.getMeitaunCity()) != null && (wMLocation = k.getWMLocation()) != null) {
            cityInfoResult.name = meitaunCity.getCityName();
            cityInfoResult.id = Long.valueOf(NumberUtils.parseLong(meitaunCity.getCityCode(), 1L));
            cityInfoResult.longitude = Double.valueOf(wMLocation.getLongitude());
            cityInfoResult.latitude = Double.valueOf(wMLocation.getLatitude());
            cityInfoResult.pinyin = "";
            cityInfoResult.isDomestic = Boolean.TRUE;
            cityInfoResult.isOversea = Boolean.FALSE;
            cityInfoResult.rawOffset = 0;
            cityInfoResult.standardOffset = "0";
            cityInfoResult.destinationOffset = "0";
            iVar.a(cityInfoResult);
            return;
        }
        iVar.a(500, "address is null");
    }

    @Override // com.meituan.msi.addapter.cityinfo.IGetSelectedCityInfo
    public final void a(MsiCustomContext msiCustomContext, i<CityInfoResponse> iVar) {
        City meitaunCity;
        WMLocation wMLocation;
        Object[] objArr = {msiCustomContext, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "744ed26f174ab92a4ed110f7fff433b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "744ed26f174ab92a4ed110f7fff433b9");
            return;
        }
        WmAddress j = g.a().j();
        CityInfoResponse cityInfoResponse = new CityInfoResponse();
        if (j != null && (meitaunCity = j.getMeitaunCity()) != null && (wMLocation = j.getWMLocation()) != null) {
            cityInfoResponse.id = Long.valueOf(NumberUtils.parseLong(meitaunCity.getCityCode(), 1L));
            cityInfoResponse.name = meitaunCity.getCityName();
            cityInfoResponse.pinyin = "";
            cityInfoResponse.latitude = Double.valueOf(wMLocation.getLatitude());
            cityInfoResponse.longitude = Double.valueOf(wMLocation.getLongitude());
            cityInfoResponse.isOversea = Boolean.FALSE;
            cityInfoResponse.isDomestic = Boolean.TRUE;
            cityInfoResponse.rawOffset = 0;
            cityInfoResponse.destinationOffset = "0";
            cityInfoResponse.standardOffset = "0";
            iVar.a(cityInfoResponse);
            return;
        }
        iVar.a(500, "address is null");
    }
}
