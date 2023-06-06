package com.meituan.android.quickpass.uptsm.common.rsa;

import android.util.Base64;
import android.util.Log;
import com.meituan.android.quickpass.uptsm.common.utils.h;
import com.meituan.android.quickpass.uptsm.constant.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    private static String b = "RSA";
    private static PublicKey c;

    static {
        try {
            c = a(b.b.getAssets().open("quickpass_babel_rsa_public_key.pem"));
        } catch (Exception e) {
            h.b(Log.getStackTraceString(e));
        }
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b11607f381c1a26f89d34b6505dc3aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b11607f381c1a26f89d34b6505dc3aa");
        }
        if (c == null) {
            try {
                c = a(b.b.getAssets().open("quickpass_babel_rsa_public_key.pem"));
            } catch (Exception e) {
                h.b(Log.getStackTraceString(e));
                return "";
            }
        }
        try {
            return Base64.encodeToString(a(str.getBytes(), c), 0);
        } catch (Exception e2) {
            h.b(Log.getStackTraceString(e2));
            return "";
        }
    }

    private static byte[] a(byte[] bArr, PublicKey publicKey) {
        Object[] objArr = {bArr, publicKey};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "805398aca483502d7ee6a7116ee2c983", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "805398aca483502d7ee6a7116ee2c983");
        }
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, publicKey);
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            h.b(Log.getStackTraceString(e));
            return null;
        }
    }

    private static PublicKey b(String str) throws Exception {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ae6e60a891e2ab74cb7d6aa4c437afb", RobustBitConfig.DEFAULT_VALUE)) {
            return (PublicKey) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ae6e60a891e2ab74cb7d6aa4c437afb");
        }
        try {
            return KeyFactory.getInstance(b).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        } catch (NullPointerException unused) {
            throw new Exception("公钥数据为空");
        } catch (NoSuchAlgorithmException unused2) {
            throw new Exception("无此算法");
        } catch (InvalidKeySpecException unused3) {
            throw new Exception("公钥非法");
        }
    }

    private static PublicKey a(InputStream inputStream) throws Exception {
        String sb;
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "82d6643a4750207459e74d24276cc1c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (PublicKey) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "82d6643a4750207459e74d24276cc1c5");
        }
        try {
            Object[] objArr2 = {inputStream};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f3f7ff90e66fd43e0b3e29465a847764", RobustBitConfig.DEFAULT_VALUE)) {
                sb = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f3f7ff90e66fd43e0b3e29465a847764");
            } else {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else if (readLine.charAt(0) != '-') {
                        sb2.append(readLine);
                        sb2.append('\r');
                    }
                }
                sb = sb2.toString();
            }
            return b(sb);
        } catch (IOException unused) {
            throw new Exception("公钥数据流读取错误");
        } catch (NullPointerException unused2) {
            throw new Exception("公钥输入流为空");
        }
    }
}
