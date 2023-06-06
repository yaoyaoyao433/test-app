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
public abstract class IMtRequestPayment implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    public abstract void a(MsiCustomContext msiCustomContext, MtRequestPaymentParam mtRequestPaymentParam, i<a> iVar);

    @MsiApiMethod(name = "mtRequestPayment", request = MtRequestPaymentParam.class)
    public void msiMtRequestPayment(MtRequestPaymentParam mtRequestPaymentParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {mtRequestPaymentParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c1e6e9111f9e1ab60c1c653f869ae27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c1e6e9111f9e1ab60c1c653f869ae27");
        } else {
            a(msiCustomContext, mtRequestPaymentParam, new i() { // from class: com.meituan.msi.addapter.payment.IMtRequestPayment.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final void a(Object obj) {
                    Object[] objArr2 = {obj};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a4611b82b8dbdd76f8bc1264c6624c2d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a4611b82b8dbdd76f8bc1264c6624c2d");
                    } else {
                        msiCustomContext.onSuccess(null);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8afcb993c66219441fd73f0a68702eb8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8afcb993c66219441fd73f0a68702eb8");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }
}
