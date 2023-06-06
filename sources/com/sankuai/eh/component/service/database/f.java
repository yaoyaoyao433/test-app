package com.sankuai.eh.component.service.database;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.utils.thread.a;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements a.InterfaceC0552a {
    public static ChangeQuickRedirect a;
    private final String b;
    private final String c;

    public f(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // com.sankuai.eh.component.service.utils.thread.a.InterfaceC0552a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8c4752bed5c3b54ef9898bf7f34fbbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8c4752bed5c3b54ef9898bf7f34fbbe");
        } else {
            d.e(this.b, this.c);
        }
    }
}
