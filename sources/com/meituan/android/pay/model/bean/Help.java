package com.meituan.android.pay.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class Help implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -6313457734759676090L;
    @SerializedName("factor_extends")
    private FactorExtend factorExtend;
    @SerializedName("help_img")
    private String helpImgUrl;
    @SerializedName("help_text")
    private String helpText;
    @SerializedName("help_title")
    private String helpTitle;

    public String getHelpText() {
        return this.helpText;
    }

    public void setHelpText(String str) {
        this.helpText = str;
    }

    public String getHelpImgUrl() {
        return this.helpImgUrl;
    }

    public String getHelpTitle() {
        return this.helpTitle;
    }

    public void setHelpTitle(String str) {
        this.helpTitle = str;
    }

    public void setHelpImgUrl(String str) {
        this.helpImgUrl = str;
    }

    public FactorExtend getFactorExtend() {
        return this.factorExtend;
    }

    public void setFactorExtend(FactorExtend factorExtend) {
        this.factorExtend = factorExtend;
    }
}
