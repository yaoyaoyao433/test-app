package com.meituan.android.privacy.interfaces.def.permission;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.def.permission.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f<T extends e> {
    public static ChangeQuickRedirect a;
    private volatile T b;
    @NonNull
    private final Class<? extends T> c;

    public f(@NonNull Class<? extends T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41f9c25a59426a1dce352d8c29a67468", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41f9c25a59426a1dce352d8c29a67468");
        } else {
            this.c = cls;
        }
    }

    public final T a(@NonNull Context context, @NonNull PermissionGuard permissionGuard) {
        Object[] objArr = {context, permissionGuard};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7b2175274557e5020debf9f9bf33267", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7b2175274557e5020debf9f9bf33267");
        }
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = this.c.getConstructor(Context.class, PermissionGuard.class).newInstance(context, permissionGuard);
                }
            }
        }
        return this.b;
    }
}
