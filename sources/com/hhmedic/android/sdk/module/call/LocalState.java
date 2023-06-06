package com.hhmedic.android.sdk.module.call;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class LocalState {
    private static LocalState mInstance;
    private boolean isInCall = false;

    private LocalState() {
    }

    public static LocalState getInstance() {
        LocalState localState;
        synchronized (LocalState.class) {
            if (mInstance == null) {
                mInstance = new LocalState();
            }
            localState = mInstance;
        }
        return localState;
    }

    public final void lockCall() {
        synchronized (LocalState.class) {
            this.isInCall = true;
        }
    }

    public final void release() {
        synchronized (LocalState.class) {
            this.isInCall = false;
        }
    }

    public final boolean isCall() {
        boolean z;
        synchronized (LocalState.class) {
            z = this.isInCall;
        }
        return z;
    }
}
