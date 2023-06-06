package com.meituan.android.cashier.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class MTPaymentURL implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1411397808302864142L;
    @SerializedName("overload_info")
    private OverLoadInfo overLoadInfo;
    @SerializedName("pay_type")
    private String payType;
    private String url;

    public String getPayType() {
        return this.payType;
    }

    public void setPayType(String str) {
        this.payType = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public OverLoadInfo getOverLoadInfo() {
        return this.overLoadInfo;
    }

    public void setOverLoadInfo(OverLoadInfo overLoadInfo) {
        this.overLoadInfo = overLoadInfo;
    }

    public PayResult getPayResultObject() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "254fa365298676b6a687e3929177de17", RobustBitConfig.DEFAULT_VALUE)) {
            return (PayResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "254fa365298676b6a687e3929177de17");
        }
        PayResult payResult = new PayResult();
        payResult.setPayType(this.payType);
        payResult.setUrl(this.url);
        payResult.setOverLoadInfo(this.overLoadInfo);
        return payResult;
    }
}
