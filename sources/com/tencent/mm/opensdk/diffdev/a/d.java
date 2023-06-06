package com.tencent.mm.opensdk.diffdev.a;

import com.tencent.smtt.sdk.TbsListener;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public enum d {
    UUID_EXPIRED(402),
    UUID_CANCELED(403),
    UUID_SCANED(404),
    UUID_CONFIRM(405),
    UUID_KEEP_CONNECT(TbsListener.ErrorCode.INFO_CAN_NOT_DISABLED_BY_CRASH),
    UUID_ERROR(500);
    
    private int a;

    d(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UUIDStatusCode:" + this.a;
    }
}
