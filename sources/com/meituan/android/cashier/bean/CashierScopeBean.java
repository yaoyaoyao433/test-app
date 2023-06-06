package com.meituan.android.cashier.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.cashier.common.CashierTypeConstant;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class CashierScopeBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 3061989667081264560L;
    private List<String> blackList;
    @SerializedName("dest_cashier")
    private String destCashier;
    @SerializedName("downgrade_available")
    private boolean downgradeAvailable;
    private String maxVersion;
    private String minVersion;

    public CashierScopeBean() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "687a9eacd1e945ee7992ac0fad01584a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "687a9eacd1e945ee7992ac0fad01584a");
        } else {
            this.downgradeAvailable = true;
        }
    }

    public String getMinVersion() {
        return this.minVersion;
    }

    public void setMinVersion(String str) {
        this.minVersion = str;
    }

    public String getMaxVersion() {
        return this.maxVersion;
    }

    public void setMaxVersion(String str) {
        this.maxVersion = str;
    }

    public List<String> getBlackList() {
        return this.blackList;
    }

    public void setBlackList(List<String> list) {
        this.blackList = list;
    }

    public boolean isDowngradeAvailable() {
        return this.downgradeAvailable;
    }

    public void setDowngradeAvailable(boolean z) {
        this.downgradeAvailable = z;
    }

    public String getDestCashier() {
        return this.destCashier;
    }

    public void setDestCashier(String str) {
        this.destCashier = str;
    }

    public static CashierScopeBean getDefault(@CashierTypeConstant.CashierType String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "15c261ef80f6d2070d1f2453470b80a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (CashierScopeBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "15c261ef80f6d2070d1f2453470b80a1");
        }
        CashierScopeBean cashierScopeBean = new CashierScopeBean();
        cashierScopeBean.setDestCashier(str);
        return cashierScopeBean;
    }
}
