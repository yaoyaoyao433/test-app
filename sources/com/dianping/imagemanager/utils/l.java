package com.dianping.imagemanager.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class l {
    public static ChangeQuickRedirect a;
    protected static char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(String str) {
        MessageDigest messageDigest;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8a6b410b96768ae81511a66e529175f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8a6b410b96768ae81511a66e529175f2");
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
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "76b64d72f1978ae327d7edc9ceddb02a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "76b64d72f1978ae327d7edc9ceddb02a");
        }
        int length = digest.length;
        int i = 2;
        Object[] objArr3 = {digest, 0, Integer.valueOf(length)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "e083e5a81f08ff97cb2e578c4e64c71e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "e083e5a81f08ff97cb2e578c4e64c71e");
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
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "a013dc63591682ad467e41c1ac58c440", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "a013dc63591682ad467e41c1ac58c440");
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
