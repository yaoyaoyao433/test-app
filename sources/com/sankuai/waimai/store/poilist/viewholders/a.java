package com.sankuai.waimai.store.poilist.viewholders;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a extends com.sankuai.waimai.store.widgets.recycler.e {
    public static ChangeQuickRedirect f;

    public a(View view) {
        super(view);
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84ad21fb05ae82a0e58faffbd43a618a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84ad21fb05ae82a0e58faffbd43a618a");
        }
    }
}
