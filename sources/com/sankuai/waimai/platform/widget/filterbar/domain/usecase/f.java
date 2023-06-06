package com.sankuai.waimai.platform.widget.filterbar.domain.usecase;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.b;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.h;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c<a, b> {
    public static ChangeQuickRedirect d;
    private com.sankuai.waimai.platform.widget.filterbar.domain.repository.b e;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends c.a {
        public static ChangeQuickRedirect a;
        public com.sankuai.waimai.platform.widget.filterbar.domain.model.a b;
        public List<h.a> c;
        public List<h.a> d;
        public com.sankuai.waimai.platform.widget.filterbar.domain.model.b e;
        public List<b.a.C1086a> f;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b extends c.b {
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c
    public final /* synthetic */ void a(a aVar) {
        a aVar2 = aVar;
        Object[] objArr = {aVar2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "636f581d50abb507d4bb43914d35fb8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "636f581d50abb507d4bb43914d35fb8e");
        } else if (this.e == null) {
            this.c.a(new Error("repository is null!"));
        } else if (aVar2 == null) {
            this.c.a(new Error("request value is null!"));
        } else {
            if (aVar2.b != null) {
                if (aVar2.b.a) {
                    this.e.b(3, "bubble_code_first_tab_item", 0);
                } else {
                    this.e.a(3, "bubble_code_first_tab_item");
                }
            }
            List<h.a> list = aVar2.c;
            if (list != null) {
                for (h.a aVar3 : list) {
                    if (aVar3 != null && aVar3.h != null) {
                        this.e.b(2, String.valueOf(aVar3.a), aVar3.h.b);
                    }
                }
            }
            List<h.a> list2 = aVar2.d;
            if (list2 != null) {
                for (h.a aVar4 : list2) {
                    if (aVar4 != null && aVar4.h != null) {
                        this.e.b(5, String.valueOf(aVar4.a), aVar4.h.b);
                    }
                }
            }
            com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar = aVar2.e;
            if (bVar != null && bVar.b != null) {
                for (b.a aVar5 : bVar.b) {
                    if (aVar5 != null && aVar5.c != null) {
                        a(aVar5.c);
                    }
                }
                com.sankuai.waimai.platform.widget.filterbar.domain.model.a C = this.e.C();
                if (C != null) {
                    this.e.b(4, "bubble_code_last_tab_item", C.b);
                }
            }
            a(aVar2.f);
            this.e.f();
            this.c.a((c.InterfaceC1084c<P>) null);
        }
    }

    public f(com.sankuai.waimai.platform.widget.filterbar.domain.repository.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bde63ca5fc0673014f8a2e3389698348", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bde63ca5fc0673014f8a2e3389698348");
        } else {
            this.e = bVar;
        }
    }

    private void a(List<b.a.C1086a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f4d5893cfe6607f708cb49a0a5e04bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f4d5893cfe6607f708cb49a0a5e04bf");
        } else if (list != null) {
            for (b.a.C1086a c1086a : list) {
                if (c1086a != null && !TextUtils.isEmpty(c1086a.a) && c1086a.g != null && c1086a.g.a) {
                    this.e.b(6, c1086a.a, c1086a.g.b);
                }
            }
        }
    }
}
