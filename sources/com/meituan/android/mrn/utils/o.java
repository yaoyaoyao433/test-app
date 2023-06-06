package com.meituan.android.mrn.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Closeable;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class o {
    public static ChangeQuickRedirect a;

    public static void a(Closeable closeable) {
        Object[] objArr = {closeable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b2cfd52fe66d0b976ee4ecefd7fa6a72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b2cfd52fe66d0b976ee4ecefd7fa6a72");
        } else if (closeable == null) {
        } else {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
