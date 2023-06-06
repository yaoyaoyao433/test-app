package com.hhmedic.android.sdk.base.utils.secret;

import java.security.MessageDigest;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHCheckSumBuilder {
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String getCheckSum(String str, String str2, String str3) {
        return encode("sha1", str + str2 + str3);
    }

    private static String encode(String str, String str2) {
        if (str2 == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(str2.getBytes());
            return getFormattedText(messageDigest.digest());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static String getFormattedText(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length * 2);
        for (int i = 0; i < length; i++) {
            sb.append(HEX_DIGITS[(bArr[i] >> 4) & 15]);
            sb.append(HEX_DIGITS[bArr[i] & 15]);
        }
        return sb.toString();
    }
}
