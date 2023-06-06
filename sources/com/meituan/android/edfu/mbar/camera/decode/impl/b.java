package com.meituan.android.edfu.mbar.camera.decode.impl;

import android.content.Context;
import com.meituan.android.edfu.mbar.util.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    public static int b = 2;

    public static com.meituan.android.edfu.mbar.camera.decode.b a(Context context, com.meituan.android.edfu.mbar.camera.decode.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0e12aedf947809149045a1dabfdf703", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.edfu.mbar.camera.decode.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0e12aedf947809149045a1dabfdf703");
        }
        if (!m.t) {
            return new g(context, aVar);
        }
        return new g(context, aVar);
    }
}
