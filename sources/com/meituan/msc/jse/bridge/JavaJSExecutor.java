package com.meituan.msc.jse.bridge;

import com.meituan.msc.jse.common.annotations.DoNotStrip;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes3.dex */
public interface JavaJSExecutor {

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
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
    /* loaded from: classes3.dex */
    public static class ProxyExecutorException extends Exception {
        public static ChangeQuickRedirect changeQuickRedirect;

        public ProxyExecutorException(Throwable th) {
            super(th);
        }
    }
}
