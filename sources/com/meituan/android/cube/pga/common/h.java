package com.meituan.android.cube.pga.common;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class h {
    public static ChangeQuickRedirect a;
    private rx.subjects.b b;

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64a33d041f9f6c7b25e6d4ebe3ce6a47", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64a33d041f9f6c7b25e6d4ebe3ce6a47");
        } else {
            this.b = rx.subjects.b.g();
        }
    }

    public final e a(final com.meituan.android.cube.pga.action.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a36fdcb45ac143469c5b07819c10de8", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a36fdcb45ac143469c5b07819c10de8") : new e(this.b.c().c(new rx.functions.b() { // from class: com.meituan.android.cube.pga.common.h.1
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final void call(Object obj) {
                Object[] objArr2 = {obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5f8d20acedcfef40b3f76f0e8bbb9b5c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5f8d20acedcfef40b3f76f0e8bbb9b5c");
                } else {
                    aVar.a();
                }
            }
        }));
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45c6a56fcee932b6247640eefd137ec5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45c6a56fcee932b6247640eefd137ec5");
        } else {
            this.b.onNext("");
        }
    }
}
