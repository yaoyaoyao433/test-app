package com.meituan.android.pay.desk.component.bean.balanceinsufficientguide;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class AlertPage implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2712608093289108460L;
    @SerializedName("left_button")
    private String leftButton;
    @SerializedName("page_tip")
    private String pageTip;
    @SerializedName("page_title")
    private String pageTitle;
    @SerializedName("right_button")
    private String rightButton;
    @SerializedName("submit_url")
    private String submitUrl;

    public String getPageTitle() {
        return this.pageTitle;
    }

    public void setPageTitle(String str) {
        this.pageTitle = str;
    }

    public String getPageTip() {
        return this.pageTip;
    }

    public void setPageTip(String str) {
        this.pageTip = str;
    }

    public String getLeftButton() {
        return this.leftButton;
    }

    public void setLeftBtn(String str) {
        this.leftButton = str;
    }

    public String getRightButton() {
        return this.rightButton;
    }

    public void setRightBtn(String str) {
        this.rightButton = str;
    }

    public String getSubmitUrl() {
        return this.submitUrl;
    }

    public void setSubmitUrl(String str) {
        this.submitUrl = str;
    }
}
