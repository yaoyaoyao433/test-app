package com.sankuai.xm.base.util.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.net.InetAddress;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a implements Runnable {
    public static ChangeQuickRedirect a;
    private String b;
    private InetAddress[] c;

    public a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ccdc2c82c78f4ff4c7e7201fe9790f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ccdc2c82c78f4ff4c7e7201fe9790f5");
            return;
        }
        this.c = null;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2224e8a7f5a70c1a79ad0ae92bb45cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2224e8a7f5a70c1a79ad0ae92bb45cb");
            return;
        }
        try {
            this.c = InetAddress.getAllByName(this.b);
        } catch (Exception e) {
            com.sankuai.xm.log.c.a("DNSResolver", e);
        }
    }

    public final synchronized InetAddress[] a() {
        return this.c;
    }
}
