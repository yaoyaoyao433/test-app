package com.sankuai.waimai.platform.net.msi;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.msi.api.extension.wm.common.DjEncryptRiskDataParam;
import com.meituan.msi.api.extension.wm.common.DjEncryptRiskDataResponse;
import com.meituan.msi.api.extension.wm.common.GetGBCityInfoParam;
import com.meituan.msi.api.extension.wm.common.GetGBCityInfoResponse;
import com.meituan.msi.api.extension.wm.common.GetWMCityInfoResponse;
import com.meituan.msi.api.extension.wm.common.GetWMCityLocationParam;
import com.meituan.msi.api.extension.wm.common.GetWMCityLocationResponse;
import com.meituan.msi.api.extension.wm.common.GetWMEncryptLongitudeAndLatitudeParam;
import com.meituan.msi.api.extension.wm.common.GetWMEncryptLongitudeAndLatitudeResponse;
import com.meituan.msi.api.extension.wm.common.GetWMPoiAddressResponse;
import com.meituan.msi.api.extension.wm.common.GetWmApiCommonParamsResponse;
import com.meituan.msi.api.extension.wm.common.GetWmApiSignParamsParam;
import com.meituan.msi.api.extension.wm.common.GetWmApiSignParamsResponse;
import com.meituan.msi.api.extension.wm.common.ICommon;
import com.meituan.msi.api.extension.wm.common.RecordWMDeepLinkBizInfoParam;
import com.meituan.msi.api.extension.wm.common.RecordWMDeepLinkBizInfoResponse;
import com.meituan.msi.api.extension.wm.common.RefreshLocationParam;
import com.meituan.msi.api.extension.wm.common.RefreshLocationResponse;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.utils.c;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback;
import com.sankuai.waimai.foundation.location.v2.d;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.foundation.location.v2.h;
import com.sankuai.waimai.foundation.location.v2.k;
import com.sankuai.waimai.foundation.utils.LocationUtils;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.city.a;
import com.sankuai.waimai.platform.capacity.dj.city.CityInfo;
import com.sankuai.waimai.platform.capacity.dj.city.b;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.encrypt.c;
import com.sankuai.waimai.platform.net.e;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMCommonMsiBridge extends ICommon {
    public static ChangeQuickRedirect b;
    MsiCustomContext c;
    private double d;
    private double e;
    private boolean f;
    private boolean g;

    public WMCommonMsiBridge() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3e334e6f960e5be852d6be583321a6c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3e334e6f960e5be852d6be583321a6c");
            return;
        }
        this.d = 0.0d;
        this.e = 0.0d;
        this.f = true;
        this.g = false;
    }

    public static /* synthetic */ boolean b(WMCommonMsiBridge wMCommonMsiBridge, boolean z) {
        wMCommonMsiBridge.g = true;
        return true;
    }

    @Override // com.meituan.msi.api.extension.wm.common.ICommon
    public final void a(MsiCustomContext msiCustomContext, DjEncryptRiskDataParam djEncryptRiskDataParam, i<DjEncryptRiskDataResponse> iVar) {
        Object[] objArr = {msiCustomContext, djEncryptRiskDataParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e83dcb800cec756873428cc90f547968", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e83dcb800cec756873428cc90f547968");
        } else if (djEncryptRiskDataParam == null || djEncryptRiskDataParam.data == null) {
            iVar.a(-1, "加密参数不能为空");
        } else {
            String json = d.a().toJson(djEncryptRiskDataParam.data);
            DjEncryptRiskDataResponse djEncryptRiskDataResponse = new DjEncryptRiskDataResponse();
            djEncryptRiskDataResponse.encryptedData = c.a().a(json);
            if (TextUtils.isEmpty(djEncryptRiskDataResponse.encryptedData)) {
                iVar.a(-2, "加密失败，无结果");
            } else {
                iVar.a(djEncryptRiskDataResponse);
            }
        }
    }

    @Override // com.meituan.msi.api.extension.wm.common.ICommon
    public final void a(MsiCustomContext msiCustomContext, GetGBCityInfoParam getGBCityInfoParam, final i<GetGBCityInfoResponse> iVar) {
        Object[] objArr = {msiCustomContext, getGBCityInfoParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "012206b47c4ef7c877c04cb9cee52d97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "012206b47c4ef7c877c04cb9cee52d97");
        } else if (getGBCityInfoParam != null && !TextUtils.isEmpty(getGBCityInfoParam.cacheType) && "accurate".equals(getGBCityInfoParam.cacheType)) {
            final b a = b.a();
            final com.sankuai.waimai.platform.capacity.city.b<GetGBCityInfoResponse> bVar = new com.sankuai.waimai.platform.capacity.city.b<GetGBCityInfoResponse>() { // from class: com.sankuai.waimai.platform.net.msi.WMCommonMsiBridge.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.capacity.city.b
                public final /* synthetic */ void a(GetGBCityInfoResponse getGBCityInfoResponse) {
                    GetGBCityInfoResponse getGBCityInfoResponse2 = getGBCityInfoResponse;
                    Object[] objArr2 = {getGBCityInfoResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e5dc16e309054e4db2bd7c6c0bace909", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e5dc16e309054e4db2bd7c6c0bace909");
                    } else {
                        iVar.a(getGBCityInfoResponse2);
                    }
                }
            };
            Object[] objArr2 = {getGBCityInfoParam, bVar};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "c4d1d5baca4563191adacbfcd127883e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "c4d1d5baca4563191adacbfcd127883e");
            } else {
                a.a(getGBCityInfoParam != null ? getGBCityInfoParam.token : null, new rx.functions.b<CityInfo>() { // from class: com.sankuai.waimai.platform.capacity.dj.city.b.3
                    public static ChangeQuickRedirect a;

                    @Override // rx.functions.b
                    public final /* synthetic */ void call(CityInfo cityInfo) {
                        CityInfo cityInfo2 = cityInfo;
                        Object[] objArr3 = {cityInfo2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "aa0560d41bb50a712928db86c8d642c4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "aa0560d41bb50a712928db86c8d642c4");
                        } else {
                            bVar.a(b.b(a, cityInfo2));
                        }
                    }
                });
            }
        } else {
            a a2 = a.a();
            com.sankuai.waimai.platform.capacity.city.b<GetGBCityInfoResponse> bVar2 = new com.sankuai.waimai.platform.capacity.city.b<GetGBCityInfoResponse>() { // from class: com.sankuai.waimai.platform.net.msi.WMCommonMsiBridge.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.capacity.city.b
                public final /* synthetic */ void a(GetGBCityInfoResponse getGBCityInfoResponse) {
                    GetGBCityInfoResponse getGBCityInfoResponse2 = getGBCityInfoResponse;
                    Object[] objArr3 = {getGBCityInfoResponse2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "67e48888339eb57dc18a9eb3cfeeabf4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "67e48888339eb57dc18a9eb3cfeeabf4");
                    } else {
                        iVar.a(getGBCityInfoResponse2);
                    }
                }
            };
            Object[] objArr3 = {bVar2};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "02fc8b7080418c394c748b32a0ef1f2f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "02fc8b7080418c394c748b32a0ef1f2f");
            } else {
                bVar2.a(a2.b(h.q(), h.o()));
            }
        }
    }

    @Override // com.meituan.msi.api.extension.wm.common.ICommon
    public final void a(MsiCustomContext msiCustomContext, i<GetWmApiCommonParamsResponse> iVar) {
        Map<String, String> b2;
        Object[] objArr = {msiCustomContext, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f8c4bb603e192df9a0a72d402e664e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f8c4bb603e192df9a0a72d402e664e0");
            return;
        }
        GetWmApiCommonParamsResponse getWmApiCommonParamsResponse = new GetWmApiCommonParamsResponse();
        getWmApiCommonParamsResponse.wmUserIdDeregistration = String.valueOf(com.sankuai.waimai.platform.b.A().y());
        getWmApiCommonParamsResponse.wmUuidDeregistration = String.valueOf(com.sankuai.waimai.platform.b.A().z());
        Object activity = msiCustomContext.getActivity();
        if (activity == null) {
            activity = com.sankuai.waimai.addrsdk.utils.b.a;
        }
        Object[] objArr2 = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.net.util.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c1415c15c3f93518df27c44014638806", RobustBitConfig.DEFAULT_VALUE)) {
            b2 = (Map) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c1415c15c3f93518df27c44014638806");
        } else {
            b2 = e.b();
            Map<String, String> g = com.sankuai.waimai.platform.net.c.a().g();
            Map<String, String> b3 = com.sankuai.waimai.router.set_id.b.a().b();
            b2.putAll(g);
            b2.putAll(b3);
        }
        getWmApiCommonParamsResponse.adPersonalizedSwitch = b2.get("ad_personalized_switch");
        getWmApiCommonParamsResponse.contentPersonalizedSwitch = b2.get("content_personalized_switch");
        getWmApiCommonParamsResponse.personalized = b2.get("personalized");
        getWmApiCommonParamsResponse.poilistMTCityid = b2.get("poilist_mt_cityid");
        getWmApiCommonParamsResponse.poilistWMCityid = b2.get("poilist_wm_cityid");
        getWmApiCommonParamsResponse.regionId = b2.get("region_id");
        getWmApiCommonParamsResponse.regionVersion = b2.get("region_version");
        getWmApiCommonParamsResponse.utmCampaign = b2.get("utm_campaign");
        getWmApiCommonParamsResponse.utmContent = b2.get("utm_content");
        getWmApiCommonParamsResponse.utmSource = b2.get("utm_source");
        getWmApiCommonParamsResponse.utmTerm = b2.get("utm_term");
        getWmApiCommonParamsResponse.wmVisitid = b2.get("wm_visitid");
        getWmApiCommonParamsResponse.appModel = b2.get("app_model");
        getWmApiCommonParamsResponse.ci = b2.get("ci");
        iVar.a(getWmApiCommonParamsResponse);
    }

    @Override // com.meituan.msi.api.extension.wm.common.ICommon
    public final void a(MsiCustomContext msiCustomContext, GetWmApiSignParamsParam getWmApiSignParamsParam, i<GetWmApiSignParamsResponse> iVar) {
        Object[] objArr = {msiCustomContext, getWmApiSignParamsParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "976284d5953c5f57e6da6c5fee3efeee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "976284d5953c5f57e6da6c5fee3efeee");
            return;
        }
        GetWmApiSignParamsResponse getWmApiSignParamsResponse = new GetWmApiSignParamsResponse();
        int p = com.sankuai.waimai.platform.b.A().p();
        getWmApiSignParamsResponse.wmSign = com.sankuai.waimai.foundation.utils.security.a.a(getWmApiSignParamsParam.url, "", getWmApiSignParamsParam.req_time, p);
        getWmApiSignParamsResponse.wmSeq = String.valueOf(p);
        iVar.a(getWmApiSignParamsResponse);
    }

    @Override // com.meituan.msi.api.extension.wm.common.ICommon
    public final void b(MsiCustomContext msiCustomContext, final i<GetWMCityInfoResponse> iVar) {
        Object[] objArr = {msiCustomContext, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a44bd377aac952ca79bcfd544498dce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a44bd377aac952ca79bcfd544498dce");
            return;
        }
        a a = a.a();
        com.sankuai.waimai.platform.capacity.city.b<GetWMCityInfoResponse> bVar = new com.sankuai.waimai.platform.capacity.city.b<GetWMCityInfoResponse>() { // from class: com.sankuai.waimai.platform.net.msi.WMCommonMsiBridge.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.capacity.city.b
            public final /* synthetic */ void a(GetWMCityInfoResponse getWMCityInfoResponse) {
                GetWMCityInfoResponse getWMCityInfoResponse2 = getWMCityInfoResponse;
                Object[] objArr2 = {getWMCityInfoResponse2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bb2e9249718c745c309c0b10f1fe050c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bb2e9249718c745c309c0b10f1fe050c");
                } else {
                    iVar.a(getWMCityInfoResponse2);
                }
            }
        };
        Object[] objArr2 = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "44be2489a519004324bec6191945d039", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "44be2489a519004324bec6191945d039");
        } else {
            bVar.a(a.a(h.s(), h.u()));
        }
    }

    @Override // com.meituan.msi.api.extension.wm.common.ICommon
    public final void a(MsiCustomContext msiCustomContext, GetWMCityLocationParam getWMCityLocationParam, final i<GetWMCityLocationResponse> iVar) {
        Object[] objArr = {msiCustomContext, getWMCityLocationParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad6925d03f153254f14675d55133765c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad6925d03f153254f14675d55133765c");
        } else {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.platform.net.msi.WMCommonMsiBridge.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean z = false;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "84ff3b9e4363516354f23a0949ef89a5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "84ff3b9e4363516354f23a0949ef89a5");
                        return;
                    }
                    WMLocation p = g.a().p();
                    if (p != null) {
                        try {
                            String valueOf = String.valueOf(p.getLatitude());
                            String valueOf2 = String.valueOf(p.getLongitude());
                            GetWMCityLocationResponse getWMCityLocationResponse = new GetWMCityLocationResponse();
                            getWMCityLocationResponse.latitude = valueOf;
                            getWMCityLocationResponse.longitude = valueOf2;
                            getWMCityLocationResponse.cityId = Integer.parseInt(h.b().getCityCode());
                            getWMCityLocationResponse.isLocFail = (p.getLatitude() == 0.0d || p.getLongitude() == 0.0d || !p.hasLocatedPermission) ? true : true;
                            iVar.a(getWMCityLocationResponse);
                            return;
                        } catch (Exception e) {
                            a.AbstractC1040a a2 = new com.sankuai.waimai.platform.capacity.log.h().a("getWMCityLocation");
                            com.sankuai.waimai.platform.capacity.log.i.b(a2.d("getLocError:" + e.toString()).b());
                            iVar.a(new GetWMCityLocationResponse());
                            return;
                        }
                    }
                    com.sankuai.waimai.platform.capacity.log.i.b(new com.sankuai.waimai.platform.capacity.log.h().a("getWMCityLocation").d("getLocEmpty").b());
                    iVar.a(new GetWMCityLocationResponse());
                }
            });
        }
    }

    @Override // com.meituan.msi.api.extension.wm.common.ICommon
    public final void a(MsiCustomContext msiCustomContext, RefreshLocationParam refreshLocationParam, final i<RefreshLocationResponse> iVar) {
        com.meituan.android.privacy.interfaces.e createPermissionGuard;
        boolean z = false;
        Object[] objArr = {msiCustomContext, refreshLocationParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab8f4dfdd2fd7db2fd69b519f60c0bad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab8f4dfdd2fd7db2fd69b519f60c0bad");
        } else if (this.f) {
            this.f = false;
            this.c = msiCustomContext;
            final String str = refreshLocationParam._mt.sceneToken;
            Object[] objArr2 = {str, iVar};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fd842e7d75cf6f6c1005f72c1cbe0b1e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fd842e7d75cf6f6c1005f72c1cbe0b1e");
                return;
            }
            this.d = 0.0d;
            this.e = 0.0d;
            if (TextUtils.isEmpty(str)) {
                str = "dj-b5e9814e9fb3a8f6";
            }
            WMLocation p = g.a().p();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = b;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "71afb31a4a102773d10447892d54206c", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "71afb31a4a102773d10447892d54206c")).booleanValue();
            } else {
                WMLocation p2 = g.a().p();
                if (Build.VERSION.SDK_INT >= 23 && (p2 == null || !p2.hasLocatedPermission || !com.sankuai.waimai.foundation.location.utils.c.a(com.meituan.android.singleton.b.a).equals(c.a.OPEN))) {
                    z = true;
                }
            }
            if (!z) {
                a(str, iVar);
            } else if ((p == null || !p.hasLocatedPermission) && (createPermissionGuard = Privacy.createPermissionGuard()) != null) {
                createPermissionGuard.a(this.c.getActivity(), "Locate.once", str, new com.meituan.android.privacy.interfaces.d() { // from class: com.sankuai.waimai.platform.net.msi.WMCommonMsiBridge.5
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.privacy.interfaces.d
                    public final void onResult(String str2, int i) {
                        boolean z2 = false;
                        Object[] objArr4 = {str2, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f798d707548499fe67356e4e2725cd08", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f798d707548499fe67356e4e2725cd08");
                            return;
                        }
                        WMCommonMsiBridge.this.f = (i > 0 || i == -10) ? true : true;
                        if (i > 0) {
                            if (com.sankuai.waimai.foundation.location.utils.c.a(com.meituan.android.singleton.b.a).equals(c.a.OPEN)) {
                                WMCommonMsiBridge.this.a(str, iVar);
                            } else {
                                WMCommonMsiBridge.this.a();
                            }
                        }
                    }
                });
            } else {
                a();
            }
        }
    }

    @Override // com.meituan.msi.api.extension.wm.common.ICommon
    public final void a(MsiCustomContext msiCustomContext, GetWMEncryptLongitudeAndLatitudeParam getWMEncryptLongitudeAndLatitudeParam, i<GetWMEncryptLongitudeAndLatitudeResponse> iVar) {
        Object[] objArr = {msiCustomContext, getWMEncryptLongitudeAndLatitudeParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5bf166246a7cf1881be2a6851fa1237", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5bf166246a7cf1881be2a6851fa1237");
            return;
        }
        double a = r.a(getWMEncryptLongitudeAndLatitudeParam.latitude, -1.0d);
        double a2 = r.a(getWMEncryptLongitudeAndLatitudeParam.longitude, -1.0d);
        if (a <= 0.0d || a2 <= 0.0d) {
            WMLocation p = g.a().p();
            if (p != null) {
                a = p.getLatitude();
                a2 = p.getLongitude();
            } else {
                iVar.a(400, "latitude or longitude is invalid, and default location is null!");
                return;
            }
        }
        GetWMEncryptLongitudeAndLatitudeResponse getWMEncryptLongitudeAndLatitudeResponse = new GetWMEncryptLongitudeAndLatitudeResponse();
        HashMap hashMap = new HashMap();
        LocationUtils.TransformData a3 = LocationUtils.a(a2, a);
        hashMap.put("ji", Long.valueOf(a3.ji));
        hashMap.put("jf", (aa.a(a3.jf) || "0".equals(a3.jf)) ? "" : a3.jf);
        hashMap.put("wi", Long.valueOf(a3.wi));
        hashMap.put("wf", (aa.a(a3.wf) || "0".equals(a3.wf)) ? "" : a3.wf);
        getWMEncryptLongitudeAndLatitudeResponse.encryptCoordinate = hashMap;
        iVar.a(getWMEncryptLongitudeAndLatitudeResponse);
    }

    @Override // com.meituan.msi.api.extension.wm.common.ICommon
    public final void c(MsiCustomContext msiCustomContext, i<GetWMPoiAddressResponse> iVar) {
        Object[] objArr = {msiCustomContext, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f3ce54dbc4b8b99a7074bc5a1e924f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f3ce54dbc4b8b99a7074bc5a1e924f3");
            return;
        }
        WmAddress k = g.a().k();
        GetWMPoiAddressResponse getWMPoiAddressResponse = new GetWMPoiAddressResponse();
        if (k != null) {
            getWMPoiAddressResponse.address = k.getAddress();
            getWMPoiAddressResponse.latitude = (long) (k.getWMLocation().getLatitude() * 1000000.0d);
            getWMPoiAddressResponse.longitude = (long) (k.getWMLocation().getLongitude() * 1000000.0d);
        } else {
            getWMPoiAddressResponse.address = "";
            getWMPoiAddressResponse.longitude = 0L;
            getWMPoiAddressResponse.latitude = 0L;
        }
        iVar.a(getWMPoiAddressResponse);
    }

    @Override // com.meituan.msi.api.extension.wm.common.ICommon
    public final void a(MsiCustomContext msiCustomContext, RecordWMDeepLinkBizInfoParam recordWMDeepLinkBizInfoParam, i<RecordWMDeepLinkBizInfoResponse> iVar) {
        Object[] objArr = {msiCustomContext, recordWMDeepLinkBizInfoParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "755cc46ad639abfcc4ed310f4a43d216", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "755cc46ad639abfcc4ed310f4a43d216");
            return;
        }
        Object[] objArr2 = {msiCustomContext, recordWMDeepLinkBizInfoParam, iVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.capacity.deeplink.d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "dd66f1bb390eb74566532f4ca239d8a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "dd66f1bb390eb74566532f4ca239d8a4");
            return;
        }
        Activity activity = msiCustomContext.getActivity();
        if (activity == null) {
            iVar.a(1002, "activity is null.");
            return;
        }
        Gson gson = new Gson();
        boolean a = com.sankuai.waimai.platform.capacity.deeplink.c.a(activity, recordWMDeepLinkBizInfoParam.bizKey, (Map) gson.fromJson(gson.toJsonTree(recordWMDeepLinkBizInfoParam.bizInfo), (Class<Object>) Map.class));
        RecordWMDeepLinkBizInfoResponse recordWMDeepLinkBizInfoResponse = new RecordWMDeepLinkBizInfoResponse();
        if (!a) {
            iVar.a(1002, "not in deeplink context.");
            return;
        }
        recordWMDeepLinkBizInfoResponse.code = a;
        iVar.a(recordWMDeepLinkBizInfoResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, final i<RefreshLocationResponse> iVar) {
        Object[] objArr = {str, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e1d2135763455b28c42141ed1e38f45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e1d2135763455b28c42141ed1e38f45");
            return;
        }
        final RefreshLocationResponse refreshLocationResponse = new RefreshLocationResponse();
        g.a().a(new DeviceLocateCallback() { // from class: com.sankuai.waimai.platform.net.msi.WMCommonMsiBridge.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback
            public final void a(WMLocation wMLocation) {
                Object[] objArr2 = {wMLocation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "518054dcc3c22ec567b25d32b0b4c5cf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "518054dcc3c22ec567b25d32b0b4c5cf");
                    return;
                }
                WMCommonMsiBridge.this.f = true;
                if (wMLocation.getLocationResultCode().a == 1200) {
                    WMCommonMsiBridge.b(WMCommonMsiBridge.this, true);
                    WMCommonMsiBridge.this.d = wMLocation.getLatitude();
                    WMCommonMsiBridge.this.e = wMLocation.getLongitude();
                    refreshLocationResponse.latitude = String.valueOf(wMLocation.getLatitude());
                    refreshLocationResponse.longitude = String.valueOf(wMLocation.getLongitude());
                    return;
                }
                refreshLocationResponse.addressName = "定位失败，请在网络良好时重试";
                refreshLocationResponse.isLocFail = true;
            }
        }, new com.sankuai.waimai.foundation.location.v2.callback.b() { // from class: com.sankuai.waimai.platform.net.msi.WMCommonMsiBridge.7
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.location.v2.callback.b
            public final void a(WmAddress wmAddress) {
                long j;
                Object[] objArr2 = {wmAddress};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1d01b165117fc833f5ebbdaa408f6cb5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1d01b165117fc833f5ebbdaa408f6cb5");
                    return;
                }
                WMCommonMsiBridge.this.f = true;
                if (wmAddress != null && wmAddress.hasAddress()) {
                    WMCommonMsiBridge wMCommonMsiBridge = WMCommonMsiBridge.this;
                    String address = wmAddress.getAddress();
                    RefreshLocationResponse refreshLocationResponse2 = refreshLocationResponse;
                    Object[] objArr3 = {address, wmAddress, refreshLocationResponse2, iVar};
                    ChangeQuickRedirect changeQuickRedirect3 = WMCommonMsiBridge.b;
                    if (PatchProxy.isSupport(objArr3, wMCommonMsiBridge, changeQuickRedirect3, false, "78c57975143066d5f85ade53cd3974c4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, wMCommonMsiBridge, changeQuickRedirect3, false, "78c57975143066d5f85ade53cd3974c4");
                    } else {
                        wMCommonMsiBridge.a(address, wmAddress, refreshLocationResponse2);
                        WMLocation wMLocation = wmAddress.getWMLocation();
                        long j2 = 0;
                        if (wMLocation != null) {
                            j2 = (long) (wMLocation.getLongitude() * 1000000.0d);
                            j = (long) (wMLocation.getLatitude() * 1000000.0d);
                        } else {
                            j = 0;
                        }
                        JudasManualManager.a("b_waimai_o5nf04so_mc", "c_9le3i2l", AppUtil.generatePageInfoKey(wMCommonMsiBridge.c.getActivity())).a(GearsLocator.ADDRESS, address).a(Constants.PRIVACY.KEY_LONGITUDE, j2).a(Constants.PRIVACY.KEY_LATITUDE, j).a();
                    }
                } else {
                    WMCommonMsiBridge wMCommonMsiBridge2 = WMCommonMsiBridge.this;
                    RefreshLocationResponse refreshLocationResponse3 = refreshLocationResponse;
                    Object[] objArr4 = {refreshLocationResponse3};
                    ChangeQuickRedirect changeQuickRedirect4 = WMCommonMsiBridge.b;
                    if (PatchProxy.isSupport(objArr4, wMCommonMsiBridge2, changeQuickRedirect4, false, "2945a39d4954d3e3e0cc3758c4677bfa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, wMCommonMsiBridge2, changeQuickRedirect4, false, "2945a39d4954d3e3e0cc3758c4677bfa");
                    } else {
                        refreshLocationResponse3.isRegeoFail = true;
                        wMCommonMsiBridge2.a("定位失败，请在网络良好时重试", (WmAddress) null, refreshLocationResponse3);
                    }
                }
                iVar.a(refreshLocationResponse);
            }
        }, true, false, com.sankuai.waimai.platform.domain.manager.location.v2.b.LOCATE_MANUALLY.toString(), new k(this.c.getActivity(), str));
    }

    void a(String str, WmAddress wmAddress, RefreshLocationResponse refreshLocationResponse) {
        Object[] objArr = {str, wmAddress, refreshLocationResponse};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6df2910c4c368b0179914e7f2a6acce7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6df2910c4c368b0179914e7f2a6acce7");
            return;
        }
        refreshLocationResponse.addressName = str;
        if (this.g) {
            if (str.equals("定位失败，请在网络良好时重试")) {
                str = "未知地址";
            } else {
                com.sankuai.waimai.foundation.location.g.a(this.d, this.e, str);
                com.sankuai.waimai.foundation.location.g.k();
            }
            com.sankuai.waimai.platform.domain.manager.location.a.b(this.c.getActivity());
            if (wmAddress != null) {
                WMLocation wMLocation = wmAddress.getWMLocation();
                refreshLocationResponse.addressName = str;
                refreshLocationResponse.longitude = String.valueOf(wMLocation.getLongitude());
                refreshLocationResponse.latitude = String.valueOf(wMLocation.getLatitude());
                refreshLocationResponse.cityName = a(wmAddress);
                return;
            }
            return;
        }
        this.f = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dafab34c78c83f87db117b7d80ad3225", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dafab34c78c83f87db117b7d80ad3225");
        } else if (this.c == null) {
        } else {
            this.c.getActivity().startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 301);
        }
    }

    private String a(@NonNull WmAddress wmAddress) {
        Object[] objArr = {wmAddress};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d81d072dfa423a785c17f7e19a33021", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d81d072dfa423a785c17f7e19a33021");
        }
        if (wmAddress.getMeitaunCity() != null) {
            return wmAddress.getMeitaunCity().getCityName();
        }
        return wmAddress.getMafCity() != null ? wmAddress.getMafCity().getCityName() : "";
    }
}
