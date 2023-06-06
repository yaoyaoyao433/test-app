package com.sankuai.waimai.router.common;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.regex.PatternSyntaxException;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends f {
    public static ChangeQuickRedirect a;
    public static final String b = com.sankuai.waimai.router.utils.f.a("wm_router", "page");
    private final com.sankuai.waimai.router.utils.c e;

    @Override // com.sankuai.waimai.router.core.h
    public final String toString() {
        return "PageAnnotationHandler";
    }

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eac3a29c7c168d79f5f83590d73692e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eac3a29c7c168d79f5f83590d73692e3");
            return;
        }
        this.e = new com.sankuai.waimai.router.utils.c("PageAnnotationHandler") { // from class: com.sankuai.waimai.router.common.e.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.router.utils.c
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3117155e7cc73118697c01d83166b926", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3117155e7cc73118697c01d83166b926");
                    return;
                }
                e eVar = e.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = e.a;
                if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "d3881813ae5e119f6a627c75ac6f77b6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "d3881813ae5e119f6a627c75ac6f77b6");
                } else {
                    com.sankuai.waimai.router.components.h.a(eVar, IPageAnnotationInit.class);
                }
            }
        };
        a(c.b);
        this.d = d.b;
    }

    @Override // com.sankuai.waimai.router.core.h
    public final void b(@NonNull com.sankuai.waimai.router.core.j jVar, @NonNull com.sankuai.waimai.router.core.g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f2b7c3249c3726343056ba66bff0404", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f2b7c3249c3726343056ba66bff0404");
            return;
        }
        this.e.b();
        super.b(jVar, gVar);
    }

    @Override // com.sankuai.waimai.router.common.f, com.sankuai.waimai.router.core.h
    public final boolean a(@NonNull com.sankuai.waimai.router.core.j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "815e2ab7ab65f44f9af85eb791d2a30e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "815e2ab7ab65f44f9af85eb791d2a30e")).booleanValue();
        }
        try {
            return b.matches(jVar.c());
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }
}
