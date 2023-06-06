package com.tencent.map.tools.net.exception;

import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class NetLocalException extends IOException {
    private static final long serialVersionUID = -7835439581999472641L;

    public NetLocalException() {
    }

    public NetLocalException(String str) {
        super(str);
    }

    public NetLocalException(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
