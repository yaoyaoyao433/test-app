package com.tencent.liteav.videoencoder;

import android.media.MediaFormat;
import com.tencent.liteav.basic.structs.TXSNALPacket;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface d {
    void onEncodeDataIn(int i);

    void onEncodeFinished(int i, long j, long j2);

    void onEncodeFormat(MediaFormat mediaFormat);

    void onEncodeNAL(TXSNALPacket tXSNALPacket, int i);

    void onRestartEncoder(int i);
}
