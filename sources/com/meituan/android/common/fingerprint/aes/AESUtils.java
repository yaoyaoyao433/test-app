package com.meituan.android.common.fingerprint.aes;

import android.util.Base64;
import com.meituan.android.common.fingerprint.utils.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AESUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String decrypt(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "af8cb514305745596e8e98f8964bcb8f", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "af8cb514305745596e8e98f8964bcb8f");
        }
        try {
            Cipher cipher = Cipher.getInstance(com.meituan.android.common.unionid.oneid.util.AESUtils.AES_TYPE);
            cipher.init(2, new SecretKeySpec("SS%k23dibbc*~__&".getBytes(), "AES"));
            return new String(cipher.doFinal(Base64.decode(bArr, 0)));
        } catch (Throwable th) {
            StringUtils.setErrorLogan(th);
            return "";
        }
    }
}
