package com.sankuai.waimai.business.address.msi;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.d;
import com.meituan.android.privacy.interfaces.e;
import com.meituan.android.singleton.b;
import com.meituan.msi.api.i;
import com.meituan.msi.api.location.IRefreshLocation;
import com.meituan.msi.api.location.RefreshLocationParam;
import com.meituan.msi.api.location.RefreshLocationResponse;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.utils.c;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.foundation.location.v2.k;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.domain.manager.location.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RefreshLocation extends IRefreshLocation {
    public static ChangeQuickRedirect b;
    MsiCustomContext c;
    private double d;
    private double e;
    private boolean f;
    private boolean g;
    private String h;

    public RefreshLocation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c0158dbb80ea2af95d69134ab296b7a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c0158dbb80ea2af95d69134ab296b7a");
            return;
        }
        this.d = 0.0d;
        this.e = 0.0d;
        this.f = true;
        this.g = false;
    }

    public static /* synthetic */ boolean b(RefreshLocation refreshLocation, boolean z) {
        refreshLocation.g = true;
        return true;
    }

    @Override // com.meituan.msi.api.location.IRefreshLocation
    public final void a(MsiCustomContext msiCustomContext, RefreshLocationParam refreshLocationParam, final i<RefreshLocationResponse> iVar) {
        e createPermissionGuard;
        boolean z = false;
        Object[] objArr = {msiCustomContext, refreshLocationParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f123ec92bc56825a74081460e0404a88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f123ec92bc56825a74081460e0404a88");
        } else if (this.f) {
            this.f = false;
            this.c = msiCustomContext;
            final String str = refreshLocationParam._mt.sceneToken;
            this.h = refreshLocationParam.pageSource;
            Object[] objArr2 = {str, iVar};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0bd81540dce0e102a719b4028ca35fb6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0bd81540dce0e102a719b4028ca35fb6");
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
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ec652d8023312129aad6e53a6026d64b", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ec652d8023312129aad6e53a6026d64b")).booleanValue();
            } else {
                WMLocation p2 = g.a().p();
                if (Build.VERSION.SDK_INT >= 23 && (p2 == null || !p2.hasLocatedPermission || !c.a(b.a).equals(c.a.OPEN))) {
                    z = true;
                }
            }
            if (!z) {
                a(str, iVar);
            } else if ((p == null || !p.hasLocatedPermission) && (createPermissionGuard = Privacy.createPermissionGuard()) != null) {
                createPermissionGuard.a(this.c.getActivity(), "Locate.once", str, new d() { // from class: com.sankuai.waimai.business.address.msi.RefreshLocation.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.privacy.interfaces.d
                    public final void onResult(String str2, int i) {
                        boolean z2 = false;
                        Object[] objArr4 = {str2, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5c15199fda17296bea0bd6e6481458fa", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5c15199fda17296bea0bd6e6481458fa");
                            return;
                        }
                        RefreshLocation.this.f = (i > 0 || i == -10) ? true : true;
                        if (i > 0) {
                            if (c.a(b.a).equals(c.a.OPEN)) {
                                RefreshLocation.this.a(str, iVar);
                            } else {
                                RefreshLocation.this.b();
                            }
                        }
                    }
                });
            } else {
                b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, final i<RefreshLocationResponse> iVar) {
        Object[] objArr = {str, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00b5c6698f853ce489d49d1b9932cb64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00b5c6698f853ce489d49d1b9932cb64");
            return;
        }
        final RefreshLocationResponse refreshLocationResponse = new RefreshLocationResponse();
        DeviceLocateCallback deviceLocateCallback = new DeviceLocateCallback() { // from class: com.sankuai.waimai.business.address.msi.RefreshLocation.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback
            public final void a(WMLocation wMLocation) {
                Object[] objArr2 = {wMLocation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4436b6d32d3a9f19a4aa87aded02b15e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4436b6d32d3a9f19a4aa87aded02b15e");
                    return;
                }
                RefreshLocation.this.f = true;
                if (wMLocation.getLocationResultCode().a != 1200) {
                    refreshLocationResponse.addressName = RefreshLocation.this.c.getActivity().getString(R.string.wm_address_manually_failed);
                    refreshLocationResponse.isLocFail = true;
                    return;
                }
                RefreshLocation.b(RefreshLocation.this, true);
                RefreshLocation.this.d = wMLocation.getLatitude();
                RefreshLocation.this.e = wMLocation.getLongitude();
                refreshLocationResponse.latitude = String.valueOf(wMLocation.getLatitude());
                refreshLocationResponse.longitude = String.valueOf(wMLocation.getLongitude());
            }
        };
        com.sankuai.waimai.foundation.location.v2.callback.b bVar = new com.sankuai.waimai.foundation.location.v2.callback.b() { // from class: com.sankuai.waimai.business.address.msi.RefreshLocation.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.location.v2.callback.b
            public final void a(WmAddress wmAddress) {
                long j;
                Object[] objArr2 = {wmAddress};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "18b2c5195ac4f6edd96e45f635dd0958", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "18b2c5195ac4f6edd96e45f635dd0958");
                    return;
                }
                RefreshLocation.this.f = true;
                if (wmAddress != null && wmAddress.hasAddress()) {
                    RefreshLocation refreshLocation = RefreshLocation.this;
                    String address = wmAddress.getAddress();
                    RefreshLocationResponse refreshLocationResponse2 = refreshLocationResponse;
                    Object[] objArr3 = {address, wmAddress, refreshLocationResponse2, iVar};
                    ChangeQuickRedirect changeQuickRedirect3 = RefreshLocation.b;
                    if (PatchProxy.isSupport(objArr3, refreshLocation, changeQuickRedirect3, false, "85f5e2a9262bb69dbc6736efe3b7a2f2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, refreshLocation, changeQuickRedirect3, false, "85f5e2a9262bb69dbc6736efe3b7a2f2");
                    } else {
                        refreshLocation.a(address, wmAddress, refreshLocationResponse2);
                        WMLocation wMLocation = wmAddress.getWMLocation();
                        long j2 = 0;
                        if (wMLocation != null) {
                            j2 = (long) (wMLocation.getLongitude() * 1000000.0d);
                            j = (long) (wMLocation.getLatitude() * 1000000.0d);
                        } else {
                            j = 0;
                        }
                        JudasManualManager.a("b_waimai_o5nf04so_mc", "c_9le3i2l", AppUtil.generatePageInfoKey(refreshLocation.c.getActivity())).a(GearsLocator.ADDRESS, address).a(Constants.PRIVACY.KEY_LONGITUDE, j2).a(Constants.PRIVACY.KEY_LATITUDE, j).a();
                    }
                } else {
                    RefreshLocation refreshLocation2 = RefreshLocation.this;
                    RefreshLocationResponse refreshLocationResponse3 = refreshLocationResponse;
                    Object[] objArr4 = {refreshLocationResponse3};
                    ChangeQuickRedirect changeQuickRedirect4 = RefreshLocation.b;
                    if (PatchProxy.isSupport(objArr4, refreshLocation2, changeQuickRedirect4, false, "4149a6790a2d01790ebd2ea1cf27b9bf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, refreshLocation2, changeQuickRedirect4, false, "4149a6790a2d01790ebd2ea1cf27b9bf");
                    } else {
                        String string = refreshLocation2.c.getActivity().getString(R.string.wm_address_manually_failed);
                        refreshLocationResponse3.isRegeoFail = true;
                        refreshLocation2.a(string, (WmAddress) null, refreshLocationResponse3);
                    }
                }
                iVar.a(refreshLocationResponse);
            }
        };
        if (a()) {
            g.a().a(deviceLocateCallback, bVar, true, false, com.sankuai.waimai.platform.domain.manager.location.v2.b.LOCATE_MANUALLY.toString(), new k(this.c.getActivity(), str));
        } else {
            g.a().a(deviceLocateCallback, bVar, this.h, new k(this.c.getActivity(), str));
        }
    }

    void a(String str, WmAddress wmAddress, RefreshLocationResponse refreshLocationResponse) {
        Object[] objArr = {str, wmAddress, refreshLocationResponse};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "223a05b6bda63d187463cb10aae9669c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "223a05b6bda63d187463cb10aae9669c");
            return;
        }
        refreshLocationResponse.addressName = str;
        if (this.g) {
            if (!str.equals(this.c.getActivity().getString(R.string.wm_address_manually_failed))) {
                if (a()) {
                    com.sankuai.waimai.foundation.location.g.a(this.d, this.e, str);
                    com.sankuai.waimai.foundation.location.g.k();
                }
            } else {
                str = this.c.getActivity().getString(R.string.wm_address_poiList_locating_unknown);
            }
            a.b(this.c.getActivity());
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

    private boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c42ea7376f1807ac1c749e55a38cb87a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c42ea7376f1807ac1c749e55a38cb87a")).booleanValue() : ("search".equals(this.h) || "shoppingcart".equals(this.h)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2184b8f9f86f38dc09f5c380ffa6cb19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2184b8f9f86f38dc09f5c380ffa6cb19");
        } else if (this.c == null) {
        } else {
            this.c.getActivity().startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 301);
        }
    }

    private String a(@NonNull WmAddress wmAddress) {
        Object[] objArr = {wmAddress};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83ba136c1e345e5d8ae8d38c09f99495", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83ba136c1e345e5d8ae8d38c09f99495");
        }
        if (wmAddress.getMeitaunCity() != null) {
            return wmAddress.getMeitaunCity().getCityName();
        }
        return wmAddress.getMafCity() != null ? wmAddress.getMafCity().getCityName() : "";
    }
}
