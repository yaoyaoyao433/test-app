package com.meituan.android.paybase.fingerprint.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class PayPassword implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -2059540710994215279L;
    @SerializedName("page_subtip")
    private String pageSubTip;
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

    public String getPageSubTip() {
        return this.pageSubTip;
    }

    public void setPageSubTip(String str) {
        this.pageSubTip = str;
    }
}
