package com.meituan.passport.encryption;

import com.meituan.passport.utils.i;
import com.meituan.passport.utils.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.Base64;
import java.io.ByteArrayOutputStream;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3d0d93c9e4ca13ae9911985f37727002", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3d0d93c9e4ca13ae9911985f37727002");
        }
        if (str == null || str.length() <= 0) {
            return "";
        }
        try {
            return C0505a.a(str, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCRD8YahHualjGxPMzeIWnAqVGMIrWrrkr5L7gw+5XT55iIuYXZYLaUFMTOD9iSyfKlL9mvD3ReUX6Lieph3ajJAPPGEuSHwoj5PN1UiQXK3wzAPKcpwrrA2V4Agu1/RZsyIuzboXgcPexyUYxYUTJH48DeYBGJe2GrYtsmzuIu6QIDAQAB");
        } catch (Exception unused) {
            return null;
        }
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4fa20decd21a8df3366da74177cb6055", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4fa20decd21a8df3366da74177cb6055");
        }
        if (str == null || str.length() <= 0) {
            return "";
        }
        try {
            return C0505a.a(str, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtABocAwAJuxcPN8tsrXwHA0kQrFezWwFwQDi6F1QYHVib4NBnQNuq712x0lxHrAbYc85tR8881W3y8DqcbpkGn82AYVXVi4eijFcJCnBO4tZRaPEtKFq6n4aXx0rOEumYsFUPXkSf5foS5zJl7RxZkRCadp1WkJfg51ZkiNoJ4Aav8pSUg+lrmf69nApsZXW3UCgOL1R0Lo2rh3w67QLJ+Z0KGH/H2tOJioBEMTON55VyePfXnk81zFhnNOnHXCMJl5VmhvJYf/Xp1GgxZJPCD4owgExia0dApzauqyFaJcQulBIvftJ+mAsU04sycfTrpjD0gSgXA2Iu1oKWRxHAQIDAQAB");
        } catch (Exception unused) {
            return null;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.passport.encryption.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class C0505a {
        public static ChangeQuickRedirect a;

        private static RSAPublicKey a(String str) throws Exception {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "03016f6a091178ef92231b652d9f38d3", RobustBitConfig.DEFAULT_VALUE)) {
                return (RSAPublicKey) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "03016f6a091178ef92231b652d9f38d3");
            }
            try {
                return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str)));
            } catch (NullPointerException e) {
                m.a(new Exception("公钥数据为空", e));
                return null;
            } catch (NoSuchAlgorithmException e2) {
                m.a(new Exception("无此算法", e2));
                return null;
            } catch (InvalidKeySpecException e3) {
                m.a(new Exception("公钥非法", e3));
                return null;
            }
        }

        public static String a(String str, String str2) throws Exception {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b855348f04ed8dd93df4ea668fc44002", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b855348f04ed8dd93df4ea668fc44002");
            }
            byte[] bytes = str.getBytes("UTF-8");
            RSAPublicKey a2 = a(str2);
            if (a2 == null) {
                return str;
            }
            int bitLength = a2.getModulus().bitLength();
            Cipher cipher = Cipher.getInstance("RSA/None/PKCS1Padding");
            cipher.init(1, a2);
            return Base64.encodeBytes(a(cipher, 1, bytes, bitLength));
        }

        private static byte[] a(Cipher cipher, int i, byte[] bArr, int i2) throws Exception {
            byte[] doFinal;
            Object[] objArr = {cipher, 1, bArr, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "13479aa74a888b18ae863948cfa6cd18", RobustBitConfig.DEFAULT_VALUE)) {
                return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "13479aa74a888b18ae863948cfa6cd18");
            }
            int i3 = (i2 / 8) - 11;
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
            i.a(byteArrayOutputStream);
            return byteArray;
        }
    }
}
