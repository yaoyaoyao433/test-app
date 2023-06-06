package com.sankuai.waimai.store.newwidgets.list;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.list.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class e<T extends b> extends g<Object, T> {
    public static ChangeQuickRedirect b;

    public abstract void a(int i);

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(Object obj, int i) {
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30b8329977fc1e39a80622cd1e7cd64d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30b8329977fc1e39a80622cd1e7cd64d");
        }
    }
}
