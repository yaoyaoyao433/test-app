package com.sankuai.waimai.platform.widget.filterbar.domain.usecase;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h extends com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c<a, b> {
    public static ChangeQuickRedirect d;
    private com.sankuai.waimai.platform.widget.filterbar.domain.repository.b e;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends c.a {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b extends c.b {
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c
    public final /* synthetic */ void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "957006ba7ade92508fbcf10723997405", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "957006ba7ade92508fbcf10723997405");
            return;
        }
        if (this.e != null) {
            this.e.g();
        }
        this.c.a((c.InterfaceC1084c<P>) null);
    }

    public h(com.sankuai.waimai.platform.widget.filterbar.domain.repository.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bd43d4b635a64ce8ffd15abfc2a8935", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bd43d4b635a64ce8ffd15abfc2a8935");
        } else {
            this.e = bVar;
        }
    }
}
