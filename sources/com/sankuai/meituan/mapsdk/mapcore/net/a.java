package com.sankuai.meituan.mapsdk.mapcore.net;

import android.text.TextUtils;
import android.util.Base64;
import com.meituan.android.common.unionid.oneid.util.AESUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    private static byte[] b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d62d180a7429668827cf5fbccdc7620e", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d62d180a7429668827cf5fbccdc7620e");
        }
        try {
            KeyGenerator.getInstance("AES").init(128);
            Cipher cipher = Cipher.getInstance(AESUtils.AES_TYPE);
            cipher.init(1, new SecretKeySpec(str2.getBytes(), "AES"));
            return cipher.doFinal(str.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91340ed5275d59c13331dd78c2b263f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91340ed5275d59c13331dd78c2b263f7");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        byte[] b = b(str, str2);
        Object[] objArr2 = {b};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e4234ab33a3ff9edb4c04f1cfb42c479", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e4234ab33a3ff9edb4c04f1cfb42c479");
        }
        if (b == null) {
            return null;
        }
        return Base64.encodeToString(b, 2);
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2e415f9497c699c16778b2988d34a8b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2e415f9497c699c16778b2988d34a8b4");
        }
        int length = str.length();
        if (length < 32) {
            str = a(str, 32, '0');
        } else if (length > 32) {
            str = str.substring(0, 32);
        }
        return str.substring(16) + str.substring(0, 16);
    }

    private static String a(String str, int i, char c) {
        Object[] objArr = {str, Integer.valueOf(i), Character.valueOf(c)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3c97b5633a29207f0d0ef73346828967", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3c97b5633a29207f0d0ef73346828967");
        }
        if (str == null) {
            return null;
        }
        int length = i - str.length();
        if (length <= 0) {
            return str;
        }
        if (length > 8192) {
            return a(str, i, String.valueOf(c));
        }
        char[] cArr = new char[length];
        Arrays.fill(cArr, c);
        return str.concat(new String(cArr));
    }

    private static String a(String str, int i, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d9cc79a8c0929638efc49b9e7909648", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d9cc79a8c0929638efc49b9e7909648");
        }
        if (str == null) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = StringUtil.SPACE;
        }
        int length = str2.length();
        int length2 = i - str.length();
        if (length2 <= 0) {
            return str;
        }
        if (length != 1 || length2 > 8192) {
            if (length2 == length) {
                return str.concat(str2);
            }
            if (length2 < length) {
                return str.concat(str2.substring(0, length2));
            }
            char[] cArr = new char[length2];
            char[] charArray = str2.toCharArray();
            for (int i2 = 0; i2 < length2; i2++) {
                cArr[i2] = charArray[i2 % length];
            }
            return str.concat(new String(cArr));
        }
        return a(str, i, str2.charAt(0));
    }
}
