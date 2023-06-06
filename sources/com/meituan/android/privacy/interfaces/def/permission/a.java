package com.meituan.android.privacy.interfaces.def.permission;

import android.support.annotation.NonNull;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a {
    public static ChangeQuickRedirect b;
    @NonNull
    protected final PermissionGuard c;
    @NonNull
    protected final String d;
    @NonNull
    public final String e;
    protected String f;
    protected String g;
    protected boolean h;
    protected String i;

    public abstract boolean a(boolean z);

    public abstract String[] b();

    public abstract boolean g();

    public a(@NonNull PermissionGuard permissionGuard, @NonNull String str, @NonNull String str2) {
        Object[] objArr = {permissionGuard, str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bc51b7f8ea8f490ba2ec886d5e3ac3b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bc51b7f8ea8f490ba2ec886d5e3ac3b");
            return;
        }
        this.h = true;
        this.c = permissionGuard;
        this.d = str;
        this.e = str2;
        this.f = this.d;
        this.g = this.d;
    }

    public final String c() {
        return this.g;
    }

    public final String d() {
        return this.i;
    }

    public String a() {
        return this.i;
    }

    public final boolean e() {
        return this.h;
    }

    public final String f() {
        return this.f;
    }

    public final a a(String str) {
        this.g = str;
        return this;
    }

    public final a b(String str) {
        this.f = str;
        return this;
    }

    public final a c(String str) {
        this.i = str;
        return this;
    }

    public final a b(boolean z) {
        this.h = false;
        return this;
    }

    @NonNull
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "849eadd5570623591837f3549319fbc7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "849eadd5570623591837f3549319fbc7");
        }
        return "AbstractPermission{mName='" + this.d + "'}";
    }
}
