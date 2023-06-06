package com.meituan.msi.addapter.invoicetitle;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiCustomApi;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class IchooseInvoiceTitle implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    public abstract void a(MsiCustomContext msiCustomContext, InvoiceTitleParam invoiceTitleParam, i<InvoiceTitleResult> iVar);

    @MsiApiMethod(name = "chooseInvoiceTitle", request = InvoiceTitleParam.class, response = InvoiceTitleResult.class)
    public void msiChooseInvoiceTitle(InvoiceTitleParam invoiceTitleParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {invoiceTitleParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "752ddedc183cbefd43b4ce2fd8dfc387", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "752ddedc183cbefd43b4ce2fd8dfc387");
        } else {
            a(msiCustomContext, invoiceTitleParam, new i<InvoiceTitleResult>() { // from class: com.meituan.msi.addapter.invoicetitle.IchooseInvoiceTitle.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(InvoiceTitleResult invoiceTitleResult) {
                    InvoiceTitleResult invoiceTitleResult2 = invoiceTitleResult;
                    Object[] objArr2 = {invoiceTitleResult2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59ff9cb9f33e78645d4b4f55709f7812", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59ff9cb9f33e78645d4b4f55709f7812");
                    } else {
                        msiCustomContext.onSuccess(invoiceTitleResult2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "89984578c1197e7808206fe7bfa0525d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "89984578c1197e7808206fe7bfa0525d");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }
}
