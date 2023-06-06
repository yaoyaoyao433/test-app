package com.dianping.nvnetwork.tnold.zip.old;

import com.dianping.nvnetwork.tnold.zip.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a implements com.dianping.nvnetwork.tnold.zip.a {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2580d7fda6f39b62c83f7fb908ad882", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2580d7fda6f39b62c83f7fb908ad882");
            return;
        }
        this.b = 0;
        this.c = 0;
    }

    @Override // com.dianping.nvnetwork.tnold.zip.a
    public final byte[] a(int i, boolean z, byte[] bArr) throws Exception {
        this.b = bArr.length;
        this.c = bArr.length;
        return bArr;
    }

    @Override // com.dianping.nvnetwork.tnold.zip.a
    public final g a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa39b9dae7979092e23e9d3fbdab376e", 6917529027641081856L)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa39b9dae7979092e23e9d3fbdab376e");
        }
        g gVar = new g(this.b, this.c);
        this.b = 0;
        this.c = 0;
        return gVar;
    }
}
