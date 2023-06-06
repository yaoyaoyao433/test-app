package com.meituan.android.cashier.model.bean;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
@JsonAdapter(CashierPopWindowBeanDeserializer.class)
/* loaded from: classes2.dex */
public class CashierPopWindowBean implements Serializable {
    public static final String BEFORE_PAY_SCENE = "beforePay";
    public static final int BIND_CARD_PAY_GUIDE = 3;
    public static final int CREDIT_PAY_GUIDE = 4;
    public static final String INTERRUPT_PAY_SCENE = "interruptPay";
    public static final int POPWINDOW_PAYLATER_GUIDE = 2;
    public static final int PROMOTION_BINDED_CARD_PAY_GUIDE = 6;
    public static final int PROMOTION_SIGNED_PAY_GUIDE = 5;
    public static final int STOP_PAYMENT_GUIDE = 1;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4421892210147535599L;
    private PayLaterPopDetailInfoBean payLaterPopDetailInfoBean;
    @SerializedName("pop_detail_info")
    private PopDetailInfo popDetailInfo;
    @SerializedName("pop_scene")
    private String popScene;
    @SerializedName("type")
    private int type;

    public String getPopScene() {
        return this.popScene;
    }

    public void setPopScene(String str) {
        this.popScene = str;
    }

    public PopDetailInfo getPopDetailInfo() {
        return this.popDetailInfo;
    }

    public void setPopDetailInfo(PopDetailInfo popDetailInfo) {
        this.popDetailInfo = popDetailInfo;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }

    public PayLaterPopDetailInfoBean getPayLaterPopDetailInfoBean() {
        return this.payLaterPopDetailInfoBean;
    }

    public void setPayLaterPopDetailInfoBean(PayLaterPopDetailInfoBean payLaterPopDetailInfoBean) {
        this.payLaterPopDetailInfoBean = payLaterPopDetailInfoBean;
    }
}
