package com.meituan.mmp.lib;

import android.arch.lifecycle.d;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class LifecycleFragment extends LazyFragment implements android.arch.lifecycle.f {
    public static ChangeQuickRedirect f = null;
    public static boolean g = false;
    private static boolean h;
    @Nullable
    private final android.arch.lifecycle.g i;

    public LifecycleFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deb2ac63d8d694ec7693d1bd85dcdd3d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deb2ac63d8d694ec7693d1bd85dcdd3d");
        } else if (h) {
            this.i = null;
        } else {
            this.i = new android.arch.lifecycle.g(this);
        }
    }

    static {
        try {
            LifecycleFragment.class.getSuperclass().getMethod("getLifecycle", new Class[0]);
            h = true;
        } catch (NoSuchMethodException unused) {
            com.meituan.mmp.lib.trace.b.c("LifecycleFragment", "Lifecycle not supported by current supportV4 Fragment");
            h = false;
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c744d8d1a62e66d775aa7f0bc4ee6fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c744d8d1a62e66d775aa7f0bc4ee6fb");
            return;
        }
        super.onCreate(bundle);
        a("onCreate");
        if (this.i != null) {
            this.i.a(d.a.ON_CREATE);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c5b3d8443d9e262b43395e14c8b360e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c5b3d8443d9e262b43395e14c8b360e");
            return;
        }
        super.onStart();
        a("onStart");
        if (this.i != null) {
            this.i.a(d.a.ON_START);
        }
    }

    @Override // com.meituan.mmp.lib.LazyFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "225444c092972e243ac8a5f4f87789b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "225444c092972e243ac8a5f4f87789b9");
            return;
        }
        super.onResume();
        a("onResume");
        if (this.i != null) {
            this.i.a(d.a.ON_RESUME);
        }
    }

    @Override // com.meituan.mmp.lib.LazyFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4b6f62ac68d796edf41a2f3e1a01170", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4b6f62ac68d796edf41a2f3e1a01170");
            return;
        }
        if (this.i != null) {
            this.i.a(d.a.ON_PAUSE);
        }
        a("onPause");
        super.onPause();
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f5f0f3c7b1210e60e89cee98deb8b84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f5f0f3c7b1210e60e89cee98deb8b84");
            return;
        }
        a("onStop");
        if (this.i != null) {
            this.i.a(d.a.ON_STOP);
        }
        super.onStop();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ec70b9666d8dc0cb35aaadc91b92ab5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ec70b9666d8dc0cb35aaadc91b92ab5");
            return;
        }
        a("onDestroy");
        if (this.i != null) {
            this.i.a(d.a.ON_DESTROY);
        }
        super.onDestroy();
    }

    @Override // android.arch.lifecycle.f
    @NonNull
    public android.arch.lifecycle.d getLifecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45e974b77deb72cfec524658b43b404c", RobustBitConfig.DEFAULT_VALUE)) {
            return (android.arch.lifecycle.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45e974b77deb72cfec524658b43b404c");
        }
        if (this.i != null) {
            return this.i;
        }
        return super.getLifecycle();
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8a6d43553152bd8ec19f3d85446d73e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8a6d43553152bd8ec19f3d85446d73e");
        } else if (g) {
            com.meituan.mmp.lib.trace.b.a("Lifecycle", str + StringUtil.SPACE + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()));
        }
    }
}
