package com.meituan.android.pay.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class PageHelp implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -2804467103250361352L;
    @SerializedName("help_info")
    private HelpInfo helpInfo;
    @SerializedName("help_text")
    private String helpText;

    public String getHelpText() {
        return this.helpText;
    }

    public void setHelpText(String str) {
        this.helpText = str;
    }

    public HelpInfo getHelpInfo() {
        return this.helpInfo;
    }

    public void setHelpInfo(HelpInfo helpInfo) {
        this.helpInfo = helpInfo;
    }
}
