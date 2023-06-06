package com.sankuai.xm.monitor.cat;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public long g;
    public String h;
    public int i;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e07b2ddd884bba3594f431545c72011", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e07b2ddd884bba3594f431545c72011");
            return;
        }
        this.b = "";
        this.d = 200;
        this.h = "";
        this.i = -1;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a10733bcc94a28740b4a82a851788358", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a10733bcc94a28740b4a82a851788358");
        }
        return "CATInfo{url='" + this.b + "', code=" + this.c + ", httpCode=" + this.d + ", requestSize=" + this.e + ", responseSize=" + this.f + ", responseTime=" + this.g + ", tunnel=" + this.i + ", extraData=" + this.h + '}';
    }
}
