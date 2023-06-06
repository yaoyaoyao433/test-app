package com.meituan.android.pay.desk.component.bean.precomponent;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.common.promotion.bean.Agreement;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paycommon.lib.model.bean.CommonGuide;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class PayGuide implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6661139515553913106L;
    @SerializedName("adjust_nopassword_credit")
    private AdjustCreditGuide adjustCreditGuide;
    @SerializedName("agreement")
    private Agreement agreement;
    @SerializedName("fingerprintpay")
    private CommonGuide fingerprintPayGuide;
    @SerializedName("nopasswordguide")
    private CommonGuide noPasswordGuide;
    @SerializedName("withholdguide")
    private CommonGuide withholdGuide;

    public CommonGuide getNoPasswordGuide() {
        return this.noPasswordGuide;
    }

    public void setNoPasswordGuide(CommonGuide commonGuide) {
        this.noPasswordGuide = commonGuide;
    }

    public CommonGuide getFingerprintPayGuide() {
        return this.fingerprintPayGuide;
    }

    public void setFingerprintPayGuide(CommonGuide commonGuide) {
        this.fingerprintPayGuide = commonGuide;
    }

    public CommonGuide getWithholdGuide() {
        return this.withholdGuide;
    }

    public void setWithholdGuide(CommonGuide commonGuide) {
        this.withholdGuide = commonGuide;
    }

    public AdjustCreditGuide getAdjustCreditGuide() {
        return this.adjustCreditGuide;
    }

    public void setAdjustCreditGuide(AdjustCreditGuide adjustCreditGuide) {
        this.adjustCreditGuide = adjustCreditGuide;
    }

    public Agreement getAgreement() {
        return this.agreement;
    }

    public void setAgreement(Agreement agreement) {
        this.agreement = agreement;
    }
}
