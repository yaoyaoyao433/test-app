package com.meituan.android.pay.common.payment.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class RepayHelp implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5705033432986812160L;
    @SerializedName("help_alert")
    private HelpAlert helpAlert;
    @SerializedName("title")
    private String prompt;

    public String getPrompt() {
        return this.prompt;
    }

    public void setPrompt(String str) {
        this.prompt = str;
    }

    public HelpAlert getHelpAlert() {
        return this.helpAlert;
    }

    public void setHelpAlert(HelpAlert helpAlert) {
        this.helpAlert = helpAlert;
    }
}
