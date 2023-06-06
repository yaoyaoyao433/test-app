package com.meituan.android.pay.common.promotion.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class PaymentReduce implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6810662829271642288L;
    @SerializedName("no_balance")
    private ReduceInfo noBalanceReduceInfo;

    public ReduceInfo getNoBalanceReduceInfo() {
        return this.noBalanceReduceInfo;
    }

    public void setNoBalanceReduceInfo(ReduceInfo reduceInfo) {
        this.noBalanceReduceInfo = reduceInfo;
    }

    public float getReduceMoneyWithoutBalance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e9f8f556af23deca73e8a24d85f5978", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e9f8f556af23deca73e8a24d85f5978")).floatValue();
        }
        if (this.noBalanceReduceInfo != null) {
            return this.noBalanceReduceInfo.getReduceMoney();
        }
        return 0.0f;
    }

    public boolean isUseCashTicketWhenNotUseBalance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e0c46b46ba7956b637957372487e95a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e0c46b46ba7956b637957372487e95a")).booleanValue() : this.noBalanceReduceInfo != null && this.noBalanceReduceInfo.useCashierTicket();
    }
}
