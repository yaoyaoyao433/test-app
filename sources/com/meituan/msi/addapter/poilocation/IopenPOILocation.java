package com.meituan.msi.addapter.poilocation;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiCustomApi;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class IopenPOILocation implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    @MsiApiMethod(name = "openPOILocation", request = OpenPOILocationParam.class)
    public void msiOpenPOILocation(OpenPOILocationParam openPOILocationParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {openPOILocationParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc62ffd5d27237fc7f6ec0f846ade43c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc62ffd5d27237fc7f6ec0f846ade43c");
        } else {
            new i() { // from class: com.meituan.msi.addapter.poilocation.IopenPOILocation.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final void a(Object obj) {
                    Object[] objArr2 = {obj};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dec80f016fc0cf809b353e6e07d3741f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dec80f016fc0cf809b353e6e07d3741f");
                    } else {
                        msiCustomContext.onSuccess(null);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a834159dd8c741298cc749e9695ebf37", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a834159dd8c741298cc749e9695ebf37");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            };
        }
    }
}
