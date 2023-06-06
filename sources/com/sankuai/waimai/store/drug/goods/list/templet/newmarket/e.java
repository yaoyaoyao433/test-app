package com.sankuai.waimai.store.drug.goods.list.templet.newmarket;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final b b;

    private e(b bVar) {
        this.b = bVar;
    }

    public static View.OnClickListener a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "092ab7ffa8f82fe9651b1091b0f4b14d", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "092ab7ffa8f82fe9651b1091b0f4b14d") : new e(bVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ff0b4500922d01ba62d63531107bea9", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ff0b4500922d01ba62d63531107bea9");
        } else {
            b.b(this.b, view);
        }
    }
}
