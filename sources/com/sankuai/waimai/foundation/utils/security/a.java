package com.sankuai.waimai.foundation.utils.security;

import android.util.Base64;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static String a(String str, String str2, long j, int i) {
        Object[] objArr = {str, str2, new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f6fec36fb18e0092d202b700bb13e90", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f6fec36fb18e0092d202b700bb13e90");
        }
        if (str.charAt(str.length() - 1) != '/') {
            str = str + "/";
        }
        return a(str + str2 + "/" + j + "/" + i);
    }

    private static String a(String str) {
        byte[] doFinal;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4241fcde486aa8fda3154d62719dbf6c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4241fcde486aa8fda3154d62719dbf6c");
        }
        try {
            BigInteger bigInteger = new BigInteger("AC14E4A51F1B8E11A95971CA4EBD7E2314631F137596A66A43FA2D792B2FD8447CBD6553D591F00A8B9D58E8BA33C229317A0D122C965D84A286114A963C3AE2694C81665D5AF04C80A71CBF350CD4C66280DC8FADBE6B8EDA7B2EC3D0C50E150850445EF84D3A4192662AC135D912C2CA2C68176D79EC64CACFF34089482B69", 16);
            BigInteger bigInteger2 = new BigInteger("010001", 16);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(bigInteger, bigInteger2)));
            byte[] bytes = str.getBytes();
            int length = bytes.length;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = length - i;
                if (i3 > 0) {
                    if (i3 > 117) {
                        doFinal = cipher.doFinal(bytes, i, 117);
                    } else {
                        doFinal = cipher.doFinal(bytes, i, i3);
                    }
                    byteArrayOutputStream.write(doFinal, 0, doFinal.length);
                    i2++;
                    i = i2 * 117;
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return Base64.encodeToString(byteArray, 2);
                }
            }
        } catch (InvalidKeyException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return "";
        } catch (NoSuchAlgorithmException e2) {
            com.sankuai.waimai.foundation.utils.log.a.a(e2);
            return "";
        } catch (InvalidKeySpecException e3) {
            com.sankuai.waimai.foundation.utils.log.a.a(e3);
            return "";
        } catch (BadPaddingException e4) {
            com.sankuai.waimai.foundation.utils.log.a.a(e4);
            return "";
        } catch (IllegalBlockSizeException e5) {
            com.sankuai.waimai.foundation.utils.log.a.a(e5);
            return "";
        } catch (NoSuchPaddingException e6) {
            com.sankuai.waimai.foundation.utils.log.a.a(e6);
            return "";
        } catch (Exception e7) {
            com.sankuai.waimai.foundation.utils.log.a.a(e7);
            return "";
        }
    }
}
