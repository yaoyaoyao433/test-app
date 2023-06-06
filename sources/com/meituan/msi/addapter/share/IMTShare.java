package com.meituan.msi.addapter.share;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiCustomApi;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class IMTShare implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    public abstract void a(MsiCustomContext msiCustomContext, MTShareParam mTShareParam, i iVar);

    @MsiApiMethod(name = "mtShare", onUiThread = true, request = MTShareParam.class)
    public void msiMtShare(MTShareParam mTShareParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {mTShareParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "947664abf320aec045420fa61fa1820d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "947664abf320aec045420fa61fa1820d");
        } else {
            a(msiCustomContext, mTShareParam, new i() { // from class: com.meituan.msi.addapter.share.IMTShare.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final void a(Object obj) {
                    Object[] objArr2 = {obj};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "074fc3ccc987f61826420e9c23b54e7b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "074fc3ccc987f61826420e9c23b54e7b");
                    } else {
                        msiCustomContext.onSuccess(null);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dfe1a18c9c1dac555b34953d016bd5a1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dfe1a18c9c1dac555b34953d016bd5a1");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }
}
