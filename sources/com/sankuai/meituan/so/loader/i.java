package com.sankuai.meituan.so.loader;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.security.MessageDigest;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class i {
    public static ChangeQuickRedirect a;
    private static final String[] b = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", com.huawei.hms.opendevice.c.a, "d", "e", "f"};

    public static String a(String str) {
        String sb;
        String str2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "30d2a65ea2ce048427cc48c2b03b051c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "30d2a65ea2ce048427cc48c2b03b051c");
        }
        if (str != null) {
            try {
                byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
                Object[] objArr2 = {digest};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c8b7e8fdb3b0ae9e934da791cb098145", RobustBitConfig.DEFAULT_VALUE)) {
                    sb = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c8b7e8fdb3b0ae9e934da791cb098145");
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    for (byte b2 : digest) {
                        Object[] objArr3 = {Byte.valueOf(b2)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        int i = b2;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ede5f3ce64fbe836f8e8cb9af4bade66", RobustBitConfig.DEFAULT_VALUE)) {
                            str2 = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ede5f3ce64fbe836f8e8cb9af4bade66");
                        } else {
                            if (b2 < 0) {
                                i = b2 + 256;
                            }
                            str2 = b[i / 16] + b[i % 16];
                        }
                        sb2.append(str2);
                    }
                    sb = sb2.toString();
                }
                return sb.toUpperCase();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
