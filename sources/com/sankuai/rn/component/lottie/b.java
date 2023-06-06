package com.sankuai.rn.component.lottie;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.security.MessageDigest;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static String a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9a6090f66e6a2981636b6a2ed5f9ec2f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9a6090f66e6a2981636b6a2ed5f9ec2f");
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            Object[] objArr2 = {digest};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e1193f2b09a71845106d1986693f8483", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e1193f2b09a71845106d1986693f8483");
            }
            String str = "";
            for (int i = 0; i < digest.length; i++) {
                str = str + Integer.toString((digest[i] & 255) + 256, 16).substring(1);
            }
            return str.toLowerCase();
        } catch (Exception unused) {
            return "";
        }
    }
}
