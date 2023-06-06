package com.sankuai.eh.component.service.utils.thread;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements Runnable {
    public static ChangeQuickRedirect a;
    private InterfaceC0552a b;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.eh.component.service.utils.thread.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0552a {
        void a();
    }

    public a(InterfaceC0552a interfaceC0552a) {
        Object[] objArr = {interfaceC0552a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fbf7103933204e2b09305c0546ea78f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fbf7103933204e2b09305c0546ea78f");
        } else {
            this.b = interfaceC0552a;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9a75a8cae8a1267950a998911af4a0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9a75a8cae8a1267950a998911af4a0d");
            return;
        }
        try {
            this.b.a();
        } catch (Throwable th) {
            d.a(th);
        }
    }
}
