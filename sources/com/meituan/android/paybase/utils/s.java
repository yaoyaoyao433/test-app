package com.meituan.android.paybase.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class s {
    public static ChangeQuickRedirect a;
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(String str) {
        MessageDigest messageDigest;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f7695f8cde68b12652168491c421e171", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f7695f8cde68b12652168491c421e171");
        }
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            messageDigest = null;
        }
        if (messageDigest == null) {
            return null;
        }
        messageDigest.update(str.getBytes());
        byte[] digest = messageDigest.digest();
        Object[] objArr2 = {digest};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a0d7484cf4c4a4671dcaf685b223242c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a0d7484cf4c4a4671dcaf685b223242c");
        }
        int length = digest.length;
        int i = 2;
        Object[] objArr3 = {digest, 0, Integer.valueOf(length)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "2e61f4de806d977b51bf682aa8273923", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "2e61f4de806d977b51bf682aa8273923");
        }
        StringBuffer stringBuffer = new StringBuffer(length * 2);
        int i2 = length + 0;
        int i3 = 0;
        while (i3 < i2) {
            byte b2 = digest[i3];
            Object[] objArr4 = new Object[i];
            objArr4[0] = Byte.valueOf(b2);
            objArr4[1] = stringBuffer;
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "a2cade02a303170a2fdfc1d014c4862f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "a2cade02a303170a2fdfc1d014c4862f");
            } else {
                char c = b[(b2 & 240) >> 4];
                char c2 = b[b2 & 15];
                stringBuffer.append(c);
                stringBuffer.append(c2);
            }
            i3++;
            i = 2;
        }
        return stringBuffer.toString();
    }
}
