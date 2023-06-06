package com.google.archivepatcher.applier.bsdiff;

import com.google.archivepatcher.applier.g;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(RandomAccessFile randomAccessFile, OutputStream outputStream, InputStream inputStream) throws g, IOException {
        long j;
        byte[] bArr;
        InputStream inputStream2;
        byte[] bArr2 = new byte[16];
        try {
            a(inputStream, bArr2, 0, bArr2.length);
            if (!"ENDSLEY/BSDIFF43".equals(new String(bArr2, 0, bArr2.length, "US-ASCII"))) {
                throw new g("bad signature");
            }
            long length = randomAccessFile.length();
            if (length > 2147483647L) {
                throw new g("bad oldSize");
            }
            long a = a(inputStream);
            if (a < 0 || a > 2147483647L) {
                throw new g("bad newSize");
            }
            byte[] bArr3 = new byte[51200];
            byte[] bArr4 = new byte[51200];
            long j2 = 0;
            long j3 = 0;
            while (j2 < a) {
                long a2 = a(inputStream);
                byte[] bArr5 = bArr4;
                long a3 = a(inputStream);
                long a4 = a(inputStream);
                int i = (a2 > 0L ? 1 : (a2 == 0L ? 0 : -1));
                if (i < 0 || a2 > 2147483647L) {
                    throw new g("bad diffSegmentLength");
                }
                int i2 = (a3 > 0L ? 1 : (a3 == 0L ? 0 : -1));
                if (i2 < 0 || a3 > 2147483647L) {
                    throw new g("bad copySegmentLength");
                }
                if (a4 < -2147483648L || a4 > 2147483647L) {
                    throw new g("bad offsetToNextInput");
                }
                long j4 = j2 + a2 + a3;
                if (j4 > a) {
                    throw new g("expectedFinalNewDataBytesWritten too large");
                }
                long j5 = j3 + a2 + a4;
                if (j5 > length) {
                    throw new g("expectedFinalOldDataOffset too large");
                }
                if (j5 < 0) {
                    throw new g("expectedFinalOldDataOffset is negative");
                }
                randomAccessFile.seek(j3);
                if (i > 0) {
                    int i3 = (int) a2;
                    j = a3;
                    bArr = bArr5;
                    a(i3, inputStream, randomAccessFile, outputStream, bArr3, bArr);
                } else {
                    j = a3;
                    bArr = bArr5;
                }
                if (i2 > 0) {
                    inputStream2 = inputStream;
                    a(inputStream2, outputStream, bArr3, (int) j);
                } else {
                    inputStream2 = inputStream;
                }
                bArr4 = bArr;
                j2 = j4;
                j3 = j5;
            }
        } catch (IOException unused) {
            throw new g("truncated signature");
        }
    }

    private static void a(int i, InputStream inputStream, RandomAccessFile randomAccessFile, OutputStream outputStream, byte[] bArr, byte[] bArr2) throws IOException {
        while (i > 0) {
            int min = Math.min(i, 51200);
            randomAccessFile.readFully(bArr, 0, min);
            a(inputStream, bArr2, 0, min);
            for (int i2 = 0; i2 < min; i2++) {
                bArr[i2] = (byte) (bArr[i2] + bArr2[i2]);
            }
            outputStream.write(bArr, 0, min);
            i -= min;
        }
    }

    private static long a(InputStream inputStream) throws g, IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 8) {
            j |= inputStream.read() << i;
        }
        if (j != Long.MIN_VALUE) {
            return (Long.MIN_VALUE & j) != 0 ? -(Long.MAX_VALUE & j) : j;
        }
        throw new g("read negative zero");
    }

    private static void a(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3 + 0, i2 - i3);
            if (read == -1) {
                throw new IOException("truncated input stream");
            }
            i3 += read;
        }
    }

    private static void a(InputStream inputStream, OutputStream outputStream, byte[] bArr, int i) throws IOException {
        while (i > 0) {
            int min = Math.min(51200, i);
            a(inputStream, bArr, 0, min);
            outputStream.write(bArr, 0, min);
            i -= min;
        }
    }
}
