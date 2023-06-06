package com.meituan.msc.common.process.ipc;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.FutureTask;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h<V> extends FutureTask<V> {
    public static ChangeQuickRedirect a;

    public h() {
        super(new Runnable() { // from class: com.meituan.msc.common.process.ipc.h.1
            @Override // java.lang.Runnable
            public final void run() {
            }
        }, null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a7b26d8425b26d4d6312590ea6876a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a7b26d8425b26d4d6312590ea6876a5");
        }
    }

    @Override // java.util.concurrent.FutureTask
    public final void set(V v) {
        Object[] objArr = {v};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ca9e47298b8d8bd3da2cd8392a7bc1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ca9e47298b8d8bd3da2cd8392a7bc1f");
        } else {
            super.set(v);
        }
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87f3295c028d9f0b30297a872ba63138", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87f3295c028d9f0b30297a872ba63138");
        } else {
            super.setException(th);
        }
    }
}
