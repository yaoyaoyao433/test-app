package com.meituan.android.customerservice.kit.floating.base;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a implements b {
    public static ChangeQuickRedirect a;
    protected Context b;
    protected View c;
    private c d;

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6803b44c42c630ca7ac15ba1b7d1c9fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6803b44c42c630ca7ac15ba1b7d1c9fb");
        } else {
            this.b = context;
        }
    }

    @Override // com.meituan.android.customerservice.kit.floating.base.b
    public void a(View view, int i, int i2) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2976f58e991ee761c34e72d2a1e14ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2976f58e991ee761c34e72d2a1e14ba");
            return;
        }
        this.c = view;
        this.c.addOnAttachStateChangeListener(this);
    }

    @Override // com.meituan.android.customerservice.kit.floating.base.b
    public final void a(c cVar) {
        this.d = cVar;
    }

    @Override // com.meituan.android.customerservice.kit.floating.base.b
    public final void a(int i) {
        Object[] objArr = {0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de3af37f18cea4545bd00809200d0056", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de3af37f18cea4545bd00809200d0056");
            return;
        }
        this.c.setVisibility(0);
        if (this.d == null || !ViewCompat.isAttachedToWindow(this.c)) {
            return;
        }
        this.d.a(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36cf44b4986d72f31ffdf913104891db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36cf44b4986d72f31ffdf913104891db");
        } else if (this.d != null) {
            this.d.a(1);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b970b66fdb6e5b253b9d938668a37b8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b970b66fdb6e5b253b9d938668a37b8c");
        } else if (this.d != null) {
            this.d.a(3);
        }
    }
}
