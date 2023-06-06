package com.meituan.android.common.unionid;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SimpleCrypto {
    private static final String DEFAULT_CIPHER_ALGORITHM = "AES/ECB/PKCS5Padding";
    private static final String HEX = "0123456789ABCDEF";
    private static final String KEY_ALGORITHM = "AES";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static Key initKey() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8429b029572f920220eb3c95adc9449c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Key) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8429b029572f920220eb3c95adc9449c");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "20952e0ccfeac4e616aba9d21b12294a", RobustBitConfig.DEFAULT_VALUE)) {
            return (char[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "20952e0ccfeac4e616aba9d21b12294a");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "37d48d936564f349d59d42734489a915", RobustBitConfig.DEFAULT_VALUE)) {
            return (char[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "37d48d936564f349d59d42734489a915");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ea79289615f4728a79884b0e24e18eed", RobustBitConfig.DEFAULT_VALUE)) {
            return (char[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ea79289615f4728a79884b0e24e18eed");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8f6115dbbe80f5774f7f56abb670d98b", RobustBitConfig.DEFAULT_VALUE)) {
            return (char[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8f6115dbbe80f5774f7f56abb670d98b");
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
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "775ea00ea09271511e6533314ab8fe71", RobustBitConfig.DEFAULT_VALUE) ? (Key) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "775ea00ea09271511e6533314ab8fe71") : new SecretKeySpec(bArr, KEY_ALGORITHM);
    }

    public static String encrypt(String str, Key key) throws Exception {
        Object[] objArr = {str, key};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d43a9d651e64c1d53c07545135473f45", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d43a9d651e64c1d53c07545135473f45") : toHex(encrypt(str.getBytes(), key, "AES/ECB/PKCS5Padding"));
    }

    public static byte[] encrypt(byte[] bArr, byte[] bArr2) throws Exception {
        Object[] objArr = {bArr, bArr2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "69ce6d0a4cb79fea84ed13d4fc2bf87e", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "69ce6d0a4cb79fea84ed13d4fc2bf87e") : encrypt(bArr, bArr2, "AES/ECB/PKCS5Padding");
    }

    public static byte[] encrypt(byte[] bArr, byte[] bArr2, String str) throws Exception {
        Object[] objArr = {bArr, bArr2, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7f42fb096bdca59a13e5391a196cc7b0", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7f42fb096bdca59a13e5391a196cc7b0") : encrypt(bArr, toKey(bArr2), str);
    }

    public static byte[] encrypt(byte[] bArr, Key key, String str) throws Exception {
        Object[] objArr = {bArr, key, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e87b6c9a828a34ae0a311455b0e82306", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e87b6c9a828a34ae0a311455b0e82306");
        }
        Cipher cipher = Cipher.getInstance(str);
        cipher.init(1, key);
        return cipher.doFinal(bArr);
    }

    public static String decrypt(String str, Key key) throws Exception {
        Object[] objArr = {str, key};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "52c61d755f6b76e5d6066100ea37b63b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "52c61d755f6b76e5d6066100ea37b63b") : new String(decrypt(toByte(str), key, "AES/ECB/PKCS5Padding"));
    }

    public static byte[] decrypt(byte[] bArr, byte[] bArr2) throws Exception {
        Object[] objArr = {bArr, bArr2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c85eed11fc9795862618f2e333cc978a", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c85eed11fc9795862618f2e333cc978a") : decrypt(bArr, bArr2, "AES/ECB/PKCS5Padding");
    }

    public static byte[] decrypt(byte[] bArr, Key key) throws Exception {
        Object[] objArr = {bArr, key};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8e344d81e48cdd4790bcf2aa0d319189", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8e344d81e48cdd4790bcf2aa0d319189") : decrypt(bArr, key, "AES/ECB/PKCS5Padding");
    }

    public static byte[] decrypt(byte[] bArr, byte[] bArr2, String str) throws Exception {
        Object[] objArr = {bArr, bArr2, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7a874b1f617b1c59abe8b07e06f03921", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7a874b1f617b1c59abe8b07e06f03921") : decrypt(bArr, toKey(bArr2), str);
    }

    public static byte[] decrypt(byte[] bArr, Key key, String str) throws Exception {
        Object[] objArr = {bArr, key, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bd5b3907b6d4dc0516271efc4b980351", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bd5b3907b6d4dc0516271efc4b980351");
        }
        Cipher cipher = Cipher.getInstance(str);
        cipher.init(2, key);
        return cipher.doFinal(bArr);
    }

    private static byte[] toByte(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a69a98e4c96e15bfe3dd040ac10cb0ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a69a98e4c96e15bfe3dd040ac10cb0ac");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e90e3e412becf90e070fb841301508d8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e90e3e412becf90e070fb841301508d8");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6a2224b33706ba0e205f1002e738036e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6a2224b33706ba0e205f1002e738036e");
            return;
        }
        stringBuffer.append(HEX.charAt((b >> 4) & 15));
        stringBuffer.append(HEX.charAt(b & 15));
    }
}
