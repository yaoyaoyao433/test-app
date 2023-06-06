package com.meituan.android.cashier.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class CashierRouterInfo implements Serializable {
    public static final String DECISION_TYPE_CASHIER = "cashierProduct";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1571888408693264010L;
    @SerializedName("bff_node_response")
    private BffResponseBean bffResponseBean;
    private String clientRouterInfo;
    private String decisionType;
    private CashierProductInfo productInfo;

    public String getDecisionType() {
        return this.decisionType;
    }

    public void setDecisionType(String str) {
        this.decisionType = str;
    }

    public CashierProductInfo getProductInfo() {
        return this.productInfo;
    }

    public void setProductInfo(CashierProductInfo cashierProductInfo) {
        this.productInfo = cashierProductInfo;
    }

    public String getClientRouterInfo() {
        return this.clientRouterInfo;
    }

    public void setClientRouterInfo(String str) {
        this.clientRouterInfo = str;
    }

    public BffResponseBean getBffResponseBean() {
        return this.bffResponseBean;
    }

    public void setBffResponseBean(BffResponseBean bffResponseBean) {
        this.bffResponseBean = bffResponseBean;
    }

    public String getProductType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce22d0239e3b5f43908e99a9ce84f05b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce22d0239e3b5f43908e99a9ce84f05b");
        }
        CashierProductInfo productInfo = getProductInfo();
        if (productInfo == null) {
            return null;
        }
        return productInfo.getType();
    }
}
