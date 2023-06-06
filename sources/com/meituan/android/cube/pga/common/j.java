package com.meituan.android.cube.pga.common;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class j<T> {
    public static ChangeQuickRedirect a;
    private T b;
    private final ReentrantLock c;
    private rx.subjects.a<T> d;

    public j(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "305b86ad817930539cf816a34b6306d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "305b86ad817930539cf816a34b6306d8");
            return;
        }
        this.c = new ReentrantLock();
        this.b = t;
        this.d = rx.subjects.a.c(t);
    }

    public final void a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fda68e655b5bdac3140c093b28df1eff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fda68e655b5bdac3140c093b28df1eff");
            return;
        }
        this.c.lock();
        this.b = t;
        this.c.unlock();
        this.d.onNext(t);
    }

    public final T a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9eb7295a3d62fbc496681e0d937bba64", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9eb7295a3d62fbc496681e0d937bba64");
        }
        this.c.lock();
        T t = this.b;
        this.c.unlock();
        return t;
    }

    public final e a(final com.meituan.android.cube.pga.action.b<T> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6921148aefef2b98113ff7fbd996fbc9", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6921148aefef2b98113ff7fbd996fbc9") : new e(this.d.c((rx.functions.b) new rx.functions.b<T>() { // from class: com.meituan.android.cube.pga.common.j.1
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final void call(T t) {
                Object[] objArr2 = {t};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "09a5eafa37858c131142b44f01396a24", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "09a5eafa37858c131142b44f01396a24");
                } else {
                    bVar.a(t);
                }
            }
        }));
    }
}
