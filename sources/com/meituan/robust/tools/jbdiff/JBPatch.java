package com.meituan.robust.tools.jbdiff;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class JBPatch {
    public static void main(String[] strArr) throws IOException {
        if (strArr.length != 3) {
            System.err.println("usage example: java -Xmx200m ie.wombat.jbdiff.JBPatch oldfile newfile patchfile");
        }
        bspatch(new File(strArr[0]), new File(strArr[1]), new File(strArr[2]));
    }

    public static void bspatch(File file, File file2, File file3) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        byte[] bArr = new byte[(int) file3.length()];
        Util.readFromStream(new FileInputStream(file3), bArr, 0, bArr.length);
        byte[] bspatch = bspatch(bufferedInputStream, (int) file.length(), bArr);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        fileOutputStream.write(bspatch);
        fileOutputStream.close();
    }

    public static byte[] bspatch(InputStream inputStream, int i, byte[] bArr) throws IOException {
        byte[] bArr2 = new byte[i];
        Util.readFromStream(inputStream, bArr2, 0, i);
        inputStream.close();
        return bspatch(bArr2, i, bArr);
    }

    public static byte[] bspatch(byte[] bArr, int i, byte[] bArr2) throws IOException {
        return bspatch(bArr, i, bArr2, bArr2.length);
    }

    public static byte[] bspatch(byte[] bArr, int i, byte[] bArr2, int i2) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr2, 0, i2));
        dataInputStream.skip(8L);
        long readLong = dataInputStream.readLong();
        long readLong2 = dataInputStream.readLong();
        int readLong3 = (int) dataInputStream.readLong();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2, 0, i2);
        byteArrayInputStream.skip(32L);
        DataInputStream dataInputStream2 = new DataInputStream(new GZIPInputStream(byteArrayInputStream));
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr2, 0, i2);
        byteArrayInputStream2.skip(readLong + 32);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream2);
        ByteArrayInputStream byteArrayInputStream3 = new ByteArrayInputStream(bArr2, 0, i2);
        byteArrayInputStream3.skip(readLong2 + readLong + 32);
        GZIPInputStream gZIPInputStream2 = new GZIPInputStream(byteArrayInputStream3);
        byte[] bArr3 = new byte[readLong3];
        int[] iArr = new int[3];
        int i3 = 0;
        int i4 = 0;
        while (i3 < readLong3) {
            for (int i5 = 0; i5 <= 2; i5++) {
                iArr[i5] = dataInputStream2.readInt();
            }
            if (iArr[0] + i3 > readLong3) {
                throw new IOException("Corrupt patch.");
            }
            Util.readFromStream(gZIPInputStream, bArr3, i3, iArr[0]);
            for (int i6 = 0; i6 < iArr[0]; i6++) {
                int i7 = i4 + i6;
                if (i7 >= 0 && i7 < i) {
                    int i8 = i3 + i6;
                    bArr3[i8] = (byte) (bArr3[i8] + bArr[i7]);
                }
            }
            int i9 = i3 + iArr[0];
            int i10 = i4 + iArr[0];
            if (iArr[1] + i9 > readLong3) {
                throw new IOException("Corrupt patch.");
            }
            Util.readFromStream(gZIPInputStream2, bArr3, i9, iArr[1]);
            i3 = i9 + iArr[1];
            i4 = i10 + iArr[2];
        }
        dataInputStream2.close();
        gZIPInputStream.close();
        gZIPInputStream2.close();
        dataInputStream.close();
        return bArr3;
    }
}
