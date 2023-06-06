package com.tencent.liteav.videodecoder;

import android.view.Surface;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface b {
    int GetDecodeCost();

    int config(Surface surface);

    void decode(TXSNALPacket tXSNALPacket);

    void enableLimitDecCache(boolean z);

    boolean isHevc();

    void setListener(f fVar);

    void setNotifyListener(WeakReference<com.tencent.liteav.basic.c.b> weakReference);

    int start(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z, boolean z2);

    void stop();
}
