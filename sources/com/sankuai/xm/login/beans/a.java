package com.sankuai.xm.login.beans;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a {
    public static ChangeQuickRedirect a;
    public com.sankuai.xm.login.manager.lvs.a b;
    public int c;
    public int d;

    public a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81fba83a6325b66123ae6b7ba3eb016b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81fba83a6325b66123ae6b7ba3eb016b");
            return;
        }
        this.c = 0;
        this.c = i;
    }
}
