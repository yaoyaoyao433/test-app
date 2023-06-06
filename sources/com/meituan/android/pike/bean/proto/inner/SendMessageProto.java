package com.meituan.android.pike.bean.proto.inner;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SendMessageProto implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int command;
    private SendMessageProtoInner data;

    public SendMessageProto() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "844a00df4391a9d929aa44f2302206ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "844a00df4391a9d929aa44f2302206ce");
        } else {
            setCommand(5);
        }
    }

    public void setCommand(int i) {
        this.command = i;
    }

    public int getCommand() {
        return this.command;
    }

    public void setData(SendMessageProtoInner sendMessageProtoInner) {
        this.data = sendMessageProtoInner;
    }

    public SendMessageProtoInner getData() {
        return this.data;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SendMessageProtoInner implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String message;
        private String messageId;
        private String sdkVersion;
        private String token;

        public void setSdkVersion(String str) {
            this.sdkVersion = str;
        }

        public String getSdkVersion() {
            return this.sdkVersion;
        }

        public void setToken(String str) {
            this.token = str;
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
}
