package com.dianping.networklog;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dianping.com.nvlinker.NVLinker;
/* loaded from: classes.dex */
public final class y implements e {
    public static ChangeQuickRedirect a;
    boolean b;
    i c;
    private c d;
    private e e;
    private boolean f;

    /* loaded from: classes.dex */
    public static class a implements c {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Override // com.dianping.networklog.y.c
        public final e a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "526e0a3b69ff7e9d43e70575b2238a16", 6917529027641081856L)) {
                return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "526e0a3b69ff7e9d43e70575b2238a16");
            }
            if (CLoganProtocol.a()) {
                return CLoganProtocol.b();
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static final y a = new y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface c {
        e a();
    }

    public y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4aacd603a2b17b434e3779e395cb1f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4aacd603a2b17b434e3779e395cb1f5");
        } else {
            this.d = new a();
        }
    }

    @Override // com.dianping.networklog.e
    public final int a(String str, String str2) {
        if (this.e != null) {
            return this.e.a(str, str2);
        }
        return -4;
    }

    @Override // com.dianping.networklog.e
    public final void a(int i, String str, long j, long j2, String str2, long j3, boolean z, String str3) {
        String str4;
        if (NVLinker.getQuakerbird() != null) {
            String str5 = str3 == null ? "" : str3;
            NVLinker.getQuakerbird().writeLog(str, z, j3, str2, j, j2, i, str5.split("&"));
            str4 = str5;
        } else {
            str4 = str3;
        }
        if (this.e != null) {
            this.e.a(i, str, j, j2, str2, j3, z, str4);
        }
    }

    @Override // com.dianping.networklog.e
    public final void a(long j) {
        if (this.e != null) {
            this.e.a(j);
        }
    }

    @Override // com.dianping.networklog.e
    public final void a(i iVar) {
        this.c = iVar;
    }

    @Override // com.dianping.networklog.e
    public final void a(String str) {
        if (this.e != null) {
            this.e.a(str);
        }
    }

    @Override // com.dianping.networklog.e
    public final void a(String str, String str2, int i, String str3, int i2) {
        if (this.f) {
            return;
        }
        e eVar = null;
        if (this.d != null) {
            eVar = this.d.a();
            this.b = eVar instanceof CLoganProtocol;
        }
        if (eVar != null) {
            eVar.a(this.c);
            eVar.a(str, str2, i, str3, i2);
            this.f = true;
        }
        this.e = eVar;
    }

    @Override // com.dianping.networklog.e
    public final void a(boolean z) {
        if (this.e != null) {
            this.e.a(z);
        }
    }

    @Override // com.dianping.networklog.e
    public final String c() {
        return this.e != null ? this.e.c() : "";
    }

    @Override // com.dianping.networklog.e
    public final void d() {
        if (this.e != null) {
            this.e.d();
        }
    }

    @Override // com.dianping.networklog.e
    public final long e() {
        if (this.e != null) {
            return this.e.e();
        }
        return -4L;
    }
}
