package com.sankuai.waimai.bussiness.order.confirm.model;

import android.support.annotation.Keep;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class PaymentTemplate implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("more_payment_type_vo")
    public List<a> morePaymentTypeVoList;
    @SerializedName("pay_serial_code")
    public String paySerailCode;
    @SerializedName("payment_guide_vo")
    public b paymentGuideVo;
    @SerializedName("pre_cashier_info")
    public String preCashierInfo;
    @SerializedName("entrance_text")
    public String quickPayEntranceText;
    @SerializedName("quick_pay_link")
    public String quickPayRuleLine;
    @SerializedName("tmpl_title")
    public String quickPayTitle;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        @SerializedName("payment_type")
        public int a;
        @SerializedName("payment_tip")
        public String b;
        @SerializedName("unusable_display_text")
        public String c;
        @SerializedName(DMKeys.KEY_SELECTED)
        public int d;
        @SerializedName("selectable")
        public int e;
        @SerializedName("title")
        public String f;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b implements Serializable {
        @SerializedName("display_payment_guide")
        public int a;
        @SerializedName("guide_button_selected")
        public int b;
        @SerializedName("guide_description")
        public String c;
        @SerializedName("pay_instruction_url")
        public String d;
    }
}
