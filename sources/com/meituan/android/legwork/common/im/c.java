package com.meituan.android.legwork.common.im;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import rx.d;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements d.a {
    public static ChangeQuickRedirect a;
    private final a b;
    private final StringBuilder c;

    public c(a aVar, StringBuilder sb) {
        this.b = aVar;
        this.c = sb;
    }

    @Override // rx.functions.b
    public final void call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c666d932505c1a114c3968e3de764e7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c666d932505c1a114c3968e3de764e7b");
            return;
        }
        a aVar = this.b;
        StringBuilder sb = this.c;
        j jVar = (j) obj;
        Object[] objArr2 = {aVar, sb, jVar};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3fb2a5a740e060cdf70cbe2d75fca8ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3fb2a5a740e060cdf70cbe2d75fca8ce");
        } else {
            jVar.onNext(Boolean.valueOf(aVar.b(sb.toString())));
        }
    }
}
