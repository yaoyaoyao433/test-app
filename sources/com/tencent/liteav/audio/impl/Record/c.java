package com.tencent.liteav.audio.impl.Record;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface c {
    void onAudioRecordError(int i, String str);

    void onAudioRecordPCM(byte[] bArr, int i, long j);

    void onAudioRecordStart();

    void onAudioRecordStop();
}
