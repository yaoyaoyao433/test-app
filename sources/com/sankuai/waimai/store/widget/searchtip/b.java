package com.sankuai.waimai.store.widget.searchtip;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public final a b;

    public b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13cf2285b5e1fe5cabc36bcf62241823", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13cf2285b5e1fe5cabc36bcf62241823");
        } else {
            this.b = aVar;
        }
    }
}
