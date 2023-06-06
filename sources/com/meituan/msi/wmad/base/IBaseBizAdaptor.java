package com.meituan.msi.wmad.base;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiCustomApi;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class IBaseBizAdaptor implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    public abstract void a(MsiCustomContext msiCustomContext, AdChargeReportParam adChargeReportParam, i<EmptyResponse> iVar);

    @MsiApiMethod(name = "adChargeReport", request = AdChargeReportParam.class, scope = "wmad")
    public void msiAdChargeReport(AdChargeReportParam adChargeReportParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {adChargeReportParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f52446f7ea295b3c0494f4cdb839bb57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f52446f7ea295b3c0494f4cdb839bb57");
        } else {
            a(msiCustomContext, adChargeReportParam, new i<EmptyResponse>() { // from class: com.meituan.msi.wmad.base.IBaseBizAdaptor.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(EmptyResponse emptyResponse) {
                    EmptyResponse emptyResponse2 = emptyResponse;
                    Object[] objArr2 = {emptyResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "10a676e28eef9feedf6e255ab12c3dc2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "10a676e28eef9feedf6e255ab12c3dc2");
                    } else {
                        msiCustomContext.onSuccess(emptyResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d19d3440a219750308809a2fdfccc2e3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d19d3440a219750308809a2fdfccc2e3");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }
}
