package com.meituan.android.ptcommonim;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements rx.functions.b {
    public static ChangeQuickRedirect a;
    private static final b b = new b();

    public static rx.functions.b a() {
        return b;
    }

    @Override // rx.functions.b
    public final void call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05c5458bddd7bee7fcb2e52e2b4baa51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05c5458bddd7bee7fcb2e52e2b4baa51");
        } else {
            a.a(obj);
        }
    }
}
