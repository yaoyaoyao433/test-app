package com.sankuai.waimai.touchmatrix.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Stack;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private Stack<String> b;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3802460bcabb8c86e8a581922580afe0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3802460bcabb8c86e8a581922580afe0");
        } else {
            this.b = new Stack<>();
        }
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "907a8738f46b649c20f04450f6fa4ca0", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "907a8738f46b649c20f04450f6fa4ca0") : a.a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        private static final c a = new c();
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ad2da70fea95faa11462b05d30dcb99", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ad2da70fea95faa11462b05d30dcb99");
        }
        if (this.b.isEmpty()) {
            return null;
        }
        return this.b.peek();
    }
}
