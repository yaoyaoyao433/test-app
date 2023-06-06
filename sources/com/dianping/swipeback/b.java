package com.dianping.swipeback;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a;
    static b i;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public String[] g;
    public String[] h;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4256a82f6e8dac8c2381cef5207a293c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4256a82f6e8dac8c2381cef5207a293c");
            return;
        }
        this.b = true;
        this.c = 100;
        this.d = 300;
        this.e = 80;
        this.f = 800;
        this.b = true;
        this.c = 100;
        this.d = 300;
        this.e = 80;
        this.f = 800;
        this.g = new String[0];
        this.h = new String[0];
    }
}
