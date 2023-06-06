package com.tencent.ijk.media.player.misc;

import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface IAndroidIO {
    int close() throws IOException;

    int open(String str) throws IOException;

    int read(byte[] bArr, int i) throws IOException;

    long seek(long j, int i) throws IOException;
}
