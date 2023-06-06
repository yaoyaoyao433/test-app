package com.meituan.android.pay.common.selectdialog.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.payment.data.a;
import com.meituan.android.pay.common.promotion.bean.LabelAbTest;
import com.meituan.android.pay.common.selectdialog.b;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paybase.utils.i;
import com.meituan.android.paybase.widgets.label.Label;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class WalletPaymentListPage implements b, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 711042907602529066L;
    @SerializedName("bindcard_unavailable_desc")
    private String bindcardUnavaliableDesc;
    @SerializedName("use_np_pay")
    private boolean canUseNoPwdPay;
    @SerializedName("toplabels")
    private List<Label> globalLabels;
    @SerializedName("presentation")
    private String globalLabelsPrefix;
    @SerializedName("more_banklist")
    private List<InsertMTPayments> insertPaymentsList;
    @SerializedName("ab_test")
    private LabelAbTest labelAbTest;
    @SerializedName("banklist")
    private List<MTPayment> mtPaymentList;
    @SerializedName("page_title")
    private String pageTitle;
    @SerializedName("page_tip")
    private String redDotTip;

    @Override // com.meituan.android.pay.common.selectdialog.b
    public String getPageTitle() {
        return this.pageTitle;
    }

    public void setPageTitle(String str) {
        this.pageTitle = str;
    }

    public void setMtPaymentList(List<MTPayment> list) {
        this.mtPaymentList = list;
    }

    public void setInsertPaymentsList(List<InsertMTPayments> list) {
        this.insertPaymentsList = list;
    }

    public String getRedDotTip() {
        return this.redDotTip;
    }

    public void setRedDotTip(String str) {
        this.redDotTip = str;
    }

    public String getBindcardUnavaliableDesc() {
        return this.bindcardUnavaliableDesc;
    }

    public void setBindcardUnavaliableDesc(String str) {
        this.bindcardUnavaliableDesc = str;
    }

    public boolean isCanUseNoPwdPay() {
        return this.canUseNoPwdPay;
    }

    public void setCanUseNoPwdPay(boolean z) {
        this.canUseNoPwdPay = z;
    }

    @Override // com.meituan.android.pay.common.selectdialog.b
    public List<Label> getGlobalLabels() {
        return this.globalLabels;
    }

    public void setGlobalLabels(List<Label> list) {
        this.globalLabels = list;
    }

    @Override // com.meituan.android.pay.common.selectdialog.b
    public String getGlobalLabelsPrefix() {
        return this.globalLabelsPrefix;
    }

    public void setGlobalLabelsPrefix(String str) {
        this.globalLabelsPrefix = str;
    }

    public LabelAbTest getLabelAbTest() {
        return this.labelAbTest;
    }

    public void setLabelAbTest(LabelAbTest labelAbTest) {
        this.labelAbTest = labelAbTest;
    }

    @Override // com.meituan.android.pay.common.selectdialog.b
    public List<a> getMtPaymentList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84335530cc85c031aad291b84b580213", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84335530cc85c031aad291b84b580213");
        }
        i.a((List) this.mtPaymentList);
        ArrayList arrayList = new ArrayList();
        if (!i.a((Collection) this.mtPaymentList)) {
            arrayList.addAll(this.mtPaymentList);
        }
        return arrayList;
    }

    public List<MTPayment> getOriginMTPayments() {
        return this.mtPaymentList;
    }

    @Override // com.meituan.android.pay.common.selectdialog.b
    public List<com.meituan.android.pay.common.selectdialog.a> getInsertPaymentsList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45d89c4e3364bbd90d3d061b908da75a", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45d89c4e3364bbd90d3d061b908da75a");
        }
        ArrayList arrayList = new ArrayList();
        if (!i.a((Collection) this.insertPaymentsList)) {
            arrayList.addAll(this.insertPaymentsList);
        }
        return arrayList;
    }
}
