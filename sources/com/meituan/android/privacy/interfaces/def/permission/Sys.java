package com.meituan.android.privacy.interfaces.def.permission;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Keep;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class Sys extends e {
    public static ChangeQuickRedirect c;
    public static final boolean d;
    private volatile FakeActivity e;

    static {
        d = Build.VERSION.SDK_INT < 26 && Build.VERSION.SDK_INT >= 23;
    }

    @Keep
    public Sys(@NonNull Context context, @NonNull PermissionGuard permissionGuard) {
        super(context, permissionGuard);
        Object[] objArr = {context, permissionGuard};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "605e549e15f5e01f26cdc34ca5dba5d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "605e549e15f5e01f26cdc34ca5dba5d9");
        }
    }

    public final boolean a(boolean z, @NonNull String... strArr) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), strArr};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "714450c45d143f19a600ce66deab259e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "714450c45d143f19a600ce66deab259e")).booleanValue();
        }
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException("permissions cannot be empty");
        }
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if (d && z) {
            for (String str : strArr) {
                if (!PermissionGuard.a.a.hasSysPermissions.contains(str)) {
                    if (!c.a(this.b).c.b(str, false)) {
                        return false;
                    }
                    PermissionGuard.a.a.hasSysPermissions.add(str);
                }
            }
            return true;
        }
        for (String str2 : strArr) {
            if (!PermissionGuard.a.a.hasSysPermissions.contains(str2)) {
                if (ActivityCompat.checkSelfPermission(this.b, str2) != 0) {
                    return false;
                }
                PermissionGuard.a.a.hasSysPermissions.add(str2);
            }
        }
        return true;
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c64df9c933ceeb2dc05a97eb06e619d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c64df9c933ceeb2dc05a97eb06e619d")).booleanValue();
        }
        if (this.e == null) {
            return false;
        }
        try {
            return ActivityCompat.shouldShowRequestPermissionRationale(this.e, str);
        } catch (Throwable th) {
            th.printStackTrace();
            this.e = null;
            return false;
        }
    }

    @MainThread
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdb02aee06f9b5668bc99d1e5e001c82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdb02aee06f9b5668bc99d1e5e001c82");
        } else if (this.e == null) {
            Context context = this.b;
            if (context == null) {
                context = new FakeActivity(this.a.getContext(null));
            }
            if (context == null) {
                return;
            }
            this.e = new FakeActivity(context);
        }
    }
}
