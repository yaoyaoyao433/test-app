package com.huawei.hms.core.aidl;

import com.huawei.hms.core.aidl.annotation.Packed;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ResponseHeader implements IMessageEntity {
    @Packed
    protected int statusCode;

    public ResponseHeader() {
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public ResponseHeader(int i) {
        this.statusCode = i;
    }
}
