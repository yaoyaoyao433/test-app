package com.meituan.android.pay.common.payment.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class MTNewCardBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2984695678063555971L;
    @SerializedName("common_title")
    private String commonTitle;
    @SerializedName("main_title")
    private String mainTitle;
    @SerializedName("sub_title_hide")
    private String subTitleHide;
    @SerializedName("sub_title_show")
    private String subTitleShow;

    public String getCommonTitle() {
        return this.commonTitle;
    }

    public void setCommonTitle(String str) {
        this.commonTitle = str;
    }

    public String getSubTitleHide() {
        return this.subTitleHide;
    }

    public void setSubTitleHide(String str) {
        this.subTitleHide = str;
    }

    public String getSubTitleShow() {
        return this.subTitleShow;
    }

    public void setSubTitleShow(String str) {
        this.subTitleShow = str;
    }

    public String getMainTitle() {
        return this.mainTitle;
    }

    public void setMainTitle(String str) {
        this.mainTitle = str;
    }
}
