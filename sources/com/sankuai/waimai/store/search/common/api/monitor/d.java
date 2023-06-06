package com.sankuai.waimai.store.search.common.api.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ConcurrentLinkedDeque;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public final ConcurrentLinkedDeque<b> b;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dda6ea9d9831043c62be6245dd8eca33", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dda6ea9d9831043c62be6245dd8eca33");
        } else {
            this.b = new ConcurrentLinkedDeque<>();
        }
    }

    public boolean a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05ca3a7965cd655a28dff2a1354608af", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05ca3a7965cd655a28dff2a1354608af")).booleanValue() : this.b.add(bVar);
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f8613cbfdd3b056f2f16f5fdabd697d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f8613cbfdd3b056f2f16f5fdabd697d");
        } else {
            this.b.clear();
        }
    }
}
