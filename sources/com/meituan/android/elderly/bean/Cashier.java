package com.meituan.android.elderly.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class Cashier implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 3601204569650363526L;
    @SerializedName("current_time")
    private int currentTime;
    @SerializedName("expire_time")
    private int expireTime;
    @SerializedName("head_info")
    private String headInfo;
    @SerializedName("header_notice")
    private HashMap<String, Object> headNotice;
    private String mobile;
    @SerializedName("order_info")
    private OrderInfo orderInfo;
    @SerializedName("subject")
    private String orderName;
    @SerializedName("pay_info")
    private List<CashierPayment> paymentDataList;
    @SerializedName("upgrade_balancepay_guide")
    private int showBalancePayGuide;
    @SerializedName("subject_url")
    private String subjectUrl;
    @SerializedName("total_fee")
    private float totalFee;
    @SerializedName("tradeno")
    private String tradeNo;

    public HashMap<String, Object> getHeadNotice() {
        return this.headNotice;
    }

    public void setHeadNotice(HashMap<String, Object> hashMap) {
        this.headNotice = hashMap;
    }

    public String getTradeNo() {
        return this.tradeNo;
    }

    public void setTradeNo(String str) {
        this.tradeNo = str;
    }

    public float getTotalFee() {
        return this.totalFee;
    }

    public void setTotalFee(float f) {
        this.totalFee = f;
    }

    public String getOrderName() {
        return this.orderName;
    }

    public void setOrderName(String str) {
        this.orderName = str;
    }

    public int getExpireTime() {
        return this.expireTime;
    }

    public void setExpireTime(int i) {
        this.expireTime = i;
    }

    public List<CashierPayment> getPaymentDataList() {
        return this.paymentDataList;
    }

    public void setPaymentDataList(List<CashierPayment> list) {
        this.paymentDataList = list;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String str) {
        this.mobile = str;
    }

    public String getHeadInfo() {
        return this.headInfo;
    }

    public void setHeadInfo(String str) {
        this.headInfo = str;
    }

    public String getSubjectUrl() {
        return this.subjectUrl;
    }

    public void setSubjectUrl(String str) {
        this.subjectUrl = str;
    }

    public void setCurrentTime(int i) {
        this.currentTime = i;
    }

    public int getCurrentTime() {
        return this.currentTime;
    }

    public void setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
    }

    public OrderInfo getOrderInfo() {
        return this.orderInfo;
    }

    public int getShowBalancePayGuide() {
        return this.showBalancePayGuide;
    }

    public void setShowBalancePayGuide(int i) {
        this.showBalancePayGuide = i;
    }

    public boolean shouldShowBalanceGuide() {
        return this.showBalancePayGuide == 1;
    }
}
