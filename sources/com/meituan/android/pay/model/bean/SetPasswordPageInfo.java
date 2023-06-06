package com.meituan.android.pay.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class SetPasswordPageInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6995955471896553256L;
    @SerializedName("main")
    private String mainTitle;
    @SerializedName("submit_text")
    private String submitText;
    @SerializedName("submit_url")
    private String submitUrl;
    @SerializedName("vice")
    private String viceTitle;

    public String getSubmitText() {
        return this.submitText;
    }

    public void setSubmitText(String str) {
        this.submitText = str;
    }

    public String getSubmitUrl() {
        return this.submitUrl;
    }

    public void setSubmitUrl(String str) {
        this.submitUrl = str;
    }

    public String getMainTitle() {
        return this.mainTitle;
    }

    public void setMainTitle(String str) {
        this.mainTitle = str;
    }

    public String getViceTitle() {
        return this.viceTitle;
    }

    public void setViceTitle(String str) {
        this.viceTitle = str;
    }
}
