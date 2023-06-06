package com.meituan.android.pay.model.bean;

import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class BankLimit implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -364208405825334272L;
    private String text;
    private String tip;
    private String url;

    public String getText() {
        return this.text;
    }

    public void setText(String str) {
        this.text = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String getTip() {
        return this.tip;
    }

    public void setTip(String str) {
        this.tip = str;
    }
}
