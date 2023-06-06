package com.meituan.dio.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;

    public static byte[] a(byte[] bArr, int i, int i2, byte b) {
        int i3 = 0;
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e44f97ce3fb98cb79d8b3579df1e33a", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e44f97ce3fb98cb79d8b3579df1e33a");
        }
        if (bArr == null) {
            return null;
        }
        if (i2 <= 0 || i >= bArr.length) {
            return bArr;
        }
        if (i < 0) {
            i = 0;
        }
        if (i + i2 > bArr.length) {
            i2 = bArr.length - i;
        }
        int i4 = i2 / 8;
        int i5 = i;
        while (i3 < i4) {
            bArr[i5] = (byte) (bArr[i5] ^ b);
            int i6 = i5 + 1;
            bArr[i6] = (byte) (bArr[i6] ^ b);
            int i7 = i5 + 2;
            bArr[i7] = (byte) (bArr[i7] ^ b);
            int i8 = i5 + 3;
            bArr[i8] = (byte) (bArr[i8] ^ b);
            int i9 = i5 + 4;
            bArr[i9] = (byte) (bArr[i9] ^ b);
            int i10 = i5 + 5;
            bArr[i10] = (byte) (bArr[i10] ^ b);
            int i11 = i5 + 6;
            bArr[i11] = (byte) (bArr[i11] ^ b);
            int i12 = i5 + 7;
            bArr[i12] = (byte) (bArr[i12] ^ b);
            i3++;
            i5 += 8;
        }
        int i13 = i + i2;
        while (i5 < i13) {
            bArr[i5] = (byte) (bArr[i5] ^ b);
            i5++;
        }
        return bArr;
    }
}
