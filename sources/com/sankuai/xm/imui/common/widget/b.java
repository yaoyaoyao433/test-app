package com.sankuai.xm.imui.common.widget;

import android.content.Context;
import android.support.annotation.CallSuper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.trace.j;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class b<H> {
    public static ChangeQuickRedirect d;
    public WidgetPanel e;
    public Context f;
    public View g;
    public H h;

    public abstract View a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public void b(boolean z) {
    }

    @CallSuper
    public void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "687e9c96a5187b4bc2fdcad2fcf34828", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "687e9c96a5187b4bc2fdcad2fcf34828");
        } else {
            this.f = context;
        }
    }

    @CallSuper
    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30e44b358d59c692a05b7b29c17967e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30e44b358d59c692a05b7b29c17967e0");
        } else {
            this.f = null;
        }
    }

    public final void a(final boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8091137ebd655cd3b8b2f3d957bdd520", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8091137ebd655cd3b8b2f3d957bdd520");
        } else if (this.g == null) {
        } else {
            this.g.post(j.a(new Runnable() { // from class: com.sankuai.xm.imui.common.widget.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "65365ac908f213d6950b0a5fcd0fcde5", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "65365ac908f213d6950b0a5fcd0fcde5");
                    } else if (b.this.f == null || b.this.g == null) {
                    } else {
                        int i = z ? 0 : 4;
                        int visibility = b.this.g.getVisibility();
                        if (visibility != i) {
                            b.this.g.setVisibility(i);
                        }
                        if ((visibility == 0) != z) {
                            b.this.b(z);
                        }
                    }
                }
            }));
        }
    }
}
