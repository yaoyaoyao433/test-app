package io.agora.rtc.mediaio;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public interface IVideoSource {
    int getBufferType();

    int getCaptureType();

    int getContentHint();

    void onDispose();

    boolean onInitialize(IVideoFrameConsumer iVideoFrameConsumer);

    boolean onStart();

    void onStop();
}
