package com.tencent.liteav.audio;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface g {
    void onRecordEncData(byte[] bArr, long j, int i, int i2, int i3);

    void onRecordError(int i, String str);

    void onRecordPcmData(byte[] bArr, long j, int i, int i2, int i3);

    void onRecordRawPcmData(byte[] bArr, long j, int i, int i2, int i3, boolean z);
}
