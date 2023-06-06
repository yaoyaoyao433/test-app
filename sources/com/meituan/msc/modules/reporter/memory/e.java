package com.meituan.msc.modules.reporter.memory;

import com.meituan.msc.modules.engine.MSCHornRollbackConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e implements a {
    public static ChangeQuickRedirect a;
    public final d b;
    public boolean c;
    int d;
    int e;
    int f;
    int g;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bad03013bcf8a3f1d17cfeb4a5a0ebe8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bad03013bcf8a3f1d17cfeb4a5a0ebe8");
            return;
        }
        this.c = false;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.b = d.a();
    }

    @Override // com.meituan.msc.modules.reporter.memory.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6fcf8d3d84c5d0859cb0202435d6de6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6fcf8d3d84c5d0859cb0202435d6de6");
            return;
        }
        if (i > this.d) {
            this.d = i;
        }
        if (this.e < 0 || i < this.e) {
            this.e = i;
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2c2f6c6b926f7dbdd32f340a519c8c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2c2f6c6b926f7dbdd32f340a519c8c7");
        } else if (!MSCHornRollbackConfig.l() && this.f < 0) {
            this.b.b().a(f.a(this));
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d89c0fab8fbf86535441858eb6317da2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d89c0fab8fbf86535441858eb6317da2");
        } else if (MSCHornRollbackConfig.l()) {
        } else {
            this.b.b().a(h.a(this));
        }
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aa62c3151a87f3e11f77899fd6ab71e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aa62c3151a87f3e11f77899fd6ab71e");
        } else if (!MSCHornRollbackConfig.l() && this.c) {
            this.b.a(this);
            this.c = false;
        }
    }
}
