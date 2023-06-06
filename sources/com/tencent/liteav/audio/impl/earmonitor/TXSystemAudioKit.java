package com.tencent.liteav.audio.impl.earmonitor;

import android.content.Context;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface TXSystemAudioKit {
    void initialize(Context context, a aVar);

    void setSystemEarMonitoringVolume(int i);

    void startSystemEarMonitoring();

    void stopSystemEarMonitoring();

    void uninitialize();
}
