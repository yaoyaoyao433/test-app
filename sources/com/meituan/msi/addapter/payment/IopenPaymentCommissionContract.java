package com.meituan.msi.addapter.payment;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiCustomApi;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class IopenPaymentCommissionContract implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    public abstract void a(MsiCustomContext msiCustomContext, OpenPaymentCommissionContractParam openPaymentCommissionContractParam, i iVar);

    @MsiApiMethod(name = "openPaymentCommissionContract", request = OpenPaymentCommissionContractParam.class)
    public void msiOpenPaymentCommissionContract(OpenPaymentCommissionContractParam openPaymentCommissionContractParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {openPaymentCommissionContractParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdf2082159dd0d7bf42b2db37f1dce88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdf2082159dd0d7bf42b2db37f1dce88");
        } else {
            a(msiCustomContext, openPaymentCommissionContractParam, new i() { // from class: com.meituan.msi.addapter.payment.IopenPaymentCommissionContract.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final void a(Object obj) {
                    Object[] objArr2 = {obj};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "70b34f87adf94b37742c86119f60a6a2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "70b34f87adf94b37742c86119f60a6a2");
                    } else {
                        msiCustomContext.onSuccess(null);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "68ca37aeaa5b6e709bcb130c00643ffe", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "68ca37aeaa5b6e709bcb130c00643ffe");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }
}
