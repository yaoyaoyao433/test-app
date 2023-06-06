package com.sankuai.shangou.stone.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class m {
    public static ChangeQuickRedirect a;
    private static final Object d = new Object();
    protected static char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    protected static MessageDigest c = null;

    public static synchronized String a(String str) {
        synchronized (m.class) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dde74c3d17ebe0e905f007e5909dd20b", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dde74c3d17ebe0e905f007e5909dd20b");
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "53f594b8d219ae1d979c39f424bb708c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "53f594b8d219ae1d979c39f424bb708c");
            } else if (c == null) {
                synchronized (d) {
                    if (c == null) {
                        try {
                            c = MessageDigest.getInstance("MD5");
                        } catch (NoSuchAlgorithmException e) {
                            com.sankuai.shangou.stone.util.log.a.b(m.class.getName() + "初始化失败，MessageDigest不支持MD5Util.", new Object[0]);
                            com.sankuai.shangou.stone.util.log.a.a(e);
                        }
                    }
                }
            }
            try {
                c.update(str.getBytes());
                byte[] digest = c.digest();
                Object[] objArr3 = {digest};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "0c0ff287bb9d31655f01287ee4d7ba0e", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "0c0ff287bb9d31655f01287ee4d7ba0e");
                }
                return a(digest, 0, digest.length);
            } catch (Exception e2) {
                com.sankuai.shangou.stone.util.log.a.a(e2);
                return "";
            }
        }
    }

    private static String a(byte[] bArr, int i, int i2) {
        Object[] objArr = {bArr, 0, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ebfa1076c63e905b4f036ffc1c46a483", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ebfa1076c63e905b4f036ffc1c46a483");
        }
        StringBuffer stringBuffer = new StringBuffer(i2 * 2);
        int i3 = i2 + 0;
        for (int i4 = 0; i4 < i3; i4++) {
            a(bArr[i4], stringBuffer);
        }
        return stringBuffer.toString();
    }

    private static void a(byte b2, StringBuffer stringBuffer) {
        Object[] objArr = {Byte.valueOf(b2), stringBuffer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "87f961a2050a82b97a3c74d9525dfed6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "87f961a2050a82b97a3c74d9525dfed6");
            return;
        }
        char c2 = b[(b2 & 240) >> 4];
        char c3 = b[b2 & 15];
        stringBuffer.append(c2);
        stringBuffer.append(c3);
    }
}
