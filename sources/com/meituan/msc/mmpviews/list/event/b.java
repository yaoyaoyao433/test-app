package com.meituan.msc.mmpviews.list.event;

import android.view.View;
import android.view.ViewGroup;
import com.meituan.msc.uimanager.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class b extends h {
    public static ChangeQuickRedirect a;
    public HashMap<String, com.meituan.msc.mmpviews.list.c> b;

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d68d16aa02df3889fd945efbd93df8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d68d16aa02df3889fd945efbd93df8b");
        }
    }

    public b(ViewGroup viewGroup) {
        super(viewGroup);
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e23289e93e53f3081d5531fb30a1d1fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e23289e93e53f3081d5531fb30a1d1fe");
        } else {
            this.b = new HashMap<>();
        }
    }

    public final void a(View view, com.meituan.msc.mmpviews.list.c cVar) {
        Object[] objArr = {view, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f2b2d3d5dcd3715a20a1ec702eaba82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f2b2d3d5dcd3715a20a1ec702eaba82");
        } else {
            this.b.put(String.valueOf(view.getId()), cVar);
        }
    }
}
