package com.meituan.android.cashier.model.bean;

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
public class BankListPage implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6013851409488820364L;
    @SerializedName("page_title")
    private String pageTitle;
    @SerializedName("pay_button")
    private String payButton;
    @SerializedName("banklist")
    private List<DCEPPayment> paymentList;
    @SerializedName("total_fee")
    private float totalFee;

    public String getPageTitle() {
        return this.pageTitle;
    }

    public void setPageTitle(String str) {
        this.pageTitle = str;
    }

    public List<DCEPPayment> getPaymentList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfefe19aef54a5475211123aa5d755d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfefe19aef54a5475211123aa5d755d4");
        }
        i.a((List) this.paymentList);
        return this.paymentList;
    }

    public void setPaymentList(List<DCEPPayment> list) {
        this.paymentList = list;
    }

    public String getPayButton() {
        return this.payButton;
    }

    public void setPayButton(String str) {
        this.payButton = str;
    }

    public float getTotalFee() {
        return this.totalFee;
    }

    public void setTotalFee(float f) {
        this.totalFee = f;
    }
}
