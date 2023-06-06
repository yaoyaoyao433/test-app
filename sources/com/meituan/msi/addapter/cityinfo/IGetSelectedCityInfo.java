package com.meituan.msi.addapter.cityinfo;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiCustomApi;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class IGetSelectedCityInfo implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    public abstract CityInfoResult a(MsiCustomContext msiCustomContext, CityInfoParam cityInfoParam);

    public abstract void a(MsiCustomContext msiCustomContext, CityInfoParam cityInfoParam, i<CityInfoResult> iVar);

    public abstract void a(MsiCustomContext msiCustomContext, i<CityInfoResponse> iVar);

    @MsiApiMethod(name = "getSelectedCityInfo", request = CityInfoParam.class, response = CityInfoResult.class)
    public void msiGetSelectedCityInfo(CityInfoParam cityInfoParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {cityInfoParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaa463a4c1bff76f83eb8ba53b783694", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaa463a4c1bff76f83eb8ba53b783694");
        } else {
            a(msiCustomContext, cityInfoParam, new i<CityInfoResult>() { // from class: com.meituan.msi.addapter.cityinfo.IGetSelectedCityInfo.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(CityInfoResult cityInfoResult) {
                    CityInfoResult cityInfoResult2 = cityInfoResult;
                    Object[] objArr2 = {cityInfoResult2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d716112ae803f57dcb042fe2f847e96c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d716112ae803f57dcb042fe2f847e96c");
                    } else {
                        msiCustomContext.onSuccess(cityInfoResult2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c2b3afd436e57b1ab2d69f0089381e9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c2b3afd436e57b1ab2d69f0089381e9");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "getSelectedCityInfoSync", request = CityInfoParam.class, response = CityInfoResult.class)
    public CityInfoResult msiGetSelectedCityInfoSync(CityInfoParam cityInfoParam, MsiCustomContext msiCustomContext) {
        Object[] objArr = {cityInfoParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "052c127dd50dc171876f0c1e423eceab", RobustBitConfig.DEFAULT_VALUE) ? (CityInfoResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "052c127dd50dc171876f0c1e423eceab") : a(msiCustomContext, cityInfoParam);
    }

    @MsiApiMethod(name = "getCityInfo", response = CityInfoResponse.class)
    public void msiGetCityInfo(final MsiCustomContext msiCustomContext) {
        Object[] objArr = {msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9d21dac8382c20586009a1e4151432a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9d21dac8382c20586009a1e4151432a");
        } else {
            a(msiCustomContext, new i<CityInfoResponse>() { // from class: com.meituan.msi.addapter.cityinfo.IGetSelectedCityInfo.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(CityInfoResponse cityInfoResponse) {
                    CityInfoResponse cityInfoResponse2 = cityInfoResponse;
                    Object[] objArr2 = {cityInfoResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6c11fe9671f28eed619a97138ed76836", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6c11fe9671f28eed619a97138ed76836");
                    } else {
                        msiCustomContext.onSuccess(cityInfoResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f7a9c408e28cf0602bf037d5d0d01ed5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f7a9c408e28cf0602bf037d5d0d01ed5");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }
}
