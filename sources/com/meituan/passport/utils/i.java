package com.meituan.passport.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Closeable;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i {
    public static ChangeQuickRedirect a;

    public static void a(Closeable closeable) {
        Object[] objArr = {closeable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "deb925f4e35a6d9cef064eeef4cbfc2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "deb925f4e35a6d9cef064eeef4cbfc2d");
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
