package com.unionpay.mobile.android.pboctransaction.samsung;

import android.text.TextUtils;
import java.security.PrivateKey;
import javax.crypto.Cipher;
/* loaded from: classes6.dex */
public final class a {
    public static String a(PrivateKey privateKey, String str) {
        if (TextUtils.isEmpty(str) || privateKey == null) {
            return "";
        }
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            byte[] bArr = new byte[245];
            System.arraycopy(str.getBytes(), 0, bArr, 0, str.getBytes().length);
            cipher.init(1, privateKey);
            return com.unionpay.mobile.android.pboctransaction.e.a(cipher.doFinal(bArr));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
