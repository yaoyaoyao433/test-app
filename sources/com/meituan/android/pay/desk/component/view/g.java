package com.meituan.android.pay.desk.component.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements com.meituan.android.pay.desk.component.fragment.g {
    public static ChangeQuickRedirect a;
    private final c b;

    public g(c cVar) {
        this.b = cVar;
    }

    @Override // com.meituan.android.pay.desk.component.fragment.g
    public final void a(ArrayList arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee705d63728d2c68416296dac61da497", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee705d63728d2c68416296dac61da497");
            return;
        }
        c cVar = this.b;
        Object[] objArr2 = {cVar, arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b92da150438874a75e1d78a0dd89af18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b92da150438874a75e1d78a0dd89af18");
        } else if (cVar.d != null) {
            cVar.d.a(cVar.c, cVar.b);
        }
    }
}
