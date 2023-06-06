package com.meituan.android.cashier.model.bean;

import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class PopUp implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5353125441992301819L;
    private String body;
    private String cancelButton;
    private String confirmButton;
    private String orderId;
    private String subtype;
    private String title;
    private String type;
    private String url;

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String getSubtype() {
        return this.subtype;
    }

    public void setSubtype(String str) {
        this.subtype = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public String getConfirmButton() {
        return this.confirmButton;
    }

    public void setConfirmButton(String str) {
        this.confirmButton = str;
    }

    public String getCancelButton() {
        return this.cancelButton;
    }

    public void setCancelButton(String str) {
        this.cancelButton = str;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
