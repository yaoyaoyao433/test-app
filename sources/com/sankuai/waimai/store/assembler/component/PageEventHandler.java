package com.sankuai.waimai.store.assembler.component;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PageEventHandler extends android.arch.lifecycle.o {
    public static ChangeQuickRedirect a;
    private ConcurrentHashMap<Class<?>, android.arch.lifecycle.k> b;
    private Handler c;
    private volatile boolean d;

    public PageEventHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61a7655085176df9e14f0e0dcb2cba45", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61a7655085176df9e14f0e0dcb2cba45");
            return;
        }
        this.b = new ConcurrentHashMap<>();
        this.c = new Handler(Looper.getMainLooper());
        this.d = false;
    }

    public final <T> void a(final T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eca71a1143a0ea290637ed8546ce2a3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eca71a1143a0ea290637ed8546ce2a3d");
        } else if (this.d) {
        } else {
            if (this.b.get(t.getClass()) == null) {
                this.b.put(t.getClass(), new android.arch.lifecycle.k());
            }
            if (b()) {
                this.b.get(t.getClass()).b((android.arch.lifecycle.k) t);
            } else {
                this.c.post(new Runnable() { // from class: com.sankuai.waimai.store.assembler.component.PageEventHandler.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5623100d98678b518b3eb8c276d54257", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5623100d98678b518b3eb8c276d54257");
                        } else {
                            ((android.arch.lifecycle.k) PageEventHandler.this.b.get(t.getClass())).b((android.arch.lifecycle.k) t);
                        }
                    }
                });
            }
        }
    }

    public final <T> void a(android.arch.lifecycle.f fVar, Class<T> cls, android.arch.lifecycle.l<T> lVar) {
        Object[] objArr = {fVar, cls, lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c0adb5501f1f5251a9c552604e668e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c0adb5501f1f5251a9c552604e668e3");
        } else if (this.d) {
        } else {
            if (this.b.get(cls) == null) {
                this.b.put(cls, new android.arch.lifecycle.k());
            }
            this.b.get(cls).a(fVar, lVar);
        }
    }

    private boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "838979d90870feff66ecd866bdca0acb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "838979d90870feff66ecd866bdca0acb")).booleanValue() : Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // android.arch.lifecycle.o
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5272ff5cae1ae917ceed842211f5e78c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5272ff5cae1ae917ceed842211f5e78c");
            return;
        }
        super.a();
        this.d = true;
        this.c.removeCallbacksAndMessages(null);
        this.b.clear();
    }
}
