package com.meituan.msi.addapter.fingerprint;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiCustomApi;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class IGetRiskControlFingerprint implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    public abstract void a(MsiCustomContext msiCustomContext, i<FingerprintResult> iVar);

    @MsiApiMethod(name = "getRiskControlFingerprint", response = FingerprintResult.class)
    public void msiGetRiskControlFingerprint(final MsiCustomContext msiCustomContext) {
        Object[] objArr = {msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c207cf72ad4dc7de62fa8edfb597bce4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c207cf72ad4dc7de62fa8edfb597bce4");
        } else {
            a(msiCustomContext, new i<FingerprintResult>() { // from class: com.meituan.msi.addapter.fingerprint.IGetRiskControlFingerprint.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(FingerprintResult fingerprintResult) {
                    FingerprintResult fingerprintResult2 = fingerprintResult;
                    Object[] objArr2 = {fingerprintResult2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e2285dc41a457872e29eed1ad30abbc9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e2285dc41a457872e29eed1ad30abbc9");
                    } else {
                        msiCustomContext.onSuccess(fingerprintResult2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "152238a0f3f7d4018b26d0e77facbb4b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "152238a0f3f7d4018b26d0e77facbb4b");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }
}
