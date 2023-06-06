package com.meituan.robust.tools.jbdiff;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class Util {
    public static final int HEADER_SIZE = 32;

    public static final int memcmp(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int i5 = i - i2;
        int i6 = i3 - i4;
        if (i5 > i6) {
            i5 = i6;
        }
        for (int i7 = 0; i7 < i5; i7++) {
            int i8 = i7 + i2;
            int i9 = i7 + i4;
            if (bArr[i8] != bArr2[i9]) {
                return bArr[i8] < bArr2[i9] ? -1 : 1;
            }
        }
        return 0;
    }

    public static final void readFromStream(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i + i3, i2 - i3);
            if (read < 0) {
                throw new IOException("Could not read expected number of bytes.");
            }
            i3 += read;
        }
    }
}
