package com.meituan.android.cube.core;

import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class BlockLifecycle {
    public static ChangeQuickRedirect a;
    @NonNull
    f b;
    int c;
    boolean d;

    /* compiled from: ProGuard */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface State {
    }

    public BlockLifecycle(@NonNull f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7e3d830c75eb3a3322c2caea5bb1c9d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7e3d830c75eb3a3322c2caea5bb1c9d");
            return;
        }
        this.c = 0;
        this.d = false;
        this.b = fVar;
    }

    public final void a(@State int i, @State int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6271824efa4b4329afb9a7cc4cc1d83e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6271824efa4b4329afb9a7cc4cc1d83e");
        } else {
            a(i2);
        }
    }

    private void a(@State int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8b87e18f5043ef165bea3be193141f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8b87e18f5043ef165bea3be193141f9");
            return;
        }
        for (f fVar : this.b.n()) {
            fVar.a(this.b.bC_(), i);
        }
    }
}
