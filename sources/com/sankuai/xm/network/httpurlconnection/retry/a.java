package com.sankuai.xm.network.httpurlconnection.retry;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a implements d {
    public static ChangeQuickRedirect a;
    private int b;
    private long[] c;

    @Override // com.sankuai.xm.network.httpurlconnection.retry.d
    public final int a() {
        return 3;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64fe8479c587cb9b8de97e6ad83b9655", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64fe8479c587cb9b8de97e6ad83b9655");
            return;
        }
        this.b = 0;
        this.c = new long[]{500, 1000, 1500};
    }

    @Override // com.sankuai.xm.network.httpurlconnection.retry.d
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dea751bb7997e63cfb2f5bff7a5f4833", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dea751bb7997e63cfb2f5bff7a5f4833")).booleanValue();
        }
        this.b++;
        return this.b < this.c.length;
    }

    @Override // com.sankuai.xm.network.httpurlconnection.retry.d
    public final long c() {
        return this.c[this.b];
    }

    @Override // com.sankuai.xm.network.httpurlconnection.retry.d
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b3416c94797c1b80fa49e1a093f9560", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b3416c94797c1b80fa49e1a093f9560");
            return;
        }
        if (i < 0) {
            i = this.b;
        }
        this.b = i;
    }
}
