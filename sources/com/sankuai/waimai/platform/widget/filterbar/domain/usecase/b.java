package com.sankuai.waimai.platform.widget.filterbar.domain.usecase;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c;
import com.sankuai.waimai.platform.widget.filterbar.domain.repository.b;
import com.sankuai.waimai.platform.widget.filterbar.implement.model.CategoryBean;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c<c.a, a> {
    public static ChangeQuickRedirect d;
    com.sankuai.waimai.platform.widget.filterbar.domain.repository.b e;

    public b(com.sankuai.waimai.platform.widget.filterbar.domain.repository.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bd57b01c1119864c349517797215187", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bd57b01c1119864c349517797215187");
        } else {
            this.e = bVar;
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c
    public final void a(c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a494bf57aa402897c76a0d712d2a8f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a494bf57aa402897c76a0d712d2a8f6");
        } else if (this.e == null) {
            this.c.a(new Error("repository is null!"));
        } else if (this.e.x() != null) {
            this.c.a((c.InterfaceC1084c<P>) new a(this.e.x(), this.e.y()));
        } else {
            this.e.c(new b.a<CategoryBean>() { // from class: com.sankuai.waimai.platform.widget.filterbar.domain.usecase.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b.a
                public final /* synthetic */ void a(CategoryBean categoryBean) {
                    CategoryBean categoryBean2 = categoryBean;
                    Object[] objArr2 = {categoryBean2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f44342d07e3f9e2f1744afbd36d5839f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f44342d07e3f9e2f1744afbd36d5839f");
                        return;
                    }
                    b.this.e.a(categoryBean2);
                    b.this.c.a((c.InterfaceC1084c<P>) new a(categoryBean2, b.this.e.y()));
                }

                @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b.a
                public final void a(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c0bf58362a2ec5f5b79ca5ea4c9dc325", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c0bf58362a2ec5f5b79ca5ea4c9dc325");
                    } else {
                        b.this.c.a(new Error(exc));
                    }
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends c.b {
        public static ChangeQuickRedirect a;
        public CategoryBean b;
        public com.sankuai.waimai.platform.widget.filterbar.domain.model.f c;

        public a(CategoryBean categoryBean, com.sankuai.waimai.platform.widget.filterbar.domain.model.f fVar) {
            Object[] objArr = {categoryBean, fVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15b6e936fb6ae028f5229bc128c0eace", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15b6e936fb6ae028f5229bc128c0eace");
                return;
            }
            this.b = categoryBean;
            this.c = fVar;
        }
    }
}
