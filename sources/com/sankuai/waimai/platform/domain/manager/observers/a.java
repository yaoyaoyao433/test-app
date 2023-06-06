package com.sankuai.waimai.platform.domain.manager.observers;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static a b;
    private List<WeakReference<InterfaceC1050a>> c;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.domain.manager.observers.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1050a {
        void b(int i);
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "54f7dd90eee30e28e3d19721c1bc726e", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "54f7dd90eee30e28e3d19721c1bc726e");
        }
        if (b == null) {
            synchronized (com.sankuai.waimai.platform.domain.manager.crawler.a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    public final synchronized void a(InterfaceC1050a interfaceC1050a) {
        boolean z = true;
        Object[] objArr = {interfaceC1050a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15def2c7a35e6e7e6053c6a0b8dcb3cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15def2c7a35e6e7e6053c6a0b8dcb3cf");
            return;
        }
        if (interfaceC1050a != null) {
            if (this.c == null) {
                this.c = new LinkedList();
            }
            Iterator<WeakReference<InterfaceC1050a>> it = this.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                WeakReference<InterfaceC1050a> next = it.next();
                if (next == null) {
                    it.remove();
                } else {
                    InterfaceC1050a interfaceC1050a2 = next.get();
                    if (interfaceC1050a2 == null) {
                        it.remove();
                    } else if (interfaceC1050a2 == interfaceC1050a) {
                        break;
                    }
                }
            }
            if (!z) {
                this.c.add(new WeakReference<>(interfaceC1050a));
            }
        }
    }

    public final synchronized void b(InterfaceC1050a interfaceC1050a) {
        Object[] objArr = {interfaceC1050a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a993cccf5c9007c69e823b69473fa69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a993cccf5c9007c69e823b69473fa69");
        } else if (this.c == null) {
        } else {
            Iterator<WeakReference<InterfaceC1050a>> it = this.c.iterator();
            while (it.hasNext()) {
                WeakReference<InterfaceC1050a> next = it.next();
                if (next == null) {
                    it.remove();
                } else {
                    InterfaceC1050a interfaceC1050a2 = next.get();
                    if (interfaceC1050a2 == null || interfaceC1050a2 == interfaceC1050a) {
                        it.remove();
                    }
                }
            }
        }
    }

    public final synchronized void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca742aa311bf31a2930e51e1ba89e671", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca742aa311bf31a2930e51e1ba89e671");
        } else if (this.c == null) {
        } else {
            Iterator<WeakReference<InterfaceC1050a>> it = this.c.iterator();
            while (it.hasNext()) {
                WeakReference<InterfaceC1050a> next = it.next();
                if (next == null) {
                    it.remove();
                } else {
                    InterfaceC1050a interfaceC1050a = next.get();
                    if (interfaceC1050a == null) {
                        it.remove();
                    } else {
                        interfaceC1050a.b(i);
                    }
                }
            }
        }
    }
}
