package io.agora.rtc;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface IAudioFrameObserver {
    boolean onPlaybackFrame(byte[] bArr, int i, int i2, int i3, int i4);

    boolean onRecordFrame(byte[] bArr, int i, int i2, int i3, int i4);
}
