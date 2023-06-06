package com.tencent.ijk.media.player.misc;

import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface IMediaDataSource {
    void close() throws IOException;

    long getSize() throws IOException;

    int readAt(long j, byte[] bArr, int i, int i2) throws IOException;
}
