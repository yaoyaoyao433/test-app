package com.sankuai.waimai.business.page.home.list.future.complex;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public int b;
    public final com.sankuai.waimai.business.page.home.list.future.user_prefer_collect.a c;
    private final com.sankuai.waimai.business.page.common.list.ai.c d;

    public e(com.sankuai.waimai.business.page.common.list.ai.c cVar, com.sankuai.waimai.business.page.home.list.future.user_prefer_collect.a aVar) {
        Object[] objArr = {cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fbdcbfa13aa04c5b9a4399964863dc7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fbdcbfa13aa04c5b9a4399964863dc7");
            return;
        }
        this.d = cVar;
        this.c = aVar;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d978af42cae7c6024fad09a5da270f6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d978af42cae7c6024fad09a5da270f6e");
        } else {
            this.b++;
        }
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a54787a2b0435ebd76ac2eba5f807198", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a54787a2b0435ebd76ac2eba5f807198")).intValue();
        }
        if (this.d == null || this.c == null) {
            return 0;
        }
        return this.d.b() - this.c.b();
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10fd4b9e1a4db2b9c3064b453a170322", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10fd4b9e1a4db2b9c3064b453a170322");
            return;
        }
        if (this.d != null) {
            this.d.a();
        }
        if (this.c != null) {
            this.c.c();
        }
    }
}
