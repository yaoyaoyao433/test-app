package com.meituan.android.pay.common.payment.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.common.payment.data.d;
import com.meituan.android.pay.common.promotion.bean.CombineLabel;
import com.meituan.android.pay.common.promotion.bean.Icon;
import com.meituan.android.pay.common.promotion.bean.PaymentReduce;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class BasePayment implements d, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1825571577350378481L;
    @SerializedName("attach_icon")
    private String attachIcon;
    @SerializedName("bottomlabels")
    private List<CombineLabel> bottomLabels;
    @SerializedName("display_group")
    private String displayGroup;
    @SerializedName("exceed_desc")
    private String exceedDesc;
    private Icon icon;
    @SerializedName("is_show_icon")
    private boolean isShowIcon;
    private String name;
    @SerializedName("name_ext")
    private String nameSuffix;
    @SerializedName("pay_type")
    protected String payType;
    @SerializedName("discounts")
    private PaymentReduce paymentReduce;
    @SerializedName("real_name_auth_type")
    private int realNameAuthType;
    @SerializedName("rightlabels")
    private List<CombineLabel> rightLabels;
    private boolean selected;
    protected int status;
    @SerializedName("status_info")
    private String statusInfo;

    @Override // com.meituan.android.pay.common.payment.data.e
    public String getPayType() {
        return this.payType;
    }

    public void setPayType(String str) {
        this.payType = str;
    }

    @Override // com.meituan.android.pay.common.payment.data.e
    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    @Override // com.meituan.android.pay.common.payment.data.e
    public int getStatus() {
        return this.status;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    @Override // com.meituan.android.pay.common.payment.data.e
    public String getStatusInfo() {
        return this.statusInfo;
    }

    public void setStatusInfo(String str) {
        this.statusInfo = str;
    }

    @Override // com.meituan.android.pay.common.payment.data.e
    public Icon getIcon() {
        return this.icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    @Override // com.meituan.android.pay.common.payment.data.e
    public boolean isSelected() {
        return this.selected;
    }

    public void setSelected(boolean z) {
        this.selected = z;
    }

    @Override // com.meituan.android.pay.common.payment.data.e
    public String getExceedDesc() {
        return this.exceedDesc;
    }

    public void setExceedDesc(String str) {
        this.exceedDesc = str;
    }

    @Override // com.meituan.android.pay.common.payment.data.d
    public List<CombineLabel> getBottomLabels() {
        return this.bottomLabels;
    }

    public void setBottomLabels(List<CombineLabel> list) {
        this.bottomLabels = list;
    }

    @Override // com.meituan.android.pay.common.payment.data.d
    public List<CombineLabel> getRightLabels() {
        return this.rightLabels;
    }

    public void setRightLabels(List<CombineLabel> list) {
        this.rightLabels = list;
    }

    @Override // com.meituan.android.pay.common.payment.data.e
    public PaymentReduce getPaymentReduce() {
        return this.paymentReduce;
    }

    public void setPaymentReduce(PaymentReduce paymentReduce) {
        this.paymentReduce = paymentReduce;
    }

    @Override // com.meituan.android.pay.common.payment.data.d
    public String getAttachIcon() {
        return this.attachIcon;
    }

    public void setAttachIcon(String str) {
        this.attachIcon = str;
    }

    public String getDisplayGroup() {
        return this.displayGroup;
    }

    public void setDisplayGroup(String str) {
        this.displayGroup = str;
    }

    @Override // com.meituan.android.pay.common.payment.data.d
    public boolean isShowIcon() {
        return this.isShowIcon;
    }

    public void setShowIcon(boolean z) {
        this.isShowIcon = z;
    }

    @Override // com.meituan.android.pay.common.payment.data.d
    public String getNameSuffix() {
        return this.nameSuffix;
    }

    public void setNameSuffix(String str) {
        this.nameSuffix = str;
    }

    public int getRealNameAuthType() {
        return this.realNameAuthType;
    }

    public void setRealNameAuthType(int i) {
        this.realNameAuthType = i;
    }
}
