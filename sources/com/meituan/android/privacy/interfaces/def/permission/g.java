package com.meituan.android.privacy.interfaces.def.permission;

import android.os.Build;
import android.support.annotation.NonNull;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g extends a {
    public static ChangeQuickRedirect a;

    public g(@NonNull PermissionGuard permissionGuard, @NonNull String str, @NonNull String str2) {
        super(permissionGuard, str, str2);
        Object[] objArr = {permissionGuard, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5a43467809aba47911cf8ad0c896b92", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5a43467809aba47911cf8ad0c896b92");
        }
    }

    @Override // com.meituan.android.privacy.interfaces.def.permission.a
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f7e6d120aa50029a74a9fb0fc8eb38d", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f7e6d120aa50029a74a9fb0fc8eb38d") : new String[]{"android.permission.ACTIVITY_RECOGNITION"};
    }

    @Override // com.meituan.android.privacy.interfaces.def.permission.a
    public final boolean a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47f3c3dbb35a8ee362035ce2c706fcd4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47f3c3dbb35a8ee362035ce2c706fcd4")).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 19) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return true;
        }
        return this.c.getSys().a(z, "android.permission.ACTIVITY_RECOGNITION");
    }

    @Override // com.meituan.android.privacy.interfaces.def.permission.a
    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f66b23f555a00a8b59ccc1a680f37313", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f66b23f555a00a8b59ccc1a680f37313")).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT >= 29) {
            return this.c.getSys().a("android.permission.ACTIVITY_RECOGNITION");
        }
        return false;
    }
}
