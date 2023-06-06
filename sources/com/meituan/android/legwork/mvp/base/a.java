package com.meituan.android.legwork.mvp.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import rx.k;
import rx.subscriptions.b;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a<V> {
    public static ChangeQuickRedirect a;
    protected Reference<V> b;
    private b c;

    public final void a(V v) {
        Object[] objArr = {v};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bc8b9b224d1ad8a5d8389f8fefc6438", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bc8b9b224d1ad8a5d8389f8fefc6438");
        } else {
            this.b = new WeakReference(v);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ddb73f1f8ba6ed05929176123e6a954", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ddb73f1f8ba6ed05929176123e6a954");
            return;
        }
        if (this.b != null) {
            this.b.clear();
            this.b = null;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8ffffecf44440639463099fa98418a2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8ffffecf44440639463099fa98418a2d");
        } else if (this.c == null || this.c.isUnsubscribed()) {
        } else {
            this.c.a();
        }
    }

    public final V b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc353349fa4287407fb1ca28ee8f9afc", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc353349fa4287407fb1ca28ee8f9afc");
        }
        if (this.b != null) {
            return this.b.get();
        }
        return null;
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80ab1c90b82bbe9b5fb895957f3e99d4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80ab1c90b82bbe9b5fb895957f3e99d4")).booleanValue() : (this.b == null || this.b.get() == null) ? false : true;
    }

    public final void a(k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64d2a3a5c3b4b1b53f8e0238d6a5ad79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64d2a3a5c3b4b1b53f8e0238d6a5ad79");
            return;
        }
        if (this.c == null) {
            this.c = new b();
        }
        this.c.a(kVar);
    }
}
