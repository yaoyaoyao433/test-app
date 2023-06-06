package com.meituan.android.pike.bean.proto.inner;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ReceiveMessageProtoACK implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int command;
    private ReceiveMessageProtoACKInner data;

    public ReceiveMessageProtoACK() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3827ae01ac512e811744525c792b5ab5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3827ae01ac512e811744525c792b5ab5");
        } else {
            setCommand(8);
        }
    }

    public void setCommand(int i) {
        this.command = i;
    }

    public int getCommand() {
        return this.command;
    }

    public void setData(ReceiveMessageProtoACKInner receiveMessageProtoACKInner) {
        this.data = receiveMessageProtoACKInner;
    }

    public ReceiveMessageProtoACKInner getData() {
        return this.data;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class ReceiveMessageProtoACKInner implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String messageId;
        private int status;
        private long timestamp;
        private String token;

        public void setToken(String str) {
            this.token = str;
        }

        public String getToken() {
            return this.token;
        }

        public String getMessageId() {
            return this.messageId;
        }

        public void setMessageId(String str) {
            this.messageId = str;
        }

        public int getStatus() {
            return this.status;
        }

        public void setStatus(int i) {
            this.status = i;
        }

        public long getTimestamp() {
            return this.timestamp;
        }

        public void setTimestamp(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02aeba1d789feeafb406214cb03dc1de", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02aeba1d789feeafb406214cb03dc1de");
            } else {
                this.timestamp = j;
            }
        }
    }
}
