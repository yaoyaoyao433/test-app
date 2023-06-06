package com.sankuai.waimai.mach.component.scroller;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.mach.parser.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends a {
    public static ChangeQuickRedirect b;
    String c;
    String d;
    boolean e;
    boolean f;
    int g;
    d h;
    d i;
    d j;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc83441df6d0f1c694add5a181260061", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc83441df6d0f1c694add5a181260061");
            return;
        }
        this.c = "horizontal";
        this.g = 0;
    }
}
