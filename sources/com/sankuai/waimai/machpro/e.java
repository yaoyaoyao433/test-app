package com.sankuai.waimai.machpro;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.machpro.adapter.a b;
    public com.sankuai.waimai.machpro.adapter.c c;
    public com.sankuai.waimai.machpro.adapter.e d;
    public com.sankuai.waimai.machpro.adapter.d e;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public com.sankuai.waimai.machpro.adapter.a b;
        public com.sankuai.waimai.machpro.adapter.c c;
        public com.sankuai.waimai.machpro.adapter.e d;
        public com.sankuai.waimai.machpro.adapter.d e;
    }

    private e(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "228a86f4f14263cee7d466f772e03aae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "228a86f4f14263cee7d466f772e03aae");
            return;
        }
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
    }
}
