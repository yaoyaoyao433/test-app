package com.facebook.react.bridge;

import com.facebook.proguard.annotations.DoNotStrip;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes.dex */
public interface JavaJSExecutor {

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface Factory {
        JavaJSExecutor create() throws Exception;
    }

    void close();

    @DoNotStrip
    String executeJSCall(String str, String str2) throws ProxyExecutorException;

    @DoNotStrip
    void loadBundle(String str) throws ProxyExecutorException;

    @DoNotStrip
    void setGlobalVariable(String str, String str2);

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class ProxyExecutorException extends Exception {
        public ProxyExecutorException(Throwable th) {
            super(th);
        }
    }
}
