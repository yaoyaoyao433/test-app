package com.sankuai.waimai.foundation.location.v2;

import android.app.Activity;
import android.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class k {
    public static ChangeQuickRedirect a;
    public String b;
    private WeakReference<Activity> c;
    private WeakReference<Fragment> d;
    private WeakReference<android.support.v4.app.Fragment> e;
    private WeakReference<FragmentActivity> f;

    public k(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b73494633fbe7e517248f897ec397798", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b73494633fbe7e517248f897ec397798");
            return;
        }
        this.c = new WeakReference<>(activity);
        this.b = str;
    }

    public k(FragmentActivity fragmentActivity, String str) {
        Object[] objArr = {fragmentActivity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69830ce9c7b778201609ab288bea7b5f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69830ce9c7b778201609ab288bea7b5f");
            return;
        }
        this.f = new WeakReference<>(fragmentActivity);
        this.b = str;
    }

    public k(android.support.v4.app.Fragment fragment, String str) {
        Object[] objArr = {fragment, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb051108f7d961d8a6fda785aafe88b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb051108f7d961d8a6fda785aafe88b0");
            return;
        }
        this.e = new WeakReference<>(fragment);
        this.b = str;
    }

    public final Activity a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "734738cd7ab90d12a3eadaba06b5ab6d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "734738cd7ab90d12a3eadaba06b5ab6d");
        }
        if (this.c != null) {
            return this.c.get();
        }
        return null;
    }

    public final Fragment b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef3d8af4fe8486ba91de977986ba99f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Fragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef3d8af4fe8486ba91de977986ba99f9");
        }
        if (this.d != null) {
            return this.d.get();
        }
        return null;
    }

    public final android.support.v4.app.Fragment c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cdaa00033580ec92f7ddc55229db3a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (android.support.v4.app.Fragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cdaa00033580ec92f7ddc55229db3a7");
        }
        if (this.e != null) {
            return this.e.get();
        }
        return null;
    }

    public final FragmentActivity d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a69563ce9100bfafdd8b8ea2e5a6636", RobustBitConfig.DEFAULT_VALUE)) {
            return (FragmentActivity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a69563ce9100bfafdd8b8ea2e5a6636");
        }
        if (this.f != null) {
            return this.f.get();
        }
        return null;
    }
}
