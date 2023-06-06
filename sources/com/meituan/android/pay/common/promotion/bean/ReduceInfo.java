package com.meituan.android.pay.common.promotion.bean;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paybase.utils.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class ReduceInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -6952267162933642793L;
    @SerializedName("order_max_reduce")
    private float OrderMaxReduceMoney;
    @SerializedName("campaign_id")
    private String campaignId;
    @SerializedName("cashticket_code")
    private String cashTicketId;
    @SerializedName(PayLabelConstants.TYPE_REDUCE)
    private float reduceMoney;

    public String getCampaignId() {
        return this.campaignId;
    }

    public void setCampaignId(String str) {
        this.campaignId = str;
    }

    public String getCashTicketId() {
        return this.cashTicketId;
    }

    public void setCashTicketId(String str) {
        this.cashTicketId = str;
    }

    public float getReduceMoney() {
        return this.reduceMoney;
    }

    public void setReduceMoney(float f) {
        this.reduceMoney = f;
    }

    public float getOrderMaxReduceMoney() {
        return this.OrderMaxReduceMoney;
    }

    public void setOrderMaxReduceMoney(float f) {
        this.OrderMaxReduceMoney = f;
    }

    public boolean useCashierTicket() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1e56634783d7653ec8a092511643827", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1e56634783d7653ec8a092511643827")).booleanValue() : !TextUtils.isEmpty(this.cashTicketId);
    }

    public boolean isInCampaign() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77dc83ebab5cfd6be95bfbeb21de8d82", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77dc83ebab5cfd6be95bfbeb21de8d82")).booleanValue() : !TextUtils.isEmpty(this.campaignId);
    }

    public boolean isAvailableReduce() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f7b5997dd4fcd27ac01a06d146235b4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f7b5997dd4fcd27ac01a06d146235b4")).booleanValue() : d.c((Number) Float.valueOf(this.reduceMoney), (Number) 0) > 0;
    }
}
