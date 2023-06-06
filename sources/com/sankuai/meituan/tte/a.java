package com.sankuai.meituan.tte;

import com.ciphergateway.crypto.CGCipher;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static CGCipher a(String str, String str2) throws Exception {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "345ff29d021e48fd921800bd9d35f566", RobustBitConfig.DEFAULT_VALUE)) {
            return (CGCipher) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "345ff29d021e48fd921800bd9d35f566");
        }
        try {
            return CGCipher.a(str, str2);
        } catch (Error e) {
            u.b("CGCipher", "init error", e);
            throw new Exception("CGCipher init error", e);
        }
    }

    public static boolean a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
        Object[] objArr = {bArr, bArr2, bArr3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b11fe32c1c525a1d81bb6899f9bdeb1e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b11fe32c1c525a1d81bb6899f9bdeb1e")).booleanValue();
        }
        try {
            return a("SM2", "").a(bArr, bArr2, bArr3) == 0;
        } catch (Error e) {
            u.b("SM2", "verify error", e);
            return false;
        }
    }
}
