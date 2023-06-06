package com.sankuai.waimai.store.goods.detail.components.subroot.mach;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public final String b;
    public com.sankuai.waimai.mach.recycler.c c;
    public e d;
    private final String e;
    private final String f;
    private final String g;
    private final BaseModuleDesc h;
    private final com.sankuai.waimai.mach.recycler.b i;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void b();
    }

    public d(String str, String str2, String str3, String str4, BaseModuleDesc baseModuleDesc, com.sankuai.waimai.mach.recycler.b bVar) {
        Object[] objArr = {str, str2, str3, str4, baseModuleDesc, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8046df46358497a19ea5e969a10c91e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8046df46358497a19ea5e969a10c91e");
            return;
        }
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = baseModuleDesc;
        this.b = str4;
        this.i = bVar;
    }

    public final void a(com.sankuai.waimai.store.expose.v2.a aVar, String str, a aVar2) {
        Object[] objArr = {aVar, str, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a9ee132021b370588eaee17280ad203", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a9ee132021b370588eaee17280ad203");
        } else if (aVar == null || this.h == null) {
        } else {
            this.d = new e(aVar, this.e, this.f, this.g, this.h.jsonData, this.i);
            this.d.a((com.sankuai.waimai.store.mach.clickhandler.b) new com.sankuai.waimai.store.mach.clickhandler.a());
            this.d.a((com.sankuai.waimai.mach.container.d) new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.mach.d.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
                public final void e() {
                    Mach l;
                    ViewGroup container;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fcb7bac3929e53ca21106cf539a8cbda", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fcb7bac3929e53ca21106cf539a8cbda");
                        return;
                    }
                    com.dianping.judas.util.a.a("MachLogicList", "onMachRenderSuccess");
                    if (d.this.a() == null || (l = d.this.a().l()) == null || (container = l.getContainer()) == null) {
                        return;
                    }
                    container.post(new Runnable() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.mach.d.1.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d17306c506a6672182505e2b31e6236a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d17306c506a6672182505e2b31e6236a");
                                return;
                            }
                            com.dianping.judas.util.a.a("MachLogicList", "viewGroup.post");
                            d.this.d.e();
                        }
                    });
                }
            });
            this.d.a(this.h, this.f, g.a((Context) aVar.bB_()), aVar2);
        }
    }

    public final void a(ViewGroup viewGroup, d dVar) {
        Object[] objArr = {viewGroup, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4944c2fb57f77251868083a84b7fba1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4944c2fb57f77251868083a84b7fba1");
            return;
        }
        com.dianping.judas.util.a.a("MachLogicList", "==== bindView ");
        if (viewGroup == null) {
            return;
        }
        viewGroup.removeAllViews();
        com.sankuai.waimai.mach.recycler.c a2 = dVar.a();
        if (this.d == null || a2 == null) {
            return;
        }
        com.sankuai.waimai.mach.recycler.b b = this.d.b();
        b.a(a2);
        b.a(viewGroup, a2, b.a(a2.a()));
        this.c = a2;
    }

    public final void a(com.sankuai.waimai.store.mach.event.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0519d0ce4cdb8cde7253894c5e695fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0519d0ce4cdb8cde7253894c5e695fa");
        } else if (this.d == null) {
        } else {
            this.d.h = bVar;
        }
    }

    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ebd2d4ba3f330b23350044fcd06cb72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ebd2d4ba3f330b23350044fcd06cb72");
        } else if (this.d == null) {
        } else {
            this.d.b(str, map);
        }
    }

    public final com.sankuai.waimai.mach.recycler.c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9645955e392a5d14339dca49d308ba6f", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.recycler.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9645955e392a5d14339dca49d308ba6f");
        }
        if (this.d == null) {
            return null;
        }
        return this.d.i;
    }
}
