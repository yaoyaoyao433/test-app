package com.meituan.msi.api.location;

import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.annotations.MsiApiPermission;
import com.meituan.msi.api.IMsiCustomApi;
import com.meituan.msi.api.i;
import com.meituan.msi.api.j;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class IRefreshLocation implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    public abstract void a(MsiCustomContext msiCustomContext, RefreshLocationParam refreshLocationParam, i<RefreshLocationResponse> iVar);

    @MsiApiMethod(isCallback = true, name = "onAddressPoiChange", response = RefreshLocationResponse.class)
    public void onAddressPoiChange(MsiContext msiContext) {
    }

    @MsiApiMethod(name = "refreshLocation", request = RefreshLocationParam.class, response = RefreshLocationResponse.class, scope = GearsLocator.ADDRESS)
    @MsiApiPermission(apiPermissions = {"Locate.once"})
    public void msiRefreshLocation(RefreshLocationParam refreshLocationParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {refreshLocationParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50d607c1658da6a6a894e3eef142fcd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50d607c1658da6a6a894e3eef142fcd7");
        } else {
            a(msiCustomContext, refreshLocationParam, new i<RefreshLocationResponse>() { // from class: com.meituan.msi.api.location.IRefreshLocation.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(RefreshLocationResponse refreshLocationResponse) {
                    RefreshLocationResponse refreshLocationResponse2 = refreshLocationResponse;
                    Object[] objArr2 = {refreshLocationResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "37eaec3df3cfea0af52fd3f357ffe3d0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "37eaec3df3cfea0af52fd3f357ffe3d0");
                    } else {
                        msiCustomContext.onSuccess(refreshLocationResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1d17a0b56462f9d16338f3068e15f0ab", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1d17a0b56462f9d16338f3068e15f0ab");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "addPoiChangeListener", scope = GearsLocator.ADDRESS)
    public void msiAddPoiChangeListener(final MsiCustomContext msiCustomContext) {
        Object[] objArr = {msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccab4922289ccce1a81acda9907020a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccab4922289ccce1a81acda9907020a2");
            return;
        }
        new j<RefreshLocationResponse>() { // from class: com.meituan.msi.api.location.IRefreshLocation.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msi.api.j
            public final /* synthetic */ void a(RefreshLocationResponse refreshLocationResponse) {
                RefreshLocationResponse refreshLocationResponse2 = refreshLocationResponse;
                Object[] objArr2 = {refreshLocationResponse2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "962d8c38d5bd1bde867d1f13bbdbc3f6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "962d8c38d5bd1bde867d1f13bbdbc3f6");
                } else {
                    msiCustomContext.dispatchEvent("onAddressPoiChange", refreshLocationResponse2);
                }
            }
        };
        msiCustomContext.onSuccess("");
    }
}
