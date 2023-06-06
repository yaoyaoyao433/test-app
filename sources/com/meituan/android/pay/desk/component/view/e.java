package com.meituan.android.pay.desk.component.view;

import com.meituan.android.pay.desk.payment.view.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements j.a {
    public static ChangeQuickRedirect a;
    private final c b;
    private final com.meituan.android.pay.common.payment.data.c c;
    private final com.meituan.android.pay.common.payment.data.a d;

    public e(c cVar, com.meituan.android.pay.common.payment.data.c cVar2, com.meituan.android.pay.common.payment.data.a aVar) {
        this.b = cVar;
        this.c = cVar2;
        this.d = aVar;
    }

    @Override // com.meituan.android.pay.desk.payment.view.j.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df6e7eaf10a6b2cfae8e2f1f43f279ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df6e7eaf10a6b2cfae8e2f1f43f279ba");
            return;
        }
        c cVar = this.b;
        com.meituan.android.pay.common.payment.data.c cVar2 = this.c;
        com.meituan.android.pay.common.payment.data.a aVar = this.d;
        Object[] objArr2 = {cVar, cVar2, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4cd3d374302ac226b1244f43f26c4234", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4cd3d374302ac226b1244f43f26c4234");
        } else {
            cVar.a(cVar2, aVar);
        }
    }
}
