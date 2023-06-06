package com.meituan.android.cube.pga.common;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b<InputType> {
    public static ChangeQuickRedirect a;
    boolean b;
    private rx.subjects.b<InputType> c;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b54f656c77cb75f46b99979ef9a81f7e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b54f656c77cb75f46b99979ef9a81f7e");
            return;
        }
        this.b = true;
        this.c = rx.subjects.b.g();
    }

    public final e a(final com.meituan.android.cube.pga.action.b<InputType> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8877137f7ccda5981955c75b2e5a4c9f", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8877137f7ccda5981955c75b2e5a4c9f") : new e(this.c.c().c((rx.functions.b<InputType>) new rx.functions.b<InputType>() { // from class: com.meituan.android.cube.pga.common.b.1
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final void call(InputType inputtype) {
                Object[] objArr2 = {inputtype};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d3a34f51bc984abb036564b772a3f422", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d3a34f51bc984abb036564b772a3f422");
                } else {
                    bVar.a(inputtype);
                }
            }
        }));
    }

    public final e a(final com.meituan.android.cube.pga.action.c<InputType, Boolean> cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c0e255a2aa506e1a234af46363e1f64", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c0e255a2aa506e1a234af46363e1f64") : new e(this.c.c().c((rx.functions.b<InputType>) new rx.functions.b<InputType>() { // from class: com.meituan.android.cube.pga.common.b.2
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final void call(InputType inputtype) {
                Object[] objArr2 = {inputtype};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75904d3e88016760272472e66ca6686d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75904d3e88016760272472e66ca6686d");
                } else if (b.this.b) {
                    b.this.b = ((Boolean) cVar.a(inputtype)).booleanValue();
                }
            }
        }));
    }

    public final void a(InputType inputtype) {
        Object[] objArr = {inputtype};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05d0c9e65e440c306eb2d8fa39d26404", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05d0c9e65e440c306eb2d8fa39d26404");
        } else {
            this.c.onNext(inputtype);
        }
    }

    public final boolean b(InputType inputtype) {
        Object[] objArr = {inputtype};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "261275ff4e726841ef7895e4224a392b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "261275ff4e726841ef7895e4224a392b")).booleanValue();
        }
        this.b = true;
        this.c.onNext(inputtype);
        return this.b;
    }
}
