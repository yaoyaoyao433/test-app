package com.meituan.android.privacy.interfaces.def.permission;

import android.support.annotation.NonNull;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h extends a {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.privacy.interfaces.def.permission.a
    public final boolean a(boolean z) {
        return true;
    }

    @Override // com.meituan.android.privacy.interfaces.def.permission.a
    public final String[] b() {
        return null;
    }

    @Override // com.meituan.android.privacy.interfaces.def.permission.a
    public final boolean g() {
        return false;
    }

    public h(@NonNull PermissionGuard permissionGuard, @NonNull String str, @NonNull String str2) {
        super(permissionGuard, str, str2);
        Object[] objArr = {permissionGuard, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "111325f14f6b60833399422bf96374c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "111325f14f6b60833399422bf96374c6");
        }
    }
}
