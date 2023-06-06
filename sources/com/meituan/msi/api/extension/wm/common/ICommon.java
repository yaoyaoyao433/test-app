package com.meituan.msi.api.extension.wm.common;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.annotations.MsiApiPermission;
import com.meituan.msi.api.IMsiCustomApi;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class ICommon implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    public abstract void a(MsiCustomContext msiCustomContext, DjEncryptRiskDataParam djEncryptRiskDataParam, i<DjEncryptRiskDataResponse> iVar);

    public abstract void a(MsiCustomContext msiCustomContext, GetGBCityInfoParam getGBCityInfoParam, i<GetGBCityInfoResponse> iVar);

    public abstract void a(MsiCustomContext msiCustomContext, GetWMCityLocationParam getWMCityLocationParam, i<GetWMCityLocationResponse> iVar);

    public abstract void a(MsiCustomContext msiCustomContext, GetWMEncryptLongitudeAndLatitudeParam getWMEncryptLongitudeAndLatitudeParam, i<GetWMEncryptLongitudeAndLatitudeResponse> iVar);

    public abstract void a(MsiCustomContext msiCustomContext, GetWmApiSignParamsParam getWmApiSignParamsParam, i<GetWmApiSignParamsResponse> iVar);

    public abstract void a(MsiCustomContext msiCustomContext, RecordWMDeepLinkBizInfoParam recordWMDeepLinkBizInfoParam, i<RecordWMDeepLinkBizInfoResponse> iVar);

    public abstract void a(MsiCustomContext msiCustomContext, RefreshLocationParam refreshLocationParam, i<RefreshLocationResponse> iVar);

    public abstract void a(MsiCustomContext msiCustomContext, i<GetWmApiCommonParamsResponse> iVar);

    public abstract void b(MsiCustomContext msiCustomContext, i<GetWMCityInfoResponse> iVar);

    public abstract void c(MsiCustomContext msiCustomContext, i<GetWMPoiAddressResponse> iVar);

    @MsiApiMethod(name = "getGBCityInfo", request = GetGBCityInfoParam.class, response = GetGBCityInfoResponse.class, scope = "wm")
    public void msiGetGBCityInfo(GetGBCityInfoParam getGBCityInfoParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {getGBCityInfoParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30232c8067b12423009091872f4312fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30232c8067b12423009091872f4312fb");
        } else {
            a(msiCustomContext, getGBCityInfoParam, new i<GetGBCityInfoResponse>() { // from class: com.meituan.msi.api.extension.wm.common.ICommon.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(GetGBCityInfoResponse getGBCityInfoResponse) {
                    GetGBCityInfoResponse getGBCityInfoResponse2 = getGBCityInfoResponse;
                    Object[] objArr2 = {getGBCityInfoResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "17865add6df6dd8c344c1b8d0cf5e01a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "17865add6df6dd8c344c1b8d0cf5e01a");
                    } else {
                        msiCustomContext.onSuccess(getGBCityInfoResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5778eebf27a2221d351f8d309ba767ab", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5778eebf27a2221d351f8d309ba767ab");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "getWMCityLocation", request = GetWMCityLocationParam.class, response = GetWMCityLocationResponse.class, scope = "wm")
    public void msiGetWMCityLocation(GetWMCityLocationParam getWMCityLocationParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {getWMCityLocationParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f8dc50d070b1dbfc5deae170724b369", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f8dc50d070b1dbfc5deae170724b369");
        } else {
            a(msiCustomContext, getWMCityLocationParam, new i<GetWMCityLocationResponse>() { // from class: com.meituan.msi.api.extension.wm.common.ICommon.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(GetWMCityLocationResponse getWMCityLocationResponse) {
                    GetWMCityLocationResponse getWMCityLocationResponse2 = getWMCityLocationResponse;
                    Object[] objArr2 = {getWMCityLocationResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "92a8b1e64bfdc59ef157ac7792f516d1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "92a8b1e64bfdc59ef157ac7792f516d1");
                    } else {
                        msiCustomContext.onSuccess(getWMCityLocationResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85ae2c259d1167316749d8149620c414", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85ae2c259d1167316749d8149620c414");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "getWMEncryptLongitudeAndLatitude", request = GetWMEncryptLongitudeAndLatitudeParam.class, response = GetWMEncryptLongitudeAndLatitudeResponse.class, scope = "wm")
    public void msiGetWMEncryptLongitudeAndLatitude(GetWMEncryptLongitudeAndLatitudeParam getWMEncryptLongitudeAndLatitudeParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {getWMEncryptLongitudeAndLatitudeParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cd431bc24ae7bd32d9480cf12143017", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cd431bc24ae7bd32d9480cf12143017");
        } else {
            a(msiCustomContext, getWMEncryptLongitudeAndLatitudeParam, new i<GetWMEncryptLongitudeAndLatitudeResponse>() { // from class: com.meituan.msi.api.extension.wm.common.ICommon.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(GetWMEncryptLongitudeAndLatitudeResponse getWMEncryptLongitudeAndLatitudeResponse) {
                    GetWMEncryptLongitudeAndLatitudeResponse getWMEncryptLongitudeAndLatitudeResponse2 = getWMEncryptLongitudeAndLatitudeResponse;
                    Object[] objArr2 = {getWMEncryptLongitudeAndLatitudeResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9b0943adf34cea689a0108e7656e0eea", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9b0943adf34cea689a0108e7656e0eea");
                    } else {
                        msiCustomContext.onSuccess(getWMEncryptLongitudeAndLatitudeResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "932a982befd1c8b9dcc313b846f16be3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "932a982befd1c8b9dcc313b846f16be3");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "getWmApiCommonParams", response = GetWmApiCommonParamsResponse.class, scope = "wm")
    public void msiGetWmApiCommonParams(final MsiCustomContext msiCustomContext) {
        Object[] objArr = {msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c380bf2f7cf37c5654d1bb41d7bfeaaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c380bf2f7cf37c5654d1bb41d7bfeaaf");
        } else {
            a(msiCustomContext, new i<GetWmApiCommonParamsResponse>() { // from class: com.meituan.msi.api.extension.wm.common.ICommon.5
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(GetWmApiCommonParamsResponse getWmApiCommonParamsResponse) {
                    GetWmApiCommonParamsResponse getWmApiCommonParamsResponse2 = getWmApiCommonParamsResponse;
                    Object[] objArr2 = {getWmApiCommonParamsResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9f27cac2c18284d75c0ff849f4374062", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9f27cac2c18284d75c0ff849f4374062");
                    } else {
                        msiCustomContext.onSuccess(getWmApiCommonParamsResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5a9271933f83dd447f2dac5b9c5ee660", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5a9271933f83dd447f2dac5b9c5ee660");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "getWmApiSignParams", request = GetWmApiSignParamsParam.class, response = GetWmApiSignParamsResponse.class, scope = "wm")
    public void msiGetWmApiSignParams(GetWmApiSignParamsParam getWmApiSignParamsParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {getWmApiSignParamsParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e0a8a83cc44023ce12a03e34440c52c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e0a8a83cc44023ce12a03e34440c52c");
        } else {
            a(msiCustomContext, getWmApiSignParamsParam, new i<GetWmApiSignParamsResponse>() { // from class: com.meituan.msi.api.extension.wm.common.ICommon.6
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(GetWmApiSignParamsResponse getWmApiSignParamsResponse) {
                    GetWmApiSignParamsResponse getWmApiSignParamsResponse2 = getWmApiSignParamsResponse;
                    Object[] objArr2 = {getWmApiSignParamsResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a5c27447dc3a511bbec56a3fbdfdc72d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a5c27447dc3a511bbec56a3fbdfdc72d");
                    } else {
                        msiCustomContext.onSuccess(getWmApiSignParamsResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0046bb76c263a2558a1b73c119742d94", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0046bb76c263a2558a1b73c119742d94");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "djEncryptRiskData", request = DjEncryptRiskDataParam.class, response = DjEncryptRiskDataResponse.class, scope = "wm")
    public void msiDjEncryptRiskData(DjEncryptRiskDataParam djEncryptRiskDataParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {djEncryptRiskDataParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7210f86b5fc0f3bd43f506aac31af80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7210f86b5fc0f3bd43f506aac31af80");
        } else {
            a(msiCustomContext, djEncryptRiskDataParam, new i<DjEncryptRiskDataResponse>() { // from class: com.meituan.msi.api.extension.wm.common.ICommon.7
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(DjEncryptRiskDataResponse djEncryptRiskDataResponse) {
                    DjEncryptRiskDataResponse djEncryptRiskDataResponse2 = djEncryptRiskDataResponse;
                    Object[] objArr2 = {djEncryptRiskDataResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0d611542c76d27d496a868efa4d03fd7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0d611542c76d27d496a868efa4d03fd7");
                    } else {
                        msiCustomContext.onSuccess(djEncryptRiskDataResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "037e6f294f0a93ce8cc19afaa4686c59", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "037e6f294f0a93ce8cc19afaa4686c59");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "getWMCityInfo", response = GetWMCityInfoResponse.class, scope = "wm")
    public void msiGetWMCityInfo(final MsiCustomContext msiCustomContext) {
        Object[] objArr = {msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76be1bd8e395da67c1b54780f10591b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76be1bd8e395da67c1b54780f10591b7");
        } else {
            b(msiCustomContext, new i<GetWMCityInfoResponse>() { // from class: com.meituan.msi.api.extension.wm.common.ICommon.8
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(GetWMCityInfoResponse getWMCityInfoResponse) {
                    GetWMCityInfoResponse getWMCityInfoResponse2 = getWMCityInfoResponse;
                    Object[] objArr2 = {getWMCityInfoResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3862984e2eafc51defb9ee392b39bfc4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3862984e2eafc51defb9ee392b39bfc4");
                    } else {
                        msiCustomContext.onSuccess(getWMCityInfoResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f91753d93c9ca850bce61e18eef14b45", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f91753d93c9ca850bce61e18eef14b45");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "getWMPoiAddress", response = GetWMPoiAddressResponse.class, scope = "wm")
    public void msiGetWMPoiAddress(final MsiCustomContext msiCustomContext) {
        Object[] objArr = {msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e701f2bc609197b0cfc99605f23a757a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e701f2bc609197b0cfc99605f23a757a");
        } else {
            c(msiCustomContext, new i<GetWMPoiAddressResponse>() { // from class: com.meituan.msi.api.extension.wm.common.ICommon.9
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(GetWMPoiAddressResponse getWMPoiAddressResponse) {
                    GetWMPoiAddressResponse getWMPoiAddressResponse2 = getWMPoiAddressResponse;
                    Object[] objArr2 = {getWMPoiAddressResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "82349632ff3f5b7a30a1bb2dc7029cc5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "82349632ff3f5b7a30a1bb2dc7029cc5");
                    } else {
                        msiCustomContext.onSuccess(getWMPoiAddressResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0d579418c26552bbbb12d2625f7296fa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0d579418c26552bbbb12d2625f7296fa");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "recordWMDeepLinkBizInfo", request = RecordWMDeepLinkBizInfoParam.class, response = RecordWMDeepLinkBizInfoResponse.class, scope = "wm")
    public void msiRecordWMDeepLinkBizInfo(RecordWMDeepLinkBizInfoParam recordWMDeepLinkBizInfoParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {recordWMDeepLinkBizInfoParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62284b6adc1e195cd650a6be54d03ede", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62284b6adc1e195cd650a6be54d03ede");
        } else {
            a(msiCustomContext, recordWMDeepLinkBizInfoParam, new i<RecordWMDeepLinkBizInfoResponse>() { // from class: com.meituan.msi.api.extension.wm.common.ICommon.10
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(RecordWMDeepLinkBizInfoResponse recordWMDeepLinkBizInfoResponse) {
                    RecordWMDeepLinkBizInfoResponse recordWMDeepLinkBizInfoResponse2 = recordWMDeepLinkBizInfoResponse;
                    Object[] objArr2 = {recordWMDeepLinkBizInfoResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5cc2c40a320725c50beb6e60745bee9d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5cc2c40a320725c50beb6e60745bee9d");
                    } else {
                        msiCustomContext.onSuccess(recordWMDeepLinkBizInfoResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "da207408fc1b64787b2da53ec2ce0369", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "da207408fc1b64787b2da53ec2ce0369");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(isForeground = true, name = "refreshLocation", request = RefreshLocationParam.class, response = RefreshLocationResponse.class, scope = "wm")
    @MsiApiPermission(apiPermissions = {"Locate.once"})
    public void msiRefreshLocation(RefreshLocationParam refreshLocationParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {refreshLocationParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f819265586618806a0cdc89e28dc55c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f819265586618806a0cdc89e28dc55c3");
        } else {
            a(msiCustomContext, refreshLocationParam, new i<RefreshLocationResponse>() { // from class: com.meituan.msi.api.extension.wm.common.ICommon.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(RefreshLocationResponse refreshLocationResponse) {
                    RefreshLocationResponse refreshLocationResponse2 = refreshLocationResponse;
                    Object[] objArr2 = {refreshLocationResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "086c29ac1921ee3ee9ea2791bedc1bde", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "086c29ac1921ee3ee9ea2791bedc1bde");
                    } else {
                        msiCustomContext.onSuccess(refreshLocationResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "daa24d367477b6ff5fe21862a97e4a8f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "daa24d367477b6ff5fe21862a97e4a8f");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }
}
