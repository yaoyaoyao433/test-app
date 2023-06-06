package com.meituan.android.yoda.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final InfoErrorFragment b;
    private final com.meituan.android.yoda.interfaces.e c;

    private f(InfoErrorFragment infoErrorFragment, com.meituan.android.yoda.interfaces.e eVar) {
        this.b = infoErrorFragment;
        this.c = eVar;
    }

    public static View.OnClickListener a(InfoErrorFragment infoErrorFragment, com.meituan.android.yoda.interfaces.e eVar) {
        Object[] objArr = {infoErrorFragment, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "46def4f83cdee3053470651c1926f1ef", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "46def4f83cdee3053470651c1926f1ef") : new f(infoErrorFragment, eVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da5025dac83b51f054f42ee37aced865", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da5025dac83b51f054f42ee37aced865");
        } else {
            InfoErrorFragment.a(this.b, this.c, view);
        }
    }
}
