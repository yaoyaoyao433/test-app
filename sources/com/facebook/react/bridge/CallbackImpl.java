package com.facebook.react.bridge;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class CallbackImpl implements Callback {
    private final int mCallbackId;
    private boolean mInvoked = false;
    private final JSInstance mJSInstance;

    public CallbackImpl(JSInstance jSInstance, int i) {
        this.mJSInstance = jSInstance;
        this.mCallbackId = i;
    }

    @Override // com.facebook.react.bridge.Callback
    public final void invoke(Object... objArr) {
        if (this.mInvoked) {
            return;
        }
        this.mJSInstance.invokeCallback(this.mCallbackId, Arguments.fromJavaArgs(objArr));
        this.mInvoked = true;
    }
}
