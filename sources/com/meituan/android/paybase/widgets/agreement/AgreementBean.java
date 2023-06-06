package com.meituan.android.paybase.widgets.agreement;

import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class AgreementBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -2865166779049510759L;
    private String agreementColor;
    private String agreementPrefix;
    private boolean canCheck;
    private boolean isChecked;
    private String name;
    private String textColor;
    private float textSize;
    private String url;

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public boolean canCheck() {
        return this.canCheck;
    }

    public void setCanCheck(boolean z) {
        this.canCheck = z;
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    public void setIsChecked(boolean z) {
        this.isChecked = z;
    }

    public String getAgreementPrefix() {
        return this.agreementPrefix;
    }

    public void setAgreementPrefix(String str) {
        this.agreementPrefix = str;
    }

    public float getTextSize() {
        return this.textSize;
    }

    public void setTextSize(float f) {
        this.textSize = f;
    }

    public String getTextColor() {
        return this.textColor;
    }

    public void setTextColor(String str) {
        this.textColor = str;
    }

    public String getAgreementColor() {
        return this.agreementColor;
    }

    public void setAgreementColor(String str) {
        this.agreementColor = str;
    }
}
