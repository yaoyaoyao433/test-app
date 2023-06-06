package com.meituan.android.pay.model.bean;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.pay.common.promotion.bean.Icon;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class BankCard implements Serializable {
    public static final int PAY_ERROR_STATUS = 1;
    public static final int PAY_EVENT_STATUS = 2;
    public static final int PAY_NORMAL_STATUS = 0;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4784914981194131662L;
    private double amount;
    @SerializedName("bank_type")
    private String bankType;
    @SerializedName("card_type")
    private String cardType;
    @SerializedName("character")
    private String character;
    @SerializedName("exceed_desc")
    private String exceedDesc;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    private Icon icon;
    @SerializedName("ishot")
    private boolean isHot;
    @SerializedName("name")
    private String name;
    @SerializedName("pay_type")
    private String payType;
    @SerializedName("status")
    private int status;
    @SerializedName("status_info")
    private String statusInfo;

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24f488846cfa46568dfe7cb919d17033", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24f488846cfa46568dfe7cb919d17033");
        } else {
            this.amount = d;
        }
    }

    public String getExceedDesc() {
        return this.exceedDesc;
    }

    public void setExceedDesc(String str) {
        this.exceedDesc = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getBankType() {
        return this.bankType;
    }

    public void setBankType(String str) {
        this.bankType = str;
    }

    public String getCharacter() {
        return this.character;
    }

    public void setCharacter(String str) {
        this.character = str;
    }

    public boolean isHot() {
        return this.isHot;
    }

    public void setHot(boolean z) {
        this.isHot = z;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public String getStatusInfo() {
        return this.statusInfo;
    }

    public void setStatusInfo(String str) {
        this.statusInfo = str;
    }

    public boolean isNormalStatus() {
        return this.status == 0;
    }

    public boolean isEventStatus() {
        return this.status == 2;
    }

    public boolean isErrorStatus() {
        return this.status == 1;
    }

    public Icon getIcon() {
        return this.icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getCardType() {
        return this.cardType;
    }

    public void setCardType(String str) {
        this.cardType = str;
    }

    public String getPayType() {
        return this.payType;
    }

    public void setPayType(String str) {
        this.payType = str;
    }
}
