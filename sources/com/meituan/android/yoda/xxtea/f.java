package com.meituan.android.yoda.xxtea;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.UnsupportedEncodingException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;

    private static int a(int i, int i2, int i3, int i4, int i5, int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "545834d49a5135eeb3f5c111cd2527c7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "545834d49a5135eeb3f5c111cd2527c7")).intValue() : ((i ^ i2) + (iArr[(i4 & 3) ^ i5] ^ i3)) ^ (((i3 >>> 5) ^ (i2 << 2)) + ((i2 >>> 3) ^ (i3 << 4)));
    }

    private static byte[] b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "905bf75db09a079371999e2cd23c33b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "905bf75db09a079371999e2cd23c33b3");
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            byte[] bytes2 = str2.getBytes("UTF-8");
            Object[] objArr2 = {bytes, bytes2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c0928ef6fa7761dccc01191018d62bac", RobustBitConfig.DEFAULT_VALUE)) {
                return (byte[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c0928ef6fa7761dccc01191018d62bac");
            }
            if (bytes.length == 0) {
                return bytes;
            }
            int[] a2 = a(bytes, true);
            Object[] objArr3 = {bytes2};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "534e6eab62262b123c1ee767b0356cea", RobustBitConfig.DEFAULT_VALUE)) {
                bytes2 = (byte[]) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "534e6eab62262b123c1ee767b0356cea");
            } else if (bytes2.length != 16) {
                byte[] bArr = new byte[16];
                if (bytes2.length < 16) {
                    System.arraycopy(bytes2, 0, bArr, 0, bytes2.length);
                } else {
                    System.arraycopy(bytes2, 0, bArr, 0, 16);
                }
                bytes2 = bArr;
            }
            int[] a3 = a(bytes2, false);
            Object[] objArr4 = {a2, a3};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (!PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "a5f6473d298412c342b2253e948f0abf", RobustBitConfig.DEFAULT_VALUE)) {
                int length = a2.length - 1;
                if (length > 0) {
                    int i = (52 / (length + 1)) + 6;
                    int i2 = a2[length];
                    int i3 = 0;
                    while (true) {
                        int i4 = i - 1;
                        if (i <= 0) {
                            break;
                        }
                        int i5 = i3 - 1640531527;
                        int i6 = (i5 >>> 2) & 3;
                        int i7 = 0;
                        while (i7 < length) {
                            int i8 = i7 + 1;
                            i2 = a2[i7] + a(i5, a2[i8], i2, i7, i6, a3);
                            a2[i7] = i2;
                            i7 = i8;
                        }
                        i2 = a2[length] + a(i5, a2[0], i2, i7, i6, a3);
                        a2[length] = i2;
                        i = i4;
                        i3 = i5;
                    }
                }
            } else {
                a2 = (int[]) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "a5f6473d298412c342b2253e948f0abf");
            }
            Object[] objArr5 = {a2, (byte) 0};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "b903a7835ecd55a90affff16049f3730", RobustBitConfig.DEFAULT_VALUE)) {
                return (byte[]) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "b903a7835ecd55a90affff16049f3730");
            }
            int length2 = a2.length << 2;
            byte[] bArr2 = new byte[length2];
            for (int i9 = 0; i9 < length2; i9++) {
                bArr2[i9] = (byte) (a2[i9 >>> 2] >>> ((i9 & 3) << 3));
            }
            return bArr2;
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2f059c1d7ec375b02d148b32af1b7e3c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2f059c1d7ec375b02d148b32af1b7e3c");
        }
        byte[] b = b(str, str2);
        if (b == null) {
            return null;
        }
        return b.a(b);
    }

    private static int[] a(byte[] bArr, boolean z) {
        int[] iArr;
        Object[] objArr = {bArr, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "889a29afba6abe2e17c2de1e2c6135ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "889a29afba6abe2e17c2de1e2c6135ed");
        }
        int length = (bArr.length & 3) == 0 ? bArr.length >>> 2 : (bArr.length >>> 2) + 1;
        if (z) {
            iArr = new int[length + 1];
            iArr[length] = bArr.length;
        } else {
            iArr = new int[length];
        }
        int length2 = bArr.length;
        for (int i = 0; i < length2; i++) {
            int i2 = i >>> 2;
            iArr[i2] = iArr[i2] | ((bArr[i] & 255) << ((i & 3) << 3));
        }
        return iArr;
    }
}
