package com.sankuai.waimai.imbase.init.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public short b;
    public com.sankuai.waimai.imbase.listener.b c;

    public b(short s, com.sankuai.waimai.imbase.listener.b bVar) {
        Object[] objArr = {Short.valueOf(s), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e78633884ae56926af6c54f0faf42a10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e78633884ae56926af6c54f0faf42a10");
            return;
        }
        this.b = s;
        this.c = bVar;
    }
}
