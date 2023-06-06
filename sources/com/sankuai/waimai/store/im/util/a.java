package com.sankuai.waimai.store.im.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    public static final String d = "a";
    public int b;
    public long c;
    public volatile boolean e;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "372530ccdd0586652feca0a807fecdc0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "372530ccdd0586652feca0a807fecdc0");
            return;
        }
        this.b = 0;
        this.e = false;
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        aVar.e = false;
        return false;
    }
}
