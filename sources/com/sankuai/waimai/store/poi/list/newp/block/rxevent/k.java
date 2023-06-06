package com.sankuai.waimai.store.poi.list.newp.block.rxevent;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class k {
    public static ChangeQuickRedirect a;
    public int b;
    public boolean c;

    public k(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e44920b0236b40be171128661238344", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e44920b0236b40be171128661238344");
            return;
        }
        this.b = i;
        this.c = false;
    }
}
