package com.google.zxing.qrcode.encoder;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(byte[] bArr, int i, int i2) {
        while (i < i2) {
            if (i >= 0 && i < bArr.length && bArr[i] == 1) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(byte[][] bArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (i2 >= 0 && i2 < bArr.length && bArr[i2][i] == 1) {
                return false;
            }
            i2++;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(b bVar, boolean z) {
        int i;
        int i2;
        if (z) {
            i = bVar.c;
        } else {
            i = bVar.b;
        }
        if (z) {
            i2 = bVar.b;
        } else {
            i2 = bVar.c;
        }
        byte[][] bArr = bVar.a;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3;
            int i6 = 0;
            byte b = -1;
            for (int i7 = 0; i7 < i2; i7++) {
                byte b2 = z ? bArr[i4][i7] : bArr[i7][i4];
                if (b2 == b) {
                    i6++;
                } else {
                    if (i6 >= 5) {
                        i5 += (i6 - 5) + 3;
                    }
                    i6 = 1;
                    b = b2;
                }
            }
            if (i6 >= 5) {
                i5 += (i6 - 5) + 3;
            }
            i3 = i5;
        }
        return i3;
    }
}
