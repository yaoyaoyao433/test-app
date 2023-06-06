package com.facebook.react.bridge;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface NotThreadSafeBridgeIdleDebugListener {
    void onBridgeDestroyed();

    void onTransitionToBridgeBusy();

    void onTransitionToBridgeIdle();
}
