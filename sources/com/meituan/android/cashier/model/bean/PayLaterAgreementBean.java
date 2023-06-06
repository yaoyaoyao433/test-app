package com.meituan.android.cashier.model.bean;

import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class PayLaterAgreementBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -8564075271550019154L;
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

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91d556d61411c224e2f73940fa6a44e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91d556d61411c224e2f73940fa6a44e1");
        }
        return "PayLaterAgreementBean{agreementName='" + this.agreementName + "', agreementLink='" + this.agreementLink + "'}";
    }
}
