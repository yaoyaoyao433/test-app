package com.sankuai.waimai.bussiness.order.transfer.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h<OriginalData, RequestData, Context> {
    public static ChangeQuickRedirect a;
    public b<OriginalData, Context> b;
    public b<OriginalData, RequestData> c;
    public d<OriginalData, RequestData, Context> d;
    public c e;
    private boolean f;

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46137d259a72cfd6960db1fd48ed7832", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46137d259a72cfd6960db1fd48ed7832");
        } else {
            this.f = true;
        }
    }

    public static <OriginalData, RequestData, Context> h<OriginalData, RequestData, Context> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c47f0808d6ecd566e192e155555334c4", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c47f0808d6ecd566e192e155555334c4") : new h<>();
    }

    public final void a(OriginalData originaldata) {
        Object[] objArr = {originaldata};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c42d73a842ad4bbd50d6d7947461a6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c42d73a842ad4bbd50d6d7947461a6f");
            return;
        }
        if (this.f) {
            com.sankuai.waimai.mach.manager.load.c.a("waimai", "waimai-order");
        }
        RequestData a2 = this.c != null ? this.c.a(originaldata) : null;
        Context a3 = this.b != null ? this.b.a(originaldata) : null;
        if (this.d != null) {
            this.d.a(originaldata, a2, a3, this.e);
        }
    }
}
