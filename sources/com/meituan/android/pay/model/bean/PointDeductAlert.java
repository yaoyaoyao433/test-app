package com.meituan.android.pay.model.bean;

import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class PointDeductAlert implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -4822635748318721590L;
    private String content;
    private String leftButton;
    private String rightButton;
    private String ruleContentUrl;
    private String rulePreName;
    private String ruleSufName;
    private String title;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
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

    public String getRulePreName() {
        return this.rulePreName;
    }

    public void setRulePreName(String str) {
        this.rulePreName = str;
    }

    public String getRuleSufName() {
        return this.ruleSufName;
    }

    public void setRuleSufName(String str) {
        this.ruleSufName = str;
    }

    public String getRuleContentUrl() {
        return this.ruleContentUrl;
    }

    public void setRuleContentUrl(String str) {
        this.ruleContentUrl = str;
    }
}
