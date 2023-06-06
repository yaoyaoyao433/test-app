package com.meituan.android.pike.bean.proto.inner;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ReceiveMessageProto implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String message;
    private String messageId;
    private String token;

    public void setToken(String str) {
        this.token = str;
    }

    public String getToken() {
        return this.token;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public String getMessage() {
        return this.message;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }
}
