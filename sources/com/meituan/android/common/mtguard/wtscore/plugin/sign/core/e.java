package com.meituan.android.common.mtguard.wtscore.plugin.sign.core;

import com.meituan.android.common.mtguard.MTGuard;
import com.meituan.android.common.mtguard.NBridge;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect changeQuickRedirect;

    private static String a(byte[] bArr, byte[] bArr2) {
        Object[] objArr = {bArr, bArr2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7a21482f0f1e669f59b9d74e9075da05", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7a21482f0f1e669f59b9d74e9075da05");
        }
        if (bArr == null) {
            return "-2003";
        }
        Object[] main3 = NBridge.main3(2, new Object[]{MTGuard.sAppKey, bArr, bArr2});
        if (main3 == null) {
            return "-1001";
        }
        if (main3[0] instanceof Integer) {
            StringBuilder sb = new StringBuilder();
            sb.append(main3[0]);
            return sb.toString();
        }
        return (String) main3[0];
    }
}
