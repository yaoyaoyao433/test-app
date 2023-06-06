package com.meituan.android.privacy.interfaces.def.permission;

import android.os.Build;
import android.support.annotation.NonNull;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j extends i {
    public static ChangeQuickRedirect a;
    public int k;

    public j(@NonNull PermissionGuard permissionGuard, @NonNull String str, @NonNull String str2, @NonNull List<String> list) {
        super(permissionGuard, str, str2, list);
        Object[] objArr = {permissionGuard, str, str2, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18e72322d54abbd0f01402d098b00fbe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18e72322d54abbd0f01402d098b00fbe");
        } else {
            this.k = 0;
        }
    }

    @Override // com.meituan.android.privacy.interfaces.def.permission.i, com.meituan.android.privacy.interfaces.def.permission.a
    public final boolean a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77de51ec4c9df20c29d6905639b4e84e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77de51ec4c9df20c29d6905639b4e84e")).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= this.k) {
            return super.a(z);
        }
        return false;
    }

    public final boolean h() {
        return Build.VERSION.SDK_INT > this.k;
    }

    @Override // com.meituan.android.privacy.interfaces.def.permission.i, com.meituan.android.privacy.interfaces.def.permission.a
    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45daea26d7d4b980850fd2d56985a11b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45daea26d7d4b980850fd2d56985a11b")).booleanValue();
        }
        if (Build.VERSION.SDK_INT > this.k) {
            return super.g();
        }
        return false;
    }
}
