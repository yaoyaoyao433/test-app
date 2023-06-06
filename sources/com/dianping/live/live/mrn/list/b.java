package com.dianping.live.live.mrn.list;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b extends RecyclerView.s {
    public static ChangeQuickRedirect a;
    a b;

    public b(View view) {
        super(view);
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "789f4ecc5237ce858caacaa52fe9bc91", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "789f4ecc5237ce858caacaa52fe9bc91");
        }
    }

    public b(a aVar) {
        super(aVar.c);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7eff6e0f91ea13059b04fc8fa870439a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7eff6e0f91ea13059b04fc8fa870439a");
        } else {
            this.b = aVar;
        }
    }
}
