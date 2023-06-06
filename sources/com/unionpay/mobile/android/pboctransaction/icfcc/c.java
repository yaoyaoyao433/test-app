package com.unionpay.mobile.android.pboctransaction.icfcc;

import com.unionpay.mobile.android.pboctransaction.e;
/* loaded from: classes6.dex */
public final class c {
    public static String a(String str, String str2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (str == null) {
            return null;
        }
        byte[] a = e.a(str);
        int i11 = 0;
        while (i11 < a.length) {
            int i12 = 1;
            int i13 = ((byte) (a[i11] & 31)) == 31 ? 2 : 1;
            byte[] bArr = new byte[i13];
            System.arraycopy(a, i11, bArr, 0, i13);
            if (e.a(bArr, i13).compareToIgnoreCase(str2) == 0) {
                int i14 = i11 + i13;
                if (((byte) (a[i14] & 128)) != Byte.MIN_VALUE) {
                    i4 = a[i14];
                } else {
                    i12 = 1 + (a[i14] & 127);
                    if (i12 != 2) {
                        if (i12 == 3) {
                            i2 = (a[i14 + 1] & 255) << 8;
                            i3 = a[i14 + 2];
                        } else if (i12 != 4) {
                            i = 0;
                            byte[] bArr2 = new byte[i];
                            System.arraycopy(a, i14 + i12, bArr2, 0, i);
                            return e.a(bArr2, i);
                        } else {
                            i2 = ((a[i14 + 1] & 255) << 16) | ((a[i14 + 2] & 255) << 8);
                            i3 = a[i14 + 3];
                        }
                        i = i2 | (i3 & 255);
                        byte[] bArr22 = new byte[i];
                        System.arraycopy(a, i14 + i12, bArr22, 0, i);
                        return e.a(bArr22, i);
                    }
                    i4 = a[i14 + 1];
                }
                i = i4 & 255;
                byte[] bArr222 = new byte[i];
                System.arraycopy(a, i14 + i12, bArr222, 0, i);
                return e.a(bArr222, i);
            }
            if ((a[i11] & 32) == 32) {
                i5 = i11 + i13;
                if (i5 < a.length && ((byte) (a[i5] & 128)) == Byte.MIN_VALUE) {
                    i12 = 1 + (a[i5] & 127);
                }
            } else {
                i5 = i11 + i13;
                if (i5 >= a.length || ((byte) (a[i5] & 128)) != 0) {
                    i12 = i5 < a.length ? (a[i5] & 127) + 1 : 0;
                    if (i12 != 2 || (i9 = i5 + 1) >= a.length) {
                        i6 = (i12 != 3 || (i8 = i5 + 2) >= a.length) ? (i12 != 4 || (i7 = i5 + 2) >= a.length) ? 0 : ((a[i7] & 255) << 8) | ((a[i5 + 1] & 255) << 16) | (a[i5 + 3] & 255) : (a[i8] & 255) | ((a[i5 + 1] & 255) << 8);
                        i12 += i6;
                    } else {
                        i10 = a[i9];
                    }
                } else {
                    i10 = a[i5];
                }
                i6 = i10 & 255;
                i12 += i6;
            }
            i11 = i5 + i12;
        }
        return null;
    }
}
