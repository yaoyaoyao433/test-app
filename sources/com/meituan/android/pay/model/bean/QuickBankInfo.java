package com.meituan.android.pay.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class QuickBankInfo implements Serializable {
    public static final int SUPPORT_QUICK_BIND = 1;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1004437051696770587L;
    @SerializedName("banklist")
    private List<QuickBankDetail> detailList;
    @SerializedName("info")
    private QuickBankTip quickBankTip;
    @SerializedName("quick_bind_url")
    private String quickBindUrl;
    @SerializedName("support_quick_bind")
    private int supportQuickBind;

    public QuickBankTip getQuickBankTip() {
        return this.quickBankTip;
    }

    public void setQuickBankTip(QuickBankTip quickBankTip) {
        this.quickBankTip = quickBankTip;
    }

    public List<QuickBankDetail> getBankListInfo() {
        return this.detailList;
    }

    public void setBankListInfo(List<QuickBankDetail> list) {
        this.detailList = list;
    }

    public int getSupportQuickBind() {
        return this.supportQuickBind;
    }

    public void setSupportQuickBind(int i) {
        this.supportQuickBind = i;
    }

    public String getQuickBindUrl() {
        return this.quickBindUrl;
    }

    public void setQuickBindUrl(String str) {
        this.quickBindUrl = str;
    }

    public boolean isSupportQuickBind() {
        return this.supportQuickBind == 1;
    }
}
