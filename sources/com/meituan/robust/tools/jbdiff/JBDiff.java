package com.meituan.robust.tools.jbdiff;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class JBDiff {
    private static final byte[] MAGIC_BYTES = {106, 98, 100, 105, 102, 102, 52, 48};

    private static final void split(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        int i4;
        int i5 = i;
        int i6 = i2;
        while (true) {
            if (i6 < 16) {
                int i7 = i5;
                while (true) {
                    int i8 = i5 + i6;
                    if (i7 >= i8) {
                        return;
                    }
                    int i9 = iArr2[iArr[i7] + i3];
                    int i10 = 1;
                    int i11 = 1;
                    while (true) {
                        int i12 = i7 + i10;
                        if (i12 >= i8) {
                            break;
                        }
                        if (iArr2[iArr[i12] + i3] < i9) {
                            i9 = iArr2[iArr[i12] + i3];
                            i11 = 0;
                        }
                        if (iArr2[iArr[i12] + i3] == i9) {
                            int i13 = i7 + i11;
                            int i14 = iArr[i13];
                            iArr[i13] = iArr[i12];
                            iArr[i12] = i14;
                            i11++;
                        }
                        i10++;
                    }
                    for (int i15 = 0; i15 < i11; i15++) {
                        iArr2[iArr[i7 + i15]] = (i7 + i11) - 1;
                    }
                    if (i11 == 1) {
                        iArr[i7] = -1;
                    }
                    i7 += i11;
                }
            } else {
                int i16 = iArr2[iArr[(i6 / 2) + i5] + i3];
                int i17 = i5;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    i4 = i5 + i6;
                    if (i17 >= i4) {
                        break;
                    }
                    if (iArr2[iArr[i17] + i3] < i16) {
                        i18++;
                    }
                    if (iArr2[iArr[i17] + i3] == i16) {
                        i19++;
                    }
                    i17++;
                }
                int i20 = i18 + i5;
                int i21 = i19 + i20;
                int i22 = i5;
                int i23 = 0;
                int i24 = 0;
                while (i22 < i20) {
                    if (iArr2[iArr[i22] + i3] < i16) {
                        i22++;
                    } else if (iArr2[iArr[i22] + i3] == i16) {
                        int i25 = iArr[i22];
                        int i26 = i20 + i23;
                        iArr[i22] = iArr[i26];
                        iArr[i26] = i25;
                        i23++;
                    } else {
                        int i27 = iArr[i22];
                        int i28 = i21 + i24;
                        iArr[i22] = iArr[i28];
                        iArr[i28] = i27;
                        i24++;
                    }
                }
                while (true) {
                    int i29 = i20 + i23;
                    if (i29 >= i21) {
                        break;
                    } else if (iArr2[iArr[i29] + i3] == i16) {
                        i23++;
                    } else {
                        int i30 = iArr[i29];
                        int i31 = i21 + i24;
                        iArr[i29] = iArr[i31];
                        iArr[i31] = i30;
                        i24++;
                    }
                }
                if (i20 > i5) {
                    split(iArr, iArr2, i5, i20 - i5, i3);
                }
                for (int i32 = 0; i32 < i21 - i20; i32++) {
                    iArr2[iArr[i20 + i32]] = i21 - 1;
                }
                if (i20 == i21 - 1) {
                    iArr[i20] = -1;
                }
                if (i4 <= i21) {
                    return;
                }
                i5 = i21;
                i6 = i4 - i21;
            }
        }
    }

    private static void qsufsort(int[] iArr, int[] iArr2, byte[] bArr, int i) {
        int i2;
        int i3;
        int[] iArr3 = new int[256];
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = 255 & bArr[i4];
            iArr3[i5] = iArr3[i5] + 1;
        }
        for (int i6 = 1; i6 < 256; i6++) {
            iArr3[i6] = iArr3[i6] + iArr3[i6 - 1];
        }
        for (int i7 = 255; i7 > 0; i7--) {
            iArr3[i7] = iArr3[i7 - 1];
        }
        iArr3[0] = 0;
        for (int i8 = 0; i8 < i; i8++) {
            int i9 = bArr[i8] & 255;
            int i10 = iArr3[i9] + 1;
            iArr3[i9] = i10;
            iArr[i10] = i8;
        }
        iArr[0] = i;
        for (int i11 = 0; i11 < i; i11++) {
            iArr2[i11] = iArr3[bArr[i11] & 255];
        }
        iArr2[i] = 0;
        for (int i12 = 1; i12 < 256; i12++) {
            if (iArr3[i12] == iArr3[i12 - 1] + 1) {
                iArr[iArr3[i12]] = -1;
            }
        }
        iArr[0] = -1;
        int i13 = 1;
        while (true) {
            i2 = i + 1;
            if (iArr[0] == (-i2)) {
                break;
            }
            int i14 = 0;
            while (true) {
                i3 = 0;
                while (i14 < i2) {
                    if (iArr[i14] < 0) {
                        i3 -= iArr[i14];
                        i14 -= iArr[i14];
                    } else {
                        if (i3 != 0) {
                            iArr[i14 - i3] = -i3;
                        }
                        int i15 = (iArr2[iArr[i14]] + 1) - i14;
                        split(iArr, iArr2, i14, i15, i13);
                        i14 += i15;
                    }
                }
                break;
            }
            if (i3 != 0) {
                iArr[i14 - i3] = -i3;
            }
            i13 += i13;
        }
        for (int i16 = 0; i16 < i2; i16++) {
            iArr[iArr2[i16]] = i16;
        }
    }

    private static final int matchlen(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int min = Math.min(i - i2, i3 - i4);
        for (int i5 = 0; i5 < min; i5++) {
            if (bArr[i2 + i5] != bArr2[i4 + i5]) {
                return i5;
            }
        }
        return min;
    }

    private static final int search(int[] iArr, byte[] bArr, int i, byte[] bArr2, int i2, int i3, int i4, int i5, IntByRef intByRef) {
        int i6 = i4;
        int i7 = i5;
        while (true) {
            int i8 = i7 - i6;
            if (i8 < 2) {
                break;
            }
            int i9 = (i8 / 2) + i6;
            if (Util.memcmp(bArr, i, iArr[i9], bArr2, i2, i3) < 0) {
                i6 = i9;
            } else {
                i7 = i9;
            }
        }
        int matchlen = matchlen(bArr, i, iArr[i6], bArr2, i2, i3);
        int matchlen2 = matchlen(bArr, i, iArr[i7], bArr2, i2, i3);
        if (matchlen > matchlen2) {
            intByRef.value = iArr[i6];
            return matchlen;
        }
        intByRef.value = iArr[i7];
        return matchlen2;
    }

    public static void bsdiff(File file, File file2, File file3) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file2));
        FileOutputStream fileOutputStream = new FileOutputStream(file3);
        fileOutputStream.write(bsdiff(bufferedInputStream, (int) file.length(), bufferedInputStream2, (int) file2.length()));
        fileOutputStream.close();
    }

    public static byte[] bsdiff(InputStream inputStream, int i, InputStream inputStream2, int i2) throws IOException {
        byte[] bArr = new byte[i];
        Util.readFromStream(inputStream, bArr, 0, i);
        inputStream.close();
        byte[] bArr2 = new byte[i2];
        Util.readFromStream(inputStream2, bArr2, 0, i2);
        inputStream2.close();
        return bsdiff(bArr, i, bArr2, i2);
    }

    public static byte[] bsdiff(byte[] bArr, int i, byte[] bArr2, int i2) throws IOException {
        int i3;
        IntByRef intByRef;
        DataOutputStream dataOutputStream;
        GZIPOutputStream gZIPOutputStream;
        long j;
        DataOutputStream dataOutputStream2;
        ByteArrayOutputStream byteArrayOutputStream;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = i;
        int i12 = i11 + 1;
        int[] iArr = new int[i12];
        qsufsort(iArr, new int[i12], bArr, i11);
        byte[] bArr3 = new byte[i2];
        byte[] bArr4 = new byte[i2];
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream3 = new DataOutputStream(byteArrayOutputStream2);
        dataOutputStream3.write(MAGIC_BYTES);
        dataOutputStream3.writeLong(-1L);
        dataOutputStream3.writeLong(-1L);
        long j2 = i2;
        dataOutputStream3.writeLong(j2);
        dataOutputStream3.flush();
        GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(dataOutputStream3);
        DataOutputStream dataOutputStream4 = new DataOutputStream(gZIPOutputStream2);
        IntByRef intByRef2 = new IntByRef();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i13 < i2) {
            int i20 = i13 + i14;
            int i21 = i20;
            int i22 = i14;
            int i23 = 0;
            while (true) {
                if (i20 >= i2) {
                    i3 = i20;
                    intByRef = intByRef2;
                    dataOutputStream = dataOutputStream4;
                    gZIPOutputStream = gZIPOutputStream2;
                    j = j2;
                    dataOutputStream2 = dataOutputStream3;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    i4 = i23;
                    i5 = i22;
                    break;
                }
                int i24 = i20;
                intByRef = intByRef2;
                dataOutputStream = dataOutputStream4;
                gZIPOutputStream = gZIPOutputStream2;
                j = j2;
                dataOutputStream2 = dataOutputStream3;
                byteArrayOutputStream = byteArrayOutputStream2;
                i5 = search(iArr, bArr, i, bArr2, i2, i24, 0, i, intByRef);
                i4 = i23;
                int i25 = i21;
                i3 = i24;
                while (i25 < i3 + i5) {
                    int i26 = i25 + i17;
                    if (i26 < i11 && bArr[i26] == bArr2[i25]) {
                        i4++;
                    }
                    i25++;
                }
                if ((i5 == i4 && i5 != 0) || i5 > i4 + 8) {
                    break;
                }
                int i27 = i3 + i17;
                if (i27 < i11 && bArr[i27] == bArr2[i3]) {
                    i4--;
                }
                i23 = i4;
                i22 = i5;
                i20 = i3 + 1;
                i21 = i25;
                intByRef2 = intByRef;
                dataOutputStream4 = dataOutputStream;
                gZIPOutputStream2 = gZIPOutputStream;
                j2 = j;
                dataOutputStream3 = dataOutputStream2;
                byteArrayOutputStream2 = byteArrayOutputStream;
            }
            if (i5 != i4 || i3 == i2) {
                int i28 = 0;
                int i29 = 0;
                int i30 = 0;
                int i31 = 0;
                while (true) {
                    int i32 = i18 + i28;
                    if (i32 >= i3 || (i10 = i19 + i28) >= i11) {
                        break;
                    }
                    if (bArr[i10] == bArr2[i32]) {
                        i29++;
                    }
                    i28++;
                    if ((i29 * 2) - i28 > (i30 * 2) - i31) {
                        i31 = i28;
                        i30 = i29;
                    }
                }
                if (i3 < i2) {
                    i6 = 0;
                    int i33 = 0;
                    int i34 = 0;
                    for (int i35 = 1; i3 >= i18 + i35 && intByRef.value >= i35; i35++) {
                        if (bArr[intByRef.value - i35] == bArr2[i3 - i35]) {
                            i33++;
                        }
                        if ((i33 * 2) - i35 > (i34 * 2) - i6) {
                            i6 = i35;
                            i34 = i33;
                        }
                    }
                } else {
                    i6 = 0;
                }
                int i36 = i18 + i31;
                int i37 = i3 - i6;
                if (i36 > i37) {
                    int i38 = i36 - i37;
                    i7 = i5;
                    int i39 = 0;
                    int i40 = 0;
                    int i41 = 0;
                    int i42 = 0;
                    while (i40 < i38) {
                        int i43 = i36;
                        if (bArr2[(i36 - i38) + i40] == bArr[((i19 + i31) - i38) + i40]) {
                            i42++;
                        }
                        if (bArr2[i37 + i40] == bArr[(intByRef.value - i6) + i40]) {
                            i42--;
                        }
                        int i44 = i42;
                        if (i44 > i39) {
                            i41 = i40 + 1;
                            i39 = i44;
                        }
                        i40++;
                        i42 = i44;
                        i36 = i43;
                    }
                    i31 += i41 - i38;
                    i6 -= i41;
                } else {
                    i7 = i5;
                }
                int i45 = 0;
                while (i45 < i31) {
                    int i46 = i15;
                    bArr3[i46 + i45] = (byte) (bArr2[i18 + i45] - bArr[i19 + i45]);
                    i45++;
                    i15 = i46;
                }
                int i47 = i15;
                int i48 = 0;
                while (true) {
                    i8 = i3 - i6;
                    int i49 = i18 + i31;
                    i9 = i8 - i49;
                    if (i48 >= i9) {
                        break;
                    }
                    int i50 = i16;
                    bArr4[i50 + i48] = bArr2[i49 + i48];
                    i48++;
                    i16 = i50;
                }
                i15 = i47 + i31;
                i16 += i9;
                DataOutputStream dataOutputStream5 = dataOutputStream;
                dataOutputStream5.writeInt(i31);
                dataOutputStream5.writeInt(i9);
                dataOutputStream5.writeInt((intByRef.value - i6) - (i19 + i31));
                i19 = intByRef.value - i6;
                i17 = intByRef.value - i3;
                dataOutputStream4 = dataOutputStream5;
                i13 = i3;
                i18 = i8;
                intByRef2 = intByRef;
                gZIPOutputStream2 = gZIPOutputStream;
                j2 = j;
                dataOutputStream3 = dataOutputStream2;
                byteArrayOutputStream2 = byteArrayOutputStream;
                i14 = i7;
                i11 = i;
            } else {
                i14 = i5;
                i13 = i3;
                intByRef2 = intByRef;
                dataOutputStream4 = dataOutputStream;
                gZIPOutputStream2 = gZIPOutputStream;
                j2 = j;
                dataOutputStream3 = dataOutputStream2;
                byteArrayOutputStream2 = byteArrayOutputStream;
            }
        }
        DataOutputStream dataOutputStream6 = dataOutputStream3;
        dataOutputStream4.flush();
        gZIPOutputStream2.finish();
        int size = dataOutputStream6.size() - 32;
        GZIPOutputStream gZIPOutputStream3 = new GZIPOutputStream(dataOutputStream6);
        gZIPOutputStream3.write(bArr3, 0, i15);
        gZIPOutputStream3.finish();
        gZIPOutputStream3.flush();
        GZIPOutputStream gZIPOutputStream4 = new GZIPOutputStream(dataOutputStream6);
        gZIPOutputStream4.write(bArr4, 0, i16);
        gZIPOutputStream4.finish();
        gZIPOutputStream4.flush();
        dataOutputStream6.close();
        ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream(32);
        DataOutputStream dataOutputStream7 = new DataOutputStream(byteArrayOutputStream3);
        dataOutputStream7.write(MAGIC_BYTES);
        dataOutputStream7.writeLong(size);
        dataOutputStream7.writeLong((dataOutputStream6.size() - size) - 32);
        dataOutputStream7.writeLong(j2);
        dataOutputStream7.close();
        byte[] byteArray = byteArrayOutputStream2.toByteArray();
        byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
        System.arraycopy(byteArray2, 0, byteArray, 0, byteArray2.length);
        return byteArray;
    }

    public static void main(String[] strArr) throws IOException {
        if (strArr.length != 3) {
            System.err.println("usage example: java -Xmx200m ie.wombat.jbdiff.JBDiff oldfile newfile patchfile\n");
        } else {
            bsdiff(new File(strArr[0]), new File(strArr[1]), new File(strArr[2]));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class IntByRef {
        private int value;

        private IntByRef() {
        }
    }
}
