package io.socket.engineio.parser;

import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class a {
    public static byte[] a(byte[][] bArr) {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            i += bArr2.length;
        }
        if (bArr.length == 0) {
            return new byte[0];
        }
        if (bArr.length == 1) {
            return bArr[0];
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        for (byte[] bArr3 : bArr) {
            allocate.put(bArr3);
        }
        return allocate.array();
    }
}
