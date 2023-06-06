package com.meituan.android.pay.common.promotion.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class Agreement implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -5320625783283217369L;
    @SerializedName("agreement_prefix")
    private String agreementPrefix;
    @SerializedName("agreement_prefix_select")
    private String agreementPrefixSelect;
    @SerializedName("can_check")
    private boolean canCheck;
    @SerializedName("is_checked")
    private boolean isChecked;
    @SerializedName("agreement_name")
    private String name;
    @SerializedName("unchecked_tip")
    private String unCheckedTip;
    @SerializedName("agreement_url")
    private String url;

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public boolean canCheck() {
        return this.canCheck;
    }

    public void setCanCheck(boolean z) {
        this.canCheck = z;
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    public void setIsChecked(boolean z) {
        this.isChecked = z;
    }

    public String getUnCheckedTip() {
        return this.unCheckedTip;
    }

    public void setUnCheckedTip(String str) {
        this.unCheckedTip = str;
    }

    public String getAgreementPrefix() {
        return this.agreementPrefix;
    }

    public void setAgreementPrefix(String str) {
        this.agreementPrefix = str;
    }

    public String getAgreementPrefixSelect() {
        return this.agreementPrefixSelect;
    }

    public void setAgreementPrefixSelect(String str) {
        this.agreementPrefixSelect = str;
    }
}
