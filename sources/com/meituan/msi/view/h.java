package com.meituan.msi.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h implements e {
    public static ChangeQuickRedirect a;
    private final List<WeakReference<e>> b;

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b43e4aa3b956d4261adb9d3f8fd9eb8f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b43e4aa3b956d4261adb9d3f8fd9eb8f");
        } else {
            this.b = new ArrayList();
        }
    }

    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f822799f4b675cc62bd213708de4ea2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f822799f4b675cc62bd213708de4ea2");
            return;
        }
        synchronized (this.b) {
            this.b.add(new WeakReference<>(eVar));
        }
    }

    public final void b(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "632f0a68e42a4073cf0f6c04d86ded6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "632f0a68e42a4073cf0f6c04d86ded6b");
            return;
        }
        synchronized (this.b) {
            Iterator<WeakReference<e>> it = this.b.iterator();
            while (it.hasNext()) {
                WeakReference<e> next = it.next();
                if (next.get() == null || next.get() == eVar) {
                    it.remove();
                }
            }
        }
    }

    @Override // com.meituan.msi.view.e
    public final boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de58dac86a0a25eaffcb416cc126aed7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de58dac86a0a25eaffcb416cc126aed7")).booleanValue();
        }
        synchronized (this.b) {
            Iterator<WeakReference<e>> it = this.b.iterator();
            while (it.hasNext()) {
                e eVar = it.next().get();
                if (eVar == null) {
                    it.remove();
                } else if (eVar.c(str)) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.meituan.msi.view.e
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66bd1ed964ba96c9173c0dfa86512fb2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66bd1ed964ba96c9173c0dfa86512fb2")).booleanValue();
        }
        synchronized (this.b) {
            Iterator<WeakReference<e>> it = this.b.iterator();
            while (it.hasNext()) {
                e eVar = it.next().get();
                if (eVar == null) {
                    it.remove();
                } else if (eVar.b()) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.meituan.msi.view.e
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "caebe4cc6a8022f630626f3eeae18a93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "caebe4cc6a8022f630626f3eeae18a93");
            return;
        }
        synchronized (this.b) {
            Iterator<WeakReference<e>> it = this.b.iterator();
            while (it.hasNext()) {
                e eVar = it.next().get();
                if (eVar == null) {
                    it.remove();
                } else {
                    eVar.b(i);
                }
            }
        }
    }

    @Override // com.meituan.msi.view.e
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a47aa6d0941c129ea052725bf0715e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a47aa6d0941c129ea052725bf0715e7");
            return;
        }
        synchronized (this.b) {
            Iterator<WeakReference<e>> it = this.b.iterator();
            while (it.hasNext()) {
                e eVar = it.next().get();
                if (eVar == null) {
                    it.remove();
                } else {
                    eVar.c();
                }
            }
        }
    }
}
