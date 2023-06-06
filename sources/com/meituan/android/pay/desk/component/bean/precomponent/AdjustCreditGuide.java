package com.meituan.android.pay.desk.component.bean.precomponent;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class AdjustCreditGuide implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1371229616466140390L;
    @SerializedName("nopasswordpay_credit_new")
    public int creditNew;
    @SerializedName("nopasswordpay_credit_now")
    public int creditNow;
    @SerializedName("guide_tip")
    public String guideTip;
    @SerializedName("need_adjust")
    public boolean needAdjust;

    public String getGuideTip() {
        return this.guideTip;
    }

    public void setGuideTip(String str) {
        this.guideTip = str;
    }

    public int getCreditNew() {
        return this.creditNew;
    }

    public void setCreditNew(int i) {
        this.creditNew = i;
    }

    public boolean isNeedAdjust() {
        return this.needAdjust;
    }

    public void setNeedAdjust(boolean z) {
        this.needAdjust = z;
    }

    public int getCreditNow() {
        return this.creditNow;
    }

    public void setCreditNow(int i) {
        this.creditNow = i;
    }
}
