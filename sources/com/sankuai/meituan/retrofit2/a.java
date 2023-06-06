package com.sankuai.meituan.retrofit2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements an {
    public static ChangeQuickRedirect a;
    private final aj b;

    public a(aj ajVar) {
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80645aa5cab4271f61b7f25f76b54865", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80645aa5cab4271f61b7f25f76b54865");
        } else {
            this.b = ajVar;
        }
    }

    @Override // com.sankuai.meituan.retrofit2.an
    public final aj a() {
        return this.b;
    }
}
