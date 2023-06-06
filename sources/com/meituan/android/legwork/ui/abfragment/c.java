package com.meituan.android.legwork.ui.abfragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final LegworkMainBFragment b;
    private final int c;

    private c(LegworkMainBFragment legworkMainBFragment, int i) {
        this.b = legworkMainBFragment;
        this.c = i;
    }

    public static View.OnClickListener a(LegworkMainBFragment legworkMainBFragment, int i) {
        Object[] objArr = {legworkMainBFragment, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95845df77cd2cb03c487472f3a1ea8ed", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95845df77cd2cb03c487472f3a1ea8ed") : new c(legworkMainBFragment, i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8873a2abc3e3e2464d23c5b1996fd79b", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8873a2abc3e3e2464d23c5b1996fd79b");
        } else {
            LegworkMainBFragment.b(this.b, this.c, view);
        }
    }
}
