package com.meituan.android.pay.model.bean;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.pay.common.promotion.bean.Agreement;
import com.meituan.android.pay.common.promotion.bean.CombineLabel;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class OpenWithholdInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1163287172393392946L;
    @SerializedName("agreements")
    private List<Agreement> agreementList;
    @SerializedName("agreements_prefix")
    private String agreementsPrefix;
    @SerializedName("deduct_type")
    private int deductType;
    @SerializedName("guide_product_feature")
    private String guideProductFeature;
    @SerializedName("guide_product_name")
    private String guideProductName;
    @SerializedName("guide_text")
    private String guideText;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    private String icon;
    @SerializedName("promotion_info")
    private List<CombineLabel> labelList;
    @SerializedName("plan_id")
    private String planId;
    @SerializedName("sign_merchant_no")
    private String signMerchantNo;
    @SerializedName("switch_button_status")
    private boolean switchButtonStatus;

    public boolean isSwitchButtonStatus() {
        return this.switchButtonStatus;
    }

    public void setSwitchButtonStatus(boolean z) {
        this.switchButtonStatus = z;
    }

    public String getGuideText() {
        return this.guideText;
    }

    public void setGuideText(String str) {
        this.guideText = str;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public String getGuideProductName() {
        return this.guideProductName;
    }

    public void setGuideProductName(String str) {
        this.guideProductName = str;
    }

    public String getGuideProductFeature() {
        return this.guideProductFeature;
    }

    public void setGuideProductFeature(String str) {
        this.guideProductFeature = str;
    }

    public List<Agreement> getAgreementList() {
        return this.agreementList;
    }

    public void setAgreementList(List<Agreement> list) {
        this.agreementList = list;
    }

    public String getAgreementsPrefix() {
        return this.agreementsPrefix;
    }

    public void setAgreementsPrefix(String str) {
        this.agreementsPrefix = str;
    }

    public List<CombineLabel> getLabelList() {
        return this.labelList;
    }

    public void setLabelList(List<CombineLabel> list) {
        this.labelList = list;
    }

    public String getSignMerchantNo() {
        return this.signMerchantNo;
    }

    public void setSignMerchantNo(String str) {
        this.signMerchantNo = str;
    }

    public int getDeductType() {
        return this.deductType;
    }

    public void setDeductType(int i) {
        this.deductType = i;
    }

    public String getPlanId() {
        return this.planId;
    }

    public void setPlanId(String str) {
        this.planId = str;
    }
}
