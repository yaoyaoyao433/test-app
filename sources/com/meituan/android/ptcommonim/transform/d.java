package com.meituan.android.ptcommonim.transform;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements rx.functions.b {
    public static ChangeQuickRedirect a;
    private static final d b = new d();

    public static rx.functions.b a() {
        return b;
    }

    @Override // rx.functions.b
    public final void call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c62eaa97a8083064131477a8f669af81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c62eaa97a8083064131477a8f669af81");
        } else {
            a.a((Throwable) obj);
        }
    }
}
