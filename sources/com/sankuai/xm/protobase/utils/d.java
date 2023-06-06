package com.sankuai.xm.protobase.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.m;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d {
    public static ChangeQuickRedirect a = null;
    private static String b = "RSA";

    public static String a() {
        return "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCkDUifT/SK+x6eeutgOrOzaKnG3GnAog74NSkKsm8smkZXhOSzZa7E7irOxcwB60WawGAQR8BHbO7kosYlz6SJyR8ZIGfVa+jV3uBfylP+uIl/6JvdK8h7yhbLbMSsQkCnMIEWCP9YEtHxjo1cxyUlQL2yIly9eY015EiYp1Z8swIDAQAB";
    }

    public static byte[] a(byte[] bArr, PublicKey publicKey) {
        Object[] objArr = {bArr, publicKey};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3cee3759432753db5eaf62ad6a9cb75e", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3cee3759432753db5eaf62ad6a9cb75e");
        }
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, publicKey);
            return cipher.doFinal(bArr);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static PublicKey a(String str) throws Exception {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a3ddf1f3340af2f3fd902df8195d3ac", 6917529027641081856L)) {
            return (PublicKey) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a3ddf1f3340af2f3fd902df8195d3ac");
        }
        try {
            return KeyFactory.getInstance(b).generatePublic(new X509EncodedKeySpec(m.a().a(str)));
        } catch (NullPointerException unused) {
            throw new Exception("公钥数据为空");
        } catch (NoSuchAlgorithmException unused2) {
            throw new Exception("无此算法");
        } catch (InvalidKeySpecException unused3) {
            throw new Exception("公钥非法");
        }
    }
}
