package com.meituan.android.pay.desk.component.bean.balanceinsufficientguide;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class DialogPage implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -2572319904299893758L;
    @SerializedName("main_button")
    private String mainButton;
    @SerializedName("main_button_flag")
    private int mainButtonFlag;
    @SerializedName("minor_button")
    private String minorButton;
    @SerializedName("minor_button_flag")
    private int minorButtonFlag;
    @SerializedName("page_tip")
    private String pageTip;
    @SerializedName("page_title")
    private String pageTitle;

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

    public String getMainButton() {
        return this.mainButton;
    }

    public void setMainButton(String str) {
        this.mainButton = str;
    }

    public int getMainButtonFlag() {
        return this.mainButtonFlag;
    }

    public void setMainButtonFlag(int i) {
        this.mainButtonFlag = i;
    }

    public String getMinorButton() {
        return this.minorButton;
    }

    public void setMinorButton(String str) {
        this.minorButton = str;
    }

    public int getMinorButtonFlag() {
        return this.minorButtonFlag;
    }

    public void setMinorButtonFlag(int i) {
        this.minorButtonFlag = i;
    }
}
