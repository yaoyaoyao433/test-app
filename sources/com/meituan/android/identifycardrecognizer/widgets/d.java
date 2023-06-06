package com.meituan.android.identifycardrecognizer.widgets;

import android.support.v7.graphics.b;
import com.meituan.android.identifycardrecognizer.widgets.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements b.c {
    public static ChangeQuickRedirect a;
    private final a.AnonymousClass1 b;

    public d(a.AnonymousClass1 anonymousClass1) {
        this.b = anonymousClass1;
    }

    @Override // android.support.v7.graphics.b.c
    public final void a(android.support.v7.graphics.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad07054caafe76c2a4306ab43d268e45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad07054caafe76c2a4306ab43d268e45");
        } else {
            a.AnonymousClass1.a(this.b, bVar);
        }
    }
}
