package com.meituan.android.pay.model;

import com.meituan.android.pay.adapter.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BankCardListChooseType {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String creditDes;
    private String creditDisableDesc;
    private String debitDes;
    private boolean hasTheOtherPage;
    private boolean noCredit;
    private a.d pageType;

    public BankCardListChooseType(a.d dVar, boolean z, String str, String str2, boolean z2, String str3) {
        Object[] objArr = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), str, str2, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a2113a63076b67e5162581ef51b7ce3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a2113a63076b67e5162581ef51b7ce3");
            return;
        }
        this.pageType = dVar;
        this.creditDes = str;
        this.debitDes = str2;
        this.hasTheOtherPage = z;
        this.creditDisableDesc = str3;
        this.noCredit = z2;
    }

    public a.d getPageType() {
        return this.pageType;
    }

    public void setPageType(a.d dVar) {
        this.pageType = dVar;
    }

    public String getCreditDes() {
        return this.creditDes;
    }

    public void setCreditDes(String str) {
        this.creditDes = str;
    }

    public String getDebitDes() {
        return this.debitDes;
    }

    public void setDebitDes(String str) {
        this.debitDes = str;
    }

    public boolean hasTheOtherPage() {
        return this.hasTheOtherPage;
    }

    public void setHasTheOtherPage(boolean z) {
        this.hasTheOtherPage = z;
    }

    public String getCreditDisableDesc() {
        return this.creditDisableDesc;
    }

    public void setCreditDisableDesc(String str) {
        this.creditDisableDesc = str;
    }

    public boolean isNoCredit() {
        return this.noCredit;
    }

    public void setNoCredit(boolean z) {
        this.noCredit = z;
    }
}
