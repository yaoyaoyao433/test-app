package com.tencent.liteav.videodecoder;

import com.tencent.liteav.basic.structs.TXSVideoFrame;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface f {
    void onDecodeFailed(int i);

    void onDecodeFrame(TXSVideoFrame tXSVideoFrame, int i, int i2, long j, long j2, int i3);

    void onVideoSizeChange(int i, int i2);
}
