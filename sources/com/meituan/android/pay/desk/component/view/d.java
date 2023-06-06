package com.meituan.android.pay.desk.component.view;

import com.meituan.android.pay.desk.payment.view.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements g.a {
    public static ChangeQuickRedirect a;
    private final c b;
    private final com.meituan.android.pay.common.payment.data.c c;
    private final com.meituan.android.pay.common.payment.data.a d;

    public d(c cVar, com.meituan.android.pay.common.payment.data.c cVar2, com.meituan.android.pay.common.payment.data.a aVar) {
        this.b = cVar;
        this.c = cVar2;
        this.d = aVar;
    }

    @Override // com.meituan.android.pay.desk.payment.view.g.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dba4e05831efe47ec57014601d287fa7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dba4e05831efe47ec57014601d287fa7");
            return;
        }
        c cVar = this.b;
        com.meituan.android.pay.common.payment.data.c cVar2 = this.c;
        com.meituan.android.pay.common.payment.data.a aVar = this.d;
        Object[] objArr2 = {cVar, cVar2, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "30c12e2a7750477a947298ec96fb07b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "30c12e2a7750477a947298ec96fb07b7");
        } else {
            cVar.a(cVar2, aVar);
        }
    }
}
