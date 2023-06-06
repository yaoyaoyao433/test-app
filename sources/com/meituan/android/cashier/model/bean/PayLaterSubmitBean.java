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
public class PayLaterSubmitBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -5056293054808302880L;
    @SerializedName("ext")
    private String ext;
    @SerializedName("guideScene")
    private int guidScene;
    @SerializedName("planId")
    private long planId;
    @SerializedName("deductType")
    private int planType;
    @SerializedName("promotionInfo")
    private String promotionInfo;
    @SerializedName("signMerchantNo")
    private String signMerchantNo;

    public int getPlanType() {
        return this.planType;
    }

    public void setPlanType(int i) {
        this.planType = i;
    }

    public long getPlanId() {
        return this.planId;
    }

    public void setPlanId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df63514486075d59bb01c9439c79c1c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df63514486075d59bb01c9439c79c1c2");
        } else {
            this.planId = j;
        }
    }

    public int getGuidScene() {
        return this.guidScene;
    }

    public void setGuidScene(int i) {
        this.guidScene = i;
    }

    public String getSignMerchantNo() {
        return this.signMerchantNo;
    }

    public void setSignMerchantNo(String str) {
        this.signMerchantNo = str;
    }

    public boolean openCreditPay() {
        return this.guidScene == 1;
    }

    public boolean bindNewCard() {
        return this.guidScene == 2;
    }

    public String getPromotionInfo() {
        return this.promotionInfo;
    }

    public void setPromotionInfo(String str) {
        this.promotionInfo = str;
    }

    public String getExt() {
        return this.ext;
    }

    public void setExt(String str) {
        this.ext = str;
    }
}
