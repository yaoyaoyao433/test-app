package com.huawei.secure.android.common.encrypt.keystore.aes;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import com.huawei.secure.android.common.encrypt.utils.c;
import com.huawei.secure.android.common.encrypt.utils.e;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a {
    private static final String a = "a";

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            e.a(a, "alias or encrypt content is null");
            return "";
        }
        try {
            return c.a(a(str, str2.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e) {
            String str3 = a;
            e.a(str3, "encrypt: UnsupportedEncodingException : " + e.getMessage());
            return "";
        }
    }

    public static String b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            e.a(a, "alias or encrypt content is null");
            return "";
        }
        try {
            return new String(b(str, c.a(str2)), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            String str3 = a;
            e.a(str3, "decrypt: UnsupportedEncodingException : " + e.getMessage());
            return "";
        }
    }

    private static synchronized SecretKey a(String str) {
        SecretKey secretKey;
        synchronized (a.class) {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                                            keyStore.load(null);
                                            Key key = keyStore.getKey(str, null);
                                            if (key != null && (key instanceof SecretKey)) {
                                                secretKey = (SecretKey) key;
                                            } else {
                                                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                                                keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build());
                                                secretKey = keyGenerator.generateKey();
                                            }
                                        } catch (KeyStoreException e) {
                                            e.a(a, "KeyStoreException : " + e.getMessage());
                                            secretKey = null;
                                            return secretKey;
                                        }
                                    } catch (NoSuchProviderException e2) {
                                        e.a(a, "NoSuchProviderException : " + e2.getMessage());
                                        secretKey = null;
                                        return secretKey;
                                    }
                                } catch (NoSuchAlgorithmException e3) {
                                    e.a(a, "NoSuchAlgorithmException : " + e3.getMessage());
                                    secretKey = null;
                                    return secretKey;
                                }
                            } catch (UnrecoverableKeyException e4) {
                                e.a(a, "UnrecoverableKeyException : " + e4.getMessage());
                                secretKey = null;
                                return secretKey;
                            }
                        } catch (IOException e5) {
                            e.a(a, "IOException : " + e5.getMessage());
                            secretKey = null;
                            return secretKey;
                        }
                    } catch (InvalidAlgorithmParameterException e6) {
                        e.a(a, "InvalidAlgorithmParameterException : " + e6.getMessage());
                        secretKey = null;
                        return secretKey;
                    }
                } catch (Exception e7) {
                    e.a(a, "Exception: " + e7.getMessage());
                    secretKey = null;
                    return secretKey;
                }
            } catch (CertificateException e8) {
                e.a(a, "CertificateException : " + e8.getMessage());
                secretKey = null;
                return secretKey;
            }
        }
        return secretKey;
    }

    private static byte[] a(String str, byte[] bArr) {
        byte[] bArr2;
        Cipher cipher;
        SecretKey a2;
        byte[] bArr3 = new byte[0];
        if (TextUtils.isEmpty(str) || bArr == null) {
            e.a(a, "alias or encrypt content is null");
            return bArr3;
        } else if (!a()) {
            e.a(a, "sdk version is too low");
            return bArr3;
        } else {
            try {
                cipher = Cipher.getInstance("AES/GCM/NoPadding");
                a2 = a(str);
            } catch (InvalidKeyException e) {
                e = e;
                bArr2 = bArr3;
            } catch (NoSuchAlgorithmException e2) {
                e = e2;
                bArr2 = bArr3;
            } catch (BadPaddingException e3) {
                e = e3;
                bArr2 = bArr3;
            } catch (IllegalBlockSizeException e4) {
                e = e4;
                bArr2 = bArr3;
            } catch (NoSuchPaddingException e5) {
                e = e5;
                bArr2 = bArr3;
            } catch (Exception e6) {
                e = e6;
                bArr2 = bArr3;
            }
            if (a2 == null) {
                e.a(a, "Encrypt secret key is null");
                return bArr3;
            }
            cipher.init(1, a2);
            byte[] doFinal = cipher.doFinal(bArr);
            byte[] iv = cipher.getIV();
            if (iv != null && iv.length == 12) {
                bArr2 = Arrays.copyOf(iv, iv.length + doFinal.length);
                try {
                    System.arraycopy(doFinal, 0, bArr2, iv.length, doFinal.length);
                } catch (InvalidKeyException e7) {
                    e = e7;
                    String str2 = a;
                    e.a(str2, "InvalidKeyException : " + e.getMessage());
                    return bArr2;
                } catch (NoSuchAlgorithmException e8) {
                    e = e8;
                    String str3 = a;
                    e.a(str3, "NoSuchAlgorithmException : " + e.getMessage());
                    return bArr2;
                } catch (BadPaddingException e9) {
                    e = e9;
                    String str4 = a;
                    e.a(str4, "BadPaddingException : " + e.getMessage());
                    return bArr2;
                } catch (IllegalBlockSizeException e10) {
                    e = e10;
                    String str5 = a;
                    e.a(str5, "IllegalBlockSizeException : " + e.getMessage());
                    return bArr2;
                } catch (NoSuchPaddingException e11) {
                    e = e11;
                    String str6 = a;
                    e.a(str6, "NoSuchPaddingException : " + e.getMessage());
                    return bArr2;
                } catch (Exception e12) {
                    e = e12;
                    String str7 = a;
                    e.a(str7, "Exception: " + e.getMessage());
                    return bArr2;
                }
                return bArr2;
            }
            e.a(a, "IV is invalid.");
            return bArr3;
        }
    }

    private static byte[] b(String str, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str) || bArr == null) {
            e.a(a, "alias or encrypt content is null");
            return bArr2;
        } else if (!a()) {
            e.a(a, "sdk version is too low");
            return bArr2;
        } else if (bArr.length <= 12) {
            e.a(a, "Decrypt source data is invalid.");
            return bArr2;
        } else {
            SecretKey a2 = a(str);
            if (a2 == null) {
                e.a(a, "Decrypt secret key is null");
                return bArr2;
            }
            byte[] copyOf = Arrays.copyOf(bArr, 12);
            try {
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(2, a2, new GCMParameterSpec(128, copyOf));
                return cipher.doFinal(bArr, 12, bArr.length - 12);
            } catch (InvalidAlgorithmParameterException e) {
                String str2 = a;
                e.a(str2, "InvalidAlgorithmParameterException : " + e.getMessage());
                return bArr2;
            } catch (InvalidKeyException e2) {
                String str3 = a;
                e.a(str3, "InvalidKeyException : " + e2.getMessage());
                return bArr2;
            } catch (NoSuchAlgorithmException e3) {
                String str4 = a;
                e.a(str4, "NoSuchAlgorithmException : " + e3.getMessage());
                return bArr2;
            } catch (BadPaddingException e4) {
                String str5 = a;
                e.a(str5, "BadPaddingException : " + e4.getMessage());
                return bArr2;
            } catch (IllegalBlockSizeException e5) {
                String str6 = a;
                e.a(str6, "IllegalBlockSizeException : " + e5.getMessage());
                return bArr2;
            } catch (NoSuchPaddingException e6) {
                String str7 = a;
                e.a(str7, "NoSuchPaddingException : " + e6.getMessage());
                return bArr2;
            } catch (Exception e7) {
                String str8 = a;
                e.a(str8, "Exception: " + e7.getMessage());
                return bArr2;
            }
        }
    }

    private static boolean a() {
        return Build.VERSION.SDK_INT >= 23;
    }
}
