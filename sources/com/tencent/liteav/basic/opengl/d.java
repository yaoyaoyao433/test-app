package com.tencent.liteav.basic.opengl;

import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d extends IOException {
    private static final long serialVersionUID = 2723743254380545567L;
    private final int mErrorCode;
    private final String mErrorMessage;

    public d(int i) {
        this(i, null);
    }

    public d(int i, String str) {
        this.mErrorCode = i;
        this.mErrorMessage = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.mErrorMessage != null) {
            return "EGL error code: " + this.mErrorCode + this.mErrorMessage;
        }
        return "EGL error code: " + this.mErrorCode;
    }
}
