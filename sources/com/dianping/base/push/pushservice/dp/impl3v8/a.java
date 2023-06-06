package com.dianping.base.push.pushservice.dp.impl3v8;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final String b;
    private static final String c;
    private static final byte[] d;
    private static final byte[] e;

    static {
        String str = "AES/CBC/NoPadding";
        b = str;
        c = str.substring(0, 3);
        byte[] bArr = {92, 115, 116, 117, 112, 113, 6, 112, 112, 3, 3, 4, 6, 118, 0, 112};
        byte b2 = 24;
        for (int i = 0; i < 16; i++) {
            b2 = (byte) (b2 ^ (bArr[i] & 255));
            bArr[i] = b2;
        }
        d = bArr;
        byte[] bArr2 = {0, 118, 122, 10, 3, 116, 124, 10, 5, 117, 6, 5, 3, 4, 2, 37};
        byte b3 = 97;
        for (int i2 = 15; i2 >= 0; i2--) {
            b3 = (byte) (b3 ^ (bArr2[i2] & 255));
            bArr2[i2] = b3;
        }
        e = bArr2;
    }

    public static byte[] a(byte[] bArr) throws Exception {
        byte[] bArr2 = bArr;
        Object[] objArr = {bArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc6aec0101082cf5a12bae93a2f1a7ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc6aec0101082cf5a12bae93a2f1a7ad");
        }
        Object[] objArr2 = {bArr2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fa02e472f5a42f2801d3e41a315cdb6d", RobustBitConfig.DEFAULT_VALUE)) {
            bArr2 = (byte[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fa02e472f5a42f2801d3e41a315cdb6d");
        } else if (bArr2.length % 16 != 0) {
            byte[] bArr3 = new byte[bArr2.length + (16 - (bArr2.length % 16))];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            bArr2 = bArr3;
        }
        return a(bArr2, d, 1);
    }

    public static byte[] b(byte[] bArr) throws Exception {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "01179fa081184b3a7c2dbd64cb38c328", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "01179fa081184b3a7c2dbd64cb38c328");
        }
        byte[] a2 = a(bArr, d, 2);
        int i = 0;
        for (int length = a2.length - 1; length >= 0 && a2[length] == 0; length--) {
            i++;
        }
        if (i > 0) {
            byte[] bArr2 = new byte[a2.length - i];
            System.arraycopy(a2, 0, bArr2, 0, bArr2.length);
            return bArr2;
        }
        return a2;
    }

    private static byte[] a(byte[] bArr, byte[] bArr2, int i) throws Exception {
        Object[] objArr = {bArr, bArr2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "870281a923590ff5723613704f15ca6f", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "870281a923590ff5723613704f15ca6f");
        }
        Cipher cipher = Cipher.getInstance(b);
        cipher.init(i, new SecretKeySpec(bArr2, c), new IvParameterSpec(e));
        return cipher.doFinal(bArr);
    }
}
