package com.xiaomi.push;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.regex.Pattern;
/* loaded from: classes6.dex */
public final class ar {
    public static String a(int i) {
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(random.nextInt(62)));
        }
        return stringBuffer.toString();
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(c(str));
            return String.format("%1$032X", new BigInteger(1, messageDigest.digest()));
        } catch (NoSuchAlgorithmException unused) {
            return str;
        }
    }

    public static String a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        if (length < 3) {
            i = length / 3;
            if (i <= 1) {
                i = 1;
            }
            if (i > 3) {
                i = 3;
            }
        }
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (i3 % i == 0) {
                sb.append("*");
            } else {
                sb.append(str.charAt(i2));
            }
            i2 = i3;
        }
        return sb.toString();
    }

    public static String a(Collection<?> collection, String str) {
        if (collection == null) {
            return null;
        }
        return a(collection.iterator(), str);
    }

    private static String a(Iterator<?> it, String str) {
        if (it == null) {
            return null;
        }
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                StringBuffer stringBuffer = new StringBuffer(256);
                if (next != null) {
                    stringBuffer.append(next);
                }
                while (it.hasNext()) {
                    if (str != null) {
                        stringBuffer.append(str);
                    }
                    Object next2 = it.next();
                    if (next2 != null) {
                        stringBuffer.append(next2);
                    }
                }
                return stringBuffer.toString();
            }
            return next.toString();
        }
        return "";
    }

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr);
        }
    }

    public static String b(String str) {
        if (str != null) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                messageDigest.update(c(str));
                return String.format("%1$032X", new BigInteger(1, messageDigest.digest()));
            } catch (NoSuchAlgorithmException unused) {
                return str;
            }
        }
        return null;
    }

    public static byte[] c(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }

    public static boolean d(String str) {
        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt < 0 || charAt > 127) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("^[A-Za-z0-9]+$").matcher(str).matches();
    }

    public static boolean f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char charAt = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != charAt) {
                return false;
            }
        }
        return true;
    }
}
