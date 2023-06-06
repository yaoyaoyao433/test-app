package com.dianping.nvnetwork.tnold.zip.gzip;

import com.dianping.nvnetwork.tnold.zip.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e implements com.dianping.nvnetwork.tnold.zip.e {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6915d6c7d596d78b899e91235006320b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6915d6c7d596d78b899e91235006320b");
            return;
        }
        this.b = 0;
        this.c = 0;
    }

    @Override // com.dianping.nvnetwork.tnold.zip.e
    public final String a(int i, boolean z, byte[] bArr) throws Exception {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fe539c716bcf6fcf961cb377388d98c", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fe539c716bcf6fcf961cb377388d98c");
        }
        if (h.b(bArr)) {
            return "";
        }
        try {
            this.b = bArr.length;
            byte[] b = g.b(bArr);
            this.c = b.length;
            return new String(b);
        } catch (Exception unused) {
            throw g.d;
        }
    }

    @Override // com.dianping.nvnetwork.tnold.zip.e
    public final com.dianping.nvnetwork.tnold.zip.g a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "121872b2a74959c7ff83bfdd847f4203", 6917529027641081856L)) {
            return (com.dianping.nvnetwork.tnold.zip.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "121872b2a74959c7ff83bfdd847f4203");
        }
        com.dianping.nvnetwork.tnold.zip.g gVar = new com.dianping.nvnetwork.tnold.zip.g(this.b, this.c);
        this.b = 0;
        this.c = 0;
        return gVar;
    }
}
