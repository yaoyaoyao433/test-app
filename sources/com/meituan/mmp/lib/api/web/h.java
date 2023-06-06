package com.meituan.mmp.lib.api.web;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.mmp.lib.utils.au;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class h extends FrameLayout implements com.meituan.msi.view.e {
    public static ChangeQuickRedirect a;
    protected f b;
    private View c;
    private com.meituan.msi.view.e d;

    public h(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68944b644e16e139e7cf505bb5b1c27a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68944b644e16e139e7cf505bb5b1c27a");
        } else {
            this.d = null;
        }
    }

    public final void a(View view, com.meituan.msi.view.e eVar) {
        Object[] objArr = {view, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec7d9021a7b337b82e6224ed74b954dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec7d9021a7b337b82e6224ed74b954dc");
            return;
        }
        this.c = view;
        addView(this.c, new FrameLayout.LayoutParams(-1, -1));
        this.b = new f(getContext());
        addView(this.b, new FrameLayout.LayoutParams(-1, au.a(4.0f)));
        this.d = eVar;
    }

    public View getWebView() {
        return this.c;
    }

    public f getProgressBar() {
        return this.b;
    }

    @Override // com.meituan.msi.view.e
    public final boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d67e64492ec257ab585050df9d9b553", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d67e64492ec257ab585050df9d9b553")).booleanValue();
        }
        if (this.d != null) {
            return this.d.c(str);
        }
        return false;
    }

    @Override // com.meituan.msi.view.e
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ce923e00fa119ae84161591d5b620a8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ce923e00fa119ae84161591d5b620a8")).booleanValue();
        }
        if (this.d != null) {
            return this.d.b();
        }
        return false;
    }

    @Override // com.meituan.msi.view.e
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a9c6c5b8aa5d9c5638437fb5c7c6dae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a9c6c5b8aa5d9c5638437fb5c7c6dae");
        } else if (this.d != null) {
            this.d.b(i);
        }
    }

    @Override // com.meituan.msi.view.e
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e15888236e61a26d1fa2e764717b54d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e15888236e61a26d1fa2e764717b54d");
        } else if (this.d != null) {
            this.d.c();
        }
    }
}
