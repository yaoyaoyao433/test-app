package com.huawei.secure.android.common.encrypt.hash;

import android.text.TextUtils;
import com.huawei.secure.android.common.encrypt.utils.c;
import com.huawei.secure.android.common.encrypt.utils.e;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    private static final String a = "b";
    private static final String[] b = {"SHA-256", "SHA-384", "SHA-512"};

    private b() {
    }

    public static String a(String str) {
        return a(str, "SHA-256");
    }

    private static String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            e.a(a, "content or algorithm is null.");
            return "";
        }
        String[] strArr = b;
        int length = strArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (strArr[i].equals(str2)) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            e.a(a, "algorithm is not safe or legal");
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            messageDigest.update(str.getBytes("UTF-8"));
            return c.a(messageDigest.digest());
        } catch (UnsupportedEncodingException unused) {
            e.a(a, "Error in generate SHA UnsupportedEncodingException");
            return "";
        } catch (NoSuchAlgorithmException unused2) {
            e.a(a, "Error in generate SHA NoSuchAlgorithmException");
            return "";
        }
    }
}
