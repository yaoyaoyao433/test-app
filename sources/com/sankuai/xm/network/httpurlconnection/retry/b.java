package com.sankuai.xm.network.httpurlconnection.retry;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b implements d {
    public static ChangeQuickRedirect a;
    private long[] b;
    private int c;

    public b(long[] jArr) {
        Object[] objArr = {jArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2063dd4f52c718dab3276739103e75ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2063dd4f52c718dab3276739103e75ef");
        } else {
            this.b = jArr;
        }
    }

    @Override // com.sankuai.xm.network.httpurlconnection.retry.d
    public final int a() {
        return this.b.length;
    }

    @Override // com.sankuai.xm.network.httpurlconnection.retry.d
    public final long c() {
        return this.b[this.c];
    }

    @Override // com.sankuai.xm.network.httpurlconnection.retry.d
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4db745f9b067f3d9acf4ceb8bf11e254", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4db745f9b067f3d9acf4ceb8bf11e254");
            return;
        }
        if (i < 0) {
            i = this.c;
        }
        this.c = i;
    }

    @Override // com.sankuai.xm.network.httpurlconnection.retry.d
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8e5e8769d8b9a1d0b26f5f333a36392", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8e5e8769d8b9a1d0b26f5f333a36392")).booleanValue();
        }
        this.c++;
        return this.c < this.b.length;
    }
}
