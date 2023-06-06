package com.sankuai.xm.network.httpurlconnection;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ac;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class c {
    public static ChangeQuickRedirect h;
    public long i;
    public long j;
    protected String k;

    public abstract void a(com.sankuai.xm.network.c cVar);

    public abstract void a(com.sankuai.xm.network.d dVar);

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db8468a86fb2881e5ee80f0ed984b185", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db8468a86fb2881e5ee80f0ed984b185");
            return;
        }
        this.i = 0L;
        this.j = 0L;
        this.k = "";
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "799679e1824e2941e87acaeefe0279ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "799679e1824e2941e87acaeefe0279ba");
        } else {
            this.j = System.currentTimeMillis();
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8202b0f499c282a0b9301d0a127a736d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8202b0f499c282a0b9301d0a127a736d");
        } else if (ac.a(str)) {
        } else {
            this.k = str;
        }
    }
}
