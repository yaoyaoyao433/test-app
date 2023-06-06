package com.dianping.nvnetwork.tunnel.tool;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
/* loaded from: classes.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static boolean a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ef13ece5f5519dfa865da8ba7c2bc48", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ef13ece5f5519dfa865da8ba7c2bc48")).booleanValue();
        }
        try {
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(SecureTools.decryptBASE64(str3)));
            Signature signature = Signature.getInstance("SHA1WithRSA");
            signature.initVerify(generatePublic);
            signature.update(str.getBytes());
            return signature.verify(SecureTools.decryptBASE64(str2));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
