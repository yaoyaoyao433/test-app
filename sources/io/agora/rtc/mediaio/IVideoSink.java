package io.agora.rtc.mediaio;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public interface IVideoSink extends IVideoFrameConsumer {
    int getBufferType();

    long getEGLContextHandle();

    int getPixelFormat();

    void onDispose();

    boolean onInitialize();

    boolean onStart();

    void onStop();
}
