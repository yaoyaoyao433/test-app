package com.sankuai.xm.log.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static byte[] a(byte[] bArr, int i) {
        Object[] objArr = {bArr, 256};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ea1fe19bcd5303df4c5372c42c7fb3a", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ea1fe19bcd5303df4c5372c42c7fb3a");
        }
        if (bArr == null) {
            return null;
        }
        try {
            return new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec("sdk".toCharArray(), bArr, 1000, 256)).getEncoded(), "AES").getEncoded();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
