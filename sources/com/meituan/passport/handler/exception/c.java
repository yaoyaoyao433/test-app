package com.meituan.passport.handler.exception;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.passport.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class c extends com.meituan.passport.handler.a<c> {
    public static ChangeQuickRedirect e;
    private WeakReference<Fragment> b;
    private WeakReference<FragmentActivity> c;
    protected com.meituan.passport.converter.b f;

    public abstract Throwable a(Throwable th);

    public c(Fragment fragment, com.meituan.passport.converter.b bVar) {
        Object[] objArr = {fragment, bVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "947c617a8d50ae7ba89c97c4cb3236dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "947c617a8d50ae7ba89c97c4cb3236dc");
            return;
        }
        this.b = new WeakReference<>(fragment);
        this.f = bVar;
    }

    public c(FragmentActivity fragmentActivity, com.meituan.passport.converter.b bVar) {
        Object[] objArr = {fragmentActivity, bVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63bfad13ba36655bb1bb081b03b3d640", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63bfad13ba36655bb1bb081b03b3d640");
            return;
        }
        this.c = new WeakReference<>(fragmentActivity);
        this.f = bVar;
    }

    public final com.meituan.passport.converter.b a() {
        return this.f;
    }

    public final Throwable b(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e96696f7674a5f4abd3da0c5f93fc67", RobustBitConfig.DEFAULT_VALUE) ? (Throwable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e96696f7674a5f4abd3da0c5f93fc67") : c(th);
    }

    private Throwable c(Throwable th) {
        c cVar = this;
        do {
            Object[] objArr = {th};
            ChangeQuickRedirect changeQuickRedirect = e;
            if (!PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "46ff54bac30187c825db669c41b45d55", RobustBitConfig.DEFAULT_VALUE)) {
                th = cVar.a(th);
                cVar = (c) cVar.a;
                if (th == null) {
                    break;
                }
            } else {
                return (Throwable) PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "46ff54bac30187c825db669c41b45d55");
            }
        } while (cVar != null);
        return th;
    }

    public final FragmentActivity b() {
        FragmentActivity activity;
        Fragment fragment;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8f5d6b132f63b8a4cfed1c008d737bb", RobustBitConfig.DEFAULT_VALUE)) {
            return (FragmentActivity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8f5d6b132f63b8a4cfed1c008d737bb");
        }
        if (this.c != null) {
            activity = this.c.get();
        } else {
            activity = (this.b == null || (fragment = this.b.get()) == null || !fragment.isAdded()) ? null : fragment.getActivity();
        }
        if (activity == null || activity.isFinishing()) {
            return null;
        }
        return activity;
    }

    public final void a(String str) {
        Fragment fragment;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38840eb6bd5b90a9bf99c5b440c29710", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38840eb6bd5b90a9bf99c5b440c29710");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = e;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ff4303f7da17a198d5ba313eafe23de9", RobustBitConfig.DEFAULT_VALUE)) {
                fragment = (Fragment) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ff4303f7da17a198d5ba313eafe23de9");
            } else if (this.b == null || (fragment = this.b.get()) == null || !fragment.isAdded()) {
                fragment = null;
            }
            if (fragment != null) {
                new com.sankuai.meituan.android.ui.widget.a(fragment.getView(), str, 0).a();
                return;
            }
            FragmentActivity b = b();
            if (b != null) {
                new com.sankuai.meituan.android.ui.widget.a(b, str, 0).a();
            }
        }
    }

    public final void a(Class cls, Throwable th) {
        String name;
        String message;
        Object[] objArr = {cls, th};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e54fcbdac9a53b10d186fb810f6c5b4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e54fcbdac9a53b10d186fb810f6c5b4b");
        } else if (th == null) {
        } else {
            if (th.getCause() != null) {
                name = th.getCause().getClass().getName();
                message = th.getCause().getMessage();
            } else {
                name = th.getClass().getName();
                message = th.getMessage();
            }
            n.a(cls != null ? cls.getSimpleName() : "exceptionClass is null", "className: " + name, "errorMessage: " + message);
        }
    }
}
