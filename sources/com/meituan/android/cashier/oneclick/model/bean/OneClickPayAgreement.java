package com.meituan.android.cashier.oneclick.model.bean;

import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class OneClickPayAgreement implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 8150006450406528053L;
    private String agreementLink;
    private String agreementName;

    public String getAgreementName() {
        return this.agreementName;
    }

    public void setAgreementName(String str) {
        this.agreementName = str;
    }

    public String getAgreementLink() {
        return this.agreementLink;
    }

    public void setAgreementLink(String str) {
        this.agreementLink = str;
    }
}
