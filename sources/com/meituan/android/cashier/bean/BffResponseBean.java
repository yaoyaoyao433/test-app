package com.meituan.android.cashier.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class BffResponseBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 8799998104182645291L;
    @SerializedName("hybrid_standard_cashier_csr")
    private String hybridStandardCashierDispatcherResponse;
    @SerializedName("hybrid_standard_cashier_ssr")
    private String hybridStandardCashierSSRNodeResponse;

    public String getHybridStandardCashierDispatcherResponse() {
        return this.hybridStandardCashierDispatcherResponse;
    }

    public void setHybridStandardCashierDispatcherResponse(String str) {
        this.hybridStandardCashierDispatcherResponse = str;
    }

    public String getHybridStandardCashierSSRNodeResponse() {
        return this.hybridStandardCashierSSRNodeResponse;
    }

    public void setHybridStandardCashierSSRNodeResponse(String str) {
        this.hybridStandardCashierSSRNodeResponse = str;
    }
}
