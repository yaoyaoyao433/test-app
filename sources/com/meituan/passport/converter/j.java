package com.meituan.passport.converter;

import com.meituan.passport.converter.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import rx.d;
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements d.a {
    public static ChangeQuickRedirect a;
    private final i.AnonymousClass1 b;
    private final Object c;

    public j(i.AnonymousClass1 anonymousClass1, Object obj) {
        this.b = anonymousClass1;
        this.c = obj;
    }

    @Override // rx.functions.b
    public final void call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5408274ea4f3364f2c38eb532b22e4a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5408274ea4f3364f2c38eb532b22e4a5");
        } else {
            i.AnonymousClass1.a(this.b, this.c, (rx.j) obj);
        }
    }
}
