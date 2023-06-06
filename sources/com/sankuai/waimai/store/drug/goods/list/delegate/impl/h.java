package com.sankuai.waimai.store.drug.goods.list.delegate.impl;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class h implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final c b;

    private h(c cVar) {
        this.b = cVar;
    }

    public static View.OnClickListener a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e1436fa46bec448b939f7919f76b87f", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e1436fa46bec448b939f7919f76b87f") : new h(cVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfcc948a04a99513f7007a0a019a2031", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfcc948a04a99513f7007a0a019a2031");
            return;
        }
        c cVar = this.b;
        Object[] objArr2 = {cVar, view};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d307fbb0263b3759bfa7c1a1e421c89a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d307fbb0263b3759bfa7c1a1e421c89a");
        } else {
            cVar.y.onBackPressed();
        }
    }
}
