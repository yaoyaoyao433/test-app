package com.dianping.live.lifecycle;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.Lifecycle.d;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static a b = new a();
    public List<InterfaceC0085a> c;
    public d d;

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.live.lifecycle.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0085a {
        void a();

        void b();
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d25f12450a54aa6e73190b069bc88637", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d25f12450a54aa6e73190b069bc88637");
            return;
        }
        this.c = new ArrayList();
        this.d = new d() { // from class: com.dianping.live.lifecycle.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.Lifecycle.d
            public final void applicationEnterForeground() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d4017538f493db68959f905ba520ada4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d4017538f493db68959f905ba520ada4");
                } else if (a.this.c.size() > 0) {
                    for (int i = 0; i < a.this.c.size(); i++) {
                        InterfaceC0085a interfaceC0085a = (InterfaceC0085a) a.this.c.get(i);
                        if (interfaceC0085a != null) {
                            interfaceC0085a.a();
                        }
                    }
                }
            }

            @Override // com.sankuai.meituan.Lifecycle.d
            public final void applicationEnterBackground() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6dbb382c02f968e10bed32dd52a7c742", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6dbb382c02f968e10bed32dd52a7c742");
                } else if (a.this.c.size() > 0) {
                    for (int i = 0; i < a.this.c.size(); i++) {
                        InterfaceC0085a interfaceC0085a = (InterfaceC0085a) a.this.c.get(i);
                        if (interfaceC0085a != null) {
                            interfaceC0085a.b();
                        }
                    }
                }
            }
        };
    }
}
