package com.meituan.mmp.lib.api.pay;

import com.google.gson.annotations.SerializedName;
import com.meituan.mmp.lib.api.ApiFunction;
import com.meituan.mmp.main.annotation.Optional;
import com.meituan.mmp.main.annotation.Required;
import com.meituan.mmp.main.d;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class AbsMTPayApi {

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class AbsMtRequestPayment extends ApiFunction<MtRequestPaymentParams, MtRequestPaymentResult> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class MtRequestPaymentParams implements d {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("callback_url")
        public String callbackUrl;
        @SerializedName("cashier_type")
        @Optional
        public String cashierType;
        @SerializedName("extra_data")
        public Object extraData;
        @SerializedName("extra_statics")
        public Object extraStatics;
        @SerializedName("merchant_no")
        @Optional
        public String merchantno;
        @Required
        public String payToken;
        @Required
        public String tradeno;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class MtRequestPaymentResult implements d {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("extra_data")
        public String extraData;
        public int status;
    }
}
