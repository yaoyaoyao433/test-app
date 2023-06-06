package com.meituan.android.pay.common.selectdialog.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.common.payment.bean.Payment;
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
public class MtPaymentListPage implements b, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6128064835586130771L;
    @SerializedName("bindcard_unavailable_desc")
    private String bindcardUnavaliableDesc;
    @SerializedName("toplabels")
    private List<Label> globalLabels;
    @SerializedName("presentation")
    private String globalLabelsPrefix;
    @SerializedName("more_banklist")
    private List<InsertPayments> insertPaymentsList;
    @SerializedName("ab_test")
    private LabelAbTest labelAbTest;
    @SerializedName("banklist")
    private List<Payment> mtPaymentList;
    @SerializedName("page_title")
    private String pageTitle;

    public void setMtPaymentList(List<Payment> list) {
        this.mtPaymentList = list;
    }

    public void setInsertPaymentsList(List<InsertPayments> list) {
        this.insertPaymentsList = list;
    }

    @Override // com.meituan.android.pay.common.selectdialog.b
    public String getPageTitle() {
        return this.pageTitle;
    }

    public void setPageTitle(String str) {
        this.pageTitle = str;
    }

    public String getBindcardUnavaliableDesc() {
        return this.bindcardUnavaliableDesc;
    }

    public void setBindcardUnavaliableDesc(String str) {
        this.bindcardUnavaliableDesc = str;
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

    @Override // com.meituan.android.pay.common.selectdialog.b
    public List<a> getMtPaymentList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9148e869ecde866ca3aa1865d65b1d0a", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9148e869ecde866ca3aa1865d65b1d0a");
        }
        i.a((List) this.mtPaymentList);
        ArrayList arrayList = new ArrayList();
        if (!i.a((Collection) this.mtPaymentList)) {
            arrayList.addAll(this.mtPaymentList);
        }
        return arrayList;
    }

    public List<Payment> getOriginPayments() {
        return this.mtPaymentList;
    }

    @Override // com.meituan.android.pay.common.selectdialog.b
    public List<com.meituan.android.pay.common.selectdialog.a> getInsertPaymentsList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69bca8f848e0d7da71e19cdbf0b46f36", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69bca8f848e0d7da71e19cdbf0b46f36");
        }
        ArrayList arrayList = new ArrayList();
        if (!i.a((Collection) this.insertPaymentsList)) {
            arrayList.addAll(this.insertPaymentsList);
        }
        return arrayList;
    }

    public LabelAbTest getLabelAbTest() {
        return this.labelAbTest;
    }

    public void setLabelAbTest(LabelAbTest labelAbTest) {
        this.labelAbTest = labelAbTest;
    }
}
