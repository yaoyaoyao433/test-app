package com.sankuai.titans;

import android.util.Base64;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidParameterException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CryptoManager {
    private static final String CHARSET = "UTF-8";
    private static final int KEY_BYTE_COUNT = 16;
    private static final String MODE_AES_ENCRYPTION = "AES/CBC/PKCS7Padding";
    private static final String MODE_RSA_ENCRYPTION = "RSA/None/PKCS1Padding";
    private static final String RSA_ALGORITHM = "RSA";
    public static ChangeQuickRedirect changeQuickRedirect;

    private static RSAPublicKey loadPublicKey(String str) throws Exception {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2b186b8c3fedece5123dae29793d47ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (RSAPublicKey) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2b186b8c3fedece5123dae29793d47ca");
        }
        try {
            return (RSAPublicKey) KeyFactory.getInstance(RSA_ALGORITHM).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 2)));
        } catch (NullPointerException e) {
            throw new Exception("公钥数据为空", e);
        } catch (NoSuchAlgorithmException e2) {
            throw new Exception("无此算法", e2);
        } catch (InvalidKeySpecException e3) {
            throw new Exception("公钥非法-publicKey:" + str, e3);
        }
    }

    private static RSAPrivateKey loadPrivateKey(String str) throws Exception {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b725718788eea2d93e2a9bd84a1e4f7d", RobustBitConfig.DEFAULT_VALUE)) {
            return (RSAPrivateKey) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b725718788eea2d93e2a9bd84a1e4f7d");
        }
        try {
            return (RSAPrivateKey) KeyFactory.getInstance(RSA_ALGORITHM).generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str, 2)));
        } catch (NullPointerException e) {
            throw new Exception("私钥数据为空", e);
        } catch (NoSuchAlgorithmException e2) {
            throw new Exception("无此算法", e2);
        } catch (InvalidKeySpecException e3) {
            throw new Exception("私钥非法", e3);
        }
    }

    public static String encryptByPublicKey(String str, String str2) throws Exception {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "655a1884fc81a71b46d85054d10c8be4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "655a1884fc81a71b46d85054d10c8be4");
        }
        byte[] bytes = str.getBytes("UTF-8");
        RSAPublicKey loadPublicKey = loadPublicKey(str2);
        int bitLength = loadPublicKey.getModulus().bitLength();
        Cipher cipher = Cipher.getInstance(MODE_RSA_ENCRYPTION);
        cipher.init(1, loadPublicKey);
        return Base64.encodeToString(rsaSplitCodec(cipher, 1, bytes, bitLength), 2);
    }

    public static String decryptByPrivateKey(String str, String str2) throws Exception {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "903bea0991b8610a66b1e716245634e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "903bea0991b8610a66b1e716245634e8");
        }
        byte[] decode = Base64.decode(str, 2);
        RSAPrivateKey loadPrivateKey = loadPrivateKey(str2);
        int bitLength = loadPrivateKey.getModulus().bitLength();
        Cipher cipher = Cipher.getInstance(MODE_RSA_ENCRYPTION);
        cipher.init(2, loadPrivateKey);
        return new String(rsaSplitCodec(cipher, 2, decode, bitLength), "UTF-8");
    }

    public static String decryptByPublicKey(String str, String str2) throws Exception {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8dd8443a413a645b92eb3f0985627b56", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8dd8443a413a645b92eb3f0985627b56");
        }
        byte[] decode = Base64.decode(str, 2);
        RSAPublicKey loadPublicKey = loadPublicKey(str2);
        int bitLength = loadPublicKey.getModulus().bitLength();
        Cipher cipher = Cipher.getInstance(MODE_RSA_ENCRYPTION);
        cipher.init(2, loadPublicKey);
        return new String(rsaSplitCodec(cipher, 2, decode, bitLength), "UTF-8");
    }

    private static byte[] rsaSplitCodec(Cipher cipher, int i, byte[] bArr, int i2) throws Exception {
        int i3;
        byte[] doFinal;
        Object[] objArr = {cipher, Integer.valueOf(i), bArr, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fe606a2ffeb204a44e189109b1f9846d", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fe606a2ffeb204a44e189109b1f9846d");
        }
        if (i == 2) {
            i3 = i2 / 8;
        } else {
            i3 = (i2 / 8) - 11;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i4 = 0;
        int i5 = 0;
        while (bArr.length > i4) {
            if (bArr.length - i4 > i3) {
                doFinal = cipher.doFinal(bArr, i4, i3);
            } else {
                doFinal = cipher.doFinal(bArr, i4, bArr.length - i4);
            }
            byteArrayOutputStream.write(doFinal, 0, doFinal.length);
            i5++;
            i4 = i5 * i3;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused) {
        }
        return byteArray;
    }

    public static String decryptByAES(String str, String str2) throws Exception {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0e1c1a64d0fb132cc1df43f1327609d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0e1c1a64d0fb132cc1df43f1327609d3");
        }
        if (str == null || str.length() == 0 || str2 == null) {
            throw new InvalidParameterException();
        }
        byte[] decode = Base64.decode(str, 2);
        Cipher cipher = Cipher.getInstance(MODE_AES_ENCRYPTION);
        SecretKeySpec createSecretKey = createSecretKey(str2);
        cipher.init(2, createSecretKey, createIVParameterSpec(createSecretKey));
        return new String(cipher.doFinal(decode));
    }

    public static String encryptByAES(String str, String str2) throws Exception {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4f83b14abf8d1b663569812312d41a32", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4f83b14abf8d1b663569812312d41a32");
        }
        if (str == null || str.length() == 0 || str2 == null) {
            throw new InvalidParameterException();
        }
        Cipher cipher = Cipher.getInstance(MODE_AES_ENCRYPTION);
        SecretKeySpec createSecretKey = createSecretKey(str2);
        cipher.init(1, createSecretKey, createIVParameterSpec(createSecretKey));
        return new String(Base64.encode(cipher.doFinal(str.getBytes("UTF-8")), 2));
    }

    private static SecretKeySpec createSecretKey(String str) {
        byte[] bArr;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        byte[] bArr2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bee9133ef50479b57bfe13b672efd16b", RobustBitConfig.DEFAULT_VALUE)) {
            return (SecretKeySpec) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bee9133ef50479b57bfe13b672efd16b");
        }
        StringBuilder sb = new StringBuilder(str);
        try {
            if (sb.length() >= 16) {
                bArr = sb.toString().substring(0, 16).getBytes("UTF-8");
            } else {
                byte[] bytes = sb.toString().getBytes("UTF-8");
                byte[] bArr3 = new byte[16];
                try {
                    System.arraycopy(bytes, 0, bArr3, 0, bytes.length);
                    bArr = bArr3;
                } catch (UnsupportedEncodingException e) {
                    e = e;
                    bArr2 = bArr3;
                    e.printStackTrace();
                    bArr = bArr2;
                    return new SecretKeySpec(bArr, "AES");
                }
            }
        } catch (UnsupportedEncodingException e2) {
            e = e2;
        }
        return new SecretKeySpec(bArr, "AES");
    }

    private static IvParameterSpec createIVParameterSpec(SecretKeySpec secretKeySpec) {
        Object[] objArr = {secretKeySpec};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1b2471ed963118dcf817fac707c71ae5", RobustBitConfig.DEFAULT_VALUE)) {
            return (IvParameterSpec) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1b2471ed963118dcf817fac707c71ae5");
        }
        byte[] bArr = new byte[16];
        System.arraycopy(secretKeySpec.getEncoded(), 0, bArr, 0, 16);
        return new IvParameterSpec(bArr);
    }
}
