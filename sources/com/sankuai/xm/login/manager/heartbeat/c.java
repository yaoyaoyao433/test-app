package com.sankuai.xm.login.manager.heartbeat;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.login.manager.f;
import com.sankuai.xm.login.manager.heartbeat.a;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c extends com.sankuai.xm.login.manager.c {
    public static ChangeQuickRedirect a;
    public a b;

    public c(f fVar, a.InterfaceC1410a interfaceC1410a) {
        Object[] objArr = {fVar, interfaceC1410a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee1436d02da3b955ffbba7d0632dfd4f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee1436d02da3b955ffbba7d0632dfd4f");
        } else {
            this.b = new e(fVar, interfaceC1410a);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abc72a7bfd7dbf2599ca9fd2cb3226b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abc72a7bfd7dbf2599ca9fd2cb3226b6");
        } else {
            this.b.c();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12b876bc0303f0680ac2a5cee05d8b7e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12b876bc0303f0680ac2a5cee05d8b7e");
        } else {
            this.b.b();
        }
    }

    @Override // com.sankuai.xm.login.manager.c, com.sankuai.xm.login.manager.g
    public final void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "898bda48a823cc8a599bbb1ce04dae91", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "898bda48a823cc8a599bbb1ce04dae91");
        } else {
            this.b.d(i);
        }
    }

    @Override // com.sankuai.xm.login.manager.c, com.sankuai.xm.login.manager.g
    public final void b(int i, byte[] bArr) {
        Object[] objArr = {Integer.valueOf(i), bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ff91fa8b1b4b2640e2ba6e916cdd250", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ff91fa8b1b4b2640e2ba6e916cdd250");
        } else {
            this.b.b(i, bArr);
        }
    }

    @Override // com.sankuai.xm.login.manager.c, com.sankuai.xm.login.manager.e
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d219955299efe550b031db4d4b7630a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d219955299efe550b031db4d4b7630a");
        } else {
            this.b.a(i);
        }
    }

    @Override // com.sankuai.xm.login.manager.c, com.sankuai.xm.login.manager.g
    public final void a_(com.sankuai.xm.login.beans.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2fadd0a15a5a2adf226232debe44d97", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2fadd0a15a5a2adf226232debe44d97");
        } else {
            this.b.a_(cVar);
        }
    }

    @Override // com.sankuai.xm.login.manager.c, com.sankuai.xm.login.manager.g
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "842b2ef64d7a4ac6339364602643e972", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "842b2ef64d7a4ac6339364602643e972");
        } else {
            this.b.b(z);
        }
    }

    @Override // com.sankuai.xm.login.manager.c, com.sankuai.xm.login.manager.g
    public final void b(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edd9d0bdcb584525b6844ad17e6083a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edd9d0bdcb584525b6844ad17e6083a9");
        } else {
            this.b.b(j, i);
        }
    }
}
