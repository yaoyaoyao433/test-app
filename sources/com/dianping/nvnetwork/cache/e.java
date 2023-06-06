package com.dianping.nvnetwork.cache;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6da7862742f7f42ea6200d523ccd3069", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6da7862742f7f42ea6200d523ccd3069");
        }
        if (str == null) {
            return null;
        }
        return a(str.getBytes());
    }

    public static String a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3ab8f15060aed3b2fea5ff7a74ee697", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3ab8f15060aed3b2fea5ff7a74ee697");
        }
        if (bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer("");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            for (int i = 0; i < digest.length; i++) {
                int i2 = digest[i];
                if (i2 < 0) {
                    i2 += 256;
                }
                if (i2 < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(i2));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
