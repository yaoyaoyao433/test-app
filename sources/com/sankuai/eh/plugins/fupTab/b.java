package com.sankuai.eh.plugins.fupTab;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final EHTabBlock b;
    private final BlockItemView c;

    private b(EHTabBlock eHTabBlock, BlockItemView blockItemView) {
        this.b = eHTabBlock;
        this.c = blockItemView;
    }

    public static View.OnClickListener a(EHTabBlock eHTabBlock, BlockItemView blockItemView) {
        Object[] objArr = {eHTabBlock, blockItemView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3c1bdd2c84e1d1734bc406ff58013583", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3c1bdd2c84e1d1734bc406ff58013583") : new b(eHTabBlock, blockItemView);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2706fe82d92a85187cf49a028a20802b", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2706fe82d92a85187cf49a028a20802b");
        } else {
            EHTabBlock.a(this.b, this.c, view);
        }
    }
}
