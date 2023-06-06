package com.sankuai.waimai.pouch.plugin.report;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends b {
    public static ChangeQuickRedirect a;
    public String h;
    public String i;
    public int j;

    public c(b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8929da91a5830e9b8e5ea7117f041c61", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8929da91a5830e9b8e5ea7117f041c61");
        }
    }
}
