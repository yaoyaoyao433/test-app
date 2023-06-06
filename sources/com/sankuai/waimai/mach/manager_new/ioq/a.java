package com.sankuai.waimai.mach.manager_new.ioq;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends Exception {
    public static ChangeQuickRedirect a;
    public int b;

    public a(int i, String str) {
        super(str);
        Object[] objArr = {10001, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f01c18b719be901dccc58d2799af1426", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f01c18b719be901dccc58d2799af1426");
        } else {
            this.b = 10001;
        }
    }
}
