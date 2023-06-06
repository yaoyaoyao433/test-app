package com.sankuai.meituan.retrofit2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class v implements u {
    public static ChangeQuickRedirect a;
    private int b;
    private String c;
    private z d;

    public v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b86ff9c9f8509d6ac17ebabe70c4e5c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b86ff9c9f8509d6ac17ebabe70c4e5c");
            return;
        }
        this.b = -1;
        this.c = null;
        this.d = null;
    }

    public final synchronized void a(String str) {
        this.c = str;
    }

    @Override // com.sankuai.meituan.retrofit2.u
    public final synchronized void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "555baf8baceee75a6dabb2c63f525d77", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "555baf8baceee75a6dabb2c63f525d77");
            return;
        }
        if (this.b < 0) {
            this.b = 0;
        }
        if (i >= 0) {
            this.b += i;
        } else {
            b();
        }
    }

    @Override // com.sankuai.meituan.retrofit2.u
    public final synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7056628ca3c64c3301af1708c9a0eb10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7056628ca3c64c3301af1708c9a0eb10");
        } else {
            b();
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dd4bb3c7e694697072b03367345c534", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dd4bb3c7e694697072b03367345c534");
            return;
        }
        if (this.c != null && this.b >= 0) {
            if (this.d == null) {
                this.d = new z();
            }
            z zVar = this.d;
            zVar.a("bytesRead: " + this.b);
            z zVar2 = this.d;
            zVar2.a(", url: " + this.c);
            aa.b(this.d.toString());
            this.d.a(0);
        }
        this.b = -1;
    }
}
