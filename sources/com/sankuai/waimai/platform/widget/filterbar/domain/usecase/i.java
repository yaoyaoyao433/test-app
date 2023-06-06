package com.sankuai.waimai.platform.widget.filterbar.domain.usecase;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class i extends com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c<a, b> {
    public static ChangeQuickRedirect d;
    private com.sankuai.waimai.platform.widget.filterbar.domain.repository.b e;

    @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c
    public final /* synthetic */ void a(a aVar) {
        a aVar2 = aVar;
        Object[] objArr = {aVar2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf6333d62a7ad8a4564af9b08a220988", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf6333d62a7ad8a4564af9b08a220988");
        } else if (this.e == null) {
            this.c.a(new Error("repository is null!"));
        } else if (aVar2 == null) {
            this.c.a(new Error("request value is null!"));
        } else {
            this.e.a(aVar2.b);
            this.c.a((c.InterfaceC1084c<P>) new b(this.e.b(), this.e.j()));
        }
    }

    public i(com.sankuai.waimai.platform.widget.filterbar.domain.repository.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a608d7559badc78b5e3f203e6cec9b9c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a608d7559badc78b5e3f203e6cec9b9c");
        } else {
            this.e = bVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends c.a {
        public static ChangeQuickRedirect a;
        long b;

        public a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41470637044669b27ba0a605b3e5e65e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41470637044669b27ba0a605b3e5e65e");
            } else {
                this.b = j;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b extends c.b {
        public static ChangeQuickRedirect a;
        public Long b;
        public Set<String> c;

        public b(Long l, Set<String> set) {
            Object[] objArr = {l, set};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1e5095d8f2aa9acddce9ed4ac390ae2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1e5095d8f2aa9acddce9ed4ac390ae2");
                return;
            }
            this.b = l;
            this.c = set;
        }
    }
}
