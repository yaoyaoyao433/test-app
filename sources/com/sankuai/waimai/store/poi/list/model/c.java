package com.sankuai.waimai.store.poi.list.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public int d;
    public String e;

    public c(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35b96ecf98c551874e6ccff3e1e41ef7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35b96ecf98c551874e6ccff3e1e41ef7");
            return;
        }
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public c(CategoryInfo categoryInfo) {
        Object[] objArr = {categoryInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c251792afd48dc6d257bc28279489fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c251792afd48dc6d257bc28279489fd");
            return;
        }
        this.b = categoryInfo.code;
        this.c = categoryInfo.name;
        this.d = categoryInfo.template_code;
        this.e = categoryInfo.extra;
    }

    public final boolean a() {
        return this.d == 1;
    }

    public final boolean b() {
        return this.d == 3;
    }
}
