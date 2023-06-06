package com.meituan.android.pay.common.payment.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class ChangePayTypeWarn implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -6301283510030495908L;
    @SerializedName("right_button_action")
    private String action;
    @SerializedName("content")
    private String content;
    @SerializedName("id")
    private String id;
    @SerializedName("left_button")
    private String leftButton;
    @SerializedName("right_button")
    private String rightButton;
    @SerializedName("title")
    private String title;

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public String getLeftButton() {
        return this.leftButton;
    }

    public void setLeftButton(String str) {
        this.leftButton = str;
    }

    public String getRightButton() {
        return this.rightButton;
    }

    public void setRightButton(String str) {
        this.rightButton = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String str) {
        this.action = str;
    }
}
