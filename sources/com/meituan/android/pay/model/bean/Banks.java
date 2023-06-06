package com.meituan.android.pay.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class Banks implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1297338022969862340L;
    @SerializedName("credit")
    private List<BankCard> credit;
    @SerializedName("credit_desc")
    private String creditDesc;
    @SerializedName("debit")
    private List<BankCard> debit;
    @SerializedName("no_credit")
    private boolean noCredit;

    public List<BankCard> getDebit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5be969f817ae6f589c7948556f9f8b1d", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5be969f817ae6f589c7948556f9f8b1d");
        }
        i.a((List) this.debit);
        return this.debit;
    }

    public void setDebit(List<BankCard> list) {
        this.debit = list;
    }

    public List<BankCard> getCredit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78b77d27d7509725626044f3736b9a4a", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78b77d27d7509725626044f3736b9a4a");
        }
        i.a((List) this.credit);
        return this.credit;
    }

    public void setCredit(List<BankCard> list) {
        this.credit = list;
    }

    public String getCreditDesc() {
        return this.creditDesc;
    }

    public void setCreditDesc(String str) {
        this.creditDesc = str;
    }

    public boolean isNoCredit() {
        return this.noCredit;
    }

    public void setNoCredit(boolean z) {
        this.noCredit = z;
    }
}
