package com.meituan.android.pay.desk.component.bean.standardcomponent;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.pay.common.payment.bean.FloatingLayer;
import com.meituan.android.pay.common.promotion.bean.CombineLabel;
import com.meituan.android.pay.common.promotion.bean.Icon;
import com.meituan.android.pay.common.promotion.bean.Material;
import com.meituan.android.pay.common.promotion.bean.PaymentReduce;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class HelloPayTransInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -6033339655138417349L;
    @SerializedName("display_name")
    private String displayName;
    @SerializedName("float_infos")
    private ArrayList<FloatingLayer> floatingLayers;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    private Icon icon;
    @SerializedName("installment_available_flag")
    private int isSupportInstallment;
    private List<CombineLabel> labels;
    private Material material;
    @SerializedName("order_money")
    private float orderMoney;
    @SerializedName("pay_type_unique_key")
    private String payTypeUniqueKey;
    @SerializedName("discounts")
    private PaymentReduce paymentDiscount;
    @SerializedName("installment_info")
    private SelectedInstallment selectedInstallment;
    @SerializedName("pay_transparent_attributes")
    private String transparentAttributes;
    @SerializedName("installment_non_available_reason")
    private String unsupportedInstallmentReason;

    public PaymentReduce getPaymentDiscount() {
        return this.paymentDiscount;
    }

    public void setPaymentDiscount(PaymentReduce paymentReduce) {
        this.paymentDiscount = paymentReduce;
    }

    public List<CombineLabel> getLabels() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be6ab94174cf78c74e2064a496504439", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be6ab94174cf78c74e2064a496504439");
        }
        i.a((List) this.labels);
        return this.labels;
    }

    public void setLabels(List<CombineLabel> list) {
        this.labels = list;
    }

    public float getOrderMoney() {
        return this.orderMoney;
    }

    public void setOrderMoney(float f) {
        this.orderMoney = f;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public Icon getIcon() {
        return this.icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public int getIsSupportInstallment() {
        return this.isSupportInstallment;
    }

    public void setIsSupportInstallment(int i) {
        this.isSupportInstallment = i;
    }

    public String getUnsupportedInstallmentReason() {
        return this.unsupportedInstallmentReason;
    }

    public void setUnsupportedInstallmentReason(String str) {
        this.unsupportedInstallmentReason = str;
    }

    public SelectedInstallment getSelectedInstallment() {
        return this.selectedInstallment;
    }

    public void setSelectedInstallment(SelectedInstallment selectedInstallment) {
        this.selectedInstallment = selectedInstallment;
    }

    public ArrayList<FloatingLayer> getFloatingLayers() {
        return this.floatingLayers;
    }

    public void setFloatingLayers(ArrayList<FloatingLayer> arrayList) {
        this.floatingLayers = arrayList;
    }

    public String getTransparentAttributes() {
        return this.transparentAttributes;
    }

    public void setTransparentAttributes(String str) {
        this.transparentAttributes = str;
    }

    public String getPayTypeUniqueKey() {
        return this.payTypeUniqueKey;
    }

    public void setPayTypeUniqueKey(String str) {
        this.payTypeUniqueKey = str;
    }

    public Material getMaterial() {
        return this.material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
