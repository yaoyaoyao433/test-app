package com.sankuai.waimai.store.search.data;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public boolean b;
    public boolean c;
    public boolean d;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b9e43b023308a567951fcacc960c25e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b9e43b023308a567951fcacc960c25e");
            return;
        }
        this.b = false;
        this.c = false;
        this.d = false;
    }

    public final boolean a() {
        return this.b && this.c && this.d;
    }
}
