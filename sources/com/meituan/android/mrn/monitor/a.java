package com.meituan.android.mrn.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect a;
    public long b;
    int c;
    int d;
    private long e;
    private int f;
    private int g;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "134645de9f42faea75a17024d53e8ec7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "134645de9f42faea75a17024d53e8ec7");
            return;
        }
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0L;
        this.f = 0;
        this.g = 0;
    }
}
