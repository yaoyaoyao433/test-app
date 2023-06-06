package com.meituan.passport.successcallback;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.meituan.passport.converter.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class f<T> implements m<T> {
    public static ChangeQuickRedirect d;
    protected boolean e;
    protected boolean f;
    protected boolean g;
    protected boolean h;
    protected WeakReference<FragmentActivity> i;
    protected WeakReference<Fragment> j;

    public abstract void a(T t, Fragment fragment);

    public abstract void a(T t, FragmentActivity fragmentActivity);

    public f(FragmentActivity fragmentActivity) {
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6c962b792ab700ce92d792b8417f9b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6c962b792ab700ce92d792b8417f9b9");
            return;
        }
        this.e = true;
        this.f = true;
        this.g = true;
        this.h = true;
        this.i = new WeakReference<>(fragmentActivity);
    }

    public f(Fragment fragment) {
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf23f58c58bb7234c9fda93670e4a8ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf23f58c58bb7234c9fda93670e4a8ea");
            return;
        }
        this.e = true;
        this.f = true;
        this.g = true;
        this.h = true;
        this.j = new WeakReference<>(fragment);
    }

    public void a(boolean z) {
        this.e = false;
    }

    public final void b(boolean z) {
        this.f = false;
    }

    public final void c(boolean z) {
        this.g = false;
    }

    public final void d(boolean z) {
        this.h = false;
    }

    @Override // com.meituan.passport.converter.m
    public final void a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70ae3c6c73d1a81a218217406565b6e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70ae3c6c73d1a81a218217406565b6e1");
        } else if (this.i != null) {
            a((f<T>) t, this.i.get());
        } else if (this.j != null) {
            a((f<T>) t, this.j.get());
        }
    }
}
