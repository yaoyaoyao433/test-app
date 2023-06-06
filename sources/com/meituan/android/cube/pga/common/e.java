package com.meituan.android.cube.pga.common;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e implements k {
    public static ChangeQuickRedirect a;
    private k b;

    public e(@Nullable k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c31ff854dfc83c5c00925408798c5274", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c31ff854dfc83c5c00925408798c5274");
        } else {
            this.b = kVar;
        }
    }

    @Override // rx.k
    public final void unsubscribe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94f1dad1d53678684d90e7b1e15e92b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94f1dad1d53678684d90e7b1e15e92b5");
        } else if (this.b.isUnsubscribed()) {
        } else {
            this.b.unsubscribe();
        }
    }

    @Override // rx.k
    public final boolean isUnsubscribed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f0d51457114e187f941945f1df310f1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f0d51457114e187f941945f1df310f1")).booleanValue() : this.b.isUnsubscribed();
    }

    public final void a(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d31394dfd9c23c67f877d306f6a39ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d31394dfd9c23c67f877d306f6a39ce");
        } else {
            fVar.a(this);
        }
    }
}
