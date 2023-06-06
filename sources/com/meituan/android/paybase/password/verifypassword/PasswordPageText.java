package com.meituan.android.paybase.password.verifypassword;

import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class PasswordPageText implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5302158593523467855L;
    private String leftBtn;
    private String link;
    private String pageTip;
    private String pageTitle;
    private String promptTip;
    private String rightBtn;
    private String subPageTip;

    public String getSubPageTip() {
        return this.subPageTip;
    }

    public void setSubPageTip(String str) {
        this.subPageTip = str;
    }

    public String getPageTip() {
        return this.pageTip;
    }

    public void setPageTip(String str) {
        this.pageTip = str;
    }

    public String getPageTitle() {
        return this.pageTitle;
    }

    public void setPageTitle(String str) {
        this.pageTitle = str;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String str) {
        this.link = str;
    }

    public String getPromptTip() {
        return this.promptTip;
    }

    public void setPromptTip(String str) {
        this.promptTip = str;
    }

    public String getLeftBtn() {
        return this.leftBtn;
    }

    public void setLeftBtn(String str) {
        this.leftBtn = str;
    }

    public String getRightBtn() {
        return this.rightBtn;
    }

    public void setRightBtn(String str) {
        this.rightBtn = str;
    }
}
