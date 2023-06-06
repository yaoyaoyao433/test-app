package com.sankuai.eh.component.service.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(String str) {
        MessageDigest messageDigest;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f236862387032fd59f842aa9d5490ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f236862387032fd59f842aa9d5490ce");
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
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "062330eec374a22dad574e14b88fe43b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "062330eec374a22dad574e14b88fe43b");
        }
        int length = digest.length;
        int i = 2;
        Object[] objArr3 = {digest, 0, Integer.valueOf(length)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "36cf844fbff3573e9888794e1c4ae2b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "36cf844fbff3573e9888794e1c4ae2b4");
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
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "da6b42cb365d812fa69be26bc82b24ff", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "da6b42cb365d812fa69be26bc82b24ff");
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

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3205ee7032e13d84b9278e35e0787fff", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3205ee7032e13d84b9278e35e0787fff");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String a2 = e.a(str);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        return a(a2);
    }
}
