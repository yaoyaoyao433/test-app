package com.sankuai.waimai.business.search.ui.result.mach;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.business.search.ui.SearchShareData;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h {
    public static ChangeQuickRedirect a;
    Context b;
    ViewGroup c;
    ViewGroup d;
    View e;
    public com.sankuai.waimai.mach.recycler.c f;
    public com.sankuai.waimai.mach.recycler.b g;
    private SearchShareData h;

    public h(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9efdcf809fb3cca6a635fe10e3bc7b0a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9efdcf809fb3cca6a635fe10e3bc7b0a");
            return;
        }
        this.b = context;
        this.h = SearchShareData.a(this.b);
    }
}
