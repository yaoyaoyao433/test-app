package com.huawei.hms.opendevice;

import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HEX;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class r {
    public static String a(String str, String str2) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            if (TextUtils.isEmpty(str2)) {
                str2 = "SHA-256";
            }
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            messageDigest.update(bytes);
            return HEX.encodeHexString(messageDigest.digest(), false);
        } catch (UnsupportedEncodingException unused) {
            HMSLog.e("SHACoder", "trans failed .");
            return null;
        } catch (NoSuchAlgorithmException unused2) {
            HMSLog.e("SHACoder", "encrypt failed .");
            return null;
        }
    }
}
