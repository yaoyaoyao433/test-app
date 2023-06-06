package com.sankuai.waimai.business.page.homepage.controller;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.homepage.view.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static c h;
    public com.sankuai.waimai.business.page.homepage.response.b b;
    public b.a c;
    public boolean d;
    public a e;
    public boolean f;
    boolean g;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9dc9512c6c4ee1a63dab1dc46a0d309f", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9dc9512c6c4ee1a63dab1dc46a0d309f");
        }
        if (h == null) {
            h = new c();
        }
        return h;
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "838e1e7431302ac36ddf1b3f5aa409c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "838e1e7431302ac36ddf1b3f5aa409c0");
            return;
        }
        this.d = false;
        this.f = false;
        this.g = false;
    }

    public final void b() {
        this.b = null;
        this.c = null;
        this.f = false;
    }

    public final boolean c() {
        return !this.f;
    }
}
