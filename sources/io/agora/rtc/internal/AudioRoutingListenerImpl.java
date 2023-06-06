package io.agora.rtc.internal;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class AudioRoutingListenerImpl implements AudioRoutingListener {
    private long mAudioRoutingNativeHandle;

    native void nativeAudioRoutingChanged(long j, int i);

    native void nativeAudioRoutingError(long j, int i);

    AudioRoutingListenerImpl(long j) {
        this.mAudioRoutingNativeHandle = 0L;
        this.mAudioRoutingNativeHandle = j;
    }

    @Override // io.agora.rtc.internal.AudioRoutingListener
    public void onAudioRoutingChanged(int i) {
        synchronized (this) {
            nativeAudioRoutingChanged(this.mAudioRoutingNativeHandle, i);
        }
    }

    @Override // io.agora.rtc.internal.AudioRoutingListener
    public void onAudioRoutingError(int i) {
        synchronized (this) {
            nativeAudioRoutingError(this.mAudioRoutingNativeHandle, i);
        }
    }

    @Override // io.agora.rtc.internal.AudioRoutingListener
    public void onAudioRoutingDestroyed() {
        synchronized (this) {
            this.mAudioRoutingNativeHandle = 0L;
        }
    }
}
