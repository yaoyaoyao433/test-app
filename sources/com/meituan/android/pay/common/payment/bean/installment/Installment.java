package com.meituan.android.pay.common.payment.bean.installment;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class Installment implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 790936400570086403L;
    @SerializedName("installment_periods")
    private String allPeriods;
    @SerializedName("period_list")
    private List<Period> periodList;
    @SerializedName("rate_desc_button")
    private String rateDescButton;
    private String title;

    public String getRateDescButton() {
        return this.rateDescButton;
    }

    public void setRateDescButton(String str) {
        this.rateDescButton = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getAllPeriods() {
        return this.allPeriods;
    }

    public void setAllPeriods(String str) {
        this.allPeriods = str;
    }

    public List<Period> getPeriodList() {
        return this.periodList;
    }

    public void setPeriodList(List<Period> list) {
        this.periodList = list;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b3f8e2e30b92daaa780fa8f11fccbb6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b3f8e2e30b92daaa780fa8f11fccbb6") : new Gson().toJson(this);
    }
}
