package com.sankuai.waimai.imbase.init.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect b;
    public short c;
    public com.sankuai.waimai.imbase.listener.a d;

    public a(short s, com.sankuai.waimai.imbase.listener.a aVar) {
        Object[] objArr = {Short.valueOf(s), aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "386baa2334a17cf8bf60bd7c8d5dd04e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "386baa2334a17cf8bf60bd7c8d5dd04e");
            return;
        }
        this.c = s;
        this.d = aVar;
    }
}
