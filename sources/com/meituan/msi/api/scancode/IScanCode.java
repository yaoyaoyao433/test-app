package com.meituan.msi.api.scancode;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class IScanCode implements IMsiApi {
    public static ChangeQuickRedirect a;

    @MsiApiMethod(name = "scanCode", request = ScanCodeApiParam.class, response = ScanCodeApiResponse.class)
    public void msiScanCode(ScanCodeApiParam scanCodeApiParam, final MsiContext msiContext) {
        Object[] objArr = {scanCodeApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20f9dcea409fcd84e025a414dac9685f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20f9dcea409fcd84e025a414dac9685f");
        } else {
            new i<ScanCodeApiResponse>() { // from class: com.meituan.msi.api.scancode.IScanCode.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(ScanCodeApiResponse scanCodeApiResponse) {
                    ScanCodeApiResponse scanCodeApiResponse2 = scanCodeApiResponse;
                    Object[] objArr2 = {scanCodeApiResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "acb855de9d81ac0d5bf8de03ff8d4064", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "acb855de9d81ac0d5bf8de03ff8d4064");
                    } else {
                        msiContext.onSuccess(scanCodeApiResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1ac9c42054505bf68fff90c108fd6e3d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1ac9c42054505bf68fff90c108fd6e3d");
                    } else {
                        msiContext.onError(i, str);
                    }
                }
            };
        }
    }
}
