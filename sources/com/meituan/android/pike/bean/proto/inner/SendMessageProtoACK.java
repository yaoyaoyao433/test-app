package com.meituan.android.pike.bean.proto.inner;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SendMessageProtoACK implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String messageId;
    private byte status;
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

    public byte getStatus() {
        return this.status;
    }

    public void setStatus(byte b) {
        this.status = b;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "510c0b23d964e2666f42e1f5cb47e6de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "510c0b23d964e2666f42e1f5cb47e6de");
        } else {
            this.timestamp = j;
        }
    }
}
