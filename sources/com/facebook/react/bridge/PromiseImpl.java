package com.facebook.react.bridge;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PromiseImpl implements Promise {
    private static final String ERROR_DEFAULT_CODE = "EUNSPECIFIED";
    private static final String ERROR_DEFAULT_MESSAGE = "Error not specified.";
    private static final String ERROR_MAP_KEY_CODE = "code";
    private static final String ERROR_MAP_KEY_MESSAGE = "message";
    private static final String ERROR_MAP_KEY_NATIVE_STACK = "nativeStackAndroid";
    private static final String ERROR_MAP_KEY_USER_INFO = "userInfo";
    private static final int ERROR_STACK_FRAME_LIMIT = 50;
    private static final String STACK_FRAME_KEY_CLASS = "class";
    private static final String STACK_FRAME_KEY_FILE = "file";
    private static final String STACK_FRAME_KEY_LINE_NUMBER = "lineNumber";
    private static final String STACK_FRAME_KEY_METHOD_NAME = "methodName";
    @Nullable
    private Callback mReject;
    @Nullable
    private Callback mResolve;

    public PromiseImpl(@Nullable Callback callback, @Nullable Callback callback2) {
        this.mResolve = callback;
        this.mReject = callback2;
    }

    @Override // com.facebook.react.bridge.Promise
    public void resolve(Object obj) {
        if (this.mResolve != null) {
            this.mResolve.invoke(obj);
            this.mResolve = null;
            this.mReject = null;
        }
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, String str2) {
        reject(str, str2, null, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, Throwable th) {
        reject(str, null, th, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, String str2, Throwable th) {
        reject(str, str2, th, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(Throwable th) {
        reject(null, null, th, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(Throwable th, WritableMap writableMap) {
        reject(null, null, th, writableMap);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, @NonNull WritableMap writableMap) {
        reject(str, null, null, writableMap);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, Throwable th, WritableMap writableMap) {
        reject(str, null, th, writableMap);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, String str2, @NonNull WritableMap writableMap) {
        reject(str, str2, null, writableMap);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(@Nullable String str, @Nullable String str2, @Nullable Throwable th, @Nullable WritableMap writableMap) {
        if (this.mReject == null) {
            this.mResolve = null;
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (str == null) {
            writableNativeMap.putString("code", ERROR_DEFAULT_CODE);
        } else {
            writableNativeMap.putString("code", str);
        }
        if (str2 != null) {
            writableNativeMap.putString("message", str2);
        } else if (th != null) {
            writableNativeMap.putString("message", th.getMessage());
        } else {
            writableNativeMap.putString("message", ERROR_DEFAULT_MESSAGE);
        }
        if (writableMap != null) {
            writableNativeMap.putMap(ERROR_MAP_KEY_USER_INFO, writableMap);
        } else {
            writableNativeMap.putNull(ERROR_MAP_KEY_USER_INFO);
        }
        if (th == null) {
            th = new Throwable(str2);
        }
        if (th != null) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            for (int i = 0; i < stackTrace.length && i < 50; i++) {
                StackTraceElement stackTraceElement = stackTrace[i];
                WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                writableNativeMap2.putString("class", stackTraceElement.getClassName());
                writableNativeMap2.putString(STACK_FRAME_KEY_FILE, stackTraceElement.getFileName());
                writableNativeMap2.putInt(STACK_FRAME_KEY_LINE_NUMBER, stackTraceElement.getLineNumber());
                writableNativeMap2.putString(STACK_FRAME_KEY_METHOD_NAME, stackTraceElement.getMethodName());
                writableNativeArray.pushMap((WritableMap) writableNativeMap2);
            }
            writableNativeMap.putArray(ERROR_MAP_KEY_NATIVE_STACK, (WritableArray) writableNativeArray);
        } else {
            writableNativeMap.putArray(ERROR_MAP_KEY_NATIVE_STACK, (WritableArray) new WritableNativeArray());
        }
        this.mReject.invoke(writableNativeMap);
        this.mResolve = null;
        this.mReject = null;
    }

    @Override // com.facebook.react.bridge.Promise
    @Deprecated
    public void reject(String str) {
        reject(null, str, null, null);
    }
}
