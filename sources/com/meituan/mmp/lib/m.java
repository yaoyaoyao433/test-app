package com.meituan.mmp.lib;

import com.meituan.mmp.lib.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Runnable {
    public static ChangeQuickRedirect a;
    private final a.AnonymousClass12 b;
    private final List c;

    private m(a.AnonymousClass12 anonymousClass12, List list) {
        this.b = anonymousClass12;
        this.c = list;
    }

    public static Runnable a(a.AnonymousClass12 anonymousClass12, List list) {
        Object[] objArr = {anonymousClass12, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "446ad7bf9e89681739aa3877a41e8d6e", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "446ad7bf9e89681739aa3877a41e8d6e") : new m(anonymousClass12, list);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ccc805e1d6d80a0d299ff4a0b79e3ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ccc805e1d6d80a0d299ff4a0b79e3ba");
        } else {
            a.AnonymousClass12.a(this.b, this.c);
        }
    }
}
