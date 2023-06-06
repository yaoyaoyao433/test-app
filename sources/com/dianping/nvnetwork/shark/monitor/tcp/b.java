package com.dianping.nvnetwork.shark.monitor.tcp;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public String b;
    public int c;
    public int d;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2782be75a281a14bfec1fb2fc2ad751", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2782be75a281a14bfec1fb2fc2ad751");
            return;
        }
        this.c = 1000;
        this.d = 80;
    }
}
