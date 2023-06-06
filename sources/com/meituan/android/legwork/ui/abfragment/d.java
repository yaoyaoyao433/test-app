package com.meituan.android.legwork.ui.abfragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final LegworkMainBFragment b;
    private final int c;

    private d(LegworkMainBFragment legworkMainBFragment, int i) {
        this.b = legworkMainBFragment;
        this.c = i;
    }

    public static View.OnClickListener a(LegworkMainBFragment legworkMainBFragment, int i) {
        Object[] objArr = {legworkMainBFragment, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c5a9fe7f0aef2f37eeecbbb40cc802c", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c5a9fe7f0aef2f37eeecbbb40cc802c") : new d(legworkMainBFragment, i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76aff77acfce51aeecccf59b978a4aa9", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76aff77acfce51aeecccf59b978a4aa9");
        } else {
            LegworkMainBFragment.a(this.b, this.c, view);
        }
    }
}
