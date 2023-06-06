package com.dianping.base.push.pushservice.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.security.MessageDigest;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g {
    public static ChangeQuickRedirect a;
    private static final String[] b = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", com.huawei.hms.opendevice.c.a, "d", "e", "f"};

    public static String a(String str) {
        String str2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "13443caf3bbec38eaa650573d9cdb6b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "13443caf3bbec38eaa650573d9cdb6b1");
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes("UTF-8"), 0, str.length());
            byte[] digest = messageDigest.digest();
            Object[] objArr2 = {digest};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "234aa078ee989a333618b63c8c33cf07", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "234aa078ee989a333618b63c8c33cf07");
            }
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                Object[] objArr3 = {Byte.valueOf(b2)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                int i = b2;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "7243b503d808f5f21726ab7395524315", RobustBitConfig.DEFAULT_VALUE)) {
                    str2 = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "7243b503d808f5f21726ab7395524315");
                } else {
                    if (b2 < 0) {
                        i = b2 + 256;
                    }
                    str2 = b[i >> 4] + b[i & 15];
                }
                sb.append(str2);
            }
            return sb.toString();
        } catch (Exception e) {
            com.dianping.base.push.pushservice.c.b(e.toString());
            return "";
        }
    }
}
