package com.sankuai.waimai.business.restaurant.poicontainer.helper;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements Serializable {
    public static ChangeQuickRedirect a;
    private List<a> b;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19524e600087c5fe0dd077867d70980d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19524e600087c5fe0dd077867d70980d");
        } else {
            this.b = new ArrayList();
        }
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1fb4c16aa7e2af13e01e25c7815d21e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1fb4c16aa7e2af13e01e25c7815d21e");
        } else if (this.b.contains(aVar)) {
        } else {
            this.b.add(aVar);
        }
    }
}
