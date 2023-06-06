package com.meituan.passport.service;

import android.support.annotation.RestrictTo;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.meituan.passport.handler.a;
import com.meituan.passport.pojo.request.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public abstract class ag<T extends com.meituan.passport.pojo.request.b, R> implements w<T, R> {
    public static ChangeQuickRedirect d;
    private WeakReference<Fragment> a;
    private WeakReference<FragmentActivity> b;
    public T e;
    public com.meituan.passport.converter.m<R> f;
    public com.meituan.passport.converter.b g;
    protected com.meituan.passport.converter.m h;

    public abstract void a();

    @Override // com.meituan.passport.service.w
    public final void a(FragmentActivity fragmentActivity) {
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d7daeaff1d387b9dd400f70db7f2244", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d7daeaff1d387b9dd400f70db7f2244");
        } else {
            this.b = new WeakReference<>(fragmentActivity);
        }
    }

    @Override // com.meituan.passport.service.w
    public final void a(Fragment fragment) {
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52295d2de508ab22a9924949813a800d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52295d2de508ab22a9924949813a800d");
        } else {
            this.a = new WeakReference<>(fragment);
        }
    }

    @Override // com.meituan.passport.service.w
    public void a(T t) {
        this.e = t;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c4e8ae95838bbd1d85b3e20821d8695", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c4e8ae95838bbd1d85b3e20821d8695");
        } else {
            b();
        }
    }

    @Override // com.meituan.passport.service.w
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56ff8f3ccad7bf5191866c3c0501a71a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56ff8f3ccad7bf5191866c3c0501a71a");
        } else if (this.e.a()) {
            this.e.d();
            a();
        }
    }

    @Override // com.meituan.passport.service.w
    public final void a(com.meituan.passport.converter.m<R> mVar) {
        this.f = mVar;
    }

    @Override // com.meituan.passport.service.w
    public final void a(com.meituan.passport.converter.b bVar) {
        this.g = bVar;
    }

    @Override // com.meituan.passport.service.w
    public final void b(com.meituan.passport.converter.m mVar) {
        this.h = mVar;
    }

    public final FragmentActivity c() {
        FragmentActivity activity;
        Fragment fragment;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "152612ddd4b133e455db3f64c769e38a", RobustBitConfig.DEFAULT_VALUE)) {
            return (FragmentActivity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "152612ddd4b133e455db3f64c769e38a");
        }
        if (this.b != null) {
            activity = this.b.get();
        } else {
            activity = (this.a == null || (fragment = this.a.get()) == null || !fragment.isAdded()) ? null : fragment.getActivity();
        }
        if (activity == null || activity.isFinishing()) {
            return null;
        }
        return activity;
    }

    public final Fragment d() {
        Fragment fragment;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8acbffe4d3c3818efcf05f905e1aaf3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Fragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8acbffe4d3c3818efcf05f905e1aaf3");
        }
        if (this.a == null || (fragment = this.a.get()) == null || !fragment.isAdded()) {
            return null;
        }
        return fragment;
    }

    public final com.meituan.passport.handler.exception.c b(FragmentActivity fragmentActivity) {
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a35b4cf709fbecc9ee9afa618e4e8646", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.handler.exception.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a35b4cf709fbecc9ee9afa618e4e8646") : (com.meituan.passport.handler.exception.c) a.C0506a.a().a(new com.meituan.passport.handler.exception.e(fragmentActivity, this.g)).a(new com.meituan.passport.handler.exception.f(fragmentActivity, this.g)).b;
    }

    public final com.meituan.passport.handler.exception.c a(FragmentActivity fragmentActivity, int i, String str) {
        Object[] objArr = {fragmentActivity, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3b407171cbd427ad2928ecb38870a2a", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.handler.exception.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3b407171cbd427ad2928ecb38870a2a") : (com.meituan.passport.handler.exception.c) a.C0506a.a().a(new com.meituan.passport.handler.exception.e(fragmentActivity, this.g, i, str)).a(new com.meituan.passport.handler.exception.f(fragmentActivity, this.g)).b;
    }

    public final com.meituan.passport.handler.exception.c a(FragmentActivity fragmentActivity, int i) {
        Object[] objArr = {fragmentActivity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b74ea2aa76478201c45d298cc0322622", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.handler.exception.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b74ea2aa76478201c45d298cc0322622") : (com.meituan.passport.handler.exception.c) a.C0506a.a().a(new com.meituan.passport.handler.exception.e(fragmentActivity, this.g, i)).a(new com.meituan.passport.handler.exception.f(fragmentActivity, this.g)).b;
    }

    public final com.meituan.passport.handler.exception.c b(Fragment fragment) {
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36a27f924c6031a105a445091751eb7e", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.handler.exception.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36a27f924c6031a105a445091751eb7e") : (com.meituan.passport.handler.exception.c) a.C0506a.a().a(new com.meituan.passport.handler.exception.e(fragment, this.g)).a(new com.meituan.passport.handler.exception.f(fragment, this.g)).b;
    }
}
