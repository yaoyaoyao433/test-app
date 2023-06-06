package com.sankuai.eh.component.service.database;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.utils.thread.a;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements a.InterfaceC0552a {
    public static ChangeQuickRedirect a;
    private final String b;
    private final String c;

    private c(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public static a.InterfaceC0552a a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7322983c3d8e838503e1563d4dd28fd2", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0552a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7322983c3d8e838503e1563d4dd28fd2") : new c(str, str2);
    }

    @Override // com.sankuai.eh.component.service.utils.thread.a.InterfaceC0552a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96d9da83b26ec1a864d0bea96d152f8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96d9da83b26ec1a864d0bea96d152f8c");
        } else {
            b.c(this.b, this.c);
        }
    }
}
