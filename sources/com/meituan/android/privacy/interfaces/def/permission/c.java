package com.meituan.android.privacy.interfaces.def.permission;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class c {
    public static ChangeQuickRedirect a;
    public static c b;
    public final q c;
    private String d;

    private c(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aad6a2bbefd293bfec6915bf9426a65f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aad6a2bbefd293bfec6915bf9426a65f");
            return;
        }
        this.d = "permission_mo_cache";
        this.c = q.a(context, this.d, 2);
    }

    public static c a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d4465f8db3a190ecef99263aacb1c4a", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d4465f8db3a190ecef99263aacb1c4a");
        }
        if (b == null) {
            synchronized (c.class) {
                if (b == null) {
                    b = new c(context);
                }
            }
        }
        return b;
    }
}
