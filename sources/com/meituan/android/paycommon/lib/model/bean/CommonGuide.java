package com.meituan.android.paycommon.lib.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class CommonGuide implements Serializable {
    public static final String OPEN_MOBIKE_NP_PAY = "open_mobike_hailing_np_pay";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 3487882659795080402L;
    @SerializedName("checked")
    private boolean checked;
    @SerializedName("credit")
    private int credit;
    @SerializedName("deduct_type")
    private int deductType;
    @SerializedName("guide_action")
    private String guideAction;
    @SerializedName("plan_id")
    private long planId;
    @SerializedName("agreement_name")
    private String protocolText;
    @SerializedName("agreement_url")
    private String protocolUrl;
    @SerializedName("sign_merchant_no")
    private long signMerchantNo;
    @SerializedName("guide_title")
    private String title;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public void setChecked(boolean z) {
        this.checked = z;
    }

    public int getCredit() {
        return this.credit;
    }

    public void setCredit(int i) {
        this.credit = i;
    }

    public String getProtocolText() {
        return this.protocolText;
    }

    public void setProtocolText(String str) {
        this.protocolText = str;
    }

    public String getProtocolUrl() {
        return this.protocolUrl;
    }

    public void setProtocolUrl(String str) {
        this.protocolUrl = str;
    }

    public String getGuideAction() {
        return this.guideAction;
    }

    public void setGuideAction(String str) {
        this.guideAction = str;
    }

    public int getDeductType() {
        return this.deductType;
    }

    public void setDeductType(int i) {
        this.deductType = i;
    }

    public long getPlanId() {
        return this.planId;
    }

    public void setPlanId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ad88c2432554752efa90580879d33b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ad88c2432554752efa90580879d33b6");
        } else {
            this.planId = j;
        }
    }

    public long getSignMerchantNo() {
        return this.signMerchantNo;
    }

    public void setSignMerchantNo(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dbb9dbe0a1ebfee02e9353500ad31308", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dbb9dbe0a1ebfee02e9353500ad31308");
        } else {
            this.signMerchantNo = j;
        }
    }
}
