package com.sankuai.waimai.platform.widget.filterbar.clean.usecase;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f implements e {
    public static ChangeQuickRedirect a;
    private a b;
    private Executor c;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e633e685cba3ac065db57d7a5b71ea2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e633e685cba3ac065db57d7a5b71ea2");
            return;
        }
        this.b = b.a();
        this.c = com.sankuai.android.jarvis.c.b();
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.e
    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8ae78c533ebab2a10e0675ae8e4c7f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8ae78c533ebab2a10e0675ae8e4c7f3");
            return;
        }
        try {
            com.sankuai.waimai.launcher.util.aop.b.a(this.c, runnable);
        } catch (Exception unused) {
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.e
    public final <V extends c.b> void a(final V v, final c.InterfaceC1084c<V> interfaceC1084c) {
        Object[] objArr = {v, interfaceC1084c};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fde42fdb8f91927e228683802ed3a2cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fde42fdb8f91927e228683802ed3a2cb");
        } else {
            this.b.a(new Runnable() { // from class: com.sankuai.waimai.platform.widget.filterbar.clean.usecase.f.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6df17b916091c6d37b9614f94ed058cc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6df17b916091c6d37b9614f94ed058cc");
                    } else if (interfaceC1084c != null) {
                        interfaceC1084c.a((c.InterfaceC1084c) v);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.e
    public final <V extends c.b> void a(final Error error, final c.InterfaceC1084c<V> interfaceC1084c) {
        Object[] objArr = {error, interfaceC1084c};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4498148e454489a09889068136c143b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4498148e454489a09889068136c143b3");
        } else {
            this.b.a(new Runnable() { // from class: com.sankuai.waimai.platform.widget.filterbar.clean.usecase.f.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e53dc77352e4c11dc8a90603106ab84", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e53dc77352e4c11dc8a90603106ab84");
                    } else if (interfaceC1084c != null) {
                        interfaceC1084c.a(error);
                    }
                }
            });
        }
    }
}
