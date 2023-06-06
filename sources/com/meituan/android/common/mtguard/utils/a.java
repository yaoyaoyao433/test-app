package com.meituan.android.common.mtguard.utils;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Base64;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes2.dex */
public final class a {
    private static final int a = 12;
    private static final int b = 16;
    private static final byte c = 3;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final byte d = 4;
    private static final byte[] e = "pangolin".getBytes();

    private static int a(byte[] bArr, byte[] bArr2) {
        Object[] objArr = {bArr, bArr2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b5f67f33259866a6b6806a70df3465bf", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b5f67f33259866a6b6806a70df3465bf")).intValue();
        }
        if (bArr.length < bArr2.length) {
            return -1;
        }
        System.arraycopy(a(bArr2.length), 0, bArr, 5, 4);
        System.arraycopy(bArr2, 0, bArr, 9, bArr2.length);
        return bArr2.length + 9;
    }

    private static String a(String str, String str2) throws GeneralSecurityException {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6742df27886e4478768ccaadd752bed1", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6742df27886e4478768ccaadd752bed1") : Base64.encodeToString(b(Base64.decode(str, 0), Base64.decode(str2, 0), e), 0);
    }

    private static String a(String str, String str2, String str3) throws GeneralSecurityException {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3e8ddb7ae4b3fe4170b5add0c593fb49", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3e8ddb7ae4b3fe4170b5add0c593fb49") : Base64.encodeToString(a(Base64.decode(str, 0), Base64.decode(str2, 0), Base64.decode(str3, 0)), 0);
    }

    @RequiresApi(api = 19)
    private static AlgorithmParameterSpec a(byte[] bArr, int i, int i2) {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ab6751d41cfbcd329024f6f6e0940e10", 6917529027641081856L) ? (AlgorithmParameterSpec) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ab6751d41cfbcd329024f6f6e0940e10") : new GCMParameterSpec(128, bArr, 0, 12);
    }

    private static Cipher a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8daba3e0bdd01a2fcdeee7deceb522df", 6917529027641081856L)) {
            return (Cipher) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8daba3e0bdd01a2fcdeee7deceb522df");
        }
        try {
            return Cipher.getInstance("AES/GCM/NoPadding");
        } catch (Exception e2) {
            MTGuardLog.setErrorLogan(e2);
            return null;
        }
    }

    private static void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "744fe13433632d6dc39b6894dfa7b0c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "744fe13433632d6dc39b6894dfa7b0c0");
        } else if (bArr.length < 4) {
        } else {
            bArr[1] = 75;
            bArr[2] = 77;
            bArr[3] = 83;
        }
    }

    private static void a(byte[] bArr, byte b2) {
        Object[] objArr = {bArr, Byte.valueOf(b2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5c9ee568b14e848457f564fa4dfd003c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5c9ee568b14e848457f564fa4dfd003c");
        } else if (bArr.length <= 0) {
        } else {
            bArr[0] = 5;
        }
    }

    private static void a(byte[] bArr, int i) {
        byte b2 = 0;
        Object[] objArr = {bArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "28c23f7f552561531870580b570be5ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "28c23f7f552561531870580b570be5ce");
        } else if (bArr.length < 5) {
        } else {
            if (i == 16) {
                b2 = 3;
            } else if (i == 32) {
                b2 = 4;
            }
            bArr[4] = b2;
        }
    }

    private static void a(byte[] bArr, int i, byte[] bArr2) {
        Object[] objArr = {bArr, Integer.valueOf(i), bArr2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "95eaa83261d6f59a313687283fd1ebfd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "95eaa83261d6f59a313687283fd1ebfd");
        } else if (bArr.length < bArr2.length) {
        } else {
            System.arraycopy(a(bArr2.length), 0, bArr, i, 4);
            System.arraycopy(bArr2, 0, bArr, i + 4, bArr2.length);
        }
    }

    private static byte[] a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9c3b19919284f9f8a82e0aee1ee0d92b", 6917529027641081856L) ? (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9c3b19919284f9f8a82e0aee1ee0d92b") : new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    private static byte[] a(byte[] bArr, String str, String str2) throws GeneralSecurityException {
        Object[] objArr = {bArr, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "33d63e0fc49aebc7cee816aae1ff6fbf", 6917529027641081856L) ? (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "33d63e0fc49aebc7cee816aae1ff6fbf") : a(bArr, Base64.decode(str, 0), Base64.decode(str2, 0));
    }

    @RequiresApi(api = 19)
    public static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        byte b2;
        int length;
        Object[] objArr = {bArr, bArr2, bArr3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a97b95409c6faead3f690b3832334ae6", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a97b95409c6faead3f690b3832334ae6");
        }
        byte[] b3 = b(bArr3, bArr, e);
        byte[] bArr4 = new byte[bArr2.length + 9 + 4 + b3.length];
        if (bArr4.length > 0) {
            bArr4[0] = 5;
        }
        if (bArr4.length >= 4) {
            bArr4[1] = 75;
            bArr4[2] = 77;
            b2 = 3;
            bArr4[3] = 83;
        } else {
            b2 = 3;
        }
        int length2 = bArr3.length;
        if (bArr4.length >= 5) {
            if (length2 != 16) {
                b2 = length2 == 32 ? (byte) 4 : (byte) 0;
            }
            bArr4[4] = b2;
        }
        if (bArr4.length < bArr2.length) {
            length = -1;
        } else {
            System.arraycopy(a(bArr2.length), 0, bArr4, 5, 4);
            System.arraycopy(bArr2, 0, bArr4, 9, bArr2.length);
            length = bArr2.length + 9;
        }
        if (bArr4.length >= b3.length) {
            System.arraycopy(a(b3.length), 0, bArr4, length, 4);
            System.arraycopy(b3, 0, bArr4, length + 4, b3.length);
        }
        return bArr4;
    }

    private static int b(byte[] bArr) {
        if (bArr == null || bArr.length < 5) {
            return -1;
        }
        return bArr[4];
    }

    private static String b(String str, String str2) throws GeneralSecurityException {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bca15fc2421e9d6c0a478af41b0946eb", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bca15fc2421e9d6c0a478af41b0946eb");
        }
        byte[] decode = Base64.decode(str, 0);
        byte[] decode2 = Base64.decode(str2, 0);
        byte[] bArr = e;
        c(decode.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(decode, "AES");
        if (decode2.length >= 28) {
            AlgorithmParameterSpec a2 = a(decode2, 0, 12);
            Cipher a3 = a();
            a3.init(2, secretKeySpec, a2);
            if (bArr != null && bArr.length != 0 && Build.VERSION.SDK_INT >= 19) {
                a3.updateAAD(bArr);
            }
            return Base64.encodeToString(a3.doFinal(decode2, 12, decode2.length - 12), 0);
        }
        throw new GeneralSecurityException("cipherText too short");
    }

    private static byte[] b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "66eff9e9df36e628ba00585d1c2da334", 6917529027641081856L) ? (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "66eff9e9df36e628ba00585d1c2da334") : new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    @RequiresApi(api = 19)
    private static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        Object[] objArr = {bArr, bArr2, bArr3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c8e34fa557f6a1b17780952a7195a949", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c8e34fa557f6a1b17780952a7195a949");
        }
        c(bArr.length);
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr4 = new byte[12];
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        if (bArr2.length <= 2147483619) {
            byte[] bArr5 = new byte[bArr2.length + 12 + 16];
            secureRandom.nextBytes(bArr4);
            System.arraycopy(bArr4, 0, bArr5, 0, 12);
            Cipher a2 = a();
            a2.init(1, secretKeySpec, a(bArr4, 0, 12));
            if (bArr3 != null && bArr3.length != 0 && Build.VERSION.SDK_INT >= 19) {
                a2.updateAAD(bArr3);
            }
            int doFinal = a2.doFinal(bArr2, 0, bArr2.length, bArr5, 12);
            if (doFinal == bArr2.length + 16) {
                return bArr5;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - bArr2.length)));
        }
        throw new GeneralSecurityException("plainText too long");
    }

    private static int c(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3acc0f6332e5d586af89069a1b0d9ae6", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3acc0f6332e5d586af89069a1b0d9ae6")).intValue();
        }
        return (bArr[3] & 255) | ((bArr[1] & 255) << 16) | ((bArr[0] & 255) << 24) | ((bArr[2] & 255) << 8);
    }

    private static void c(int i) throws InvalidAlgorithmParameterException {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d3a9319d5d920ada429ed67e3d3642a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d3a9319d5d920ada429ed67e3d3642a1");
        } else if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
    }

    @RequiresApi(api = 19)
    private static byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        Object[] objArr = {bArr, bArr2, bArr3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dda179ca724501d1fd8c7f39a1fbc3ea", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dda179ca724501d1fd8c7f39a1fbc3ea");
        }
        c(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        if (bArr2.length >= 28) {
            AlgorithmParameterSpec a2 = a(bArr2, 0, 12);
            Cipher a3 = a();
            a3.init(2, secretKeySpec, a2);
            if (bArr3 != null && bArr3.length != 0 && Build.VERSION.SDK_INT >= 19) {
                a3.updateAAD(bArr3);
            }
            return a3.doFinal(bArr2, 12, bArr2.length - 12);
        }
        throw new GeneralSecurityException("cipherText too short");
    }

    private static int d(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "619212ab2f7907daa5d9e8e1bd90d828", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "619212ab2f7907daa5d9e8e1bd90d828")).intValue();
        }
        return ((bArr[3] & 255) << 24) | ((bArr[1] & 255) << 8) | (bArr[0] & 255) | ((bArr[2] & 255) << 16);
    }

    @RequiresApi(api = 19)
    private static AlgorithmParameterSpec e(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "056d3160d4bb03a600c4dde889efc56b", 6917529027641081856L) ? (AlgorithmParameterSpec) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "056d3160d4bb03a600c4dde889efc56b") : a(bArr, 0, 12);
    }
}
