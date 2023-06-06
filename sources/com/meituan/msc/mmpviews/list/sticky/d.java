package com.meituan.msc.mmpviews.list.sticky;

import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    final RecyclerView b;
    RecyclerView.s c;
    int d;

    public d(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d7264a6bab482231cbae51bddf8c377", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d7264a6bab482231cbae51bddf8c377");
            return;
        }
        this.b = recyclerView;
        this.d = -1;
    }
}
