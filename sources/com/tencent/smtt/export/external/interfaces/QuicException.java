package com.tencent.smtt.export.external.interfaces;
/* loaded from: classes6.dex */
public abstract class QuicException extends NetworkException {
    protected QuicException(String str, Throwable th) {
        super(str, th);
    }

    public abstract int getQuicDetailedErrorCode();
}
