package com.meituan.android.pay.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class SMSCodeResult implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 3063208303554593947L;
    @SerializedName("sms_message")
    private String smsMessage;

    public String getSmsMessage() {
        return this.smsMessage;
    }

    public void setSmsMessage(String str) {
        this.smsMessage = str;
    }
}
