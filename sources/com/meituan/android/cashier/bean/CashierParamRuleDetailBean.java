package com.meituan.android.cashier.bean;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class CashierParamRuleDetailBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2698919864978102951L;
    private boolean abandon;
    private long maxSize;
    private List<CashierParamRuleDetailItemBean> params;

    public long getMaxSize() {
        return this.maxSize;
    }

    public void setMaxSize(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8b21160f21106480b8baec052da7d92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8b21160f21106480b8baec052da7d92");
        } else {
            this.maxSize = j;
        }
    }

    public boolean isAbandon() {
        return this.abandon;
    }

    public void setAbandon(boolean z) {
        this.abandon = z;
    }

    public List<CashierParamRuleDetailItemBean> getParams() {
        return this.params;
    }

    public void setParams(List<CashierParamRuleDetailItemBean> list) {
        this.params = list;
    }

    @NonNull
    public HashMap<String, CashierParamRuleDetailItemBean> getParamsRuleMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5132fc6c908f179fb85e69052aedda0", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5132fc6c908f179fb85e69052aedda0");
        }
        HashMap<String, CashierParamRuleDetailItemBean> hashMap = new HashMap<>();
        if (i.a((Collection) this.params)) {
            return hashMap;
        }
        for (CashierParamRuleDetailItemBean cashierParamRuleDetailItemBean : this.params) {
            if (!TextUtils.isEmpty(cashierParamRuleDetailItemBean.getParamName())) {
                hashMap.put(cashierParamRuleDetailItemBean.getParamName(), cashierParamRuleDetailItemBean);
            }
        }
        return hashMap;
    }
}
