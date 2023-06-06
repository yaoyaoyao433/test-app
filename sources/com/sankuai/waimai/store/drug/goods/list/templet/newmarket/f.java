package com.sankuai.waimai.store.drug.goods.list.templet.newmarket;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class f implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final b b;

    private f(b bVar) {
        this.b = bVar;
    }

    public static View.OnClickListener a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7dbcc114f865c4261a269cbbb950ba74", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7dbcc114f865c4261a269cbbb950ba74") : new f(bVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39d31d2c89c43643ca74a91122a4856f", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39d31d2c89c43643ca74a91122a4856f");
        } else {
            b.a(this.b, view);
        }
    }
}
