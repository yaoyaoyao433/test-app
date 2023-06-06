package com.dianping.nvnetwork.tnold.zip.gzip;

import com.dianping.nvnetwork.tnold.zip.h;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edff9452b8f0b3bac36ced44670e00b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edff9452b8f0b3bac36ced44670e00b2");
            return;
        }
        this.b = 0;
        this.c = 0;
    }

    @Override // com.dianping.nvnetwork.tnold.zip.a
    public final byte[] a(int i, boolean z, byte[] bArr) throws Exception {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3299904c4edaa8a6cfd1004d5b98c4f", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3299904c4edaa8a6cfd1004d5b98c4f");
        }
        if (h.b(bArr)) {
            return bArr;
        }
        try {
            byte[] b = g.b(bArr);
            this.b = bArr.length;
            this.c = b.length;
            return b;
        } catch (Exception unused) {
            throw g.e;
        }
    }

    @Override // com.dianping.nvnetwork.tnold.zip.a
    public final com.dianping.nvnetwork.tnold.zip.g a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c08edaa434f01f25e53820fc43105c90", 6917529027641081856L)) {
            return (com.dianping.nvnetwork.tnold.zip.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c08edaa434f01f25e53820fc43105c90");
        }
        com.dianping.nvnetwork.tnold.zip.g gVar = new com.dianping.nvnetwork.tnold.zip.g(this.b, this.c);
        this.b = 0;
        this.c = 0;
        return gVar;
    }
}
