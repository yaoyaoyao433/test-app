package com.dianping.nvnetwork.tnold.zip.old;

import com.dianping.nvnetwork.tnold.zip.e;
import com.dianping.nvnetwork.tnold.zip.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c implements e {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90c4d5db45a1babd5448ef0f92a37f9e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90c4d5db45a1babd5448ef0f92a37f9e");
            return;
        }
        this.b = 0;
        this.c = 0;
    }

    @Override // com.dianping.nvnetwork.tnold.zip.e
    public final String a(int i, boolean z, byte[] bArr) throws Exception {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4711683b1de068e99ddbd455388fc6ab", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4711683b1de068e99ddbd455388fc6ab");
        }
        if (bArr.length == 0) {
            return "";
        }
        this.b = bArr.length;
        this.c = bArr.length;
        return new String(bArr);
    }

    @Override // com.dianping.nvnetwork.tnold.zip.e
    public final g a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "300301700ee58fbdecbc16c281267bd8", 6917529027641081856L)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "300301700ee58fbdecbc16c281267bd8");
        }
        g gVar = new g(this.b, this.c);
        this.b = 0;
        this.c = 0;
        return gVar;
    }
}
