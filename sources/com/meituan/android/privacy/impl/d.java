package com.meituan.android.privacy.impl;

import android.app.Application;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.privacy.interfaces.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;
    private static Application c;

    public static void a(@NonNull Application application, z zVar) {
        Object[] objArr = {application, zVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f050a7f44defbf8ea6084a8c81813528", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f050a7f44defbf8ea6084a8c81813528");
        } else if (b) {
        } else {
            if (application == null) {
                throw new RuntimeException("application con't be null");
            }
            c = application;
            com.meituan.android.privacy.impl.permission.b.a(application, zVar);
            e.a();
            b = true;
        }
    }

    @Nullable
    public static Application a() {
        return c;
    }
}
