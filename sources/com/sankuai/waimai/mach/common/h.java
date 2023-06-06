package com.sankuai.waimai.mach.common;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.raw.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h {
    public f a;
    public DevSettings b;
    public com.sankuai.waimai.mach.e c;
    public a.InterfaceC0637a d;
    public c e;

    private h(a aVar) {
        this.a = aVar.b;
        this.b = aVar.e;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.f;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public f b;
        public com.sankuai.waimai.mach.e c;
        public a.InterfaceC0637a d;
        public DevSettings e;
        public c f;

        public final h a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30f93d4912ab4aca4cbfa3e6a8369b4c", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30f93d4912ab4aca4cbfa3e6a8369b4c") : new h(this);
        }
    }
}
