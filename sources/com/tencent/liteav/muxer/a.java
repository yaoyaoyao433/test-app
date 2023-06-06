package com.tencent.liteav.muxer;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface a {
    int a();

    void a(int i);

    void a(MediaFormat mediaFormat);

    void a(String str);

    void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    void a(byte[] bArr, int i, int i2, long j, int i3);

    int b();

    void b(MediaFormat mediaFormat);

    void b(byte[] bArr, int i, int i2, long j, int i3);

    boolean c();

    boolean d();
}
