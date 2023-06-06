package com.sankuai.waimai.store.drug.goods.list.templet.newmarket;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final b b;

    private c(b bVar) {
        this.b = bVar;
    }

    public static View.OnClickListener a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a0a24fe9596396647841b086a0c6763", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a0a24fe9596396647841b086a0c6763") : new c(bVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f9aa73ef56110720127bf0c8e0246fd", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f9aa73ef56110720127bf0c8e0246fd");
        } else {
            b.c(this.b, view);
        }
    }
}
