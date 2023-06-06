package com.meituan.android.common.unionid.oneid.secure;

import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SecurityUtil {
    private static final String DEFAULT_CIPHER_ALGORITHM = "AES/ECB/PKCS5Padding";
    private static final String ENCODING = "UTF-8";
    private static final String HEX = "0123456789ABCDEF";
    private static final String KEY_ALGORITHM = "AES";
    private static final String MAC_NAME = "HmacSHA1";
    private static final String TAG = "SecurityUtil";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static Key initKey() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "56009f61729fdb69c28dc86b3806b76b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Key) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "56009f61729fdb69c28dc86b3806b76b");
        }
        char[] firstKey = firstKey();
        char[] secondKey = secondKey();
        char[] thirdKey = thirdKey();
        char[] fourthKey = fourthKey();
        char[] cArr = new char[firstKey.length + secondKey.length + thirdKey.length + fourthKey.length];
        for (int i = 0; i < 4; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                if (i == 0) {
                    cArr[(i * 4) + i2] = fourthKey[i2];
                } else if (i % 2 == 0) {
                    cArr[(i * 4) + i2] = secondKey[i2];
                } else if (i == 1) {
                    cArr[(i * 4) + i2] = thirdKey[i2];
                } else if (i == 3) {
                    cArr[(i * 4) + i2] = firstKey[i2];
                }
            }
        }
        return toKey(new String(cArr).getBytes());
    }

    private static char[] firstKey() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "de7ada2746381f471583a38639fad8a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (char[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "de7ada2746381f471583a38639fad8a9");
        }
        char[] cArr = new char[4];
        for (int i = 0; i < 4; i++) {
            cArr[i] = (char) (i + 65);
        }
        return cArr;
    }

    private static char[] secondKey() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5831b96d8c01239a375967e4eb4752c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (char[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5831b96d8c01239a375967e4eb4752c7");
        }
        char[] cArr = {'&', 'O', '8', '?'};
        for (int i = 0; i < 3; i++) {
            int i2 = 0;
            while (i2 < (4 - i) - 1) {
                int i3 = i2 + 1;
                if (cArr[i2] > cArr[i3]) {
                    char c = cArr[i2];
                    cArr[i2] = cArr[i3];
                    cArr[i3] = c;
                }
                i2 = i3;
            }
        }
        return cArr;
    }

    private static char[] thirdKey() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5dc75795cb0a7e1419bf817a99083893", RobustBitConfig.DEFAULT_VALUE)) {
            return (char[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5dc75795cb0a7e1419bf817a99083893");
        }
        char[] cArr = new char[4];
        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0) {
                cArr[i] = 'B';
            } else {
                cArr[i] = 'F';
            }
        }
        return cArr;
    }

    private static char[] fourthKey() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a96a88f2b89cde8f4a5670c26f472798", RobustBitConfig.DEFAULT_VALUE)) {
            return (char[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a96a88f2b89cde8f4a5670c26f472798");
        }
        char[] cArr = new char[4];
        for (int i2 = 102; i2 < 110; i2++) {
            if (i2 % 2 == 1) {
                cArr[i] = (char) i2;
                i++;
            }
        }
        return cArr;
    }

    private static Key toKey(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cc60c96ad3b1a91c34cbeb897b90fce5", RobustBitConfig.DEFAULT_VALUE) ? (Key) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cc60c96ad3b1a91c34cbeb897b90fce5") : new SecretKeySpec(bArr, KEY_ALGORITHM);
    }

    public static String encrypt(String str, Key key) throws Exception {
        Object[] objArr = {str, key};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9082ecf014dfdb341416289abce64748", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9082ecf014dfdb341416289abce64748") : toHex(encrypt(str.getBytes(), key, "AES/ECB/PKCS5Padding"));
    }

    public static byte[] encrypt(byte[] bArr, byte[] bArr2) throws Exception {
        Object[] objArr = {bArr, bArr2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "186c4a6707aca20d0a792ded65361ad3", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "186c4a6707aca20d0a792ded65361ad3") : encrypt(bArr, bArr2, "AES/ECB/PKCS5Padding");
    }

    public static byte[] encrypt(byte[] bArr, byte[] bArr2, String str) throws Exception {
        Object[] objArr = {bArr, bArr2, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "176a67daffb17bd6fa7911889d98957b", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "176a67daffb17bd6fa7911889d98957b") : encrypt(bArr, toKey(bArr2), str);
    }

    public static byte[] encrypt(byte[] bArr, Key key, String str) throws Exception {
        Object[] objArr = {bArr, key, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dd72caf676a2f2dc86719fcb365c8b9b", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dd72caf676a2f2dc86719fcb365c8b9b");
        }
        Cipher cipher = Cipher.getInstance(str);
        cipher.init(1, key);
        return cipher.doFinal(bArr);
    }

    public static String decrypt(String str, Key key) throws Exception {
        Object[] objArr = {str, key};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ae23607ec87ad1258d420d3811247f88", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ae23607ec87ad1258d420d3811247f88") : new String(decrypt(toByte(str), key, "AES/ECB/PKCS5Padding"));
    }

    public static byte[] decrypt(byte[] bArr, byte[] bArr2) throws Exception {
        Object[] objArr = {bArr, bArr2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "110def1a318676f570d3e39661814f8b", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "110def1a318676f570d3e39661814f8b") : decrypt(bArr, bArr2, "AES/ECB/PKCS5Padding");
    }

    public static byte[] decrypt(byte[] bArr, Key key) throws Exception {
        Object[] objArr = {bArr, key};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "051c9d78443bd4a12300719b8cca6a53", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "051c9d78443bd4a12300719b8cca6a53") : decrypt(bArr, key, "AES/ECB/PKCS5Padding");
    }

    public static byte[] decrypt(byte[] bArr, byte[] bArr2, String str) throws Exception {
        Object[] objArr = {bArr, bArr2, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ea73f902a03dbb18bbebad5c24bc6ab5", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ea73f902a03dbb18bbebad5c24bc6ab5") : decrypt(bArr, toKey(bArr2), str);
    }

    public static byte[] decrypt(byte[] bArr, Key key, String str) throws Exception {
        Object[] objArr = {bArr, key, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4d317bf2def92837facecd25ab7c8e5b", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4d317bf2def92837facecd25ab7c8e5b");
        }
        Cipher cipher = Cipher.getInstance(str);
        cipher.init(2, key);
        return cipher.doFinal(bArr);
    }

    private static byte[] toByte(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3ce9c51202e608d0ba7e9fabb033f4b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3ce9c51202e608d0ba7e9fabb033f4b9");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            try {
                bArr[i] = Integer.valueOf(str.substring(i2, i2 + 2), 16).byteValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return bArr;
    }

    private static String toHex(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8241b959d559287cd3c082fa683fe692", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8241b959d559287cd3c082fa683fe692");
        }
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b : bArr) {
            appendHex(stringBuffer, b);
        }
        return stringBuffer.toString();
    }

    private static void appendHex(StringBuffer stringBuffer, byte b) {
        Object[] objArr = {stringBuffer, Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1f0a66c4d49c38a8b6b2f8c669f70300", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1f0a66c4d49c38a8b6b2f8c669f70300");
            return;
        }
        stringBuffer.append(HEX.charAt((b >> 4) & 15));
        stringBuffer.append(HEX.charAt(b & 15));
    }

    public static String getStringMd5(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2d9f22f6e8de3f771a638a4fbec1e474", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2d9f22f6e8de3f771a638a4fbec1e474");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b : digest) {
                int i = b & 255;
                if (i < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            Log.d(TAG, e.getMessage(), e);
            return "";
        }
    }

    public static byte[] HmacSHA1Encrypt(String str, String str2) throws Exception {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5f1460c5778c63cd9280530099baf4bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5f1460c5778c63cd9280530099baf4bf");
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes("UTF-8"), MAC_NAME);
        Mac mac = Mac.getInstance(MAC_NAME);
        mac.init(secretKeySpec);
        return mac.doFinal(str.getBytes("UTF-8"));
    }
}
