package com.meituan.android.cashier.common;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class s {
    public static ChangeQuickRedirect a;
    private static volatile s c;
    public String b;

    public static s a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a1f440975899e66e0e6c744dd61245ba", RobustBitConfig.DEFAULT_VALUE)) {
            return (s) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a1f440975899e66e0e6c744dd61245ba");
        }
        if (c == null) {
            synchronized (s.class) {
                if (c == null) {
                    c = new s();
                }
            }
        }
        return c;
    }

    public static /* synthetic */ void a(s sVar, boolean z, String str) {
        Object[] objArr = {sVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a26566ad43ed38cb77f047e5cbeeae6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a26566ad43ed38cb77f047e5cbeeae6");
        } else {
            sVar.b = str;
        }
    }
}
