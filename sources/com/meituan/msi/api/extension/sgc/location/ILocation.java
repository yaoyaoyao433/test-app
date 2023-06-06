package com.meituan.msi.api.extension.sgc.location;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiCustomApi;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class ILocation implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    @MsiApiMethod(name = "getCurrentLocationWithBusinessId", request = LocationParam.class, response = LocationResponse.class, scope = "sgc")
    public void msiGetCurrentLocationWithBusinessId(LocationParam locationParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {locationParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c2941c54c9f3c874454abae88947da6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c2941c54c9f3c874454abae88947da6");
        } else {
            new i<LocationResponse>() { // from class: com.meituan.msi.api.extension.sgc.location.ILocation.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(LocationResponse locationResponse) {
                    LocationResponse locationResponse2 = locationResponse;
                    Object[] objArr2 = {locationResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1f130eb9587ec78964fd2d275aac8f22", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1f130eb9587ec78964fd2d275aac8f22");
                    } else {
                        msiCustomContext.onSuccess(locationResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8e0fbffdf0f7b17bcc3376e64eb3b6ef", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8e0fbffdf0f7b17bcc3376e64eb3b6ef");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            };
        }
    }
}
