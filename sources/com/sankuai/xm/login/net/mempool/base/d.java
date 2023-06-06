package com.sankuai.xm.login.net.mempool.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class d<T> {
    public static ChangeQuickRedirect a;
    private static int f;
    protected int b;
    protected d<T> c;
    protected int d;
    protected T e;

    public abstract byte a(int i);

    public abstract int a(h<T> hVar) throws IOException;

    public abstract void a(int i, byte b);

    public abstract int b(h<T> hVar) throws IOException;

    public abstract void b(int i);

    public abstract void c(int i);

    public abstract T e();

    public abstract int f();

    public d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e956c0a8f7e0dcc53009079729793138", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e956c0a8f7e0dcc53009079729793138");
            return;
        }
        int i2 = f;
        f = i2 + 1;
        this.b = i2;
        this.d = i;
        if (this.d < 4096) {
            this.d = 4096;
        }
        this.e = e();
    }

    public void a() {
        this.c = null;
    }

    public final d<T> b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public final T d() {
        return this.e;
    }

    public final void a(d<T> dVar) {
        this.c = dVar;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2af8d26b58615d56a7e94d07370999f6", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2af8d26b58615d56a7e94d07370999f6");
        }
        return "TiPage { mId = " + this.b + ", mSize = " + this.d + ", mBuffer = " + this.e + " }";
    }
}
