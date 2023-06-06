package com.hhmedic.android.sdk.base.utils.secret;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHSecretUtils {
    public static String getSHA1(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            return get16String(messageDigest.digest());
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String get16String(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }
}
