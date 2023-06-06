package com.meituan.android.cashier.bean;

import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class CashierParamRuleBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 287057501028745363L;
    private CashierParamRuleDetailBean extraData;
    private CashierParamRuleDetailBean extraStatics;

    public CashierParamRuleDetailBean getExtraData() {
        return this.extraData;
    }

    public void setExtraData(CashierParamRuleDetailBean cashierParamRuleDetailBean) {
        this.extraData = cashierParamRuleDetailBean;
    }

    public CashierParamRuleDetailBean getExtraStatics() {
        return this.extraStatics;
    }

    public void setExtraStatics(CashierParamRuleDetailBean cashierParamRuleDetailBean) {
        this.extraStatics = cashierParamRuleDetailBean;
    }
}
