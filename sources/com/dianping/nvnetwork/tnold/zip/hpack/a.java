package com.dianping.nvnetwork.tnold.zip.hpack;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public b[] b;
    public int c;
    public int d;
    int e;
    private int f;

    public a(int i) {
        Object[] objArr = {4096};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed0d7a95d37bf25f42e0ccab90d9ebd0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed0d7a95d37bf25f42e0ccab90d9ebd0");
            return;
        }
        this.e = -1;
        b(4096);
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7edcdf5a09dfee285fbde892fd9f178c", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7edcdf5a09dfee285fbde892fd9f178c")).intValue();
        }
        if (this.c < this.d) {
            return (this.b.length - this.d) + this.c;
        }
        return this.c - this.d;
    }

    public final b a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a8dcf0ea6bc0942604d9e61273c91c7", 6917529027641081856L)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a8dcf0ea6bc0942604d9e61273c91c7");
        }
        if (i <= 0 || i > a()) {
            throw new IndexOutOfBoundsException();
        }
        int i2 = this.c - i;
        if (i2 < 0) {
            b[] bVarArr = this.b;
            return bVarArr[i2 + bVarArr.length];
        }
        return this.b[i2];
    }

    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d86daa09d386be6b76f177f18881446", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d86daa09d386be6b76f177f18881446");
            return;
        }
        int a2 = bVar.a();
        if (a2 > this.e) {
            b();
            return;
        }
        while (this.f + a2 > this.e) {
            c();
        }
        b[] bVarArr = this.b;
        int i = this.c;
        this.c = i + 1;
        bVarArr[i] = bVar;
        this.f += bVar.a();
        if (this.c == this.b.length) {
            this.c = 0;
        }
    }

    private b c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11948c437b7d5fb98b3a75adacf66bb9", 6917529027641081856L)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11948c437b7d5fb98b3a75adacf66bb9");
        }
        b bVar = this.b[this.d];
        if (bVar == null) {
            return null;
        }
        this.f -= bVar.a();
        b[] bVarArr = this.b;
        int i = this.d;
        this.d = i + 1;
        bVarArr[i] = null;
        if (this.d == this.b.length) {
            this.d = 0;
        }
        return bVar;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8789ece4464d30a7ced83aa895c88d3c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8789ece4464d30a7ced83aa895c88d3c");
            return;
        }
        while (this.d != this.c) {
            b[] bVarArr = this.b;
            int i = this.d;
            this.d = i + 1;
            bVarArr[i] = null;
            if (this.d == this.b.length) {
                this.d = 0;
            }
        }
        this.c = 0;
        this.d = 0;
        this.f = 0;
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fb19fa3cd20f8a45ce66d9645030617", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fb19fa3cd20f8a45ce66d9645030617");
        } else if (i < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + i);
        } else if (this.e != i) {
            this.e = i;
            if (i == 0) {
                b();
            } else {
                while (this.f > i) {
                    c();
                }
            }
            int i2 = i / 32;
            if (i % 32 != 0) {
                i2++;
            }
            if (this.b == null || this.b.length != i2) {
                b[] bVarArr = new b[i2];
                int a2 = a();
                int i3 = this.d;
                for (int i4 = 0; i4 < a2; i4++) {
                    int i5 = i3 + 1;
                    bVarArr[i4] = this.b[i3];
                    i3 = i5 == this.b.length ? 0 : i5;
                }
                this.d = 0;
                this.c = this.d + a2;
                this.b = bVarArr;
            }
        }
    }
}
