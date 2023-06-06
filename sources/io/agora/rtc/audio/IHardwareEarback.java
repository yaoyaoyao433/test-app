package io.agora.rtc.audio;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface IHardwareEarback {
    void destroy();

    int enableEarbackFeature(boolean z);

    void initialize();

    boolean isHardwareEarbackSupported();

    int setHardwareEarbackVolume(int i);
}
