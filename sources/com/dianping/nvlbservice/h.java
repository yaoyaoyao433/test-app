package com.dianping.nvlbservice;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h {
    public static ChangeQuickRedirect a;
    public SocketAddress b;
    int c;

    public h(String str, int i, int i2) {
        this(new InetSocketAddress(str, i), i2);
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a1bc9cbf6100140e2d050cd40c2f9d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a1bc9cbf6100140e2d050cd40c2f9d6");
        }
    }

    private h(SocketAddress socketAddress, int i) {
        Object[] objArr = {socketAddress, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3b445cb4d14ee13ef8b45b62a86c87c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3b445cb4d14ee13ef8b45b62a86c87c");
            return;
        }
        this.b = socketAddress;
        this.c = i;
    }
}
