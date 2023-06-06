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
public class CardInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -6791735117676040648L;
    @SerializedName("bank_card")
    private String bankCard;
    @SerializedName("card_type")
    private String cardType;
    @SerializedName("name_ext")
    private String nameExt;
    @SerializedName("tailno")
    private String tailNo;

    public String getBankCard() {
        return this.bankCard;
    }

    public void setBankCard(String str) {
        this.bankCard = str;
    }

    public String getCardType() {
        return this.cardType;
    }

    public void setCardType(String str) {
        this.cardType = str;
    }

    public String getTailNo() {
        return this.tailNo;
    }

    public void setTailNo(String str) {
        this.tailNo = str;
    }

    public String getNameExt() {
        return this.nameExt;
    }

    public void setNameExt(String str) {
        this.nameExt = str;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24a1f1b2a462e256218283092ae75cab", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24a1f1b2a462e256218283092ae75cab");
        }
        return "CardInfo{bankCard='" + this.bankCard + "', cardType='" + this.cardType + "', tailNo='" + this.tailNo + "', nameExt='" + this.nameExt + "'}";
    }
}
