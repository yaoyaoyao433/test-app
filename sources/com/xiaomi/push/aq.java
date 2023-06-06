package com.xiaomi.push;

import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* loaded from: classes6.dex */
public final class aq {
    public static String b(String str) {
        return a(str).subSequence(8, 24).toString();
    }

    public static byte[] c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return messageDigest.digest();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            StringBuffer stringBuffer = new StringBuffer();
            messageDigest.update(str.getBytes(), 0, str.length());
            byte[] digest = messageDigest.digest();
            for (int i = 0; i < digest.length; i++) {
                byte b = digest[i];
                int i2 = (b & Byte.MAX_VALUE) + (b < 0 ? 128 : 0);
                StringBuilder sb = new StringBuilder();
                sb.append(i2 < 16 ? "0" : "");
                sb.append(Integer.toHexString(i2).toLowerCase());
                stringBuffer.append(sb.toString());
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
