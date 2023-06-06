package com.meituan.android.common.locate.track;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
@Deprecated
/* loaded from: classes2.dex */
public class a {
    private static volatile a a;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cf14c17f54c62ce76fe796a275ff32d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cf14c17f54c62ce76fe796a275ff32d4");
        }
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a();
                }
            }
        }
        return a;
    }
}
