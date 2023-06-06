package com.tencent.map.tools.net.exception;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class NetUnavailableException extends NetErrorException {
    private static final long serialVersionUID = 2783283891376573878L;

    public NetUnavailableException() {
    }

    public NetUnavailableException(String str) {
        super(str);
    }

    public NetUnavailableException(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
